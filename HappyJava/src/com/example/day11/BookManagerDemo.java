package com.example.day11;

import java.util.*;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class BookManager {
    private List<Book> books = new ArrayList<>();
    private Set<Book> bookSet = new HashSet<>();

    public void addBook(Book book) {
        if (bookSet.add(book)) {
            books.add(book);
            System.out.println("도서 추가: " + book);
        } else {
            System.out.println("이미 존재하는 도서입니다.");
        }
    }

    public void removeBook(Book book) {
        if (bookSet.remove(book)) {
            books.remove(book);
            System.out.println("도서 삭제: " + book);
        } else {
            System.out.println("도서를 찾을 수 없습니다.");
        }
    }

    public void displayBooks() {
        System.out.println("전체 도서 목록:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void sortBooksByYear() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getYear(), b2.getYear());
            }
        });
        displayBooks();
    }

}

public class BookManagerDemo {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이거이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도
        manager.displayBooks();
        manager.sortBooksByYear();
    }
}

