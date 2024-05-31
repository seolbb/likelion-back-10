package org.example.jpa.emplexam;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.example.jpa.JPAUtil;
@Slf4j
public class EmployeeExamMain {
    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Project project = em.find(Project.class, 1L);
            log.info("프로젝트 이름 : " + project.getName());

            for(Employee employee : project.getEmployees()){
                log.info("사원 이름 : " + employee.getName());
            }

        }catch (Exception e){
            if(em.getTransaction().isActive()){ // 에러가 발생해 catch구문에 들어왔는데 트랜젝션이 active 하다면 롤백
                em.getTransaction().rollback();
            }
            throw e;
        }finally {
            em.close();
        }
    }

    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Employee employee = new Employee();
            employee.setName("kang");

            Project project = new Project();
            project.setName("lion project");

            employee.getProjects().add(project);
            project.getEmployees().add(employee);

            em.persist(employee);
            em.persist(project);

            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }finally {
            em.close();
        }
    }

    private static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
//            Employee employee = em.find(Employee.class, 3L);
//            employee.setName("carami");

            // 1번 사원이 2번 프로젝트에서 빠지고 싶다면?
            Employee employee = em.find(Employee.class, 1L);
            Project project = em.find(Project.class, 2L);
            employee.getProjects().remove(project);

            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }finally {
            em.close();
        }
    }

    private static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Employee employee = em.find(Employee.class, 3L);
            em.remove(employee);

            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }finally {
            em.close();
        }
    }

    public static void main(String[] args) {
//        find();
//        create();
        update();
//        delete();
    }
}
