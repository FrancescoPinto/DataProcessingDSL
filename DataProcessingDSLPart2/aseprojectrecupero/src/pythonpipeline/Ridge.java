/**
 */
package pythonpipeline;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Ridge#getPenaltyFactor <em>Penalty Factor</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getRidge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositivePenaltyFactor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositivePenaltyFactor='Tuple {\n\tmessage : String = \'Penalty factor should be positive, otherwise, if it is zero, use plain linear regression\',\n\tstatus : Boolean = \n\t\t\tself.penaltyFactor > 0\n}.status'"
 * @generated
 */
public interface Ridge extends LinearRegression {
	/**
	 * Returns the value of the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty Factor</em>' attribute.
	 * @see #setPenaltyFactor(BigDecimal)
	 * @see pythonpipeline.PythonpipelinePackage#getRidge_PenaltyFactor()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getPenaltyFactor();

	/**
	 * Sets the value of the '{@link pythonpipeline.Ridge#getPenaltyFactor <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Factor</em>' attribute.
	 * @see #getPenaltyFactor()
	 * @generated
	 */
	void setPenaltyFactor(BigDecimal value);

} // Ridge
