/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoAppRootMenuHeader;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.StandardTabPaneController;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class DemoBeansProvider {

  @Bean
  @Named("DemoAppRootMenuHeader")
  public DemoAppRootMenuHeader demoAppRootMenuHeader() {
    return new DemoAppRootMenuHeader();
  }


  @Bean
  @Named("MobileRootTabPaneView")
  public StandardTabPaneController mobileRootTabPaneView() {
    StandardTabPaneController ctrl = new StandardTabPaneController();
    ctrl.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    ctrl.setLayoutManager((IViewLayoutManager) Services.getBean("FullTabPaneLayoutManager"));
    ctrl.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/MobileRootTabPaneView.json");
    return ctrl;
  }

  @Bean
  @Named("DemoHeaderLogoPresenter")
  public com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoHeaderLogoPresenter demoHeaderLogoPresenter() {
    return new com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoHeaderLogoPresenter();
  }
}
