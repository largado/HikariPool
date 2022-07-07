package avena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) throws InterruptedException {
		while(true){
			SpringApplication.run(SpringDataApplication.class, args);
			Thread.sleep(100000);
		}




	}

}
