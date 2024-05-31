package org.example.jpa.hrexam;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.example.jpa.JPAUtil;

import java.util.List;
@Slf4j
public class hrExamMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        try{
            Region region = em.find(Region.class, 1);
            List<Country> countryList = region.getCountryList();

            for (Country country : countryList){
                log.info("1 region getCountryList : " +  country.getCountryName());
            }

        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }
}
