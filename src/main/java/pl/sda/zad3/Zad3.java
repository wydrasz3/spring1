package pl.sda.zad3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Zad3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my-beans3.xml");

        Book book = (Book)context.getBean("myBook");
        System.out.println(book.getTitle() + ", " + book.getAuthor().getName());

        String myText = (String)context.getBean("myText");
        System.out.println(myText);

        context.close();
    }
}
