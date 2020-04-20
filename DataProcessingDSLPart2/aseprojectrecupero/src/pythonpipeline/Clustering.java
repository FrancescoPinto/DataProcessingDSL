/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Clustering#getClusters <em>Clusters</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getClustering()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentDataTypesInInputForClustering'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentDataTypesInInputForClustering='Tuple {\n\tmessage : String = \'clustering here only works on int/float data\',\n\tstatus : Boolean = \n\t\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n}.status'"
 * @generated
 */
public interface Clustering extends DataAnalysis {
	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clusters</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' reference.
	 * @see #setClusters(Attribute)
	 * @see pythonpipeline.PythonpipelinePackage#getClustering_Clusters()
	 * @model required="true"
	 * @generated
	 */
	Attribute getClusters();

	/**
	 * Sets the value of the '{@link pythonpipeline.Clustering#getClusters <em>Clusters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clusters</em>' reference.
	 * @see #getClusters()
	 * @generated
	 */
	void setClusters(Attribute value);

} // Clustering
