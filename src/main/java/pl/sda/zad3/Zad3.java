package pl.sda.zad3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans3.xml");

        Book book = (Book)context.getBean("myBook");
        System.out.println(book.getTitle() + ", " + book.getAuthor().getName());
    }
}