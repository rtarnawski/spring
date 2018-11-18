import configuration.JavaConfig;
import model.imp.Knight;
import model.imp.SaveQueenQuest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Knight knight = context.getBean("knight", Knight.class);
        Knight knight1 = context.getBean("knight", Knight.class);
        Knight knight2 = context.getBean("knight", Knight.class);
        Knight knight3 = context.getBean("knight", Knight.class);

        System.out.println(knight);
        System.out.println(knight1);
        System.out.println(knight2);
        System.out.println(knight3);
    }
}
