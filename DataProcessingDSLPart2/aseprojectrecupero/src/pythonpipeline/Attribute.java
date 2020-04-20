/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Attribute#getCopies <em>Copies</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IfCopiesThenSameSignature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IfCopiesThenSameSignature='Tuple {\n\tmessage : String = \'An attribute must be completely copied (in type and name)!\',\n\tstatus : Boolean = \n\t\tself.copies <> null implies self.type = self.copies.type and self.name = self.copies.name\n}.status'"
 * @generated
 */
public interface Attribute extends Column {
	/**
	 * Returns the value of the '<em><b>Copies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copies</em>' reference.
	 * @see #setCopies(Attribute)
	 * @see pythonpipeline.PythonpipelinePackage#getAttribute_Copies()
	 * @model
	 * @generated
	 */
	Attribute getCopies();

	/**
	 * Sets the value of the '{@link pythonpipeline.Attribute#getCopies <em>Copies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copies</em>' reference.
	 * @see #getCopies()
	 * @generated
	 */
	void setCopies(Attribute value);

} // Attribute
