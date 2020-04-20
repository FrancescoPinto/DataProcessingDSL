/**
 */
package pipelineproject.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pipelineproject.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineprojectFactoryImpl extends EFactoryImpl implements PipelineprojectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PipelineprojectFactory init() {
		try {
			PipelineprojectFactory thePipelineprojectFactory = (PipelineprojectFactory)EPackage.Registry.INSTANCE.getEFactory(PipelineprojectPackage.eNS_URI);
			if (thePipelineprojectFactory != null) {
				return thePipelineprojectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PipelineprojectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineprojectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PipelineprojectPackage.PIPELINE: return createPipeline();
			case PipelineprojectPackage.DATA_FLOW: return createDataFlow();
			case PipelineprojectPackage.DATA_COLLECTION: return createDataCollection();
			case PipelineprojectPackage.DATA_INTEGRATION: return createDataIntegration();
			case PipelineprojectPackage.EXPORT: return createExport();
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION: return createInputSourceDeclaration();
			case PipelineprojectPackage.OUTPUT_FILE: return createOutputFile();
			case PipelineprojectPackage.NULL_VALUES_REMOVAL: return createNullValuesRemoval();
			case PipelineprojectPackage.CUSTOM_CLEANING: return createCustomCleaning();
			case PipelineprojectPackage.SCHEMA: return createSchema();
			case PipelineprojectPackage.JOIN_ATTRIBUTES_LIST: return createJoinAttributesList();
			case PipelineprojectPackage.RUNTIME_INFO: return createRuntimeInfo();
			case PipelineprojectPackage.CHANGE_DATA_FORMAT: return createChangeDataFormat();
			case PipelineprojectPackage.KNN: return createKNN();
			case PipelineprojectPackage.SVM: return createSVM();
			case PipelineprojectPackage.KMEANS: return createKMeans();
			case PipelineprojectPackage.AGGLOMERATIVE: return createAgglomerative();
			case PipelineprojectPackage.DBSCAN: return createDBSCAN();
			case PipelineprojectPackage.JARVIS_PATRICK: return createJarvisPatrick();
			case PipelineprojectPackage.LINEAR_REGRESSION: return createLinearRegression();
			case PipelineprojectPackage.RIDGE: return createRidge();
			case PipelineprojectPackage.LASSO: return createLasso();
			case PipelineprojectPackage.MEAN: return createMean();
			case PipelineprojectPackage.MEDIAN: return createMedian();
			case PipelineprojectPackage.VARIANCE: return createVariance();
			case PipelineprojectPackage.NOT_CLAUSE: return createNotClause();
			case PipelineprojectPackage.AND_CLAUSE: return createAndClause();
			case PipelineprojectPackage.OR_CLAUSE: return createOrClause();
			case PipelineprojectPackage.LT_CLAUSE: return createLtClause();
			case PipelineprojectPackage.GT_CLAUSE: return createGtClause();
			case PipelineprojectPackage.EQ_CLAUSE: return createEqClause();
			case PipelineprojectPackage.LE_CLAUSE: return createLeClause();
			case PipelineprojectPackage.GE_CLAUSE: return createGeClause();
			case PipelineprojectPackage.CONTAINS_CLAUSE: return createContainsClause();
			case PipelineprojectPackage.QUERY_PARAM: return createQueryParam();
			case PipelineprojectPackage.CUSTOM_PARAM: return createCustomParam();
			case PipelineprojectPackage.PRIMARY_KEY: return createPrimaryKey();
			case PipelineprojectPackage.ATTRIBUTE: return createAttribute();
			case PipelineprojectPackage.LOGISTIC_REGRESSION: return createLogisticRegression();
			case PipelineprojectPackage.SKEWNESS: return createSkewness();
			case PipelineprojectPackage.SCATTER_PLOT: return createScatterPlot();
			case PipelineprojectPackage.LABELED_SCATTER_PLOT: return createLabeledScatterPlot();
			case PipelineprojectPackage.HISTOGRAM: return createHistogram();
			case PipelineprojectPackage.PIE_PLOT: return createPiePlot();
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES: return createProjectOnAttributes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PipelineprojectPackage.FORMAT:
				return createFormatFromString(eDataType, initialValue);
			case PipelineprojectPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case PipelineprojectPackage.NUL_VALUES_POLICY:
				return createNulValuesPolicyFromString(eDataType, initialValue);
			case PipelineprojectPackage.KERNEL_FUNCTION:
				return createKernelFunctionFromString(eDataType, initialValue);
			case PipelineprojectPackage.INTER_CLUSTER_SIMILARITY:
				return createInterClusterSimilarityFromString(eDataType, initialValue);
			case PipelineprojectPackage.SOURCE_TYPE:
				return createSourceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PipelineprojectPackage.FORMAT:
				return convertFormatToString(eDataType, instanceValue);
			case PipelineprojectPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case PipelineprojectPackage.NUL_VALUES_POLICY:
				return convertNulValuesPolicyToString(eDataType, instanceValue);
			case PipelineprojectPackage.KERNEL_FUNCTION:
				return convertKernelFunctionToString(eDataType, instanceValue);
			case PipelineprojectPackage.INTER_CLUSTER_SIMILARITY:
				return convertInterClusterSimilarityToString(eDataType, instanceValue);
			case PipelineprojectPackage.SOURCE_TYPE:
				return convertSourceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCollection createDataCollection() {
		DataCollectionImpl dataCollection = new DataCollectionImpl();
		return dataCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntegration createDataIntegration() {
		DataIntegrationImpl dataIntegration = new DataIntegrationImpl();
		return dataIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Export createExport() {
		ExportImpl export = new ExportImpl();
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSourceDeclaration createInputSourceDeclaration() {
		InputSourceDeclarationImpl inputSourceDeclaration = new InputSourceDeclarationImpl();
		return inputSourceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFile createOutputFile() {
		OutputFileImpl outputFile = new OutputFileImpl();
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValuesRemoval createNullValuesRemoval() {
		NullValuesRemovalImpl nullValuesRemoval = new NullValuesRemovalImpl();
		return nullValuesRemoval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCleaning createCustomCleaning() {
		CustomCleaningImpl customCleaning = new CustomCleaningImpl();
		return customCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinAttributesList createJoinAttributesList() {
		JoinAttributesListImpl joinAttributesList = new JoinAttributesListImpl();
		return joinAttributesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeInfo createRuntimeInfo() {
		RuntimeInfoImpl runtimeInfo = new RuntimeInfoImpl();
		return runtimeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeDataFormat createChangeDataFormat() {
		ChangeDataFormatImpl changeDataFormat = new ChangeDataFormatImpl();
		return changeDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNN createKNN() {
		KNNImpl knn = new KNNImpl();
		return knn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVM createSVM() {
		SVMImpl svm = new SVMImpl();
		return svm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMeans createKMeans() {
		KMeansImpl kMeans = new KMeansImpl();
		return kMeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agglomerative createAgglomerative() {
		AgglomerativeImpl agglomerative = new AgglomerativeImpl();
		return agglomerative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBSCAN createDBSCAN() {
		DBSCANImpl dbscan = new DBSCANImpl();
		return dbscan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JarvisPatrick createJarvisPatrick() {
		JarvisPatrickImpl jarvisPatrick = new JarvisPatrickImpl();
		return jarvisPatrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRegression createLinearRegression() {
		LinearRegressionImpl linearRegression = new LinearRegressionImpl();
		return linearRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ridge createRidge() {
		RidgeImpl ridge = new RidgeImpl();
		return ridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lasso createLasso() {
		LassoImpl lasso = new LassoImpl();
		return lasso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mean createMean() {
		MeanImpl mean = new MeanImpl();
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Median createMedian() {
		MedianImpl median = new MedianImpl();
		return median;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variance createVariance() {
		VarianceImpl variance = new VarianceImpl();
		return variance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotClause createNotClause() {
		NotClauseImpl notClause = new NotClauseImpl();
		return notClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndClause createAndClause() {
		AndClauseImpl andClause = new AndClauseImpl();
		return andClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrClause createOrClause() {
		OrClauseImpl orClause = new OrClauseImpl();
		return orClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LtClause createLtClause() {
		LtClauseImpl ltClause = new LtClauseImpl();
		return ltClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtClause createGtClause() {
		GtClauseImpl gtClause = new GtClauseImpl();
		return gtClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqClause createEqClause() {
		EqClauseImpl eqClause = new EqClauseImpl();
		return eqClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeClause createLeClause() {
		LeClauseImpl leClause = new LeClauseImpl();
		return leClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeClause createGeClause() {
		GeClauseImpl geClause = new GeClauseImpl();
		return geClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainsClause createContainsClause() {
		ContainsClauseImpl containsClause = new ContainsClauseImpl();
		return containsClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam createQueryParam() {
		QueryParamImpl queryParam = new QueryParamImpl();
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomParam createCustomParam() {
		CustomParamImpl customParam = new CustomParamImpl();
		return customParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey createPrimaryKey() {
		PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticRegression createLogisticRegression() {
		LogisticRegressionImpl logisticRegression = new LogisticRegressionImpl();
		return logisticRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skewness createSkewness() {
		SkewnessImpl skewness = new SkewnessImpl();
		return skewness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScatterPlot createScatterPlot() {
		ScatterPlotImpl scatterPlot = new ScatterPlotImpl();
		return scatterPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledScatterPlot createLabeledScatterPlot() {
		LabeledScatterPlotImpl labeledScatterPlot = new LabeledScatterPlotImpl();
		return labeledScatterPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Histogram createHistogram() {
		HistogramImpl histogram = new HistogramImpl();
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiePlot createPiePlot() {
		PiePlotImpl piePlot = new PiePlotImpl();
		return piePlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectOnAttributes createProjectOnAttributes() {
		ProjectOnAttributesImpl projectOnAttributes = new ProjectOnAttributesImpl();
		return projectOnAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format createFormatFromString(EDataType eDataType, String initialValue) {
		Format result = Format.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NulValuesPolicy createNulValuesPolicyFromString(EDataType eDataType, String initialValue) {
		NulValuesPolicy result = NulValuesPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNulValuesPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFunction createKernelFunctionFromString(EDataType eDataType, String initialValue) {
		KernelFunction result = KernelFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKernelFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterClusterSimilarity createInterClusterSimilarityFromString(EDataType eDataType, String initialValue) {
		InterClusterSimilarity result = InterClusterSimilarity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterClusterSimilarityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeFromString(EDataType eDataType, String initialValue) {
		SourceType result = SourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineprojectPackage getPipelineprojectPackage() {
		return (PipelineprojectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PipelineprojectPackage getPackage() {
		return PipelineprojectPackage.eINSTANCE;
	}

} //PipelineprojectFactoryImpl
