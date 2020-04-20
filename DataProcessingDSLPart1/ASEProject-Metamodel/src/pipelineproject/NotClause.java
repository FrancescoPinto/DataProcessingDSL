/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.NotClause#getSubClause <em>Sub Clause</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getNotClause()
 * @model
 * @generated
 */
public interface NotClause extends LogicProposition {
	/**
	 * Returns the value of the '<em><b>Sub Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Clause</em>' containment reference.
	 * @see #setSubClause(LogicProposition)
	 * @see pipelineproject.PipelineprojectPackage#getNotClause_SubClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicProposition getSubClause();

	/**
	 * Sets the value of the '{@link pipelineproject.NotClause#getSubClause <em>Sub Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Clause</em>' containment reference.
	 * @see #getSubClause()
	 * @generated
	 */
	void setSubClause(LogicProposition value);

} // NotClause
