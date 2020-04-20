/*
 * 
 */
package pipelineproject.diagram.providers;

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

import pipelineproject.PipelineprojectPackage;
import pipelineproject.diagram.edit.parts.AgglomerativeEditPart;
import pipelineproject.diagram.edit.parts.AndClause2EditPart;
import pipelineproject.diagram.edit.parts.AndClause3EditPart;
import pipelineproject.diagram.edit.parts.AndClauseEditPart;
import pipelineproject.diagram.edit.parts.AttributeEditPart;
import pipelineproject.diagram.edit.parts.ChangeDataFormatEditPart;
import pipelineproject.diagram.edit.parts.ContainsClause2EditPart;
import pipelineproject.diagram.edit.parts.ContainsClause3EditPart;
import pipelineproject.diagram.edit.parts.ContainsClauseEditPart;
import pipelineproject.diagram.edit.parts.CustomCleaningEditPart;
import pipelineproject.diagram.edit.parts.CustomParamEditPart;
import pipelineproject.diagram.edit.parts.DBSCANEditPart;
import pipelineproject.diagram.edit.parts.DataCollectionEditPart;
import pipelineproject.diagram.edit.parts.DataFlowEditPart;
import pipelineproject.diagram.edit.parts.DataIntegrationEditPart;
import pipelineproject.diagram.edit.parts.EqClause2EditPart;
import pipelineproject.diagram.edit.parts.EqClause3EditPart;
import pipelineproject.diagram.edit.parts.EqClauseEditPart;
import pipelineproject.diagram.edit.parts.ExportEditPart;
import pipelineproject.diagram.edit.parts.ExportWritesEditPart;
import pipelineproject.diagram.edit.parts.GeClause2EditPart;
import pipelineproject.diagram.edit.parts.GeClause3EditPart;
import pipelineproject.diagram.edit.parts.GeClauseEditPart;
import pipelineproject.diagram.edit.parts.GtClause2EditPart;
import pipelineproject.diagram.edit.parts.GtClause3EditPart;
import pipelineproject.diagram.edit.parts.GtClauseEditPart;
import pipelineproject.diagram.edit.parts.HistogramEditPart;
import pipelineproject.diagram.edit.parts.InputSourceDeclarationEditPart;
import pipelineproject.diagram.edit.parts.InputSourceDeclarationSourceSchemaEditPart;
import pipelineproject.diagram.edit.parts.JarvisPatrickEditPart;
import pipelineproject.diagram.edit.parts.JoinAttributesListEditPart;
import pipelineproject.diagram.edit.parts.KMeansEditPart;
import pipelineproject.diagram.edit.parts.KNNEditPart;
import pipelineproject.diagram.edit.parts.LabeledScatterPlotEditPart;
import pipelineproject.diagram.edit.parts.LassoEditPart;
import pipelineproject.diagram.edit.parts.LeClause2EditPart;
import pipelineproject.diagram.edit.parts.LeClause3EditPart;
import pipelineproject.diagram.edit.parts.LeClauseEditPart;
import pipelineproject.diagram.edit.parts.LinearRegressionEditPart;
import pipelineproject.diagram.edit.parts.LogisticRegressionEditPart;
import pipelineproject.diagram.edit.parts.LtClause2EditPart;
import pipelineproject.diagram.edit.parts.LtClause3EditPart;
import pipelineproject.diagram.edit.parts.LtClauseEditPart;
import pipelineproject.diagram.edit.parts.MeanEditPart;
import pipelineproject.diagram.edit.parts.MedianEditPart;
import pipelineproject.diagram.edit.parts.NotClause2EditPart;
import pipelineproject.diagram.edit.parts.NotClause3EditPart;
import pipelineproject.diagram.edit.parts.NotClauseEditPart;
import pipelineproject.diagram.edit.parts.NullValuesRemovalEditPart;
import pipelineproject.diagram.edit.parts.OrClause2EditPart;
import pipelineproject.diagram.edit.parts.OrClause3EditPart;
import pipelineproject.diagram.edit.parts.OrClauseEditPart;
import pipelineproject.diagram.edit.parts.OutputFileEditPart;
import pipelineproject.diagram.edit.parts.PiePlotEditPart;
import pipelineproject.diagram.edit.parts.PipelineEditPart;
import pipelineproject.diagram.edit.parts.PrimaryKeyCopiesEditPart;
import pipelineproject.diagram.edit.parts.PrimaryKeyEditPart;
import pipelineproject.diagram.edit.parts.ProjectOnAttributesEditPart;
import pipelineproject.diagram.edit.parts.QueryParamEditPart;
import pipelineproject.diagram.edit.parts.RidgeEditPart;
import pipelineproject.diagram.edit.parts.RuntimeInfoEditPart;
import pipelineproject.diagram.edit.parts.SVMEditPart;
import pipelineproject.diagram.edit.parts.ScatterPlotEditPart;
import pipelineproject.diagram.edit.parts.SchemaEditPart;
import pipelineproject.diagram.edit.parts.SkewnessEditPart;
import pipelineproject.diagram.edit.parts.TaskInputSchemaEditPart;
import pipelineproject.diagram.edit.parts.TaskOutputSchemaEditPart;
import pipelineproject.diagram.edit.parts.VarianceEditPart;
import pipelineproject.diagram.part.PipelineprojectDiagramEditorPlugin;

