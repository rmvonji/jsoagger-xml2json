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
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DashboardController;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoBarChart;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoDashboardItem;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoDashboardPercentItem;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoPieChart;
import com.nexitia.emaginplatform.jfx.core.engine.controller.AbstractViewController;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoDashboardBeansProvider {

  @Bean
  @Named("MobileDashboardView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/dashboard/DemoDashboardView.xml", "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dashboard/MobileDashboardView.xml"},
  outputFileName="MobileDashboardView.json", outputFilePath = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dashboard")
  @I18n(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/dashboard/message.properties"}, dest="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dashboard/")
  public AbstractViewController MobileDashboardView() {
    DashboardController controller = new DashboardController();
    controller.setMessageSource((MessageSource) Services.getBean("DashboardMessageSource"));
    controller.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    controller.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dashboard/MobileDashboardView.json");
    return controller;
  }

  @Bean
  @Named("DashboardMessageSource")
  public MessageSource dashboardMessageSource() {
    MessageSource m = new MessageSource();
    m.getBasenames().add("com.nexitia.emaginplatform.core.ui.jfx.demoapp.mobile.dashboard.message");
    return m;
  }

  @Bean
  @Named("DemoDashboardPercentItem")
  public DemoDashboardPercentItem providesDemoDashboardPercentItem() {
    return new DemoDashboardPercentItem();
  }


  @Bean
  @Named("DemoBarChart")
  public DemoBarChart demoBarChart() {
    return new DemoBarChart();
  }

  @Bean
  @Named("DemoPieChart")
  public DemoPieChart providesDemoPieChart() {
    return new DemoPieChart();
  }

  @Bean
  @Named("DemoDashboardItem")
  public DemoDashboardItem providesDemoDashboardItem() {
    return new DemoDashboardItem();
  }
}
