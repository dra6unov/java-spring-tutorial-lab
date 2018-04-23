package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@ComponentScan
@EnableMBeanExport
public class ResTfullTrialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfullTrialApplication.class, args);
	}
}
