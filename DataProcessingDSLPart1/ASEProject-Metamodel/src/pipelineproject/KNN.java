/**
 */
package pipelineproject;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KNN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.KNN#getK <em>K</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getKNN()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='KGreaterThanZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot KGreaterThanZero='Tuple {\n\tmessage : String = \'K should be greater than zero\',\n\tstatus : Boolean = \n\t\t\tself.K > 0\n}.status'"
 * @generated
 */
public interface KNN extends Classification {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(BigInteger)
	 * @see pipelineproject.PipelineprojectPackage#getKNN_K()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getK();

	/**
	 * Sets the value of the '{@link pipelineproject.KNN#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(BigInteger value);

} // KNN
