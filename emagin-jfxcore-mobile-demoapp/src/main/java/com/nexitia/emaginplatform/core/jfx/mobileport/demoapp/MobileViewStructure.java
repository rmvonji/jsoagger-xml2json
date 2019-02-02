/**
 *
 */
package com.nexitia.emaginplatform.core.jfx.mobileport.demoapp;

import java.util.Properties;

import com.nexitia.emaginplatform.jfx.core.api.css.IStylesheetManager;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.RootStructureController;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.layout.ViewStructure;
import com.nexitia.emaginplatform.jfx.core.engine.controller.main.layout.ViewStructureStatus;

import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * @author Ramilafananana  VONJISOA
 *
 */
public class MobileViewStructure extends ViewStructure   {

  private StackPane pane = new StackPane();
  private StackPane content = new StackPane();

  /**
   * Constructor
   */
  public MobileViewStructure() {
    super();
    setStylesheetManager((IStylesheetManager) Services.getBean("styleSheetManager"));
    setPlatformProperties((Properties) Services.getBean("platformProperties"));
    setScreenProperties((Properties) Services.getBean("screenProperties"));

    pane.getChildren().add(content);
    //pane.setStyle("-fx-border-width:2;-fx-border-color:blue;-fx-alignment:CENTER");
    pane.widthProperty().addListener(new ChangeListener<Number>() {

      @Override
      public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
        //pane.getChildren().clear();
        // pane.getChildren().add(new Label(newValue.toString()));
        platformSceneWidth().set(newValue.doubleValue());
      }});
  }

  @Override
  public void init() {
    super.init();
  }

  @Override
  public Pane getRootViewStructure() {
    return pane;
  }

  @Override
  public Pane getRootViewStructureHeaderArea() {
    return null;
  }

  @Override
  public Pane getRootViewStructureContentArea() {
    return content;
  }

  @Override
  public void selectTab(int tabIndex) {
  }

  @Override
  public void removeTab(String tabId) {
  }

  @Override
  public void removeTab(int tabIndex) {
  }

  @Override
  public void selectTab(String tabId) {
  }

  @Override
  public void add(RootStructureController rootStructure) {
  }

  @Override
  public void remove(RootStructureController rootStructure) {

  }

  @Override
  public void closeAllTabs() {

  }

  @Override
  public ObjectProperty<ViewStructureStatus> statusProperty() {
    return null;
  }

  @Override
  public ViewStructureStatus getStatus() {
    return null;
  }

  @Override
  public void setStatus(ViewStructureStatus status) {
  }
}
