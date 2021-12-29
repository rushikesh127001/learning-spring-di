package sfg.learning.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfg.learning.sfgdi.controllers.myController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		//Spring app returns a context so just saving that in ctx variable
		myController myControl=(myController) ctx.getBean("myController");
		String s=myControl.myFunc();
		System.out.println(s);
	}

}
