/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.cloud.stub.operations.StubEmptyMultipleResultOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetCurrentUserOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetIllustrationOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetInstanciableSoftTypesOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetPreferenceValueOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetThumbOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetTypeByOidOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubGetTypeByPathOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubListvaluesOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubLoadContainerByOidOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubLoadContainerByPathOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubLoginOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubPaginatedTableDataOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubPersistableLoadSimpleModelOperation;
import com.nexitia.emaginplatform.cloud.stub.operations.StubSetPreferenceValueOperation;
import com.nexitia.emaginplatform.core.commons.bridge.IOperation;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class StubMandatoryOperationsBeansProvider {

  @Bean
  @Singleton
  @Named("LoginOperation")
  public IOperation loginOperation() {
    return new StubLoginOperation();
  }

  @Bean
  @Named("StubPaginatedTableDataOperation")
  public IOperation stubPaginatedTableDataOperation() {
    return new StubPaginatedTableDataOperation();
  }

  @Bean
  @Named("SetPreferencesOperation")
  public IOperation setPreferencesValueOperation() {
    return new StubSetPreferenceValueOperation();
  }

  @Bean
  @Named("SetPreferencesValueOperation")
  public IOperation setPreferenceValueOperation() {
    return new StubSetPreferenceValueOperation();
  }

  @Bean
  @Named("PreferencesOperation")
  public IOperation preferencesOperation() {
    return new StubPersistableLoadSimpleModelOperation();
  }

  @Bean
  @Named("PersistableLoadSimpleModelOperation")
  public IOperation persistableLoadSimpleModelOperation() {
    StubPersistableLoadSimpleModelOperation op = new StubPersistableLoadSimpleModelOperation();
    op.setOperation((IOperation) Services.getBean("GetTypeByOidOperation"));
    return op;
  }


  @Bean
  @Named("PaginatedTableDataOperation")
  public IOperation paginatedTableDataOperation() {
    return new StubPaginatedTableDataOperation();
  }


  @Bean
  @Named("LoadContainerByOidOperation")
  public IOperation loadContainerByOidOperation() {
    return new StubLoadContainerByOidOperation();
  }

  @Bean
  @Named("ListvaluesOperation")
  public IOperation listvaluesOperation() {
    return new StubListvaluesOperation();
  }

  @Bean
  @Named("ListValuesOperation")
  public IOperation ListeValuesOperation() {
    return new StubListvaluesOperation();
  }

  @Bean
  @Named("GetTypeByPathOperation")
  public IOperation getTypeByPathOperation() {
    return new StubGetTypeByPathOperation();
  }


  @Bean
  @Named("GetTypeByOidOperation")
  public IOperation getTypeByOidOperation() {
    return new StubGetTypeByOidOperation();
  }

  @Bean
  @Named("GetThumbOperation")
  public IOperation getThumbOperation() {
    return new StubGetThumbOperation();
  }

  @Bean
  @Named("GetPreferenceValueOperation")
  public IOperation getPreferenceValueOperation() {
    return new StubGetPreferenceValueOperation();
  }

  @Bean
  @Named("GetIllustrationOperation")
  public IOperation getIllustrationOperation() {
    return new StubGetIllustrationOperation();
  }

  @Bean
  @Named("StubGetCurrentUserOperation")
  public IOperation getCurrentUserOperation() {
    return new StubGetCurrentUserOperation();
  }

  @Bean
  @Named("EmptyMultipleResultOperation")
  public IOperation emptyMultipleResultOperation() {
    return new StubEmptyMultipleResultOperation();
  }

  @Bean
  @Named("LoadContainerByPathOperation")
  public IOperation loadContainerByPathOperation() {
    return new StubLoadContainerByPathOperation();
  }

  @Bean
  @Named("GetInstanciableSoftTypesOperation")
  public IOperation GetInstanciableSoftTypesOperation() {
    StubGetInstanciableSoftTypesOperation op = new StubGetInstanciableSoftTypesOperation();
    op.setOperation((IOperation) Services.getBean("GetTypeByPathOperation"));
    return op;
  }

  @Bean
  @Named("StubGetInstanciableSoftTypesOperation")
  public IOperation getInstanciableSoftTypesOperation() {
    StubGetInstanciableSoftTypesOperation op = new StubGetInstanciableSoftTypesOperation();
    op.setOperation((IOperation) Services.getBean("GetTypeByPathOperation"));
    return op;
  }
}
