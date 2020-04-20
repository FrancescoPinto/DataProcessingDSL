/**
 */
package pythonpipeline;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBSCAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.DBSCAN#getRadius <em>Radius</em>}</li>
 *   <li>{@link pythonpipeline.DBSCAN#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getDBSCAN()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveRadiusAndThreshold'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositiveRadiusAndThreshold='Tuple {\n\tmessage : String = \'The radius and the threshold should be positive\',\n\tstatus : Boolean = self.radius > 0 and self.threshold > 0\n}.status'"
 * @generated
 */
public interface DBSCAN extends Clustering {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(BigDecimal)
	 * @see pythonpipeline.PythonpipelinePackage#getDBSCAN_Radius()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getRadius();

	/**
	 * Sets the value of the '{@link pythonpipeline.DBSCAN#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(BigInteger)
	 * @see pythonpipeline.PythonpipelinePackage#getDBSCAN_Threshold()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getThreshold();

	/**
	 * Sets the value of the '{@link pythonpipeline.DBSCAN#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(BigInteger value);

} // DBSCAN
