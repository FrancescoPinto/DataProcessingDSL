/**
 */
package pipelineproject.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pipelineproject.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pipelineproject.PipelineprojectPackage
 * @generated
 */
public class PipelineprojectValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PipelineprojectValidator INSTANCE = new PipelineprojectValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pipelineproject";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineprojectValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PipelineprojectPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PipelineprojectPackage.PIPELINE:
				return validatePipeline((Pipeline)value, diagnostics, context);
			case PipelineprojectPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case PipelineprojectPackage.DATA_FLOW:
				return validateDataFlow((DataFlow)value, diagnostics, context);
			case PipelineprojectPackage.DATA_COLLECTION:
				return validateDataCollection((DataCollection)value, diagnostics, context);
			case PipelineprojectPackage.DATA_INTEGRATION:
				return validateDataIntegration((DataIntegration)value, diagnostics, context);
			case PipelineprojectPackage.DATA_ANALYSIS:
				return validateDataAnalysis((DataAnalysis)value, diagnostics, context);
			case PipelineprojectPackage.DATA_CLEANING:
				return validateDataCleaning((DataCleaning)value, diagnostics, context);
			case PipelineprojectPackage.DATA_VISUALIZATION:
				return validateDataVisualization((DataVisualization)value, diagnostics, context);
			case PipelineprojectPackage.EXPORT:
				return validateExport((Export)value, diagnostics, context);
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION:
				return validateInputSourceDeclaration((InputSourceDeclaration)value, diagnostics, context);
			case PipelineprojectPackage.OUTPUT_FILE:
				return validateOutputFile((OutputFile)value, diagnostics, context);
			case PipelineprojectPackage.CLASSIFICATION:
				return validateClassification((Classification)value, diagnostics, context);
			case PipelineprojectPackage.PREDICTION:
				return validatePrediction((Prediction)value, diagnostics, context);
			case PipelineprojectPackage.CLUSTERING:
				return validateClustering((Clustering)value, diagnostics, context);
			case PipelineprojectPackage.DESCRIPTION:
				return validateDescription((Description)value, diagnostics, context);
			case PipelineprojectPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case PipelineprojectPackage.NULL_VALUES_REMOVAL:
				return validateNullValuesRemoval((NullValuesRemoval)value, diagnostics, context);
			case PipelineprojectPackage.CUSTOM_CLEANING:
				return validateCustomCleaning((CustomCleaning)value, diagnostics, context);
			case PipelineprojectPackage.SCHEMA:
				return validateSchema((Schema)value, diagnostics, context);
			case PipelineprojectPackage.JOIN_ATTRIBUTES_LIST:
				return validateJoinAttributesList((JoinAttributesList)value, diagnostics, context);
			case PipelineprojectPackage.RUNTIME_INFO:
				return validateRuntimeInfo((RuntimeInfo)value, diagnostics, context);
			case PipelineprojectPackage.CHANGE_DATA_FORMAT:
				return validateChangeDataFormat((ChangeDataFormat)value, diagnostics, context);
			case PipelineprojectPackage.KNN:
				return validateKNN((KNN)value, diagnostics, context);
			case PipelineprojectPackage.SVM:
				return validateSVM((SVM)value, diagnostics, context);
			case PipelineprojectPackage.KMEANS:
				return validateKMeans((KMeans)value, diagnostics, context);
			case PipelineprojectPackage.HIERARCHICAL:
				return validateHierarchical((Hierarchical)value, diagnostics, context);
			case PipelineprojectPackage.AGGLOMERATIVE:
				return validateAgglomerative((Agglomerative)value, diagnostics, context);
			case PipelineprojectPackage.DBSCAN:
				return validateDBSCAN((DBSCAN)value, diagnostics, context);
			case PipelineprojectPackage.JARVIS_PATRICK:
				return validateJarvisPatrick((JarvisPatrick)value, diagnostics, context);
			case PipelineprojectPackage.LINEAR_REGRESSION:
				return validateLinearRegression((LinearRegression)value, diagnostics, context);
			case PipelineprojectPackage.RIDGE:
				return validateRidge((Ridge)value, diagnostics, context);
			case PipelineprojectPackage.LASSO:
				return validateLasso((Lasso)value, diagnostics, context);
			case PipelineprojectPackage.MEAN:
				return validateMean((Mean)value, diagnostics, context);
			case PipelineprojectPackage.MEDIAN:
				return validateMedian((Median)value, diagnostics, context);
			case PipelineprojectPackage.VARIANCE:
				return validateVariance((Variance)value, diagnostics, context);
			case PipelineprojectPackage.LOGIC_PROPOSITION:
				return validateLogicProposition((LogicProposition)value, diagnostics, context);
			case PipelineprojectPackage.NOT_CLAUSE:
				return validateNotClause((NotClause)value, diagnostics, context);
			case PipelineprojectPackage.MULTI_OPERAND_CLAUSE:
				return validateMultiOperandClause((MultiOperandClause)value, diagnostics, context);
			case PipelineprojectPackage.AND_CLAUSE:
				return validateAndClause((AndClause)value, diagnostics, context);
			case PipelineprojectPackage.OR_CLAUSE:
				return validateOrClause((OrClause)value, diagnostics, context);
			case PipelineprojectPackage.VALUE_CLAUSE:
				return validateValueClause((ValueClause)value, diagnostics, context);
			case PipelineprojectPackage.LT_CLAUSE:
				return validateLtClause((LtClause)value, diagnostics, context);
			case PipelineprojectPackage.GT_CLAUSE:
				return validateGtClause((GtClause)value, diagnostics, context);
			case PipelineprojectPackage.EQ_CLAUSE:
				return validateEqClause((EqClause)value, diagnostics, context);
			case PipelineprojectPackage.LE_CLAUSE:
				return validateLeClause((LeClause)value, diagnostics, context);
			case PipelineprojectPackage.GE_CLAUSE:
				return validateGeClause((GeClause)value, diagnostics, context);
			case PipelineprojectPackage.CONTAINS_CLAUSE:
				return validateContainsClause((ContainsClause)value, diagnostics, context);
			case PipelineprojectPackage.QUERY_PARAM:
				return validateQueryParam((QueryParam)value, diagnostics, context);
			case PipelineprojectPackage.CUSTOM_PARAM:
				return validateCustomParam((CustomParam)value, diagnostics, context);
			case PipelineprojectPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case PipelineprojectPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case PipelineprojectPackage.LOGISTIC_REGRESSION:
				return validateLogisticRegression((LogisticRegression)value, diagnostics, context);
			case PipelineprojectPackage.SKEWNESS:
				return validateSkewness((Skewness)value, diagnostics, context);
			case PipelineprojectPackage.SCATTER_PLOT:
				return validateScatterPlot((ScatterPlot)value, diagnostics, context);
			case PipelineprojectPackage.LABELED_SCATTER_PLOT:
				return validateLabeledScatterPlot((LabeledScatterPlot)value, diagnostics, context);
			case PipelineprojectPackage.HISTOGRAM:
				return validateHistogram((Histogram)value, diagnostics, context);
			case PipelineprojectPackage.PIE_PLOT:
				return validatePiePlot((PiePlot)value, diagnostics, context);
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES:
				return validateProjectOnAttributes((ProjectOnAttributes)value, diagnostics, context);
			case PipelineprojectPackage.FORMAT:
				return validateFormat((Format)value, diagnostics, context);
			case PipelineprojectPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case PipelineprojectPackage.NUL_VALUES_POLICY:
				return validateNulValuesPolicy((NulValuesPolicy)value, diagnostics, context);
			case PipelineprojectPackage.KERNEL_FUNCTION:
				return validateKernelFunction((KernelFunction)value, diagnostics, context);
			case PipelineprojectPackage.INTER_CLUSTER_SIMILARITY:
				return validateInterClusterSimilarity((InterClusterSimilarity)value, diagnostics, context);
			case PipelineprojectPackage.SOURCE_TYPE:
				return validateSourceType((SourceType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pipeline, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validatePipeline_UniqueTaskId(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validatePipeline_UniqueDataflowId(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validatePipeline_UniqueRuntimeInfoId(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validatePipeline_UniqueSchemaId(pipeline, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueTaskId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIPELINE__UNIQUE_TASK_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Task id should be unique',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tTask.allInstances()->forAll(t1,t2|t1<>t2 implies t1.id <> t2.id)\n" +
		"}.status";

	/**
	 * Validates the UniqueTaskId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline_UniqueTaskId(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PIPELINE,
				 pipeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueTaskId",
				 PIPELINE__UNIQUE_TASK_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueDataflowId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIPELINE__UNIQUE_DATAFLOW_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Dataflow id should be unique',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tDataFlow.allInstances()->forAll(d1,d2|d1<>d2 implies d1.id<>d2.id)\n" +
		"}.status";

	/**
	 * Validates the UniqueDataflowId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline_UniqueDataflowId(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PIPELINE,
				 pipeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueDataflowId",
				 PIPELINE__UNIQUE_DATAFLOW_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueRuntimeInfoId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIPELINE__UNIQUE_RUNTIME_INFO_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Runtime info id should be unique',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tRuntimeInfo.allInstances()->forAll(r1,r2|r1<>r2 implies r1.executionId <> r2.executionId)\n" +
		"}.status";

	/**
	 * Validates the UniqueRuntimeInfoId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline_UniqueRuntimeInfoId(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PIPELINE,
				 pipeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueRuntimeInfoId",
				 PIPELINE__UNIQUE_RUNTIME_INFO_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueSchemaId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIPELINE__UNIQUE_SCHEMA_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Schema id should be unique',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tSchema.allInstances()->forAll(s1,s2|s1<>s2 implies s1.id <> s2.id)\n" +
		"}.status";

	/**
	 * Validates the UniqueSchemaId constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline_UniqueSchemaId(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PIPELINE,
				 pipeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueSchemaId",
				 PIPELINE__UNIQUE_SCHEMA_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(task, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TasksWithOneAndOnlyOneInputAndInputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_ONE_AND_ONLY_ONE_INPUT_AND_INPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The task should have one and only one input dataflow and one and only one input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export) or self.oclIsTypeOf(ProjectOnAttributes))\n" +
		" \t\t\t\timplies (self.input <> null and self.input->size() = 1 and self.inputSchema <> null and self.inputSchema->size() = 1)\n" +
		"}.status";

	/**
	 * Validates the TasksWithOneAndOnlyOneInputAndInputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithOneAndOnlyOneInputAndInputSchema",
				 TASK__TASKS_WITH_ONE_AND_ONLY_ONE_INPUT_AND_INPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithNoInputAndNoInputSchmea constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_NO_INPUT_AND_NO_INPUT_SCHMEA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The task should have no input dataflow and no input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.oclIsTypeOf(DataCollection) implies (self.input->size() = 0 and self.inputSchema->size() = 0)\n" +
		"}.status";

	/**
	 * Validates the TasksWithNoInputAndNoInputSchmea constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithNoInputAndNoInputSchmea(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithNoInputAndNoInputSchmea",
				 TASK__TASKS_WITH_NO_INPUT_AND_NO_INPUT_SCHMEA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithOneOrMoreInputAndInputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_ONE_OR_MORE_INPUT_AND_INPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The task should have two or more input dataflow and input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.oclIsTypeOf(DataIntegration) implies (self.input->size() > 1)\n" +
		"}.status";

	/**
	 * Validates the TasksWithOneOrMoreInputAndInputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithOneOrMoreInputAndInputSchema(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithOneOrMoreInputAndInputSchema",
				 TASK__TASKS_WITH_ONE_OR_MORE_INPUT_AND_INPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithInputShouldHaveConsistentSchemas constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_INPUT_SHOULD_HAVE_CONSISTENT_SCHEMAS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The inputSchema should be consistent with the input dataflow schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t--self.input <>null and self.input->size() > 0 implied by other rule\n" +
		"\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export) or self.oclIsTypeOf(DataIntegration))\n" +
		"\t\t\t implies (self.input.typeOfData->forAll(s| self.inputSchema->includes(s)) and self.input.typeOfData->size() = self.inputSchema->size())\n" +
		"}.status";

	/**
	 * Validates the TasksWithInputShouldHaveConsistentSchemas constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithInputShouldHaveConsistentSchemas(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithInputShouldHaveConsistentSchemas",
				 TASK__TASKS_WITH_INPUT_SHOULD_HAVE_CONSISTENT_SCHEMAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithNoOutputAndNoOutputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_NO_OUTPUT_AND_NO_OUTPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The task should have no output dataflow and no output schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.oclIsTypeOf(Export) implies (self.output->size() = 0 and self.outputSchema->size() = 0)\n" +
		"}.status";

	/**
	 * Validates the TasksWithNoOutputAndNoOutputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithNoOutputAndNoOutputSchema(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithNoOutputAndNoOutputSchema",
				 TASK__TASKS_WITH_NO_OUTPUT_AND_NO_OUTPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithOutput constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_OUTPUT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The task should have output dataflow and output schema',\n" +
		"\tstatus : Boolean = \t\n" +
		"\t\t\t not self.oclIsTypeOf(Export) implies (self.output->size() > 0 and not self.outputSchema.oclIsUndefined())\n" +
		"}.status";

	/**
	 * Validates the TasksWithOutput constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithOutput(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithOutput",
				 TASK__TASKS_WITH_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithOutputShouldHaveConsistentOutputSchemas constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_OUTPUT_SHOULD_HAVE_CONSISTENT_OUTPUT_SCHEMAS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The outputSchema should be consistent with the output dataflow schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\t--self.output <> null and self.output->size() > 0 \n" +
		"\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsTypeOf(DataCollection) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(DataIntegration))\n" +
		"\t\t\timplies (self.output.typeOfData->forAll(s| s = self.outputSchema))\n" +
		"}.status";

	/**
	 * Validates the TasksWithOutputShouldHaveConsistentOutputSchemas constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithOutputShouldHaveConsistentOutputSchemas",
				 TASK__TASKS_WITH_OUTPUT_SHOULD_HAVE_CONSISTENT_OUTPUT_SCHEMAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConsistentInputOutputFormat constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__CONSISTENT_INPUT_OUTPUT_FORMAT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The input/output format of dataflows to/from the task should be the same',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\t(not self.oclIsTypeOf(ChangeDataFormat)) implies \n" +
		"\t\t\t\t(self.output->forAll(o| self.input->forAll(i| i.format = o.format)))\n" +
		"}.status";

	/**
	 * Validates the ConsistentInputOutputFormat constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ConsistentInputOutputFormat(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentInputOutputFormat",
				 TASK__CONSISTENT_INPUT_OUTPUT_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConsistentFormatConversion1 constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__CONSISTENT_FORMAT_CONVERSION1__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The format conversion should make sense (i.e. input != output format)',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.oclIsTypeOf(ChangeDataFormat) implies \n" +
		"\t\t\t\t(self.oclAsType(ChangeDataFormat)).outputFormat <> (self.oclAsType(ChangeDataFormat)).inputFormat\n" +
		"}.status";

	/**
	 * Validates the ConsistentFormatConversion1 constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ConsistentFormatConversion1(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentFormatConversion1",
				 TASK__CONSISTENT_FORMAT_CONVERSION1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConsistentFormatConversion2 constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__CONSISTENT_FORMAT_CONVERSION2__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The format of input/output dataflow should be consistent',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.oclIsTypeOf(ChangeDataFormat) implies\n" +
		"\t\t\t\t(self.oclAsType(ChangeDataFormat)).output.format->forAll(f| f = (self.oclAsType(ChangeDataFormat)).outputFormat)\n" +
		"\t\t\t\t\tand\n" +
		"\t\t\t\t(self.oclAsType(ChangeDataFormat)).input.format->forAll(f| f =(self.oclAsType(ChangeDataFormat)).inputFormat)\n" +
		"}.status";

	/**
	 * Validates the ConsistentFormatConversion2 constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_ConsistentFormatConversion2(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentFormatConversion2",
				 TASK__CONSISTENT_FORMAT_CONVERSION2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StartTimeAfterPreviousTasksEndTime constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__START_TIME_AFTER_PREVIOUS_TASKS_END_TIME__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Start time of the task should come after the End time of previous tasks',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\t self.input.from.runtimeInfo->select(r| self.runtimeInfo.startTime < r.endTime)->size() = 0\n" +
		"}.status";

	/**
	 * Validates the StartTimeAfterPreviousTasksEndTime constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_StartTimeAfterPreviousTasksEndTime(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StartTimeAfterPreviousTasksEndTime",
				 TASK__START_TIME_AFTER_PREVIOUS_TASKS_END_TIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DataVisualizationOutputMustContainAtLeastOneImage constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__DATA_VISUALIZATION_OUTPUT_MUST_CONTAIN_AT_LEAST_ONE_IMAGE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Datavisualization tasks should produce, in output, at least one image',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t \tself.oclIsKindOf(DataVisualization) implies (not self.outputSchema.oclIsUndefined() implies self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() > 0)\n" +
		"}.status";

	/**
	 * Validates the DataVisualizationOutputMustContainAtLeastOneImage constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_DataVisualizationOutputMustContainAtLeastOneImage(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataVisualizationOutputMustContainAtLeastOneImage",
				 TASK__DATA_VISUALIZATION_OUTPUT_MUST_CONTAIN_AT_LEAST_ONE_IMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NotDataVisualizationOrExportShouldNotProcessImages constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__NOT_DATA_VISUALIZATION_OR_EXPORT_SHOULD_NOT_PROCESS_IMAGES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Tasks other than data visualization and export are not supposed to process images',\n" +
		"\tstatus : Boolean = \n" +
		" \t\t\tnot (self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export)) implies \n" +
		" \t\t\t(not self.outputSchema.oclIsUndefined() implies self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 0) \n" +
		" \t\t\t\tand (not (self.inputSchema->size() <> 0) implies self.inputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 0)\n" +
		"}.status";

	/**
	 * Validates the NotDataVisualizationOrExportShouldNotProcessImages constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_NotDataVisualizationOrExportShouldNotProcessImages(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NotDataVisualizationOrExportShouldNotProcessImages",
				 TASK__NOT_DATA_VISUALIZATION_OR_EXPORT_SHOULD_NOT_PROCESS_IMAGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the JoinShouldHaveDataWithSameFormatInInput constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__JOIN_SHOULD_HAVE_DATA_WITH_SAME_FORMAT_IN_INPUT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'DataIntegration tasks should have inputs with same format (use ChangeDataFormat nodes if needed)',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.oclIsTypeOf(DataIntegration) implies self.input.format->asSet()->size() = 1\n" +
		"}.status";

	/**
	 * Validates the JoinShouldHaveDataWithSameFormatInInput constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_JoinShouldHaveDataWithSameFormatInInput(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JoinShouldHaveDataWithSameFormatInInput",
				 TASK__JOIN_SHOULD_HAVE_DATA_WITH_SAME_FORMAT_IN_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithSameInputAndOutputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_SAME_INPUT_AND_OUTPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'ChangeData/NullValuesRemoval/Descriptions tasks should have same input and output schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.oclIsTypeOf(ChangeDataFormat) or self.oclIsTypeOf(NullValuesRemoval) or self.oclIsKindOf(Description) implies self.inputSchema->forAll(is| is = self.outputSchema)\n" +
		"}.status";

	/**
	 * Validates the TasksWithSameInputAndOutputSchema constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithSameInputAndOutputSchema(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithSameInputAndOutputSchema",
				 TASK__TASKS_WITH_SAME_INPUT_AND_OUTPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksWithIDCopyShouldHaveSchemaWithCopiedID constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_WITH_ID_COPY_SHOULD_HAVE_SCHEMA_WITH_COPIED_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Tasks that can mantain the row identity from input to output should mark the fact that the ID value is copied from the input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.oclIsKindOf(DataCleaning) or self.oclIsKindOf(Prediction) or self.oclIsKindOf(Classification) or self.oclIsKindOf(Clustering) implies \n" +
		"\t\t((self.outputSchema.idColumn <> self.inputSchema->first().idColumn) implies self.outputSchema.idColumn.copies = self.inputSchema->first().idColumn)\n" +
		"}.status";

	/**
	 * Validates the TasksWithIDCopyShouldHaveSchemaWithCopiedID constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksWithIDCopyShouldHaveSchemaWithCopiedID",
				 TASK__TASKS_WITH_ID_COPY_SHOULD_HAVE_SCHEMA_WITH_COPIED_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__TASKS_THAT_DONT_ALLOW_ID_COPY_SHOULDNT_HAVE_SCHEMA_WITH_COPIED_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Tasks that can not mantain the row identity from input to output shouldn\\'t mark the fact that the ID value is copied from the input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tnot(self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(Prediction) or self.oclIsKindOf(Classification) or self.oclIsKindOf(Clustering)) implies\n" +
		"\t\t((not self.outputSchema.oclIsUndefined()) implies self.outputSchema.idColumn.copies = null)\n" +
		"}.status";

	/**
	 * Validates the TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID",
				 TASK__TASKS_THAT_DONT_ALLOW_ID_COPY_SHOULDNT_HAVE_SCHEMA_WITH_COPIED_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlow(DataFlow dataFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollection(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(dataCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(dataCollection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataIntegration(DataIntegration dataIntegration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataIntegration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataIntegration_JoinAttributesShouldBeOverAllSchemas(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataIntegration_AttributeContainedInSchema(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataIntegration_JoinAttributesSameType(dataIntegration, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataIntegration_JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes(dataIntegration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the JoinAttributesShouldBeOverAllSchemas constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_INTEGRATION__JOIN_ATTRIBUTES_SHOULD_BE_OVER_ALL_SCHEMAS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Join attribute lists should be over all the input tables',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes->size() = self.inputSchema->size()\n" +
		"}.status";

	/**
	 * Validates the JoinAttributesShouldBeOverAllSchemas constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataIntegration_JoinAttributesShouldBeOverAllSchemas(DataIntegration dataIntegration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DATA_INTEGRATION,
				 dataIntegration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JoinAttributesShouldBeOverAllSchemas",
				 DATA_INTEGRATION__JOIN_ATTRIBUTES_SHOULD_BE_OVER_ALL_SCHEMAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AttributeContainedInSchema constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_INTEGRATION__ATTRIBUTE_CONTAINED_IN_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Each attribute in a list should be contained once and only once in an input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes->forAll(j| self.inputSchema->select(s|s.attributes->includes(j) or s.idColumn = j)->size() = 1)\n" +
		"}.status";

	/**
	 * Validates the AttributeContainedInSchema constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataIntegration_AttributeContainedInSchema(DataIntegration dataIntegration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DATA_INTEGRATION,
				 dataIntegration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributeContainedInSchema",
				 DATA_INTEGRATION__ATTRIBUTE_CONTAINED_IN_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the JoinAttributesSameType constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_INTEGRATION__JOIN_ATTRIBUTES_SAME_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Join attributes should have same type',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes.type->asSet()->size() = 1\n" +
		"}.status";

	/**
	 * Validates the JoinAttributesSameType constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataIntegration_JoinAttributesSameType(DataIntegration dataIntegration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DATA_INTEGRATION,
				 dataIntegration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JoinAttributesSameType",
				 DATA_INTEGRATION__JOIN_ATTRIBUTES_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_INTEGRATION__JOINED_OUTPUT_SCHEMA_SHOULD_HAVE_ONE_KEY_AND_CONTAIN_ALL_OTHER_ATTRIBUTES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Output schema of join should contain at most one attribute identical to the first attribute in the joinAttributesList (0 if it is a generatedID join), and all the attributes in the input tables',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tnot self.joinAttributesList.oclIsUndefined() and\n" +
		"\t\t\tself.outputSchema.attributes->select(a| self.joinAttributesList.joinAttributes->first().name = a.name and a.type = self.joinAttributesList.joinAttributes->first().type)->size() <= 1 and\n" +
		"\t\t\tself.outputSchema.attributes->forAll(a| self.inputSchema.attributes->select(a1|a1.name = a.name and a1.type = a.type)->size() >= 1 or (self.joinAttributesList.joinAttributes->first().name = a.name and a.type = self.joinAttributesList.joinAttributes->first().type))\n" +
		"}.status";

	/**
	 * Validates the JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes constraint of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataIntegration_JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes(DataIntegration dataIntegration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DATA_INTEGRATION,
				 dataIntegration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes",
				 DATA_INTEGRATION__JOINED_OUTPUT_SCHEMA_SHOULD_HAVE_ONE_KEY_AND_CONTAIN_ALL_OTHER_ATTRIBUTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAnalysis(DataAnalysis dataAnalysis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAnalysis, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(dataAnalysis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(dataAnalysis, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCleaning(DataCleaning dataCleaning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataCleaning, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(dataCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(dataCleaning, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataVisualization(DataVisualization dataVisualization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataVisualization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(dataVisualization, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(dataVisualization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExport(Export export, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(export, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(export, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(export, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(export, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSourceDeclaration(InputSourceDeclaration inputSourceDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputSourceDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFile(OutputFile outputFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputFile_OutputFileNotEmptyName(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputFile_OutputFile_NotEmptyPath(outputFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputFile_OutputFile_ConsistentFileFormat(outputFile, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OutputFileNotEmptyName constraint of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT_FILE__OUTPUT_FILE_NOT_EMPTY_NAME__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'File Name should not be empty',\n" +
		"\tstatus : Boolean = self.name.size()> 0 or self.name <> null\n" +
		"}.status";

	/**
	 * Validates the OutputFileNotEmptyName constraint of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFile_OutputFileNotEmptyName(OutputFile outputFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.OUTPUT_FILE,
				 outputFile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutputFileNotEmptyName",
				 OUTPUT_FILE__OUTPUT_FILE_NOT_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutputFile_NotEmptyPath constraint of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT_FILE__OUTPUT_FILE_NOT_EMPTY_PATH__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'File Path should not be empty',\n" +
		"\tstatus : Boolean = self.storagePath.size()> 0 or self.storagePath <> null\n" +
		"}.status";

	/**
	 * Validates the OutputFile_NotEmptyPath constraint of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFile_OutputFile_NotEmptyPath(OutputFile outputFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.OUTPUT_FILE,
				 outputFile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutputFile_NotEmptyPath",
				 OUTPUT_FILE__OUTPUT_FILE_NOT_EMPTY_PATH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutputFile_ConsistentFileFormat constraint of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT_FILE__OUTPUT_FILE_CONSISTENT_FILE_FORMAT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'File format should be the same as the one of the input dataflow. To perform format conversion, use a ChangeDataFormat Task',\n" +
		"\tstatus : Boolean = \n" +
		"\t \tself.fileFormat = self.export.input->first().format\n" +
		"}.status";

	/**
	 * Validates the OutputFile_ConsistentFileFormat constraint of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFile_OutputFile_ConsistentFileFormat(OutputFile outputFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.OUTPUT_FILE,
				 outputFile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutputFile_ConsistentFileFormat",
				 OUTPUT_FILE__OUTPUT_FILE_CONSISTENT_FILE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassification_ClassificationIsForClassLabels(classification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ClassificationIsForClassLabels constraint of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFICATION__CLASSIFICATION_IS_FOR_CLASS_LABELS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Classification output should be only for class labels!',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.outputSchema.attributes->forAll(a|a.type = Type::_'String')\n" +
		"}.status";

	/**
	 * Validates the ClassificationIsForClassLabels constraint of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification_ClassificationIsForClassLabels(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.CLASSIFICATION,
				 classification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ClassificationIsForClassLabels",
				 CLASSIFICATION__CLASSIFICATION_IS_FOR_CLASS_LABELS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrediction(Prediction prediction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prediction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(prediction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrediction_PredictionIsForRealResponse(prediction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PredictionIsForRealResponse constraint of '<em>Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PREDICTION__PREDICTION_IS_FOR_REAL_RESPONSE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Prediction output should be only for real response!',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.outputSchema.attributes->forAll(a|a.type = Type::Float)\n" +
		"}.status";

	/**
	 * Validates the PredictionIsForRealResponse constraint of '<em>Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrediction_PredictionIsForRealResponse(Prediction prediction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PREDICTION,
				 prediction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PredictionIsForRealResponse",
				 PREDICTION__PREDICTION_IS_FOR_REAL_RESPONSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClustering(Clustering clustering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clustering, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(clustering, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(clustering, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentNumberOfInputOutputColumns(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentOperationsOverTypeOfData(description, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConsistentNumberOfInputOutputColumns constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTION__CONSISTENT_NUMBER_OF_INPUT_OUTPUT_COLUMNS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Mean/median/variance/skeweness compute mean/median/variance/skeweness by column, inputSchema and outputSchema should have the same number of attirbutes',\n" +
		"\tstatus : Boolean = \n" +
		"\t \tself.oclIsTypeOf(Mean) or self.oclIsTypeOf(Median) or self.oclIsTypeOf(Variance) or self.oclIsTypeOf(Skewness)\n" +
		"\t\timplies self.inputSchema->size() = 1 and self.inputSchema->first().attributes->size() = self.outputSchema.attributes->size()\n" +
		"}.status";

	/**
	 * Validates the ConsistentNumberOfInputOutputColumns constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_ConsistentNumberOfInputOutputColumns(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DESCRIPTION,
				 description,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentNumberOfInputOutputColumns",
				 DESCRIPTION__CONSISTENT_NUMBER_OF_INPUT_OUTPUT_COLUMNS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConsistentOperationsOverTypeOfData constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTION__CONSISTENT_OPERATIONS_OVER_TYPE_OF_DATA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Mean/variance/skeweness only make sense over numerical data',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.oclIsTypeOf(Mean) or self.oclIsTypeOf(Variance) or self.oclIsTypeOf(Skewness) implies\n" +
		"\t\tself.outputSchema.attributes->forAll(a|a.type = Type::Float or a.type = Type::Int)\n" +
		"}.status";

	/**
	 * Validates the ConsistentOperationsOverTypeOfData constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_ConsistentOperationsOverTypeOfData(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DESCRIPTION,
				 description,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentOperationsOverTypeOfData",
				 DESCRIPTION__CONSISTENT_OPERATIONS_OVER_TYPE_OF_DATA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullValuesRemoval(NullValuesRemoval nullValuesRemoval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nullValuesRemoval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(nullValuesRemoval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(nullValuesRemoval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomCleaning(CustomCleaning customCleaning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customCleaning, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(customCleaning, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(customCleaning, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schema, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schema, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchema_UniqueAttributeNameInSameSchema(schema, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueAttributeNameInSameSchema constraint of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCHEMA__UNIQUE_ATTRIBUTE_NAME_IN_SAME_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Attribute name in same schema should be unique',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.attributes->forAll(a1,a2| a1 <> a2 implies a1.name <> a2.name)\n" +
		"}.status";

	/**
	 * Validates the UniqueAttributeNameInSameSchema constraint of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema_UniqueAttributeNameInSameSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.SCHEMA,
				 schema,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueAttributeNameInSameSchema",
				 SCHEMA__UNIQUE_ATTRIBUTE_NAME_IN_SAME_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinAttributesList(JoinAttributesList joinAttributesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(joinAttributesList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeInfo(RuntimeInfo runtimeInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeInfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeInfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeInfo_StartTimeBeforeEndTime(runtimeInfo, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StartTimeBeforeEndTime constraint of '<em>Runtime Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RUNTIME_INFO__START_TIME_BEFORE_END_TIME__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Start time must come before End time in a same task',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.startTime < self.endTime\n" +
		"}.status";

	/**
	 * Validates the StartTimeBeforeEndTime constraint of '<em>Runtime Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeInfo_StartTimeBeforeEndTime(RuntimeInfo runtimeInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.RUNTIME_INFO,
				 runtimeInfo,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StartTimeBeforeEndTime",
				 RUNTIME_INFO__START_TIME_BEFORE_END_TIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeDataFormat(ChangeDataFormat changeDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(changeDataFormat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(changeDataFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(changeDataFormat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKNN(KNN knn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(knn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassification_ClassificationIsForClassLabels(knn, diagnostics, context);
		if (result || diagnostics != null) result &= validateKNN_KGreaterThanZero(knn, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the KGreaterThanZero constraint of '<em>KNN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KNN__KGREATER_THAN_ZERO__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'K should be greater than zero',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.K > 0\n" +
		"}.status";

	/**
	 * Validates the KGreaterThanZero constraint of '<em>KNN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKNN_KGreaterThanZero(KNN knn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.KNN,
				 knn,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "KGreaterThanZero",
				 KNN__KGREATER_THAN_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSVM(SVM svm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(svm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(svm, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassification_ClassificationIsForClassLabels(svm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKMeans(KMeans kMeans, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(kMeans, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(kMeans, diagnostics, context);
		if (result || diagnostics != null) result &= validateKMeans_positiveK(kMeans, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveK constraint of '<em>KMeans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KMEANS__POSITIVE_K__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'K should be positive',\n" +
		"\tstatus : Boolean = self.K > 0\n" +
		"}.status";

	/**
	 * Validates the positiveK constraint of '<em>KMeans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKMeans_positiveK(KMeans kMeans, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.KMEANS,
				 kMeans,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "positiveK",
				 KMEANS__POSITIVE_K__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchical(Hierarchical hierarchical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hierarchical, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(hierarchical, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(hierarchical, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgglomerative(Agglomerative agglomerative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agglomerative, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(agglomerative, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgglomerative_CutHeightGe1(agglomerative, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CutHeightGe1 constraint of '<em>Agglomerative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AGGLOMERATIVE__CUT_HEIGHT_GE1__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Cut Height >= 1',\n" +
		"\tstatus : Boolean = self.CutHeight >= 1\n" +
		"}.status";

	/**
	 * Validates the CutHeightGe1 constraint of '<em>Agglomerative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgglomerative_CutHeightGe1(Agglomerative agglomerative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.AGGLOMERATIVE,
				 agglomerative,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CutHeightGe1",
				 AGGLOMERATIVE__CUT_HEIGHT_GE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBSCAN(DBSCAN dbscan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dbscan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(dbscan, diagnostics, context);
		if (result || diagnostics != null) result &= validateDBSCAN_PositiveRadiusAndThreshold(dbscan, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositiveRadiusAndThreshold constraint of '<em>DBSCAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBSCAN__POSITIVE_RADIUS_AND_THRESHOLD__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The radius and the threshold should be positive',\n" +
		"\tstatus : Boolean = self.radius > 0 and self.threshold > 0\n" +
		"}.status";

	/**
	 * Validates the PositiveRadiusAndThreshold constraint of '<em>DBSCAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBSCAN_PositiveRadiusAndThreshold(DBSCAN dbscan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.DBSCAN,
				 dbscan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveRadiusAndThreshold",
				 DBSCAN__POSITIVE_RADIUS_AND_THRESHOLD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJarvisPatrick(JarvisPatrick jarvisPatrick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jarvisPatrick, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(jarvisPatrick, diagnostics, context);
		if (result || diagnostics != null) result &= validateJarvisPatrick_PositiveKAndThreshold(jarvisPatrick, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositiveKAndThreshold constraint of '<em>Jarvis Patrick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JARVIS_PATRICK__POSITIVE_KAND_THRESHOLD__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The K and threshold should be positive',\n" +
		"\tstatus : Boolean = self.K > 0 and self.threshold > 0\n" +
		"}.status";

	/**
	 * Validates the PositiveKAndThreshold constraint of '<em>Jarvis Patrick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJarvisPatrick_PositiveKAndThreshold(JarvisPatrick jarvisPatrick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.JARVIS_PATRICK,
				 jarvisPatrick,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveKAndThreshold",
				 JARVIS_PATRICK__POSITIVE_KAND_THRESHOLD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearRegression(LinearRegression linearRegression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linearRegression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrediction_PredictionIsForRealResponse(linearRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearRegression_ConsistentNumberOfEstimatedCoefficients(linearRegression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConsistentNumberOfEstimatedCoefficients constraint of '<em>Linear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINEAR_REGRESSION__CONSISTENT_NUMBER_OF_ESTIMATED_COEFFICIENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The number of estimated coefficients should correspond to the number of input predictors, i.e. columns of inputSchema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.estimatedCoefficients->size() = self.inputSchema->first().attributes->size()+1\n" +
		"}.status";

	/**
	 * Validates the ConsistentNumberOfEstimatedCoefficients constraint of '<em>Linear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearRegression_ConsistentNumberOfEstimatedCoefficients(LinearRegression linearRegression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.LINEAR_REGRESSION,
				 linearRegression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentNumberOfEstimatedCoefficients",
				 LINEAR_REGRESSION__CONSISTENT_NUMBER_OF_ESTIMATED_COEFFICIENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRidge(Ridge ridge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ridge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrediction_PredictionIsForRealResponse(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearRegression_ConsistentNumberOfEstimatedCoefficients(ridge, diagnostics, context);
		if (result || diagnostics != null) result &= validateRidge_PositivePenaltyFactor(ridge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositivePenaltyFactor constraint of '<em>Ridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RIDGE__POSITIVE_PENALTY_FACTOR__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Penalty factor should be positive, otherwise, if it is zero, use plain linear regression',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.penaltyFactor > 0\n" +
		"}.status";

	/**
	 * Validates the PositivePenaltyFactor constraint of '<em>Ridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRidge_PositivePenaltyFactor(Ridge ridge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.RIDGE,
				 ridge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositivePenaltyFactor",
				 RIDGE__POSITIVE_PENALTY_FACTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLasso(Lasso lasso, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lasso, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrediction_PredictionIsForRealResponse(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearRegression_ConsistentNumberOfEstimatedCoefficients(lasso, diagnostics, context);
		if (result || diagnostics != null) result &= validateLasso_PositivePenaltyFactor(lasso, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositivePenaltyFactor constraint of '<em>Lasso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LASSO__POSITIVE_PENALTY_FACTOR__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Penalty factor should be positive, otherwise, if it is zero, use plain linear regression',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.penaltyFactor > 0\n" +
		"}.status";

	/**
	 * Validates the PositivePenaltyFactor constraint of '<em>Lasso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLasso_PositivePenaltyFactor(Lasso lasso, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.LASSO,
				 lasso,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositivePenaltyFactor",
				 LASSO__POSITIVE_PENALTY_FACTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMean(Mean mean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentNumberOfInputOutputColumns(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentOperationsOverTypeOfData(mean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedian(Median median, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(median, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(median, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentNumberOfInputOutputColumns(median, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentOperationsOverTypeOfData(median, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariance(Variance variance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentNumberOfInputOutputColumns(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentOperationsOverTypeOfData(variance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicProposition(LogicProposition logicProposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicProposition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotClause(NotClause notClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notClause, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiOperandClause(MultiOperandClause multiOperandClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiOperandClause, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAndClause(AndClause andClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(andClause, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrClause(OrClause orClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orClause, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueClause(ValueClause valueClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(valueClause, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConsistenValueClauseTypes constraint of '<em>Value Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_CLAUSE__CONSISTEN_VALUE_CLAUSE_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'ComparisonValue and QueryParam should have same type',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.type = self.conditionField.type\n" +
		"}.status";

	/**
	 * Validates the ConsistenValueClauseTypes constraint of '<em>Value Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueClause_ConsistenValueClauseTypes(ValueClause valueClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.VALUE_CLAUSE,
				 valueClause,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistenValueClauseTypes",
				 VALUE_CLAUSE__CONSISTEN_VALUE_CLAUSE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLtClause(LtClause ltClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ltClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ltClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(ltClause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGtClause(GtClause gtClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gtClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gtClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(gtClause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqClause(EqClause eqClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eqClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eqClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(eqClause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeClause(LeClause leClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(leClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(leClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(leClause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeClause(GeClause geClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(geClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(geClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(geClause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainsClause(ContainsClause containsClause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containsClause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containsClause, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueClause_ConsistenValueClauseTypes(containsClause, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryParam(QueryParam queryParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomParam(CustomParam customParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primaryKey, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrimaryKey_IfCopiesThenSameType(primaryKey, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IfCopiesThenSameType constraint of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIMARY_KEY__IF_COPIES_THEN_SAME_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'A primarykey can\\'t copy primarykeys with different type',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.copies <> null implies self.type = self.copies.type\n" +
		"}.status";

	/**
	 * Validates the IfCopiesThenSameType constraint of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey_IfCopiesThenSameType(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PRIMARY_KEY,
				 primaryKey,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IfCopiesThenSameType",
				 PRIMARY_KEY__IF_COPIES_THEN_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogisticRegression(LogisticRegression logisticRegression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(logisticRegression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassification_ClassificationIsForClassLabels(logisticRegression, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogisticRegression_ConsistentCoefficientSize(logisticRegression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConsistentCoefficientSize constraint of '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOGISTIC_REGRESSION__CONSISTENT_COEFFICIENT_SIZE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The number of coefficients should be (#predictors+1)*#classLabels',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.estimatedCoefficients->size() = self.classLabels->size()*(self.inputSchema.attributes->size() + 1)\n" +
		"}.status";

	/**
	 * Validates the ConsistentCoefficientSize constraint of '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogisticRegression_ConsistentCoefficientSize(LogisticRegression logisticRegression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.LOGISTIC_REGRESSION,
				 logisticRegression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConsistentCoefficientSize",
				 LOGISTIC_REGRESSION__CONSISTENT_COEFFICIENT_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkewness(Skewness skewness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(skewness, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentNumberOfInputOutputColumns(skewness, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_ConsistentOperationsOverTypeOfData(skewness, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScatterPlot(ScatterPlot scatterPlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scatterPlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateScatterPlot_IndependentAndResponseShouldBeInInputSchema(scatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateScatterPlot_IndependentAndResponseShouldBeDifferent(scatterPlot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IndependentAndResponseShouldBeInInputSchema constraint of '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCATTER_PLOT__INDEPENDENT_AND_RESPONSE_SHOULD_BE_IN_INPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Independent variables and response variables should be specified within the attributes of the input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.independentVariables->forAll(v|self.inputSchema.attributes->includes(v) or self.inputSchema.idColumn = v) and self.responseVariables->forAll(v|self.inputSchema.attributes->includes(v) or self.inputSchema.idColumn = v)\n" +
		"}.status";

	/**
	 * Validates the IndependentAndResponseShouldBeInInputSchema constraint of '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScatterPlot_IndependentAndResponseShouldBeInInputSchema(ScatterPlot scatterPlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.SCATTER_PLOT,
				 scatterPlot,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IndependentAndResponseShouldBeInInputSchema",
				 SCATTER_PLOT__INDEPENDENT_AND_RESPONSE_SHOULD_BE_IN_INPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IndependentAndResponseShouldBeDifferent constraint of '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCATTER_PLOT__INDEPENDENT_AND_RESPONSE_SHOULD_BE_DIFFERENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Independent variables and response variables should not be the same variables',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.independentVariables->intersection(self.responseVariables)->size() = 0\n" +
		"}.status";

	/**
	 * Validates the IndependentAndResponseShouldBeDifferent constraint of '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScatterPlot_IndependentAndResponseShouldBeDifferent(ScatterPlot scatterPlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.SCATTER_PLOT,
				 scatterPlot,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IndependentAndResponseShouldBeDifferent",
				 SCATTER_PLOT__INDEPENDENT_AND_RESPONSE_SHOULD_BE_DIFFERENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledScatterPlot(LabeledScatterPlot labeledScatterPlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(labeledScatterPlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateScatterPlot_IndependentAndResponseShouldBeInInputSchema(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateScatterPlot_IndependentAndResponseShouldBeDifferent(labeledScatterPlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabeledScatterPlot_LabelAttributeShouldBeInInputSchema(labeledScatterPlot, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LabelAttributeShouldBeInInputSchema constraint of '<em>Labeled Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE_SHOULD_BE_IN_INPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Label variables should be specified within the attributes of the input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.labelAttribute->forAll(v|self.inputSchema.attributes->includes(v) or self.inputSchema.idColumn = v)\n" +
		"}.status";

	/**
	 * Validates the LabelAttributeShouldBeInInputSchema constraint of '<em>Labeled Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledScatterPlot_LabelAttributeShouldBeInInputSchema(LabeledScatterPlot labeledScatterPlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.LABELED_SCATTER_PLOT,
				 labeledScatterPlot,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LabelAttributeShouldBeInInputSchema",
				 LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE_SHOULD_BE_IN_INPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistogram(Histogram histogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(histogram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(histogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(histogram, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePiePlot(PiePlot piePlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(piePlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(piePlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(piePlot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectOnAttributes(ProjectOnAttributes projectOnAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(projectOnAttributes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneAndOnlyOneInputAndInputSchema(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoInputAndNoInputSchmea(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOneOrMoreInputAndInputSchema(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithInputShouldHaveConsistentSchemas(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithNoOutputAndNoOutputSchema(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutput(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithOutputShouldHaveConsistentOutputSchemas(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentInputOutputFormat(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion1(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_ConsistentFormatConversion2(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_StartTimeAfterPreviousTasksEndTime(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_DataVisualizationOutputMustContainAtLeastOneImage(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_NotDataVisualizationOrExportShouldNotProcessImages(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_JoinShouldHaveDataWithSameFormatInInput(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithSameInputAndOutputSchema(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksWithIDCopyShouldHaveSchemaWithCopiedID(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateProjectOnAttributes_ProjectOnAttributesInInputSchema(projectOnAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateProjectOnAttributes_ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema(projectOnAttributes, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProjectOnAttributesInInputSchema constraint of '<em>Project On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECT_ON_ATTRIBUTES__PROJECT_ON_ATTRIBUTES_IN_INPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Projection should occur on attributes of input schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.projectionAttributes->forAll(a|self.inputSchema->first().attributes->includes(a))\n" +
		"}.status";

	/**
	 * Validates the ProjectOnAttributesInInputSchema constraint of '<em>Project On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectOnAttributes_ProjectOnAttributesInInputSchema(ProjectOnAttributes projectOnAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PROJECT_ON_ATTRIBUTES,
				 projectOnAttributes,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProjectOnAttributesInInputSchema",
				 PROJECT_ON_ATTRIBUTES__PROJECT_ON_ATTRIBUTES_IN_INPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema constraint of '<em>Project On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECT_ON_ATTRIBUTES__PROJECT_ON_ATTRIBUTES_SHOULD_BE_THE_ONE_AND_ONLY_ONE_IN_OUTPUT_SCHEMA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Projection attributes should be the one and only one in output schema',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.projectionAttributes->forAll(a|self.outputSchema.attributes->exists(a1|a.name=a1.name and a.type = a1.type)) and self.outputSchema.attributes->forAll(a|self.projectionAttributes->exists(a1|a.name=a1.name and a.type = a1.type))\n" +
		"}.status";

	/**
	 * Validates the ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema constraint of '<em>Project On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectOnAttributes_ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema(ProjectOnAttributes projectOnAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PipelineprojectPackage.Literals.PROJECT_ON_ATTRIBUTES,
				 projectOnAttributes,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema",
				 PROJECT_ON_ATTRIBUTES__PROJECT_ON_ATTRIBUTES_SHOULD_BE_THE_ONE_AND_ONLY_ONE_IN_OUTPUT_SCHEMA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormat(Format format, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNulValuesPolicy(NulValuesPolicy nulValuesPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKernelFunction(KernelFunction kernelFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterClusterSimilarity(InterClusterSimilarity interClusterSimilarity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceType(SourceType sourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PipelineprojectValidator
