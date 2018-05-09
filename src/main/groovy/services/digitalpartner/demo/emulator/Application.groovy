package services.digitalpartner.demo.emulator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * Created by prakashb on 7/05/18.
 */
@SpringBootApplication
@EnableSwagger2
class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
