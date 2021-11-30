package io.codebyexample.serviceb.entrypoint;

import io.codebyexample.serviceb.core.entity.MessageB;
import io.codebyexample.serviceb.core.usecase.ServiceBUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huypva
 */
@RestController
public class Controller {

  @Autowired
  ServiceBUseCase serviceBUseCase;

  @GetMapping("/greetb/{id}")
  public MessageB greet(@PathVariable(name = "id") int id) {
    return serviceBUseCase.greet(id);
  }
}
