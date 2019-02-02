/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IParentResponsiveMatrix;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.layout.FixedLeftRightThreeHPanesViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.layout.ViewForwardLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.util.ParentResponsiveMatrix;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreLayoutsManagerBeanProvider {


  @Bean
  @Named("FixedLeftRightThreeHPanesViewLayoutManager")
  public FixedLeftRightThreeHPanesViewLayoutManager FixedLeftRightThreeHPanesViewLayoutManager() {
    FixedLeftRightThreeHPanesViewLayoutManager lyt = new FixedLeftRightThreeHPanesViewLayoutManager();
    lyt.setResponsiveMatrix((IParentResponsiveMatrix) Services.getBean("FullTabPaneLayoutManagerResponsiveMatrix"));
    return lyt;
  }

  @Bean
  @Named("FullTabPaneLayoutManager")
  public FixedLeftRightThreeHPanesViewLayoutManager FullTabPaneLayoutManager() {
    FixedLeftRightThreeHPanesViewLayoutManager lyt = new FixedLeftRightThreeHPanesViewLayoutManager();
    lyt.setResponsiveMatrix((IParentResponsiveMatrix) Services.getBean("FullTabPaneLayoutManagerResponsiveMatrix"));
    return lyt;
  }

  @Bean
  @Named("FullTabPaneLayoutManagerResponsiveMatrix")
  public ParentResponsiveMatrix FullTabPaneLayoutManagerResponsiveMatrix() {
    List<String> matrix = (List<String>) Services.getBean("FullTabPaneLayoutManagerResponsiveMatrixDefinition");
    ParentResponsiveMatrix lyt = new ParentResponsiveMatrix(matrix);
    return lyt;
  }


  @Bean
  @Singleton
  @Named("FullTabPaneLayoutManagerResponsiveMatrixDefinition")
  public List<String> FullTabPaneLayoutManagerResponsiveMatrixDefinition() {
    List<String> data = new ArrayList<>();
    data.add("0#0:1:0#hide::hide");
    return data;
  }



  @Bean
  @Named("CenteredStretchedViewLayoutManager")
  public FixedLeftRightThreeHPanesViewLayoutManager CenteredStretchedViewLayoutManager() {
    FixedLeftRightThreeHPanesViewLayoutManager lyt = new FixedLeftRightThreeHPanesViewLayoutManager();
    lyt.setResponsiveMatrix((IParentResponsiveMatrix) Services.getBean("CenteredStretchedViewLayoutManagerResponsiveMatrix"));
    return lyt;
  }

  @Bean
  @Named("CenteredStretchedViewLayoutManagerResponsiveMatrix")
  public ParentResponsiveMatrix CenteredStretchedViewLayoutManagerResponsiveMatrix() {
    List<String> matrix = (List<String>) Services.getBean("CenteredStretchedViewLayoutManagerResponsiveMatrixDefinition");
    ParentResponsiveMatrix lyt = new ParentResponsiveMatrix(matrix);
    return lyt;
  }

  @Bean
  @Singleton
  @Named("CenteredStretchedViewLayoutManagerResponsiveMatrixDefinition")
  public List<String> CenteredStretchedViewLayoutManagerResponsiveMatrixDefinition() {
    List<String> data = new ArrayList<>();
    data.add("0#0:1:0#hide::hide");
    return data;
  }

  @Bean
  @Named("CenteredStretchedForwardViewLayoutManager")
  public ViewForwardLayoutManager CenteredStretchedForwardViewLayoutManager() {
    ViewForwardLayoutManager lyt = new ViewForwardLayoutManager();
    lyt.setResponsiveMatrix((IParentResponsiveMatrix) Services.getBean("CenteredStretchedForwardViewLayoutResponsiveMatrix"));
    return lyt;
  }

  @Bean
  @Named("CenteredStretchedForwardViewLayoutResponsiveMatrix")
  public IParentResponsiveMatrix CenteredStretchedForwardViewLayoutResponsiveMatrix() {
    List<String> matrix = (List<String>) Services.getBean("CenteredStretchedForwardViewLayoutResponsiveMatrixMatrixDefinition");
    ParentResponsiveMatrix lyt = new ParentResponsiveMatrix(matrix);
    return lyt;
  }

  @Bean
  @Singleton
  @Named("CenteredStretchedForwardViewLayoutResponsiveMatrixMatrixDefinition")
  public List<String> CenteredStretchedForwardViewLayoutResponsiveMatrixMatrixDefinition() {
    List<String> data = new ArrayList<>();
    data.add("0#0:0.98:0#hide::hide");
    return data;
  }


  @Bean
  @Named("SecondaryHeaderToolbarResponsiveMatrix")
  public IParentResponsiveMatrix SecondaryHeaderToolbarResponsiveMatrix() {
    List<String> matrix = (List<String>) Services.getBean("SecondaryHeaderToolbarResponsiveMatrixDefinition");
    ParentResponsiveMatrix lyt = new ParentResponsiveMatrix(matrix);
    return lyt;
  }

  @Bean
  @Singleton
  @Named("SecondaryHeaderToolbarResponsiveMatrixDefinition")
  public List<String> SecondaryHeaderToolbarResponsiveMatrixDefinition() {
    List<String> data = new ArrayList<>();
    data.add("0#0.60:0:0.40#:hide:");
    return data;
  }
}
