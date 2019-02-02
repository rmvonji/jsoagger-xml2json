/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.integration;

import java.text.MessageFormat;

import com.nexitia.emaginplatform.core.commons.utils.StringUtils;
import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.jfx.core.api.css.IStylesheetManager;
import com.nexitia.emaginplatform.jfx.core.api.services.ApplicationContextService;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
public class MobileApplicationContext implements ApplicationContextService{

  /**
   * Constructor
   */
  public MobileApplicationContext() {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public  IStylesheetManager getStylesheetManager() {
    return (IStylesheetManager) getBean("styleSheetManager");
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public  void dispatchEvent(Object event) {
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public Object getBean(String identifier) {
    if (StringUtils.isEmpty(identifier)) {
      return null;
    }

    try {
      Object bean =  BeanFactory.instance().getBean(identifier);
      if(bean != null) {
        return bean;
      }
      return null;
    } catch (Exception e) {
      e.printStackTrace();
    }

    throw new IllegalArgumentException(MessageFormat.format("Bean with name {0} not found in application context", identifier));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void publishEvent(Object event) {
  }
}
