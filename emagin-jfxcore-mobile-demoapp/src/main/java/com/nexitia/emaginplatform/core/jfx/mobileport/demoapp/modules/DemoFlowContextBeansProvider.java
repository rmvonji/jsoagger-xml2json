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
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelIconPresenter;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelIdentityPresenter;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelSecondaryLabelPresenter;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoDialogController;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoFlowItemIdentityPresenter;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoMobileModelFlowThumbPresenter;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoModelFlowThumbPresenter;
import com.nexitia.emaginplatform.jfx.core.demoapp.comps.DemoModelStatusPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.list.impl.DefaultModelListCell;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.FlowItemPresenterFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.HorizontalFlowItemPresenterFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.MultiPresenterFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.table.TableStructureFilter;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoFlowContextBeansProvider {

  @Bean
  @Named("DemoFlowItemPresenter")
  public FlowItemPresenterFactory DemoFlowItemPresenter() {
    FlowItemPresenterFactory factory = new FlowItemPresenterFactory();
    factory.setIconPresenter((ModelIconPresenter) BeanFactory.instance().getBean("DemoModelLargeThumbPresenter"));
    factory.setIdentityPresenter((ModelIdentityPresenter) BeanFactory.instance().getBean("DemoFlowItemIdentityPresenter"));
    factory.setSecondaryLabelPresenter((ModelSecondaryLabelPresenter) BeanFactory.instance().getBean("ModelDescriptionPresenter"));
    return factory;
  }

  @Bean
  @Named("DemoFlowItemPresenter4")
  public FlowItemPresenterFactory DemoFlowItemPresenter4() {
    FlowItemPresenterFactory factory = new FlowItemPresenterFactory();
    factory.setIconPresenter((ModelIconPresenter) BeanFactory.instance().getBean("DemoModelLargeThumbPresenter"));
    factory.setIdentityPresenter((ModelIdentityPresenter) BeanFactory.instance().getBean("DemoFlowItemIdentityPresenter"));
    return factory;
  }

  @Bean
  @Named("DemoHorizontalFlowItemPresenter")
  public FlowItemPresenterFactory DemoHorizontalFlowItemPresenter() {
    HorizontalFlowItemPresenterFactory factory = new HorizontalFlowItemPresenterFactory();
    factory.setIconPresenter((ModelIconPresenter) BeanFactory.instance().getBean("DemoModelSmallThumbPresenter"));
    factory.setIdentityPresenter((ModelIdentityPresenter) BeanFactory.instance().getBean("DemoFlowItemIdentityPresenter"));
    factory.setSecondaryLabelPresenter((ModelSecondaryLabelPresenter) BeanFactory.instance().getBean("ModelDescriptionPresenter"));
    return factory;
  }

  @Bean
  @Named("DemoMobileHorizontalFlowItemPresenter")
  public FlowItemPresenterFactory DemoMobileHorizontalFlowItemPresenter() {
    HorizontalFlowItemPresenterFactory factory = new HorizontalFlowItemPresenterFactory();
    factory.setIconPresenter((ModelIconPresenter) BeanFactory.instance().getBean("DemoMobileModelFlowThumbPresenter"));
    factory.setIdentityPresenter((ModelIdentityPresenter) BeanFactory.instance().getBean("DemoFlowItemIdentityPresenter"));
    factory.setSecondaryLabelPresenter((ModelSecondaryLabelPresenter) BeanFactory.instance().getBean("ModelDescriptionPresenter"));
    return factory;
  }

  @Bean
  @Named("DialogContentView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/dialog/DialogContentView.xml"}, outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dialog")
  @I18n(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/dialog/message.properties"}, dest="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dialog/")
  public DemoDialogController DialogContentView() {
    DemoDialogController p = new DemoDialogController();
    p.setMessageSource((MessageSource) Services.getBean("DialogMessageSource"));
    p.setModelProvider((IModelProvider) Services.getBean("RootStructureModelLoader"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/dialog/DialogContentView.json");
    return p;
  }


  @Bean
  @Named("DemoMobileModelFlowThumbPresenter")
  public ModelIconPresenter DemoModelFlowThumbPresenter() {
    DemoMobileModelFlowThumbPresenter p = new DemoMobileModelFlowThumbPresenter();
    p.setWidth(120);
    p.setHeight(100);
    return p;
  }

  // 320x225
  @Bean
  @Named("DemoModelLargeThumbPresenter")
  public DemoModelFlowThumbPresenter DemoModelLargeThumbPresenter() {
    DemoModelFlowThumbPresenter p = new DemoModelFlowThumbPresenter();
    p.setWidth(120);
    p.setHeight(100);
    return p;
  }

  @Bean
  @Named("DemoModelSmallThumbPresenter")
  public ModelIconPresenter DemoModelSmallThumbPresenter() {
    DemoModelFlowThumbPresenter p = new DemoModelFlowThumbPresenter();
    p.setWidth(120);
    p.setHeight(100);
    return p;
  }

  @Bean
  @Named("DemoFlowItemIdentityPresenter")
  public DemoFlowItemIdentityPresenter DemoFlowItemIdentityPresenter() {
    DemoFlowItemIdentityPresenter p = new DemoFlowItemIdentityPresenter();
    return p;
  }

  @Bean
  @Named("DemoTableByTitleFilter")
  public TableStructureFilter DemoTableByTitleFilter() {
    TableStructureFilter t = new TableStructureFilter();
    t.setMasterAttributePath("attributes.title");
    return t;
  }

  @Bean
  @Named("DemoTableByModelFilter")
  public TableStructureFilter DemoTableByModelFilter() {
    TableStructureFilter t = new TableStructureFilter();
    t.setMasterAttributePath("attributes.model");
    return t;
  }

  @Bean
  @Named("DemoModelStatusPresenter")
  public DemoModelStatusPresenter DemoModelStatusPresenter() {
    DemoModelStatusPresenter t = new DemoModelStatusPresenter();
    return t;
  }

  @Bean
  @Named("DemoAdminItemListCellPresenter")
  public MultiPresenterFactory DemoAdminItemListCellPresenter() {
    MultiPresenterFactory d = new MultiPresenterFactory();
    d.setIdentityPresenter((ModelIdentityPresenter) Services.getBean("ModelNameIdentityPresenter"));
    d.setIconPresenter((ModelIconPresenter) Services.getBean("AdminStaticIconPresenter"));
    return d;
  }

  @Bean
  @Named("DemoAdminItemCellFactory")
  public DefaultModelListCell DemoAdminItemCellFactory() {
    DefaultModelListCell m = new DefaultModelListCell();
    return m;
  }
}
