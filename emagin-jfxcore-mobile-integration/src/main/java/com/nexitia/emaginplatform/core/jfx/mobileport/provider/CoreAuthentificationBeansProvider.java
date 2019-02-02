/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.ResourceUtils;
import com.nexitia.emaginplatform.jfx.core.api.security.ILoginSessionHolder;
import com.nexitia.emaginplatform.jfx.core.api.security.IRootContext;
import com.nexitia.emaginplatform.jfx.core.api.security.IUserContext;
import com.nexitia.emaginplatform.jfx.core.engine.components.security.LoginSessionHolder;
import com.nexitia.emaginplatform.jfx.core.engine.components.security.RootContext;
import com.nexitia.emaginplatform.jfx.core.engine.components.security.UIContext;
import com.nexitia.emaginplatform.jfx.core.engine.components.security.UserContext;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.content.StructureContentController;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreAuthentificationBeansProvider {

  @Bean
  @Singleton
  @Named("LoginSessionHolder")
  public ILoginSessionHolder loginSessionHolder() {
    return new LoginSessionHolder();
  }

  @Bean
  @Singleton
  @Named("RootContext")
  public IRootContext rootContext() {
    IRootContext context = new RootContext();
    context.setLoginSessionHolder((ILoginSessionHolder) BeanFactory.instance().getBean("LoginSessionHolder"));
    context.init();
    return context;
  }

  @Bean
  @Singleton
  @Named("ResourceUtils")
  public ResourceUtils resourceUtils() {
    return new ResourceUtils();
  }

  @Bean
  @Named("viewContext")
  public UIContext viewContext() {
    UIContext context = new UIContext();
    context.setRootContext((IRootContext) BeanFactory.instance().getBean("RootContext"));
    context.setUserContext((IUserContext) BeanFactory.instance().getBean("UserContext"));
    return context;
  }

  @Bean
  @Named("UserContext")
  public UserContext userContext() {
    UserContext userContext = new UserContext();
    return userContext;
  }

  @Bean
  @Named("StructureContentController")
  public StructureContentController structureContentController() {
    StructureContentController structureContentController = new StructureContentController();
    return structureContentController;
  }
}
