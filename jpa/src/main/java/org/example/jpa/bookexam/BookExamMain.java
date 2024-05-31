package org.example.jpa.bookexam;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.example.jpa.JPAUtil;

@Slf4j
public class BookExamMain {
    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();

            Book book1 = em.find(Book.class, 2L);
            log.info("book1 Title : {}", book1.getTitle());

            Author author = em.find(Author.class, 1L);
            for(Book book : author.getBooks()){
                log.info("book.getTitle() : {}",book.getTitle());
            }
        }finally {
            em.close();
        }
    }

    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();

            Author author1 = new Author("김작가");
            Book book1 = new Book("첫번째 책",author1);
            Book book2 = new Book("두번째 책",author1);
            author1.getBooks().add(book1);
            author1.getBooks().add(book2);

            em.persist(author1);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    private static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();

            Book book = em.find(Book.class, 5L);
            book.setTitle("첫밴째 책임슨");

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    private static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();

            Book book = em.find(Book.class, 5L);
            em.remove(book);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public static void main(String[] args) {
//        find();
//        create();
//        update();
        delete();
    }
}
