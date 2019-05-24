package com.stackroute;

        import com.stackroute.domain.Actor;
        import com.stackroute.domain.Movie;
        import org.springframework.beans.factory.BeanFactory;
        import org.springframework.beans.factory.xml.XmlBeanFactory;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

       /* Movie movie = (Movie) factory.getBean("movie");
        System.out.println("movie actor details : " + movie);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie1 = (Movie) applicationContext.getBean("movie");
        System.out.println("movie actor details1 : " + movie1);

        Movie movie2 = (Movie) applicationContext.getBean("movie1");
        System.out.println("movie actor details1 : " + movie2);
        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie mv=(Movie)((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie");
        System.out.println("movie actor details"+movie);*/

        //testing bean scope
        ApplicationContext context1=new ClassPathXmlApplicationContext( "beans.xml");
        Movie movie3=(Movie) context1.getBean("movie1");
        Movie movie4=(Movie) context1.getBean("movie1");

        System.out.println(movie3==movie4);

        Movie movie = (Movie) context1.getBean("movieA");
        System.out.println("changing the id of beans:"+ movie);


    }
}

