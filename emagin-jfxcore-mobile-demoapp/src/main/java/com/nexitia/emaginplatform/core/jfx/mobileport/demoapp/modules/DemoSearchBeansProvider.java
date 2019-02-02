/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.commons.bridge.IOperation;
import com.nexitia.emaginplatform.core.commons.i18n.MessageSource;
import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.core.ioc.api.annotations.ConvertViewToJson;
import com.nexitia.emaginplatform.core.ioc.api.annotations.I18n;
import com.nexitia.emaginplatform.core.ioc.api.annotations.View;
import com.nexitia.emaginplatform.jfx.core.api.IEnumeratedValuesLoader;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.IMultipleEnumeratedValuesLoader;
import com.nexitia.emaginplatform.jfx.core.api.IViewResolver;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.api.view.IViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.components.search.comps.SearchAllTypesFormViewResolver;
import com.nexitia.emaginplatform.jfx.core.components.search.comps.SearchAllTypesResultViewResolver;
import com.nexitia.emaginplatform.jfx.core.components.search.controller.MultiformSearchController;
import com.nexitia.emaginplatform.jfx.core.components.search.controller.SearchFormController;
import com.nexitia.emaginplatform.jfx.core.components.search.controller.SearchResultController;
import com.nexitia.emaginplatform.jfx.core.components.search.controller.SearchRootFormController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.RootStructureController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.content.RootStructureContentController;
import com.nexitia.emaginplatform.jfx.core.engine.model.MultipleSoftTypeToEnumeratedValueLoader;
import com.nexitia.emaginplatform.jfx.core.engine.model.SoftTypeToEnumeratedValueLoader;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
@ConvertViewToJson
public class DemoSearchBeansProvider {


