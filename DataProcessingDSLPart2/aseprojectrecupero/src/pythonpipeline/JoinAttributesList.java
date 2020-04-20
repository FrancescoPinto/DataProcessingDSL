/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Attributes List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.JoinAttributesList#getJoinAttributes <em>Join Attributes</em>}</li>
 *   <li>{@link pythonpipeline.JoinAttributesList#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getJoinAttributesList()
 * @model annotation="gmf.node label='id'"
 * @generated
 */
public interface JoinAttributesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Join Attributes</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Attributes</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getJoinAttributesList_JoinAttributes()
	 * @model lower="2"
	 * @generated
	 */
	EList<Column> getJoinAttributes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pythonpipeline.PythonpipelinePackage#getJoinAttributesList_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pythonpipeline.JoinAttributesList#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // JoinAttributesList
