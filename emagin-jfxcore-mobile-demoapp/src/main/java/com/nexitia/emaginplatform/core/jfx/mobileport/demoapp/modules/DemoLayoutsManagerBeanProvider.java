/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IParentResponsiveMatrix;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.layout.FullFlowContentLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.util.ParentResponsiveMatrix;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class DemoLayoutsManagerBeanProvider {


  @Bean
  @Named("DemoScrolLessCenteredFullFlowLayoutManager")
  public FullFlowContentLayoutManager DemoScrolLessCenteredFullFlowLayoutManager() {
    FullFlowContentLayoutManager lyt = new FullFlowContentLayoutManager();
    lyt.setResponsiveMatrix((IParentResponsiveMatrix) Services.getBean("DemoScrolLessCenteredFullFlowLayoutManagerMatrix"));
    return lyt;
  }

  @Bean
  @Named("DemoScrolLessCenteredFullFlowLayoutManagerMatrix")
  public ParentResponsiveMatrix DemoScrolLessCenteredFullFlowLayoutManagerMatrix() {
    List<String> matrix = (List<String>) Services.getBean("DemoScrolLessCenteredFullFlowLayoutManagerMatrixDefinition");
    ParentResponsiveMatrix lyt = new ParentResponsiveMatrix(matrix);
    return lyt;
  }

  @Bean
  @Singleton
  @Named("DemoScrolLessCenteredFullFlowLayoutManagerMatrixDefinition")
  public List<String> DemoScrolLessCenteredFullFlowLayoutManagerMatrixDefinition() {
    List<String> data = new ArrayList<>();
    data.add("0#0:1:0#hide::hide");
    return data;
  }

  @Bean
  @Named("MobilePrimaryHeaderToolbarResponsiveMatrix")
  public ParentResponsiveMatrix mobilePrimaryHeaderToolbarResponsiveMatrix() {
    List<String> t = (List<String>) Services.getBean("MobilePrimaryHeaderToolbarResponsiveMatrixDefinition");
    ParentResponsiveMatrix prm = new ParentResponsiveMatrix(t);
    return prm;
  }

  @Bean
  @Named("MobilePrimaryHeaderToolbarResponsiveMatrixDefinition")
  public List<String> mobilePrimaryHeaderToolbarResponsiveMatrixDefinition() {
    List<String> t = new ArrayList<>();
    t.add("0#0.20:0.60:0.20#::");
    return t;
  }

}
