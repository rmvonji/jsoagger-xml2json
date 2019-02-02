/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.core.ioc.api.annotations.View;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.IParentResponsiveMatrix;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelIconPresenter;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelIdentityPresenter;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelSecondaryLabelPresenter;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoMobileModelFlowThumbPresenter;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoModelStatusPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.FlowItemPresenterFactory;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.FullFlowViewController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.layout.FullFlowContentLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.util.ParentResponsiveMatrix;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoFlowBeansProvider {

  @Bean
  @Named("DemoModelStatusPresenter")
  public DemoModelStatusPresenter DemoModelStatusPresenter() {
    DemoModelStatusPresenter t = new DemoModelStatusPresenter();
    return t;
  }

  @Bean
  @Named("DemoMobileContentFlowView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/list/DemoMobileListView.xml"})
  public FullFlowViewController mobileLayoutRSView() {
    FullFlowViewController controller = new FullFlowViewController();
    controller.setLayoutManager((IViewLayoutManager) BeanFactory.instance().getBean("DemoMobileContentFlowViewLayoutManager"));
    controller.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    controller.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/list/DemoMobileListView.json");
    return controller;
  }

  @Bean
  @Named("DemoMobileContentFlowViewLayoutManager")
  public FullFlowContentLayoutManager demoMobileContentFlowViewLayoutManager() {
    FullFlowContentLayoutManager layoutManager = new FullFlowContentLayoutManager();
    layoutManager.setResponsiveMatrix((IParentResponsiveMatrix) BeanFactory.instance().getBean("DemoMobileContentFlowViewLayoutManagerResponsiveMatrix"));
    return layoutManager;
  }

  @Bean
  @Named("DemoMobileContentFlowViewLayoutManagerResponsiveMatrix")
  public ParentResponsiveMatrix demoMobileContentFlowViewLayoutManagerResponsiveMatrix() {
    List<String> matrix = (List<String>) BeanFactory.instance().getBean("DemoMobileContentFlowViewLayoutManagerResponsiveMatrixDefinition");
    ParentResponsiveMatrix p = new ParentResponsiveMatrix(matrix);
    return p;
  }

  @Bean
  @Named("DemoMobileContentFlowViewLayoutManagerResponsiveMatrixDefinition")
  public List<String> demoMobileContentFlowViewLayoutManagerResponsiveMatrixDefinition() {
    List<String> result = new ArrayList<>();
    result.add("0#0:0.98:0#hide::hide");
    return result;
  }

  @Bean
  @Named("DemoMobileModelLargeFlowThumbPresenter")
  public ModelIconPresenter DemoMobileModelLargeFlowThumbPresenter() {
    DemoMobileModelFlowThumbPresenter d = new DemoMobileModelFlowThumbPresenter();
    d.setWidth(320);
    d.setHeight(200);
    return d;
  }

  @Bean
  @Named("DemoMobileLargeFlowItemPresenter")
  public FlowItemPresenterFactory DemoMobileLargeFlowItemPresenter() {
    FlowItemPresenterFactory f = new FlowItemPresenterFactory();
    f.setIconPresenter((ModelIconPresenter) Services.getBean("DemoMobileModelLargeFlowThumbPresenter"));
    f.setIdentityPresenter((ModelIdentityPresenter) Services.getBean("DemoFlowItemIdentityPresenter"));
    f.setSecondaryLabelPresenter((ModelSecondaryLabelPresenter) Services.getBean("ModelDescriptionPresenter"));
    return f;
  }
}
