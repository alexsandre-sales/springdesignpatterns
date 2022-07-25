package designprojetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignprojetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignprojetosApplication.class, args);
	}

}
