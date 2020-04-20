/*
 * 
 */
package pythonpipeline.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.diagram.edit.parts.AgglomerativeEditPart;
import pythonpipeline.diagram.edit.parts.AndClause2EditPart;
import pythonpipeline.diagram.edit.parts.AndClause3EditPart;
import pythonpipeline.diagram.edit.parts.AndClauseEditPart;
import pythonpipeline.diagram.edit.parts.AttributeEditPart;
import pythonpipeline.diagram.edit.parts.ChangeDataFormatEditPart;
import pythonpipeline.diagram.edit.parts.ContainsClause2EditPart;
import pythonpipeline.diagram.edit.parts.ContainsClause3EditPart;
import pythonpipeline.diagram.edit.parts.ContainsClauseEditPart;
import pythonpipeline.diagram.edit.parts.CustomCleaningEditPart;
import pythonpipeline.diagram.edit.parts.CustomParamEditPart;
import pythonpipeline.diagram.edit.parts.DBSCANEditPart;
import pythonpipeline.diagram.edit.parts.DataCollectionEditPart;
import pythonpipeline.diagram.edit.parts.DataFlowEditPart;
import pythonpipeline.diagram.edit.parts.DataIntegrationEditPart;
import pythonpipeline.diagram.edit.parts.EqClause2EditPart;
import pythonpipeline.diagram.edit.parts.EqClause3EditPart;
import pythonpipeline.diagram.edit.parts.EqClauseEditPart;
import pythonpipeline.diagram.edit.parts.ExportEditPart;
import pythonpipeline.diagram.edit.parts.ExportWritesEditPart;
import pythonpipeline.diagram.edit.parts.GeClause2EditPart;
import pythonpipeline.diagram.edit.parts.GeClause3EditPart;
import pythonpipeline.diagram.edit.parts.GeClauseEditPart;
import pythonpipeline.diagram.edit.parts.GtClause2EditPart;
import pythonpipeline.diagram.edit.parts.GtClause3EditPart;
import pythonpipeline.diagram.edit.parts.GtClauseEditPart;
import pythonpipeline.diagram.edit.parts.HistogramEditPart;
import pythonpipeline.diagram.edit.parts.InputSourceDeclarationEditPart;
import pythonpipeline.diagram.edit.parts.InputSourceDeclarationSourceSchemaEditPart;
import pythonpipeline.diagram.edit.parts.JoinAttributesListEditPart;
import pythonpipeline.diagram.edit.parts.KMeansEditPart;
import pythonpipeline.diagram.edit.parts.LabeledScatterPlotEditPart;
import pythonpipeline.diagram.edit.parts.LassoEditPart;
import pythonpipeline.diagram.edit.parts.LeClause2EditPart;
import pythonpipeline.diagram.edit.parts.LeClause3EditPart;
import pythonpipeline.diagram.edit.parts.LeClauseEditPart;
import pythonpipeline.diagram.edit.parts.LinearRegressionEditPart;
import pythonpipeline.diagram.edit.parts.LogisticRegressionEditPart;
import pythonpipeline.diagram.edit.parts.LtClause2EditPart;
import pythonpipeline.diagram.edit.parts.LtClause3EditPart;
import pythonpipeline.diagram.edit.parts.LtClauseEditPart;
import pythonpipeline.diagram.edit.parts.MeanEditPart;
import pythonpipeline.diagram.edit.parts.MedianEditPart;
import pythonpipeline.diagram.edit.parts.NotClause2EditPart;
import pythonpipeline.diagram.edit.parts.NotClause3EditPart;
import pythonpipeline.diagram.edit.parts.NotClauseEditPart;
import pythonpipeline.diagram.edit.parts.NullValuesRemovalEditPart;
import pythonpipeline.diagram.edit.parts.OrClause2EditPart;
import pythonpipeline.diagram.edit.parts.OrClause3EditPart;
import pythonpipeline.diagram.edit.parts.OrClauseEditPart;
import pythonpipeline.diagram.edit.parts.OutputFileEditPart;
import pythonpipeline.diagram.edit.parts.PiePlotEditPart;
import pythonpipeline.diagram.edit.parts.PipelineEditPart;
import pythonpipeline.diagram.edit.parts.PrimaryKeyCopiesEditPart;
import pythonpipeline.diagram.edit.parts.PrimaryKeyEditPart;
import pythonpipeline.diagram.edit.parts.ProjectOnAttributesEditPart;
import pythonpipeline.diagram.edit.parts.QueryParamEditPart;
import pythonpipeline.diagram.edit.parts.RidgeEditPart;
import pythonpipeline.diagram.edit.parts.RuntimeInfoEditPart;
import pythonpipeline.diagram.edit.parts.SVMEditPart;
import pythonpipeline.diagram.edit.parts.ScatterPlotEditPart;
import pythonpipeline.diagram.edit.parts.SchemaEditPart;
import pythonpipeline.diagram.edit.parts.SkewnessEditPart;
import pythonpipeline.diagram.edit.parts.StandardDeviationEditPart;
import pythonpipeline.diagram.edit.parts.SupportVectorEditPart;
import pythonpipeline.diagram.edit.parts.TaskInputSchemaEditPart;
import pythonpipeline.diagram.edit.parts.TaskOutputSchemaEditPart;
import pythonpipeline.diagram.part.PythonpipelineDiagramEditorPlugin;

