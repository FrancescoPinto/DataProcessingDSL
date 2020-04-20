/**
 */
package pythonpipeline.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pythonpipeline.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pythonpipeline.PythonpipelinePackage
 * @generated
 */
public class PythonpipelineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PythonpipelinePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonpipelineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PythonpipelinePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PythonpipelineSwitch<Adapter> modelSwitch =
		new PythonpipelineSwitch<Adapter>() {
			@Override
			public Adapter casePipeline(Pipeline object) {
				return createPipelineAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseDataCollection(DataCollection object) {
				return createDataCollectionAdapter();
			}
			@Override
			public Adapter caseDataIntegration(DataIntegration object) {
				return createDataIntegrationAdapter();
			}
			@Override
			public Adapter caseDataAnalysis(DataAnalysis object) {
				return createDataAnalysisAdapter();
			}
			@Override
			public Adapter caseDataCleaning(DataCleaning object) {
				return createDataCleaningAdapter();
			}
			@Override
			public Adapter caseDataVisualization(DataVisualization object) {
				return createDataVisualizationAdapter();
			}
			@Override
			public Adapter caseExport(Export object) {
				return createExportAdapter();
			}
			@Override
			public Adapter caseInputSourceDeclaration(InputSourceDeclaration object) {
				return createInputSourceDeclarationAdapter();
			}
			@Override
			public Adapter caseOutputFile(OutputFile object) {
				return createOutputFileAdapter();
			}
			@Override
			public Adapter caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			@Override
			public Adapter casePrediction(Prediction object) {
				return createPredictionAdapter();
			}
			@Override
			public Adapter caseClustering(Clustering object) {
				return createClusteringAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseNullValuesRemoval(NullValuesRemoval object) {
				return createNullValuesRemovalAdapter();
			}
			@Override
			public Adapter caseCustomCleaning(CustomCleaning object) {
				return createCustomCleaningAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseJoinAttributesList(JoinAttributesList object) {
				return createJoinAttributesListAdapter();
			}
			@Override
			public Adapter caseRuntimeInfo(RuntimeInfo object) {
				return createRuntimeInfoAdapter();
			}
			@Override
			public Adapter caseChangeDataFormat(ChangeDataFormat object) {
				return createChangeDataFormatAdapter();
			}
			@Override
			public Adapter caseSVM(SVM object) {
				return createSVMAdapter();
			}
			@Override
			public Adapter caseKMeans(KMeans object) {
				return createKMeansAdapter();
			}
			@Override
			public Adapter caseHierarchical(Hierarchical object) {
				return createHierarchicalAdapter();
			}
			@Override
			public Adapter caseAgglomerative(Agglomerative object) {
				return createAgglomerativeAdapter();
			}
			@Override
			public Adapter caseDBSCAN(DBSCAN object) {
				return createDBSCANAdapter();
			}
			@Override
			public Adapter caseLinearRegression(LinearRegression object) {
				return createLinearRegressionAdapter();
			}
			@Override
			public Adapter caseRidge(Ridge object) {
				return createRidgeAdapter();
			}
			@Override
			public Adapter caseLasso(Lasso object) {
				return createLassoAdapter();
			}
			@Override
			public Adapter caseMean(Mean object) {
				return createMeanAdapter();
			}
			@Override
			public Adapter caseMedian(Median object) {
				return createMedianAdapter();
			}
			@Override
			public Adapter caseStandardDeviation(StandardDeviation object) {
				return createStandardDeviationAdapter();
			}
			@Override
			public Adapter caseLogicProposition(LogicProposition object) {
				return createLogicPropositionAdapter();
			}
			@Override
			public Adapter caseNotClause(NotClause object) {
				return createNotClauseAdapter();
			}
			@Override
			public Adapter caseMultiOperandClause(MultiOperandClause object) {
				return createMultiOperandClauseAdapter();
			}
			@Override
			public Adapter caseAndClause(AndClause object) {
				return createAndClauseAdapter();
			}
			@Override
			public Adapter caseOrClause(OrClause object) {
				return createOrClauseAdapter();
			}
			@Override
			public Adapter caseValueClause(ValueClause object) {
				return createValueClauseAdapter();
			}
			@Override
			public Adapter caseLtClause(LtClause object) {
				return createLtClauseAdapter();
			}
			@Override
			public Adapter caseGtClause(GtClause object) {
				return createGtClauseAdapter();
			}
			@Override
			public Adapter caseEqClause(EqClause object) {
				return createEqClauseAdapter();
			}
			@Override
			public Adapter caseLeClause(LeClause object) {
				return createLeClauseAdapter();
			}
			@Override
			public Adapter caseGeClause(GeClause object) {
				return createGeClauseAdapter();
			}
			@Override
			public Adapter caseContainsClause(ContainsClause object) {
				return createContainsClauseAdapter();
			}
			@Override
			public Adapter caseQueryParam(QueryParam object) {
				return createQueryParamAdapter();
			}
			@Override
			public Adapter caseCustomParam(CustomParam object) {
				return createCustomParamAdapter();
			}
			@Override
			public Adapter casePrimaryKey(PrimaryKey object) {
				return createPrimaryKeyAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseLogisticRegression(LogisticRegression object) {
				return createLogisticRegressionAdapter();
			}
			@Override
			public Adapter caseSkewness(Skewness object) {
				return createSkewnessAdapter();
			}
			@Override
			public Adapter caseScatterPlot(ScatterPlot object) {
				return createScatterPlotAdapter();
			}
			@Override
			public Adapter caseLabeledScatterPlot(LabeledScatterPlot object) {
				return createLabeledScatterPlotAdapter();
			}
			@Override
			public Adapter caseHistogram(Histogram object) {
				return createHistogramAdapter();
			}
			@Override
			public Adapter casePiePlot(PiePlot object) {
				return createPiePlotAdapter();
			}
			@Override
			public Adapter caseProjectOnAttributes(ProjectOnAttributes object) {
				return createProjectOnAttributesAdapter();
			}
			@Override
			public Adapter caseSupportVector(SupportVector object) {
				return createSupportVectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DataCollection <em>Data Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DataCollection
	 * @generated
	 */
	public Adapter createDataCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DataIntegration <em>Data Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DataIntegration
	 * @generated
	 */
	public Adapter createDataIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DataAnalysis <em>Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DataAnalysis
	 * @generated
	 */
	public Adapter createDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DataCleaning
	 * @generated
	 */
	public Adapter createDataCleaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DataVisualization <em>Data Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DataVisualization
	 * @generated
	 */
	public Adapter createDataVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.InputSourceDeclaration <em>Input Source Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.InputSourceDeclaration
	 * @generated
	 */
	public Adapter createInputSourceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.OutputFile
	 * @generated
	 */
	public Adapter createOutputFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Prediction <em>Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Prediction
	 * @generated
	 */
	public Adapter createPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Clustering
	 * @generated
	 */
	public Adapter createClusteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.NullValuesRemoval <em>Null Values Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.NullValuesRemoval
	 * @generated
	 */
	public Adapter createNullValuesRemovalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.CustomCleaning <em>Custom Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.CustomCleaning
	 * @generated
	 */
	public Adapter createCustomCleaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.JoinAttributesList <em>Join Attributes List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.JoinAttributesList
	 * @generated
	 */
	public Adapter createJoinAttributesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.RuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.RuntimeInfo
	 * @generated
	 */
	public Adapter createRuntimeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.ChangeDataFormat <em>Change Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.ChangeDataFormat
	 * @generated
	 */
	public Adapter createChangeDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.SVM
	 * @generated
	 */
	public Adapter createSVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.KMeans <em>KMeans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.KMeans
	 * @generated
	 */
	public Adapter createKMeansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Hierarchical <em>Hierarchical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Hierarchical
	 * @generated
	 */
	public Adapter createHierarchicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Agglomerative <em>Agglomerative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Agglomerative
	 * @generated
	 */
	public Adapter createAgglomerativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.DBSCAN <em>DBSCAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.DBSCAN
	 * @generated
	 */
	public Adapter createDBSCANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.LinearRegression <em>Linear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.LinearRegression
	 * @generated
	 */
	public Adapter createLinearRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Ridge <em>Ridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Ridge
	 * @generated
	 */
	public Adapter createRidgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Lasso <em>Lasso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Lasso
	 * @generated
	 */
	public Adapter createLassoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Mean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Mean
	 * @generated
	 */
	public Adapter createMeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Median
	 * @generated
	 */
	public Adapter createMedianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.StandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.StandardDeviation
	 * @generated
	 */
	public Adapter createStandardDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.LogicProposition <em>Logic Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.LogicProposition
	 * @generated
	 */
	public Adapter createLogicPropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.NotClause <em>Not Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.NotClause
	 * @generated
	 */
	public Adapter createNotClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.MultiOperandClause <em>Multi Operand Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.MultiOperandClause
	 * @generated
	 */
	public Adapter createMultiOperandClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.AndClause <em>And Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.AndClause
	 * @generated
	 */
	public Adapter createAndClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.OrClause <em>Or Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.OrClause
	 * @generated
	 */
	public Adapter createOrClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.ValueClause <em>Value Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.ValueClause
	 * @generated
	 */
	public Adapter createValueClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.LtClause <em>Lt Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.LtClause
	 * @generated
	 */
	public Adapter createLtClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.GtClause <em>Gt Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.GtClause
	 * @generated
	 */
	public Adapter createGtClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.EqClause <em>Eq Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.EqClause
	 * @generated
	 */
	public Adapter createEqClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.LeClause <em>Le Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.LeClause
	 * @generated
	 */
	public Adapter createLeClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.GeClause <em>Ge Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.GeClause
	 * @generated
	 */
	public Adapter createGeClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.ContainsClause <em>Contains Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.ContainsClause
	 * @generated
	 */
	public Adapter createContainsClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.QueryParam
	 * @generated
	 */
	public Adapter createQueryParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.CustomParam <em>Custom Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.CustomParam
	 * @generated
	 */
	public Adapter createCustomParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.PrimaryKey
	 * @generated
	 */
	public Adapter createPrimaryKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.LogisticRegression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.LogisticRegression
	 * @generated
	 */
	public Adapter createLogisticRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Skewness <em>Skewness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Skewness
	 * @generated
	 */
	public Adapter createSkewnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.ScatterPlot
	 * @generated
	 */
	public Adapter createScatterPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.LabeledScatterPlot <em>Labeled Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.LabeledScatterPlot
	 * @generated
	 */
	public Adapter createLabeledScatterPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.Histogram
	 * @generated
	 */
	public Adapter createHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.PiePlot <em>Pie Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.PiePlot
	 * @generated
	 */
	public Adapter createPiePlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.ProjectOnAttributes <em>Project On Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.ProjectOnAttributes
	 * @generated
	 */
	public Adapter createProjectOnAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pythonpipeline.SupportVector <em>Support Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pythonpipeline.SupportVector
	 * @generated
	 */
	public Adapter createSupportVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PythonpipelineAdapterFactory
