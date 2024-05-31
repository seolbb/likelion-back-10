package org.example.jpa.personexam;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.example.jpa.JPAUtil;
@Slf4j
public class PersonExamMain {
    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Passport passport = em.find(Passport.class, 1L);
            log.info("getPassportNumber : " + passport.getPassportNumber());

            Person person = em.find(Person.class, 1L);
            log.info("getPersonName : " + person.getName());

        }catch (Exception e){
            if(em.getTransaction().isActive()){
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
            Person person = new Person("son seolbeen");
            Passport passport = new Passport("s123456789");

            person.setPassport(passport);
            passport.setPerson(person);

            em.persist(person); // person에 cascade를 all 로 주었기 때문에 person 만 persist 해줘도 된다!

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
            // 여권만 삭제하고싶다면?
            Passport passport = em.find(Passport.class, 3L);
            if(passport != null){
                passport.getPerson().setPassport(null);
            }
            em.remove(passport);

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
//        create();
//        find();
        delete();

    }
}
