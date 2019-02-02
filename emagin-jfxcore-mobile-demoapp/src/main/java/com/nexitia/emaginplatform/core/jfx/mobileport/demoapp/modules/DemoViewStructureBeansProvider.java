/**
 *
 */

package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.MobileViewStructure;
import com.nexitia.emaginplatform.jfx.core.api.css.IStylesheetManager;
import com.nexitia.emaginplatform.jfx.core.engine.components.css.StyleSheetsManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.layout.ViewStructure;

/**
 * @author Ramilafananana  VONJISOA
 */
@BeansProvider
public class DemoViewStructureBeansProvider {

  /**
   * Constructor
   */
  public DemoViewStructureBeansProvider() {
  }

  @Bean
  @Singleton
  @Named("platformViewStructure")
  public ViewStructure platformViewStructure() {
    return new MobileViewStructure();
  }


  @Bean
  @Singleton
  @Named("platformProperties")
  public Properties platformProperties() {
    Properties platformProperties = new Properties();
    platformProperties.setProperty("tempFolderPath", "temp");
    platformProperties.setProperty("applicationDataFolderPath", "temp");
    platformProperties.setProperty("localNotificationsFolderPath", "temp");
    platformProperties.setProperty("applicationWindowName", "temp");
    platformProperties.setProperty("applicationTitle", "temp");
    platformProperties.setProperty("fullScreen", "false");
    platformProperties.setProperty("platformRootStructureId", "MobileLayoutRSView");
    platformProperties.setProperty("loginRootStructureId", "LoginRootStructure");
    platformProperties.setProperty("platformType", "SIMUL_MOBILE");
    platformProperties.setProperty("applicationViewConfigMode", "offline");
    platformProperties.setProperty("applicationConnexionMode", "allow_anonymous");
    platformProperties.setProperty("full.screen.support", "true");
    return platformProperties;
  }

  @Bean
  @Singleton
  @Named("styleSheetManager")
  public IStylesheetManager styleSheetManager() {
    StyleSheetsManager sheetsManager = new StyleSheetsManager();
    sheetsManager.getStyleSheetsPath().add("classpath:/css/color/accent/orange.css");
    sheetsManager.getStyleSheetsPath().add("classpath:/css/color/primary/light-blue.css");
    sheetsManager.getStyleSheetsPath().add("classpath:/css/content/light/light-mobile.css");
    sheetsManager.getStyleSheetsPath().add("classpath:/css/undecorator/undecorator.css");
    sheetsManager.getStyleSheetsPath().add("classpath:/com/emagin/core/jfx/controller/login/login.css");
    return sheetsManager;
  }

  @Bean
  @Singleton
  @Named("customStyleSheetsPath")
  public List<String> customStyleSheetsPath(){
    List<String> d = new ArrayList<>();
    d.add("classpath:/css/mobile-override.css");
    return d;
  }

  @Bean
  @Singleton
  @Named("wizardProperties")
  public Properties providesWizardProperties() {
    Properties wizardProperties = new Properties();
    wizardProperties.setProperty("width", "300");
    wizardProperties.setProperty("height", "400");
    return wizardProperties;
  }

  @Bean
  @Singleton
  @Named("screenProperties")
  public Properties screenProperties() {
    Properties screenProperties = new Properties();
    screenProperties.setProperty("width", "340");
    screenProperties.setProperty("height", "600");
    screenProperties.setProperty("minWidth", "340");
    screenProperties.setProperty("minHeight", "600");
    screenProperties.setProperty("maxWidth", "340");
    screenProperties.setProperty("maxHeight", "600");
    return screenProperties;
  }
}
