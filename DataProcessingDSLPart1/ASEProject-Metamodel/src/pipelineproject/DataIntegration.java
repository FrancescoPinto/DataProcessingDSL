/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.DataIntegration#getJoinAttributesList <em>Join Attributes List</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getDataIntegration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='JoinAttributesShouldBeOverAllSchemas AttributeContainedInSchema JoinAttributesSameType JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot JoinAttributesShouldBeOverAllSchemas='Tuple {\n\tmessage : String = \'Join attribute lists should be over all the input tables\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes->size() = self.inputSchema->size()\n}.status' AttributeContainedInSchema='Tuple {\n\tmessage : String = \'Each attribute in a list should be contained once and only once in an input schema\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes->forAll(j| self.inputSchema->select(s|s.attributes->includes(j) or s.idColumn = j)->size() = 1)\n}.status' JoinAttributesSameType='Tuple {\n\tmessage : String = \'Join attributes should have same type\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and self.joinAttributesList.joinAttributes.type->asSet()->size() = 1\n}.status' JoinedOutputSchemaShouldHaveOneKeyAndContainAllOtherAttributes='Tuple {\n\tmessage : String = \'Output schema of join should contain at most one attribute identical to the first attribute in the joinAttributesList (0 if it is a generatedID join), and all the attributes in the input tables\',\n\tstatus : Boolean = \n\t\t\tnot self.joinAttributesList.oclIsUndefined() and\n\t\t\tself.outputSchema.attributes->select(a| self.joinAttributesList.joinAttributes->first().name = a.name and a.type = self.joinAttributesList.joinAttributes->first().type)->size() <= 1 and\n\t\t\tself.outputSchema.attributes->forAll(a| self.inputSchema.attributes->select(a1|a1.name = a.name and a1.type = a.type)->size() >= 1 or (self.joinAttributesList.joinAttributes->first().name = a.name and a.type = self.joinAttributesList.joinAttributes->first().type))\n}.status'"
 * @generated
 */
public interface DataIntegration extends Task {
	/**
	 * Returns the value of the '<em><b>Join Attributes List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Attributes List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Attributes List</em>' containment reference.
	 * @see #setJoinAttributesList(JoinAttributesList)
	 * @see pipelineproject.PipelineprojectPackage#getDataIntegration_JoinAttributesList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JoinAttributesList getJoinAttributesList();

	/**
	 * Sets the value of the '{@link pipelineproject.DataIntegration#getJoinAttributesList <em>Join Attributes List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Attributes List</em>' containment reference.
	 * @see #getJoinAttributesList()
	 * @generated
	 */
	void setJoinAttributesList(JoinAttributesList value);

} // DataIntegration