/**
 * @generated
 */
public class PipelineprojectElementTypes {

	/**
	* @generated
	*/
	private PipelineprojectElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PipelineprojectDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Pipeline_1000 = getElementType("ASEProject-Metamodel.diagram.Pipeline_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Agglomerative_2035 = getElementType(
			"ASEProject-Metamodel.diagram.Agglomerative_2035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ridge_2036 = getElementType("ASEProject-Metamodel.diagram.Ridge_2036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Lasso_2037 = getElementType("ASEProject-Metamodel.diagram.Lasso_2037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType KNN_2038 = getElementType("ASEProject-Metamodel.diagram.KNN_2038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SVM_2039 = getElementType("ASEProject-Metamodel.diagram.SVM_2039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType KMeans_2041 = getElementType("ASEProject-Metamodel.diagram.KMeans_2041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DBSCAN_2042 = getElementType("ASEProject-Metamodel.diagram.DBSCAN_2042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JarvisPatrick_2043 = getElementType(
			"ASEProject-Metamodel.diagram.JarvisPatrick_2043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinearRegression_2044 = getElementType(
			"ASEProject-Metamodel.diagram.LinearRegression_2044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Mean_2045 = getElementType("ASEProject-Metamodel.diagram.Mean_2045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Median_2046 = getElementType("ASEProject-Metamodel.diagram.Median_2046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Variance_2047 = getElementType("ASEProject-Metamodel.diagram.Variance_2047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LogisticRegression_2059 = getElementType(
			"ASEProject-Metamodel.diagram.LogisticRegression_2059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Skewness_2060 = getElementType("ASEProject-Metamodel.diagram.Skewness_2060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LabeledScatterPlot_2062 = getElementType(
			"ASEProject-Metamodel.diagram.LabeledScatterPlot_2062"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NullValuesRemoval_2050 = getElementType(
			"ASEProject-Metamodel.diagram.NullValuesRemoval_2050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CustomCleaning_2051 = getElementType(
			"ASEProject-Metamodel.diagram.CustomCleaning_2051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ChangeDataFormat_2052 = getElementType(
			"ASEProject-Metamodel.diagram.ChangeDataFormat_2052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ScatterPlot_2063 = getElementType("ASEProject-Metamodel.diagram.ScatterPlot_2063"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Histogram_2064 = getElementType("ASEProject-Metamodel.diagram.Histogram_2064"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PiePlot_2065 = getElementType("ASEProject-Metamodel.diagram.PiePlot_2065"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProjectOnAttributes_2066 = getElementType(
			"ASEProject-Metamodel.diagram.ProjectOnAttributes_2066"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataCollection_2053 = getElementType(
			"ASEProject-Metamodel.diagram.DataCollection_2053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataIntegration_2054 = getElementType(
			"ASEProject-Metamodel.diagram.DataIntegration_2054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_2056 = getElementType("ASEProject-Metamodel.diagram.Export_2056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Schema_2057 = getElementType("ASEProject-Metamodel.diagram.Schema_2057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputFile_2058 = getElementType("ASEProject-Metamodel.diagram.OutputFile_2058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RuntimeInfo_3036 = getElementType("ASEProject-Metamodel.diagram.RuntimeInfo_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CustomParam_3037 = getElementType("ASEProject-Metamodel.diagram.CustomParam_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputSourceDeclaration_3038 = getElementType(
			"ASEProject-Metamodel.diagram.InputSourceDeclaration_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AndClause_3039 = getElementType("ASEProject-Metamodel.diagram.AndClause_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AndClause_3040 = getElementType("ASEProject-Metamodel.diagram.AndClause_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrClause_3041 = getElementType("ASEProject-Metamodel.diagram.OrClause_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LtClause_3042 = getElementType("ASEProject-Metamodel.diagram.LtClause_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QueryParam_3070 = getElementType("ASEProject-Metamodel.diagram.QueryParam_3070"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GtClause_3044 = getElementType("ASEProject-Metamodel.diagram.GtClause_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqClause_3045 = getElementType("ASEProject-Metamodel.diagram.EqClause_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeClause_3046 = getElementType("ASEProject-Metamodel.diagram.LeClause_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeClause_3047 = getElementType("ASEProject-Metamodel.diagram.GeClause_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainsClause_3048 = getElementType(
			"ASEProject-Metamodel.diagram.ContainsClause_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NotClause_3049 = getElementType("ASEProject-Metamodel.diagram.NotClause_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AndClause_3050 = getElementType("ASEProject-Metamodel.diagram.AndClause_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrClause_3051 = getElementType("ASEProject-Metamodel.diagram.OrClause_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LtClause_3052 = getElementType("ASEProject-Metamodel.diagram.LtClause_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GtClause_3053 = getElementType("ASEProject-Metamodel.diagram.GtClause_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqClause_3054 = getElementType("ASEProject-Metamodel.diagram.EqClause_3054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeClause_3055 = getElementType("ASEProject-Metamodel.diagram.LeClause_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeClause_3056 = getElementType("ASEProject-Metamodel.diagram.GeClause_3056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainsClause_3057 = getElementType(
			"ASEProject-Metamodel.diagram.ContainsClause_3057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NotClause_3058 = getElementType("ASEProject-Metamodel.diagram.NotClause_3058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrClause_3059 = getElementType("ASEProject-Metamodel.diagram.OrClause_3059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LtClause_3060 = getElementType("ASEProject-Metamodel.diagram.LtClause_3060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GtClause_3061 = getElementType("ASEProject-Metamodel.diagram.GtClause_3061"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EqClause_3062 = getElementType("ASEProject-Metamodel.diagram.EqClause_3062"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LeClause_3063 = getElementType("ASEProject-Metamodel.diagram.LeClause_3063"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GeClause_3064 = getElementType("ASEProject-Metamodel.diagram.GeClause_3064"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainsClause_3065 = getElementType(
			"ASEProject-Metamodel.diagram.ContainsClause_3065"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NotClause_3066 = getElementType("ASEProject-Metamodel.diagram.NotClause_3066"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinAttributesList_3067 = getElementType(
			"ASEProject-Metamodel.diagram.JoinAttributesList_3067"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3068 = getElementType("ASEProject-Metamodel.diagram.Attribute_3068"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrimaryKey_3069 = getElementType("ASEProject-Metamodel.diagram.PrimaryKey_3069"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFlow_4007 = getElementType("ASEProject-Metamodel.diagram.DataFlow_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TaskInputSchema_4015 = getElementType(
			"ASEProject-Metamodel.diagram.TaskInputSchema_4015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TaskOutputSchema_4016 = getElementType(
			"ASEProject-Metamodel.diagram.TaskOutputSchema_4016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportWrites_4010 = getElementType(
			"ASEProject-Metamodel.diagram.ExportWrites_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputSourceDeclarationSourceSchema_4011 = getElementType(
			"ASEProject-Metamodel.diagram.InputSourceDeclarationSourceSchema_4011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PrimaryKeyCopies_4017 = getElementType(
			"ASEProject-Metamodel.diagram.PrimaryKeyCopies_4017"); //$NON-NLS-1$

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

			elements.put(Pipeline_1000, PipelineprojectPackage.eINSTANCE.getPipeline());

			elements.put(Agglomerative_2035, PipelineprojectPackage.eINSTANCE.getAgglomerative());

			elements.put(Ridge_2036, PipelineprojectPackage.eINSTANCE.getRidge());

			elements.put(Lasso_2037, PipelineprojectPackage.eINSTANCE.getLasso());

			elements.put(KNN_2038, PipelineprojectPackage.eINSTANCE.getKNN());

			elements.put(SVM_2039, PipelineprojectPackage.eINSTANCE.getSVM());

			elements.put(KMeans_2041, PipelineprojectPackage.eINSTANCE.getKMeans());

			elements.put(DBSCAN_2042, PipelineprojectPackage.eINSTANCE.getDBSCAN());

			elements.put(JarvisPatrick_2043, PipelineprojectPackage.eINSTANCE.getJarvisPatrick());

			elements.put(LinearRegression_2044, PipelineprojectPackage.eINSTANCE.getLinearRegression());

			elements.put(Mean_2045, PipelineprojectPackage.eINSTANCE.getMean());

			elements.put(Median_2046, PipelineprojectPackage.eINSTANCE.getMedian());

			elements.put(Variance_2047, PipelineprojectPackage.eINSTANCE.getVariance());

			elements.put(LogisticRegression_2059, PipelineprojectPackage.eINSTANCE.getLogisticRegression());

			elements.put(Skewness_2060, PipelineprojectPackage.eINSTANCE.getSkewness());

			elements.put(LabeledScatterPlot_2062, PipelineprojectPackage.eINSTANCE.getLabeledScatterPlot());

			elements.put(NullValuesRemoval_2050, PipelineprojectPackage.eINSTANCE.getNullValuesRemoval());

			elements.put(CustomCleaning_2051, PipelineprojectPackage.eINSTANCE.getCustomCleaning());

			elements.put(ChangeDataFormat_2052, PipelineprojectPackage.eINSTANCE.getChangeDataFormat());

			elements.put(ScatterPlot_2063, PipelineprojectPackage.eINSTANCE.getScatterPlot());

			elements.put(Histogram_2064, PipelineprojectPackage.eINSTANCE.getHistogram());

			elements.put(PiePlot_2065, PipelineprojectPackage.eINSTANCE.getPiePlot());

			elements.put(ProjectOnAttributes_2066, PipelineprojectPackage.eINSTANCE.getProjectOnAttributes());

			elements.put(DataCollection_2053, PipelineprojectPackage.eINSTANCE.getDataCollection());

			elements.put(DataIntegration_2054, PipelineprojectPackage.eINSTANCE.getDataIntegration());

			elements.put(Export_2056, PipelineprojectPackage.eINSTANCE.getExport());

			elements.put(Schema_2057, PipelineprojectPackage.eINSTANCE.getSchema());

			elements.put(OutputFile_2058, PipelineprojectPackage.eINSTANCE.getOutputFile());

			elements.put(RuntimeInfo_3036, PipelineprojectPackage.eINSTANCE.getRuntimeInfo());

			elements.put(CustomParam_3037, PipelineprojectPackage.eINSTANCE.getCustomParam());

			elements.put(InputSourceDeclaration_3038, PipelineprojectPackage.eINSTANCE.getInputSourceDeclaration());

			elements.put(AndClause_3039, PipelineprojectPackage.eINSTANCE.getAndClause());

			elements.put(AndClause_3040, PipelineprojectPackage.eINSTANCE.getAndClause());

			elements.put(OrClause_3041, PipelineprojectPackage.eINSTANCE.getOrClause());

			elements.put(LtClause_3042, PipelineprojectPackage.eINSTANCE.getLtClause());

			elements.put(QueryParam_3070, PipelineprojectPackage.eINSTANCE.getQueryParam());

			elements.put(GtClause_3044, PipelineprojectPackage.eINSTANCE.getGtClause());

			elements.put(EqClause_3045, PipelineprojectPackage.eINSTANCE.getEqClause());

			elements.put(LeClause_3046, PipelineprojectPackage.eINSTANCE.getLeClause());

			elements.put(GeClause_3047, PipelineprojectPackage.eINSTANCE.getGeClause());

			elements.put(ContainsClause_3048, PipelineprojectPackage.eINSTANCE.getContainsClause());

			elements.put(NotClause_3049, PipelineprojectPackage.eINSTANCE.getNotClause());

			elements.put(AndClause_3050, PipelineprojectPackage.eINSTANCE.getAndClause());

			elements.put(OrClause_3051, PipelineprojectPackage.eINSTANCE.getOrClause());

			elements.put(LtClause_3052, PipelineprojectPackage.eINSTANCE.getLtClause());

			elements.put(GtClause_3053, PipelineprojectPackage.eINSTANCE.getGtClause());

			elements.put(EqClause_3054, PipelineprojectPackage.eINSTANCE.getEqClause());

			elements.put(LeClause_3055, PipelineprojectPackage.eINSTANCE.getLeClause());

			elements.put(GeClause_3056, PipelineprojectPackage.eINSTANCE.getGeClause());

			elements.put(ContainsClause_3057, PipelineprojectPackage.eINSTANCE.getContainsClause());

			elements.put(NotClause_3058, PipelineprojectPackage.eINSTANCE.getNotClause());

			elements.put(OrClause_3059, PipelineprojectPackage.eINSTANCE.getOrClause());

			elements.put(LtClause_3060, PipelineprojectPackage.eINSTANCE.getLtClause());

			elements.put(GtClause_3061, PipelineprojectPackage.eINSTANCE.getGtClause());

			elements.put(EqClause_3062, PipelineprojectPackage.eINSTANCE.getEqClause());

			elements.put(LeClause_3063, PipelineprojectPackage.eINSTANCE.getLeClause());

			elements.put(GeClause_3064, PipelineprojectPackage.eINSTANCE.getGeClause());

			elements.put(ContainsClause_3065, PipelineprojectPackage.eINSTANCE.getContainsClause());

			elements.put(NotClause_3066, PipelineprojectPackage.eINSTANCE.getNotClause());

			elements.put(JoinAttributesList_3067, PipelineprojectPackage.eINSTANCE.getJoinAttributesList());

			elements.put(Attribute_3068, PipelineprojectPackage.eINSTANCE.getAttribute());

			elements.put(PrimaryKey_3069, PipelineprojectPackage.eINSTANCE.getPrimaryKey());

			elements.put(DataFlow_4007, PipelineprojectPackage.eINSTANCE.getDataFlow());

			elements.put(TaskInputSchema_4015, PipelineprojectPackage.eINSTANCE.getTask_InputSchema());

			elements.put(TaskOutputSchema_4016, PipelineprojectPackage.eINSTANCE.getTask_OutputSchema());

			elements.put(ExportWrites_4010, PipelineprojectPackage.eINSTANCE.getExport_Writes());

			elements.put(InputSourceDeclarationSourceSchema_4011,
					PipelineprojectPackage.eINSTANCE.getInputSourceDeclaration_SourceSchema());

			elements.put(PrimaryKeyCopies_4017, PipelineprojectPackage.eINSTANCE.getPrimaryKey_Copies());
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
			KNOWN_ELEMENT_TYPES.add(Agglomerative_2035);
			KNOWN_ELEMENT_TYPES.add(Ridge_2036);
			KNOWN_ELEMENT_TYPES.add(Lasso_2037);
			KNOWN_ELEMENT_TYPES.add(KNN_2038);
			KNOWN_ELEMENT_TYPES.add(SVM_2039);
			KNOWN_ELEMENT_TYPES.add(KMeans_2041);
			KNOWN_ELEMENT_TYPES.add(DBSCAN_2042);
			KNOWN_ELEMENT_TYPES.add(JarvisPatrick_2043);
			KNOWN_ELEMENT_TYPES.add(LinearRegression_2044);
			KNOWN_ELEMENT_TYPES.add(Mean_2045);
			KNOWN_ELEMENT_TYPES.add(Median_2046);
			KNOWN_ELEMENT_TYPES.add(Variance_2047);
			KNOWN_ELEMENT_TYPES.add(LogisticRegression_2059);
			KNOWN_ELEMENT_TYPES.add(Skewness_2060);
			KNOWN_ELEMENT_TYPES.add(LabeledScatterPlot_2062);
			KNOWN_ELEMENT_TYPES.add(NullValuesRemoval_2050);
			KNOWN_ELEMENT_TYPES.add(CustomCleaning_2051);
			KNOWN_ELEMENT_TYPES.add(ChangeDataFormat_2052);
			KNOWN_ELEMENT_TYPES.add(ScatterPlot_2063);
			KNOWN_ELEMENT_TYPES.add(Histogram_2064);
			KNOWN_ELEMENT_TYPES.add(PiePlot_2065);
			KNOWN_ELEMENT_TYPES.add(ProjectOnAttributes_2066);
			KNOWN_ELEMENT_TYPES.add(DataCollection_2053);
			KNOWN_ELEMENT_TYPES.add(DataIntegration_2054);
			KNOWN_ELEMENT_TYPES.add(Export_2056);
			KNOWN_ELEMENT_TYPES.add(Schema_2057);
			KNOWN_ELEMENT_TYPES.add(OutputFile_2058);
			KNOWN_ELEMENT_TYPES.add(RuntimeInfo_3036);
			KNOWN_ELEMENT_TYPES.add(CustomParam_3037);
			KNOWN_ELEMENT_TYPES.add(InputSourceDeclaration_3038);
			KNOWN_ELEMENT_TYPES.add(AndClause_3039);
			KNOWN_ELEMENT_TYPES.add(AndClause_3040);
			KNOWN_ELEMENT_TYPES.add(OrClause_3041);
			KNOWN_ELEMENT_TYPES.add(LtClause_3042);
			KNOWN_ELEMENT_TYPES.add(QueryParam_3070);
			KNOWN_ELEMENT_TYPES.add(GtClause_3044);
			KNOWN_ELEMENT_TYPES.add(EqClause_3045);
			KNOWN_ELEMENT_TYPES.add(LeClause_3046);
			KNOWN_ELEMENT_TYPES.add(GeClause_3047);
			KNOWN_ELEMENT_TYPES.add(ContainsClause_3048);
			KNOWN_ELEMENT_TYPES.add(NotClause_3049);
			KNOWN_ELEMENT_TYPES.add(AndClause_3050);
			KNOWN_ELEMENT_TYPES.add(OrClause_3051);
			KNOWN_ELEMENT_TYPES.add(LtClause_3052);
			KNOWN_ELEMENT_TYPES.add(GtClause_3053);
			KNOWN_ELEMENT_TYPES.add(EqClause_3054);
			KNOWN_ELEMENT_TYPES.add(LeClause_3055);
			KNOWN_ELEMENT_TYPES.add(GeClause_3056);
			KNOWN_ELEMENT_TYPES.add(ContainsClause_3057);
			KNOWN_ELEMENT_TYPES.add(NotClause_3058);
			KNOWN_ELEMENT_TYPES.add(OrClause_3059);
			KNOWN_ELEMENT_TYPES.add(LtClause_3060);
			KNOWN_ELEMENT_TYPES.add(GtClause_3061);
			KNOWN_ELEMENT_TYPES.add(EqClause_3062);
			KNOWN_ELEMENT_TYPES.add(LeClause_3063);
			KNOWN_ELEMENT_TYPES.add(GeClause_3064);
			KNOWN_ELEMENT_TYPES.add(ContainsClause_3065);
			KNOWN_ELEMENT_TYPES.add(NotClause_3066);
			KNOWN_ELEMENT_TYPES.add(JoinAttributesList_3067);
			KNOWN_ELEMENT_TYPES.add(Attribute_3068);
			KNOWN_ELEMENT_TYPES.add(PrimaryKey_3069);
			KNOWN_ELEMENT_TYPES.add(DataFlow_4007);
			KNOWN_ELEMENT_TYPES.add(TaskInputSchema_4015);
			KNOWN_ELEMENT_TYPES.add(TaskOutputSchema_4016);
			KNOWN_ELEMENT_TYPES.add(ExportWrites_4010);
			KNOWN_ELEMENT_TYPES.add(InputSourceDeclarationSourceSchema_4011);
			KNOWN_ELEMENT_TYPES.add(PrimaryKeyCopies_4017);
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
			return Agglomerative_2035;
		case RidgeEditPart.VISUAL_ID:
			return Ridge_2036;
		case LassoEditPart.VISUAL_ID:
			return Lasso_2037;
		case KNNEditPart.VISUAL_ID:
			return KNN_2038;
		case SVMEditPart.VISUAL_ID:
			return SVM_2039;
		case KMeansEditPart.VISUAL_ID:
			return KMeans_2041;
		case DBSCANEditPart.VISUAL_ID:
			return DBSCAN_2042;
		case JarvisPatrickEditPart.VISUAL_ID:
			return JarvisPatrick_2043;
		case LinearRegressionEditPart.VISUAL_ID:
			return LinearRegression_2044;
		case MeanEditPart.VISUAL_ID:
			return Mean_2045;
		case MedianEditPart.VISUAL_ID:
			return Median_2046;
		case VarianceEditPart.VISUAL_ID:
			return Variance_2047;
		case LogisticRegressionEditPart.VISUAL_ID:
			return LogisticRegression_2059;
		case SkewnessEditPart.VISUAL_ID:
			return Skewness_2060;
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return LabeledScatterPlot_2062;
		case NullValuesRemovalEditPart.VISUAL_ID:
			return NullValuesRemoval_2050;
		case CustomCleaningEditPart.VISUAL_ID:
			return CustomCleaning_2051;
		case ChangeDataFormatEditPart.VISUAL_ID:
			return ChangeDataFormat_2052;
		case ScatterPlotEditPart.VISUAL_ID:
			return ScatterPlot_2063;
		case HistogramEditPart.VISUAL_ID:
			return Histogram_2064;
		case PiePlotEditPart.VISUAL_ID:
			return PiePlot_2065;
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return ProjectOnAttributes_2066;
		case DataCollectionEditPart.VISUAL_ID:
			return DataCollection_2053;
		case DataIntegrationEditPart.VISUAL_ID:
			return DataIntegration_2054;
		case ExportEditPart.VISUAL_ID:
			return Export_2056;
		case SchemaEditPart.VISUAL_ID:
			return Schema_2057;
		case OutputFileEditPart.VISUAL_ID:
			return OutputFile_2058;
		case RuntimeInfoEditPart.VISUAL_ID:
			return RuntimeInfo_3036;
		case CustomParamEditPart.VISUAL_ID:
			return CustomParam_3037;
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return InputSourceDeclaration_3038;
		case AndClauseEditPart.VISUAL_ID:
			return AndClause_3039;
		case AndClause2EditPart.VISUAL_ID:
			return AndClause_3040;
		case OrClauseEditPart.VISUAL_ID:
			return OrClause_3041;
		case LtClauseEditPart.VISUAL_ID:
			return LtClause_3042;
		case QueryParamEditPart.VISUAL_ID:
			return QueryParam_3070;
		case GtClauseEditPart.VISUAL_ID:
			return GtClause_3044;
		case EqClauseEditPart.VISUAL_ID:
			return EqClause_3045;
		case LeClauseEditPart.VISUAL_ID:
			return LeClause_3046;
		case GeClauseEditPart.VISUAL_ID:
			return GeClause_3047;
		case ContainsClauseEditPart.VISUAL_ID:
			return ContainsClause_3048;
		case NotClauseEditPart.VISUAL_ID:
			return NotClause_3049;
		case AndClause3EditPart.VISUAL_ID:
			return AndClause_3050;
		case OrClause2EditPart.VISUAL_ID:
			return OrClause_3051;
		case LtClause2EditPart.VISUAL_ID:
			return LtClause_3052;
		case GtClause2EditPart.VISUAL_ID:
			return GtClause_3053;
		case EqClause2EditPart.VISUAL_ID:
			return EqClause_3054;
		case LeClause2EditPart.VISUAL_ID:
			return LeClause_3055;
		case GeClause2EditPart.VISUAL_ID:
			return GeClause_3056;
		case ContainsClause2EditPart.VISUAL_ID:
			return ContainsClause_3057;
		case NotClause2EditPart.VISUAL_ID:
			return NotClause_3058;
		case OrClause3EditPart.VISUAL_ID:
			return OrClause_3059;
		case LtClause3EditPart.VISUAL_ID:
			return LtClause_3060;
		case GtClause3EditPart.VISUAL_ID:
			return GtClause_3061;
		case EqClause3EditPart.VISUAL_ID:
			return EqClause_3062;
		case LeClause3EditPart.VISUAL_ID:
			return LeClause_3063;
		case GeClause3EditPart.VISUAL_ID:
			return GeClause_3064;
		case ContainsClause3EditPart.VISUAL_ID:
			return ContainsClause_3065;
		case NotClause3EditPart.VISUAL_ID:
			return NotClause_3066;
		case JoinAttributesListEditPart.VISUAL_ID:
			return JoinAttributesList_3067;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3068;
		case PrimaryKeyEditPart.VISUAL_ID:
			return PrimaryKey_3069;
		case DataFlowEditPart.VISUAL_ID:
			return DataFlow_4007;
		case TaskInputSchemaEditPart.VISUAL_ID:
			return TaskInputSchema_4015;
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return TaskOutputSchema_4016;
		case ExportWritesEditPart.VISUAL_ID:
			return ExportWrites_4010;
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return InputSourceDeclarationSourceSchema_4011;
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return PrimaryKeyCopies_4017;
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
			return pipelineproject.diagram.providers.PipelineprojectElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return pipelineproject.diagram.providers.PipelineprojectElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return pipelineproject.diagram.providers.PipelineprojectElementTypes.getElement(elementTypeAdapter);
		}
	};

}
