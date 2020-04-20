/**
 */
package pythonpipeline;

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
 *   <li>{@link pythonpipeline.LogisticRegression#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getLogisticRegression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentNumberOfEstimatedCoefficients'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentNumberOfEstimatedCoefficients='Tuple {\n\tmessage : String = \'The number of estimated coefficients should correspond to the number of input predictors, i.e. columns of inputSchema\',\n\tstatus : Boolean = \n\t\t\tself.estimatedCoefficients->size() = self.inputSchema->first().attributes->size()+1\n}.status'"
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
	 * @see pythonpipeline.PythonpipelinePackage#getLogisticRegression_EstimatedCoefficients()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<BigDecimal> getEstimatedCoefficients();

} // LogisticRegression
