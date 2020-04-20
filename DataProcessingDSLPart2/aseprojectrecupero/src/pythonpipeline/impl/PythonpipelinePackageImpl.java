/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pythonpipeline.Agglomerative;
import pythonpipeline.AndClause;
import pythonpipeline.Attribute;
import pythonpipeline.ChangeDataFormat;
import pythonpipeline.Classification;
import pythonpipeline.Clustering;
import pythonpipeline.Column;
import pythonpipeline.ContainsClause;
import pythonpipeline.CustomCleaning;
import pythonpipeline.CustomParam;
import pythonpipeline.DataAnalysis;
import pythonpipeline.DataCleaning;
import pythonpipeline.DataCollection;
import pythonpipeline.DataFlow;
import pythonpipeline.DataIntegration;
import pythonpipeline.DataVisualization;
import pythonpipeline.Description;
import pythonpipeline.EqClause;
import pythonpipeline.Export;
import pythonpipeline.Format;
import pythonpipeline.GeClause;
import pythonpipeline.GtClause;
import pythonpipeline.Hierarchical;
import pythonpipeline.Histogram;
import pythonpipeline.InputSourceDeclaration;
import pythonpipeline.InterClusterSimilarity;
import pythonpipeline.JoinAttributesList;
import pythonpipeline.KMeans;
import pythonpipeline.KernelFunction;
import pythonpipeline.LabeledScatterPlot;
import pythonpipeline.Lasso;
import pythonpipeline.LeClause;
import pythonpipeline.LinearRegression;
import pythonpipeline.LogicProposition;
import pythonpipeline.LogisticRegression;
import pythonpipeline.LtClause;
import pythonpipeline.Mean;
import pythonpipeline.Median;
import pythonpipeline.MultiOperandClause;
import pythonpipeline.NotClause;
import pythonpipeline.NulValuesPolicy;
import pythonpipeline.NullValuesRemoval;
import pythonpipeline.OrClause;
import pythonpipeline.OutputFile;
import pythonpipeline.PiePlot;
import pythonpipeline.Pipeline;
import pythonpipeline.Prediction;
import pythonpipeline.PrimaryKey;
import pythonpipeline.ProjectOnAttributes;
import pythonpipeline.PythonpipelineFactory;
import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.QueryParam;
import pythonpipeline.Ridge;
import pythonpipeline.RuntimeInfo;
import pythonpipeline.ScatterPlot;
import pythonpipeline.Schema;
import pythonpipeline.Skewness;
import pythonpipeline.SourceType;
import pythonpipeline.StandardDeviation;
import pythonpipeline.SupportVector;
import pythonpipeline.Task;
import pythonpipeline.Type;
import pythonpipeline.ValueClause;

