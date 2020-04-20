/**
 */
package pipelineproject;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.LogisticRegression#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getLogisticRegression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentCoefficientSize'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentCoefficientSize='Tuple {\n\tmessage : String = \'The number of coefficients should be (#predictors+1)*#classLabels\',\n\tstatus : Boolean = \n\t\tself.estimatedCoefficients->size() = self.classLabels->size()*(self.inputSchema.attributes->size() + 1)\n}.status'"
 * @generated
 */
public interface LogisticRegression extends Classification {
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
	 * @see pipelineproject.PipelineprojectPackage#getLogisticRegression_EstimatedCoefficients()
	 * @model required="true"
	 * @generated
	 */
	EList<BigDecimal> getEstimatedCoefficients();

} // LogisticRegression
