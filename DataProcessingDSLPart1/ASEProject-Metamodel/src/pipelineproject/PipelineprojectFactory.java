/**
 */
package pipelineproject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pipelineproject.PipelineprojectPackage
 * @generated
 */
public interface PipelineprojectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelineprojectFactory eINSTANCE = pipelineproject.impl.PipelineprojectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Data Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Collection</em>'.
	 * @generated
	 */
	DataCollection createDataCollection();

	/**
	 * Returns a new object of class '<em>Data Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Integration</em>'.
	 * @generated
	 */
	DataIntegration createDataIntegration();

	/**
	 * Returns a new object of class '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export</em>'.
	 * @generated
	 */
	Export createExport();

	/**
	 * Returns a new object of class '<em>Input Source Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Source Declaration</em>'.
	 * @generated
	 */
	InputSourceDeclaration createInputSourceDeclaration();

	/**
	 * Returns a new object of class '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output File</em>'.
	 * @generated
	 */
	OutputFile createOutputFile();

	/**
	 * Returns a new object of class '<em>Null Values Removal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Values Removal</em>'.
	 * @generated
	 */
	NullValuesRemoval createNullValuesRemoval();

	/**
	 * Returns a new object of class '<em>Custom Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Cleaning</em>'.
	 * @generated
	 */
	CustomCleaning createCustomCleaning();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Join Attributes List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Attributes List</em>'.
	 * @generated
	 */
	JoinAttributesList createJoinAttributesList();

	/**
	 * Returns a new object of class '<em>Runtime Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Info</em>'.
	 * @generated
	 */
	RuntimeInfo createRuntimeInfo();

	/**
	 * Returns a new object of class '<em>Change Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Data Format</em>'.
	 * @generated
	 */
	ChangeDataFormat createChangeDataFormat();

	/**
	 * Returns a new object of class '<em>KNN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KNN</em>'.
	 * @generated
	 */
	KNN createKNN();

	/**
	 * Returns a new object of class '<em>SVM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SVM</em>'.
	 * @generated
	 */
	SVM createSVM();

	/**
	 * Returns a new object of class '<em>KMeans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KMeans</em>'.
	 * @generated
	 */
	KMeans createKMeans();

	/**
	 * Returns a new object of class '<em>Agglomerative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agglomerative</em>'.
	 * @generated
	 */
	Agglomerative createAgglomerative();

	/**
	 * Returns a new object of class '<em>DBSCAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBSCAN</em>'.
	 * @generated
	 */
	DBSCAN createDBSCAN();

	/**
	 * Returns a new object of class '<em>Jarvis Patrick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jarvis Patrick</em>'.
	 * @generated
	 */
	JarvisPatrick createJarvisPatrick();

	/**
	 * Returns a new object of class '<em>Linear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Regression</em>'.
	 * @generated
	 */
	LinearRegression createLinearRegression();

	/**
	 * Returns a new object of class '<em>Ridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ridge</em>'.
	 * @generated
	 */
	Ridge createRidge();

	/**
	 * Returns a new object of class '<em>Lasso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lasso</em>'.
	 * @generated
	 */
	Lasso createLasso();

	/**
	 * Returns a new object of class '<em>Mean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mean</em>'.
	 * @generated
	 */
	Mean createMean();

	/**
	 * Returns a new object of class '<em>Median</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Median</em>'.
	 * @generated
	 */
	Median createMedian();

	/**
	 * Returns a new object of class '<em>Variance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variance</em>'.
	 * @generated
	 */
	Variance createVariance();

	/**
	 * Returns a new object of class '<em>Not Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Clause</em>'.
	 * @generated
	 */
	NotClause createNotClause();

	/**
	 * Returns a new object of class '<em>And Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Clause</em>'.
	 * @generated
	 */
	AndClause createAndClause();

	/**
	 * Returns a new object of class '<em>Or Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Clause</em>'.
	 * @generated
	 */
	OrClause createOrClause();

	/**
	 * Returns a new object of class '<em>Lt Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lt Clause</em>'.
	 * @generated
	 */
	LtClause createLtClause();

	/**
	 * Returns a new object of class '<em>Gt Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt Clause</em>'.
	 * @generated
	 */
	GtClause createGtClause();

	/**
	 * Returns a new object of class '<em>Eq Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq Clause</em>'.
	 * @generated
	 */
	EqClause createEqClause();

	/**
	 * Returns a new object of class '<em>Le Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Le Clause</em>'.
	 * @generated
	 */
	LeClause createLeClause();

	/**
	 * Returns a new object of class '<em>Ge Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ge Clause</em>'.
	 * @generated
	 */
	GeClause createGeClause();

	/**
	 * Returns a new object of class '<em>Contains Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains Clause</em>'.
	 * @generated
	 */
	ContainsClause createContainsClause();

	/**
	 * Returns a new object of class '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Param</em>'.
	 * @generated
	 */
	QueryParam createQueryParam();

	/**
	 * Returns a new object of class '<em>Custom Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Param</em>'.
	 * @generated
	 */
	CustomParam createCustomParam();

	/**
	 * Returns a new object of class '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key</em>'.
	 * @generated
	 */
	PrimaryKey createPrimaryKey();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Regression</em>'.
	 * @generated
	 */
	LogisticRegression createLogisticRegression();

	/**
	 * Returns a new object of class '<em>Skewness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skewness</em>'.
	 * @generated
	 */
	Skewness createSkewness();

	/**
	 * Returns a new object of class '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scatter Plot</em>'.
	 * @generated
	 */
	ScatterPlot createScatterPlot();

	/**
	 * Returns a new object of class '<em>Labeled Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Scatter Plot</em>'.
	 * @generated
	 */
	LabeledScatterPlot createLabeledScatterPlot();

	/**
	 * Returns a new object of class '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram</em>'.
	 * @generated
	 */
	Histogram createHistogram();

	/**
	 * Returns a new object of class '<em>Pie Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pie Plot</em>'.
	 * @generated
	 */
	PiePlot createPiePlot();

	/**
	 * Returns a new object of class '<em>Project On Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project On Attributes</em>'.
	 * @generated
	 */
	ProjectOnAttributes createProjectOnAttributes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PipelineprojectPackage getPipelineprojectPackage();

} //PipelineprojectFactory
