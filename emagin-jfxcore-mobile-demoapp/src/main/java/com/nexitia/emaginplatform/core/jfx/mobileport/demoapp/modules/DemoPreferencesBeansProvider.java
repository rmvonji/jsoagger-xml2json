/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.commons.i18n.MessageSource;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.core.ioc.api.annotations.I18n;
import com.nexitia.emaginplatform.core.ioc.api.annotations.View;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.controller.SelectMultiValueController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.RootStructureController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.StandardController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.content.RootStructureContentController;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoPreferencesBeansProvider {


  @Bean
  @Named("DemoMobilePreferencesRSContentView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoMobilePreferencesRSContentView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public RootStructureContentController DemoPreferencesRSContentView() {
    RootStructureContentController p = new RootStructureContentController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoMobilePreferencesRSContentView.json");
    return p;
  }

  @Bean
  @Named("DemoMobilePreferencesRSView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoMobilePreferencesRSView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  @I18n(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/message.properties"}, dest="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public RootStructureController DemoPreferencesRSView() {
    RootStructureController p = new RootStructureController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoMobilePreferencesRSView.json");
    return p;
  }

  @Bean
  @Named("DemoMobilePreferencesRootGroupListView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesRootGroupListView.xml",
  "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoMobilePreferencesRootGroupListView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesRootGroupListView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesRootGroupListView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesGeneralGroupTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesGeneralGroupTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesGeneralGroupTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesGeneralGroupTabPaneView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesRegionalGroupTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesRegionalGroupTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesRegionalGroupTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesRegionalGroupTabPaneView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesInformationGroupTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesInformationGroupTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesInformationGroupTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesInformationGroupTabPaneView.json");
    return p;
  }


  @Bean
  @Named("DemoPreferencesUserNotificationsTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesUserNotificationsTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesUserNotificationsTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesUserNotificationsTabPaneView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesUserThemingTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesUserThemingTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesUserThemingTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesUserThemingTabPaneView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesDatasetTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesDatasetTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesDatasetTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesDatasetTabPaneView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesThemingPrimaryTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesThemingPrimaryTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesThemingPrimaryTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesThemingPrimaryTabPaneView.json");
    return p;
  }

  @Bean
  @Named("DemoPreferencesThemingAccentTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoPreferencesThemingAccentTabPaneView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoPreferencesThemingAccentTabPaneView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoPreferencesThemingAccentTabPaneView.json");
    return p;
  }

  @Bean
  @Named("SelectPreferenceValueView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/SelectPreferenceValueView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController SelectPreferenceValueView() {
    SelectMultiValueController p = new SelectMultiValueController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/SelectPreferenceValueView.json");
    return p;
  }

  @Bean
  @Named("DemoEmptyPrefenceView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/preferences/DemoEmptyPrefenceView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController DemoEmptyPrefenceView() {
    StandardController p = new StandardController();
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/DemoEmptyPrefenceView.json");
    return p;
  }


  @Bean
  @Named("LicenceView")
  @View(locations= {"/com/emagin/jfx/core/components/cachedatas/LicenceView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController LicenceView() {
    StandardController p = new StandardController();
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/LicenceView.json");
    return p;
  }

  @Bean
  @Named("ThanksToView")
  @View(locations= {"/com/emagin/jfx/core/components/cachedatas/ThanksToView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController ThanksToView() {
    StandardController p = new StandardController();
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/ThanksToView.json");
    return p;
  }


  @Bean
  @Named("CachedDataView")
  @View(locations= {"/com/emagin/jfx/core/components/cachedatas/CachedDataView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences")
  public StandardController CachedDataView() {
    StandardController p = new StandardController();
    p.setLayoutManager((IViewLayoutManager) Services.getBean("CenteredStretchedForwardViewLayoutManager"));
    p.setMessageSource((MessageSource) Services.getBean("PreferencesMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    p.getViewDefinitions().add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/preferences/CachedDataView.json");
    return p;
  }
}
