/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.integration;

import java.util.List;

import com.nexitia.emaginplatform.jfx.core.api.services.LocalComponentsService;
import com.nexitia.emaginplatform.jfx.core.client.viewdef.xml.model.VLViewComponentXML;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
public class LocalCompsService   implements LocalComponentsService{

  /**
   * {@inheritDoc}
   */
  @Override
  public VLViewComponentXML getComponent(String identifier) {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<String> getConfigurationFiles() {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setConfigurationFiles(List<String> configurationFiles) {
  }
}
