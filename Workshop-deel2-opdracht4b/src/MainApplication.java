

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pojo.*;


@Configuration
@ComponentScan
public class MainApplication 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(KlantConfig.class);
    	Klant k = ctx.getBean(Klant.class); //ipv new Klant();
    	System.out.println(k.toString());
    }
}
