package com.nexitia.emaginplatform.core.jfx.mobileport.provider;

import javax.inject.Named;

import com.nexitia.emaginplatform.core.commons.bridge.IOperation;
import com.nexitia.emaginplatform.core.ioc.api.annotations.Bean;
import com.nexitia.emaginplatform.core.ioc.api.annotations.BeansProvider;
import com.nexitia.emaginplatform.jfx.core.api.IAction;
import com.nexitia.emaginplatform.jfx.core.api.IListViewPaneHeader;
import com.nexitia.emaginplatform.jfx.core.api.IModelProvider;
import com.nexitia.emaginplatform.jfx.core.api.RowLayout;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelIconPresenter;
import com.nexitia.emaginplatform.jfx.core.api.presenter.ModelIdentityPresenter;
import com.nexitia.emaginplatform.jfx.core.api.services.Services;
import com.nexitia.emaginplatform.jfx.core.components.actions.PushToViewAction;
import com.nexitia.emaginplatform.jfx.core.components.actions.PushToViewActionStaticData;
import com.nexitia.emaginplatform.jfx.core.components.actions.SetRootViewEventAction;
import com.nexitia.emaginplatform.jfx.core.components.modelprovider.StructureContentModelReference;
import com.nexitia.emaginplatform.jfx.core.components.search.SimpleSearchForwardEditorFooter;
import com.nexitia.emaginplatform.jfx.core.components.search.comps.SearchFiltersBlocTitle;
import com.nexitia.emaginplatform.jfx.core.components.search.comps.SearchHeaderComponent;
import com.nexitia.emaginplatform.jfx.core.engine.action.ExpandPrimaryMenuAction;
import com.nexitia.emaginplatform.jfx.core.engine.components.autocomplete.VLAutocomplete;
import com.nexitia.emaginplatform.jfx.core.engine.components.browser.BrowserTitlePaneBlocContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.converter.EnumeratedValueModelConverter;
import com.nexitia.emaginplatform.jfx.core.engine.components.converter.GeneratedValueConverter;
import com.nexitia.emaginplatform.jfx.core.engine.components.converter.IdenpotentConverter;
import com.nexitia.emaginplatform.jfx.core.engine.components.converter.LocalDateConverter;
import com.nexitia.emaginplatform.jfx.core.engine.components.converter.StringBooleanConverter;
import com.nexitia.emaginplatform.jfx.core.engine.components.dialog.DialogContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.dialog.DialogFooter;
import com.nexitia.emaginplatform.jfx.core.engine.components.dialog.DialogHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.DynamicalAttributesFormBlocContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.FormBlocContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.FormBlocFooter;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.FormBlocTitle;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.InternalTabsFormBlocContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.ModelThumbsBlocContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.bloc.ModelVisualisationBlocContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.FormFieldset;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.FormFieldsetContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.FormFieldsetHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.layout.menu.FieldsetFlowLayout;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.layout.menu.FieldsetVerticalLayout;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.layout.tabed.FieldsetBottomTabedLayout;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.layout.tabed.FieldsetTopTabedLayout;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.fieldset.layout.tabed.SimpleFieldsetTopTabedLayout;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.row.LabelLessFormRowWrapper;
import com.nexitia.emaginplatform.jfx.core.engine.components.form.row.VerticalFormRowWrapper;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.BasicToolbar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.CurrentLocationViewer;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.ListViewPaneHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.HeaderCenterToolBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.HeaderLeftToolBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.HeaderLessSingleLocationNavigationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.HeaderRightToolbar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.MobileWithBottomTabNavigationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.NoLocationPrimaryMenuWithNavigationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.PrimaryMenuWithNavigationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.ScrollableContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.SingleLocationNavigationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.header.comps.SingleLocationPrimaryMenuWithNavigationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.AudienceSelector;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.AudienceSelectorCellFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputCheckbox;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputCombobox;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputDataImportProcessingPane;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputDatePicker;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputDirectoryPicker;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputFilePicker;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputHyperlink;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputPeriodPicker;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputSortButton;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputText;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputTextarea;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.InputWebView;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.ProcessingButton;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.ProfileSimpleButton;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.SimpleButton;
import com.nexitia.emaginplatform.jfx.core.engine.components.input.WrappedInput;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.BasicAttributeInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.BlobTextInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.CheckboxInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.DateInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.IdentifiableInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.MultiValuedInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.NumberInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.PeriodInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.inputview.TextInputView;
import com.nexitia.emaginplatform.jfx.core.engine.components.layoutproc.FormBlocProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.layoutproc.FormFieldsetListProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.layoutproc.FormFieldsetProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.layoutproc.SimpleDetailsViewAllFieldsetsProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.layoutproc.SingleBlobBlocsFieldsetProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.layoutproc.UserBigChipsListProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.BooleanListFormCellFactory;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.LegalMentionItemPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.MultiSelectionListFormItemPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.ParentItemPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.SystemUpdateListFormCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.SystemVersionListFormCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.YesNoListFormCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.dataloader.ApplicationVersionDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.listform.dataloader.ListFormDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.menu.Copyright;
import com.nexitia.emaginplatform.jfx.core.engine.components.menu.PrimaryMenuUserProfile;
import com.nexitia.emaginplatform.jfx.core.engine.components.message.EmptyNoContentPane;
import com.nexitia.emaginplatform.jfx.core.engine.components.message.GroupedActionsContentPane;
import com.nexitia.emaginplatform.jfx.core.engine.components.message.NoContentPane;
import com.nexitia.emaginplatform.jfx.core.engine.components.message.NoContentPaneProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.pagination.DefaultEntityPaginatedDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.pagination.DefaultLinkPaginatedDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.pagination.GenericEntityPaginatedDataLoader;
import com.nexitia.emaginplatform.jfx.core.engine.components.pagination.LoadMorePaginationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.pagination.SimplePaginationBar;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.DefaultEnumeratedValueTranslater;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.GenericModelAttributetoTablePresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.ModelDateTimePresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.descriptionprovider.ModelDescriptionPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.descriptionprovider.ModelMasterDescriptionPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.AccountThumbPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.AdminStaticIconPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.ModelMimeTypePresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.ModelThumbPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.PeopleThumbPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.SmallItemInitialIconCircle;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.iconprovider.TableIndicatorColumnPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.quickactions.DoActionPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.tab.MobileVLTabpane;
import com.nexitia.emaginplatform.jfx.core.engine.components.tab.VLTabpane;
import com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.BlankSpacerTableCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.HEllipsisTableCellPresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableRowMimeTypePresenter;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.SimpleTableStructureLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.TableStructureProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.TableStructureWithLayoutProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.TableStructuresVBoxProcessor;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.flow.FlowContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.flow.FlowTableContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.list.ListViewContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.TableContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.BasicTableHeaderImpl;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.EditStructureTableHeaderImpl;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.FiltrableTableHeaderImpl;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.FiltrableTableHeaderImpl2;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.table.header.StructureNavigatorTableHeaderImpl;
import com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.tree.TreeContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.toolbar.htoolbar.BasicHToolbar;
import com.nexitia.emaginplatform.jfx.core.engine.components.toolbar.htoolbar.ModifiableHToolbar;
import com.nexitia.emaginplatform.jfx.core.engine.components.toolbar.inline.FormInlineAction;
import com.nexitia.emaginplatform.jfx.core.engine.components.toolbar.inline.FormInlineEditAction;
import com.nexitia.emaginplatform.jfx.core.engine.components.toolbar.inline.FormInlineToobar;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.Wizard;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardFooter;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardStep;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardStepContent;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardStepFooter;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.WizardStepHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.content.WizardContentLayoutSelectorLeft;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.content.WizardContentLayoutSelectorTop;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.impl.EmptyStepHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.impl.EmptyWizardFooter;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.impl.EmptyWizardHeader;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.stepper.WizardHorizontalStepper;
import com.nexitia.emaginplatform.jfx.core.engine.components.wizard.stepper.WizardVerticalStepper;
import com.nexitia.emaginplatform.jfx.core.engine.controller.detailsview.layout.MaximizedDetailsView;
import com.nexitia.emaginplatform.jfx.core.engine.controller.login.component.LoginWizardFooter;
import com.nexitia.emaginplatform.jfx.core.engine.controller.login.component.LoginWizardFooterToolbar;
import com.nexitia.emaginplatform.jfx.core.engine.controller.login.component.LoginWizardStepHeader;
import com.nexitia.emaginplatform.jfx.core.engine.controller.roostructure.layout.ScrollLessSinglePaneViewLayoutManager;
import com.nexitia.emaginplatform.jfx.core.engine.model.DefaultEnumeratedValueLoader;
import com.nexitia.emaginplatform.jfx.core.engine.model.LinkableRoleBsFromCurrentContextLoader;
import com.nexitia.emaginplatform.jfx.core.engine.model.LinkableRoleBsLoader;

