package com.example.springcoredojo;

import com.example.springcoredojo.Practica.Config;
import com.example.springcoredojo.Practica.Usuario;
import com.example.springcoredojo.Youtube.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);

		ApplicationContext appcontext = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuber= (Youtuber)appcontext.getBean("Youtuber");
		System.out.println(youtuber.getNombre());
		((ConfigurableApplicationContext) appcontext).close();
	}
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			creacionBean();
		};
	}

	private void creacionBean(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Usuario usuarioGeneradoPorBean = context.getBean("usuario",Usuario.class);
		System.out.println("Usuario: "+usuarioGeneradoPorBean);
	}
}

	 */


