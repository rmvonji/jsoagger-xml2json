/**
 *
 */

package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.integration.CommonCompsServices;
import com.nexitia.emaginplatform.core.jfx.mobileport.integration.JSonViewConfigurationService;
import com.nexitia.emaginplatform.core.jfx.mobileport.integration.JsonGlobalCompsService;
import com.nexitia.emaginplatform.core.jfx.mobileport.integration.MobileApplicationContext;
import com.nexitia.emaginplatform.jfx.core.api.services.ApplicationContextService;
import com.nexitia.emaginplatform.jfx.core.api.services.CommonComponentsServices;
import com.nexitia.emaginplatform.jfx.core.api.services.GlobalComponentsService;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.services.ViewConfigurationService;

/**
 * @author Ramilafananana  VONJISOA
 */
@BeansProvider
public class CoreViewStructureBeansProvider {

  /**
   * Constructor
   */
  public CoreViewStructureBeansProvider() {
  }


  @Bean
  @Singleton
  @Named("ApplicationContextService")
  public ApplicationContextService appContextService() {
    MobileApplicationContext mobile = new MobileApplicationContext();
    return mobile;
  }


  @Bean
  @Singleton
  @Named("ViewConfigurationService")
  public ViewConfigurationService viewConfigurationService() {
    JSonViewConfigurationService viewConfigurationService = new JSonViewConfigurationService();
    return viewConfigurationService;
  }

  @Bean
  @Singleton
  @Named("GlobalComponentsService")
  public GlobalComponentsService jsonGlobalCompsService() {
    JsonGlobalCompsService jsonGlobalComps = new JsonGlobalCompsService();
    return jsonGlobalComps;
  }

  @Bean
  @Singleton
  @Named("CommonCompsServices")
  public CommonCompsServices commonCompsServices() {
    CommonCompsServices commonCompsServices = new CommonCompsServices();
    return commonCompsServices;
  }

  @Bean
  @Singleton
  @Named("IntegrationService")
  public Services integrationService() {
    Services services = new Services();
    services.setAppContextService((ApplicationContextService) BeanFactory.instance().getBean("ApplicationContextService"));
    services.setCommonComponentsServices((CommonComponentsServices) BeanFactory.instance().getBean("CommonCompsServices"));
    services.setGlobalConfigService((GlobalComponentsService) BeanFactory.instance().getBean("GlobalComponentsService"));
    services.setViewConfigurationService((ViewConfigurationService) BeanFactory.instance().getBean("ViewConfigurationService"));
    return services;
  }
}
