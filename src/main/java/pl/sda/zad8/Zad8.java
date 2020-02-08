package pl.sda.zad8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.zad3.Book;

import java.util.Arrays;

public class Zad8 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans8.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}
