/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Values Removal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.NullValuesRemoval#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getNullValuesRemoval()
 * @model
 * @generated
 */
public interface NullValuesRemoval extends DataCleaning {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.NulValuesPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see pipelineproject.NulValuesPolicy
	 * @see #setPolicy(NulValuesPolicy)
	 * @see pipelineproject.PipelineprojectPackage#getNullValuesRemoval_Policy()
	 * @model required="true"
	 * @generated
	 */
	NulValuesPolicy getPolicy();

	/**
	 * Sets the value of the '{@link pipelineproject.NullValuesRemoval#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see pipelineproject.NulValuesPolicy
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(NulValuesPolicy value);

} // NullValuesRemoval
