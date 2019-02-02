/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.commons.i18n.MessageSource;
import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.core.ioc.api.annotations.I18n;
import com.nexitia.emaginplatform.core.ioc.api.annotations.View;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.MenuConfigurationProvider;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.components.menu.PrimaryMenuProvider;
import com.nexitia.emaginplatform.jfx.core.engine.controller.PrimaryMenuController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.DoubleHeaderRootStructureController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.RootStructureController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.StandardTabPaneController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.content.RootStructureContentController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.header.ToolbarController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.util.ParentResponsiveMatrix;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoMobileRootStructureProvider {

  @Bean
  @Named("MobileLayoutRSView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileLayoutRSView.xml"})
  @I18n(locations = {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/message.properties"}, dest="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps")
  public RootStructureController mobileLayoutRSView() {
    DoubleHeaderRootStructureController mobileLayoutRSView = new DoubleHeaderRootStructureController();
    mobileLayoutRSView.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    mobileLayoutRSView.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileLayoutRSView.json");
    return mobileLayoutRSView;
  }


  @Bean
  @Named("MobileLayoutRSContentView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileLayoutRSContentView.xml"})
  public RootStructureContentController mobileLayoutRSContentView() {
    RootStructureContentController rscc = new RootStructureContentController();
    rscc.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    rscc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileLayoutRSContentView.json");
    return rscc;
  }

  @Bean
  @Named("MobileRootTabPaneView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileRootTabPaneView.xml"})
  public StandardTabPaneController mobileRootTabPaneView() {
    StandardTabPaneController tpv = new StandardTabPaneController();
    tpv.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    tpv.setLayoutManager((IViewLayoutManager) BeanFactory.instance().getBean("FullTabPaneLayoutManager"));
    tpv.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileRootTabPaneView.json");
    return tpv;
  }

  @Bean
  @Named("MobilePrimaryMenuView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/MobilePrimaryMenuView.xml"})
  @I18n(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/rootstructure/message.properties"}, dest="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure")
  public PrimaryMenuController mobilePrimaryMenuView() {
    PrimaryMenuController pmc = new PrimaryMenuController();
    pmc.setMessageSource((MessageSource) Services.getBean("MobileMessageSource"));
    pmc.setMenuProvider((MenuConfigurationProvider) Services.getBean("MobilePrimaryMenuProvider"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/MobilePrimaryMenuView.json");
    return pmc;
  }

  @Bean
  @Named("MobilePrimaryMenuProvider")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/MobilePrimaryMenuDefinition.xml"})
  public PrimaryMenuProvider primaryMenuProvider() {
    PrimaryMenuProvider pmc = new PrimaryMenuProvider();
    pmc.setPrimaryMenu("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/MobilePrimaryMenuDefinition.json");
    return pmc;
  }


  @Bean
  @Named("MobilePrimaryHeaderToolbarView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/MobilePrimaryHeaderToolbarView.xml", "/com/emagin/core/jfx/controller/HeaderToolbar.xml"}, outputFileName="MobilePrimaryHeaderToolbar.json")
  public ToolbarController mobilePrimaryHeaderToolbarView() {
    ToolbarController tpv = new ToolbarController();
    tpv.setResponsiveMatrix((ParentResponsiveMatrix) Services.getBean("MobilePrimaryHeaderToolbarResponsiveMatrix"));
    tpv.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    tpv.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/MobilePrimaryHeaderToolbar.json");
    return tpv;
  }
}