/**
 *
 * @author Ramilafananana  VONJISOA
 *
 */
@BeansProvider
public class CoreBeansProvider {

  @Bean
  @Named("SearchHeaderComponent")
  public SearchHeaderComponent searchHeaderComponent() {
    SearchHeaderComponent p = new SearchHeaderComponent();
    p.setMode("mobile");
    return p;
  }

  @Bean
  @Named("InputCheckbox")
  public InputCheckbox InputCheckbox() {
    return new InputCheckbox();
  }

  @Bean
  @Named("InputCombobox")
  public InputCombobox InputCombobox() {
    return new InputCombobox();
  }


  @Bean
  @Named("InputDataImportProcessingPane")
  public InputDataImportProcessingPane InputDataImportProcessingPane() {
    return new InputDataImportProcessingPane();
  }

  @Bean
  @Named("PushToViewActionStaticData")
  public PushToViewActionStaticData PushToViewActionStaticData() {
    return new PushToViewActionStaticData();
  }


  @Bean
  @Named("InputDatePicker")
  public InputDatePicker InputDatePicker() {
    return new InputDatePicker();
  }

  @Bean
  @Named("InputDirectoryPicker")
  public InputDirectoryPicker InputDirectoryPicker() {
    return new InputDirectoryPicker();
  }

