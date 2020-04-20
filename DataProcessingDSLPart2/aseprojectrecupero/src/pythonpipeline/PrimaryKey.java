/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.PrimaryKey#getCopies <em>Copies</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getPrimaryKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IfCopiesThenSameTypeAndName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IfCopiesThenSameTypeAndName='Tuple {\n\tmessage : String = \'A primarykey can\\\'t copy primarykeys with different type or name\',\n\tstatus : Boolean = \n\t\tself.copies <> null implies (self.type = self.copies.type and self.name = self.copies.name)\n}.status'"
 * @generated
 */
public interface PrimaryKey extends Column {
	/**
	 * Returns the value of the '<em><b>Copies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copies</em>' reference.
	 * @see #setCopies(PrimaryKey)
	 * @see pythonpipeline.PythonpipelinePackage#getPrimaryKey_Copies()
	 * @model annotation="gmf.link target='copies' target.decoration='arrow' style='dot' color='0,0,255'"
	 * @generated
	 */
	PrimaryKey getCopies();

	/**
	 * Sets the value of the '{@link pythonpipeline.PrimaryKey#getCopies <em>Copies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copies</em>' reference.
	 * @see #getCopies()
	 * @generated
	 */
	void setCopies(PrimaryKey value);

} // PrimaryKey
