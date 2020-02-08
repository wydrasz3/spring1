package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");

        Message myMessage1 = (Message) context.getBean("myMessage1");
        Message myMessage2 = (Message) context.getBean("myMessage2");
        Message myMessage3 = (Message) context.getBean("myMessage3");

        Message myMessageSingleton = (Message) context.getBean("myMessage2");
        Message myMessagePrototype = (Message) context.getBean("myMessage3");

        System.out.println(myMessage1.getText());
        System.out.println(myMessage2.getText());
        System.out.println(myMessage3.getText());

        System.out.println(myMessage2.equals(myMessageSingleton));
        System.out.println(myMessage3.equals(myMessagePrototype));

    }
}
