/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Values Removal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.NullValuesRemoval#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getNullValuesRemoval()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentDataTypesInInputForCleaning'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentDataTypesInInputForCleaning='Tuple {\n\tmessage : String = \'some forms of cleaning work only for numeric values\',\n\tstatus : Boolean = \n\t\tself.policy <> NulValuesPolicy::dropRecord implies (self.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float))\n}.status'"
 * @generated
 */
public interface NullValuesRemoval extends DataCleaning {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link pythonpipeline.NulValuesPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see pythonpipeline.NulValuesPolicy
	 * @see #setPolicy(NulValuesPolicy)
	 * @see pythonpipeline.PythonpipelinePackage#getNullValuesRemoval_Policy()
	 * @model required="true"
	 * @generated
	 */
	NulValuesPolicy getPolicy();

	/**
	 * Sets the value of the '{@link pythonpipeline.NullValuesRemoval#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see pythonpipeline.NulValuesPolicy
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(NulValuesPolicy value);

} // NullValuesRemoval
