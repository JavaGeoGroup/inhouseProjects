package ge.ufc.inhouseProjects;

import ge.ufc.inhouseProjects.controller.ServiceTypeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan(basePackages = {"ge.ufc.inhouseProjects.controller","ge.ufc.inhouseProjects.service","ge.ufc.inhouseProjects.configuration"})
//@EntityScan({"ge.ufc.inhouseProjects.entity"})
//@EnableJpaRepositories("ge.ufc.inhouseProjects.dao")
public class InhouseProjectsApplication {

	@Autowired
	ServiceTypeController controller;
	public static void main(String[] args) {
		SpringApplication.run(InhouseProjectsApplication.class, args);
	}

}

