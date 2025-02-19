import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
           System.out.println(bean.getMessage());
           System.out.println(bean2.getMessage());

           Cat cat = (Cat) applicationContext.getBean("cat");
           Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());
        System.out.println(cat2.getName());

        System.err.println(bean==bean2);
        System.err.println(cat==cat2);

        }
}