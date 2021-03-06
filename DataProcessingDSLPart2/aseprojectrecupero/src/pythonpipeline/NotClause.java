/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.NotClause#getSubClause <em>Sub Clause</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getNotClause()
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
	 * @see pythonpipeline.PythonpipelinePackage#getNotClause_SubClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicProposition getSubClause();

	/**
	 * Sets the value of the '{@link pythonpipeline.NotClause#getSubClause <em>Sub Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Clause</em>' containment reference.
	 * @see #getSubClause()
	 * @generated
	 */
	void setSubClause(LogicProposition value);

} // NotClause