  @Bean
  @Named("InputFilePicker")
  public InputFilePicker InputFilePicker() {
    return new InputFilePicker();
  }

  @Bean
  @Named("InputPeriodPicker")
  public InputPeriodPicker InputPeriodPicker() {
    return new InputPeriodPicker();
  }


  @Bean
  @Named("InputText")
  public InputText InputText() {
    return new InputText();
  }

  @Bean
  @Named("InputTextarea")
  public InputTextarea InputTextarea() {
    return new InputTextarea();
  }

  @Bean
  @Named("AutoComplete")
  public VLAutocomplete AutoComplete() {
    return new VLAutocomplete();
  }

  @Bean
  @Named("InputSortButton")
  public InputSortButton InputSortButton() {
    return new InputSortButton();
  }


  @Bean
  @Named("InputHyperlink")
  public InputHyperlink InputHyperlink() {
    return new InputHyperlink();
  }

  @Bean
  @Named("InputWebView")
  public InputWebView InputWebView() {
    return new InputWebView();
  }

  @Bean
  @Named("AudienceSelector")
  public AudienceSelector AudienceSelector() {
    return new AudienceSelector();
  }

  @Bean
  @Named("MultiValuedInputView")
  public MultiValuedInputView MultiValuedInputView() {
    return new MultiValuedInputView();
  }

  @Bean
  @Named("VerticalFormRowLayout")
  public RowLayout VerticalFormRowLayout() {
    return new VerticalFormRowWrapper();
  }

  @Bean
  @Named("HorizontalFormRowLayout")
  public RowLayout HorizontalFormRowLayout() {
    // ALWAYS RETURN VERTICAL FORM LAYOUT IN MOBILE
    // NO HorizontalFormRowLayout
    return new VerticalFormRowWrapper();
  }

  @Bean
  @Named("LabelLessFormRowWrapper")
  public LabelLessFormRowWrapper LabelLessFormRowWrapper() {
    return new LabelLessFormRowWrapper();
  }

  @Bean
  @Named("WrappedInput")
  public WrappedInput WrappedInput() {
    return new WrappedInput();
  }

  /****************************************************************************************************************************************************************
   * INPUTS IEW
   *********************************************************************************************************************************************************************/


  @Bean
  @Named("BasicAttributeInputView")
  public BasicAttributeInputView BasicAttributeInputView() {
    return new BasicAttributeInputView();
  }

  @Bean
  @Named("BlobTextInputView")
  public BlobTextInputView BlobTextInputView() {
    return new BlobTextInputView();
  }

  @Bean
  @Named("TextInputView")
  public TextInputView TextInputView() {
    return new TextInputView();
  }

  @Bean
  @Named("DateInputView")
  public DateInputView DateInputView() {
    return new DateInputView();
  }



  @Bean
  @Named("NumberInputView")
  public NumberInputView NumberInputView() {
    return new NumberInputView();
  }



  @Bean
  @Named("PeriodInputView")
  public PeriodInputView PeriodInputView() {
    return new PeriodInputView();
  }



  @Bean
  @Named("IdentifiableInputView")
  public IdentifiableInputView IdentifiableInputView() {
    return new IdentifiableInputView();
  }

  @Bean
  @Named("SimpleButton")
  public SimpleButton SimpleButton() {
    return new SimpleButton();
  }

  @Bean
  @Named("ProfileSimpleButton")
  public ProfileSimpleButton ProfileSimpleButton() {
    return new ProfileSimpleButton();
  }

  @Bean
  @Named("ProcessingButton")
  public ProcessingButton ProcessingButton() {
    return new ProcessingButton();
  }

  @Bean
  @Named("CurrentLocationViewer")
  public CurrentLocationViewer CurrentLocationViewer() {
    return new CurrentLocationViewer();
  }

  @Bean
  @Named("BasicToolbar")
  public BasicToolbar BasicToolbar() {
    return new BasicToolbar();
  }

  @Bean
  @Named("UserProfile")
  public PrimaryMenuUserProfile UserProfile() {
    return new PrimaryMenuUserProfile();
  }

  @Bean
  @Named("Copyright")
  public Copyright Copyright() {
    return new Copyright();
  }

  @Bean
  @Named("CheckboxInputView")
  public CheckboxInputView CheckboxInputView() {
    return new CheckboxInputView();
  }

  @Bean
  @Named("FormInlineEditAction")
  public FormInlineEditAction FormInlineEditAction() {
    return new FormInlineEditAction();
  }

  @Bean
  @Named("FormInlineAction")
  public FormInlineAction FormInlineAction() {
    return new FormInlineAction();
  }

