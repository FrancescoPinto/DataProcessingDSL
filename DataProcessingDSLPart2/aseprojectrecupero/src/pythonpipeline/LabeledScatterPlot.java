/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.LabeledScatterPlot#getLabelAttribute <em>Label Attribute</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getLabeledScatterPlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LabelAttributeShouldBeInInputSchema'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LabelAttributeShouldBeInInputSchema='Tuple {\n\tmessage : String = \'Label variables should be specified within the attributes of the input schema\',\n\tstatus : Boolean = \n\t\tself.inputSchema.attributes->includes(self.labelAttribute) or self.inputSchema.idColumn = self.labelAttribute\n}.status'"
 * @generated
 */
public interface LabeledScatterPlot extends ScatterPlot {
	/**
	 * Returns the value of the '<em><b>Label Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Attribute</em>' reference.
	 * @see #setLabelAttribute(Attribute)
	 * @see pythonpipeline.PythonpipelinePackage#getLabeledScatterPlot_LabelAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getLabelAttribute();

	/**
	 * Sets the value of the '{@link pythonpipeline.LabeledScatterPlot#getLabelAttribute <em>Label Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Attribute</em>' reference.
	 * @see #getLabelAttribute()
	 * @generated
	 */
	void setLabelAttribute(Attribute value);

} // LabeledScatterPlot
