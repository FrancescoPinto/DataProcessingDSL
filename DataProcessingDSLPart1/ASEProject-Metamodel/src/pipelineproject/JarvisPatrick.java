/**
 */
package pipelineproject;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jarvis Patrick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.JarvisPatrick#getK <em>K</em>}</li>
 *   <li>{@link pipelineproject.JarvisPatrick#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getJarvisPatrick()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveKAndThreshold'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositiveKAndThreshold='Tuple {\n\tmessage : String = \'The K and threshold should be positive\',\n\tstatus : Boolean = self.K > 0 and self.threshold > 0\n}.status'"
 * @generated
 */
public interface JarvisPatrick extends Clustering {
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
	 * @see pipelineproject.PipelineprojectPackage#getJarvisPatrick_K()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getK();

	/**
	 * Sets the value of the '{@link pipelineproject.JarvisPatrick#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(BigDecimal)
	 * @see pipelineproject.PipelineprojectPackage#getJarvisPatrick_Threshold()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getThreshold();

	/**
	 * Sets the value of the '{@link pipelineproject.JarvisPatrick#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(BigDecimal value);

} // JarvisPatrick