  @Bean
  @Named("FormBlocFooter")
  public FormBlocFooter FormBlocFooter() {
    return new FormBlocFooter();
  }

  @Bean
  @Named("ModelMasterDescriptionPresenter")
  public ModelMasterDescriptionPresenter ModelMasterDescriptionPresenter() {
    return new ModelMasterDescriptionPresenter();
  }

  @Bean
  @Named("ScrollableContent")
  public ScrollableContent ScrollableContent() {
    return new ScrollableContent();
  }

  @Bean
  @Named("TableIndicatorColumnPresenter")
  public TableIndicatorColumnPresenter TableIndicatorColumnPresenter() {
    return new TableIndicatorColumnPresenter();
  }

  @Bean
  @Named("FormFieldsetProcessor")
  public FormFieldsetProcessor FormFieldsetProcessor() {
    return new FormFieldsetProcessor();
  }

  @Bean
  @Named("FormFieldsetListProcessor")
  public FormFieldsetListProcessor FormFieldsetListProcessor() {
    return new FormFieldsetListProcessor();
  }


  @Bean
  @Named("SimpleDetailsViewAllFieldsetsProcessor")
  public SimpleDetailsViewAllFieldsetsProcessor SimpleDetailsViewAllFieldsetsProcessor() {
    return new SimpleDetailsViewAllFieldsetsProcessor();
  }


  @Bean
  @Named("NoContentPaneProcessor")
  public NoContentPaneProcessor NoContentPaneProcessor() {
    return new NoContentPaneProcessor();
  }


  @Bean
  @Named("SingleBlobBlocsFieldsetProcessor")
  public SingleBlobBlocsFieldsetProcessor SingleBlobBlocsFieldsetProcessor() {
    return new SingleBlobBlocsFieldsetProcessor();
  }


  @Bean
  @Named("UserBigChipsListProcessor")
  public UserBigChipsListProcessor UserBigChipsListProcessor() {
    return new UserBigChipsListProcessor();
  }


  @Bean
  @Named("FormBlocProcessor")
  public FormBlocProcessor FormBlocProcessor() {
    return new FormBlocProcessor();
  }


  @Bean
  @Named("WizardContentLayoutSelectorLeft")
  public WizardContentLayoutSelectorLeft WizardContentLayoutSelectorLeft() {
    return new WizardContentLayoutSelectorLeft();
  }


  @Bean
  @Named("WizardContentLayoutSelectorTop")
  public WizardContentLayoutSelectorTop WizardContentLayoutSelectorTop() {
    return new WizardContentLayoutSelectorTop();
  }


  @Bean
  @Named("WizardHorizontalStepper")
  public WizardHorizontalStepper WizardHorizontalStepper() {
    return new WizardHorizontalStepper();
  }


  @Bean
  @Named("WizardVerticalStepper")
  public WizardVerticalStepper WizardVerticalStepper() {
    return new WizardVerticalStepper();
  }


  @Bean
  @Named("EmptyWizardFooter")
  public EmptyWizardFooter EmptyWizardFooter() {
    return new EmptyWizardFooter();
  }


  @Bean
  @Named("EmptyWizardHeader")
  public EmptyWizardHeader EmptyWizardHeader() {
    return new EmptyWizardHeader();
  }


  @Bean
  @Named("EmptyStepHeader")
  public EmptyStepHeader EmptyStepHeader() {
    return new EmptyStepHeader();
  }


  @Bean
  @Named("FlowContentHeader")
  public ListViewPaneHeader FlowContentHeader() {
    return new ListViewPaneHeader();
  }


  @Bean
  @Named("ListViewPaneHeader")
  public ListViewPaneHeader ListViewPaneHeader() {
    return new ListViewPaneHeader();
  }

  @Bean
  @Named("SimplePaginationBar")
  public SimplePaginationBar SimplePaginationBar() {
    return new SimplePaginationBar();
  }

  @Bean
  @Named("LoadMorePaginationBar")
  public LoadMorePaginationBar LoadMorePaginationBar() {
    return new LoadMorePaginationBar();
  }

  @Bean
  @Named("AudienceSelectorCellFactory")
  public AudienceSelectorCellFactory AudienceSelectorCellFactory() {
    return new AudienceSelectorCellFactory();
  }

  @Bean
  @Named("NoContentPane")
  public NoContentPane NoContentPane() {
    return new NoContentPane();
  }

  @Bean
  @Named("EmptyNoContentPane")
  public EmptyNoContentPane EmptyNoContentPane() {
    return new EmptyNoContentPane();
  }

  @Bean
  @Named("GroupedActionsContentPane")
  public GroupedActionsContentPane GroupedActionsContentPane() {
    return new GroupedActionsContentPane();
  }

  @Bean
  @Named("FormInlineToobar")
  public FormInlineToobar FormInlineToobar() {
    return new FormInlineToobar();
  }

