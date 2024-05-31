package org.example.jpa.addressexam;

import jakarta.persistence.EntityManager;
import org.example.jpa.JPAUtil;

import java.util.List;

public class CompanyExamMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
//            Address address1 = new Address("123 Main St", "Springfield", "IL", "62701", "USA");
//            Company company1 = new Company("Company A", address1);
//            em.persist(company1);
//
//            Address address2 = new Address("456 Elm St", "Metropolis", "NY", "10001", "USA");
//            Company company2 = new Company("Company B", address2);
//            em.persist(company2);

            // 데이터 조회
            List<Company> companies = em.createQuery("SELECT c FROM Company c", Company.class).getResultList();
            for (Company company : companies) {
                System.out.println("Company: " + company.getName() +
                        ", Address: " + company.getAddress().getStreet() +
                        ", " + company.getAddress().getCity() +
                        ", " + company.getAddress().getState() +
                        ", " + company.getAddress().getZipCode() +
                        ", " + company.getAddress().getCountry());
            }

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
