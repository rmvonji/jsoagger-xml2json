/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.integration;

import com.nexitia.emaginplatform.jfx.core.api.IEmaginController;
import com.nexitia.emaginplatform.jfx.core.api.services.CommonComponentsServices;
import com.nexitia.emaginplatform.jfx.core.client.viewdef.xml.model.VLViewContextFilterXML;
import com.nexitia.emaginplatform.jfx.core.client.viewdef.xml.model.VLViewFilterXML;

/**
 * @author Ramilafananana  VONJISOA
 */
public class CommonCompsServices  implements CommonComponentsServices {

  /**
   * {@inheritDoc}
   */
  @Override
  public VLViewFilterXML getFilter(IEmaginController controller, String id) {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public VLViewContextFilterXML getFiltersContext(String id) {
    return null;
  }
}
