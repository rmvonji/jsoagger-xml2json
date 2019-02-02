/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.integration;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;
import com.nexitia.emaginplatform.jfx.core.api.ResourceUtils;
import com.nexitia.emaginplatform.jfx.core.api.services.GlobalComponentsService;
import com.nexitia.emaginplatform.jfx.core.client.viewdef.xml.model.VLViewComponentXML;
import com.nexitia.emaginplatform.jfx.core.client.viewdef.xml.model.VLViewConfigXML;

/**
 * @author Ramilafananana  VONJISOA
 */
public class JsonGlobalCompsService implements GlobalComponentsService {

  boolean debug = true;
  boolean loaded = false;
  private List<String> files = new ArrayList<>();

  VLViewConfigXML allLoadedComps= new VLViewConfigXML();

  /**
   * {@inheritDoc}
   */
  @Override
  public VLViewComponentXML getCompFromGlobalConfig(String id) {
    // not supported yet
    if(debug) {
      System.out.println("[Find global component ] " + id);
    }

    if(!loaded) {
      loadFiles();
    }

    Optional<VLViewComponentXML> comp =  allLoadedComps.getComponentById(id);
    if(comp.isPresent()) {
      System.out.println("[Found global component ] " + id);
    }
    else {
      System.out.println("[Not Found global component ] " + id);
    }

    return comp.orElse(null);
  }


  private void loadFiles() {
    if(!loaded) {
      files.add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps/CoreActions");
      files.add("/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps/CoreActionsModel");

      // Load core attributes
      String coreAttributes = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps/CoreAttributes.json";
      try(InputStream io = ResourceUtils.getStream(getClass(), coreAttributes)){
        Gson gson1 = new Gson();
        VLViewConfigXML c  = gson1.fromJson(new InputStreamReader(io), VLViewConfigXML.class);
        allLoadedComps.getComponents().addAll(c.getComponents());
      }catch (Exception e) {
      }


      // load core components
      String coreComp = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps/CoreComponents.json";
      try(InputStream io = ResourceUtils.getStream(getClass(), coreComp)){
        Gson gson = new Gson();
        VLViewConfigXML c = gson.fromJson(new InputStreamReader(io), VLViewConfigXML.class);
        allLoadedComps.getComponents().addAll(c.getComponents());
      }catch (Exception e) {
      }

      // load core action
      String coreActions = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps/CoreActions.json";
      try(InputStream io = ResourceUtils.getStream(getClass(), coreActions)){
        Gson gson = new Gson();
        VLViewConfigXML c = gson.fromJson(new InputStreamReader(io), VLViewConfigXML.class);
        allLoadedComps.getComponents().addAll(c.getComponents());
      }catch (Exception e) {
      }

      // load core action model
      String coreActionsModel = "/com/nexitia/emaginplatform/jfx/core/demoapp/mobile/globalcomps/CoreActionsModel.json";
      try(InputStream io = ResourceUtils.getStream(getClass(), coreActionsModel)){
        Gson gson = new Gson();
        VLViewConfigXML c = gson.fromJson(new InputStreamReader(io), VLViewConfigXML.class);
        allLoadedComps.getComponents().addAll(c.getComponents());
      }catch (Exception e) {
      }

      loaded = true;
    }
  }
}
