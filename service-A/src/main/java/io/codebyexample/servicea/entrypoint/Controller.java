package io.codebyexample.servicea.entrypoint;

import io.codebyexample.servicea.core.entity.MessageA;
import io.codebyexample.servicea.core.usecase.ServiceAUseCase;
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
  ServiceAUseCase serviceAUseCase;

  @GetMapping("/greeta/{id}")
  public MessageA greet(@PathVariable(name = "id") int id) {
    return serviceAUseCase.greet(id);
  }

}
