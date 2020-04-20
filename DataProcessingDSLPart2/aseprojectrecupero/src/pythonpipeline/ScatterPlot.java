/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.ScatterPlot#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link pythonpipeline.ScatterPlot#getResponseVariable <em>Response Variable</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getScatterPlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IndependentAndResponseShouldBeInInputSchema IndependentAndResponseShouldBeDifferent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IndependentAndResponseShouldBeInInputSchema='Tuple {\n\tmessage : String = \'Independent variables and response variables should be specified within the attributes of the input schema\',\n\tstatus : Boolean = \n\t\tself.independentVariables->forAll(v|self.inputSchema->first().attributes->includes(v) or self.inputSchema.idColumn = v) and (self.inputSchema->first().attributes->includes(responseVariable) or self.inputSchema.idColumn = responseVariable)\n}.status' IndependentAndResponseShouldBeDifferent='Tuple {\n\tmessage : String = \'Independent variables and response variables should not be the same variables\',\n\tstatus : Boolean = \n\t\tself.independentVariables->intersection(Set{self.responseVariable})->size() = 0\n}.status'"
 * @generated
 */
public interface ScatterPlot extends DataVisualization {
	/**
	 * Returns the value of the '<em><b>Independent Variables</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independent Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independent Variables</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getScatterPlot_IndependentVariables()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getIndependentVariables();

	/**
	 * Returns the value of the '<em><b>Response Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Variable</em>' reference.
	 * @see #setResponseVariable(Attribute)
	 * @see pythonpipeline.PythonpipelinePackage#getScatterPlot_ResponseVariable()
	 * @model required="true"
	 * @generated
	 */
	Attribute getResponseVariable();

	/**
	 * Sets the value of the '{@link pythonpipeline.ScatterPlot#getResponseVariable <em>Response Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Variable</em>' reference.
	 * @see #getResponseVariable()
	 * @generated
	 */
	void setResponseVariable(Attribute value);

} // ScatterPlot
