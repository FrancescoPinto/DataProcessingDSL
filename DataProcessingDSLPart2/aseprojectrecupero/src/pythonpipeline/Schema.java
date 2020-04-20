/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Schema#getId <em>Id</em>}</li>
 *   <li>{@link pythonpipeline.Schema#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link pythonpipeline.Schema#getIdColumn <em>Id Column</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getSchema()
 * @model annotation="gmf.node label='id' border.style='dash' border.color='150,150,255'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueAttributeNameInSameSchema'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueAttributeNameInSameSchema='Tuple {\n\tmessage : String = \'Attribute name in same schema should be unique\',\n\tstatus : Boolean = \n\t\tself.attributes->forAll(a1,a2| a1 <> a2 implies a1.name <> a2.name)\n}.status'"
 * @generated
 */
public interface Schema extends EObject {
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
	 * @see pythonpipeline.PythonpipelinePackage#getSchema_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pythonpipeline.Schema#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getSchema_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Id Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Column</em>' containment reference.
	 * @see #setIdColumn(PrimaryKey)
	 * @see pythonpipeline.PythonpipelinePackage#getSchema_IdColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryKey getIdColumn();

	/**
	 * Sets the value of the '{@link pythonpipeline.Schema#getIdColumn <em>Id Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Column</em>' containment reference.
	 * @see #getIdColumn()
	 * @generated
	 */
	void setIdColumn(PrimaryKey value);

} // Schema
