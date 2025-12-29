package porsche.di.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
       Car c = (Car)context.getBean("car");
       
       System.out.println("Car has a wheel size of: "+c.getWheelObj().getWheelsize());
    }
}
