package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PressSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println("RES = "+metier.calcul());



    }
}
