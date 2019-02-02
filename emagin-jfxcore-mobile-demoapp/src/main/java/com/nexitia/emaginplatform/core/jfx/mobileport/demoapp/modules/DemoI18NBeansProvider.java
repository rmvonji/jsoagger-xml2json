/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

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
public class DemoI18NBeansProvider {

  @Bean
  @Singleton
  @Named("MobileMessageSource")
  public MessageSource demoAppRootMenuHeader() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.message");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.globalcomps.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("CommonDashboardMessageSource")
  public MessageSource commonDashboardMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.dashboard.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("DemoAdministrationMessageSource")
  public MessageSource demoAdministrationMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.administration.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("DetailsViewMessageSource")
  public MessageSource detailsViewMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.details.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("DialogMessageSource")
  public MessageSource dialogMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.dialog.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("FlowMessageSource")
  public MessageSource flowMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.flow.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("PreferencesMessageSource")
  public MessageSource preferencesMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.preferences.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("RooStructureMessageSource")
  public MessageSource rooStructureMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.rootstructure.message");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.jfx.core.engine.controller.localization");
    messageSource.getBasenames().add("i18n.generalBundle");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("SearchMessageSource")
  public MessageSource searchMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.search.message");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.message");
    return messageSource;
  }

  @Bean
  @Singleton
  @Named("DemoExamplesTableMessageSource")
  public MessageSource demoExamplesTableMessageSource() {
    MessageSource messageSource = new MessageSource();
    messageSource.setUseCodeAsDefaultMessage(true);
    messageSource.setDefaultEncoding("UTF-8");
    messageSource.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.table.message");
    return messageSource;
  }

  @Bean
  @Named("PreferencesMessageSource")
  public MessageSource PreferencesMessageSource() {
    MessageSource p = new MessageSource();
    p.setUseCodeAsDefaultMessage(true);
    p.setDefaultEncoding("UTF-8");
    p.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.preferences.message");
    return p;
  }

}