  @Bean
  @Named("BrowserTitlePaneBlocContent")
  public BrowserTitlePaneBlocContent BrowserTitlePaneBlocContent() {
    return new BrowserTitlePaneBlocContent();
  }

  @Bean
  @Named("SingleLocationNavigationBar")
  public SingleLocationNavigationBar SingleLocationNavigationBar() {
    return new SingleLocationNavigationBar();
  }

  @Bean
  @Named("HeaderLessSingleLocationNavigationBar")
  public HeaderLessSingleLocationNavigationBar HeaderLessSingleLocationNavigationBar() {
    return new HeaderLessSingleLocationNavigationBar();
  }

  @Bean
  @Named("MobileWithBottomTabNavigationBar")
  public MobileWithBottomTabNavigationBar MobileWithBottomTabNavigationBar() {
    return new MobileWithBottomTabNavigationBar();
  }

  @Bean
  @Named("SingleLocationPrimaryMenuWithNavigationBar")
  public SingleLocationPrimaryMenuWithNavigationBar SingleLocationPrimaryMenuWithNavigationBar() {
    return new SingleLocationPrimaryMenuWithNavigationBar();
  }

  @Bean
  @Named("NoLocationPrimaryMenuWithNavigationBar")
  public NoLocationPrimaryMenuWithNavigationBar NoLocationPrimaryMenuWithNavigationBar() {
    return new NoLocationPrimaryMenuWithNavigationBar();
  }

  @Bean
  @Named("PrimaryMenuWithNavigationBar")
  public PrimaryMenuWithNavigationBar PrimaryMenuWithNavigationBar() {
    return new PrimaryMenuWithNavigationBar();
  }


  @Bean
  @Named("HeaderRightToolbar")
  public HeaderRightToolbar HeaderRightToolbar() {
    return new HeaderRightToolbar();
  }


  @Bean
  @Named("HeaderCenterToolBar")
  public HeaderCenterToolBar HeaderCenterToolBar() {
    return new HeaderCenterToolBar();
  }

  @Bean
  @Named("HeaderLeftToolBar")
  public HeaderLeftToolBar HeaderLeftToolBar() {
    return new HeaderLeftToolBar();
  }


  @Bean
  @Named("VLTabPane")
  public VLTabpane VLTabPane() {
    return new MobileVLTabpane();
  }

  @Bean
  @Named("MobileVLTabpane")
  public VLTabpane MobileVLTabpane() {
    return new MobileVLTabpane();
  }


  @Bean
  @Named("ScrollLessSinglePaneViewLayoutManager")
  public ScrollLessSinglePaneViewLayoutManager ScrollLessSinglePaneViewLayoutManager() {
    return new ScrollLessSinglePaneViewLayoutManager();
  }



  @Bean
  @Named("TreeContent")
  public TreeContent TreeContent() {
    return new TreeContent();
  }



  @Bean
  @Named("ApplicationVersionValuePresenter")
  public MultiSelectionListFormItemPresenter ApplicationVersionValuePresenter() {
    return new MultiSelectionListFormItemPresenter();
  }


  @Bean
  @Named("DefaultMultiSelectionPreferenceValuePresenter")
  public MultiSelectionListFormItemPresenter defaultMultiSelectionPreferenceValuePresenter() {
    return new MultiSelectionListFormItemPresenter();
  }


  @Bean
  @Named("HEllipsisTableCellPresenter")
  public HEllipsisTableCellPresenter HEllipsisTableCellPresenter() {
    return new HEllipsisTableCellPresenter();
  }


  @Bean
  @Named("ForwardToStructureCellPresenter")
  public com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableContextualActionPresenter ForwardToStructureCellPresenter() {
    return new com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableContextualActionPresenter();
  }


  @Bean
  @Named("DeleteElementTableRowActionPresenter")
  public com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableRowActionPresenter DeleteElementTableRowActionPresenter() {
    return new com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableRowActionPresenter();
  }


  @Bean
  @Named("TableRowActionPresenter")
  public com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableRowActionPresenter TableRowActionPresenter() {
    return new com.nexitia.emaginplatform.jfx.core.engine.components.table.cell.TableRowActionPresenter();
  }


  @Bean
  @Named("ListFormDataLoader")
  public ListFormDataLoader ListFormDataLoader() {
    return new ListFormDataLoader();
  }


  @Bean
  @Named("legalMentionItemPresenter")
  public LegalMentionItemPresenter legalMentionItemPresenter() {
    return new LegalMentionItemPresenter();
  }


  @Bean
  @Named("parentItemPresenter")
  public ParentItemPresenter TreeTableContent() {
    return new ParentItemPresenter();
  }


  @Bean
  @Named("systemUpdatePresenter")
  public SystemUpdateListFormCellPresenter systemUpdatePresenter() {
    return new SystemUpdateListFormCellPresenter();
  }


  @Bean
  @Named("systemVersionPresenter")
  public SystemVersionListFormCellPresenter systemVersionPresenter() {
    return new SystemVersionListFormCellPresenter();
  }


