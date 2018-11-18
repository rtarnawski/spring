import configuration.JavaConfig;
import model.imp.Knight;
import model.imp.SaveQueenQuest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Knight knight = context.getBean("knight", Knight.class);
        System.out.println(knight);
        knight.setQuest(context.getBean("queen", SaveQueenQuest.class));
        knight.getQuest().empbarkQuest();





/*
        // Object costam = context.getBean("test");
        old.SomeBean test1 = context.getBean("test", old.SomeBean.class);
        old.SomeBean test2 = context.getBean("test", old.SomeBean.class);
        old.SomeBean test3 = context.getBean("test", old.SomeBean.class);
        old.SomeBean test4 = context.getBean("test", old.SomeBean.class);
        old.SomeBean test = context.getBean("test", old.SomeBean.class);

        System.out.println(test1.getTitle());
        System.out.println(test2.getTitle());
        System.out.println(test3.getTitle());
        System.out.println(test4.getTitle());

        test2.setTitle("tesrtedrrf");

        System.out.println(test1.getTitle());
        System.out.println(test2.getTitle());
        System.out.println(test3.getTitle());
        System.out.println(test4.getTitle());*//*
         *//*old.SomeBean2 someBean2v1 = context.getBean("someBean2v1", old.SomeBean2.class);
        old.SomeBean2 someBean2v2 = context.getBean("someBean2v2", old.SomeBean2.class);
        old.SomeBean2 someBean2v3 = context.getBean("someBean2v3", old.SomeBean2.class);
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

        old.SomeBean3 someBean3 = context.getBean("someBean3", old.SomeBean3.class);

        System.out.println(someBean3);

    }*/





    }
}
