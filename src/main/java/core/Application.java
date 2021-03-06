package core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import core.models.Cliente;
import core.repositorys.ClienteRespository;


@SpringBootApplication

public class Application  {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }


}