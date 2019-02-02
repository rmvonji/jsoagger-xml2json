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
import com.nexitia.emaginplatform.jfx.core.api.IParentResponsiveMatrix;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.RootStructureController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.StandardController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.StandardViewController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.content.RootStructureContentController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.header.ToolbarController;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoDetailsBeansProvider {


  @Bean
  @Named("DemoSelfIllustrationTabView")
  @View(locations = {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/maximized/DemoMaximizedIllustrationView.xml", "/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/self/DemoSelfIllustrationTabView.xml"},
  outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details")
  public StandardController DemoSelfIllustrationTabView() {
    StandardController pmc = new StandardController();
    pmc.setLayoutManager((IViewLayoutManager) Services.getBean("FullTabPaneLayoutManager"));
    pmc.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    pmc.setMessageSource((MessageSource) Services.getBean("DetailsViewMessageSource"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details/DemoMaximizedIllustrationView.json");
    return pmc;
  }

  @Bean
  @Named("DemoSelfMaquette3DTabView")
  @View(locations = {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/maximized/DemoMaquette3DContentView.xml", "/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/self/DemoSelfMaquette3DTabView.xml"},
  outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details")
  public StandardViewController DemoSelfMaquette3DTabView() {
    StandardController pmc = new StandardController();
    pmc.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    pmc.setMessageSource((MessageSource) Services.getBean("DetailsViewMessageSource"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details/DemoMaquette3DContentView.json");
    return pmc;
  }

  @Bean
  @Named("DemoSelfMaquette2DTabView")
  @View(locations = {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/maximized/DemoMaquette2DContentView.xml"},
  outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details")
  public StandardViewController DemoMaquette2DContentView() {
    StandardController pmc = new StandardController();
    pmc.setModelProvider((IModelProvider) Services.getBean("StructureContentModelReference"));
    pmc.setMessageSource((MessageSource) Services.getBean("DetailsViewMessageSource"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details/DemoMaquette2DContentView.json");
    return pmc;
  }

  @Bean
  @Named("ShowDetailsInSecondaryRSView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/ShowDetailsInSecondaryRSView.xml"},
  outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details")
  @I18n(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/message.properties"},
  dest="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details")
  public RootStructureController showDetailsInSecondaryRSView() {
    RootStructureController pmc = new RootStructureController();
    pmc.setMessageSource((MessageSource) Services.getBean("DetailsViewMessageSource"));
    pmc.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details/ShowDetailsInSecondaryRSView.json");
    return pmc;
  }

  @Bean
  @Named("ShowDetailsViewInSecondaryRSContentView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/details/ShowDetailsViewInSecondaryRSContentView.xml"},
  outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details")
  public RootStructureContentController showDetailsViewInSecondaryRSContentView() {
    RootStructureContentController pmc = new RootStructureContentController();
    pmc.setMessageSource((MessageSource) Services.getBean("DetailsViewMessageSource"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/details/ShowDetailsViewInSecondaryRSContentView.json");
    return pmc;
  }

  @Bean
  @Named("SecondaryRSHeaderToolbarView")
  @View(locations = {"/com/emagin/jfx/core/components/header/SecondaryRSHeaderToolbarView.xml", "/com/emagin/core/jfx/controller/HeaderToolbar.xml"},
  outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure")
  public ToolbarController SecondaryRSHeaderToolbarView() {
    ToolbarController pmc = new ToolbarController();
    pmc.setResponsiveMatrix((IParentResponsiveMatrix) Services.getBean("SecondaryHeaderToolbarResponsiveMatrix"));
    pmc.setMessageSource((MessageSource) Services.getBean("RooStructureMessageSource"));
    pmc.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/rootstructure/SecondaryRSHeaderToolbarView.json");
    return pmc;
  }
}
