package top.dfghhj.anhanx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AnhanxApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnhanxApplication.class, args);
    }

    @GetMapping("/a")
    public String a() {
        return "a";
    }
}
