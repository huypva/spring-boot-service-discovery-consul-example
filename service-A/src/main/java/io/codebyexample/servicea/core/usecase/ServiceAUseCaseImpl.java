package io.codebyexample.servicea.core.usecase;

import io.codebyexample.servicea.core.entity.MessageA;
import io.codebyexample.servicea.dataprovider.MessageB;
import io.codebyexample.servicea.dataprovider.ServiceBClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Slf4j
@Component
public class ServiceAUseCaseImpl implements ServiceAUseCase {

  @Autowired
  ServiceBClient serviceBClient;

  @Override
  public MessageA greet(int id) {
    log.info("ServiceA.greet " + id);
    MessageB messageB = serviceBClient.greet(id);
    return new MessageA(id, String.format("Service A hello -> %s!", messageB.getMessage()));
  }
}
