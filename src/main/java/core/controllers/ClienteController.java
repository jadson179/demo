package core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import core.models.Cliente;
import core.repositorys.ClienteRespository;

@RestController(value = "clientes")
@RequestMapping("/clientes")
public class ClienteController {
      
  @Autowired
  private ClienteRespository repo;

  @GetMapping("/todos")
  public ResponseEntity<List<Cliente>> pesquisarTodo() {
     
    return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);
  }

  @GetMapping("{id}")
  public ResponseEntity<Cliente> pesquisarPorId(
    @PathVariable Long id
  ) {
     
    try {
      return new ResponseEntity<>(repo.findById(id).get(),HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(repo.findById(id).get(),HttpStatus.OK);
    }
  }
}
