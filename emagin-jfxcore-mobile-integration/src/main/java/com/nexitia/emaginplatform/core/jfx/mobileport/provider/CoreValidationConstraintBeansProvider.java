/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;
import javax.inject.Singleton;

import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IVLConstraint;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLAlphaNumericConstraint;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLConstraintMaxLength;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLConstraintMinLength;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLConstraintNotBlank;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLConstraintRequired;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLEmailConstraint;
import com.nexitia.emaginplatform.jfx.core.engine.components.validation.VLPhoneNumberConstraints;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreValidationConstraintBeansProvider {

  @Bean
  @Singleton
  @Named("VLAlphaNumericConstraint")
  public IVLConstraint VLAlphaNumericConstraint() {
    IVLConstraint c = new VLAlphaNumericConstraint();
    c.setErrorMessageKey("ERROR_ALPHANUMERIC_VALUE");
    return c;
  }

  @Bean
  @Singleton
  @Named("VLConstraintRequired")
  public IVLConstraint VLConstraintRequired() {
    IVLConstraint c = new VLConstraintRequired();
    c.setErrorMessageKey("ERROR_MANDATORY_FIELD");
    return c;
  }

  @Bean
  @Singleton
  @Named("VLConstraintMaxLength")
  public IVLConstraint VLConstraintMaxLength() {
    IVLConstraint c = new VLConstraintMaxLength();
    c.setErrorMessageKey("ERROR_VALIDATION_MAX_LENGTH");
    return c;
  }

  @Bean
  @Singleton
  @Named("VLConstraintMinLength")
  public IVLConstraint VLConstraintMinLength() {
    IVLConstraint c = new VLConstraintMinLength();
    c.setErrorMessageKey("ERROR_VALIDATION_MIN_LENGTH");
    return c;
  }

  @Bean
  @Singleton
  @Named("VLConstraintNotBlank")
  public IVLConstraint VLConstraintNotBlank() {
    IVLConstraint c = new VLConstraintNotBlank();
    c.setErrorMessageKey("ERROR_NOT_BLANK_FIELD");
    return c;
  }

  @Bean
  @Singleton
  @Named("VLEmailConstraint")
  public IVLConstraint VLEmailConstraint() {
    IVLConstraint c = new VLEmailConstraint();
    c.setErrorMessageKey("ERROR_MAIL_NOT_VALID");
    return c;
  }

  @Bean
  @Singleton
  @Named("VLPhoneNumberConstraints")
  public IVLConstraint VLPhoneNumberConstraints() {
    IVLConstraint c = new VLPhoneNumberConstraints();
    c.setErrorMessageKey("ERROR_PHONE_NOT_VALID");
    return c;
  }
}