/**
 * @generated
 */
public class PythonpipelineElementTypes {

	/**
	* @generated
	*/
	private PythonpipelineElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PythonpipelineDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Pipeline_1000 = getElementType("aseprojectrecupero.diagram.Pipeline_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Agglomerative_2001 = getElementType(
			"aseprojectrecupero.diagram.Agglomerative_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ridge_2002 = getElementType("aseprojectrecupero.diagram.Ridge_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Lasso_2003 = getElementType("aseprojectrecupero.diagram.Lasso_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SVM_2004 = getElementType("aseprojectrecupero.diagram.SVM_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType KMeans_2005 = getElementType("aseprojectrecupero.diagram.KMeans_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DBSCAN_2006 = getElementType("aseprojectrecupero.diagram.DBSCAN_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinearRegression_2007 = getElementType(
			"aseprojectrecupero.diagram.LinearRegression_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Mean_2008 = getElementType("aseprojectrecupero.diagram.Mean_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Median_2009 = getElementType("aseprojectrecupero.diagram.Median_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StandardDeviation_2010 = getElementType(
			"aseprojectrecupero.diagram.StandardDeviation_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LogisticRegression_2011 = getElementType(
			"aseprojectrecupero.diagram.LogisticRegression_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Skewness_2012 = getElementType("aseprojectrecupero.diagram.Skewness_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LabeledScatterPlot_2013 = getElementType(
			"aseprojectrecupero.diagram.LabeledScatterPlot_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullValuesRemoval_2014 = getElementType(
			"aseprojectrecupero.diagram.NullValuesRemoval_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CustomCleaning_2015 = getElementType(
			"aseprojectrecupero.diagram.CustomCleaning_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ChangeDataFormat_2016 = getElementType(
			"aseprojectrecupero.diagram.ChangeDataFormat_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ScatterPlot_2017 = getElementType("aseprojectrecupero.diagram.ScatterPlot_2017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Histogram_2018 = getElementType("aseprojectrecupero.diagram.Histogram_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PiePlot_2019 = getElementType("aseprojectrecupero.diagram.PiePlot_2019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProjectOnAttributes_2020 = getElementType(
			"aseprojectrecupero.diagram.ProjectOnAttributes_2020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataCollection_2021 = getElementType(
			"aseprojectrecupero.diagram.DataCollection_2021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataIntegration_2022 = getElementType(
			"aseprojectrecupero.diagram.DataIntegration_2022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_2023 = getElementType("aseprojectrecupero.diagram.Export_2023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Schema_2024 = getElementType("aseprojectrecupero.diagram.Schema_2024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputFile_2025 = getElementType("aseprojectrecupero.diagram.OutputFile_2025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RuntimeInfo_3001 = getElementType("aseprojectrecupero.diagram.RuntimeInfo_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupportVector_3035 = getElementType(
			"aseprojectrecupero.diagram.SupportVector_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CustomParam_3002 = getElementType("aseprojectrecupero.diagram.CustomParam_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputSourceDeclaration_3003 = getElementType(
			"aseprojectrecupero.diagram.InputSourceDeclaration_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AndClause_3004 = getElementType("aseprojectrecupero.diagram.AndClause_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AndClause_3005 = getElementType("aseprojectrecupero.diagram.AndClause_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrClause_3006 = getElementType("aseprojectrecupero.diagram.OrClause_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LtClause_3007 = getElementType("aseprojectrecupero.diagram.LtClause_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QueryParam_3008 = getElementType("aseprojectrecupero.diagram.QueryParam_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GtClause_3009 = getElementType("aseprojectrecupero.diagram.GtClause_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqClause_3010 = getElementType("aseprojectrecupero.diagram.EqClause_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeClause_3011 = getElementType("aseprojectrecupero.diagram.LeClause_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeClause_3012 = getElementType("aseprojectrecupero.diagram.GeClause_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainsClause_3013 = getElementType(
			"aseprojectrecupero.diagram.ContainsClause_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NotClause_3014 = getElementType("aseprojectrecupero.diagram.NotClause_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AndClause_3015 = getElementType("aseprojectrecupero.diagram.AndClause_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrClause_3016 = getElementType("aseprojectrecupero.diagram.OrClause_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LtClause_3017 = getElementType("aseprojectrecupero.diagram.LtClause_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GtClause_3018 = getElementType("aseprojectrecupero.diagram.GtClause_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqClause_3019 = getElementType("aseprojectrecupero.diagram.EqClause_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeClause_3020 = getElementType("aseprojectrecupero.diagram.LeClause_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeClause_3021 = getElementType("aseprojectrecupero.diagram.GeClause_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainsClause_3022 = getElementType(
			"aseprojectrecupero.diagram.ContainsClause_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NotClause_3023 = getElementType("aseprojectrecupero.diagram.NotClause_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrClause_3024 = getElementType("aseprojectrecupero.diagram.OrClause_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LtClause_3025 = getElementType("aseprojectrecupero.diagram.LtClause_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GtClause_3026 = getElementType("aseprojectrecupero.diagram.GtClause_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqClause_3027 = getElementType("aseprojectrecupero.diagram.EqClause_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeClause_3028 = getElementType("aseprojectrecupero.diagram.LeClause_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeClause_3029 = getElementType("aseprojectrecupero.diagram.GeClause_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainsClause_3030 = getElementType(
			"aseprojectrecupero.diagram.ContainsClause_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NotClause_3031 = getElementType("aseprojectrecupero.diagram.NotClause_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinAttributesList_3032 = getElementType(
			"aseprojectrecupero.diagram.JoinAttributesList_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3033 = getElementType("aseprojectrecupero.diagram.Attribute_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrimaryKey_3034 = getElementType("aseprojectrecupero.diagram.PrimaryKey_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFlow_4001 = getElementType("aseprojectrecupero.diagram.DataFlow_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TaskInputSchema_4002 = getElementType(
			"aseprojectrecupero.diagram.TaskInputSchema_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TaskOutputSchema_4003 = getElementType(
			"aseprojectrecupero.diagram.TaskOutputSchema_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportWrites_4004 = getElementType("aseprojectrecupero.diagram.ExportWrites_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputSourceDeclarationSourceSchema_4005 = getElementType(
			"aseprojectrecupero.diagram.InputSourceDeclarationSourceSchema_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrimaryKeyCopies_4006 = getElementType(
			"aseprojectrecupero.diagram.PrimaryKeyCopies_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Pipeline_1000, PythonpipelinePackage.eINSTANCE.getPipeline());

			elements.put(Agglomerative_2001, PythonpipelinePackage.eINSTANCE.getAgglomerative());

			elements.put(Ridge_2002, PythonpipelinePackage.eINSTANCE.getRidge());

			elements.put(Lasso_2003, PythonpipelinePackage.eINSTANCE.getLasso());

			elements.put(SVM_2004, PythonpipelinePackage.eINSTANCE.getSVM());

			elements.put(KMeans_2005, PythonpipelinePackage.eINSTANCE.getKMeans());

			elements.put(DBSCAN_2006, PythonpipelinePackage.eINSTANCE.getDBSCAN());

			elements.put(LinearRegression_2007, PythonpipelinePackage.eINSTANCE.getLinearRegression());

			elements.put(Mean_2008, PythonpipelinePackage.eINSTANCE.getMean());

			elements.put(Median_2009, PythonpipelinePackage.eINSTANCE.getMedian());

			elements.put(StandardDeviation_2010, PythonpipelinePackage.eINSTANCE.getStandardDeviation());

			elements.put(LogisticRegression_2011, PythonpipelinePackage.eINSTANCE.getLogisticRegression());

			elements.put(Skewness_2012, PythonpipelinePackage.eINSTANCE.getSkewness());

			elements.put(LabeledScatterPlot_2013, PythonpipelinePackage.eINSTANCE.getLabeledScatterPlot());

			elements.put(NullValuesRemoval_2014, PythonpipelinePackage.eINSTANCE.getNullValuesRemoval());

			elements.put(CustomCleaning_2015, PythonpipelinePackage.eINSTANCE.getCustomCleaning());

			elements.put(ChangeDataFormat_2016, PythonpipelinePackage.eINSTANCE.getChangeDataFormat());

			elements.put(ScatterPlot_2017, PythonpipelinePackage.eINSTANCE.getScatterPlot());

			elements.put(Histogram_2018, PythonpipelinePackage.eINSTANCE.getHistogram());

			elements.put(PiePlot_2019, PythonpipelinePackage.eINSTANCE.getPiePlot());

			elements.put(ProjectOnAttributes_2020, PythonpipelinePackage.eINSTANCE.getProjectOnAttributes());

			elements.put(DataCollection_2021, PythonpipelinePackage.eINSTANCE.getDataCollection());

			elements.put(DataIntegration_2022, PythonpipelinePackage.eINSTANCE.getDataIntegration());

			elements.put(Export_2023, PythonpipelinePackage.eINSTANCE.getExport());

			elements.put(Schema_2024, PythonpipelinePackage.eINSTANCE.getSchema());

			elements.put(OutputFile_2025, PythonpipelinePackage.eINSTANCE.getOutputFile());

			elements.put(RuntimeInfo_3001, PythonpipelinePackage.eINSTANCE.getRuntimeInfo());

			elements.put(SupportVector_3035, PythonpipelinePackage.eINSTANCE.getSupportVector());

			elements.put(CustomParam_3002, PythonpipelinePackage.eINSTANCE.getCustomParam());

			elements.put(InputSourceDeclaration_3003, PythonpipelinePackage.eINSTANCE.getInputSourceDeclaration());

			elements.put(AndClause_3004, PythonpipelinePackage.eINSTANCE.getAndClause());

			elements.put(AndClause_3005, PythonpipelinePackage.eINSTANCE.getAndClause());

			elements.put(OrClause_3006, PythonpipelinePackage.eINSTANCE.getOrClause());

			elements.put(LtClause_3007, PythonpipelinePackage.eINSTANCE.getLtClause());

			elements.put(QueryParam_3008, PythonpipelinePackage.eINSTANCE.getQueryParam());

			elements.put(GtClause_3009, PythonpipelinePackage.eINSTANCE.getGtClause());

			elements.put(EqClause_3010, PythonpipelinePackage.eINSTANCE.getEqClause());

			elements.put(LeClause_3011, PythonpipelinePackage.eINSTANCE.getLeClause());

			elements.put(GeClause_3012, PythonpipelinePackage.eINSTANCE.getGeClause());

			elements.put(ContainsClause_3013, PythonpipelinePackage.eINSTANCE.getContainsClause());

			elements.put(NotClause_3014, PythonpipelinePackage.eINSTANCE.getNotClause());

			elements.put(AndClause_3015, PythonpipelinePackage.eINSTANCE.getAndClause());

			elements.put(OrClause_3016, PythonpipelinePackage.eINSTANCE.getOrClause());

			elements.put(LtClause_3017, PythonpipelinePackage.eINSTANCE.getLtClause());

			elements.put(GtClause_3018, PythonpipelinePackage.eINSTANCE.getGtClause());

			elements.put(EqClause_3019, PythonpipelinePackage.eINSTANCE.getEqClause());

			elements.put(LeClause_3020, PythonpipelinePackage.eINSTANCE.getLeClause());

			elements.put(GeClause_3021, PythonpipelinePackage.eINSTANCE.getGeClause());

			elements.put(ContainsClause_3022, PythonpipelinePackage.eINSTANCE.getContainsClause());

			elements.put(NotClause_3023, PythonpipelinePackage.eINSTANCE.getNotClause());

			elements.put(OrClause_3024, PythonpipelinePackage.eINSTANCE.getOrClause());

			elements.put(LtClause_3025, PythonpipelinePackage.eINSTANCE.getLtClause());

			elements.put(GtClause_3026, PythonpipelinePackage.eINSTANCE.getGtClause());

			elements.put(EqClause_3027, PythonpipelinePackage.eINSTANCE.getEqClause());

			elements.put(LeClause_3028, PythonpipelinePackage.eINSTANCE.getLeClause());

			elements.put(GeClause_3029, PythonpipelinePackage.eINSTANCE.getGeClause());

			elements.put(ContainsClause_3030, PythonpipelinePackage.eINSTANCE.getContainsClause());

			elements.put(NotClause_3031, PythonpipelinePackage.eINSTANCE.getNotClause());

			elements.put(JoinAttributesList_3032, PythonpipelinePackage.eINSTANCE.getJoinAttributesList());

			elements.put(Attribute_3033, PythonpipelinePackage.eINSTANCE.getAttribute());

			elements.put(PrimaryKey_3034, PythonpipelinePackage.eINSTANCE.getPrimaryKey());

			elements.put(DataFlow_4001, PythonpipelinePackage.eINSTANCE.getDataFlow());

			elements.put(TaskInputSchema_4002, PythonpipelinePackage.eINSTANCE.getTask_InputSchema());

			elements.put(TaskOutputSchema_4003, PythonpipelinePackage.eINSTANCE.getTask_OutputSchema());

			elements.put(ExportWrites_4004, PythonpipelinePackage.eINSTANCE.getExport_Writes());

			elements.put(InputSourceDeclarationSourceSchema_4005,
					PythonpipelinePackage.eINSTANCE.getInputSourceDeclaration_SourceSchema());

			elements.put(PrimaryKeyCopies_4006, PythonpipelinePackage.eINSTANCE.getPrimaryKey_Copies());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Pipeline_1000);
			KNOWN_ELEMENT_TYPES.add(Agglomerative_2001);
			KNOWN_ELEMENT_TYPES.add(Ridge_2002);
			KNOWN_ELEMENT_TYPES.add(Lasso_2003);
			KNOWN_ELEMENT_TYPES.add(SVM_2004);
			KNOWN_ELEMENT_TYPES.add(KMeans_2005);
			KNOWN_ELEMENT_TYPES.add(DBSCAN_2006);
			KNOWN_ELEMENT_TYPES.add(LinearRegression_2007);
			KNOWN_ELEMENT_TYPES.add(Mean_2008);
			KNOWN_ELEMENT_TYPES.add(Median_2009);
			KNOWN_ELEMENT_TYPES.add(StandardDeviation_2010);
			KNOWN_ELEMENT_TYPES.add(LogisticRegression_2011);
			KNOWN_ELEMENT_TYPES.add(Skewness_2012);
			KNOWN_ELEMENT_TYPES.add(LabeledScatterPlot_2013);
			KNOWN_ELEMENT_TYPES.add(NullValuesRemoval_2014);
			KNOWN_ELEMENT_TYPES.add(CustomCleaning_2015);
			KNOWN_ELEMENT_TYPES.add(ChangeDataFormat_2016);
			KNOWN_ELEMENT_TYPES.add(ScatterPlot_2017);
			KNOWN_ELEMENT_TYPES.add(Histogram_2018);
			KNOWN_ELEMENT_TYPES.add(PiePlot_2019);
			KNOWN_ELEMENT_TYPES.add(ProjectOnAttributes_2020);
			KNOWN_ELEMENT_TYPES.add(DataCollection_2021);
			KNOWN_ELEMENT_TYPES.add(DataIntegration_2022);
			KNOWN_ELEMENT_TYPES.add(Export_2023);
			KNOWN_ELEMENT_TYPES.add(Schema_2024);
			KNOWN_ELEMENT_TYPES.add(OutputFile_2025);
			KNOWN_ELEMENT_TYPES.add(RuntimeInfo_3001);
			KNOWN_ELEMENT_TYPES.add(SupportVector_3035);
			KNOWN_ELEMENT_TYPES.add(CustomParam_3002);
			KNOWN_ELEMENT_TYPES.add(InputSourceDeclaration_3003);
			KNOWN_ELEMENT_TYPES.add(AndClause_3004);
			KNOWN_ELEMENT_TYPES.add(AndClause_3005);
			KNOWN_ELEMENT_TYPES.add(OrClause_3006);
			KNOWN_ELEMENT_TYPES.add(LtClause_3007);
			KNOWN_ELEMENT_TYPES.add(QueryParam_3008);
			KNOWN_ELEMENT_TYPES.add(GtClause_3009);
			KNOWN_ELEMENT_TYPES.add(EqClause_3010);
			KNOWN_ELEMENT_TYPES.add(LeClause_3011);
			KNOWN_ELEMENT_TYPES.add(GeClause_3012);
			KNOWN_ELEMENT_TYPES.add(ContainsClause_3013);
			KNOWN_ELEMENT_TYPES.add(NotClause_3014);
			KNOWN_ELEMENT_TYPES.add(AndClause_3015);
			KNOWN_ELEMENT_TYPES.add(OrClause_3016);
			KNOWN_ELEMENT_TYPES.add(LtClause_3017);
			KNOWN_ELEMENT_TYPES.add(GtClause_3018);
			KNOWN_ELEMENT_TYPES.add(EqClause_3019);
			KNOWN_ELEMENT_TYPES.add(LeClause_3020);
			KNOWN_ELEMENT_TYPES.add(GeClause_3021);
			KNOWN_ELEMENT_TYPES.add(ContainsClause_3022);
			KNOWN_ELEMENT_TYPES.add(NotClause_3023);
			KNOWN_ELEMENT_TYPES.add(OrClause_3024);
			KNOWN_ELEMENT_TYPES.add(LtClause_3025);
			KNOWN_ELEMENT_TYPES.add(GtClause_3026);
			KNOWN_ELEMENT_TYPES.add(EqClause_3027);
			KNOWN_ELEMENT_TYPES.add(LeClause_3028);
			KNOWN_ELEMENT_TYPES.add(GeClause_3029);
			KNOWN_ELEMENT_TYPES.add(ContainsClause_3030);
			KNOWN_ELEMENT_TYPES.add(NotClause_3031);
			KNOWN_ELEMENT_TYPES.add(JoinAttributesList_3032);
			KNOWN_ELEMENT_TYPES.add(Attribute_3033);
			KNOWN_ELEMENT_TYPES.add(PrimaryKey_3034);
			KNOWN_ELEMENT_TYPES.add(DataFlow_4001);
			KNOWN_ELEMENT_TYPES.add(TaskInputSchema_4002);
			KNOWN_ELEMENT_TYPES.add(TaskOutputSchema_4003);
			KNOWN_ELEMENT_TYPES.add(ExportWrites_4004);
			KNOWN_ELEMENT_TYPES.add(InputSourceDeclarationSourceSchema_4005);
			KNOWN_ELEMENT_TYPES.add(PrimaryKeyCopies_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PipelineEditPart.VISUAL_ID:
			return Pipeline_1000;
		case AgglomerativeEditPart.VISUAL_ID:
			return Agglomerative_2001;
		case RidgeEditPart.VISUAL_ID:
			return Ridge_2002;
		case LassoEditPart.VISUAL_ID:
			return Lasso_2003;
		case SVMEditPart.VISUAL_ID:
			return SVM_2004;
		case KMeansEditPart.VISUAL_ID:
			return KMeans_2005;
		case DBSCANEditPart.VISUAL_ID:
			return DBSCAN_2006;
		case LinearRegressionEditPart.VISUAL_ID:
			return LinearRegression_2007;
		case MeanEditPart.VISUAL_ID:
			return Mean_2008;
		case MedianEditPart.VISUAL_ID:
			return Median_2009;
		case StandardDeviationEditPart.VISUAL_ID:
			return StandardDeviation_2010;
		case LogisticRegressionEditPart.VISUAL_ID:
			return LogisticRegression_2011;
		case SkewnessEditPart.VISUAL_ID:
			return Skewness_2012;
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return LabeledScatterPlot_2013;
		case NullValuesRemovalEditPart.VISUAL_ID:
			return NullValuesRemoval_2014;
		case CustomCleaningEditPart.VISUAL_ID:
			return CustomCleaning_2015;
		case ChangeDataFormatEditPart.VISUAL_ID:
			return ChangeDataFormat_2016;
		case ScatterPlotEditPart.VISUAL_ID:
			return ScatterPlot_2017;
		case HistogramEditPart.VISUAL_ID:
			return Histogram_2018;
		case PiePlotEditPart.VISUAL_ID:
			return PiePlot_2019;
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return ProjectOnAttributes_2020;
		case DataCollectionEditPart.VISUAL_ID:
			return DataCollection_2021;
		case DataIntegrationEditPart.VISUAL_ID:
			return DataIntegration_2022;
		case ExportEditPart.VISUAL_ID:
			return Export_2023;
		case SchemaEditPart.VISUAL_ID:
			return Schema_2024;
		case OutputFileEditPart.VISUAL_ID:
			return OutputFile_2025;
		case RuntimeInfoEditPart.VISUAL_ID:
			return RuntimeInfo_3001;
		case SupportVectorEditPart.VISUAL_ID:
			return SupportVector_3035;
		case CustomParamEditPart.VISUAL_ID:
			return CustomParam_3002;
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return InputSourceDeclaration_3003;
		case AndClauseEditPart.VISUAL_ID:
			return AndClause_3004;
		case AndClause2EditPart.VISUAL_ID:
			return AndClause_3005;
		case OrClauseEditPart.VISUAL_ID:
			return OrClause_3006;
		case LtClauseEditPart.VISUAL_ID:
			return LtClause_3007;
		case QueryParamEditPart.VISUAL_ID:
			return QueryParam_3008;
		case GtClauseEditPart.VISUAL_ID:
			return GtClause_3009;
		case EqClauseEditPart.VISUAL_ID:
			return EqClause_3010;
		case LeClauseEditPart.VISUAL_ID:
			return LeClause_3011;
		case GeClauseEditPart.VISUAL_ID:
			return GeClause_3012;
		case ContainsClauseEditPart.VISUAL_ID:
			return ContainsClause_3013;
		case NotClauseEditPart.VISUAL_ID:
			return NotClause_3014;
		case AndClause3EditPart.VISUAL_ID:
			return AndClause_3015;
		case OrClause2EditPart.VISUAL_ID:
			return OrClause_3016;
		case LtClause2EditPart.VISUAL_ID:
			return LtClause_3017;
		case GtClause2EditPart.VISUAL_ID:
			return GtClause_3018;
		case EqClause2EditPart.VISUAL_ID:
			return EqClause_3019;
		case LeClause2EditPart.VISUAL_ID:
			return LeClause_3020;
		case GeClause2EditPart.VISUAL_ID:
			return GeClause_3021;
		case ContainsClause2EditPart.VISUAL_ID:
			return ContainsClause_3022;
		case NotClause2EditPart.VISUAL_ID:
			return NotClause_3023;
		case OrClause3EditPart.VISUAL_ID:
			return OrClause_3024;
		case LtClause3EditPart.VISUAL_ID:
			return LtClause_3025;
		case GtClause3EditPart.VISUAL_ID:
			return GtClause_3026;
		case EqClause3EditPart.VISUAL_ID:
			return EqClause_3027;
		case LeClause3EditPart.VISUAL_ID:
			return LeClause_3028;
		case GeClause3EditPart.VISUAL_ID:
			return GeClause_3029;
		case ContainsClause3EditPart.VISUAL_ID:
			return ContainsClause_3030;
		case NotClause3EditPart.VISUAL_ID:
			return NotClause_3031;
		case JoinAttributesListEditPart.VISUAL_ID:
			return JoinAttributesList_3032;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3033;
		case PrimaryKeyEditPart.VISUAL_ID:
			return PrimaryKey_3034;
		case DataFlowEditPart.VISUAL_ID:
			return DataFlow_4001;
		case TaskInputSchemaEditPart.VISUAL_ID:
			return TaskInputSchema_4002;
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return TaskOutputSchema_4003;
		case ExportWritesEditPart.VISUAL_ID:
			return ExportWrites_4004;
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return InputSourceDeclarationSourceSchema_4005;
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return PrimaryKeyCopies_4006;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return pythonpipeline.diagram.providers.PythonpipelineElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return pythonpipeline.diagram.providers.PythonpipelineElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return pythonpipeline.diagram.providers.PythonpipelineElementTypes.getElement(elementTypeAdapter);
		}
	};

}
