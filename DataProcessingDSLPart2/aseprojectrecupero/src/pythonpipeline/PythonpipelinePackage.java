/**
 */
package pythonpipeline;

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
 * @see pythonpipeline.PythonpipelineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PythonpipelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pythonpipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ase.it/pm/python";

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
	PythonpipelinePackage eINSTANCE = pythonpipeline.impl.PythonpipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.PipelineImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPipeline()
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
	 * The meta object id for the '{@link pythonpipeline.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.TaskImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getTask()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DataFlowImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataFlow()
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
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = 3;

	/**
	 * The feature id for the '<em><b>Type Of Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TYPE_OF_DATA = 4;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.DataCollectionImpl <em>Data Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DataCollectionImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataCollection()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Source Declaration</b></em>' containment reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.DataIntegrationImpl <em>Data Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DataIntegrationImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataIntegration()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.DataAnalysisImpl <em>Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DataAnalysisImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataAnalysis()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DataCleaningImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataCleaning()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.DataVisualizationImpl <em>Data Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DataVisualizationImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataVisualization()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ExportImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getExport()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.InputSourceDeclarationImpl <em>Input Source Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.InputSourceDeclarationImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getInputSourceDeclaration()
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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION__ID = 6;

	/**
	 * The number of structural features of the '<em>Input Source Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SOURCE_DECLARATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.OutputFileImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getOutputFile()
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
	 * The meta object id for the '{@link pythonpipeline.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ClassificationImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getClassification()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Classifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__CLASSIFIES = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.PredictionImpl <em>Prediction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.PredictionImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPrediction()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Predicts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION__PREDICTS = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTION_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.ClusteringImpl <em>Clustering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ClusteringImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getClustering()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Clusters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__CLUSTERS = DATA_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = DATA_ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DescriptionImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDescription()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ColumnImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getColumn()
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
	 * The meta object id for the '{@link pythonpipeline.impl.NullValuesRemovalImpl <em>Null Values Removal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.NullValuesRemovalImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getNullValuesRemoval()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.CustomCleaningImpl <em>Custom Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.CustomCleaningImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getCustomCleaning()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.SchemaImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSchema()
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
	 * The meta object id for the '{@link pythonpipeline.impl.JoinAttributesListImpl <em>Join Attributes List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.JoinAttributesListImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getJoinAttributesList()
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
	 * The meta object id for the '{@link pythonpipeline.impl.RuntimeInfoImpl <em>Runtime Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.RuntimeInfoImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getRuntimeInfo()
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
	 * The meta object id for the '{@link pythonpipeline.impl.ChangeDataFormatImpl <em>Change Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ChangeDataFormatImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getChangeDataFormat()
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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The number of structural features of the '<em>Change Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_FORMAT_FEATURE_COUNT = DATA_CLEANING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.SVMImpl <em>SVM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.SVMImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSVM()
	 * @generated
	 */
	int SVM = 22;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Classifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__CLASSIFIES = CLASSIFICATION__CLASSIFIES;

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
	 * The feature id for the '<em><b>Kernel Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__KERNEL_PARAMS = CLASSIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Support Vectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__SUPPORT_VECTORS = CLASSIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.KMeansImpl <em>KMeans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.KMeansImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getKMeans()
	 * @generated
	 */
	int KMEANS = 23;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Clusters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__CLUSTERS = CLUSTERING__CLUSTERS;

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
	 * The meta object id for the '{@link pythonpipeline.impl.HierarchicalImpl <em>Hierarchical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.HierarchicalImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getHierarchical()
	 * @generated
	 */
	int HIERARCHICAL = 24;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Clusters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL__CLUSTERS = CLUSTERING__CLUSTERS;

	/**
	 * The number of structural features of the '<em>Hierarchical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.AgglomerativeImpl <em>Agglomerative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.AgglomerativeImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getAgglomerative()
	 * @generated
	 */
	int AGGLOMERATIVE = 25;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Clusters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGLOMERATIVE__CLUSTERS = HIERARCHICAL__CLUSTERS;

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
	 * The meta object id for the '{@link pythonpipeline.impl.DBSCANImpl <em>DBSCAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.DBSCANImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDBSCAN()
	 * @generated
	 */
	int DBSCAN = 26;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Clusters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__CLUSTERS = CLUSTERING__CLUSTERS;

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
	 * The meta object id for the '{@link pythonpipeline.impl.LinearRegressionImpl <em>Linear Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LinearRegressionImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLinearRegression()
	 * @generated
	 */
	int LINEAR_REGRESSION = 27;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Predicts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__PREDICTS = PREDICTION__PREDICTS;

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
	 * The meta object id for the '{@link pythonpipeline.impl.RidgeImpl <em>Ridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.RidgeImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getRidge()
	 * @generated
	 */
	int RIDGE = 28;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Predicts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDGE__PREDICTS = LINEAR_REGRESSION__PREDICTS;

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
	 * The meta object id for the '{@link pythonpipeline.impl.LassoImpl <em>Lasso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LassoImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLasso()
	 * @generated
	 */
	int LASSO = 29;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Predicts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASSO__PREDICTS = LINEAR_REGRESSION__PREDICTS;

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
	 * The meta object id for the '{@link pythonpipeline.impl.MeanImpl <em>Mean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.MeanImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getMean()
	 * @generated
	 */
	int MEAN = 30;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.MedianImpl <em>Median</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.MedianImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getMedian()
	 * @generated
	 */
	int MEDIAN = 31;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.StandardDeviationImpl <em>Standard Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.StandardDeviationImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getStandardDeviation()
	 * @generated
	 */
	int STANDARD_DEVIATION = 32;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION__INPUT = DESCRIPTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION__OUTPUT = DESCRIPTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION__RUNTIME_INFO = DESCRIPTION__RUNTIME_INFO;

	/**
	 * The feature id for the '<em><b>Input Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION__INPUT_SCHEMA = DESCRIPTION__INPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION__OUTPUT_SCHEMA = DESCRIPTION__OUTPUT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION__ID = DESCRIPTION__ID;

	/**
	 * The number of structural features of the '<em>Standard Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.LogicPropositionImpl <em>Logic Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LogicPropositionImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLogicProposition()
	 * @generated
	 */
	int LOGIC_PROPOSITION = 33;

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
	 * The meta object id for the '{@link pythonpipeline.impl.NotClauseImpl <em>Not Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.NotClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getNotClause()
	 * @generated
	 */
	int NOT_CLAUSE = 34;

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
	 * The meta object id for the '{@link pythonpipeline.impl.MultiOperandClauseImpl <em>Multi Operand Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.MultiOperandClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getMultiOperandClause()
	 * @generated
	 */
	int MULTI_OPERAND_CLAUSE = 35;

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
	 * The meta object id for the '{@link pythonpipeline.impl.AndClauseImpl <em>And Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.AndClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getAndClause()
	 * @generated
	 */
	int AND_CLAUSE = 36;

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
	 * The meta object id for the '{@link pythonpipeline.impl.OrClauseImpl <em>Or Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.OrClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getOrClause()
	 * @generated
	 */
	int OR_CLAUSE = 37;

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
	 * The meta object id for the '{@link pythonpipeline.impl.ValueClauseImpl <em>Value Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ValueClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getValueClause()
	 * @generated
	 */
	int VALUE_CLAUSE = 38;

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
	 * The meta object id for the '{@link pythonpipeline.impl.LtClauseImpl <em>Lt Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LtClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLtClause()
	 * @generated
	 */
	int LT_CLAUSE = 39;

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
	 * The meta object id for the '{@link pythonpipeline.impl.GtClauseImpl <em>Gt Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.GtClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getGtClause()
	 * @generated
	 */
	int GT_CLAUSE = 40;

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
	 * The meta object id for the '{@link pythonpipeline.impl.EqClauseImpl <em>Eq Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.EqClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getEqClause()
	 * @generated
	 */
	int EQ_CLAUSE = 41;

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
	 * The meta object id for the '{@link pythonpipeline.impl.LeClauseImpl <em>Le Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LeClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLeClause()
	 * @generated
	 */
	int LE_CLAUSE = 42;

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
	 * The meta object id for the '{@link pythonpipeline.impl.GeClauseImpl <em>Ge Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.GeClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getGeClause()
	 * @generated
	 */
	int GE_CLAUSE = 43;

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
	 * The meta object id for the '{@link pythonpipeline.impl.ContainsClauseImpl <em>Contains Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ContainsClauseImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getContainsClause()
	 * @generated
	 */
	int CONTAINS_CLAUSE = 44;

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
	 * The meta object id for the '{@link pythonpipeline.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.QueryParamImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 45;

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
	 * The meta object id for the '{@link pythonpipeline.impl.CustomParamImpl <em>Custom Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.CustomParamImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getCustomParam()
	 * @generated
	 */
	int CUSTOM_PARAM = 46;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PARAM__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Custom Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PARAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.PrimaryKeyImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 47;

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
	 * The meta object id for the '{@link pythonpipeline.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.AttributeImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 48;

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
	 * The feature id for the '<em><b>Copies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COPIES = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.LogisticRegressionImpl <em>Logistic Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LogisticRegressionImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLogisticRegression()
	 * @generated
	 */
	int LOGISTIC_REGRESSION = 49;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Classifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__CLASSIFIES = CLASSIFICATION__CLASSIFIES;

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
	 * The meta object id for the '{@link pythonpipeline.impl.SkewnessImpl <em>Skewness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.SkewnessImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSkewness()
	 * @generated
	 */
	int SKEWNESS = 50;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ScatterPlotImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getScatterPlot()
	 * @generated
	 */
	int SCATTER_PLOT = 51;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Response Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__RESPONSE_VARIABLE = DATA_VISUALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT_FEATURE_COUNT = DATA_VISUALIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pythonpipeline.impl.LabeledScatterPlotImpl <em>Labeled Scatter Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.LabeledScatterPlotImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLabeledScatterPlot()
	 * @generated
	 */
	int LABELED_SCATTER_PLOT = 52;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The feature id for the '<em><b>Response Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SCATTER_PLOT__RESPONSE_VARIABLE = SCATTER_PLOT__RESPONSE_VARIABLE;

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
	 * The meta object id for the '{@link pythonpipeline.impl.HistogramImpl <em>Histogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.HistogramImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getHistogram()
	 * @generated
	 */
	int HISTOGRAM = 53;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.PiePlotImpl <em>Pie Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.PiePlotImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPiePlot()
	 * @generated
	 */
	int PIE_PLOT = 54;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.ProjectOnAttributesImpl <em>Project On Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.ProjectOnAttributesImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getProjectOnAttributes()
	 * @generated
	 */
	int PROJECT_ON_ATTRIBUTES = 55;

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
	 * The feature id for the '<em><b>Output Schema</b></em>' reference list.
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
	 * The meta object id for the '{@link pythonpipeline.impl.SupportVectorImpl <em>Support Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.impl.SupportVectorImpl
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSupportVector()
	 * @generated
	 */
	int SUPPORT_VECTOR = 56;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR__VECTOR = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR__INDEX = 1;

	/**
	 * The number of structural features of the '<em>Support Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pythonpipeline.Format <em>Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.Format
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 57;

	/**
	 * The meta object id for the '{@link pythonpipeline.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.Type
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 58;

	/**
	 * The meta object id for the '{@link pythonpipeline.NulValuesPolicy <em>Nul Values Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.NulValuesPolicy
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getNulValuesPolicy()
	 * @generated
	 */
	int NUL_VALUES_POLICY = 59;

	/**
	 * The meta object id for the '{@link pythonpipeline.KernelFunction <em>Kernel Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.KernelFunction
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getKernelFunction()
	 * @generated
	 */
	int KERNEL_FUNCTION = 60;

	/**
	 * The meta object id for the '{@link pythonpipeline.InterClusterSimilarity <em>Inter Cluster Similarity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.InterClusterSimilarity
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getInterClusterSimilarity()
	 * @generated
	 */
	int INTER_CLUSTER_SIMILARITY = 61;

	/**
	 * The meta object id for the '{@link pythonpipeline.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pythonpipeline.SourceType
	 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 62;


	/**
	 * Returns the meta object for class '{@link pythonpipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see pythonpipeline.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.Pipeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see pythonpipeline.Pipeline#getTasks()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.Pipeline#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flows</em>'.
	 * @see pythonpipeline.Pipeline#getDataFlows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_DataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.Pipeline#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see pythonpipeline.Pipeline#getSchema()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.Pipeline#getOutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output File</em>'.
	 * @see pythonpipeline.Pipeline#getOutputFile()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_OutputFile();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Pipeline#getPipelineName <em>Pipeline Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pipeline Name</em>'.
	 * @see pythonpipeline.Pipeline#getPipelineName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_PipelineName();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pythonpipeline.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.Task#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see pythonpipeline.Task#getInput()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Input();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.Task#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see pythonpipeline.Task#getOutput()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Output();

	/**
	 * Returns the meta object for the containment reference '{@link pythonpipeline.Task#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Info</em>'.
	 * @see pythonpipeline.Task#getRuntimeInfo()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_RuntimeInfo();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.Task#getInputSchema <em>Input Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Schema</em>'.
	 * @see pythonpipeline.Task#getInputSchema()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputSchema();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.Task#getOutputSchema <em>Output Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Schema</em>'.
	 * @see pythonpipeline.Task#getOutputSchema()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutputSchema();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pythonpipeline.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see pythonpipeline.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.DataFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see pythonpipeline.DataFlow#getFrom()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_From();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.DataFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see pythonpipeline.DataFlow#getTo()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_To();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.DataFlow#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pythonpipeline.DataFlow#getFormat()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Format();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.DataFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pythonpipeline.DataFlow#getId()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Id();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.DataFlow#getTypeOfData <em>Type Of Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of Data</em>'.
	 * @see pythonpipeline.DataFlow#getTypeOfData()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_TypeOfData();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collection</em>'.
	 * @see pythonpipeline.DataCollection
	 * @generated
	 */
	EClass getDataCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.DataCollection#getSourceDeclaration <em>Source Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Declaration</em>'.
	 * @see pythonpipeline.DataCollection#getSourceDeclaration()
	 * @see #getDataCollection()
	 * @generated
	 */
	EReference getDataCollection_SourceDeclaration();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DataIntegration <em>Data Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Integration</em>'.
	 * @see pythonpipeline.DataIntegration
	 * @generated
	 */
	EClass getDataIntegration();

	/**
	 * Returns the meta object for the containment reference '{@link pythonpipeline.DataIntegration#getJoinAttributesList <em>Join Attributes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Attributes List</em>'.
	 * @see pythonpipeline.DataIntegration#getJoinAttributesList()
	 * @see #getDataIntegration()
	 * @generated
	 */
	EReference getDataIntegration_JoinAttributesList();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DataAnalysis <em>Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analysis</em>'.
	 * @see pythonpipeline.DataAnalysis
	 * @generated
	 */
	EClass getDataAnalysis();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Cleaning</em>'.
	 * @see pythonpipeline.DataCleaning
	 * @generated
	 */
	EClass getDataCleaning();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DataVisualization <em>Data Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Visualization</em>'.
	 * @see pythonpipeline.DataVisualization
	 * @generated
	 */
	EClass getDataVisualization();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see pythonpipeline.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.Export#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes</em>'.
	 * @see pythonpipeline.Export#getWrites()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Writes();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.InputSourceDeclaration <em>Input Source Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Source Declaration</em>'.
	 * @see pythonpipeline.InputSourceDeclaration
	 * @generated
	 */
	EClass getInputSourceDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.InputSourceDeclaration#getSourceURI <em>Source URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source URI</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getSourceURI()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_SourceURI();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.InputSourceDeclaration#getQueryEndpoint <em>Query Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Endpoint</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getQueryEndpoint()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_QueryEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.InputSourceDeclaration#getExchangeFormat <em>Exchange Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Format</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getExchangeFormat()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_ExchangeFormat();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.InputSourceDeclaration#getSourceSchema <em>Source Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Schema</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getSourceSchema()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EReference getInputSourceDeclaration_SourceSchema();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.InputSourceDeclaration#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getSourceType()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_SourceType();

	/**
	 * Returns the meta object for the containment reference '{@link pythonpipeline.InputSourceDeclaration#getQueryConditions <em>Query Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Conditions</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getQueryConditions()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EReference getInputSourceDeclaration_QueryConditions();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.InputSourceDeclaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pythonpipeline.InputSourceDeclaration#getId()
	 * @see #getInputSourceDeclaration()
	 * @generated
	 */
	EAttribute getInputSourceDeclaration_Id();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output File</em>'.
	 * @see pythonpipeline.OutputFile
	 * @generated
	 */
	EClass getOutputFile();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.OutputFile#getFileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Format</em>'.
	 * @see pythonpipeline.OutputFile#getFileFormat()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_FileFormat();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.OutputFile#getStoragePath <em>Storage Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Path</em>'.
	 * @see pythonpipeline.OutputFile#getStoragePath()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_StoragePath();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.OutputFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pythonpipeline.OutputFile#getName()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_Name();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.OutputFile#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export</em>'.
	 * @see pythonpipeline.OutputFile#getExport()
	 * @see #getOutputFile()
	 * @generated
	 */
	EReference getOutputFile_Export();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see pythonpipeline.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.Classification#getClassifies <em>Classifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifies</em>'.
	 * @see pythonpipeline.Classification#getClassifies()
	 * @see #getClassification()
	 * @generated
	 */
	EReference getClassification_Classifies();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Prediction <em>Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prediction</em>'.
	 * @see pythonpipeline.Prediction
	 * @generated
	 */
	EClass getPrediction();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.Prediction#getPredicts <em>Predicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicts</em>'.
	 * @see pythonpipeline.Prediction#getPredicts()
	 * @see #getPrediction()
	 * @generated
	 */
	EReference getPrediction_Predicts();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering</em>'.
	 * @see pythonpipeline.Clustering
	 * @generated
	 */
	EClass getClustering();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.Clustering#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clusters</em>'.
	 * @see pythonpipeline.Clustering#getClusters()
	 * @see #getClustering()
	 * @generated
	 */
	EReference getClustering_Clusters();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see pythonpipeline.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see pythonpipeline.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pythonpipeline.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pythonpipeline.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.NullValuesRemoval <em>Null Values Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Values Removal</em>'.
	 * @see pythonpipeline.NullValuesRemoval
	 * @generated
	 */
	EClass getNullValuesRemoval();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.NullValuesRemoval#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see pythonpipeline.NullValuesRemoval#getPolicy()
	 * @see #getNullValuesRemoval()
	 * @generated
	 */
	EAttribute getNullValuesRemoval_Policy();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.CustomCleaning <em>Custom Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Cleaning</em>'.
	 * @see pythonpipeline.CustomCleaning
	 * @generated
	 */
	EClass getCustomCleaning();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.CustomCleaning#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pythonpipeline.CustomCleaning#getName()
	 * @see #getCustomCleaning()
	 * @generated
	 */
	EAttribute getCustomCleaning_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.CustomCleaning#getCustomParams <em>Custom Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Params</em>'.
	 * @see pythonpipeline.CustomCleaning#getCustomParams()
	 * @see #getCustomCleaning()
	 * @generated
	 */
	EReference getCustomCleaning_CustomParams();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see pythonpipeline.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Schema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pythonpipeline.Schema#getId()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.Schema#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pythonpipeline.Schema#getAttributes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link pythonpipeline.Schema#getIdColumn <em>Id Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Column</em>'.
	 * @see pythonpipeline.Schema#getIdColumn()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_IdColumn();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.JoinAttributesList <em>Join Attributes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Attributes List</em>'.
	 * @see pythonpipeline.JoinAttributesList
	 * @generated
	 */
	EClass getJoinAttributesList();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.JoinAttributesList#getJoinAttributes <em>Join Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Join Attributes</em>'.
	 * @see pythonpipeline.JoinAttributesList#getJoinAttributes()
	 * @see #getJoinAttributesList()
	 * @generated
	 */
	EReference getJoinAttributesList_JoinAttributes();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.JoinAttributesList#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pythonpipeline.JoinAttributesList#getId()
	 * @see #getJoinAttributesList()
	 * @generated
	 */
	EAttribute getJoinAttributesList_Id();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.RuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Info</em>'.
	 * @see pythonpipeline.RuntimeInfo
	 * @generated
	 */
	EClass getRuntimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.RuntimeInfo#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see pythonpipeline.RuntimeInfo#getStartTime()
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	EAttribute getRuntimeInfo_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.RuntimeInfo#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see pythonpipeline.RuntimeInfo#getEndTime()
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	EAttribute getRuntimeInfo_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.RuntimeInfo#getExecutionId <em>Execution Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Id</em>'.
	 * @see pythonpipeline.RuntimeInfo#getExecutionId()
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	EAttribute getRuntimeInfo_ExecutionId();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.ChangeDataFormat <em>Change Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Data Format</em>'.
	 * @see pythonpipeline.ChangeDataFormat
	 * @generated
	 */
	EClass getChangeDataFormat();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVM</em>'.
	 * @see pythonpipeline.SVM
	 * @generated
	 */
	EClass getSVM();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.SVM#getKernelFunction <em>Kernel Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Function</em>'.
	 * @see pythonpipeline.SVM#getKernelFunction()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_KernelFunction();

	/**
	 * Returns the meta object for the attribute list '{@link pythonpipeline.SVM#getEstimatedCoefficients <em>Estimated Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Estimated Coefficients</em>'.
	 * @see pythonpipeline.SVM#getEstimatedCoefficients()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_EstimatedCoefficients();

	/**
	 * Returns the meta object for the attribute list '{@link pythonpipeline.SVM#getKernelParams <em>Kernel Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Kernel Params</em>'.
	 * @see pythonpipeline.SVM#getKernelParams()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_KernelParams();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.SVM#getSupportVectors <em>Support Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Vectors</em>'.
	 * @see pythonpipeline.SVM#getSupportVectors()
	 * @see #getSVM()
	 * @generated
	 */
	EReference getSVM_SupportVectors();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.KMeans <em>KMeans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KMeans</em>'.
	 * @see pythonpipeline.KMeans
	 * @generated
	 */
	EClass getKMeans();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.KMeans#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see pythonpipeline.KMeans#getK()
	 * @see #getKMeans()
	 * @generated
	 */
	EAttribute getKMeans_K();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Hierarchical <em>Hierarchical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical</em>'.
	 * @see pythonpipeline.Hierarchical
	 * @generated
	 */
	EClass getHierarchical();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Agglomerative <em>Agglomerative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agglomerative</em>'.
	 * @see pythonpipeline.Agglomerative
	 * @generated
	 */
	EClass getAgglomerative();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Agglomerative#getInterClusterSimilarity <em>Inter Cluster Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inter Cluster Similarity</em>'.
	 * @see pythonpipeline.Agglomerative#getInterClusterSimilarity()
	 * @see #getAgglomerative()
	 * @generated
	 */
	EAttribute getAgglomerative_InterClusterSimilarity();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Agglomerative#getCutHeight <em>Cut Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Height</em>'.
	 * @see pythonpipeline.Agglomerative#getCutHeight()
	 * @see #getAgglomerative()
	 * @generated
	 */
	EAttribute getAgglomerative_CutHeight();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.DBSCAN <em>DBSCAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBSCAN</em>'.
	 * @see pythonpipeline.DBSCAN
	 * @generated
	 */
	EClass getDBSCAN();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.DBSCAN#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see pythonpipeline.DBSCAN#getRadius()
	 * @see #getDBSCAN()
	 * @generated
	 */
	EAttribute getDBSCAN_Radius();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.DBSCAN#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see pythonpipeline.DBSCAN#getThreshold()
	 * @see #getDBSCAN()
	 * @generated
	 */
	EAttribute getDBSCAN_Threshold();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.LinearRegression <em>Linear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Regression</em>'.
	 * @see pythonpipeline.LinearRegression
	 * @generated
	 */
	EClass getLinearRegression();

	/**
	 * Returns the meta object for the attribute list '{@link pythonpipeline.LinearRegression#getEstimatedCoefficients <em>Estimated Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Estimated Coefficients</em>'.
	 * @see pythonpipeline.LinearRegression#getEstimatedCoefficients()
	 * @see #getLinearRegression()
	 * @generated
	 */
	EAttribute getLinearRegression_EstimatedCoefficients();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Ridge <em>Ridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ridge</em>'.
	 * @see pythonpipeline.Ridge
	 * @generated
	 */
	EClass getRidge();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Ridge#getPenaltyFactor <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Factor</em>'.
	 * @see pythonpipeline.Ridge#getPenaltyFactor()
	 * @see #getRidge()
	 * @generated
	 */
	EAttribute getRidge_PenaltyFactor();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Lasso <em>Lasso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lasso</em>'.
	 * @see pythonpipeline.Lasso
	 * @generated
	 */
	EClass getLasso();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.Lasso#getPenaltyFactor <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Factor</em>'.
	 * @see pythonpipeline.Lasso#getPenaltyFactor()
	 * @see #getLasso()
	 * @generated
	 */
	EAttribute getLasso_PenaltyFactor();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Mean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mean</em>'.
	 * @see pythonpipeline.Mean
	 * @generated
	 */
	EClass getMean();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Median</em>'.
	 * @see pythonpipeline.Median
	 * @generated
	 */
	EClass getMedian();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.StandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Deviation</em>'.
	 * @see pythonpipeline.StandardDeviation
	 * @generated
	 */
	EClass getStandardDeviation();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.LogicProposition <em>Logic Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Proposition</em>'.
	 * @see pythonpipeline.LogicProposition
	 * @generated
	 */
	EClass getLogicProposition();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.LogicProposition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pythonpipeline.LogicProposition#getId()
	 * @see #getLogicProposition()
	 * @generated
	 */
	EAttribute getLogicProposition_Id();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.NotClause <em>Not Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Clause</em>'.
	 * @see pythonpipeline.NotClause
	 * @generated
	 */
	EClass getNotClause();

	/**
	 * Returns the meta object for the containment reference '{@link pythonpipeline.NotClause#getSubClause <em>Sub Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Clause</em>'.
	 * @see pythonpipeline.NotClause#getSubClause()
	 * @see #getNotClause()
	 * @generated
	 */
	EReference getNotClause_SubClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.MultiOperandClause <em>Multi Operand Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Operand Clause</em>'.
	 * @see pythonpipeline.MultiOperandClause
	 * @generated
	 */
	EClass getMultiOperandClause();

	/**
	 * Returns the meta object for the containment reference list '{@link pythonpipeline.MultiOperandClause#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see pythonpipeline.MultiOperandClause#getOperands()
	 * @see #getMultiOperandClause()
	 * @generated
	 */
	EReference getMultiOperandClause_Operands();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.AndClause <em>And Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Clause</em>'.
	 * @see pythonpipeline.AndClause
	 * @generated
	 */
	EClass getAndClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.OrClause <em>Or Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Clause</em>'.
	 * @see pythonpipeline.OrClause
	 * @generated
	 */
	EClass getOrClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.ValueClause <em>Value Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Clause</em>'.
	 * @see pythonpipeline.ValueClause
	 * @generated
	 */
	EClass getValueClause();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.ValueClause#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see pythonpipeline.ValueClause#getComparisonValue()
	 * @see #getValueClause()
	 * @generated
	 */
	EAttribute getValueClause_ComparisonValue();

	/**
	 * Returns the meta object for the containment reference '{@link pythonpipeline.ValueClause#getConditionField <em>Condition Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Field</em>'.
	 * @see pythonpipeline.ValueClause#getConditionField()
	 * @see #getValueClause()
	 * @generated
	 */
	EReference getValueClause_ConditionField();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.ValueClause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pythonpipeline.ValueClause#getType()
	 * @see #getValueClause()
	 * @generated
	 */
	EAttribute getValueClause_Type();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.LtClause <em>Lt Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lt Clause</em>'.
	 * @see pythonpipeline.LtClause
	 * @generated
	 */
	EClass getLtClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.GtClause <em>Gt Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt Clause</em>'.
	 * @see pythonpipeline.GtClause
	 * @generated
	 */
	EClass getGtClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.EqClause <em>Eq Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Clause</em>'.
	 * @see pythonpipeline.EqClause
	 * @generated
	 */
	EClass getEqClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.LeClause <em>Le Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Le Clause</em>'.
	 * @see pythonpipeline.LeClause
	 * @generated
	 */
	EClass getLeClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.GeClause <em>Ge Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ge Clause</em>'.
	 * @see pythonpipeline.GeClause
	 * @generated
	 */
	EClass getGeClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.ContainsClause <em>Contains Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Clause</em>'.
	 * @see pythonpipeline.ContainsClause
	 * @generated
	 */
	EClass getContainsClause();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see pythonpipeline.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pythonpipeline.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pythonpipeline.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Type();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.CustomParam <em>Custom Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Param</em>'.
	 * @see pythonpipeline.CustomParam
	 * @generated
	 */
	EClass getCustomParam();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.CustomParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pythonpipeline.CustomParam#getName()
	 * @see #getCustomParam()
	 * @generated
	 */
	EAttribute getCustomParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.CustomParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pythonpipeline.CustomParam#getType()
	 * @see #getCustomParam()
	 * @generated
	 */
	EAttribute getCustomParam_Type();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.CustomParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pythonpipeline.CustomParam#getValue()
	 * @see #getCustomParam()
	 * @generated
	 */
	EAttribute getCustomParam_Value();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see pythonpipeline.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.PrimaryKey#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copies</em>'.
	 * @see pythonpipeline.PrimaryKey#getCopies()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Copies();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see pythonpipeline.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.Attribute#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copies</em>'.
	 * @see pythonpipeline.Attribute#getCopies()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Copies();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.LogisticRegression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Regression</em>'.
	 * @see pythonpipeline.LogisticRegression
	 * @generated
	 */
	EClass getLogisticRegression();

	/**
	 * Returns the meta object for the attribute list '{@link pythonpipeline.LogisticRegression#getEstimatedCoefficients <em>Estimated Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Estimated Coefficients</em>'.
	 * @see pythonpipeline.LogisticRegression#getEstimatedCoefficients()
	 * @see #getLogisticRegression()
	 * @generated
	 */
	EAttribute getLogisticRegression_EstimatedCoefficients();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Skewness <em>Skewness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skewness</em>'.
	 * @see pythonpipeline.Skewness
	 * @generated
	 */
	EClass getSkewness();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter Plot</em>'.
	 * @see pythonpipeline.ScatterPlot
	 * @generated
	 */
	EClass getScatterPlot();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.ScatterPlot#getIndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Independent Variables</em>'.
	 * @see pythonpipeline.ScatterPlot#getIndependentVariables()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EReference getScatterPlot_IndependentVariables();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.ScatterPlot#getResponseVariable <em>Response Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Variable</em>'.
	 * @see pythonpipeline.ScatterPlot#getResponseVariable()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EReference getScatterPlot_ResponseVariable();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.LabeledScatterPlot <em>Labeled Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Scatter Plot</em>'.
	 * @see pythonpipeline.LabeledScatterPlot
	 * @generated
	 */
	EClass getLabeledScatterPlot();

	/**
	 * Returns the meta object for the reference '{@link pythonpipeline.LabeledScatterPlot#getLabelAttribute <em>Label Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label Attribute</em>'.
	 * @see pythonpipeline.LabeledScatterPlot#getLabelAttribute()
	 * @see #getLabeledScatterPlot()
	 * @generated
	 */
	EReference getLabeledScatterPlot_LabelAttribute();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram</em>'.
	 * @see pythonpipeline.Histogram
	 * @generated
	 */
	EClass getHistogram();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.PiePlot <em>Pie Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Plot</em>'.
	 * @see pythonpipeline.PiePlot
	 * @generated
	 */
	EClass getPiePlot();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.ProjectOnAttributes <em>Project On Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project On Attributes</em>'.
	 * @see pythonpipeline.ProjectOnAttributes
	 * @generated
	 */
	EClass getProjectOnAttributes();

	/**
	 * Returns the meta object for the reference list '{@link pythonpipeline.ProjectOnAttributes#getProjectionAttributes <em>Projection Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projection Attributes</em>'.
	 * @see pythonpipeline.ProjectOnAttributes#getProjectionAttributes()
	 * @see #getProjectOnAttributes()
	 * @generated
	 */
	EReference getProjectOnAttributes_ProjectionAttributes();

	/**
	 * Returns the meta object for class '{@link pythonpipeline.SupportVector <em>Support Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Vector</em>'.
	 * @see pythonpipeline.SupportVector
	 * @generated
	 */
	EClass getSupportVector();

	/**
	 * Returns the meta object for the attribute list '{@link pythonpipeline.SupportVector#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vector</em>'.
	 * @see pythonpipeline.SupportVector#getVector()
	 * @see #getSupportVector()
	 * @generated
	 */
	EAttribute getSupportVector_Vector();

	/**
	 * Returns the meta object for the attribute '{@link pythonpipeline.SupportVector#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see pythonpipeline.SupportVector#getIndex()
	 * @see #getSupportVector()
	 * @generated
	 */
	EAttribute getSupportVector_Index();

	/**
	 * Returns the meta object for enum '{@link pythonpipeline.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format</em>'.
	 * @see pythonpipeline.Format
	 * @generated
	 */
	EEnum getFormat();

	/**
	 * Returns the meta object for enum '{@link pythonpipeline.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see pythonpipeline.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link pythonpipeline.NulValuesPolicy <em>Nul Values Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nul Values Policy</em>'.
	 * @see pythonpipeline.NulValuesPolicy
	 * @generated
	 */
	EEnum getNulValuesPolicy();

	/**
	 * Returns the meta object for enum '{@link pythonpipeline.KernelFunction <em>Kernel Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kernel Function</em>'.
	 * @see pythonpipeline.KernelFunction
	 * @generated
	 */
	EEnum getKernelFunction();

	/**
	 * Returns the meta object for enum '{@link pythonpipeline.InterClusterSimilarity <em>Inter Cluster Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inter Cluster Similarity</em>'.
	 * @see pythonpipeline.InterClusterSimilarity
	 * @generated
	 */
	EEnum getInterClusterSimilarity();

	/**
	 * Returns the meta object for enum '{@link pythonpipeline.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see pythonpipeline.SourceType
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
	PythonpipelineFactory getPythonpipelineFactory();

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
		 * The meta object literal for the '{@link pythonpipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.PipelineImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPipeline()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.TaskImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Output Schema</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link pythonpipeline.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DataFlowImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataFlow()
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
		 * The meta object literal for the '<em><b>Type Of Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TYPE_OF_DATA = eINSTANCE.getDataFlow_TypeOfData();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.DataCollectionImpl <em>Data Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DataCollectionImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataCollection()
		 * @generated
		 */
		EClass DATA_COLLECTION = eINSTANCE.getDataCollection();

		/**
		 * The meta object literal for the '<em><b>Source Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTION__SOURCE_DECLARATION = eINSTANCE.getDataCollection_SourceDeclaration();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.DataIntegrationImpl <em>Data Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DataIntegrationImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataIntegration()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.DataAnalysisImpl <em>Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DataAnalysisImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataAnalysis()
		 * @generated
		 */
		EClass DATA_ANALYSIS = eINSTANCE.getDataAnalysis();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DataCleaningImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataCleaning()
		 * @generated
		 */
		EClass DATA_CLEANING = eINSTANCE.getDataCleaning();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.DataVisualizationImpl <em>Data Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DataVisualizationImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDataVisualization()
		 * @generated
		 */
		EClass DATA_VISUALIZATION = eINSTANCE.getDataVisualization();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ExportImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getExport()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.InputSourceDeclarationImpl <em>Input Source Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.InputSourceDeclarationImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getInputSourceDeclaration()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SOURCE_DECLARATION__ID = eINSTANCE.getInputSourceDeclaration_Id();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.OutputFileImpl <em>Output File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.OutputFileImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getOutputFile()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ClassificationImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Classifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION__CLASSIFIES = eINSTANCE.getClassification_Classifies();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.PredictionImpl <em>Prediction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.PredictionImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPrediction()
		 * @generated
		 */
		EClass PREDICTION = eINSTANCE.getPrediction();

		/**
		 * The meta object literal for the '<em><b>Predicts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTION__PREDICTS = eINSTANCE.getPrediction_Predicts();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ClusteringImpl <em>Clustering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ClusteringImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getClustering()
		 * @generated
		 */
		EClass CLUSTERING = eINSTANCE.getClustering();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTERING__CLUSTERS = eINSTANCE.getClustering_Clusters();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DescriptionImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ColumnImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getColumn()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.NullValuesRemovalImpl <em>Null Values Removal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.NullValuesRemovalImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getNullValuesRemoval()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.CustomCleaningImpl <em>Custom Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.CustomCleaningImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getCustomCleaning()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.SchemaImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSchema()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.JoinAttributesListImpl <em>Join Attributes List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.JoinAttributesListImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getJoinAttributesList()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.RuntimeInfoImpl <em>Runtime Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.RuntimeInfoImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getRuntimeInfo()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.ChangeDataFormatImpl <em>Change Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ChangeDataFormatImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getChangeDataFormat()
		 * @generated
		 */
		EClass CHANGE_DATA_FORMAT = eINSTANCE.getChangeDataFormat();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.SVMImpl <em>SVM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.SVMImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSVM()
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
		 * The meta object literal for the '<em><b>Kernel Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVM__KERNEL_PARAMS = eINSTANCE.getSVM_KernelParams();

		/**
		 * The meta object literal for the '<em><b>Support Vectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVM__SUPPORT_VECTORS = eINSTANCE.getSVM_SupportVectors();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.KMeansImpl <em>KMeans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.KMeansImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getKMeans()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.HierarchicalImpl <em>Hierarchical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.HierarchicalImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getHierarchical()
		 * @generated
		 */
		EClass HIERARCHICAL = eINSTANCE.getHierarchical();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.AgglomerativeImpl <em>Agglomerative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.AgglomerativeImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getAgglomerative()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.DBSCANImpl <em>DBSCAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.DBSCANImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getDBSCAN()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.LinearRegressionImpl <em>Linear Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LinearRegressionImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLinearRegression()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.RidgeImpl <em>Ridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.RidgeImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getRidge()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.LassoImpl <em>Lasso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LassoImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLasso()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.MeanImpl <em>Mean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.MeanImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getMean()
		 * @generated
		 */
		EClass MEAN = eINSTANCE.getMean();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.MedianImpl <em>Median</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.MedianImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getMedian()
		 * @generated
		 */
		EClass MEDIAN = eINSTANCE.getMedian();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.StandardDeviationImpl <em>Standard Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.StandardDeviationImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getStandardDeviation()
		 * @generated
		 */
		EClass STANDARD_DEVIATION = eINSTANCE.getStandardDeviation();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.LogicPropositionImpl <em>Logic Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LogicPropositionImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLogicProposition()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.NotClauseImpl <em>Not Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.NotClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getNotClause()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.MultiOperandClauseImpl <em>Multi Operand Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.MultiOperandClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getMultiOperandClause()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.AndClauseImpl <em>And Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.AndClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getAndClause()
		 * @generated
		 */
		EClass AND_CLAUSE = eINSTANCE.getAndClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.OrClauseImpl <em>Or Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.OrClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getOrClause()
		 * @generated
		 */
		EClass OR_CLAUSE = eINSTANCE.getOrClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ValueClauseImpl <em>Value Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ValueClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getValueClause()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.LtClauseImpl <em>Lt Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LtClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLtClause()
		 * @generated
		 */
		EClass LT_CLAUSE = eINSTANCE.getLtClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.GtClauseImpl <em>Gt Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.GtClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getGtClause()
		 * @generated
		 */
		EClass GT_CLAUSE = eINSTANCE.getGtClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.EqClauseImpl <em>Eq Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.EqClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getEqClause()
		 * @generated
		 */
		EClass EQ_CLAUSE = eINSTANCE.getEqClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.LeClauseImpl <em>Le Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LeClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLeClause()
		 * @generated
		 */
		EClass LE_CLAUSE = eINSTANCE.getLeClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.GeClauseImpl <em>Ge Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.GeClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getGeClause()
		 * @generated
		 */
		EClass GE_CLAUSE = eINSTANCE.getGeClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ContainsClauseImpl <em>Contains Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ContainsClauseImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getContainsClause()
		 * @generated
		 */
		EClass CONTAINS_CLAUSE = eINSTANCE.getContainsClause();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.QueryParamImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getQueryParam()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.CustomParamImpl <em>Custom Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.CustomParamImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getCustomParam()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PARAM__VALUE = eINSTANCE.getCustomParam_Value();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.PrimaryKeyImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPrimaryKey()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.AttributeImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Copies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__COPIES = eINSTANCE.getAttribute_Copies();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.LogisticRegressionImpl <em>Logistic Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LogisticRegressionImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLogisticRegression()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.SkewnessImpl <em>Skewness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.SkewnessImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSkewness()
		 * @generated
		 */
		EClass SKEWNESS = eINSTANCE.getSkewness();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ScatterPlotImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getScatterPlot()
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
		 * The meta object literal for the '<em><b>Response Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCATTER_PLOT__RESPONSE_VARIABLE = eINSTANCE.getScatterPlot_ResponseVariable();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.LabeledScatterPlotImpl <em>Labeled Scatter Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.LabeledScatterPlotImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getLabeledScatterPlot()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.HistogramImpl <em>Histogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.HistogramImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getHistogram()
		 * @generated
		 */
		EClass HISTOGRAM = eINSTANCE.getHistogram();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.PiePlotImpl <em>Pie Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.PiePlotImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getPiePlot()
		 * @generated
		 */
		EClass PIE_PLOT = eINSTANCE.getPiePlot();

		/**
		 * The meta object literal for the '{@link pythonpipeline.impl.ProjectOnAttributesImpl <em>Project On Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.ProjectOnAttributesImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getProjectOnAttributes()
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
		 * The meta object literal for the '{@link pythonpipeline.impl.SupportVectorImpl <em>Support Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.impl.SupportVectorImpl
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSupportVector()
		 * @generated
		 */
		EClass SUPPORT_VECTOR = eINSTANCE.getSupportVector();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_VECTOR__VECTOR = eINSTANCE.getSupportVector_Vector();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_VECTOR__INDEX = eINSTANCE.getSupportVector_Index();

		/**
		 * The meta object literal for the '{@link pythonpipeline.Format <em>Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.Format
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getFormat()
		 * @generated
		 */
		EEnum FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '{@link pythonpipeline.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.Type
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link pythonpipeline.NulValuesPolicy <em>Nul Values Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.NulValuesPolicy
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getNulValuesPolicy()
		 * @generated
		 */
		EEnum NUL_VALUES_POLICY = eINSTANCE.getNulValuesPolicy();

		/**
		 * The meta object literal for the '{@link pythonpipeline.KernelFunction <em>Kernel Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.KernelFunction
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getKernelFunction()
		 * @generated
		 */
		EEnum KERNEL_FUNCTION = eINSTANCE.getKernelFunction();

		/**
		 * The meta object literal for the '{@link pythonpipeline.InterClusterSimilarity <em>Inter Cluster Similarity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.InterClusterSimilarity
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getInterClusterSimilarity()
		 * @generated
		 */
		EEnum INTER_CLUSTER_SIMILARITY = eINSTANCE.getInterClusterSimilarity();

		/**
		 * The meta object literal for the '{@link pythonpipeline.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pythonpipeline.SourceType
		 * @see pythonpipeline.impl.PythonpipelinePackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

	}

} //PythonpipelinePackage
