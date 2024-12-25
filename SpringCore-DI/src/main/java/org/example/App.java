package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    public static void main( String[] args ) {

        /*
          This is not possible for handling the large amount of classes
          Manually can be done only for small system
          That's why here come Spring framework for handling this
          Spring will do this by IOC [It have three methods - I) setter DI, II) constructor DI, III) field DI]
         */
//        PetrolEngine petrolEngine=new PetrolEngine();
//        Car car = new Car();
//        car.setEngine(petrolEngine);

        /*
        *Below code done by XML configuration (Which is through Spring framework)
        * Done by IOC containers
            1. ApplicationContext
            2. BeanFactory ------> (Deprecated)
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Car carBean1 = context.getBean(Car.class);
        carBean1.drive();

//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        Car carBean = beanFactory.getBean(Car.class);
//        carBean.drive();


    }
}
