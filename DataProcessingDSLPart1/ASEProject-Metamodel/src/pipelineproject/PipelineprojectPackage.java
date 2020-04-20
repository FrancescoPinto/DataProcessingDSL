/**
 */
package pipelineproject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pipelineproject.PipelineprojectFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PipelineprojectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipelineproject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ase.it/pm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelineprojectPackage eINSTANCE = pipelineproject.impl.PipelineprojectPackageImpl.init();

	/**
	 * The meta object id for the '{@link pipelineproject.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.PipelineImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Data Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DATA_FLOWS = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Output File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__OUTPUT_FILE = 3;

	/**
	 * The feature id for the '<em><b>Pipeline Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.TaskImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RUNTIME_INFO = 2;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUT_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DataFlowImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TO = 1;

	/**
	 * The feature id for the '<em><b>Type Of Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TYPE_OF_DATA = 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = 4;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DataCollectionImpl <em>Data Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DataCollectionImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataCollection()
	 * @generated
	 */
	int DATA_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__OUTPUT = TASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__RUNTIME_INFO = TASK__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__INPUT_SCHEMA = TASK__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__OUTPUT_SCHEMA = TASK__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Source Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION__SOURCE_DECLARATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTION_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DataIntegrationImpl <em>Data Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DataIntegrationImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataIntegration()
	 * @generated
	 */
	int DATA_INTEGRATION = 4;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__OUTPUT = TASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__RUNTIME_INFO = TASK__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__INPUT_SCHEMA = TASK__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__OUTPUT_SCHEMA = TASK__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Join Attributes List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTEGRATION_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DataAnalysisImpl <em>Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DataAnalysisImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataAnalysis()
	 * @generated
	 */
	int DATA_ANALYSIS = 5;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS__OUTPUT = TASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS__RUNTIME_INFO = TASK__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS__INPUT_SCHEMA = TASK__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS__OUTPUT_SCHEMA = TASK__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS__ID = TASK__ID;

	/**
	 * The number of structural features of the '<em>Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DataCleaningImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataCleaning()
	 * @generated
	 */
	int DATA_CLEANING = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__OUTPUT = TASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__RUNTIME_INFO = TASK__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__INPUT_SCHEMA = TASK__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__OUTPUT_SCHEMA = TASK__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__ID = TASK__ID;

	/**
	 * The number of structural features of the '<em>Data Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DataVisualizationImpl <em>Data Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DataVisualizationImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataVisualization()
	 * @generated
	 */
	int DATA_VISUALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION__OUTPUT = TASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION__RUNTIME_INFO = TASK__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION__INPUT_SCHEMA = TASK__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION__OUTPUT_SCHEMA = TASK__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION__ID = TASK__ID;

	/**
	 * The number of structural features of the '<em>Data Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISUALIZATION_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ExportImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 8;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__INPUT = TASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__OUTPUT = TASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__RUNTIME_INFO = TASK__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__INPUT_SCHEMA = TASK__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__OUTPUT_SCHEMA = TASK__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Writes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__WRITES = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.InputSourceDeclarationImpl <em>Input Source Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.InputSourceDeclarationImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getInputSourceDeclaration()
	 * @generated
	 */
	int INPUT_SOURCE_DECLARATION = 9;

	/**
	 * The feature id for the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__SOURCE_URI = 0;

	/**
	 * The feature id for the '<em><b>Query Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Exchange Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Source Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__SOURCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Query Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS = 5;

	/**
	 * The number of structural features of the '<em>Input Source Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.OutputFileImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getOutputFile()
	 * @generated
	 */
	int OUTPUT_FILE = 10;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__FILE_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Storage Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__STORAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__EXPORT = 3;

	/**
	 * The number of structural features of the '<em>Output File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ClassificationImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__INPUT = DATA_ANALYSIS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__OUTPUT = DATA_ANALYSIS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__RUNTIME_INFO = DATA_ANALYSIS__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__INPUT_SCHEMA = DATA_ANALYSIS__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__OUTPUT_SCHEMA = DATA_ANALYSIS__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__ID = DATA_ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Class Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__CLASS_LABELS = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.PredictionImpl <em>Prediction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.PredictionImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPrediction()
	 * @generated
	 */
	int PREDICTION = 12;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__INPUT = DATA_ANALYSIS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__OUTPUT = DATA_ANALYSIS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__RUNTIME_INFO = DATA_ANALYSIS__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__INPUT_SCHEMA = DATA_ANALYSIS__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__OUTPUT_SCHEMA = DATA_ANALYSIS__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__ID = DATA_ANALYSIS__ID;

	/**
	 * The number of structural features of the '<em>Prediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ClusteringImpl <em>Clustering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ClusteringImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getClustering()
	 * @generated
	 */
	int CLUSTERING = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__INPUT = DATA_ANALYSIS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__OUTPUT = DATA_ANALYSIS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__RUNTIME_INFO = DATA_ANALYSIS__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__INPUT_SCHEMA = DATA_ANALYSIS__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__OUTPUT_SCHEMA = DATA_ANALYSIS__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__ID = DATA_ANALYSIS__ID;

	/**
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DescriptionImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__INPUT = DATA_ANALYSIS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__OUTPUT = DATA_ANALYSIS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__RUNTIME_INFO = DATA_ANALYSIS__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__INPUT_SCHEMA = DATA_ANALYSIS__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__OUTPUT_SCHEMA = DATA_ANALYSIS__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ID = DATA_ANALYSIS__ID;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ColumnImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.NullValuesRemovalImpl <em>Null Values Removal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.NullValuesRemovalImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getNullValuesRemoval()
	 * @generated
	 */
	int NULL_VALUES_REMOVAL = 16;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__INPUT = DATA_CLEANING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__OUTPUT = DATA_CLEANING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__RUNTIME_INFO = DATA_CLEANING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__INPUT_SCHEMA = DATA_CLEANING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__OUTPUT_SCHEMA = DATA_CLEANING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__ID = DATA_CLEANING__ID;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL__POLICY = DATA_CLEANING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null Values Removal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_REMOVAL_FEATURE_COUNT = DATA_CLEANING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.CustomCleaningImpl <em>Custom Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.CustomCleaningImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getCustomCleaning()
	 * @generated
	 */
	int CUSTOM_CLEANING = 17;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__INPUT = DATA_CLEANING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__OUTPUT = DATA_CLEANING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__RUNTIME_INFO = DATA_CLEANING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__INPUT_SCHEMA = DATA_CLEANING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__OUTPUT_SCHEMA = DATA_CLEANING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__ID = DATA_CLEANING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__NAME = DATA_CLEANING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING__CUSTOM_PARAMS = DATA_CLEANING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLEANING_FEATURE_COUNT = DATA_CLEANING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.SchemaImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Id Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID_COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.JoinAttributesListImpl <em>Join Attributes List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.JoinAttributesListImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getJoinAttributesList()
	 * @generated
	 */
	int JOIN_ATTRIBUTES_LIST = 19;

	/**
	 * The feature id for the '<em><b>Join Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ATTRIBUTES_LIST__ID = 1;

	/**
	 * The number of structural features of the '<em>Join Attributes List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ATTRIBUTES_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.RuntimeInfoImpl <em>Runtime Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.RuntimeInfoImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getRuntimeInfo()
	 * @generated
	 */
	int RUNTIME_INFO = 20;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFO__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFO__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Execution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFO__EXECUTION_ID = 2;

	/**
	 * The number of structural features of the '<em>Runtime Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ChangeDataFormatImpl <em>Change Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ChangeDataFormatImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getChangeDataFormat()
	 * @generated
	 */
	int CHANGE_DATA_FORMAT = 21;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__INPUT = DATA_CLEANING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__OUTPUT = DATA_CLEANING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__RUNTIME_INFO = DATA_CLEANING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__INPUT_SCHEMA = DATA_CLEANING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__OUTPUT_SCHEMA = DATA_CLEANING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__ID = DATA_CLEANING__ID;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__INPUT_FORMAT = DATA_CLEANING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT__OUTPUT_FORMAT = DATA_CLEANING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT_FEATURE_COUNT = DATA_CLEANING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.KNNImpl <em>KNN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.KNNImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getKNN()
	 * @generated
	 */
	int KNN = 22;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__INPUT = CLASSIFICATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__OUTPUT = CLASSIFICATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__RUNTIME_INFO = CLASSIFICATION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__INPUT_SCHEMA = CLASSIFICATION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__OUTPUT_SCHEMA = CLASSIFICATION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__ID = CLASSIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Class Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__CLASS_LABELS = CLASSIFICATION__CLASS_LABELS;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__K = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KNN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.SVMImpl <em>SVM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.SVMImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSVM()
	 * @generated
	 */
	int SVM = 23;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__INPUT = CLASSIFICATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__OUTPUT = CLASSIFICATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__RUNTIME_INFO = CLASSIFICATION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__INPUT_SCHEMA = CLASSIFICATION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__OUTPUT_SCHEMA = CLASSIFICATION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__ID = CLASSIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Class Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__CLASS_LABELS = CLASSIFICATION__CLASS_LABELS;

	/**
	 * The feature id for the '<em><b>Kernel Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__KERNEL_FUNCTION = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estimated Coefficients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__ESTIMATED_COEFFICIENTS = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.KMeansImpl <em>KMeans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.KMeansImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getKMeans()
	 * @generated
	 */
	int KMEANS = 24;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__INPUT = CLUSTERING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__OUTPUT = CLUSTERING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__RUNTIME_INFO = CLUSTERING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__INPUT_SCHEMA = CLUSTERING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__OUTPUT_SCHEMA = CLUSTERING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__ID = CLUSTERING__ID;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__K = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KMeans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.HierarchicalImpl <em>Hierarchical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.HierarchicalImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getHierarchical()
	 * @generated
	 */
	int HIERARCHICAL = 25;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__INPUT = CLUSTERING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__OUTPUT = CLUSTERING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__RUNTIME_INFO = CLUSTERING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__INPUT_SCHEMA = CLUSTERING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__OUTPUT_SCHEMA = CLUSTERING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__ID = CLUSTERING__ID;

	/**
	 * The number of structural features of the '<em>Hierarchical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.AgglomerativeImpl <em>Agglomerative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.AgglomerativeImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getAgglomerative()
	 * @generated
	 */
	int AGGLOMERATIVE = 26;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__INPUT = HIERARCHICAL__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__OUTPUT = HIERARCHICAL__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__RUNTIME_INFO = HIERARCHICAL__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__INPUT_SCHEMA = HIERARCHICAL__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__OUTPUT_SCHEMA = HIERARCHICAL__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__ID = HIERARCHICAL__ID;

	/**
	 * The feature id for the '<em><b>Inter Cluster Similarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY = HIERARCHICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cut Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__CUT_HEIGHT = HIERARCHICAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agglomerative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE_FEATURE_COUNT = HIERARCHICAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.DBSCANImpl <em>DBSCAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.DBSCANImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDBSCAN()
	 * @generated
	 */
	int DBSCAN = 27;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__INPUT = CLUSTERING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__OUTPUT = CLUSTERING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__RUNTIME_INFO = CLUSTERING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__INPUT_SCHEMA = CLUSTERING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__OUTPUT_SCHEMA = CLUSTERING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__ID = CLUSTERING__ID;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__RADIUS = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__THRESHOLD = CLUSTERING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DBSCAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.JarvisPatrickImpl <em>Jarvis Patrick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.JarvisPatrickImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getJarvisPatrick()
	 * @generated
	 */
	int JARVIS_PATRICK = 28;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__INPUT = CLUSTERING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__OUTPUT = CLUSTERING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__RUNTIME_INFO = CLUSTERING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__INPUT_SCHEMA = CLUSTERING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__OUTPUT_SCHEMA = CLUSTERING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__ID = CLUSTERING__ID;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__K = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK__THRESHOLD = CLUSTERING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jarvis Patrick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JARVIS_PATRICK_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LinearRegressionImpl <em>Linear Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LinearRegressionImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLinearRegression()
	 * @generated
	 */
	int LINEAR_REGRESSION = 29;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__INPUT = PREDICTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__OUTPUT = PREDICTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__RUNTIME_INFO = PREDICTION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__INPUT_SCHEMA = PREDICTION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__OUTPUT_SCHEMA = PREDICTION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__ID = PREDICTION__ID;

	/**
	 * The feature id for the '<em><b>Estimated Coefficients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS = PREDICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION_FEATURE_COUNT = PREDICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.RidgeImpl <em>Ridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.RidgeImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getRidge()
	 * @generated
	 */
	int RIDGE = 30;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__INPUT = LINEAR_REGRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__OUTPUT = LINEAR_REGRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__RUNTIME_INFO = LINEAR_REGRESSION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__INPUT_SCHEMA = LINEAR_REGRESSION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__OUTPUT_SCHEMA = LINEAR_REGRESSION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__ID = LINEAR_REGRESSION__ID;

	/**
	 * The feature id for the '<em><b>Estimated Coefficients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__ESTIMATED_COEFFICIENTS = LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__PENALTY_FACTOR = LINEAR_REGRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE_FEATURE_COUNT = LINEAR_REGRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LassoImpl <em>Lasso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LassoImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLasso()
	 * @generated
	 */
	int LASSO = 31;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__INPUT = LINEAR_REGRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__OUTPUT = LINEAR_REGRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__RUNTIME_INFO = LINEAR_REGRESSION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__INPUT_SCHEMA = LINEAR_REGRESSION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__OUTPUT_SCHEMA = LINEAR_REGRESSION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__ID = LINEAR_REGRESSION__ID;

	/**
	 * The feature id for the '<em><b>Estimated Coefficients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__ESTIMATED_COEFFICIENTS = LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__PENALTY_FACTOR = LINEAR_REGRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lasso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO_FEATURE_COUNT = LINEAR_REGRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.MeanImpl <em>Mean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.MeanImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getMean()
	 * @generated
	 */
	int MEAN = 32;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN__INPUT = DESCRIPTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN__OUTPUT = DESCRIPTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN__RUNTIME_INFO = DESCRIPTION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN__INPUT_SCHEMA = DESCRIPTION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN__OUTPUT_SCHEMA = DESCRIPTION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN__ID = DESCRIPTION__ID;

	/**
	 * The number of structural features of the '<em>Mean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.MedianImpl <em>Median</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.MedianImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getMedian()
	 * @generated
	 */
	int MEDIAN = 33;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__INPUT = DESCRIPTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__OUTPUT = DESCRIPTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__RUNTIME_INFO = DESCRIPTION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__INPUT_SCHEMA = DESCRIPTION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__OUTPUT_SCHEMA = DESCRIPTION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__ID = DESCRIPTION__ID;

	/**
	 * The number of structural features of the '<em>Median</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.VarianceImpl <em>Variance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.VarianceImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getVariance()
	 * @generated
	 */
	int VARIANCE = 34;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__INPUT = DESCRIPTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__OUTPUT = DESCRIPTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__RUNTIME_INFO = DESCRIPTION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__INPUT_SCHEMA = DESCRIPTION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__OUTPUT_SCHEMA = DESCRIPTION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__ID = DESCRIPTION__ID;

	/**
	 * The number of structural features of the '<em>Variance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LogicPropositionImpl <em>Logic Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LogicPropositionImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLogicProposition()
	 * @generated
	 */
	int LOGIC_PROPOSITION = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROPOSITION__ID = 0;

	/**
	 * The number of structural features of the '<em>Logic Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROPOSITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.NotClauseImpl <em>Not Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.NotClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getNotClause()
	 * @generated
	 */
	int NOT_CLAUSE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CLAUSE__ID = LOGIC_PROPOSITION__ID;

	/**
	 * The feature id for the '<em><b>Sub Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CLAUSE__SUB_CLAUSE = LOGIC_PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CLAUSE_FEATURE_COUNT = LOGIC_PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.MultiOperandClauseImpl <em>Multi Operand Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.MultiOperandClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getMultiOperandClause()
	 * @generated
	 */
	int MULTI_OPERAND_CLAUSE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_CLAUSE__ID = LOGIC_PROPOSITION__ID;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_CLAUSE__OPERANDS = LOGIC_PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Operand Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERAND_CLAUSE_FEATURE_COUNT = LOGIC_PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.AndClauseImpl <em>And Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.AndClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getAndClause()
	 * @generated
	 */
	int AND_CLAUSE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLAUSE__ID = MULTI_OPERAND_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLAUSE__OPERANDS = MULTI_OPERAND_CLAUSE__OPERANDS;

	/**
	 * The number of structural features of the '<em>And Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLAUSE_FEATURE_COUNT = MULTI_OPERAND_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.OrClauseImpl <em>Or Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.OrClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getOrClause()
	 * @generated
	 */
	int OR_CLAUSE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLAUSE__ID = MULTI_OPERAND_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLAUSE__OPERANDS = MULTI_OPERAND_CLAUSE__OPERANDS;

	/**
	 * The number of structural features of the '<em>Or Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLAUSE_FEATURE_COUNT = MULTI_OPERAND_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ValueClauseImpl <em>Value Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ValueClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getValueClause()
	 * @generated
	 */
	int VALUE_CLAUSE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CLAUSE__ID = LOGIC_PROPOSITION__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CLAUSE__COMPARISON_VALUE = LOGIC_PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CLAUSE__CONDITION_FIELD = LOGIC_PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CLAUSE__TYPE = LOGIC_PROPOSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CLAUSE_FEATURE_COUNT = LOGIC_PROPOSITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LtClauseImpl <em>Lt Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LtClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLtClause()
	 * @generated
	 */
	int LT_CLAUSE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_CLAUSE__ID = VALUE_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_CLAUSE__COMPARISON_VALUE = VALUE_CLAUSE__COMPARISON_VALUE;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_CLAUSE__CONDITION_FIELD = VALUE_CLAUSE__CONDITION_FIELD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_CLAUSE__TYPE = VALUE_CLAUSE__TYPE;

	/**
	 * The number of structural features of the '<em>Lt Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_CLAUSE_FEATURE_COUNT = VALUE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.GtClauseImpl <em>Gt Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.GtClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getGtClause()
	 * @generated
	 */
	int GT_CLAUSE = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_CLAUSE__ID = VALUE_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_CLAUSE__COMPARISON_VALUE = VALUE_CLAUSE__COMPARISON_VALUE;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_CLAUSE__CONDITION_FIELD = VALUE_CLAUSE__CONDITION_FIELD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_CLAUSE__TYPE = VALUE_CLAUSE__TYPE;

	/**
	 * The number of structural features of the '<em>Gt Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_CLAUSE_FEATURE_COUNT = VALUE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.EqClauseImpl <em>Eq Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.EqClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getEqClause()
	 * @generated
	 */
	int EQ_CLAUSE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_CLAUSE__ID = VALUE_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_CLAUSE__COMPARISON_VALUE = VALUE_CLAUSE__COMPARISON_VALUE;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_CLAUSE__CONDITION_FIELD = VALUE_CLAUSE__CONDITION_FIELD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_CLAUSE__TYPE = VALUE_CLAUSE__TYPE;

	/**
	 * The number of structural features of the '<em>Eq Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_CLAUSE_FEATURE_COUNT = VALUE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LeClauseImpl <em>Le Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LeClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLeClause()
	 * @generated
	 */
	int LE_CLAUSE = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_CLAUSE__ID = VALUE_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_CLAUSE__COMPARISON_VALUE = VALUE_CLAUSE__COMPARISON_VALUE;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_CLAUSE__CONDITION_FIELD = VALUE_CLAUSE__CONDITION_FIELD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_CLAUSE__TYPE = VALUE_CLAUSE__TYPE;

	/**
	 * The number of structural features of the '<em>Le Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LE_CLAUSE_FEATURE_COUNT = VALUE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.GeClauseImpl <em>Ge Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.GeClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getGeClause()
	 * @generated
	 */
	int GE_CLAUSE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_CLAUSE__ID = VALUE_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_CLAUSE__COMPARISON_VALUE = VALUE_CLAUSE__COMPARISON_VALUE;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_CLAUSE__CONDITION_FIELD = VALUE_CLAUSE__CONDITION_FIELD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_CLAUSE__TYPE = VALUE_CLAUSE__TYPE;

	/**
	 * The number of structural features of the '<em>Ge Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GE_CLAUSE_FEATURE_COUNT = VALUE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ContainsClauseImpl <em>Contains Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ContainsClauseImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getContainsClause()
	 * @generated
	 */
	int CONTAINS_CLAUSE = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_CLAUSE__ID = VALUE_CLAUSE__ID;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_CLAUSE__COMPARISON_VALUE = VALUE_CLAUSE__COMPARISON_VALUE;

	/**
	 * The feature id for the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_CLAUSE__CONDITION_FIELD = VALUE_CLAUSE__CONDITION_FIELD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_CLAUSE__TYPE = VALUE_CLAUSE__TYPE;

	/**
	 * The number of structural features of the '<em>Contains Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_CLAUSE_FEATURE_COUNT = VALUE_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.QueryParamImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.CustomParamImpl <em>Custom Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.CustomParamImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getCustomParam()
	 * @generated
	 */
	int CUSTOM_PARAM = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Custom Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.PrimaryKeyImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TYPE = COLUMN__TYPE;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COPIES = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.AttributeImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = COLUMN__TYPE;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LogisticRegressionImpl <em>Logistic Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LogisticRegressionImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLogisticRegression()
	 * @generated
	 */
	int LOGISTIC_REGRESSION = 51;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__INPUT = CLASSIFICATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__OUTPUT = CLASSIFICATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__RUNTIME_INFO = CLASSIFICATION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__INPUT_SCHEMA = CLASSIFICATION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__OUTPUT_SCHEMA = CLASSIFICATION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__ID = CLASSIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Class Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__CLASS_LABELS = CLASSIFICATION__CLASS_LABELS;

	/**
	 * The feature id for the '<em><b>Estimated Coefficients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__ESTIMATED_COEFFICIENTS = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logistic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.SkewnessImpl <em>Skewness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.SkewnessImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSkewness()
	 * @generated
	 */
	int SKEWNESS = 52;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS__INPUT = DESCRIPTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS__OUTPUT = DESCRIPTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS__RUNTIME_INFO = DESCRIPTION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS__INPUT_SCHEMA = DESCRIPTION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS__OUTPUT_SCHEMA = DESCRIPTION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS__ID = DESCRIPTION__ID;

	/**
	 * The number of structural features of the '<em>Skewness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEWNESS_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ScatterPlotImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getScatterPlot()
	 * @generated
	 */
	int SCATTER_PLOT = 53;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__INPUT = DATA_VISUALIZATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__OUTPUT = DATA_VISUALIZATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__RUNTIME_INFO = DATA_VISUALIZATION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__INPUT_SCHEMA = DATA_VISUALIZATION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__OUTPUT_SCHEMA = DATA_VISUALIZATION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__ID = DATA_VISUALIZATION__ID;

	/**
	 * The feature id for the '<em><b>Independent Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__INDEPENDENT_VARIABLES = DATA_VISUALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__RESPONSE_VARIABLES = DATA_VISUALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT_FEATURE_COUNT = DATA_VISUALIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.LabeledScatterPlotImpl <em>Labeled Scatter Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.LabeledScatterPlotImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLabeledScatterPlot()
	 * @generated
	 */
	int LABELED_SCATTER_PLOT = 54;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__INPUT = SCATTER_PLOT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__OUTPUT = SCATTER_PLOT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__RUNTIME_INFO = SCATTER_PLOT__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__INPUT_SCHEMA = SCATTER_PLOT__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__OUTPUT_SCHEMA = SCATTER_PLOT__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__ID = SCATTER_PLOT__ID;

	/**
	 * The feature id for the '<em><b>Independent Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__INDEPENDENT_VARIABLES = SCATTER_PLOT__INDEPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Response Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__RESPONSE_VARIABLES = SCATTER_PLOT__RESPONSE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE = SCATTER_PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT_FEATURE_COUNT = SCATTER_PLOT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.HistogramImpl <em>Histogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.HistogramImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getHistogram()
	 * @generated
	 */
	int HISTOGRAM = 55;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__INPUT = DATA_VISUALIZATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__OUTPUT = DATA_VISUALIZATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__RUNTIME_INFO = DATA_VISUALIZATION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__INPUT_SCHEMA = DATA_VISUALIZATION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__OUTPUT_SCHEMA = DATA_VISUALIZATION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__ID = DATA_VISUALIZATION__ID;

	/**
	 * The number of structural features of the '<em>Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_FEATURE_COUNT = DATA_VISUALIZATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.PiePlotImpl <em>Pie Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.PiePlotImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPiePlot()
	 * @generated
	 */
	int PIE_PLOT = 56;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__INPUT = DATA_VISUALIZATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__OUTPUT = DATA_VISUALIZATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__RUNTIME_INFO = DATA_VISUALIZATION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__INPUT_SCHEMA = DATA_VISUALIZATION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__OUTPUT_SCHEMA = DATA_VISUALIZATION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__ID = DATA_VISUALIZATION__ID;

	/**
	 * The number of structural features of the '<em>Pie Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT_FEATURE_COUNT = DATA_VISUALIZATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipelineproject.impl.ProjectOnAttributesImpl <em>Project On Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.impl.ProjectOnAttributesImpl
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getProjectOnAttributes()
	 * @generated
	 */
	int PROJECT_ON_ATTRIBUTES = 57;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__INPUT = DATA_CLEANING__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__OUTPUT = DATA_CLEANING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__RUNTIME_INFO = DATA_CLEANING__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__INPUT_SCHEMA = DATA_CLEANING__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__OUTPUT_SCHEMA = DATA_CLEANING__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__ID = DATA_CLEANING__ID;

	/**
	 * The feature id for the '<em><b>Projection Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES = DATA_CLEANING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project On Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ON_ATTRIBUTES_FEATURE_COUNT = DATA_CLEANING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipelineproject.Format <em>Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.Format
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 58;

	/**
	 * The meta object id for the '{@link pipelineproject.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.Type
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 59;

	/**
	 * The meta object id for the '{@link pipelineproject.NulValuesPolicy <em>Nul Values Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.NulValuesPolicy
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getNulValuesPolicy()
	 * @generated
	 */
	int NUL_VALUES_POLICY = 60;

	/**
	 * The meta object id for the '{@link pipelineproject.KernelFunction <em>Kernel Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.KernelFunction
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getKernelFunction()
	 * @generated
	 */
	int KERNEL_FUNCTION = 61;

	/**
	 * The meta object id for the '{@link pipelineproject.InterClusterSimilarity <em>Inter Cluster Similarity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.InterClusterSimilarity
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getInterClusterSimilarity()
	 * @generated
	 */
	int INTER_CLUSTER_SIMILARITY = 62;

	/**
	 * The meta object id for the '{@link pipelineproject.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipelineproject.SourceType
	 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 63;


	/**
	 * Returns the meta object for class '{@link pipelineproject.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see pipelineproject.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.Pipeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see pipelineproject.Pipeline#getTasks()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.Pipeline#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flows</em>'.
	 * @see pipelineproject.Pipeline#getDataFlows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_DataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.Pipeline#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see pipelineproject.Pipeline#getSchema()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.Pipeline#getOutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output File</em>'.
	 * @see pipelineproject.Pipeline#getOutputFile()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_OutputFile();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Pipeline#getPipelineName <em>Pipeline Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pipeline Name</em>'.
	 * @see pipelineproject.Pipeline#getPipelineName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_PipelineName();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pipelineproject.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.Task#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see pipelineproject.Task#getInput()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Input();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.Task#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see pipelineproject.Task#getOutput()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Output();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.Task#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Info</em>'.
	 * @see pipelineproject.Task#getRuntimeInfo()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_RuntimeInfo();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.Task#getInputSchema <em>Input Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Schema</em>'.
	 * @see pipelineproject.Task#getInputSchema()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputSchema();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.Task#getOutputSchema <em>Output Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Schema</em>'.
	 * @see pipelineproject.Task#getOutputSchema()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutputSchema();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pipelineproject.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see pipelineproject.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.DataFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see pipelineproject.DataFlow#getFrom()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_From();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.DataFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see pipelineproject.DataFlow#getTo()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_To();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.DataFlow#getTypeOfData <em>Type Of Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of Data</em>'.
	 * @see pipelineproject.DataFlow#getTypeOfData()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_TypeOfData();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.DataFlow#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipelineproject.DataFlow#getFormat()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Format();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.DataFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pipelineproject.DataFlow#getId()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Id();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collection</em>'.
	 * @see pipelineproject.DataCollection
	 * @generated
	 */
	EClass getDataCollection();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.DataCollection#getSourceDeclaration <em>Source Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Declaration</em>'.
	 * @see pipelineproject.DataCollection#getSourceDeclaration()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_SourceDeclaration();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DataIntegration <em>Data Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Integration</em>'.
	 * @see pipelineproject.DataIntegration
	 * @generated
	 */
	EClass getDataIntegration();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.DataIntegration#getJoinAttributesList <em>Join Attributes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Attributes List</em>'.
	 * @see pipelineproject.DataIntegration#getJoinAttributesList()
	 * @see #getDataIntegration()
	 * @generated
	 */
	EReference getDataIntegration_JoinAttributesList();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DataAnalysis <em>Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analysis</em>'.
	 * @see pipelineproject.DataAnalysis
	 * @generated
	 */
	EClass getDataAnalysis();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Cleaning</em>'.
	 * @see pipelineproject.DataCleaning
	 * @generated
	 */
	EClass getDataCleaning();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DataVisualization <em>Data Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Visualization</em>'.
	 * @see pipelineproject.DataVisualization
	 * @generated
	 */
	EClass getDataVisualization();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see pipelineproject.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.Export#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes</em>'.
	 * @see pipelineproject.Export#getWrites()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Writes();

	/**
	 * Returns the meta object for class '{@link pipelineproject.InputSourceDeclaration <em>Input Source Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Source Declaration</em>'.
	 * @see pipelineproject.InputSourceDeclaration
	 * @generated
	 */
	EClass getInputSourceDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.InputSourceDeclaration#getSourceURI <em>Source URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source URI</em>'.
	 * @see pipelineproject.InputSourceDeclaration#getSourceURI()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_SourceURI();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.InputSourceDeclaration#getQueryEndpoint <em>Query Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Endpoint</em>'.
	 * @see pipelineproject.InputSourceDeclaration#getQueryEndpoint()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_QueryEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.InputSourceDeclaration#getExchangeFormat <em>Exchange Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Format</em>'.
	 * @see pipelineproject.InputSourceDeclaration#getExchangeFormat()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_ExchangeFormat();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.InputSourceDeclaration#getSourceSchema <em>Source Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Schema</em>'.
	 * @see pipelineproject.InputSourceDeclaration#getSourceSchema()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EReference getInputSourceDeclaration_SourceSchema();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.InputSourceDeclaration#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see pipelineproject.InputSourceDeclaration#getSourceType()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_SourceType();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.InputSourceDeclaration#getQueryConditions <em>Query Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Conditions</em>'.
	 * @see pipelineproject.InputSourceDeclaration#getQueryConditions()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EReference getInputSourceDeclaration_QueryConditions();

	/**
	 * Returns the meta object for class '{@link pipelineproject.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output File</em>'.
	 * @see pipelineproject.OutputFile
	 * @generated
	 */
	EClass getOutputFile();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.OutputFile#getFileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Format</em>'.
	 * @see pipelineproject.OutputFile#getFileFormat()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_FileFormat();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.OutputFile#getStoragePath <em>Storage Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Path</em>'.
	 * @see pipelineproject.OutputFile#getStoragePath()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_StoragePath();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.OutputFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipelineproject.OutputFile#getName()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_Name();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.OutputFile#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export</em>'.
	 * @see pipelineproject.OutputFile#getExport()
	 * @see #getOutputFile()
	 * @generated
	 */
	EReference getOutputFile_Export();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see pipelineproject.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the attribute list '{@link pipelineproject.Classification#getClassLabels <em>Class Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class Labels</em>'.
	 * @see pipelineproject.Classification#getClassLabels()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_ClassLabels();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Prediction <em>Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prediction</em>'.
	 * @see pipelineproject.Prediction
	 * @generated
	 */
	EClass getPrediction();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering</em>'.
	 * @see pipelineproject.Clustering
	 * @generated
	 */
	EClass getClustering();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see pipelineproject.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see pipelineproject.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipelineproject.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipelineproject.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link pipelineproject.NullValuesRemoval <em>Null Values Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Values Removal</em>'.
	 * @see pipelineproject.NullValuesRemoval
	 * @generated
	 */
	EClass getNullValuesRemoval();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.NullValuesRemoval#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see pipelineproject.NullValuesRemoval#getPolicy()
	 * @see #getNullValuesRemoval()
	 * @generated
	 */
	EAttribute getNullValuesRemoval_Policy();

	/**
	 * Returns the meta object for class '{@link pipelineproject.CustomCleaning <em>Custom Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Cleaning</em>'.
	 * @see pipelineproject.CustomCleaning
	 * @generated
	 */
	EClass getCustomCleaning();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.CustomCleaning#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipelineproject.CustomCleaning#getName()
	 * @see #getCustomCleaning()
	 * @generated
	 */
	EAttribute getCustomCleaning_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.CustomCleaning#getCustomParams <em>Custom Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Params</em>'.
	 * @see pipelineproject.CustomCleaning#getCustomParams()
	 * @see #getCustomCleaning()
	 * @generated
	 */
	EReference getCustomCleaning_CustomParams();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see pipelineproject.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Schema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pipelineproject.Schema#getId()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.Schema#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pipelineproject.Schema#getAttributes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.Schema#getIdColumn <em>Id Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Column</em>'.
	 * @see pipelineproject.Schema#getIdColumn()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_IdColumn();

	/**
	 * Returns the meta object for class '{@link pipelineproject.JoinAttributesList <em>Join Attributes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Attributes List</em>'.
	 * @see pipelineproject.JoinAttributesList
	 * @generated
	 */
	EClass getJoinAttributesList();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.JoinAttributesList#getJoinAttributes <em>Join Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Join Attributes</em>'.
	 * @see pipelineproject.JoinAttributesList#getJoinAttributes()
	 * @see #getJoinAttributesList()
	 * @generated
	 */
	EReference getJoinAttributesList_JoinAttributes();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.JoinAttributesList#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pipelineproject.JoinAttributesList#getId()
	 * @see #getJoinAttributesList()
	 * @generated
	 */
	EAttribute getJoinAttributesList_Id();

	/**
	 * Returns the meta object for class '{@link pipelineproject.RuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Info</em>'.
	 * @see pipelineproject.RuntimeInfo
	 * @generated
	 */
	EClass getRuntimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.RuntimeInfo#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see pipelineproject.RuntimeInfo#getStartTime()
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	EAttribute getRuntimeInfo_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.RuntimeInfo#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see pipelineproject.RuntimeInfo#getEndTime()
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	EAttribute getRuntimeInfo_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.RuntimeInfo#getExecutionId <em>Execution Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Id</em>'.
	 * @see pipelineproject.RuntimeInfo#getExecutionId()
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	EAttribute getRuntimeInfo_ExecutionId();

	/**
	 * Returns the meta object for class '{@link pipelineproject.ChangeDataFormat <em>Change Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Data Format</em>'.
	 * @see pipelineproject.ChangeDataFormat
	 * @generated
	 */
	EClass getChangeDataFormat();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.ChangeDataFormat#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see pipelineproject.ChangeDataFormat#getInputFormat()
	 * @see #getChangeDataFormat()
	 * @generated
	 */
	EAttribute getChangeDataFormat_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.ChangeDataFormat#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see pipelineproject.ChangeDataFormat#getOutputFormat()
	 * @see #getChangeDataFormat()
	 * @generated
	 */
	EAttribute getChangeDataFormat_OutputFormat();

	/**
	 * Returns the meta object for class '{@link pipelineproject.KNN <em>KNN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KNN</em>'.
	 * @see pipelineproject.KNN
	 * @generated
	 */
	EClass getKNN();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.KNN#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see pipelineproject.KNN#getK()
	 * @see #getKNN()
	 * @generated
	 */
	EAttribute getKNN_K();

	/**
	 * Returns the meta object for class '{@link pipelineproject.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVM</em>'.
	 * @see pipelineproject.SVM
	 * @generated
	 */
	EClass getSVM();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.SVM#getKernelFunction <em>Kernel Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Function</em>'.
	 * @see pipelineproject.SVM#getKernelFunction()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_KernelFunction();

	/**
	 * Returns the meta object for the attribute list '{@link pipelineproject.SVM#getEstimatedCoefficients <em>Estimated Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Estimated Coefficients</em>'.
	 * @see pipelineproject.SVM#getEstimatedCoefficients()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_EstimatedCoefficients();

	/**
	 * Returns the meta object for class '{@link pipelineproject.KMeans <em>KMeans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KMeans</em>'.
	 * @see pipelineproject.KMeans
	 * @generated
	 */
	EClass getKMeans();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.KMeans#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see pipelineproject.KMeans#getK()
	 * @see #getKMeans()
	 * @generated
	 */
	EAttribute getKMeans_K();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Hierarchical <em>Hierarchical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical</em>'.
	 * @see pipelineproject.Hierarchical
	 * @generated
	 */
	EClass getHierarchical();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Agglomerative <em>Agglomerative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agglomerative</em>'.
	 * @see pipelineproject.Agglomerative
	 * @generated
	 */
	EClass getAgglomerative();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Agglomerative#getInterClusterSimilarity <em>Inter Cluster Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inter Cluster Similarity</em>'.
	 * @see pipelineproject.Agglomerative#getInterClusterSimilarity()
	 * @see #getAgglomerative()
	 * @generated
	 */
	EAttribute getAgglomerative_InterClusterSimilarity();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Agglomerative#getCutHeight <em>Cut Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Height</em>'.
	 * @see pipelineproject.Agglomerative#getCutHeight()
	 * @see #getAgglomerative()
	 * @generated
	 */
	EAttribute getAgglomerative_CutHeight();

	/**
	 * Returns the meta object for class '{@link pipelineproject.DBSCAN <em>DBSCAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBSCAN</em>'.
	 * @see pipelineproject.DBSCAN
	 * @generated
	 */
	EClass getDBSCAN();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.DBSCAN#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see pipelineproject.DBSCAN#getRadius()
	 * @see #getDBSCAN()
	 * @generated
	 */
	EAttribute getDBSCAN_Radius();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.DBSCAN#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see pipelineproject.DBSCAN#getThreshold()
	 * @see #getDBSCAN()
	 * @generated
	 */
	EAttribute getDBSCAN_Threshold();

	/**
	 * Returns the meta object for class '{@link pipelineproject.JarvisPatrick <em>Jarvis Patrick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jarvis Patrick</em>'.
	 * @see pipelineproject.JarvisPatrick
	 * @generated
	 */
	EClass getJarvisPatrick();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.JarvisPatrick#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see pipelineproject.JarvisPatrick#getK()
	 * @see #getJarvisPatrick()
	 * @generated
	 */
	EAttribute getJarvisPatrick_K();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.JarvisPatrick#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see pipelineproject.JarvisPatrick#getThreshold()
	 * @see #getJarvisPatrick()
	 * @generated
	 */
	EAttribute getJarvisPatrick_Threshold();

	/**
	 * Returns the meta object for class '{@link pipelineproject.LinearRegression <em>Linear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Regression</em>'.
	 * @see pipelineproject.LinearRegression
	 * @generated
	 */
	EClass getLinearRegression();

	/**
	 * Returns the meta object for the attribute list '{@link pipelineproject.LinearRegression#getEstimatedCoefficients <em>Estimated Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Estimated Coefficients</em>'.
	 * @see pipelineproject.LinearRegression#getEstimatedCoefficients()
	 * @see #getLinearRegression()
	 * @generated
	 */
	EAttribute getLinearRegression_EstimatedCoefficients();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Ridge <em>Ridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ridge</em>'.
	 * @see pipelineproject.Ridge
	 * @generated
	 */
	EClass getRidge();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Ridge#getPenaltyFactor <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Factor</em>'.
	 * @see pipelineproject.Ridge#getPenaltyFactor()
	 * @see #getRidge()
	 * @generated
	 */
	EAttribute getRidge_PenaltyFactor();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Lasso <em>Lasso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lasso</em>'.
	 * @see pipelineproject.Lasso
	 * @generated
	 */
	EClass getLasso();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.Lasso#getPenaltyFactor <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Factor</em>'.
	 * @see pipelineproject.Lasso#getPenaltyFactor()
	 * @see #getLasso()
	 * @generated
	 */
	EAttribute getLasso_PenaltyFactor();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Mean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mean</em>'.
	 * @see pipelineproject.Mean
	 * @generated
	 */
	EClass getMean();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Median</em>'.
	 * @see pipelineproject.Median
	 * @generated
	 */
	EClass getMedian();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Variance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variance</em>'.
	 * @see pipelineproject.Variance
	 * @generated
	 */
	EClass getVariance();

	/**
	 * Returns the meta object for class '{@link pipelineproject.LogicProposition <em>Logic Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Proposition</em>'.
	 * @see pipelineproject.LogicProposition
	 * @generated
	 */
	EClass getLogicProposition();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.LogicProposition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pipelineproject.LogicProposition#getId()
	 * @see #getLogicProposition()
	 * @generated
	 */
	EAttribute getLogicProposition_Id();

	/**
	 * Returns the meta object for class '{@link pipelineproject.NotClause <em>Not Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Clause</em>'.
	 * @see pipelineproject.NotClause
	 * @generated
	 */
	EClass getNotClause();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.NotClause#getSubClause <em>Sub Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Clause</em>'.
	 * @see pipelineproject.NotClause#getSubClause()
	 * @see #getNotClause()
	 * @generated
	 */
	EReference getNotClause_SubClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.MultiOperandClause <em>Multi Operand Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Operand Clause</em>'.
	 * @see pipelineproject.MultiOperandClause
	 * @generated
	 */
	EClass getMultiOperandClause();

	/**
	 * Returns the meta object for the containment reference list '{@link pipelineproject.MultiOperandClause#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see pipelineproject.MultiOperandClause#getOperands()
	 * @see #getMultiOperandClause()
	 * @generated
	 */
	EReference getMultiOperandClause_Operands();

	/**
	 * Returns the meta object for class '{@link pipelineproject.AndClause <em>And Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Clause</em>'.
	 * @see pipelineproject.AndClause
	 * @generated
	 */
	EClass getAndClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.OrClause <em>Or Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Clause</em>'.
	 * @see pipelineproject.OrClause
	 * @generated
	 */
	EClass getOrClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.ValueClause <em>Value Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Clause</em>'.
	 * @see pipelineproject.ValueClause
	 * @generated
	 */
	EClass getValueClause();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.ValueClause#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see pipelineproject.ValueClause#getComparisonValue()
	 * @see #getValueClause()
	 * @generated
	 */
	EAttribute getValueClause_ComparisonValue();

	/**
	 * Returns the meta object for the containment reference '{@link pipelineproject.ValueClause#getConditionField <em>Condition Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Field</em>'.
	 * @see pipelineproject.ValueClause#getConditionField()
	 * @see #getValueClause()
	 * @generated
	 */
	EReference getValueClause_ConditionField();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.ValueClause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipelineproject.ValueClause#getType()
	 * @see #getValueClause()
	 * @generated
	 */
	EAttribute getValueClause_Type();

	/**
	 * Returns the meta object for class '{@link pipelineproject.LtClause <em>Lt Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lt Clause</em>'.
	 * @see pipelineproject.LtClause
	 * @generated
	 */
	EClass getLtClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.GtClause <em>Gt Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt Clause</em>'.
	 * @see pipelineproject.GtClause
	 * @generated
	 */
	EClass getGtClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.EqClause <em>Eq Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Clause</em>'.
	 * @see pipelineproject.EqClause
	 * @generated
	 */
	EClass getEqClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.LeClause <em>Le Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le Clause</em>'.
	 * @see pipelineproject.LeClause
	 * @generated
	 */
	EClass getLeClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.GeClause <em>Ge Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ge Clause</em>'.
	 * @see pipelineproject.GeClause
	 * @generated
	 */
	EClass getGeClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.ContainsClause <em>Contains Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Clause</em>'.
	 * @see pipelineproject.ContainsClause
	 * @generated
	 */
	EClass getContainsClause();

	/**
	 * Returns the meta object for class '{@link pipelineproject.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see pipelineproject.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipelineproject.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipelineproject.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Type();

	/**
	 * Returns the meta object for class '{@link pipelineproject.CustomParam <em>Custom Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Param</em>'.
	 * @see pipelineproject.CustomParam
	 * @generated
	 */
	EClass getCustomParam();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.CustomParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipelineproject.CustomParam#getName()
	 * @see #getCustomParam()
	 * @generated
	 */
	EAttribute getCustomParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipelineproject.CustomParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipelineproject.CustomParam#getType()
	 * @see #getCustomParam()
	 * @generated
	 */
	EAttribute getCustomParam_Type();

	/**
	 * Returns the meta object for class '{@link pipelineproject.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see pipelineproject.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.PrimaryKey#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copies</em>'.
	 * @see pipelineproject.PrimaryKey#getCopies()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Copies();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see pipelineproject.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link pipelineproject.LogisticRegression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Regression</em>'.
	 * @see pipelineproject.LogisticRegression
	 * @generated
	 */
	EClass getLogisticRegression();

	/**
	 * Returns the meta object for the attribute list '{@link pipelineproject.LogisticRegression#getEstimatedCoefficients <em>Estimated Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Estimated Coefficients</em>'.
	 * @see pipelineproject.LogisticRegression#getEstimatedCoefficients()
	 * @see #getLogisticRegression()
	 * @generated
	 */
	EAttribute getLogisticRegression_EstimatedCoefficients();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Skewness <em>Skewness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skewness</em>'.
	 * @see pipelineproject.Skewness
	 * @generated
	 */
	EClass getSkewness();

	/**
	 * Returns the meta object for class '{@link pipelineproject.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter Plot</em>'.
	 * @see pipelineproject.ScatterPlot
	 * @generated
	 */
	EClass getScatterPlot();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.ScatterPlot#getIndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Independent Variables</em>'.
	 * @see pipelineproject.ScatterPlot#getIndependentVariables()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EReference getScatterPlot_IndependentVariables();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.ScatterPlot#getResponseVariables <em>Response Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Response Variables</em>'.
	 * @see pipelineproject.ScatterPlot#getResponseVariables()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EReference getScatterPlot_ResponseVariables();

	/**
	 * Returns the meta object for class '{@link pipelineproject.LabeledScatterPlot <em>Labeled Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Scatter Plot</em>'.
	 * @see pipelineproject.LabeledScatterPlot
	 * @generated
	 */
	EClass getLabeledScatterPlot();

	/**
	 * Returns the meta object for the reference '{@link pipelineproject.LabeledScatterPlot#getLabelAttribute <em>Label Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label Attribute</em>'.
	 * @see pipelineproject.LabeledScatterPlot#getLabelAttribute()
	 * @see #getLabeledScatterPlot()
	 * @generated
	 */
	EReference getLabeledScatterPlot_LabelAttribute();

	/**
	 * Returns the meta object for class '{@link pipelineproject.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram</em>'.
	 * @see pipelineproject.Histogram
	 * @generated
	 */
	EClass getHistogram();

	/**
	 * Returns the meta object for class '{@link pipelineproject.PiePlot <em>Pie Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Plot</em>'.
	 * @see pipelineproject.PiePlot
	 * @generated
	 */
	EClass getPiePlot();

	/**
	 * Returns the meta object for class '{@link pipelineproject.ProjectOnAttributes <em>Project On Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project On Attributes</em>'.
	 * @see pipelineproject.ProjectOnAttributes
	 * @generated
	 */
	EClass getProjectOnAttributes();

	/**
	 * Returns the meta object for the reference list '{@link pipelineproject.ProjectOnAttributes#getProjectionAttributes <em>Projection Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projection Attributes</em>'.
	 * @see pipelineproject.ProjectOnAttributes#getProjectionAttributes()
	 * @see #getProjectOnAttributes()
	 * @generated
	 */
	EReference getProjectOnAttributes_ProjectionAttributes();

	/**
	 * Returns the meta object for enum '{@link pipelineproject.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format</em>'.
	 * @see pipelineproject.Format
	 * @generated
	 */
	EEnum getFormat();

	/**
	 * Returns the meta object for enum '{@link pipelineproject.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see pipelineproject.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link pipelineproject.NulValuesPolicy <em>Nul Values Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nul Values Policy</em>'.
	 * @see pipelineproject.NulValuesPolicy
	 * @generated
	 */
	EEnum getNulValuesPolicy();

	/**
	 * Returns the meta object for enum '{@link pipelineproject.KernelFunction <em>Kernel Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kernel Function</em>'.
	 * @see pipelineproject.KernelFunction
	 * @generated
	 */
	EEnum getKernelFunction();

	/**
	 * Returns the meta object for enum '{@link pipelineproject.InterClusterSimilarity <em>Inter Cluster Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inter Cluster Similarity</em>'.
	 * @see pipelineproject.InterClusterSimilarity
	 * @generated
	 */
	EEnum getInterClusterSimilarity();

	/**
	 * Returns the meta object for enum '{@link pipelineproject.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see pipelineproject.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipelineprojectFactory getPipelineprojectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pipelineproject.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.PipelineImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TASKS = eINSTANCE.getPipeline_Tasks();

		/**
		 * The meta object literal for the '<em><b>Data Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DATA_FLOWS = eINSTANCE.getPipeline_DataFlows();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SCHEMA = eINSTANCE.getPipeline_Schema();

		/**
		 * The meta object literal for the '<em><b>Output File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__OUTPUT_FILE = eINSTANCE.getPipeline_OutputFile();

		/**
		 * The meta object literal for the '<em><b>Pipeline Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__PIPELINE_NAME = eINSTANCE.getPipeline_PipelineName();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.TaskImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUT = eINSTANCE.getTask_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUT = eINSTANCE.getTask_Output();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RUNTIME_INFO = eINSTANCE.getTask_RuntimeInfo();

		/**
		 * The meta object literal for the '<em><b>Input Schema</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUT_SCHEMA = eINSTANCE.getTask_InputSchema();

		/**
		 * The meta object literal for the '<em><b>Output Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUT_SCHEMA = eINSTANCE.getTask_OutputSchema();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DataFlowImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__FROM = eINSTANCE.getDataFlow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TO = eINSTANCE.getDataFlow_To();

		/**
		 * The meta object literal for the '<em><b>Type Of Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TYPE_OF_DATA = eINSTANCE.getDataFlow_TypeOfData();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__FORMAT = eINSTANCE.getDataFlow_Format();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__ID = eINSTANCE.getDataFlow_Id();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DataCollectionImpl <em>Data Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DataCollectionImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataCollection()
		 * @generated
		 */
		EClass DATA_COLLECTION = eINSTANCE.getDataCollection();

		/**
		 * The meta object literal for the '<em><b>Source Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__SOURCE_DECLARATION = eINSTANCE.getDataCollection_SourceDeclaration();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DataIntegrationImpl <em>Data Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DataIntegrationImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataIntegration()
		 * @generated
		 */
		EClass DATA_INTEGRATION = eINSTANCE.getDataIntegration();

		/**
		 * The meta object literal for the '<em><b>Join Attributes List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST = eINSTANCE.getDataIntegration_JoinAttributesList();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DataAnalysisImpl <em>Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DataAnalysisImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataAnalysis()
		 * @generated
		 */
		EClass DATA_ANALYSIS = eINSTANCE.getDataAnalysis();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DataCleaningImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataCleaning()
		 * @generated
		 */
		EClass DATA_CLEANING = eINSTANCE.getDataCleaning();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DataVisualizationImpl <em>Data Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DataVisualizationImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDataVisualization()
		 * @generated
		 */
		EClass DATA_VISUALIZATION = eINSTANCE.getDataVisualization();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ExportImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getExport()
		 * @generated
		 */
		EClass EXPORT = eINSTANCE.getExport();

		/**
		 * The meta object literal for the '<em><b>Writes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT__WRITES = eINSTANCE.getExport_Writes();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.InputSourceDeclarationImpl <em>Input Source Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.InputSourceDeclarationImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getInputSourceDeclaration()
		 * @generated
		 */
		EClass INPUT_SOURCE_DECLARATION = eINSTANCE.getInputSourceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Source URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SOURCE_DECLARATION__SOURCE_URI = eINSTANCE.getInputSourceDeclaration_SourceURI();

		/**
		 * The meta object literal for the '<em><b>Query Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT = eINSTANCE.getInputSourceDeclaration_QueryEndpoint();

		/**
		 * The meta object literal for the '<em><b>Exchange Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT = eINSTANCE.getInputSourceDeclaration_ExchangeFormat();

		/**
		 * The meta object literal for the '<em><b>Source Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA = eINSTANCE.getInputSourceDeclaration_SourceSchema();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SOURCE_DECLARATION__SOURCE_TYPE = eINSTANCE.getInputSourceDeclaration_SourceType();

		/**
		 * The meta object literal for the '<em><b>Query Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS = eINSTANCE.getInputSourceDeclaration_QueryConditions();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.OutputFileImpl <em>Output File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.OutputFileImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getOutputFile()
		 * @generated
		 */
		EClass OUTPUT_FILE = eINSTANCE.getOutputFile();

		/**
		 * The meta object literal for the '<em><b>File Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FILE__FILE_FORMAT = eINSTANCE.getOutputFile_FileFormat();

		/**
		 * The meta object literal for the '<em><b>Storage Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FILE__STORAGE_PATH = eINSTANCE.getOutputFile_StoragePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FILE__NAME = eINSTANCE.getOutputFile_Name();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FILE__EXPORT = eINSTANCE.getOutputFile_Export();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ClassificationImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Class Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__CLASS_LABELS = eINSTANCE.getClassification_ClassLabels();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.PredictionImpl <em>Prediction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.PredictionImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPrediction()
		 * @generated
		 */
		EClass PREDICTION = eINSTANCE.getPrediction();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ClusteringImpl <em>Clustering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ClusteringImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getClustering()
		 * @generated
		 */
		EClass CLUSTERING = eINSTANCE.getClustering();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DescriptionImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ColumnImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.NullValuesRemovalImpl <em>Null Values Removal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.NullValuesRemovalImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getNullValuesRemoval()
		 * @generated
		 */
		EClass NULL_VALUES_REMOVAL = eINSTANCE.getNullValuesRemoval();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_VALUES_REMOVAL__POLICY = eINSTANCE.getNullValuesRemoval_Policy();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.CustomCleaningImpl <em>Custom Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.CustomCleaningImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getCustomCleaning()
		 * @generated
		 */
		EClass CUSTOM_CLEANING = eINSTANCE.getCustomCleaning();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CLEANING__NAME = eINSTANCE.getCustomCleaning_Name();

		/**
		 * The meta object literal for the '<em><b>Custom Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_CLEANING__CUSTOM_PARAMS = eINSTANCE.getCustomCleaning_CustomParams();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.SchemaImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ID = eINSTANCE.getSchema_Id();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ATTRIBUTES = eINSTANCE.getSchema_Attributes();

		/**
		 * The meta object literal for the '<em><b>Id Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ID_COLUMN = eINSTANCE.getSchema_IdColumn();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.JoinAttributesListImpl <em>Join Attributes List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.JoinAttributesListImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getJoinAttributesList()
		 * @generated
		 */
		EClass JOIN_ATTRIBUTES_LIST = eINSTANCE.getJoinAttributesList();

		/**
		 * The meta object literal for the '<em><b>Join Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES = eINSTANCE.getJoinAttributesList_JoinAttributes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_ATTRIBUTES_LIST__ID = eINSTANCE.getJoinAttributesList_Id();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.RuntimeInfoImpl <em>Runtime Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.RuntimeInfoImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getRuntimeInfo()
		 * @generated
		 */
		EClass RUNTIME_INFO = eINSTANCE.getRuntimeInfo();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFO__START_TIME = eINSTANCE.getRuntimeInfo_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFO__END_TIME = eINSTANCE.getRuntimeInfo_EndTime();

		/**
		 * The meta object literal for the '<em><b>Execution Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFO__EXECUTION_ID = eINSTANCE.getRuntimeInfo_ExecutionId();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ChangeDataFormatImpl <em>Change Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ChangeDataFormatImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getChangeDataFormat()
		 * @generated
		 */
		EClass CHANGE_DATA_FORMAT = eINSTANCE.getChangeDataFormat();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DATA_FORMAT__INPUT_FORMAT = eINSTANCE.getChangeDataFormat_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DATA_FORMAT__OUTPUT_FORMAT = eINSTANCE.getChangeDataFormat_OutputFormat();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.KNNImpl <em>KNN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.KNNImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getKNN()
		 * @generated
		 */
		EClass KNN = eINSTANCE.getKNN();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNN__K = eINSTANCE.getKNN_K();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.SVMImpl <em>SVM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.SVMImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSVM()
		 * @generated
		 */
		EClass SVM = eINSTANCE.getSVM();

		/**
		 * The meta object literal for the '<em><b>Kernel Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVM__KERNEL_FUNCTION = eINSTANCE.getSVM_KernelFunction();

		/**
		 * The meta object literal for the '<em><b>Estimated Coefficients</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVM__ESTIMATED_COEFFICIENTS = eINSTANCE.getSVM_EstimatedCoefficients();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.KMeansImpl <em>KMeans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.KMeansImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getKMeans()
		 * @generated
		 */
		EClass KMEANS = eINSTANCE.getKMeans();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KMEANS__K = eINSTANCE.getKMeans_K();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.HierarchicalImpl <em>Hierarchical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.HierarchicalImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getHierarchical()
		 * @generated
		 */
		EClass HIERARCHICAL = eINSTANCE.getHierarchical();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.AgglomerativeImpl <em>Agglomerative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.AgglomerativeImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getAgglomerative()
		 * @generated
		 */
		EClass AGGLOMERATIVE = eINSTANCE.getAgglomerative();

		/**
		 * The meta object literal for the '<em><b>Inter Cluster Similarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY = eINSTANCE.getAgglomerative_InterClusterSimilarity();

		/**
		 * The meta object literal for the '<em><b>Cut Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGLOMERATIVE__CUT_HEIGHT = eINSTANCE.getAgglomerative_CutHeight();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.DBSCANImpl <em>DBSCAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.DBSCANImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getDBSCAN()
		 * @generated
		 */
		EClass DBSCAN = eINSTANCE.getDBSCAN();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBSCAN__RADIUS = eINSTANCE.getDBSCAN_Radius();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBSCAN__THRESHOLD = eINSTANCE.getDBSCAN_Threshold();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.JarvisPatrickImpl <em>Jarvis Patrick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.JarvisPatrickImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getJarvisPatrick()
		 * @generated
		 */
		EClass JARVIS_PATRICK = eINSTANCE.getJarvisPatrick();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JARVIS_PATRICK__K = eINSTANCE.getJarvisPatrick_K();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JARVIS_PATRICK__THRESHOLD = eINSTANCE.getJarvisPatrick_Threshold();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LinearRegressionImpl <em>Linear Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LinearRegressionImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLinearRegression()
		 * @generated
		 */
		EClass LINEAR_REGRESSION = eINSTANCE.getLinearRegression();

		/**
		 * The meta object literal for the '<em><b>Estimated Coefficients</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS = eINSTANCE.getLinearRegression_EstimatedCoefficients();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.RidgeImpl <em>Ridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.RidgeImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getRidge()
		 * @generated
		 */
		EClass RIDGE = eINSTANCE.getRidge();

		/**
		 * The meta object literal for the '<em><b>Penalty Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDGE__PENALTY_FACTOR = eINSTANCE.getRidge_PenaltyFactor();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LassoImpl <em>Lasso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LassoImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLasso()
		 * @generated
		 */
		EClass LASSO = eINSTANCE.getLasso();

		/**
		 * The meta object literal for the '<em><b>Penalty Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LASSO__PENALTY_FACTOR = eINSTANCE.getLasso_PenaltyFactor();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.MeanImpl <em>Mean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.MeanImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getMean()
		 * @generated
		 */
		EClass MEAN = eINSTANCE.getMean();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.MedianImpl <em>Median</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.MedianImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getMedian()
		 * @generated
		 */
		EClass MEDIAN = eINSTANCE.getMedian();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.VarianceImpl <em>Variance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.VarianceImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getVariance()
		 * @generated
		 */
		EClass VARIANCE = eINSTANCE.getVariance();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LogicPropositionImpl <em>Logic Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LogicPropositionImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLogicProposition()
		 * @generated
		 */
		EClass LOGIC_PROPOSITION = eINSTANCE.getLogicProposition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_PROPOSITION__ID = eINSTANCE.getLogicProposition_Id();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.NotClauseImpl <em>Not Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.NotClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getNotClause()
		 * @generated
		 */
		EClass NOT_CLAUSE = eINSTANCE.getNotClause();

		/**
		 * The meta object literal for the '<em><b>Sub Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_CLAUSE__SUB_CLAUSE = eINSTANCE.getNotClause_SubClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.MultiOperandClauseImpl <em>Multi Operand Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.MultiOperandClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getMultiOperandClause()
		 * @generated
		 */
		EClass MULTI_OPERAND_CLAUSE = eINSTANCE.getMultiOperandClause();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_OPERAND_CLAUSE__OPERANDS = eINSTANCE.getMultiOperandClause_Operands();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.AndClauseImpl <em>And Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.AndClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getAndClause()
		 * @generated
		 */
		EClass AND_CLAUSE = eINSTANCE.getAndClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.OrClauseImpl <em>Or Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.OrClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getOrClause()
		 * @generated
		 */
		EClass OR_CLAUSE = eINSTANCE.getOrClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ValueClauseImpl <em>Value Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ValueClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getValueClause()
		 * @generated
		 */
		EClass VALUE_CLAUSE = eINSTANCE.getValueClause();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CLAUSE__COMPARISON_VALUE = eINSTANCE.getValueClause_ComparisonValue();

		/**
		 * The meta object literal for the '<em><b>Condition Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CLAUSE__CONDITION_FIELD = eINSTANCE.getValueClause_ConditionField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CLAUSE__TYPE = eINSTANCE.getValueClause_Type();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LtClauseImpl <em>Lt Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LtClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLtClause()
		 * @generated
		 */
		EClass LT_CLAUSE = eINSTANCE.getLtClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.GtClauseImpl <em>Gt Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.GtClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getGtClause()
		 * @generated
		 */
		EClass GT_CLAUSE = eINSTANCE.getGtClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.EqClauseImpl <em>Eq Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.EqClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getEqClause()
		 * @generated
		 */
		EClass EQ_CLAUSE = eINSTANCE.getEqClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LeClauseImpl <em>Le Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LeClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLeClause()
		 * @generated
		 */
		EClass LE_CLAUSE = eINSTANCE.getLeClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.GeClauseImpl <em>Ge Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.GeClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getGeClause()
		 * @generated
		 */
		EClass GE_CLAUSE = eINSTANCE.getGeClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ContainsClauseImpl <em>Contains Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ContainsClauseImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getContainsClause()
		 * @generated
		 */
		EClass CONTAINS_CLAUSE = eINSTANCE.getContainsClause();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.QueryParamImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getQueryParam()
		 * @generated
		 */
		EClass QUERY_PARAM = eINSTANCE.getQueryParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__NAME = eINSTANCE.getQueryParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__TYPE = eINSTANCE.getQueryParam_Type();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.CustomParamImpl <em>Custom Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.CustomParamImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getCustomParam()
		 * @generated
		 */
		EClass CUSTOM_PARAM = eINSTANCE.getCustomParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PARAM__NAME = eINSTANCE.getCustomParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PARAM__TYPE = eINSTANCE.getCustomParam_Type();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.PrimaryKeyImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Copies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__COPIES = eINSTANCE.getPrimaryKey_Copies();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.AttributeImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LogisticRegressionImpl <em>Logistic Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LogisticRegressionImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLogisticRegression()
		 * @generated
		 */
		EClass LOGISTIC_REGRESSION = eINSTANCE.getLogisticRegression();

		/**
		 * The meta object literal for the '<em><b>Estimated Coefficients</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_REGRESSION__ESTIMATED_COEFFICIENTS = eINSTANCE.getLogisticRegression_EstimatedCoefficients();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.SkewnessImpl <em>Skewness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.SkewnessImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSkewness()
		 * @generated
		 */
		EClass SKEWNESS = eINSTANCE.getSkewness();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ScatterPlotImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getScatterPlot()
		 * @generated
		 */
		EClass SCATTER_PLOT = eINSTANCE.getScatterPlot();

		/**
		 * The meta object literal for the '<em><b>Independent Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCATTER_PLOT__INDEPENDENT_VARIABLES = eINSTANCE.getScatterPlot_IndependentVariables();

		/**
		 * The meta object literal for the '<em><b>Response Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCATTER_PLOT__RESPONSE_VARIABLES = eINSTANCE.getScatterPlot_ResponseVariables();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.LabeledScatterPlotImpl <em>Labeled Scatter Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.LabeledScatterPlotImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getLabeledScatterPlot()
		 * @generated
		 */
		EClass LABELED_SCATTER_PLOT = eINSTANCE.getLabeledScatterPlot();

		/**
		 * The meta object literal for the '<em><b>Label Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE = eINSTANCE.getLabeledScatterPlot_LabelAttribute();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.HistogramImpl <em>Histogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.HistogramImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getHistogram()
		 * @generated
		 */
		EClass HISTOGRAM = eINSTANCE.getHistogram();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.PiePlotImpl <em>Pie Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.PiePlotImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getPiePlot()
		 * @generated
		 */
		EClass PIE_PLOT = eINSTANCE.getPiePlot();

		/**
		 * The meta object literal for the '{@link pipelineproject.impl.ProjectOnAttributesImpl <em>Project On Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.impl.ProjectOnAttributesImpl
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getProjectOnAttributes()
		 * @generated
		 */
		EClass PROJECT_ON_ATTRIBUTES = eINSTANCE.getProjectOnAttributes();

		/**
		 * The meta object literal for the '<em><b>Projection Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES = eINSTANCE.getProjectOnAttributes_ProjectionAttributes();

		/**
		 * The meta object literal for the '{@link pipelineproject.Format <em>Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.Format
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getFormat()
		 * @generated
		 */
		EEnum FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '{@link pipelineproject.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.Type
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link pipelineproject.NulValuesPolicy <em>Nul Values Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.NulValuesPolicy
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getNulValuesPolicy()
		 * @generated
		 */
		EEnum NUL_VALUES_POLICY = eINSTANCE.getNulValuesPolicy();

		/**
		 * The meta object literal for the '{@link pipelineproject.KernelFunction <em>Kernel Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.KernelFunction
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getKernelFunction()
		 * @generated
		 */
		EEnum KERNEL_FUNCTION = eINSTANCE.getKernelFunction();

		/**
		 * The meta object literal for the '{@link pipelineproject.InterClusterSimilarity <em>Inter Cluster Similarity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.InterClusterSimilarity
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getInterClusterSimilarity()
		 * @generated
		 */
		EEnum INTER_CLUSTER_SIMILARITY = eINSTANCE.getInterClusterSimilarity();

		/**
		 * The meta object literal for the '{@link pipelineproject.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipelineproject.SourceType
		 * @see pipelineproject.impl.PipelineprojectPackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

	}

} //PipelineprojectPackage
