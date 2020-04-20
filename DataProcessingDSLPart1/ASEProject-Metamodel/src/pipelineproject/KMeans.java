/**
 */
package pipelineproject;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KMeans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.KMeans#getK <em>K</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getKMeans()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveK'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot positiveK='Tuple {\n\tmessage : String = \'K should be positive\',\n\tstatus : Boolean = self.K > 0\n}.status'"
 * @generated
 */
public interface KMeans extends Clustering {
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
	 * @see pipelineproject.PipelineprojectPackage#getKMeans_K()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getK();

	/**
	 * Sets the value of the '{@link pipelineproject.KMeans#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(BigInteger value);

} // KMeans
