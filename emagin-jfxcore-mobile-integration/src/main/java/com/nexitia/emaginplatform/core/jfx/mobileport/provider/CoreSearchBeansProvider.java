/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IAttributeForwardEditionHandler;
import com.nexitia.emaginplatform.jfx.core.api.IParentResponsiveMatrix;
import com.nexitia.emaginplatform.jfx.core.components.search.SearchAttributeForwardEditor;
import com.nexitia.emaginplatform.jfx.core.components.search.SearchFormLayoutContentManager;
import com.nexitia.emaginplatform.jfx.core.components.search.SimpleSearchForwardEditionHandler;
import com.nexitia.emaginplatform.jfx.core.components.search.comps.SearchHeaderComponent;
import com.nexitia.emaginplatform.jfx.core.engine.components.list.impl.ModelSearchResultListCell;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.util.ParentResponsiveMatrix;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreSearchBeansProvider {

  @Bean
  @Named("SearchHeaderComponent")
  public SearchHeaderComponent searchHeaderComponent() {
    SearchHeaderComponent p = new SearchHeaderComponent();
    p.setMode("mobile");
    return p;
  }

  @Bean
  @Named("SearchFormForwardEditionHandler")
  public IAttributeForwardEditionHandler SimpleSearchForwardEditionHandler() {
    return new SimpleSearchForwardEditionHandler();
  }

  @Bean
  @Named("SearchAttributeForwardEditor")
  public SearchAttributeForwardEditor SearchAttributeForwardEditor() {
    return new SearchAttributeForwardEditor();
  }

  @Bean
  @Named("ModelSearchResultListCell")
  public ModelSearchResultListCell ModelSearchResultListCell() {
    return new ModelSearchResultListCell();
  }


  @Bean
  @Named("SearchFormLayoutContentManager")
  public SearchFormLayoutContentManager searchFormLayoutContentManager() {
    SearchFormLayoutContentManager p = new SearchFormLayoutContentManager();
    p.setResponsiveMatrix((IParentResponsiveMatrix) BeanFactory.instance().getBean("SearchFormResponsiveMatrix"));
    return p;
  }

  @Bean
  @Named("SearchFormResponsiveMatrix")
  public ParentResponsiveMatrix searchFormResponsiveMatrix() {
    List<String> d = (List<String>) BeanFactory.instance().getBean("SearchFormResponsiveMatrixDefinition");
    ParentResponsiveMatrix p = new ParentResponsiveMatrix(d);
    return p;
  }

  @Bean
  @Named("SearchFormResponsiveMatrixDefinition")
  public List<String> searchFormResponsiveMatrixDefinition() {
    List<String> l = new ArrayList<>();
    l.add("0#0:0.98:0#hide::hide");
    return l;
  }
}
