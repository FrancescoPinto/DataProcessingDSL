/**
 */
package pipelineproject;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.SVM#getKernelFunction <em>Kernel Function</em>}</li>
 *   <li>{@link pipelineproject.SVM#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getSVM()
 * @model
 * @generated
 */
public interface SVM extends Classification {
	/**
	 * Returns the value of the '<em><b>Kernel Function</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.KernelFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Function</em>' attribute.
	 * @see pipelineproject.KernelFunction
	 * @see #setKernelFunction(KernelFunction)
	 * @see pipelineproject.PipelineprojectPackage#getSVM_KernelFunction()
	 * @model
	 * @generated
	 */
	KernelFunction getKernelFunction();

	/**
	 * Sets the value of the '{@link pipelineproject.SVM#getKernelFunction <em>Kernel Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Function</em>' attribute.
	 * @see pipelineproject.KernelFunction
	 * @see #getKernelFunction()
	 * @generated
	 */
	void setKernelFunction(KernelFunction value);

	/**
	 * Returns the value of the '<em><b>Estimated Coefficients</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Coefficients</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Coefficients</em>' attribute list.
	 * @see pipelineproject.PipelineprojectPackage#getSVM_EstimatedCoefficients()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<BigDecimal> getEstimatedCoefficients();

} // SVM
