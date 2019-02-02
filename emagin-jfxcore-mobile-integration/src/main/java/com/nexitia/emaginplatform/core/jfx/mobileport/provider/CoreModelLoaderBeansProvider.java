package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.commons.bridge.IOperation;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.components.modelprovider.ModelRelatedToRootStructureLoader;
import com.nexitia.emaginplatform.jfx.core.components.modelprovider.RootStructureModelLoader;
import com.nexitia.emaginplatform.jfx.core.components.modelprovider.StructureContentModelLoader;
import com.nexitia.emaginplatform.jfx.core.components.modelprovider.StructureContentModelReference;

/**
 *
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreModelLoaderBeansProvider {

  @Bean
  @Singleton
  @Named("RootStructureModelLoader")
  public IModelProvider rootStructureModelLoader() {
    RootStructureModelLoader loader = new RootStructureModelLoader();
    loader.setLoadContainerByOidOperation((IOperation) Services.getBean("LoadContainerByOidOperation"));
    return loader;
  }

  @Bean
  @Named("StructureContentModelLoader")
  public IModelProvider StructureContentModelLoader() {
    StructureContentModelLoader loader = new StructureContentModelLoader();
    loader.setLoadSimpleModelOperation((IOperation) Services.getBean("PersistableLoadSimpleModelOperation"));
    return loader;
  }

  @Bean
  @Named("ModelRelatedToRootStructureLoader")
  public IModelProvider ModelRelatedToRootStructureLoader() {
    ModelRelatedToRootStructureLoader loader = new ModelRelatedToRootStructureLoader();
    loader.setLoadSimpleModelOperation((IOperation) Services.getBean("PersistableLoadSimpleModelOperation"));
    return loader;
  }

  @Bean
  @Named("StructureContentModelReference")
  public IModelProvider StructureContentModelReference() {
    StructureContentModelReference loader = new StructureContentModelReference();
    return loader;
  }
}
