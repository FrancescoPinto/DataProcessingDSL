/**
 */
package pythonpipeline;

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
 *   <li>{@link pythonpipeline.SVM#getKernelFunction <em>Kernel Function</em>}</li>
 *   <li>{@link pythonpipeline.SVM#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 *   <li>{@link pythonpipeline.SVM#getKernelParams <em>Kernel Params</em>}</li>
 *   <li>{@link pythonpipeline.SVM#getSupportVectors <em>Support Vectors</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getSVM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentSVMCoefficientsAndVectors ConsistentKernelParams ConsistentSupportVectorsDimensionality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentSVMCoefficientsAndVectors='Tuple {\n\tmessage : String = \'Wrong number of coefficients (should be 1 + number of support vectors)\',\n\tstatus : Boolean = \n\t\tself.estimatedCoefficients->size() = self.supportVectors->size()+1\n}.status' ConsistentKernelParams='Tuple {\n\tmessage : String = \'Wrong number of kernel params\',\n\tstatus : Boolean = \n\t\tif self.kernelFunction = KernelFunction::Polynomial then\n\t\t   self.kernelParams->size() = 1\n\t\telse \n\t\t\tself.kernelParams->size() = 0\n\t\tendif\n}.status' ConsistentSupportVectorsDimensionality='Tuple {\n\tmessage : String = \'Support vector is of the wrong dimensionality with respect to input schema\',\n\tstatus : Boolean = \n\t\tself.supportVectors->forAll(v|v.vector->size() = self.inputSchema->first().attributes->size())\n}.status'"
 * @generated
 */
public interface SVM extends Classification {
	/**
	 * Returns the value of the '<em><b>Kernel Function</b></em>' attribute.
	 * The literals are from the enumeration {@link pythonpipeline.KernelFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Function</em>' attribute.
	 * @see pythonpipeline.KernelFunction
	 * @see #setKernelFunction(KernelFunction)
	 * @see pythonpipeline.PythonpipelinePackage#getSVM_KernelFunction()
	 * @model
	 * @generated
	 */
	KernelFunction getKernelFunction();

	/**
	 * Sets the value of the '{@link pythonpipeline.SVM#getKernelFunction <em>Kernel Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Function</em>' attribute.
	 * @see pythonpipeline.KernelFunction
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
	 * @see pythonpipeline.PythonpipelinePackage#getSVM_EstimatedCoefficients()
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<BigDecimal> getEstimatedCoefficients();

	/**
	 * Returns the value of the '<em><b>Kernel Params</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Params</em>' attribute list.
	 * @see pythonpipeline.PythonpipelinePackage#getSVM_KernelParams()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getKernelParams();

	/**
	 * Returns the value of the '<em><b>Support Vectors</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.SupportVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Vectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Vectors</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getSVM_SupportVectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportVector> getSupportVectors();

} // SVM
