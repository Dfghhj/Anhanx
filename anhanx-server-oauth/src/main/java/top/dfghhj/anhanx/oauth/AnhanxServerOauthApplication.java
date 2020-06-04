package top.dfghhj.anhanx.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootApplication
public class AnhanxServerOauthApplication {

    @Resource
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(AnhanxServerOauthApplication.class, args);
    }

}