  @Bean
  @Named("applicationVersionDataLoader")
  public ApplicationVersionDataLoader applicationVersionDataLoader() {
    return new ApplicationVersionDataLoader();
  }


  @Bean
  @Named("yesNoItemPresenter")
  public YesNoListFormCellPresenter yesNoItemPresenter() {
    return new YesNoListFormCellPresenter();
  }

  @Bean
  @Named("FormFieldsetHeader")
  public FormFieldsetHeader FormFieldsetHeader() {
    return new FormFieldsetHeader();
  }


  @Bean
  @Named("FormFieldsetContent")
  public FormFieldsetContent FormFieldsetContent() {
    return new FormFieldsetContent();
  }


  @Bean
  @Named("FormFieldset")
  public FormFieldset FormFieldset() {
    return new FormFieldset();
  }



  @Bean
  @Named("DynamicalAttributesFormBlocContent")
  public DynamicalAttributesFormBlocContent DynamicalAttributesFormBlocContent() {
    return new DynamicalAttributesFormBlocContent();
  }



  @Bean
  @Named("FormBlocContent")
  public FormBlocContent FormBlocContent() {
    return new FormBlocContent();
  }



  @Bean
  @Named("FormBlocTitle")
  public FormBlocTitle FormBlocTitle() {
    return new FormBlocTitle();
  }



  @Bean
  @Named("ModelThumbsBlocContent")
  public ModelThumbsBlocContent ModelThumbsBlocContent() {
    return new ModelThumbsBlocContent();
  }



  @Bean
  @Named("ModelVisualisationBlocContent")
  public ModelVisualisationBlocContent ModelVisualisationBlocContent() {
    ModelVisualisationBlocContent c = new ModelVisualisationBlocContent();
    c.afterPropertiesSet();
    c.setWidth(300);
    c.setHeight(300);
    return c;
  }



  @Bean
  @Named("InternalTabsFormBlocContent")
  public InternalTabsFormBlocContent InternalTabsFormBlocContent() {
    return new InternalTabsFormBlocContent();
  }



  @Bean
  @Named("PeopleThumbPresenter")
  public PeopleThumbPresenter PeopleThumbPresenter() {
    return new PeopleThumbPresenter();
  }



  @Bean
  @Named("DialogHeader")
  public DialogHeader DialogHeader() {
    return new DialogHeader();
  }



  @Bean
  @Named("DialogContent")
  public DialogContent DialogContent() {
    return new DialogContent();
  }



  @Bean
  @Named("DialogFooter")
  public DialogFooter DialogFooter() {
    return new DialogFooter();
  }



  @Bean
  @Named("Wizard")
  public Wizard Wizard() {
    return new Wizard();
  }



  @Bean
  @Named("WizardFooter")
  public WizardFooter WizardFooter() {
    return new WizardFooter();
  }



  @Bean
  @Named("LoginWizardFooter")
  public LoginWizardFooter LoginWizardFooter() {
    return new LoginWizardFooter();
  }



  @Bean
  @Named("LoginWizardStepHeader")
  public LoginWizardStepHeader LoginWizardStepHeader() {
    return new LoginWizardStepHeader();
  }



  @Bean
  @Named("WizardHeader")
  public WizardHeader WizardHeader() {
    return new WizardHeader();
  }



  @Bean
  @Named("WizardStep")
  public WizardStep WizardStep() {
    return new WizardStep();
  }



  @Bean
  @Named("WizardStepHeader")
  public WizardStepHeader WizardStepHeader() {
    return new WizardStepHeader();
  }



  @Bean
  @Named("WizardStepFooter")
  public WizardStepFooter WizardStepFooter() {
    return new WizardStepFooter();
  }


  @Bean
  @Named("WizardStepContent")
  public WizardStepContent WizardStepContent() {
    return new WizardStepContent();
  }


  @Bean
  @Named("WizardContent")
  public WizardContent WizardContent() {
    return new WizardContent();
  }


  @Bean
  @Named("LoginWizardFooterToolbar")
  public LoginWizardFooterToolbar LoginWizardFooterToolbar() {
    return new LoginWizardFooterToolbar();
  }


  @Bean
  @Named("FieldsetBottomTabedLayout")
  public FieldsetBottomTabedLayout FieldsetBottomTabedLayout() {
    return new FieldsetBottomTabedLayout();
  }


  @Bean
  @Named("FieldsetTopTabedLayout")
  public FieldsetTopTabedLayout FieldsetTopTabedLayout() {
    return new FieldsetTopTabedLayout();
  }


  @Bean
  @Named("FieldsetVerticalLayout")
  public FieldsetVerticalLayout FieldsetVerticalLayout() {
    return new FieldsetVerticalLayout();
  }



  @Bean
  @Named("FieldsetFlowLayout")
  public FieldsetFlowLayout FieldsetFlowLayout() {
    return new FieldsetFlowLayout();
  }


