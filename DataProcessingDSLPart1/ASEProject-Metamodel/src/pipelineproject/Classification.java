/**
 */
package pipelineproject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.Classification#getClassLabels <em>Class Labels</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getClassification()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ClassificationIsForClassLabels'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ClassificationIsForClassLabels='Tuple {\n\tmessage : String = \'Classification output should be only for class labels!\',\n\tstatus : Boolean = \n\t\tself.outputSchema.attributes->forAll(a|a.type = Type::_\'String\')\n}.status'"
 * @generated
 */
public interface Classification extends DataAnalysis {
	/**
	 * Returns the value of the '<em><b>Class Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Labels</em>' attribute list.
	 * @see pipelineproject.PipelineprojectPackage#getClassification_ClassLabels()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getClassLabels();

} // Classification
