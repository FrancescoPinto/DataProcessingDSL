/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pythonpipeline.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PythonpipelineFactoryImpl extends EFactoryImpl implements PythonpipelineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PythonpipelineFactory init() {
		try {
			PythonpipelineFactory thePythonpipelineFactory = (PythonpipelineFactory)EPackage.Registry.INSTANCE.getEFactory(PythonpipelinePackage.eNS_URI);
			if (thePythonpipelineFactory != null) {
				return thePythonpipelineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PythonpipelineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonpipelineFactoryImpl() {
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
			case PythonpipelinePackage.PIPELINE: return createPipeline();
			case PythonpipelinePackage.DATA_FLOW: return createDataFlow();
			case PythonpipelinePackage.DATA_COLLECTION: return createDataCollection();
			case PythonpipelinePackage.DATA_INTEGRATION: return createDataIntegration();
			case PythonpipelinePackage.EXPORT: return createExport();
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION: return createInputSourceDeclaration();
			case PythonpipelinePackage.OUTPUT_FILE: return createOutputFile();
			case PythonpipelinePackage.NULL_VALUES_REMOVAL: return createNullValuesRemoval();
			case PythonpipelinePackage.CUSTOM_CLEANING: return createCustomCleaning();
			case PythonpipelinePackage.SCHEMA: return createSchema();
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST: return createJoinAttributesList();
			case PythonpipelinePackage.RUNTIME_INFO: return createRuntimeInfo();
			case PythonpipelinePackage.CHANGE_DATA_FORMAT: return createChangeDataFormat();
			case PythonpipelinePackage.SVM: return createSVM();
			case PythonpipelinePackage.KMEANS: return createKMeans();
			case PythonpipelinePackage.AGGLOMERATIVE: return createAgglomerative();
			case PythonpipelinePackage.DBSCAN: return createDBSCAN();
			case PythonpipelinePackage.LINEAR_REGRESSION: return createLinearRegression();
			case PythonpipelinePackage.RIDGE: return createRidge();
			case PythonpipelinePackage.LASSO: return createLasso();
			case PythonpipelinePackage.MEAN: return createMean();
			case PythonpipelinePackage.MEDIAN: return createMedian();
			case PythonpipelinePackage.STANDARD_DEVIATION: return createStandardDeviation();
			case PythonpipelinePackage.NOT_CLAUSE: return createNotClause();
			case PythonpipelinePackage.AND_CLAUSE: return createAndClause();
			case PythonpipelinePackage.OR_CLAUSE: return createOrClause();
			case PythonpipelinePackage.LT_CLAUSE: return createLtClause();
			case PythonpipelinePackage.GT_CLAUSE: return createGtClause();
			case PythonpipelinePackage.EQ_CLAUSE: return createEqClause();
			case PythonpipelinePackage.LE_CLAUSE: return createLeClause();
			case PythonpipelinePackage.GE_CLAUSE: return createGeClause();
			case PythonpipelinePackage.CONTAINS_CLAUSE: return createContainsClause();
			case PythonpipelinePackage.QUERY_PARAM: return createQueryParam();
			case PythonpipelinePackage.CUSTOM_PARAM: return createCustomParam();
			case PythonpipelinePackage.PRIMARY_KEY: return createPrimaryKey();
			case PythonpipelinePackage.ATTRIBUTE: return createAttribute();
			case PythonpipelinePackage.LOGISTIC_REGRESSION: return createLogisticRegression();
			case PythonpipelinePackage.SKEWNESS: return createSkewness();
			case PythonpipelinePackage.SCATTER_PLOT: return createScatterPlot();
			case PythonpipelinePackage.LABELED_SCATTER_PLOT: return createLabeledScatterPlot();
			case PythonpipelinePackage.HISTOGRAM: return createHistogram();
			case PythonpipelinePackage.PIE_PLOT: return createPiePlot();
			case PythonpipelinePackage.PROJECT_ON_ATTRIBUTES: return createProjectOnAttributes();
			case PythonpipelinePackage.SUPPORT_VECTOR: return createSupportVector();
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
			case PythonpipelinePackage.FORMAT:
				return createFormatFromString(eDataType, initialValue);
			case PythonpipelinePackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case PythonpipelinePackage.NUL_VALUES_POLICY:
				return createNulValuesPolicyFromString(eDataType, initialValue);
			case PythonpipelinePackage.KERNEL_FUNCTION:
				return createKernelFunctionFromString(eDataType, initialValue);
			case PythonpipelinePackage.INTER_CLUSTER_SIMILARITY:
				return createInterClusterSimilarityFromString(eDataType, initialValue);
			case PythonpipelinePackage.SOURCE_TYPE:
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
			case PythonpipelinePackage.FORMAT:
				return convertFormatToString(eDataType, instanceValue);
			case PythonpipelinePackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case PythonpipelinePackage.NUL_VALUES_POLICY:
				return convertNulValuesPolicyToString(eDataType, instanceValue);
			case PythonpipelinePackage.KERNEL_FUNCTION:
				return convertKernelFunctionToString(eDataType, instanceValue);
			case PythonpipelinePackage.INTER_CLUSTER_SIMILARITY:
				return convertInterClusterSimilarityToString(eDataType, instanceValue);
			case PythonpipelinePackage.SOURCE_TYPE:
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
	public StandardDeviation createStandardDeviation() {
		StandardDeviationImpl standardDeviation = new StandardDeviationImpl();
		return standardDeviation;
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
	public SupportVector createSupportVector() {
		SupportVectorImpl supportVector = new SupportVectorImpl();
		return supportVector;
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
	public PythonpipelinePackage getPythonpipelinePackage() {
		return (PythonpipelinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PythonpipelinePackage getPackage() {
		return PythonpipelinePackage.eINSTANCE;
	}

} //PythonpipelineFactoryImpl