import pythonpipeline.util.PythonpipelineValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PythonpipelinePackageImpl extends EPackageImpl implements PythonpipelinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIntegrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCleaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSourceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValuesRemovalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customCleaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinAttributesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeDataFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kMeansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agglomerativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbscanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearRegressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lassoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicPropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiOperandClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticRegressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skewnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scatterPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledScatterPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piePlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectOnAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nulValuesPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kernelFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interClusterSimilarityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pythonpipeline.PythonpipelinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PythonpipelinePackageImpl() {
		super(eNS_URI, PythonpipelineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PythonpipelinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PythonpipelinePackage init() {
		if (isInited) return (PythonpipelinePackage)EPackage.Registry.INSTANCE.getEPackage(PythonpipelinePackage.eNS_URI);

		// Obtain or create and register package
		PythonpipelinePackageImpl thePythonpipelinePackage = (PythonpipelinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PythonpipelinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PythonpipelinePackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePythonpipelinePackage.createPackageContents();

		// Initialize created meta-data
		thePythonpipelinePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePythonpipelinePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PythonpipelineValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePythonpipelinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PythonpipelinePackage.eNS_URI, thePythonpipelinePackage);
		return thePythonpipelinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Tasks() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_DataFlows() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Schema() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_OutputFile() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipeline_PipelineName() {
		return (EAttribute)pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Input() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Output() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_RuntimeInfo() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_InputSchema() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OutputSchema() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_From() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_To() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlow_Format() {
		return (EAttribute)dataFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlow_Id() {
		return (EAttribute)dataFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_TypeOfData() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCollection() {
		return dataCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollection_SourceDeclaration() {
		return (EReference)dataCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataIntegration() {
		return dataIntegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntegration_JoinAttributesList() {
		return (EReference)dataIntegrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAnalysis() {
		return dataAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCleaning() {
		return dataCleaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataVisualization() {
		return dataVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExport() {
		return exportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExport_Writes() {
		return (EReference)exportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSourceDeclaration() {
		return inputSourceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSourceDeclaration_SourceURI() {
		return (EAttribute)inputSourceDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSourceDeclaration_QueryEndpoint() {
		return (EAttribute)inputSourceDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSourceDeclaration_ExchangeFormat() {
		return (EAttribute)inputSourceDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSourceDeclaration_SourceSchema() {
		return (EReference)inputSourceDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSourceDeclaration_SourceType() {
		return (EAttribute)inputSourceDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSourceDeclaration_QueryConditions() {
		return (EReference)inputSourceDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSourceDeclaration_Id() {
		return (EAttribute)inputSourceDeclarationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputFile() {
		return outputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputFile_FileFormat() {
		return (EAttribute)outputFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputFile_StoragePath() {
		return (EAttribute)outputFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputFile_Name() {
		return (EAttribute)outputFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputFile_Export() {
		return (EReference)outputFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassification_Classifies() {
		return (EReference)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrediction() {
		return predictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrediction_Predicts() {
		return (EReference)predictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClustering() {
		return clusteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClustering_Clusters() {
		return (EReference)clusteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Type() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValuesRemoval() {
		return nullValuesRemovalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullValuesRemoval_Policy() {
		return (EAttribute)nullValuesRemovalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCleaning() {
		return customCleaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomCleaning_Name() {
		return (EAttribute)customCleaningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomCleaning_CustomParams() {
		return (EReference)customCleaningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Id() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Attributes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_IdColumn() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinAttributesList() {
		return joinAttributesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinAttributesList_JoinAttributes() {
		return (EReference)joinAttributesListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinAttributesList_Id() {
		return (EAttribute)joinAttributesListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeInfo() {
		return runtimeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInfo_StartTime() {
		return (EAttribute)runtimeInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInfo_EndTime() {
		return (EAttribute)runtimeInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeInfo_ExecutionId() {
		return (EAttribute)runtimeInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeDataFormat() {
		return changeDataFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSVM() {
		return svmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVM_KernelFunction() {
		return (EAttribute)svmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVM_EstimatedCoefficients() {
		return (EAttribute)svmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVM_KernelParams() {
		return (EAttribute)svmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSVM_SupportVectors() {
		return (EReference)svmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKMeans() {
		return kMeansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKMeans_K() {
		return (EAttribute)kMeansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchical() {
		return hierarchicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgglomerative() {
		return agglomerativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgglomerative_InterClusterSimilarity() {
		return (EAttribute)agglomerativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgglomerative_CutHeight() {
		return (EAttribute)agglomerativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBSCAN() {
		return dbscanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBSCAN_Radius() {
		return (EAttribute)dbscanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBSCAN_Threshold() {
		return (EAttribute)dbscanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearRegression() {
		return linearRegressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRegression_EstimatedCoefficients() {
		return (EAttribute)linearRegressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRidge() {
		return ridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRidge_PenaltyFactor() {
		return (EAttribute)ridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLasso() {
		return lassoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLasso_PenaltyFactor() {
		return (EAttribute)lassoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMean() {
		return meanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedian() {
		return medianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDeviation() {
		return standardDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicProposition() {
		return logicPropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicProposition_Id() {
		return (EAttribute)logicPropositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotClause() {
		return notClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotClause_SubClause() {
		return (EReference)notClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiOperandClause() {
		return multiOperandClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiOperandClause_Operands() {
		return (EReference)multiOperandClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndClause() {
		return andClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrClause() {
		return orClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueClause() {
		return valueClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueClause_ComparisonValue() {
		return (EAttribute)valueClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueClause_ConditionField() {
		return (EReference)valueClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueClause_Type() {
		return (EAttribute)valueClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLtClause() {
		return ltClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGtClause() {
		return gtClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqClause() {
		return eqClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeClause() {
		return leClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeClause() {
		return geClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsClause() {
		return containsClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParam() {
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Name() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Type() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomParam() {
		return customParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomParam_Name() {
		return (EAttribute)customParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomParam_Type() {
		return (EAttribute)customParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomParam_Value() {
		return (EAttribute)customParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKey() {
		return primaryKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKey_Copies() {
		return (EReference)primaryKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Copies() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogisticRegression() {
		return logisticRegressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogisticRegression_EstimatedCoefficients() {
		return (EAttribute)logisticRegressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkewness() {
		return skewnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScatterPlot() {
		return scatterPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScatterPlot_IndependentVariables() {
		return (EReference)scatterPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScatterPlot_ResponseVariable() {
		return (EReference)scatterPlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledScatterPlot() {
		return labeledScatterPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabeledScatterPlot_LabelAttribute() {
		return (EReference)labeledScatterPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogram() {
		return histogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiePlot() {
		return piePlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectOnAttributes() {
		return projectOnAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectOnAttributes_ProjectionAttributes() {
		return (EReference)projectOnAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportVector() {
		return supportVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportVector_Vector() {
		return (EAttribute)supportVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportVector_Index() {
		return (EAttribute)supportVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormat() {
		return formatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNulValuesPolicy() {
		return nulValuesPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKernelFunction() {
		return kernelFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterClusterSimilarity() {
		return interClusterSimilarityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceType() {
		return sourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonpipelineFactory getPythonpipelineFactory() {
		return (PythonpipelineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__TASKS);
		createEReference(pipelineEClass, PIPELINE__DATA_FLOWS);
		createEReference(pipelineEClass, PIPELINE__SCHEMA);
		createEReference(pipelineEClass, PIPELINE__OUTPUT_FILE);
		createEAttribute(pipelineEClass, PIPELINE__PIPELINE_NAME);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__INPUT);
		createEReference(taskEClass, TASK__OUTPUT);
		createEReference(taskEClass, TASK__RUNTIME_INFO);
		createEReference(taskEClass, TASK__INPUT_SCHEMA);
		createEReference(taskEClass, TASK__OUTPUT_SCHEMA);
		createEAttribute(taskEClass, TASK__ID);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__FROM);
		createEReference(dataFlowEClass, DATA_FLOW__TO);
		createEAttribute(dataFlowEClass, DATA_FLOW__FORMAT);
		createEAttribute(dataFlowEClass, DATA_FLOW__ID);
		createEReference(dataFlowEClass, DATA_FLOW__TYPE_OF_DATA);

		dataCollectionEClass = createEClass(DATA_COLLECTION);
		createEReference(dataCollectionEClass, DATA_COLLECTION__SOURCE_DECLARATION);

		dataIntegrationEClass = createEClass(DATA_INTEGRATION);
		createEReference(dataIntegrationEClass, DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST);

		dataAnalysisEClass = createEClass(DATA_ANALYSIS);

		dataCleaningEClass = createEClass(DATA_CLEANING);

		dataVisualizationEClass = createEClass(DATA_VISUALIZATION);

		exportEClass = createEClass(EXPORT);
		createEReference(exportEClass, EXPORT__WRITES);

		inputSourceDeclarationEClass = createEClass(INPUT_SOURCE_DECLARATION);
		createEAttribute(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__SOURCE_URI);
		createEAttribute(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT);
		createEAttribute(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT);
		createEReference(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA);
		createEAttribute(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__SOURCE_TYPE);
		createEReference(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS);
		createEAttribute(inputSourceDeclarationEClass, INPUT_SOURCE_DECLARATION__ID);

		outputFileEClass = createEClass(OUTPUT_FILE);
		createEAttribute(outputFileEClass, OUTPUT_FILE__FILE_FORMAT);
		createEAttribute(outputFileEClass, OUTPUT_FILE__STORAGE_PATH);
		createEAttribute(outputFileEClass, OUTPUT_FILE__NAME);
		createEReference(outputFileEClass, OUTPUT_FILE__EXPORT);

		classificationEClass = createEClass(CLASSIFICATION);
		createEReference(classificationEClass, CLASSIFICATION__CLASSIFIES);

		predictionEClass = createEClass(PREDICTION);
		createEReference(predictionEClass, PREDICTION__PREDICTS);

		clusteringEClass = createEClass(CLUSTERING);
		createEReference(clusteringEClass, CLUSTERING__CLUSTERS);

		descriptionEClass = createEClass(DESCRIPTION);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__NAME);
		createEAttribute(columnEClass, COLUMN__TYPE);

		nullValuesRemovalEClass = createEClass(NULL_VALUES_REMOVAL);
		createEAttribute(nullValuesRemovalEClass, NULL_VALUES_REMOVAL__POLICY);

		customCleaningEClass = createEClass(CUSTOM_CLEANING);
		createEAttribute(customCleaningEClass, CUSTOM_CLEANING__NAME);
		createEReference(customCleaningEClass, CUSTOM_CLEANING__CUSTOM_PARAMS);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__ID);
		createEReference(schemaEClass, SCHEMA__ATTRIBUTES);
		createEReference(schemaEClass, SCHEMA__ID_COLUMN);

		joinAttributesListEClass = createEClass(JOIN_ATTRIBUTES_LIST);
		createEReference(joinAttributesListEClass, JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES);
		createEAttribute(joinAttributesListEClass, JOIN_ATTRIBUTES_LIST__ID);

		runtimeInfoEClass = createEClass(RUNTIME_INFO);
		createEAttribute(runtimeInfoEClass, RUNTIME_INFO__START_TIME);
		createEAttribute(runtimeInfoEClass, RUNTIME_INFO__END_TIME);
		createEAttribute(runtimeInfoEClass, RUNTIME_INFO__EXECUTION_ID);

		changeDataFormatEClass = createEClass(CHANGE_DATA_FORMAT);

		svmEClass = createEClass(SVM);
		createEAttribute(svmEClass, SVM__KERNEL_FUNCTION);
		createEAttribute(svmEClass, SVM__ESTIMATED_COEFFICIENTS);
		createEAttribute(svmEClass, SVM__KERNEL_PARAMS);
		createEReference(svmEClass, SVM__SUPPORT_VECTORS);

		kMeansEClass = createEClass(KMEANS);
		createEAttribute(kMeansEClass, KMEANS__K);

		hierarchicalEClass = createEClass(HIERARCHICAL);

		agglomerativeEClass = createEClass(AGGLOMERATIVE);
		createEAttribute(agglomerativeEClass, AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY);
		createEAttribute(agglomerativeEClass, AGGLOMERATIVE__CUT_HEIGHT);

		dbscanEClass = createEClass(DBSCAN);
		createEAttribute(dbscanEClass, DBSCAN__RADIUS);
		createEAttribute(dbscanEClass, DBSCAN__THRESHOLD);

		linearRegressionEClass = createEClass(LINEAR_REGRESSION);
		createEAttribute(linearRegressionEClass, LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS);

		ridgeEClass = createEClass(RIDGE);
		createEAttribute(ridgeEClass, RIDGE__PENALTY_FACTOR);

		lassoEClass = createEClass(LASSO);
		createEAttribute(lassoEClass, LASSO__PENALTY_FACTOR);

		meanEClass = createEClass(MEAN);

		medianEClass = createEClass(MEDIAN);

		standardDeviationEClass = createEClass(STANDARD_DEVIATION);

		logicPropositionEClass = createEClass(LOGIC_PROPOSITION);
		createEAttribute(logicPropositionEClass, LOGIC_PROPOSITION__ID);

		notClauseEClass = createEClass(NOT_CLAUSE);
		createEReference(notClauseEClass, NOT_CLAUSE__SUB_CLAUSE);

		multiOperandClauseEClass = createEClass(MULTI_OPERAND_CLAUSE);
		createEReference(multiOperandClauseEClass, MULTI_OPERAND_CLAUSE__OPERANDS);

		andClauseEClass = createEClass(AND_CLAUSE);

		orClauseEClass = createEClass(OR_CLAUSE);

		valueClauseEClass = createEClass(VALUE_CLAUSE);
		createEAttribute(valueClauseEClass, VALUE_CLAUSE__COMPARISON_VALUE);
		createEReference(valueClauseEClass, VALUE_CLAUSE__CONDITION_FIELD);
		createEAttribute(valueClauseEClass, VALUE_CLAUSE__TYPE);

		ltClauseEClass = createEClass(LT_CLAUSE);

		gtClauseEClass = createEClass(GT_CLAUSE);

		eqClauseEClass = createEClass(EQ_CLAUSE);

		leClauseEClass = createEClass(LE_CLAUSE);

		geClauseEClass = createEClass(GE_CLAUSE);

		containsClauseEClass = createEClass(CONTAINS_CLAUSE);

		queryParamEClass = createEClass(QUERY_PARAM);
		createEAttribute(queryParamEClass, QUERY_PARAM__NAME);
		createEAttribute(queryParamEClass, QUERY_PARAM__TYPE);

		customParamEClass = createEClass(CUSTOM_PARAM);
		createEAttribute(customParamEClass, CUSTOM_PARAM__NAME);
		createEAttribute(customParamEClass, CUSTOM_PARAM__TYPE);
		createEAttribute(customParamEClass, CUSTOM_PARAM__VALUE);

		primaryKeyEClass = createEClass(PRIMARY_KEY);
		createEReference(primaryKeyEClass, PRIMARY_KEY__COPIES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__COPIES);

		logisticRegressionEClass = createEClass(LOGISTIC_REGRESSION);
		createEAttribute(logisticRegressionEClass, LOGISTIC_REGRESSION__ESTIMATED_COEFFICIENTS);

		skewnessEClass = createEClass(SKEWNESS);

		scatterPlotEClass = createEClass(SCATTER_PLOT);
		createEReference(scatterPlotEClass, SCATTER_PLOT__INDEPENDENT_VARIABLES);
		createEReference(scatterPlotEClass, SCATTER_PLOT__RESPONSE_VARIABLE);

		labeledScatterPlotEClass = createEClass(LABELED_SCATTER_PLOT);
		createEReference(labeledScatterPlotEClass, LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE);

		histogramEClass = createEClass(HISTOGRAM);

		piePlotEClass = createEClass(PIE_PLOT);

		projectOnAttributesEClass = createEClass(PROJECT_ON_ATTRIBUTES);
		createEReference(projectOnAttributesEClass, PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES);

		supportVectorEClass = createEClass(SUPPORT_VECTOR);
		createEAttribute(supportVectorEClass, SUPPORT_VECTOR__VECTOR);
		createEAttribute(supportVectorEClass, SUPPORT_VECTOR__INDEX);

		// Create enums
		formatEEnum = createEEnum(FORMAT);
		typeEEnum = createEEnum(TYPE);
		nulValuesPolicyEEnum = createEEnum(NUL_VALUES_POLICY);
		kernelFunctionEEnum = createEEnum(KERNEL_FUNCTION);
		interClusterSimilarityEEnum = createEEnum(INTER_CLUSTER_SIMILARITY);
		sourceTypeEEnum = createEEnum(SOURCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataCollectionEClass.getESuperTypes().add(this.getTask());
		dataIntegrationEClass.getESuperTypes().add(this.getTask());
		dataAnalysisEClass.getESuperTypes().add(this.getTask());
		dataCleaningEClass.getESuperTypes().add(this.getTask());
		dataVisualizationEClass.getESuperTypes().add(this.getTask());
		exportEClass.getESuperTypes().add(this.getTask());
		classificationEClass.getESuperTypes().add(this.getDataAnalysis());
		predictionEClass.getESuperTypes().add(this.getDataAnalysis());
		clusteringEClass.getESuperTypes().add(this.getDataAnalysis());
		descriptionEClass.getESuperTypes().add(this.getDataAnalysis());
		nullValuesRemovalEClass.getESuperTypes().add(this.getDataCleaning());
		customCleaningEClass.getESuperTypes().add(this.getDataCleaning());
		changeDataFormatEClass.getESuperTypes().add(this.getDataCleaning());
		svmEClass.getESuperTypes().add(this.getClassification());
		kMeansEClass.getESuperTypes().add(this.getClustering());
		hierarchicalEClass.getESuperTypes().add(this.getClustering());
		agglomerativeEClass.getESuperTypes().add(this.getHierarchical());
		dbscanEClass.getESuperTypes().add(this.getClustering());
		linearRegressionEClass.getESuperTypes().add(this.getPrediction());
		ridgeEClass.getESuperTypes().add(this.getLinearRegression());
		lassoEClass.getESuperTypes().add(this.getLinearRegression());
		meanEClass.getESuperTypes().add(this.getDescription());
		medianEClass.getESuperTypes().add(this.getDescription());
		standardDeviationEClass.getESuperTypes().add(this.getDescription());
		notClauseEClass.getESuperTypes().add(this.getLogicProposition());
		multiOperandClauseEClass.getESuperTypes().add(this.getLogicProposition());
		andClauseEClass.getESuperTypes().add(this.getMultiOperandClause());
		orClauseEClass.getESuperTypes().add(this.getMultiOperandClause());
		valueClauseEClass.getESuperTypes().add(this.getLogicProposition());
		ltClauseEClass.getESuperTypes().add(this.getValueClause());
		gtClauseEClass.getESuperTypes().add(this.getValueClause());
		eqClauseEClass.getESuperTypes().add(this.getValueClause());
		leClauseEClass.getESuperTypes().add(this.getValueClause());
		geClauseEClass.getESuperTypes().add(this.getValueClause());
		containsClauseEClass.getESuperTypes().add(this.getValueClause());
		primaryKeyEClass.getESuperTypes().add(this.getColumn());
		attributeEClass.getESuperTypes().add(this.getColumn());
		logisticRegressionEClass.getESuperTypes().add(this.getClassification());
		skewnessEClass.getESuperTypes().add(this.getDescription());
		scatterPlotEClass.getESuperTypes().add(this.getDataVisualization());
		labeledScatterPlotEClass.getESuperTypes().add(this.getScatterPlot());
		histogramEClass.getESuperTypes().add(this.getDataVisualization());
		piePlotEClass.getESuperTypes().add(this.getDataVisualization());
		projectOnAttributesEClass.getESuperTypes().add(this.getDataCleaning());

		// Initialize classes and features; add operations and parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Tasks(), this.getTask(), null, "tasks", null, 2, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_DataFlows(), this.getDataFlow(), null, "dataFlows", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Schema(), this.getSchema(), null, "schema", null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_OutputFile(), this.getOutputFile(), null, "outputFile", null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_PipelineName(), ecorePackage.getEString(), "pipelineName", null, 1, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Input(), this.getDataFlow(), this.getDataFlow_To(), "input", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Output(), this.getDataFlow(), this.getDataFlow_From(), "output", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_RuntimeInfo(), this.getRuntimeInfo(), null, "runtimeInfo", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_InputSchema(), this.getSchema(), null, "inputSchema", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OutputSchema(), this.getSchema(), null, "outputSchema", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getEString(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_From(), this.getTask(), this.getTask_Output(), "from", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_To(), this.getTask(), this.getTask_Input(), "to", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlow_Format(), this.getFormat(), "format", "", 0, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFlow_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_TypeOfData(), this.getSchema(), null, "typeOfData", null, 0, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCollectionEClass, DataCollection.class, "DataCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCollection_SourceDeclaration(), this.getInputSourceDeclaration(), null, "sourceDeclaration", null, 1, -1, DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataIntegrationEClass, DataIntegration.class, "DataIntegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataIntegration_JoinAttributesList(), this.getJoinAttributesList(), null, "joinAttributesList", null, 1, 1, DataIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAnalysisEClass, DataAnalysis.class, "DataAnalysis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataCleaningEClass, DataCleaning.class, "DataCleaning", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataVisualizationEClass, DataVisualization.class, "DataVisualization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportEClass, Export.class, "Export", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExport_Writes(), this.getOutputFile(), this.getOutputFile_Export(), "writes", null, 1, -1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputSourceDeclarationEClass, InputSourceDeclaration.class, "InputSourceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputSourceDeclaration_SourceURI(), ecorePackage.getEString(), "sourceURI", null, 1, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputSourceDeclaration_QueryEndpoint(), ecorePackage.getEString(), "queryEndpoint", null, 0, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputSourceDeclaration_ExchangeFormat(), this.getFormat(), "exchangeFormat", null, 1, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputSourceDeclaration_SourceSchema(), this.getSchema(), null, "sourceSchema", null, 1, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputSourceDeclaration_SourceType(), this.getSourceType(), "sourceType", null, 1, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputSourceDeclaration_QueryConditions(), this.getLogicProposition(), null, "queryConditions", null, 0, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputSourceDeclaration_Id(), ecorePackage.getEString(), "id", "", 1, 1, InputSourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputFileEClass, OutputFile.class, "OutputFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputFile_FileFormat(), this.getFormat(), "fileFormat", null, 1, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputFile_StoragePath(), ecorePackage.getEString(), "storagePath", null, 1, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputFile_Export(), this.getExport(), this.getExport_Writes(), "export", null, 1, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassification_Classifies(), this.getAttribute(), null, "classifies", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predictionEClass, Prediction.class, "Prediction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrediction_Predicts(), this.getAttribute(), null, "predicts", null, 1, 1, Prediction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusteringEClass, Clustering.class, "Clustering", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClustering_Clusters(), this.getAttribute(), null, "clusters", null, 1, 1, Clustering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnEClass, Column.class, "Column", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Type(), this.getType(), "type", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullValuesRemovalEClass, NullValuesRemoval.class, "NullValuesRemoval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullValuesRemoval_Policy(), this.getNulValuesPolicy(), "policy", null, 1, 1, NullValuesRemoval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customCleaningEClass, CustomCleaning.class, "CustomCleaning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomCleaning_Name(), ecorePackage.getEString(), "name", null, 1, 1, CustomCleaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomCleaning_CustomParams(), this.getCustomParam(), null, "customParams", null, 0, -1, CustomCleaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Id(), ecorePackage.getEString(), "id", null, 1, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_IdColumn(), this.getPrimaryKey(), null, "idColumn", null, 1, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinAttributesListEClass, JoinAttributesList.class, "JoinAttributesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinAttributesList_JoinAttributes(), this.getColumn(), null, "joinAttributes", null, 2, -1, JoinAttributesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinAttributesList_Id(), ecorePackage.getEString(), "id", null, 1, 1, JoinAttributesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeInfoEClass, RuntimeInfo.class, "RuntimeInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeInfo_StartTime(), ecorePackage.getEBigDecimal(), "startTime", null, 1, 1, RuntimeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInfo_EndTime(), ecorePackage.getEBigDecimal(), "endTime", null, 1, 1, RuntimeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInfo_ExecutionId(), ecorePackage.getEBigDecimal(), "executionId", null, 1, 1, RuntimeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeDataFormatEClass, ChangeDataFormat.class, "ChangeDataFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svmEClass, pythonpipeline.SVM.class, "SVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVM_KernelFunction(), this.getKernelFunction(), "kernelFunction", null, 0, 1, pythonpipeline.SVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVM_EstimatedCoefficients(), ecorePackage.getEBigDecimal(), "estimatedCoefficients", null, 1, -1, pythonpipeline.SVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVM_KernelParams(), ecorePackage.getEBigDecimal(), "kernelParams", null, 0, -1, pythonpipeline.SVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSVM_SupportVectors(), this.getSupportVector(), null, "supportVectors", null, 0, -1, pythonpipeline.SVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kMeansEClass, KMeans.class, "KMeans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKMeans_K(), ecorePackage.getEBigInteger(), "K", null, 1, 1, KMeans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hierarchicalEClass, Hierarchical.class, "Hierarchical", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agglomerativeEClass, Agglomerative.class, "Agglomerative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgglomerative_InterClusterSimilarity(), this.getInterClusterSimilarity(), "interClusterSimilarity", null, 1, 1, Agglomerative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgglomerative_CutHeight(), ecorePackage.getEBigInteger(), "CutHeight", null, 1, 1, Agglomerative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbscanEClass, pythonpipeline.DBSCAN.class, "DBSCAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBSCAN_Radius(), ecorePackage.getEBigDecimal(), "radius", null, 1, 1, pythonpipeline.DBSCAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBSCAN_Threshold(), ecorePackage.getEBigInteger(), "threshold", null, 1, 1, pythonpipeline.DBSCAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearRegressionEClass, LinearRegression.class, "LinearRegression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearRegression_EstimatedCoefficients(), ecorePackage.getEBigDecimal(), "estimatedCoefficients", null, 1, -1, LinearRegression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ridgeEClass, Ridge.class, "Ridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRidge_PenaltyFactor(), ecorePackage.getEBigDecimal(), "penaltyFactor", null, 1, 1, Ridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lassoEClass, Lasso.class, "Lasso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLasso_PenaltyFactor(), ecorePackage.getEBigDecimal(), "penaltyFactor", null, 1, 1, Lasso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meanEClass, Mean.class, "Mean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(medianEClass, Median.class, "Median", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardDeviationEClass, StandardDeviation.class, "StandardDeviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicPropositionEClass, LogicProposition.class, "LogicProposition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicProposition_Id(), ecorePackage.getEString(), "id", null, 1, 1, LogicProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notClauseEClass, NotClause.class, "NotClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotClause_SubClause(), this.getLogicProposition(), null, "subClause", null, 1, 1, NotClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiOperandClauseEClass, MultiOperandClause.class, "MultiOperandClause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiOperandClause_Operands(), this.getLogicProposition(), null, "operands", null, 2, -1, MultiOperandClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andClauseEClass, AndClause.class, "AndClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orClauseEClass, OrClause.class, "OrClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueClauseEClass, ValueClause.class, "ValueClause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueClause_ComparisonValue(), ecorePackage.getEString(), "comparisonValue", null, 1, 1, ValueClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueClause_ConditionField(), this.getQueryParam(), null, "conditionField", null, 1, 1, ValueClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueClause_Type(), this.getType(), "type", null, 1, 1, ValueClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltClauseEClass, LtClause.class, "LtClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gtClauseEClass, GtClause.class, "GtClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eqClauseEClass, EqClause.class, "EqClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leClauseEClass, LeClause.class, "LeClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geClauseEClass, GeClause.class, "GeClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsClauseEClass, ContainsClause.class, "ContainsClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParam_Name(), ecorePackage.getEString(), "name", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_Type(), this.getType(), "type", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customParamEClass, CustomParam.class, "CustomParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomParam_Name(), ecorePackage.getEString(), "name", null, 1, 1, CustomParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomParam_Type(), this.getType(), "type", null, 1, 1, CustomParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomParam_Value(), ecorePackage.getEString(), "value", null, 0, 1, CustomParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryKey_Copies(), this.getPrimaryKey(), null, "copies", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Copies(), this.getAttribute(), null, "copies", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticRegressionEClass, LogisticRegression.class, "LogisticRegression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogisticRegression_EstimatedCoefficients(), ecorePackage.getEBigDecimal(), "estimatedCoefficients", null, 1, -1, LogisticRegression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skewnessEClass, Skewness.class, "Skewness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scatterPlotEClass, ScatterPlot.class, "ScatterPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScatterPlot_IndependentVariables(), this.getAttribute(), null, "independentVariables", null, 1, -1, ScatterPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScatterPlot_ResponseVariable(), this.getAttribute(), null, "responseVariable", null, 1, 1, ScatterPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labeledScatterPlotEClass, LabeledScatterPlot.class, "LabeledScatterPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabeledScatterPlot_LabelAttribute(), this.getAttribute(), null, "labelAttribute", null, 1, 1, LabeledScatterPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramEClass, Histogram.class, "Histogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(piePlotEClass, PiePlot.class, "PiePlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectOnAttributesEClass, ProjectOnAttributes.class, "ProjectOnAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectOnAttributes_ProjectionAttributes(), this.getAttribute(), null, "projectionAttributes", null, 1, -1, ProjectOnAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportVectorEClass, SupportVector.class, "SupportVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportVector_Vector(), ecorePackage.getEBigDecimal(), "vector", null, 0, -1, SupportVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportVector_Index(), ecorePackage.getEBigDecimal(), "index", null, 1, 1, SupportVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(formatEEnum, Format.class, "Format");
		addEEnumLiteral(formatEEnum, Format.JSON);
		addEEnumLiteral(formatEEnum, Format.CSV);
		addEEnumLiteral(formatEEnum, Format.HTML);
		addEEnumLiteral(formatEEnum, Format.XLSX);
		addEEnumLiteral(formatEEnum, Format.IMAGE);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.FLOAT);
		addEEnumLiteral(typeEEnum, Type.BITMAP);

		initEEnum(nulValuesPolicyEEnum, NulValuesPolicy.class, "NulValuesPolicy");
		addEEnumLiteral(nulValuesPolicyEEnum, NulValuesPolicy.DROP_RECORD);
		addEEnumLiteral(nulValuesPolicyEEnum, NulValuesPolicy.MEAN_IMPUTATION);
		addEEnumLiteral(nulValuesPolicyEEnum, NulValuesPolicy.MEDIAN_IMPUTATION);

		initEEnum(kernelFunctionEEnum, KernelFunction.class, "KernelFunction");
		addEEnumLiteral(kernelFunctionEEnum, KernelFunction.LINEAR);
		addEEnumLiteral(kernelFunctionEEnum, KernelFunction.POLYNOMIAL);

		initEEnum(interClusterSimilarityEEnum, InterClusterSimilarity.class, "InterClusterSimilarity");
		addEEnumLiteral(interClusterSimilarityEEnum, InterClusterSimilarity.WD);
		addEEnumLiteral(interClusterSimilarityEEnum, InterClusterSimilarity.CL);
		addEEnumLiteral(interClusterSimilarityEEnum, InterClusterSimilarity.GA);

		initEEnum(sourceTypeEEnum, SourceType.class, "SourceType");
		addEEnumLiteral(sourceTypeEEnum, SourceType.IO_T);
		addEEnumLiteral(sourceTypeEEnum, SourceType.SOCIAL_MEDIA);
		addEEnumLiteral(sourceTypeEEnum, SourceType.WEB);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (pipelineEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueTaskId UniqueRuntimeInfoId UniqueSchemaId NotCopyingPrimaryKeyHaveDistinctNames NotCopyingAttributesHaveDistinctNames"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "constraints", "TasksWithOneAndOnlyOneInputAndInputSchema TasksWithNoInputAndNoInputSchema TasksWithOneOrMoreInputAndInputSchema1 TasksWithOneOrMoreInputAndInputSchema2 TasksWithInputShouldHaveConsistentSchemas TasksWithNoOutputAndNoOutputSchema TasksWithOneOutput DataCollectionMultipleOutput ExportNoOutput TasksWithOutputShouldHaveConsistentOutputSchemas ConsistentInputOutputFormat ConsistentFormatConversion1 StartTimeAfterPreviousTasksEndTime OrderedRuntimeIDsInTaskSequence DataVisualizationOutputMustContainAtLeastOneImage DataVisualizationNotFollowedByExportCannotProduceIMage NotDataVisualizationOrExportShouldNotProcessImages JoinShouldHaveDataWithSameFormatInInput TasksWithSameInputAndOutputSchema TasksWithIDCopyShouldHaveSchemaWithCopiedID TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID"
		   });	
		addAnnotation
		  (dataCollectionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentDataCollectionFormat"
		   });	
		addAnnotation
		  (dataIntegrationEClass, 
		   source, 
		   new String[] {
			 "constraints", "JoinAttributesShouldBeOverAllSchemas AttributeContainedInSchema JoinAttributesSameType JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes JoinEitherOnAttributesOrOnKeys OutputSchemaIfPrimaryKeyJoin OutputSchemaIfAttributeJoin"
		   });	
		addAnnotation
		  (inputSourceDeclarationEClass, 
		   source, 
		   new String[] {
			 "constraints", "InputShouldNotCopy InputSOurceIDMustBeSpecified"
		   });	
		addAnnotation
		  (outputFileEClass, 
		   source, 
		   new String[] {
			 "constraints", "OutputFileNotEmptyName OutputFile_NotEmptyPath NoImageExportIfNotPreviousDV"
		   });	
		addAnnotation
		  (classificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "ClassificationIsForClassLabels ConsistentDataTypesInInputForClassification"
		   });	
		addAnnotation
		  (predictionEClass, 
		   source, 
		   new String[] {
			 "constraints", "PredictionIsForRealResponse ConsistentDataTypesInInputForPrediction"
		   });	
		addAnnotation
		  (clusteringEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentDataTypesInInputForClustering"
		   });	
		addAnnotation
		  (descriptionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentDataTypesForDescription"
		   });	
		addAnnotation
		  (nullValuesRemovalEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentDataTypesInInputForCleaning"
		   });	
		addAnnotation
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueAttributeNameInSameSchema"
		   });	
		addAnnotation
		  (runtimeInfoEClass, 
		   source, 
		   new String[] {
			 "constraints", "StartTimeBeforeEndTime"
		   });	
		addAnnotation
		  (changeDataFormatEClass, 
		   source, 
		   new String[] {
			 "constraints", "NumberOfOutputEqualsNumberOfInput"
		   });	
		addAnnotation
		  (svmEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentSVMCoefficientsAndVectors ConsistentKernelParams ConsistentSupportVectorsDimensionality"
		   });	
		addAnnotation
		  (kMeansEClass, 
		   source, 
		   new String[] {
			 "constraints", "positiveK"
		   });	
		addAnnotation
		  (agglomerativeEClass, 
		   source, 
		   new String[] {
			 "constraints", "CutHeightGe1"
		   });	
		addAnnotation
		  (dbscanEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositiveRadiusAndThreshold"
		   });	
		addAnnotation
		  (linearRegressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentNumberOfEstimatedCoefficients"
		   });	
		addAnnotation
		  (ridgeEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositivePenaltyFactor"
		   });	
		addAnnotation
		  (lassoEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositivePenaltyFactor"
		   });	
		addAnnotation
		  (valueClauseEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistenValueClauseTypes"
		   });	
		addAnnotation
		  (primaryKeyEClass, 
		   source, 
		   new String[] {
			 "constraints", "IfCopiesThenSameTypeAndName"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "IfCopiesThenSameSignature"
		   });	
		addAnnotation
		  (logisticRegressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentNumberOfEstimatedCoefficients"
		   });	
		addAnnotation
		  (scatterPlotEClass, 
		   source, 
		   new String[] {
			 "constraints", "IndependentAndResponseShouldBeInInputSchema IndependentAndResponseShouldBeDifferent"
		   });	
		addAnnotation
		  (labeledScatterPlotEClass, 
		   source, 
		   new String[] {
			 "constraints", "LabelAttributeShouldBeInInputSchema"
		   });	
		addAnnotation
		  (projectOnAttributesEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProjectOnAttributesInInputSchema ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (pipelineEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (pipelineEClass, 
		   source, 
		   new String[] {
			 "UniqueTaskId", "Tuple {\n\tmessage : String = \'Task id should be unique\',\n\tstatus : Boolean = \n\t\tTask.allInstances()->forAll(t1,t2|t1<>t2 implies t1.id <> t2.id)\n}.status",
			 "UniqueRuntimeInfoId", "Tuple {\n\tmessage : String = \'Runtime info id should be unique\',\n\tstatus : Boolean = \n\t\tRuntimeInfo.allInstances()->forAll(r1,r2|r1<>r2 implies r1.executionId <> r2.executionId)\n}.status",
			 "UniqueSchemaId", "Tuple {\n\tmessage : String = \'Schema id should be unique\',\n\tstatus : Boolean = \n\t\tSchema.allInstances()->forAll(s1,s2|s1<>s2 implies s1.id <> s2.id)\n}.status",
			 "NotCopyingPrimaryKeyHaveDistinctNames", "Tuple {\n\tmessage : String = \'If a primaryKey does not copy another one, should have unique name\',\n\tstatus : Boolean = \n\t\t\tPrimaryKey.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(b1,b2|b1<>b2 implies b1.name <>b2.name) \n\t\tand \n\t\t \tPrimaryKey.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(c1| Attribute.allInstances()->select(a2|c1.name=a2.name)->size() = 0)\n}.status",
			 "NotCopyingAttributesHaveDistinctNames", "Tuple {\n\tmessage : String = \'If an attribute does not copy another one, should have unique name\',\n\tstatus : Boolean = \n\t\t\tAttribute.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(b1,b2|b1<>b2 implies b1.name <>b2.name) \n\t\t\tand \n\t\t \tAttribute.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(c1| PrimaryKey.allInstances()->select(a2|c1.name=a2.name)->size() = 0)\n}.status"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "TasksWithOneAndOnlyOneInputAndInputSchema", "Tuple {\n\tmessage : String = \'The task should have one and only one input dataflow and one and only one input schema\',\n\tstatus : Boolean = \n\t\t\t(self.oclIsKindOf(DataAnalysis) or (self.oclIsKindOf(DataCleaning) and not self.oclIsTypeOf(ChangeDataFormat)) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export) or self.oclIsTypeOf(ProjectOnAttributes))\n \t\t\t\timplies (self.input <> null and self.input->size() = 1 and self.inputSchema <> null and self.inputSchema->size() = 1)\n}.status",
			 "TasksWithNoInputAndNoInputSchema", "Tuple {\n\tmessage : String = \'The task should have no input dataflow and no input schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(DataCollection) implies (self.input->size() = 0 and self.inputSchema->size() = 0)\n}.status",
			 "TasksWithOneOrMoreInputAndInputSchema1", "Tuple {\n\tmessage : String = \'The task should have two or more input dataflow and input schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(DataIntegration) implies (self.input->size() > 1 and self.inputSchema->size() > 1)\n}.status",
			 "TasksWithOneOrMoreInputAndInputSchema2", "Tuple {\n\tmessage : String = \'The task should have two or more input dataflow and input schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(ChangeDataFormat) implies (self.input->size() >= 1 and self.inputSchema->size() >= 1)\n}.status",
			 "TasksWithInputShouldHaveConsistentSchemas", "Tuple {\n\tmessage : String = \'The inputSchema should be consistent with the input dataflow schema\',\n\tstatus : Boolean = \n\t\t--self.input <>null and self.input->size() > 0 implied by other rule\n\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export) or self.oclIsTypeOf(DataIntegration))\n\t\t\t implies (self.input.typeOfData->forAll(s| self.inputSchema->includes(s)) and self.input.typeOfData->size() = self.inputSchema->size())\n}.status",
			 "TasksWithNoOutputAndNoOutputSchema", "Tuple {\n\tmessage : String = \'The task should have no output dataflow and no output schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Export) implies (self.output->size() = 0 and self.outputSchema->size() = 0)\n}.status",
			 "TasksWithOneOutput", "Tuple {\n\tmessage : String = \'The task should have output dataflow and output schema\',\n\tstatus : Boolean = \n\t\t\t not (self.oclIsTypeOf(Export) or self.oclIsTypeOf(DataCollection) or self.oclIsTypeOf(ChangeDataFormat)) implies (self.output->size() = 1)\n}.status",
			 "DataCollectionMultipleOutput", "Tuple {\n\tmessage : String = \'DataCollection has one ouput for each source\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(DataCollection) implies (self.output->size() = self.oclAsType(DataCollection).sourceDeclaration->size() and self.output->size() >= 1)\n}.status",
			 "ExportNoOutput", "Tuple {\n\tmessage : String = \'export should have no output dataflow\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Export) implies (self.output->size() = 0)\n}.status",
			 "TasksWithOutputShouldHaveConsistentOutputSchemas", "Tuple {\n\tmessage : String = \'The outputSchema should be consistent with the output dataflow schema\',\n\tstatus : Boolean = \n\t\t\t--self.output <> null and self.output->size() > 0 \n\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsTypeOf(DataCollection) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(DataIntegration))\n\t\t\timplies (self.output.typeOfData->forAll(s| self.outputSchema->includes(s)))\n}.status",
			 "ConsistentInputOutputFormat", "Tuple {\n\tmessage : String = \'The input/output format of dataflows to/from the task should be the same\',\n\tstatus : Boolean = \n\t\t\t(not self.oclIsTypeOf(ChangeDataFormat)) implies \n\t\t\t\t(self.output->forAll(o| self.input->forAll(i| i.format = o.format)))\n}.status",
			 "ConsistentFormatConversion1", "Tuple {\n\tmessage : String = \'The format conversion should make sense (i.e. input != output format )\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(ChangeDataFormat) implies \n\t\t\t\t(self.oclAsType(ChangeDataFormat)).input->exists(is|(self.oclAsType(ChangeDataFormat)).output->exists(os| os.typeOfData= is.typeOfData and os.format <> is.format ))\n}.status",
			 "StartTimeAfterPreviousTasksEndTime", "Tuple {\n\tmessage : String = \'Start time of the task should come after the End time of previous tasks\',\n\tstatus : Boolean = \n\t\t\t self.input.from.runtimeInfo->select(r| self.runtimeInfo.startTime < r.endTime)->size() = 0\n}.status",
			 "OrderedRuntimeIDsInTaskSequence", "Tuple {\n\tmessage : String = \'The IDs of Runtime elements define the execution order of the task in the sequence, hence should be properly ordered\',\n\tstatus : Boolean = \n\t\t\tif self.oclIsKindOf(DataCollection) then\n\t\t\t self.runtimeInfo.executionId = 1  \n\t\t\telse \n\t\t\t\tself.input->size()>0 implies self.input.from.runtimeInfo->forAll(r|self.runtimeInfo.executionId = r.executionId +1)\n\t\t\tendif\n}.status",
			 "DataVisualizationOutputMustContainAtLeastOneImage", "Tuple {\n\tmessage : String = \'Datavisualization tasks should either output a image or copy the input schema\',\n\tstatus : Boolean = \n\t\t \tself.oclIsKindOf(DataVisualization) implies ((self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 1) xor (self.outputSchema->first() = self.inputSchema->first()))\n}.status",
			 "DataVisualizationNotFollowedByExportCannotProduceIMage", "Tuple {\n\tmessage : String = \'DataVisualization tasks should not produce output image if they are not follwed by an export\',\n\tstatus : Boolean = \n\t\t\t(self.oclIsKindOf(DataVisualization) and self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() > 0) implies (self.output->first().to.oclIsKindOf(Export))\n}.status",
			 "NotDataVisualizationOrExportShouldNotProcessImages", "Tuple {\n\tmessage : String = \'Tasks other than data visualization and export are not supposed to process images\',\n\tstatus : Boolean = \n \t\t\tnot (self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export)) implies \n \t\t\t(self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 0) \n \t\t\t\tand (not (self.inputSchema->size() <> 0) implies self.inputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 0)\n}.status",
			 "JoinShouldHaveDataWithSameFormatInInput", "Tuple {\n\tmessage : String = \'DataIntegration tasks should have inputs with same format (use ChangeDataFormat nodes if needed)\',\n\tstatus : Boolean = \n\t\tself.oclIsTypeOf(DataIntegration) implies self.input.format->asSet()->size() = 1\n}.status",
			 "TasksWithSameInputAndOutputSchema", "Tuple {\n\tmessage : String = \'ChangeData/NullValuesRemoval/Descriptions tasks should have same input and output schema\',\n\tstatus : Boolean = \n\t\tself.oclIsTypeOf(ChangeDataFormat) or self.oclIsTypeOf(NullValuesRemoval) or self.oclIsKindOf(Description) implies self.inputSchema->forAll(is| self.outputSchema->includes(is))\n}.status",
			 "TasksWithIDCopyShouldHaveSchemaWithCopiedID", "Tuple {\n\tmessage : String = \'Tasks that can mantain the row identity from input to output should mark the fact that the ID value is copied from the input schema\',\n\tstatus : Boolean = \n\t\tself.oclIsKindOf(DataCleaning) or self.oclIsKindOf(Prediction) or self.oclIsKindOf(Classification) or self.oclIsKindOf(Clustering) implies \n\t\t  ((self.outputSchema->first().idColumn.copies = self.inputSchema->first().idColumn) or (self.outputSchema->first() = self.inputSchema->first()))\n}.status",
			 "TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID", "Tuple {\n\tmessage : String = \'Tasks that can not mantain the row identity from input to output shouldn\\\'t mark the fact that the ID value is copied from the input schema\',\n\tstatus : Boolean = \n\t\tnot(self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(Prediction) or self.oclIsKindOf(Classification) or self.oclIsKindOf(Clustering) or self.oclIsKindOf(Export)) implies\n\t\t(self.outputSchema->forAll(s|s.idColumn.copies = null) or (self.outputSchema->first() = self.inputSchema->first()))\n}.status"
		   });	
		addAnnotation
		  (dataCollectionEClass, 
		   source, 
		   new String[] {
			 "ConsistentDataCollectionFormat", "Tuple {\n\tmessage : String = \'output of dataCollection should have consistent format with inputDataSource\',\n\tstatus : Boolean = \n\t\tself.sourceDeclaration->forAll(is|self.output->exists(o|o.format = is.exchangeFormat and o.typeOfData = is.sourceSchema))\n}.status"
		   });	
		addAnnotation
		  (dataIntegrationEClass, 
		   source, 
		   new String[] {
			 "JoinAttributesShouldBeOverAllSchemas", "Tuple {\n\tmessage : String = \'Join attribute lists should be over all the input tables\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes->size() = self.inputSchema->size()\n}.status",
			 "AttributeContainedInSchema", "Tuple {\n\tmessage : String = \'Each attribute in a list should be contained once and only once in an input schema\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes->forAll(j| self.inputSchema->select(s|s.attributes->includes(j) or s.idColumn = j)->size() = 1)\n}.status",
			 "JoinAttributesSameType", "Tuple {\n\tmessage : String = \'Join attributes should have same type\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes.type->asSet()->size() = 1\n}.status",
			 "JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes", "Tuple {\n\tmessage : String = \'Output schema of join should contain at most one attribute identical to the first attribute in the joinAttributesList (0 if it is a generatedID join), and all the attributes in the input tables\',\n\tstatus : Boolean = \n\t\t\tself.outputSchema.attributes->select(a| self.joinAttributesList.joinAttributes->first().name = a.name and a.type = self.joinAttributesList.joinAttributes->first().type)->size() <= 1 and\n\t\t\tself.outputSchema.attributes->forAll(a| self.inputSchema.attributes->select(a1|a1.name = a.name and a1.type = a.type)->size() >= 1 or (self.joinAttributesList.joinAttributes->first().name = a.name and a.type = self.joinAttributesList.joinAttributes->first().type))\n}.status",
			 "JoinEitherOnAttributesOrOnKeys", "Tuple {\n\tmessage : String = \'Joins on keys should be only among keys (automatically generated indices), and joins on attributes should only be among attributes\',\n\tstatus : Boolean = \n\t\t\t(self.joinAttributesList.joinAttributes->forAll(a|a.oclIsTypeOf(PrimaryKey)) or self.joinAttributesList.joinAttributes->forAll(a|a.oclIsTypeOf(Attribute)))\n}.status",
			 "OutputSchemaIfPrimaryKeyJoin", "Tuple {\n\tmessage : String = \'Output schema should contain all input attributes, since join is on primary keys\',\n\tstatus : Boolean = \n\t\tself.joinAttributesList.joinAttributes->forAll(a|a.oclIsTypeOf(PrimaryKey)) implies self.inputSchema.attributes->forAll(a|self.outputSchema.attributes.copies->exists(a1|a1.name = a.name and a1.type = a.type))\n}.status",
			 "OutputSchemaIfAttributeJoin", "Tuple {\n\tmessage : String = \'Output schema should drop attributes in join attribute list\',\n\tstatus : Boolean = \n\t\tself.joinAttributesList.joinAttributes->forAll(a|a.oclIsTypeOf(Attribute)) implies self.inputSchema.attributes->reject(a|self.joinAttributesList.joinAttributes->exists(a1|a1.name = a.name and a1.type = a.type))->forAll(a|self.outputSchema.attributes.copies->exists(a1|a1.name = a.name and a1.type = a.type))\n\t\tand self.outputSchema.attributes->forAll(a| a.name <> self.joinAttributesList.joinAttributes->first().name implies self.joinAttributesList.joinAttributes->select(a2|a2.name = a.name)->size() = 0)\n}.status"
		   });	
		addAnnotation
		  (inputSourceDeclarationEClass, 
		   source, 
		   new String[] {
			 "InputShouldNotCopy", "Tuple {\n\tmessage : String = \'input source schema should not be copying\',\n\tstatus : Boolean = \n\t\tself.sourceSchema.idColumn.copies.oclIsUndefined() and self.sourceSchema.attributes.copies->forAll(a|a.oclIsUndefined())\n}.status",
			 "InputSOurceIDMustBeSpecified", "Tuple {\n\tmessage : String = \'input source id should be specified\',\n\tstatus : Boolean = \n\t\tself.id <> \'\' or self.id.size() > 0\n}.status"
		   });	
		addAnnotation
		  (outputFileEClass, 
		   source, 
		   new String[] {
			 "OutputFileNotEmptyName", "Tuple {\n\tmessage : String = \'File Name should not be empty\',\n\tstatus : Boolean = self.name.size()> 0 or self.name <> null\n}.status",
			 "OutputFile_NotEmptyPath", "Tuple {\n\tmessage : String = \'File Path should not be empty\',\n\tstatus : Boolean = self.storagePath.size()>= 0 or self.storagePath <> null\n}.status",
			 "NoImageExportIfNotPreviousDV", "Tuple {\n\tmessage : String = \'Image export is only for data visualization tasks\',\n\tstatus : Boolean = self.fileFormat = Format::image implies self.export.input->first().from.oclIsKindOf(DataVisualization)\n}.status"
		   });	
		addAnnotation
		  (classificationEClass, 
		   source, 
		   new String[] {
			 "ClassificationIsForClassLabels", "Tuple {\n\tmessage : String = \'Classification output should be only for class labels!\',\n\tstatus : Boolean = \n\t\tself.outputSchema.attributes->includes(self.classifies) and self.classifies.type = Type::Float\n}.status",
			 "ConsistentDataTypesInInputForClassification", "Tuple {\n\tmessage : String = \'Classification here only works on int/float data\',\n\tstatus : Boolean = \n\t\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n}.status"
		   });	
		addAnnotation
		  (predictionEClass, 
		   source, 
		   new String[] {
			 "PredictionIsForRealResponse", "Tuple {\n\tmessage : String = \'Prediction output should be in output schema and should be real\',\n\tstatus : Boolean = \n\t\t\tself.outputSchema.attributes->includes(self.predicts) and self.predicts.type = Type::Float\n}.status",
			 "ConsistentDataTypesInInputForPrediction", "Tuple {\n\tmessage : String = \'Prediction here only works on int/float data\',\n\tstatus : Boolean = \n\t\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n}.status"
		   });	
		addAnnotation
		  (clusteringEClass, 
		   source, 
		   new String[] {
			 "ConsistentDataTypesInInputForClustering", "Tuple {\n\tmessage : String = \'clustering here only works on int/float data\',\n\tstatus : Boolean = \n\t\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n}.status"
		   });	
		addAnnotation
		  (descriptionEClass, 
		   source, 
		   new String[] {
			 "ConsistentDataTypesForDescription", "Tuple {\n\tmessage : String = \'Mean/median/variance/skeweness compute mean/median/variance/skeweness by column, inputSchema and outputSchema should have only float attributes\',\n\tstatus : Boolean = \n\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n\t\t\tand\n\t\tself.outputSchema.attributes->forAll(a|a.type = Type::Int or a.type = Type::Float)\n}.status"
		   });	
		addAnnotation
		  (nullValuesRemovalEClass, 
		   source, 
		   new String[] {
			 "ConsistentDataTypesInInputForCleaning", "Tuple {\n\tmessage : String = \'some forms of cleaning work only for numeric values\',\n\tstatus : Boolean = \n\t\tself.policy <> NulValuesPolicy::dropRecord implies (self.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float))\n}.status"
		   });	
		addAnnotation
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "UniqueAttributeNameInSameSchema", "Tuple {\n\tmessage : String = \'Attribute name in same schema should be unique\',\n\tstatus : Boolean = \n\t\tself.attributes->forAll(a1,a2| a1 <> a2 implies a1.name <> a2.name)\n}.status"
		   });	
		addAnnotation
		  (runtimeInfoEClass, 
		   source, 
		   new String[] {
			 "StartTimeBeforeEndTime", "Tuple {\n\tmessage : String = \'Start time must come before End time in a same task\',\n\tstatus : Boolean = \n\t\t\tself.startTime < self.endTime\n}.status"
		   });	
		addAnnotation
		  (changeDataFormatEClass, 
		   source, 
		   new String[] {
			 "NumberOfOutputEqualsNumberOfInput", "Tuple {\n\tmessage : String = \'ChangeDataFormat should produce one output for each input\',\n\tstatus : Boolean = \n\t\t\tself.output->size() = self.input->size() and self.inputSchema->forAll(s|self.outputSchema->includes(s))\n}.status"
		   });	
		addAnnotation
		  (svmEClass, 
		   source, 
		   new String[] {
			 "ConsistentSVMCoefficientsAndVectors", "Tuple {\n\tmessage : String = \'Wrong number of coefficients (should be 1 + number of support vectors)\',\n\tstatus : Boolean = \n\t\tself.estimatedCoefficients->size() = self.supportVectors->size()+1\n}.status",
			 "ConsistentKernelParams", "Tuple {\n\tmessage : String = \'Wrong number of kernel params\',\n\tstatus : Boolean = \n\t\tif self.kernelFunction = KernelFunction::Polynomial then\n\t\t   self.kernelParams->size() = 1\n\t\telse \n\t\t\tself.kernelParams->size() = 0\n\t\tendif\n}.status",
			 "ConsistentSupportVectorsDimensionality", "Tuple {\n\tmessage : String = \'Support vector is of the wrong dimensionality with respect to input schema\',\n\tstatus : Boolean = \n\t\tself.supportVectors->forAll(v|v.vector->size() = self.inputSchema->first().attributes->size())\n}.status"
		   });	
		addAnnotation
		  (kMeansEClass, 
		   source, 
		   new String[] {
			 "positiveK", "Tuple {\n\tmessage : String = \'K should be positive\',\n\tstatus : Boolean = self.K > 0\n}.status"
		   });	
		addAnnotation
		  (agglomerativeEClass, 
		   source, 
		   new String[] {
			 "CutHeightGe1", "Tuple {\n\tmessage : String = \'Cut Height >= 1\',\n\tstatus : Boolean = self.CutHeight >= 1\n}.status"
		   });	
		addAnnotation
		  (dbscanEClass, 
		   source, 
		   new String[] {
			 "PositiveRadiusAndThreshold", "Tuple {\n\tmessage : String = \'The radius and the threshold should be positive\',\n\tstatus : Boolean = self.radius > 0 and self.threshold > 0\n}.status"
		   });	
		addAnnotation
		  (linearRegressionEClass, 
		   source, 
		   new String[] {
			 "ConsistentNumberOfEstimatedCoefficients", "Tuple {\n\tmessage : String = \'The number of estimated coefficients should correspond to the number of input predictors, i.e. columns of inputSchema\',\n\tstatus : Boolean = \n\t\t\tself.estimatedCoefficients->size() = self.inputSchema->first().attributes->size()+1\n}.status"
		   });	
		addAnnotation
		  (ridgeEClass, 
		   source, 
		   new String[] {
			 "PositivePenaltyFactor", "Tuple {\n\tmessage : String = \'Penalty factor should be positive, otherwise, if it is zero, use plain linear regression\',\n\tstatus : Boolean = \n\t\t\tself.penaltyFactor > 0\n}.status"
		   });	
		addAnnotation
		  (lassoEClass, 
		   source, 
		   new String[] {
			 "PositivePenaltyFactor", "Tuple {\n\tmessage : String = \'Penalty factor should be positive, otherwise, if it is zero, use plain linear regression\',\n\tstatus : Boolean = \n\t\t\tself.penaltyFactor > 0\n}.status"
		   });	
		addAnnotation
		  (valueClauseEClass, 
		   source, 
		   new String[] {
			 "ConsistenValueClauseTypes", "Tuple {\n\tmessage : String = \'ComparisonValue and QueryParam should have same type\',\n\tstatus : Boolean = \n\t\tself.type = self.conditionField.type\n}.status"
		   });	
		addAnnotation
		  (primaryKeyEClass, 
		   source, 
		   new String[] {
			 "IfCopiesThenSameTypeAndName", "Tuple {\n\tmessage : String = \'A primarykey can\\\'t copy primarykeys with different type or name\',\n\tstatus : Boolean = \n\t\tself.copies <> null implies (self.type = self.copies.type and self.name = self.copies.name)\n}.status"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "IfCopiesThenSameSignature", "Tuple {\n\tmessage : String = \'An attribute must be completely copied (in type and name)!\',\n\tstatus : Boolean = \n\t\tself.copies <> null implies self.type = self.copies.type and self.name = self.copies.name\n}.status"
		   });	
		addAnnotation
		  (logisticRegressionEClass, 
		   source, 
		   new String[] {
			 "ConsistentNumberOfEstimatedCoefficients", "Tuple {\n\tmessage : String = \'The number of estimated coefficients should correspond to the number of input predictors, i.e. columns of inputSchema\',\n\tstatus : Boolean = \n\t\t\tself.estimatedCoefficients->size() = self.inputSchema->first().attributes->size()+1\n}.status"
		   });	
		addAnnotation
		  (scatterPlotEClass, 
		   source, 
		   new String[] {
			 "IndependentAndResponseShouldBeInInputSchema", "Tuple {\n\tmessage : String = \'Independent variables and response variables should be specified within the attributes of the input schema\',\n\tstatus : Boolean = \n\t\tself.independentVariables->forAll(v|self.inputSchema->first().attributes->includes(v) or self.inputSchema.idColumn = v) and (self.inputSchema->first().attributes->includes(responseVariable) or self.inputSchema.idColumn = responseVariable)\n}.status",
			 "IndependentAndResponseShouldBeDifferent", "Tuple {\n\tmessage : String = \'Independent variables and response variables should not be the same variables\',\n\tstatus : Boolean = \n\t\tself.independentVariables->intersection(Set{self.responseVariable})->size() = 0\n}.status"
		   });	
		addAnnotation
		  (labeledScatterPlotEClass, 
		   source, 
		   new String[] {
			 "LabelAttributeShouldBeInInputSchema", "Tuple {\n\tmessage : String = \'Label variables should be specified within the attributes of the input schema\',\n\tstatus : Boolean = \n\t\tself.inputSchema.attributes->includes(self.labelAttribute) or self.inputSchema.idColumn = self.labelAttribute\n}.status"
		   });	
		addAnnotation
		  (projectOnAttributesEClass, 
		   source, 
		   new String[] {
			 "ProjectOnAttributesInInputSchema", "Tuple {\n\tmessage : String = \'Projection should occur on attributes of input schema\',\n\tstatus : Boolean = \n\t\tself.projectionAttributes->forAll(a|self.inputSchema->first().attributes->includes(a))\n}.status",
			 "ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema", "Tuple {\n\tmessage : String = \'Projection attributes should be the one and only one in output schema\',\n\tstatus : Boolean = \n\t\tself.projectionAttributes->forAll(a|self.outputSchema.attributes->exists(a1|a.name=a1.name and a.type = a1.type)) and self.outputSchema.attributes->forAll(a|self.projectionAttributes->exists(a1|a.name=a1.name and a.type = a1.type))\n}.status"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "label", "id"
		   });	
		addAnnotation
		  (inputSourceDeclarationEClass, 
		   source, 
		   new String[] {
			 "label", "sourceURI",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (outputFileEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "border.style", "dash",
			 "border.color", "150,150,255"
		   });	
		addAnnotation
		  (joinAttributesListEClass, 
		   source, 
		   new String[] {
			 "label", "id"
		   });	
		addAnnotation
		  (runtimeInfoEClass, 
		   source, 
		   new String[] {
			 "label", "executionId"
		   });	
		addAnnotation
		  (logicPropositionEClass, 
		   source, 
		   new String[] {
			 "label", "id"
		   });	
		addAnnotation
		  (queryParamEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (customParamEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (supportVectorEClass, 
		   source, 
		   new String[] {
			 "label", "index"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getTask_RuntimeInfo(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataCollection_SourceDeclaration(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataIntegration_JoinAttributesList(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInputSourceDeclaration_QueryConditions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCustomCleaning_CustomParams(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSchema_Attributes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSchema_IdColumn(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSVM_SupportVectors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNotClause_SubClause(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiOperandClause_Operands(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getValueClause_ConditionField(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getTask_InputSchema(), 
		   source, 
		   new String[] {
			 "target", "inputSchema",
			 "style", "dash",
			 "color", "0,255,0"
		   });	
		addAnnotation
		  (getTask_OutputSchema(), 
		   source, 
		   new String[] {
			 "target", "outputSchema",
			 "style", "dash",
			 "color", "255,0,0"
		   });	
		addAnnotation
		  (dataFlowEClass, 
		   source, 
		   new String[] {
			 "source", "from",
			 "target", "to",
			 "target.decoration", "filledclosedarrow",
			 "style", "solid",
			 "label", "format",
			 "width", "4"
		   });	
		addAnnotation
		  (getExport_Writes(), 
		   source, 
		   new String[] {
			 "label", "writes",
			 "target", "writes",
			 "style", "dot"
		   });	
		addAnnotation
		  (getInputSourceDeclaration_SourceSchema(), 
		   source, 
		   new String[] {
			 "target", "sourceSchema",
			 "style", "dot"
		   });	
		addAnnotation
		  (getPrimaryKey_Copies(), 
		   source, 
		   new String[] {
			 "target", "copies",
			 "target.decoration", "arrow",
			 "style", "dot",
			 "color", "0,0,255"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getSVM_EstimatedCoefficients(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLinearRegression_EstimatedCoefficients(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

} //PythonpipelinePackageImpl
