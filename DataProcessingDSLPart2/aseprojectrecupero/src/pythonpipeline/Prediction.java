/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Prediction#getPredicts <em>Predicts</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getPrediction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PredictionIsForRealResponse ConsistentDataTypesInInputForPrediction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PredictionIsForRealResponse='Tuple {\n\tmessage : String = \'Prediction output should be in output schema and should be real\',\n\tstatus : Boolean = \n\t\t\tself.outputSchema.attributes->includes(self.predicts) and self.predicts.type = Type::Float\n}.status' ConsistentDataTypesInInputForPrediction='Tuple {\n\tmessage : String = \'Prediction here only works on int/float data\',\n\tstatus : Boolean = \n\t\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n}.status'"
 * @generated
 */
public interface Prediction extends DataAnalysis {
	/**
	 * Returns the value of the '<em><b>Predicts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicts</em>' reference.
	 * @see #setPredicts(Attribute)
	 * @see pythonpipeline.PythonpipelinePackage#getPrediction_Predicts()
	 * @model required="true"
	 * @generated
	 */
	Attribute getPredicts();

	/**
	 * Sets the value of the '{@link pythonpipeline.Prediction#getPredicts <em>Predicts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicts</em>' reference.
	 * @see #getPredicts()
	 * @generated
	 */
	void setPredicts(Attribute value);

} // Prediction