  @Bean
  @Named("SearchAllTypesView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/SearchAllTypesView.xml"},outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search")
  public MultiformSearchController searchAllTypesView() {
    MultiformSearchController p = new MultiformSearchController();
    p.setSearchFormViewResolver((IViewResolver) BeanFactory.instance().getBean("SearchAllTypesFormViewResolver"));
    p.setSearchResultViewResolver((IViewResolver) BeanFactory.instance().getBean("SearchAllTypesFormViewResolver"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/SearchAllTypesView.json");
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    return p;
  }

  @Bean
  @Named("SearchAllTypesRootFormView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/SearchAllTypesRootFormView.xml"},outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search")
  @I18n(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/message.properties","/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/message.properties"},
  dest = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/")
  public SearchRootFormController searchAllTypesRootFormView() {
    SearchRootFormController p = new SearchRootFormController();
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/SearchAllTypesRootFormView.json");
    p.setLayoutManager((IViewLayoutManager) BeanFactory.instance().getBean("SearchFormLayoutContentManager"));
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    return p;
  }


  @Bean
  @Named("DemoSearchVehicleFormView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/form/SearchVehiclesFormView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form")
  public SearchFormController DemoSearchVehicleFormView() {
    SearchFormController p = new SearchFormController();
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form/SearchVehiclesFormView.json");
    return p;
  }


  @Bean
  @Named("DemoSearchManufacturerFormView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/form/SearchManufacturerFormView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form")
  public SearchFormController DemoSearchManufacturerFormView() {
    SearchFormController p = new SearchFormController();
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form/SearchManufacturerFormView.json");
    return p;
  }


  @Bean
  @Named("DemoSearchPersonFormView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/form/SearchPersonFormView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form")
  public SearchFormController DemoSearchPersonFormView() {
    SearchFormController p = new SearchFormController();
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form/SearchPersonFormView.json");
    return p;
  }

  @Bean
  @Named("DemoSearchDocumentFormView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/form/SearchDocumentFormView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form")
  public SearchFormController DemoSearchDocumentFormView() {
    SearchFormController p = new SearchFormController();
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/form/SearchDocumentFormView.json");
    return p;
  }

  @Bean
  @Named("DemoSearchResultView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/result/DemoSearchResultView.xml"},
  outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/result")
  public SearchResultController DemoSearchResultView() {
    SearchResultController p = new SearchResultController();
    p.setLayoutManager((IViewLayoutManager) Services.getBean("SearchResultLayoutManager"));
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/result/DemoSearchResultView.json");
    return p;
  }


  @Bean
  @Named("SearchAllTypesResultViewResolver")
  public IViewResolver searchAllTypesResultViewResolver() {
    SearchAllTypesResultViewResolver p = new SearchAllTypesResultViewResolver();
    p.setDefinitionFile("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/searchViews.properties");
    p.init();
    return p;
  }

  @Bean
  @Named("SearchAllTypesFormViewResolver")
  public IViewResolver searchAllTypesFormViewResolver() {
    SearchAllTypesFormViewResolver p = new SearchAllTypesFormViewResolver();
    p.setDefinitionFile("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/searchViews.properties");
    p.init();
    return p;
  }

  @Bean
  @Named("DemoInstanciableTypesToEnumeratedValueLoader")
  public IMultipleEnumeratedValuesLoader demoInstanciableTypesToEnumeratedValueLoader() {
    MultipleSoftTypeToEnumeratedValueLoader p = new MultipleSoftTypeToEnumeratedValueLoader();
    p.getLoaders().put("Vehicle", "DemoInstanciableVehicleTypeToEnumeratedValueLoader");
    p.getLoaders().put("Document", "DemoInstanciableDocumentTypeToEnumeratedValueLoader");
    p.getLoaders().put("Person", "DemoInstanciablePersonTypeToEnumeratedValueLoader");
    return p;
  }

  @Bean
  @Named("DemoInstanciableVehicleTypeToEnumeratedValueLoader")
  public IEnumeratedValuesLoader demoInstanciableVehicleTypeToEnumeratedValueLoader() {
    SoftTypeToEnumeratedValueLoader p = new SoftTypeToEnumeratedValueLoader();
    p.setGetTypeByPathOperation((IOperation) BeanFactory.instance().getBean("GetTypeByPathOperation"));
    p.setOperation((IOperation) Services.getBean("GetInstanciableSoftTypesOperation"));
    p.setIncludeRootTypeInResult(false);
    p.getProperties().put("rootType", "com.nexitia.emaginplatform.demo.Type/Vehicles");
    return p;
  }

  @Bean
  @Named("DemoInstanciableDocumentTypeToEnumeratedValueLoader")
  public IEnumeratedValuesLoader demoInstanciableDocumentTypeToEnumeratedValueLoader() {
    SoftTypeToEnumeratedValueLoader p = new SoftTypeToEnumeratedValueLoader();
    p.setGetTypeByPathOperation((IOperation) BeanFactory.instance().getBean("GetTypeByPathOperation"));
    p.setOperation((IOperation) Services.getBean("GetInstanciableSoftTypesOperation"));
    p.setIncludeRootTypeInResult(false);
    p.getProperties().put("rootType", "com.nexitia.emaginplatform.demo.Type/Document");
    return p;
  }

  @Bean
  @Named("DemoInstanciablePersonTypeToEnumeratedValueLoader")
  public IEnumeratedValuesLoader demoInstanciablePersonTypeToEnumeratedValueLoader() {
    SoftTypeToEnumeratedValueLoader p = new SoftTypeToEnumeratedValueLoader();
    p.setGetTypeByPathOperation((IOperation) BeanFactory.instance().getBean("GetTypeByPathOperation"));
    p.setOperation((IOperation) Services.getBean("GetInstanciableSoftTypesOperation"));
    p.setIncludeRootTypeInResult(false);
    p.getProperties().put("rootType", "com.nexitia.emaginplatform.demo.Type/Person");
    return p;
  }

  @Bean
  @Named("DemoInstanciableManufacturerTypeToEnumeratedValueLoader")
  public IEnumeratedValuesLoader demoInstanciableManufacturerTypeToEnumeratedValueLoader() {
    SoftTypeToEnumeratedValueLoader p = new SoftTypeToEnumeratedValueLoader();
    p.setGetTypeByPathOperation((IOperation) BeanFactory.instance().getBean("GetInstanciableSoftTypesOperation"));
    p.setIncludeRootTypeInResult(false);
    p.getProperties().put("rootType", "com.nexitia.emaginplatform.demo.Type/Manufacturer");
    return p;
  }


  @Bean
  @Named("SearchFiltersInSecondaryRSContentView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/SearchFiltersInSecondaryRSContentView.xml"},outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search")
  public RootStructureContentController searchFiltersInSecondaryRSContentView() {
    RootStructureContentController p = new RootStructureContentController();
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/SearchFiltersInSecondaryRSContentView.json");
    return p;
  }

  @Bean
  @Named("SearchFiltersInSecondaryRSView")
  @View(locations= {"/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/search/SearchFiltersInSecondaryRSView.xml"},outputFilePath="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search")
  public RootStructureController searchFiltersInSecondaryRSView() {
    RootStructureController p = new RootStructureController();
    p.setMessageSource((MessageSource) Services.getBean("SearchMessageSource"));
    p.setModelProvider((IModelProvider) BeanFactory.instance().getBean("RootStructureModelLoader"));
    p.addViewDefinition("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/search/SearchFiltersInSecondaryRSView.json");
    return p;
  }
}
