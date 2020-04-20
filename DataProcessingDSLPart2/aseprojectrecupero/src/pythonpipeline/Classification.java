/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Classification#getClassifies <em>Classifies</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getClassification()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ClassificationIsForClassLabels ConsistentDataTypesInInputForClassification'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ClassificationIsForClassLabels='Tuple {\n\tmessage : String = \'Classification output should be only for class labels!\',\n\tstatus : Boolean = \n\t\tself.outputSchema.attributes->includes(self.classifies) and self.classifies.type = Type::Float\n}.status' ConsistentDataTypesInInputForClassification='Tuple {\n\tmessage : String = \'Classification here only works on int/float data\',\n\tstatus : Boolean = \n\t\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n}.status'"
 * @generated
 */
public interface Classification extends DataAnalysis {
	/**
	 * Returns the value of the '<em><b>Classifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifies</em>' reference.
	 * @see #setClassifies(Attribute)
	 * @see pythonpipeline.PythonpipelinePackage#getClassification_Classifies()
	 * @model required="true"
	 * @generated
	 */
	Attribute getClassifies();

	/**
	 * Sets the value of the '{@link pythonpipeline.Classification#getClassifies <em>Classifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifies</em>' reference.
	 * @see #getClassifies()
	 * @generated
	 */
	void setClassifies(Attribute value);

} // Classification
