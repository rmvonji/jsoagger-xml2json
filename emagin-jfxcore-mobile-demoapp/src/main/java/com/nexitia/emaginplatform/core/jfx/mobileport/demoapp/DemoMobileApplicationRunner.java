/*-
 * ========================LICENSE_START=================================
 * Emagin Platform
 * %%
 * Copyright (C) 2018 NEXITIA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp;




import com.nexitia.emaginplatform.core.commons.utils.StringUtils;

import javafx.application.Application;

/**
 * Must be runn with JVM args: -Dspring.profiles.active=dev,desktop
 *
 * @author Ramilafananana VONJISOA
 * @mailto yvonjisoa@nexitia.com
 * @date 2018
 */
public final class DemoMobileApplicationRunner {

  /**
   * Default Constructor
   */
  public DemoMobileApplicationRunner() {
    super();
  }


  /**
   * JMV ARGS -> emagin.platform.launch.with.preloader=TRUE
   *
   * @param args
   */
  public static void main(String[] args) {
    boolean withPreloader = Boolean.valueOf(getArgs("emagin.platform.launch.with.preloader=", args, "false"));
    if (withPreloader) {
      System.setProperty("javafx.preloader", "com.nexitia.emaginplatform.jfx.core.ui.preloader.desktop.EPDesktopPreloader");
    }

    Application.launch(MobileApplication.class, args);
  }


  private static String getArgs(String key, String[] args, String defaultValue) {
    for (String arg : args) {
      if (arg.equals(key)) {
        return StringUtils.substringAfter(arg, key);
      }
    }

    return defaultValue;
  }
}
