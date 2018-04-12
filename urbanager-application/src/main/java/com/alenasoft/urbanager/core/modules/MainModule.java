package com.alenasoft.urbanager.core.modules;

import com.alenasoft.urbanager.UrbanagerConf;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import com.alenasoft.urbanager.resources.arithmeticoperation.service.ArithmeticOperationService;
import com.alenasoft.urbanager.resources.arithmeticoperation.service.ArithmeticOperationServiceImpl;
import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersService;
import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersServiceImpl;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

/**
 * This class should define the main bindings for dependency injection.
 *
 * @author Luis Roberto Perez
 * @since 20-05-17
 */
public class MainModule extends DropwizardAwareModule<UrbanagerConf> {
  @Override
  protected void configure() {
    bind(ExampleService.class).to(ExampleServiceImpl.class);
    bind(ArithmeticOperationService.class).to(ArithmeticOperationServiceImpl.class);
    bind(NaturalNumbersService.class).to(NaturalNumbersServiceImpl.class);
  }
}
