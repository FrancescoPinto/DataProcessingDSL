/**
 */
package pipelineproject.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pipelineproject.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pipelineproject.PipelineprojectPackage
 * @generated
 */
public class PipelineprojectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PipelineprojectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineprojectSwitch() {
		if (modelPackage == null) {
			modelPackage = PipelineprojectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PipelineprojectPackage.PIPELINE: {
				Pipeline pipeline = (Pipeline)theEObject;
				T result = casePipeline(pipeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DATA_COLLECTION: {
				DataCollection dataCollection = (DataCollection)theEObject;
				T result = caseDataCollection(dataCollection);
				if (result == null) result = caseTask(dataCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DATA_INTEGRATION: {
				DataIntegration dataIntegration = (DataIntegration)theEObject;
				T result = caseDataIntegration(dataIntegration);
				if (result == null) result = caseTask(dataIntegration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DATA_ANALYSIS: {
				DataAnalysis dataAnalysis = (DataAnalysis)theEObject;
				T result = caseDataAnalysis(dataAnalysis);
				if (result == null) result = caseTask(dataAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DATA_CLEANING: {
				DataCleaning dataCleaning = (DataCleaning)theEObject;
				T result = caseDataCleaning(dataCleaning);
				if (result == null) result = caseTask(dataCleaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DATA_VISUALIZATION: {
				DataVisualization dataVisualization = (DataVisualization)theEObject;
				T result = caseDataVisualization(dataVisualization);
				if (result == null) result = caseTask(dataVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.EXPORT: {
				Export export = (Export)theEObject;
				T result = caseExport(export);
				if (result == null) result = caseTask(export);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION: {
				InputSourceDeclaration inputSourceDeclaration = (InputSourceDeclaration)theEObject;
				T result = caseInputSourceDeclaration(inputSourceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.OUTPUT_FILE: {
				OutputFile outputFile = (OutputFile)theEObject;
				T result = caseOutputFile(outputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.CLASSIFICATION: {
				Classification classification = (Classification)theEObject;
				T result = caseClassification(classification);
				if (result == null) result = caseDataAnalysis(classification);
				if (result == null) result = caseTask(classification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.PREDICTION: {
				Prediction prediction = (Prediction)theEObject;
				T result = casePrediction(prediction);
				if (result == null) result = caseDataAnalysis(prediction);
				if (result == null) result = caseTask(prediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.CLUSTERING: {
				Clustering clustering = (Clustering)theEObject;
				T result = caseClustering(clustering);
				if (result == null) result = caseDataAnalysis(clustering);
				if (result == null) result = caseTask(clustering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseDataAnalysis(description);
				if (result == null) result = caseTask(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.NULL_VALUES_REMOVAL: {
				NullValuesRemoval nullValuesRemoval = (NullValuesRemoval)theEObject;
				T result = caseNullValuesRemoval(nullValuesRemoval);
				if (result == null) result = caseDataCleaning(nullValuesRemoval);
				if (result == null) result = caseTask(nullValuesRemoval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.CUSTOM_CLEANING: {
				CustomCleaning customCleaning = (CustomCleaning)theEObject;
				T result = caseCustomCleaning(customCleaning);
				if (result == null) result = caseDataCleaning(customCleaning);
				if (result == null) result = caseTask(customCleaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.JOIN_ATTRIBUTES_LIST: {
				JoinAttributesList joinAttributesList = (JoinAttributesList)theEObject;
				T result = caseJoinAttributesList(joinAttributesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.RUNTIME_INFO: {
				RuntimeInfo runtimeInfo = (RuntimeInfo)theEObject;
				T result = caseRuntimeInfo(runtimeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.CHANGE_DATA_FORMAT: {
				ChangeDataFormat changeDataFormat = (ChangeDataFormat)theEObject;
				T result = caseChangeDataFormat(changeDataFormat);
				if (result == null) result = caseDataCleaning(changeDataFormat);
				if (result == null) result = caseTask(changeDataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.KNN: {
				KNN knn = (KNN)theEObject;
				T result = caseKNN(knn);
				if (result == null) result = caseClassification(knn);
				if (result == null) result = caseDataAnalysis(knn);
				if (result == null) result = caseTask(knn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.SVM: {
				SVM svm = (SVM)theEObject;
				T result = caseSVM(svm);
				if (result == null) result = caseClassification(svm);
				if (result == null) result = caseDataAnalysis(svm);
				if (result == null) result = caseTask(svm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.KMEANS: {
				KMeans kMeans = (KMeans)theEObject;
				T result = caseKMeans(kMeans);
				if (result == null) result = caseClustering(kMeans);
				if (result == null) result = caseDataAnalysis(kMeans);
				if (result == null) result = caseTask(kMeans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.HIERARCHICAL: {
				Hierarchical hierarchical = (Hierarchical)theEObject;
				T result = caseHierarchical(hierarchical);
				if (result == null) result = caseClustering(hierarchical);
				if (result == null) result = caseDataAnalysis(hierarchical);
				if (result == null) result = caseTask(hierarchical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.AGGLOMERATIVE: {
				Agglomerative agglomerative = (Agglomerative)theEObject;
				T result = caseAgglomerative(agglomerative);
				if (result == null) result = caseHierarchical(agglomerative);
				if (result == null) result = caseClustering(agglomerative);
				if (result == null) result = caseDataAnalysis(agglomerative);
				if (result == null) result = caseTask(agglomerative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.DBSCAN: {
				DBSCAN dbscan = (DBSCAN)theEObject;
				T result = caseDBSCAN(dbscan);
				if (result == null) result = caseClustering(dbscan);
				if (result == null) result = caseDataAnalysis(dbscan);
				if (result == null) result = caseTask(dbscan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.JARVIS_PATRICK: {
				JarvisPatrick jarvisPatrick = (JarvisPatrick)theEObject;
				T result = caseJarvisPatrick(jarvisPatrick);
				if (result == null) result = caseClustering(jarvisPatrick);
				if (result == null) result = caseDataAnalysis(jarvisPatrick);
				if (result == null) result = caseTask(jarvisPatrick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LINEAR_REGRESSION: {
				LinearRegression linearRegression = (LinearRegression)theEObject;
				T result = caseLinearRegression(linearRegression);
				if (result == null) result = casePrediction(linearRegression);
				if (result == null) result = caseDataAnalysis(linearRegression);
				if (result == null) result = caseTask(linearRegression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.RIDGE: {
				Ridge ridge = (Ridge)theEObject;
				T result = caseRidge(ridge);
				if (result == null) result = caseLinearRegression(ridge);
				if (result == null) result = casePrediction(ridge);
				if (result == null) result = caseDataAnalysis(ridge);
				if (result == null) result = caseTask(ridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LASSO: {
				Lasso lasso = (Lasso)theEObject;
				T result = caseLasso(lasso);
				if (result == null) result = caseLinearRegression(lasso);
				if (result == null) result = casePrediction(lasso);
				if (result == null) result = caseDataAnalysis(lasso);
				if (result == null) result = caseTask(lasso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.MEAN: {
				Mean mean = (Mean)theEObject;
				T result = caseMean(mean);
				if (result == null) result = caseDescription(mean);
				if (result == null) result = caseDataAnalysis(mean);
				if (result == null) result = caseTask(mean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.MEDIAN: {
				Median median = (Median)theEObject;
				T result = caseMedian(median);
				if (result == null) result = caseDescription(median);
				if (result == null) result = caseDataAnalysis(median);
				if (result == null) result = caseTask(median);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.VARIANCE: {
				Variance variance = (Variance)theEObject;
				T result = caseVariance(variance);
				if (result == null) result = caseDescription(variance);
				if (result == null) result = caseDataAnalysis(variance);
				if (result == null) result = caseTask(variance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LOGIC_PROPOSITION: {
				LogicProposition logicProposition = (LogicProposition)theEObject;
				T result = caseLogicProposition(logicProposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.NOT_CLAUSE: {
				NotClause notClause = (NotClause)theEObject;
				T result = caseNotClause(notClause);
				if (result == null) result = caseLogicProposition(notClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.MULTI_OPERAND_CLAUSE: {
				MultiOperandClause multiOperandClause = (MultiOperandClause)theEObject;
				T result = caseMultiOperandClause(multiOperandClause);
				if (result == null) result = caseLogicProposition(multiOperandClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.AND_CLAUSE: {
				AndClause andClause = (AndClause)theEObject;
				T result = caseAndClause(andClause);
				if (result == null) result = caseMultiOperandClause(andClause);
				if (result == null) result = caseLogicProposition(andClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.OR_CLAUSE: {
				OrClause orClause = (OrClause)theEObject;
				T result = caseOrClause(orClause);
				if (result == null) result = caseMultiOperandClause(orClause);
				if (result == null) result = caseLogicProposition(orClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.VALUE_CLAUSE: {
				ValueClause valueClause = (ValueClause)theEObject;
				T result = caseValueClause(valueClause);
				if (result == null) result = caseLogicProposition(valueClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LT_CLAUSE: {
				LtClause ltClause = (LtClause)theEObject;
				T result = caseLtClause(ltClause);
				if (result == null) result = caseValueClause(ltClause);
				if (result == null) result = caseLogicProposition(ltClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.GT_CLAUSE: {
				GtClause gtClause = (GtClause)theEObject;
				T result = caseGtClause(gtClause);
				if (result == null) result = caseValueClause(gtClause);
				if (result == null) result = caseLogicProposition(gtClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.EQ_CLAUSE: {
				EqClause eqClause = (EqClause)theEObject;
				T result = caseEqClause(eqClause);
				if (result == null) result = caseValueClause(eqClause);
				if (result == null) result = caseLogicProposition(eqClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LE_CLAUSE: {
				LeClause leClause = (LeClause)theEObject;
				T result = caseLeClause(leClause);
				if (result == null) result = caseValueClause(leClause);
				if (result == null) result = caseLogicProposition(leClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.GE_CLAUSE: {
				GeClause geClause = (GeClause)theEObject;
				T result = caseGeClause(geClause);
				if (result == null) result = caseValueClause(geClause);
				if (result == null) result = caseLogicProposition(geClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.CONTAINS_CLAUSE: {
				ContainsClause containsClause = (ContainsClause)theEObject;
				T result = caseContainsClause(containsClause);
				if (result == null) result = caseValueClause(containsClause);
				if (result == null) result = caseLogicProposition(containsClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.QUERY_PARAM: {
				QueryParam queryParam = (QueryParam)theEObject;
				T result = caseQueryParam(queryParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.CUSTOM_PARAM: {
				CustomParam customParam = (CustomParam)theEObject;
				T result = caseCustomParam(customParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.PRIMARY_KEY: {
				PrimaryKey primaryKey = (PrimaryKey)theEObject;
				T result = casePrimaryKey(primaryKey);
				if (result == null) result = caseColumn(primaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseColumn(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LOGISTIC_REGRESSION: {
				LogisticRegression logisticRegression = (LogisticRegression)theEObject;
				T result = caseLogisticRegression(logisticRegression);
				if (result == null) result = caseClassification(logisticRegression);
				if (result == null) result = caseDataAnalysis(logisticRegression);
				if (result == null) result = caseTask(logisticRegression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.SKEWNESS: {
				Skewness skewness = (Skewness)theEObject;
				T result = caseSkewness(skewness);
				if (result == null) result = caseDescription(skewness);
				if (result == null) result = caseDataAnalysis(skewness);
				if (result == null) result = caseTask(skewness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.SCATTER_PLOT: {
				ScatterPlot scatterPlot = (ScatterPlot)theEObject;
				T result = caseScatterPlot(scatterPlot);
				if (result == null) result = caseDataVisualization(scatterPlot);
				if (result == null) result = caseTask(scatterPlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.LABELED_SCATTER_PLOT: {
				LabeledScatterPlot labeledScatterPlot = (LabeledScatterPlot)theEObject;
				T result = caseLabeledScatterPlot(labeledScatterPlot);
				if (result == null) result = caseScatterPlot(labeledScatterPlot);
				if (result == null) result = caseDataVisualization(labeledScatterPlot);
				if (result == null) result = caseTask(labeledScatterPlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.HISTOGRAM: {
				Histogram histogram = (Histogram)theEObject;
				T result = caseHistogram(histogram);
				if (result == null) result = caseDataVisualization(histogram);
				if (result == null) result = caseTask(histogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.PIE_PLOT: {
				PiePlot piePlot = (PiePlot)theEObject;
				T result = casePiePlot(piePlot);
				if (result == null) result = caseDataVisualization(piePlot);
				if (result == null) result = caseTask(piePlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES: {
				ProjectOnAttributes projectOnAttributes = (ProjectOnAttributes)theEObject;
				T result = caseProjectOnAttributes(projectOnAttributes);
				if (result == null) result = caseDataCleaning(projectOnAttributes);
				if (result == null) result = caseTask(projectOnAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeline(Pipeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCollection(DataCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIntegration(DataIntegration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAnalysis(DataAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Cleaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCleaning(DataCleaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataVisualization(DataVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExport(Export object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Source Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Source Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSourceDeclaration(InputSourceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFile(OutputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassification(Classification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prediction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrediction(Prediction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clustering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clustering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClustering(Clustering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Values Removal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Values Removal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullValuesRemoval(NullValuesRemoval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Cleaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomCleaning(CustomCleaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Attributes List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Attributes List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinAttributesList(JoinAttributesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeInfo(RuntimeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeDataFormat(ChangeDataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KNN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KNN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKNN(KNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVM(SVM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KMeans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KMeans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKMeans(KMeans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchical(Hierarchical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agglomerative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agglomerative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgglomerative(Agglomerative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBSCAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBSCAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBSCAN(DBSCAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jarvis Patrick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jarvis Patrick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJarvisPatrick(JarvisPatrick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Regression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRegression(LinearRegression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRidge(Ridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lasso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lasso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLasso(Lasso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMean(Mean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Median</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Median</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedian(Median object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariance(Variance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicProposition(LogicProposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotClause(NotClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Operand Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Operand Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiOperandClause(MultiOperandClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndClause(AndClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrClause(OrClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueClause(ValueClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lt Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lt Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLtClause(LtClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGtClause(GtClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqClause(EqClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Le Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Le Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeClause(LeClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ge Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ge Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeClause(GeClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainsClause(ContainsClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParam(QueryParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomParam(CustomParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKey(PrimaryKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Regression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticRegression(LogisticRegression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skewness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skewness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkewness(Skewness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scatter Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScatterPlot(ScatterPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Scatter Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledScatterPlot(LabeledScatterPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Histogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistogram(Histogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pie Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pie Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiePlot(PiePlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project On Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectOnAttributes(ProjectOnAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PipelineprojectSwitch
