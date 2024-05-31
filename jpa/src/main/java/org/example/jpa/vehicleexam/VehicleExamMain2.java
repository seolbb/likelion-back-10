package org.example.jpa.vehicleexam;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.example.jpa.JPAUtil;

import java.util.List;

@Slf4j
public class VehicleExamMain2 {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        // create
//        Car2 car1 = new Car2();
//        car1.setManufacturer("Toyota");
//        car1.setSeatCount(5);
//        em.persist(car1);
//
//        Car2 car2 = new Car2();
//        car2.setManufacturer("Honda");
//        car2.setSeatCount(4);
//        em.persist(car2);
//
//        Truck2 truck1 = new Truck2();
//        truck1.setManufacturer("Volvo");
//        truck1.setPayloadCapacity(15.5);
//        em.persist(truck1);
//
//        Truck2 truck2 = new Truck2();
//        truck2.setManufacturer("Scania");
//        truck2.setPayloadCapacity(20.0);
//        em.persist(truck2);
        // 데이터 조회
        List<Vehicle2> vehicles = em.createQuery("SELECT v FROM Vehicle2 v", Vehicle2.class).getResultList();
        for (Vehicle2 vehicle : vehicles) {
            if (vehicle instanceof Car2) {
                Car2 car = (Car2) vehicle;
                log.info("Car: " + car.getManufacturer() + ", Seats: " + car.getSeatCount());
            } else if (vehicle instanceof Truck2) {
                Truck2 truck = (Truck2) vehicle;
                log.info("Truck: " + truck.getManufacturer() + ", Payload Capacity: " + truck.getPayloadCapacity());
            }
        }

        em.getTransaction().commit();

        em.close();
    }
}
