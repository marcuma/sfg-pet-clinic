package guru.springframework.sfgpetclinic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Started!!");
    }
}
