/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.commons.i18n.MessageSource;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreI18NBeansProvider {

  @Bean
  @Singleton
  @Named("CoreMessageSource")
  public MessageSource rooStructureMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.jfx.core.engine.controller.localization");
    messageSource.getBasenames().add("i18n.generalBundle");
    return messageSource;
  }
}
