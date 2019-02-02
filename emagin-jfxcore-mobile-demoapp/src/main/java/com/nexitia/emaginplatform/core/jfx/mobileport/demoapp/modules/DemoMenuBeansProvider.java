/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.commons.i18n.MessageSource;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.core.ioc.api.annotations.View;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.FullFlowViewController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.StandardController;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoMenuBeansProvider {

  @Bean
  @Named("DemoMobileMenuView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/menu/DemoMobileMenuView.xml"})
  public StandardController DemoMobileMenuView() {
    StandardController controller = new StandardController();
    controller.setMessageSource((MessageSource) Services.getBean("MobileMessageSource"));
    controller.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    controller.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/menu/DemoMobileMenuView.json");
    return controller;
  }

  @Bean
  @Named("DemoMobileListExample3View")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/flow/DemoMobileListExample3View.xml"})
  public FullFlowViewController DemoMobileListExample3View() {
    FullFlowViewController controller = new FullFlowViewController();
    controller.setLayoutManager((IViewLayoutManager) Services.getBean("DemoScrolLessCenteredFullFlowLayoutManager"));
    controller.setMessageSource((MessageSource) Services.getBean("FlowMessageSource"));
    controller.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    controller.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/flow/DemoMobileListExample3View.json");
    return controller;
  }

  @Bean
  @Named("DemoMobileListExample4View")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/flow/DemoMobileListExample4View.xml"})
  public FullFlowViewController DemoMobileListExample4View() {
    FullFlowViewController controller = new FullFlowViewController();
    controller.setLayoutManager((IViewLayoutManager) Services.getBean("DemoScrolLessCenteredFullFlowLayoutManager"));
    controller.setMessageSource((MessageSource) Services.getBean("FlowMessageSource"));
    controller.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    controller.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/flow/DemoMobileListExample4View.json");
    return controller;
  }

  @Bean
  @Named("DemoMobileListExample5View")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/flow/DemoMobileListExample5View.xml"})
  public FullFlowViewController DemoMobileListExample5View() {
    FullFlowViewController controller = new FullFlowViewController();
    controller.setLayoutManager((IViewLayoutManager) Services.getBean("DemoScrolLessCenteredFullFlowLayoutManager"));
    controller.setMessageSource((MessageSource) Services.getBean("FlowMessageSource"));
    controller.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    controller.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/flow/DemoMobileListExample5View.json");
    return controller;
  }
}
