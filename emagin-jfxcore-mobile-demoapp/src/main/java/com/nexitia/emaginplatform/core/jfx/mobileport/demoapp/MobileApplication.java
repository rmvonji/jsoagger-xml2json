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

//import com.gluonhq.charm.glisten.control.AppBar;
//import com.gluonhq.charm.glisten.mvc.View;
import com.nexitia.emaginplatform.core.ioc.api.BeanFactory;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoDashboardBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoDetailsBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoFlowBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoFlowContextBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoI18NBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoLayoutsManagerBeanProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoMenuBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoMobileRootStructureProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoPreferencesBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoSearchBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.DemoViewStructureBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.demoapp.modules.StubMandatoryOperationsBeansProvider;
import com.nexitia.emaginplatform.core.jfx.mobileport.provider.MobileApplicationProviderUtils;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.layout.ViewStructure;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
public class MobileApplication extends Application {

  ViewStructure viewStructure;
  //View view ;

  /**
   * Constructor
   */
  public MobileApplication() {
    super();
  }


  /**
   * @{inheritedDoc}
   */
  @Override
  public void init() {
    BeanFactory.addProviders(MobileApplicationProviderUtils.ALL_PROVIDERS);

    // will init bean instances
    BeanFactory.addProvider(DemoViewStructureBeansProvider.class);
    BeanFactory.addProvider(DemoLayoutsManagerBeanProvider.class);
    BeanFactory.addProvider(StubMandatoryOperationsBeansProvider.class);
    BeanFactory.addProvider(DemoMobileRootStructureProvider.class);
    BeanFactory.addProvider(DemoViewStructureBeansProvider.class);
    BeanFactory.addProvider(DemoDashboardBeansProvider.class);
    BeanFactory.addProvider(DemoBeansProvider.class);
    BeanFactory.addProvider(DemoI18NBeansProvider.class);
    BeanFactory.addProvider(DemoFlowBeansProvider.class);
    BeanFactory.addProvider(DemoSearchBeansProvider.class);
    BeanFactory.addProvider(DemoFlowContextBeansProvider.class);
    BeanFactory.addProvider(DemoMenuBeansProvider.class);
    BeanFactory.addProvider(DemoPreferencesBeansProvider.class);
    BeanFactory.addProvider(DemoDetailsBeansProvider.class);
    BeanFactory.loadBeans();

    // set platform
    //platformType(PlatformType.MOBILE);

    // services must be initialized manually for now
    // will find solution later
    BeanFactory.instance().getBean("IntegrationService");
    /*addViewFactory(HOME_VIEW, ()  -> {
      return new View() {


        @Override
        protected void updateAppBar(AppBar appBar) {
          appBar.setTitleText("Some title");
          appBar.setVisible(false);
          appBar.setManaged(false);

          viewStructure = (ViewStructure) Services.getBean("platformViewStructure");
          viewStructure.buildStructure();
          setCenter(viewStructure.getRootViewStructure());

        }
      };
    });*/
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    viewStructure = (ViewStructure) Services.getBean("platformViewStructure");
    viewStructure.buildStructure();
    viewStructure.initFromPrimaryStage(primaryStage);
    //setCenter(viewStructure.getRootViewStructure());
  }


  /**
   * {@inheritDoc}
  @Override
  public void postInit(Scene scene) {
    try {
      ViewStructure.instance().setScene(scene);
      //viewStructure.initFromPrimaryStage(g);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }*/

}
