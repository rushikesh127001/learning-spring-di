package sfg.learning.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfg.learning.sfgdi.controllers.ConstructorInjectedController;
import sfg.learning.sfgdi.controllers.PropertyInjectedController;
import sfg.learning.sfgdi.controllers.myController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		//Spring app returns a context so just saving that in ctx variable
		myController myControl=(myController) ctx.getBean("myController");
		String s=myControl.myFunc();
		System.out.println(s);
		System.out.println("-----Property Injected controller byb springg");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController)
				ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("---------Constructer Injected");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController)
				ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());
	}

}
