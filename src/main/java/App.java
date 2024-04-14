import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld tree = applicationContext.getBean("helloworld",HelloWorld.class);

        System.out.println(bean == tree);

        Cat murka =
                applicationContext.getBean("cat", Cat.class);
        Cat duska =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(murka == duska);

    }
}