import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
/*
        // Object costam = context.getBean("test");
        SomeBean test1 = context.getBean("test", SomeBean.class);
        SomeBean test2 = context.getBean("test", SomeBean.class);
        SomeBean test3 = context.getBean("test", SomeBean.class);
        SomeBean test4 = context.getBean("test", SomeBean.class);
        SomeBean test = context.getBean("test", SomeBean.class);

        System.out.println(test1.getTitle());
        System.out.println(test2.getTitle());
        System.out.println(test3.getTitle());
        System.out.println(test4.getTitle());

        test2.setTitle("tesrtedrrf");

        System.out.println(test1.getTitle());
        System.out.println(test2.getTitle());
        System.out.println(test3.getTitle());
        System.out.println(test4.getTitle());*//*
         *//*SomeBean2 someBean2v1 = context.getBean("someBean2v1", SomeBean2.class);
        SomeBean2 someBean2v2 = context.getBean("someBean2v2", SomeBean2.class);
        SomeBean2 someBean2v3 = context.getBean("someBean2v3", SomeBean2.class);
        System.out.println(someBean2v1.getSomeBean());
        System.out.println(someBean2v2.getSomeBean());
        System.out.println(someBean2v3.getSomeBean());
*//*
         *//*   System.out.println("---------");

        System.out.println(someBean2v1.getSomeBean());
        System.out.println(someBean2v2.getSomeBean());
        System.out.println(someBean2v3.getSomeBean());

        LocalDate localDate = LocalDate.now();*//*

        LocalDateTime ldt  = LocalDateTime.now();

        LocalDateTime ldt2 = context.getBean("ldt2", LocalDateTime.class);
        System.out.println(ldt2);

        System.out.println("+++++++++++++++");

        SomeBean3 someBean3 = context.getBean("someBean3", SomeBean3.class);

        System.out.println(someBean3);

    }*/

    }
}
