package com.stackroute;

        import com.stackroute.domain.Movie;

        import org.springframework.beans.factory.BeanFactory;
        import org.springframework.beans.factory.xml.XmlBeanFactory;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.core.io.ClassPathResource;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context1=new ClassPathXmlApplicationContext( "beans.xml");
        Movie movie = (Movie) context1.getBean("movie1");
        System.out.println("changing the id of beans:"+ movie);

        Movie movie1 = (Movie) context1.getBean("movie1");
        System.out.println("changing the id of beans:"+ movie1);


    }
}

