/**
 */
package pythonpipeline;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.SupportVector#getVector <em>Vector</em>}</li>
 *   <li>{@link pythonpipeline.SupportVector#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getSupportVector()
 * @model annotation="gmf.node label='index'"
 * @generated
 */
public interface SupportVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Vector</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' attribute list.
	 * @see pythonpipeline.PythonpipelinePackage#getSupportVector_Vector()
	 * @model unique="false"
	 * @generated
	 */
	EList<BigDecimal> getVector();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigDecimal)
	 * @see pythonpipeline.PythonpipelinePackage#getSupportVector_Index()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getIndex();

	/**
	 * Sets the value of the '{@link pythonpipeline.SupportVector#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigDecimal value);

} // SupportVector
