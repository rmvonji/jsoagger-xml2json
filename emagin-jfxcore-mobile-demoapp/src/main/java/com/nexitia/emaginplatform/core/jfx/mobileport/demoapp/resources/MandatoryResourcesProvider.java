/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.resources;

import com.nexitia.emaginplatform.core.ioc.api.annotations.CopyResource;
import com.nexitia.emaginplatform.core.ioc.api.annotations.CopyResources;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@CopyResources
public class MandatoryResourcesProvider {

  @CopyResource(source="/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/searchViews.properties",
      destination = "/com/nexitia/emaginplatform/jfx/core/demoapp/desktop/mobile")
  public void copySearchConfig() {

  }
}
