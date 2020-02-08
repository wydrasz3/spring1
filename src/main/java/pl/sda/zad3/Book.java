package pl.sda.zad3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

    private String title;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @PostConstruct
    public void initAnnotation() {
        System.out.println("init method annotation.. ");
    }

    @PreDestroy
    public void preDestroyAnnotation() {
        System.out.println("pre destroy method annotation.. ");
    }

    public void init() {
        System.out.println("init method.. ");
    }

    public void destroy() {
        System.out.println("destroy method.. ");
    }
}
