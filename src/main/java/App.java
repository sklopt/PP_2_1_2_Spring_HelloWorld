import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("hello-world", HelloWorld.class);
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("hello-world", HelloWorld.class);
        System.out.println(bean == bean2);
        Cat beanCat = (Cat) applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat == beanCat2);
    }
}