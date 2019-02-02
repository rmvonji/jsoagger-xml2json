/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import com.nexitia.emaginplatform.core.ioc.api.annotations.GlobalComponents;
import com.nexitia.emaginplatform.core.ioc.api.annotations.GlobalComponentsToJson;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
@GlobalComponentsToJson
public class GlobalComponentsProvider {

  @GlobalComponents(source= {"classpath:/comp/CoreActions.xml","classpath:/comp/CoreActionsModel.xml",
      "classpath:/comp/CoreAttributes.xml", "classpath:/comp/CoreComponents.xml"},
      destination="/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps")
  public void process() {
    //<value>/comp/CoreActions.xml</value>
    ///<value>/comp/CoreActionsModel.xml</value>
    //<value>/comp/CoreAttributes.xml</value>
    //<value>/comp/CoreColumns.xml</value>
    //<value>/comp/CoreTreeColumns.xml</value>
    //<value>/comp/CoreComponents.xml</value>
  }
}
