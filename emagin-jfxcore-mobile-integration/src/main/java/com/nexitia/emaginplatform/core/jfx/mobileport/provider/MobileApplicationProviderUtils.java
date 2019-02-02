/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class, agregation of core providers for mobile application.
 *
 * @author Ramilafananana  VONJISOA
 *
 */
public class MobileApplicationProviderUtils {


  public static List<Class<?>> ALL_PROVIDERS = new ArrayList<>();

  /**
   * Internal
   */
  private MobileApplicationProviderUtils() {
  }

  static {
    ALL_PROVIDERS.add(CoreAuthentificationBeansProvider.class);
    ALL_PROVIDERS.add(CoreBeansProvider.class);
    ALL_PROVIDERS.add(CoreDetailsBeansProvider.class);
    ALL_PROVIDERS.add(CoreFlowContextBeansProvider.class);
    ALL_PROVIDERS.add(CoreI18NBeansProvider.class);
    ALL_PROVIDERS.add(CoreLayoutsManagerBeanProvider.class);
    ALL_PROVIDERS.add(CoreModelLoaderBeansProvider.class);
    ALL_PROVIDERS.add(CorePreferencesBeansProvider.class);
    ALL_PROVIDERS.add(CoreSearchBeansProvider.class);
    ALL_PROVIDERS.add(CoreSearchBeansProvider.class);
    ALL_PROVIDERS.add(CoreValidationConstraintBeansProvider.class);
    ALL_PROVIDERS.add(CoreViewStructureBeansProvider.class);
    ALL_PROVIDERS.add(GlobalComponentsProvider.class);
  }
}