  @Bean
  @Named("SimpleFieldsetTopTabedLayout")
  public SimpleFieldsetTopTabedLayout SimpleFieldsetTopTabedLayout() {
    return new SimpleFieldsetTopTabedLayout();
  }


  @Bean
  @Named("BasicHToolbar")
  public BasicHToolbar BasicHToolbar() {
    return new BasicHToolbar();
  }


  @Bean
  @Named("ModifiableHToolbar")
  public ModifiableHToolbar ModifiableHToolbar() {
    return new ModifiableHToolbar();
  }


  @Bean
  @Named("DefaultEnumeratedValueLoader")
  public DefaultEnumeratedValueLoader DefaultEnumeratedValueLoader() {
    DefaultEnumeratedValueLoader e = new DefaultEnumeratedValueLoader();
    e.setListvaluesOperation((IOperation) Services.getBean("ListvaluesOperation"));
    return e;
  }

  @Bean
  @Named("LinkableRoleBsLoader")
  public LinkableRoleBsLoader LinkableRoleBsLoader() {
    return new LinkableRoleBsLoader();
  }

  @Bean
  @Named("LinkableRoleBsFromCurrentContextLoader")
  public LinkableRoleBsFromCurrentContextLoader LinkableRoleBsFromCurrentContextLoader() {
    return new LinkableRoleBsFromCurrentContextLoader();
  }

  @Bean
  @Named("MaximizedDetailsView")
  public MaximizedDetailsView MaximizedDetailsView() {
    return new MaximizedDetailsView();
  }

  @Bean
  @Named("LocalDateConverter")
  public LocalDateConverter LocalDateConverter() {
    return new LocalDateConverter();
  }

  @Bean
  @Named("GeneratedValueConverter")
  public GeneratedValueConverter GeneratedValueConverter() {
    return new GeneratedValueConverter();
  }

  @Bean
  @Named("IdenpotentConverter")
  public IdenpotentConverter IdenpotentConverter() {
    return new IdenpotentConverter();
  }

  @Bean
  @Named("EnumeratedValueModelConverter")
  public EnumeratedValueModelConverter EnumeratedValueModelConverter() {
    return new EnumeratedValueModelConverter();
  }

  @Bean
  @Named("StringBooleanConverter")
  public StringBooleanConverter StringBooleanConverter() {
    return new StringBooleanConverter();
  }

  @Bean
  @Named("DefaultEnumeratedValueTranslater")
  public DefaultEnumeratedValueTranslater DefaultEnumeratedValueTranslater() {
    return new DefaultEnumeratedValueTranslater();
  }

  @Bean
  @Named("TableContent")
  public TableContent TableContent() {
    return new TableContent();
  }

  @Bean
  @Named("FlowContent")
  public FlowContent FlowContent() {
    return new FlowContent();
  }

  @Bean
  @Named("FlowTableContent")
  public FlowTableContent FlowTableContent() {
    return new FlowTableContent();
  }

  @Bean
  @Named("AdvancedTableStructureLayoutManager")
  public com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.AdvancedTableStructureLayoutManager AdvancedTableStructureLayoutManager() {
    return new com.nexitia.emaginplatform.jfx.core.engine.components.tablestructure.AdvancedTableStructureLayoutManager();
  }

  @Bean
  @Named("SimpleTableStructureLayoutManager")
  public SimpleTableStructureLayoutManager SimpleTableStructureLayoutManager() {
    return new SimpleTableStructureLayoutManager();
  }

  @Bean
  @Named("TableStructureProcessor")
  public TableStructureProcessor TableStructureProcessor() {
    return new TableStructureProcessor();
  }

  @Bean
  @Named("TableStructuresVBoxProcessor")
  public TableStructuresVBoxProcessor TableStructuresVBoxProcessor() {
    return new TableStructuresVBoxProcessor();
  }

  @Bean
  @Named("TableStructureWithLayoutProcessor")
  public TableStructureWithLayoutProcessor TableStructureWithLayoutProcessor() {
    return new TableStructureWithLayoutProcessor();
  }

  @Bean
  @Named("AccountThumbPresenter")
  public AccountThumbPresenter AccountThumbPresenter() {
    return new AccountThumbPresenter();
  }

  @Bean
  @Named("ModelThumbPresenter")
  public ModelThumbPresenter ModelThumbPresenter() {
    return new ModelThumbPresenter();
  }

  @Bean
  @Named("ModelMimeTypePresenter")
  public ModelMimeTypePresenter ModelMimeTypePresenter() {
    return new ModelMimeTypePresenter();
  }

  @Bean
  @Named("TableRowMimeTypePresenter")
  public TableRowMimeTypePresenter TableRowMimeTypePresenter() {
    return new TableRowMimeTypePresenter();
  }

  @Bean
  @Named("BlankSpacerTableCellPresenter")
  public BlankSpacerTableCellPresenter BlankSpacerTableCellPresenter() {
    return new BlankSpacerTableCellPresenter();
  }

