/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.ValueClause#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link pythonpipeline.ValueClause#getConditionField <em>Condition Field</em>}</li>
 *   <li>{@link pythonpipeline.ValueClause#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getValueClause()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistenValueClauseTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistenValueClauseTypes='Tuple {\n\tmessage : String = \'ComparisonValue and QueryParam should have same type\',\n\tstatus : Boolean = \n\t\tself.type = self.conditionField.type\n}.status'"
 * @generated
 */
public interface ValueClause extends LogicProposition {
	/**
	 * Returns the value of the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Value</em>' attribute.
	 * @see #setComparisonValue(String)
	 * @see pythonpipeline.PythonpipelinePackage#getValueClause_ComparisonValue()
	 * @model required="true"
	 * @generated
	 */
	String getComparisonValue();

	/**
	 * Sets the value of the '{@link pythonpipeline.ValueClause#getComparisonValue <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' attribute.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(String value);

	/**
	 * Returns the value of the '<em><b>Condition Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Field</em>' containment reference.
	 * @see #setConditionField(QueryParam)
	 * @see pythonpipeline.PythonpipelinePackage#getValueClause_ConditionField()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QueryParam getConditionField();

	/**
	 * Sets the value of the '{@link pythonpipeline.ValueClause#getConditionField <em>Condition Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Field</em>' containment reference.
	 * @see #getConditionField()
	 * @generated
	 */
	void setConditionField(QueryParam value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pythonpipeline.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pythonpipeline.Type
	 * @see #setType(Type)
	 * @see pythonpipeline.PythonpipelinePackage#getValueClause_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link pythonpipeline.ValueClause#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pythonpipeline.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ValueClause
