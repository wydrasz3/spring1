package pl.sda.zad3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Book {

    private String title;

    @Autowired
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
