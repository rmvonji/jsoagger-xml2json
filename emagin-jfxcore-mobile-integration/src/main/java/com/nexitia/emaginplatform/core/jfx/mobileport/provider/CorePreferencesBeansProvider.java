/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.commons.bridge.IOperation;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.components.actions.DoChangeDefaultThemeAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.DoChangeDefaultThemeFromPreferencesAction;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.IListFormDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.LegalMentionItemPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.ListFormCellFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.MultiSelectionListFormItemPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.ParentItemPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.PreferenceDoActionPresenterFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.SystemUpdateListFormCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.SystemVersionListFormCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.YesNoListFormCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.dataloader.ApplicationVersionDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.dataloader.ByKeySingleListFormDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.dataloader.ListFormDataLoader;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class CorePreferencesBeansProvider {


  @Bean
  @Named("ByKeySingleListFormDataLoader")
  public ByKeySingleListFormDataLoader ByKeySingleListFormDataLoader() {
    ByKeySingleListFormDataLoader p = new ByKeySingleListFormDataLoader();
    p.setGetPreferenceValueOperation((IOperation) Services.getBean("GetPreferenceValueOperation"));
    p.setSetPreferenceValueOperation((IOperation) Services.getBean("SetPreferencesOperation"));
    p.setListValueOperation((IOperation) Services.getBean("ListValuesOperation"));
    return p;
  }


  @Bean
  @Named("applicationVersionValuePresenter")
  public MultiSelectionListFormItemPresenter applicationVersionValuePresenter() {
    MultiSelectionListFormItemPresenter p = new MultiSelectionListFormItemPresenter();
    p.setDataLoader((IListFormDataLoader) Services.getBean("applicationVersionDataLoader"));
    return p;
  }

  @Bean
  @Named("defaultMultiSelectionPreferenceValuePresenter")
  public MultiSelectionListFormItemPresenter defaultMultiSelectionPreferenceValuePresenter() {
    MultiSelectionListFormItemPresenter p = new MultiSelectionListFormItemPresenter();
    p.setDataLoader((IListFormDataLoader) Services.getBean("ListFormDataLoader"));
    return p;
  }

  @Bean
  @Named("ListFormDataLoader")
  public ListFormDataLoader ListFormDataLoader() {
    ListFormDataLoader p = new ListFormDataLoader();
    return p;
  }

  @Bean
  @Named("legalMentionItemPresenter")
  public LegalMentionItemPresenter LegalMentionItemPresenter() {
    LegalMentionItemPresenter p = new LegalMentionItemPresenter();
    return p;
  }

  @Bean
  @Named("parentItemPresenter")
  public ParentItemPresenter ParentItemPresenter() {
    ParentItemPresenter p = new ParentItemPresenter();
    return p;
  }


  @Bean
  @Named("systemUpdatePresenter")
  public SystemUpdateListFormCellPresenter SystemUpdateListFormCellPresenter() {
    SystemUpdateListFormCellPresenter p = new SystemUpdateListFormCellPresenter();
    return p;
  }

  @Bean
  @Named("systemVersionPresenter")
  public SystemVersionListFormCellPresenter SystemVersionListFormCellPresenter() {
    SystemVersionListFormCellPresenter p = new SystemVersionListFormCellPresenter();
    return p;
  }

  @Bean
  @Named("applicationVersionDataLoader")
  public ApplicationVersionDataLoader ApplicationVersionDataLoader() {
    ApplicationVersionDataLoader p = new ApplicationVersionDataLoader();
    return p;
  }

  @Bean
  @Named("yesNoItemPresenter")
  public YesNoListFormCellPresenter yesNoItemPresenter() {
    YesNoListFormCellPresenter p = new YesNoListFormCellPresenter();
    p.setSetPreferenceValueOperation((IOperation) Services.getBean("SetPreferencesValueOperation"));
    return p;
  }

  @Bean
  @Named("DoChangeDefaultThemeFromPreferencesAction")
  public DoChangeDefaultThemeFromPreferencesAction DoChangeDefaultThemeFromPreferencesAction() {
    DoChangeDefaultThemeFromPreferencesAction p = new DoChangeDefaultThemeFromPreferencesAction();
    return p;
  }


  @Bean
  @Named("DoChangeDefaultThemeAction")
  public DoChangeDefaultThemeAction DoChangeDefaultThemeAction() {
    DoChangeDefaultThemeAction p = new DoChangeDefaultThemeAction();
    return p;
  }


  @Bean
  @Named("PreferencesListCellFactory")
  public ListFormCellFactory PreferencesListCellFactory() {
    ListFormCellFactory p = new ListFormCellFactory();
    return p;
  }

  @Bean
  @Named("PreferenceDoActionPresenterFactory")
  public PreferenceDoActionPresenterFactory PreferenceDoActionPresenterFactory() {
    PreferenceDoActionPresenterFactory p = new PreferenceDoActionPresenterFactory();
    return p;
  }
}
