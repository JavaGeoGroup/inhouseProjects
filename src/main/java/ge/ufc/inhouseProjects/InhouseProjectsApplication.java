package ge.ufc.inhouseProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"ge.ufc.inhouseProjects.service","ge.ufc.inhouseProjects.configuration"})
//@ComponentScan({"ge.ufc.inhouseProjects.dao"})
@EntityScan("ge.ufc.inhouseProjects.entity")
@EnableJpaRepositories("ge.ufc.inhouseProjects.dao")
public class InhouseProjectsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(InhouseProjectsApplication.class, args);
		System.out.println(applicationContext.containsBeanDefinition("ServiceTypeController"));
		System.out.println(applicationContext.containsBeanDefinition("ServiceTypeDao"));
	}

}

