/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Pipeline#getTasks <em>Tasks</em>}</li>
 *   <li>{@link pythonpipeline.Pipeline#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link pythonpipeline.Pipeline#getSchema <em>Schema</em>}</li>
 *   <li>{@link pythonpipeline.Pipeline#getOutputFile <em>Output File</em>}</li>
 *   <li>{@link pythonpipeline.Pipeline#getPipelineName <em>Pipeline Name</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getPipeline()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTaskId UniqueRuntimeInfoId UniqueSchemaId NotCopyingPrimaryKeyHaveDistinctNames NotCopyingAttributesHaveDistinctNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueTaskId='Tuple {\n\tmessage : String = \'Task id should be unique\',\n\tstatus : Boolean = \n\t\tTask.allInstances()->forAll(t1,t2|t1<>t2 implies t1.id <> t2.id)\n}.status' UniqueRuntimeInfoId='Tuple {\n\tmessage : String = \'Runtime info id should be unique\',\n\tstatus : Boolean = \n\t\tRuntimeInfo.allInstances()->forAll(r1,r2|r1<>r2 implies r1.executionId <> r2.executionId)\n}.status' UniqueSchemaId='Tuple {\n\tmessage : String = \'Schema id should be unique\',\n\tstatus : Boolean = \n\t\tSchema.allInstances()->forAll(s1,s2|s1<>s2 implies s1.id <> s2.id)\n}.status' NotCopyingPrimaryKeyHaveDistinctNames='Tuple {\n\tmessage : String = \'If a primaryKey does not copy another one, should have unique name\',\n\tstatus : Boolean = \n\t\t\tPrimaryKey.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(b1,b2|b1<>b2 implies b1.name <>b2.name) \n\t\tand \n\t\t \tPrimaryKey.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(c1| Attribute.allInstances()->select(a2|c1.name=a2.name)->size() = 0)\n}.status' NotCopyingAttributesHaveDistinctNames='Tuple {\n\tmessage : String = \'If an attribute does not copy another one, should have unique name\',\n\tstatus : Boolean = \n\t\t\tAttribute.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(b1,b2|b1<>b2 implies b1.name <>b2.name) \n\t\t\tand \n\t\t \tAttribute.allInstances()->select(a1|a1.copies.oclIsUndefined())->forAll(c1| PrimaryKey.allInstances()->select(a2|c1.name=a2.name)->size() = 0)\n}.status'"
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getPipeline_Tasks()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Data Flows</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flows</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getPipeline_DataFlows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataFlow> getDataFlows();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getPipeline_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

	/**
	 * Returns the value of the '<em><b>Output File</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.OutputFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getPipeline_OutputFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputFile> getOutputFile();

	/**
	 * Returns the value of the '<em><b>Pipeline Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline Name</em>' attribute.
	 * @see #setPipelineName(String)
	 * @see pythonpipeline.PythonpipelinePackage#getPipeline_PipelineName()
	 * @model required="true"
	 * @generated
	 */
	String getPipelineName();

	/**
	 * Sets the value of the '{@link pythonpipeline.Pipeline#getPipelineName <em>Pipeline Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline Name</em>' attribute.
	 * @see #getPipelineName()
	 * @generated
	 */
	void setPipelineName(String value);

} // Pipeline
