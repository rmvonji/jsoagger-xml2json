/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.jfx.core.components.actions.BuildRSContentEventAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.CloseSecondaryRSAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.DoSearchAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.DoShowPreferencesInSecondaryRSView;
import com.nexitia.emaginplatform.jfx.core.components.actions.FlowItemActionPresenter;
import com.nexitia.emaginplatform.jfx.core.components.actions.PushToTabContentViewAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.PushToViewAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.PushViewToRSContentAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.PushViewToSecondaryRSContentAction;
import com.nexitia.emaginplatform.jfx.core.components.toolbar.SearchToolbar;
import com.nexitia.emaginplatform.jfx.core.engine.components.pagination.StaticListEntryLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.descriptionprovider.ModelDescriptionPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.identityprovider.ModelNameIdentityPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.FiltrableTableHeaderImpl;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.FiltrableTableHeaderImpl2;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class CoreFlowContextBeansProvider {


  @Bean
  @Named("PushToTabContentViewAction")
  public PushToTabContentViewAction PushToTabContentViewAction() {
    return new com.nexitia.emaginplatform.jfx.core.components.actions.PushToTabContentViewAction();
  }

  @Bean
  @Named("PushToTabContentViewAction")
  public PushToViewAction PushToViewAction() {
    return new PushToViewAction();
  }

  @Bean
  @Named("BuildRSContentEventAction")
  public BuildRSContentEventAction BuildRSContentEventAction() {
    return new BuildRSContentEventAction();
  }

  @Bean
  @Named("FlowItemActionPresenter")
  public FlowItemActionPresenter FlowItemActionPresenter() {
    return new FlowItemActionPresenter();
  }

  @Bean
  @Named("SearchToolbar")
  public SearchToolbar SearchToolbar() {
    return new SearchToolbar();
  }

  @Bean
  @Named("DoSearchAction")
  public DoSearchAction DoSearchAction() {
    return new DoSearchAction();
  }

  @Bean
  @Named("CloseSecondaryRSAction")
  public CloseSecondaryRSAction CloseSecondaryRSAction() {
    return new CloseSecondaryRSAction();
  }

  @Bean
  @Named("PushViewToRSContentAction")
  public PushViewToRSContentAction PushViewToRSContentAction() {
    return new PushViewToRSContentAction();
  }

  @Bean
  @Named("PushViewToSecondaryRSContentAction")
  public PushViewToSecondaryRSContentAction PushViewToSecondaryRSContentAction() {
    return new PushViewToSecondaryRSContentAction();
  }

  @Bean
  @Named("DoShowPreferencesInSecondaryRSView")
  public DoShowPreferencesInSecondaryRSView DoShowPreferencesInSecondaryRSView() {
    return new DoShowPreferencesInSecondaryRSView();
  }

  @Bean
  @Named("ModelNameIdentityPresenter")
  public ModelNameIdentityPresenter ModelNameIdentityPresenter() {
    return new ModelNameIdentityPresenter();
  }

  @Bean
  @Named("FiltrableTableHeaderImpl")
  public FiltrableTableHeaderImpl FiltrableTableHeaderImpl() {
    return new FiltrableTableHeaderImpl();
  }

  @Bean
  @Named("FiltrableTableHeaderImpl2")
  public FiltrableTableHeaderImpl2 FiltrableTableHeaderImpl2() {
    return new FiltrableTableHeaderImpl2();
  }


  @Bean
  @Named("StaticListEntryLoader")
  public StaticListEntryLoader StaticListEntryLoader() {
    StaticListEntryLoader d = new StaticListEntryLoader();
    return d;
  }


  @Bean
  @Named("ModelDescriptionPresenter")
  public ModelDescriptionPresenter ModelDescriptionPresenter() {
    ModelDescriptionPresenter p = new ModelDescriptionPresenter();
    return p;
  }
}
