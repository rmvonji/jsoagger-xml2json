/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.integration;

import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.nexitia.emaginplatform.jfx.core.api.IEmaginController;
import com.nexitia.emaginplatform.jfx.core.api.ResourceUtils;
import com.nexitia.emaginplatform.jfx.core.api.services.ViewConfigurationService;
import com.nexitia.emaginplatform.jfx.core.client.viewdef.xml.model.VLViewConfigXML;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
public class JSonViewConfigurationService  implements ViewConfigurationService {

  private boolean debug = false;

  /**
   * Merge views definitions corresponding to this view. View must define at least one
   * wizardConfiguration.
   */
  @Override
  public VLViewConfigXML getConfigurationFile(final IEmaginController controller) {
    VLViewConfigXML finalResult = null;

    if(debug) {
      System.out.println("Searching for wiew : " + controller.getViewDefinitions().get(0));
    }

    String file = controller.getViewDefinitions().get(0);
    if(file.endsWith(".xml")) {
      throw new RuntimeException("Only Json configurration file is supported, given" + file);
    }

    if(debug) {
      System.out.println("### Searching for wiew : " + file);
    }

    Gson gson = new Gson();
    InputStream io = ResourceUtils.getStream(controller.getClass(), file);
    finalResult = gson.fromJson(new InputStreamReader(io), VLViewConfigXML.class);

    return finalResult;
  }
}
