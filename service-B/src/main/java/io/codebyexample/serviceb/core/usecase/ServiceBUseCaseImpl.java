package io.codebyexample.serviceb.core.usecase;

import io.codebyexample.serviceb.core.entity.MessageB;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class ServiceBUseCaseImpl implements ServiceBUseCase {

  @Override
  public MessageB greet(int id) {
    return new MessageB(id, String.format("Service B hello %s!", id));
  }
}
