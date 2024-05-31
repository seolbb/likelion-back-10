package com.example.day09;

public class Book {
    private String title;
    private Author author;

    public Book(String title) {
        this.title = title;
        this.author = new Author();
    }

    public void setAuthorName(String name) {
        author.setName(name);
    }

    public String getAuthorName() {
        return author.getName();
    }

    public void printBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + getAuthorName());
    }

    // 멤버 내부 클래스 'Author'
    public class Author {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Book book= new Book("모두의 자바");
        book.author.setName("강경미");

        book.printBookDetails();


    }
}