  @Bean
  @Named("SmallItemInitialIconCircle")
  public SmallItemInitialIconCircle SmallItemInitialIconCircle() {
    return new SmallItemInitialIconCircle();
  }

  @Bean
  @Named("ModelAttributePresenter")
  public com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.ModelAttributePresenter ModelAttributePresenter() {
    return new com.nexitia.emaginplatform.jfx.core.engine.components.presenter.impl.ModelAttributePresenter();
  }

  @Bean
  @Named("ModelDateTimePresenter")
  public ModelDateTimePresenter ModelDateTimePresenter() {
    return new ModelDateTimePresenter();
  }

  @Bean
  @Named("GenericModelAttributetoTablePresenter")
  public GenericModelAttributetoTablePresenter GenericModelAttributetoTablePresenter() {
    return new GenericModelAttributetoTablePresenter();
  }

  @Bean
  @Named("SmallMasterNameItemInitialIconCircle")
  public SmallItemInitialIconCircle SmallMasterNameItemInitialIconCircle() {
    SmallItemInitialIconCircle p = new SmallItemInitialIconCircle();
    p.setIdentityPresenter((ModelIdentityPresenter) Services.getBean("RCMasterNameIdentityPresenter"));
    return p;
  }

  @Bean
  @Named("SearchFiltersBlocTitle")
  public SearchFiltersBlocTitle SearchFiltersBlocTitle() {
    return new SearchFiltersBlocTitle();
  }

  @Bean
  @Named("EditStructureTableHeaderImpl")
  public EditStructureTableHeaderImpl EditStructureTableHeaderImpl() {
    return new EditStructureTableHeaderImpl();
  }


  @Bean
  @Named("SimpleSearchForwardEditorFooter")
  public SimpleSearchForwardEditorFooter SimpleSearchForwardEditorFooter() {
    return new SimpleSearchForwardEditorFooter();
  }

  @Bean
  @Named("BasicTableHeaderImpl")
  public IListViewPaneHeader BasicTableHeaderImpl() {
    return new BasicTableHeaderImpl();
  }

  @Bean
  @Named("FiltrableTableHeaderImpl")
  public IListViewPaneHeader FiltrableTableHeaderImpl() {
    return new FiltrableTableHeaderImpl();
  }

  @Bean
  @Named("FiltrableTableHeaderImpl2")
  public IListViewPaneHeader FiltrableTableHeaderImpl2() {
    return new FiltrableTableHeaderImpl2();
  }

  @Bean
  @Named("FolderNavigatorTableHeader")
  public IListViewPaneHeader FolderNavigatorTableHeader() {
    return new StructureNavigatorTableHeaderImpl();
  }


  @Bean
  @Named("GenericEntityPaginatedDataLoader")
  public GenericEntityPaginatedDataLoader GenericEntityPaginatedDataLoader() {
    return new GenericEntityPaginatedDataLoader();
  }

  @Bean
  @Named("DefaultEntityPaginatedDataLoader")
  public DefaultEntityPaginatedDataLoader DefaultEntityPaginatedDataLoader() {
    return new DefaultEntityPaginatedDataLoader();
  }

  @Bean
  @Named("DefaultLinkPaginatedDataLoader")
  public DefaultLinkPaginatedDataLoader DefaultLinkPaginatedDataLoader() {
    return new DefaultLinkPaginatedDataLoader();
  }

  @Bean
  @Named("ListViewContent")
  public ListViewContent ListViewContent() {
    return new ListViewContent();
  }

  @Bean
  @Named("PushToViewAction")
  public PushToViewAction PushToViewAction() {
    return new PushToViewAction();
  }

  @Bean
  @Named("DoActionPresenter")
  public DoActionPresenter DoActionPresenter() {
    DoActionPresenter p = new DoActionPresenter();
    return p;
  }

  @Bean
  @Named("StructureContentModelReference")
  public IModelProvider StructureContentModelReference() {
    StructureContentModelReference p = new StructureContentModelReference();
    return p;
  }

  @Bean
  @Named("BooleanListFormCellFactory")
  public BooleanListFormCellFactory BooleanListFormCellFactory() {
    BooleanListFormCellFactory p = new BooleanListFormCellFactory();
    return p;
  }

  @Bean
  @Named("ExpandPrimaryMenuAction")
  public IAction ExpandPrimaryMenuAction() {
    return new ExpandPrimaryMenuAction();
  }

  @Bean
  @Named("ModelDescriptionPresenter")
  public ModelDescriptionPresenter ModelDescriptionPresenter() {
    ModelDescriptionPresenter p = new ModelDescriptionPresenter();
    return p;
  }

  @Bean
  @Named("SetRootViewEventAction")
  public SetRootViewEventAction SetRootViewEventAction() {
    SetRootViewEventAction p = new SetRootViewEventAction();
    return p;
  }

  @Bean
  @Named("AdminStaticIconPresenter")
  public static ModelIconPresenter AdminStaticIconPresenter() {
    AdminStaticIconPresenter p = new AdminStaticIconPresenter();
    return  p;
  }

}
