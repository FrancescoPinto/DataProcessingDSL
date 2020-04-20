/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Cleaning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.CustomCleaning#getName <em>Name</em>}</li>
 *   <li>{@link pythonpipeline.CustomCleaning#getCustomParams <em>Custom Params</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getCustomCleaning()
 * @model
 * @generated
 */
public interface CustomCleaning extends DataCleaning {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pythonpipeline.PythonpipelinePackage#getCustomCleaning_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pythonpipeline.CustomCleaning#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Custom Params</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.CustomParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Params</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getCustomCleaning_CustomParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomParam> getCustomParams();

} // CustomCleaning
