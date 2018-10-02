package springbootdemo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx =  (ApplicationContext) SpringApplication.run(Application.class, args);

	}

}
