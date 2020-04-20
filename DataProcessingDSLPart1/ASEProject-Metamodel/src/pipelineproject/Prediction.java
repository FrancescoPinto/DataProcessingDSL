/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see pipelineproject.PipelineprojectPackage#getPrediction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PredictionIsForRealResponse'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PredictionIsForRealResponse='Tuple {\n\tmessage : String = \'Prediction output should be only for real response!\',\n\tstatus : Boolean = \n\t\tself.outputSchema.attributes->forAll(a|a.type = Type::Float)\n}.status'"
 * @generated
 */
public interface Prediction extends DataAnalysis {
} // Prediction
