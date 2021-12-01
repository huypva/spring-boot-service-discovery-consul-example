package io.codebyexample.serviceb.core.usecase;

import io.codebyexample.serviceb.core.entity.MessageB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Slf4j
@Component
public class ServiceBUseCaseImpl implements ServiceBUseCase {

  @Override
  public MessageB greet(int id) {
    log.info("ServiceB.greet " + id);
    return new MessageB(id, String.format("Service B hello %s!", id));
  }
}
