import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld") ;
        System.out.println(bean.getMessage());
        System.out.println("Ссылки для Helloworld равны: " + (bean==bean2));
        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println("Ссылки для Cat равны: " + (cat==cat1));
    }
}