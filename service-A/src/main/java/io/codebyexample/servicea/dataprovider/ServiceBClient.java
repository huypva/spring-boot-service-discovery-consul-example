package io.codebyexample.servicea.dataprovider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huypva
 */
@FeignClient(value = "service-B")
public interface ServiceBClient {

  @RequestMapping(method = RequestMethod.GET, value = "${service-B.path.greet}")
  MessageB greet(@PathVariable(name = "id") int id);

}
