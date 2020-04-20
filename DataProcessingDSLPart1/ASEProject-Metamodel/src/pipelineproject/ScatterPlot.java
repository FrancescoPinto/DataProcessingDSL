/**
 */
package pipelineproject;

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
 *   <li>{@link pipelineproject.ScatterPlot#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link pipelineproject.ScatterPlot#getResponseVariables <em>Response Variables</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getScatterPlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IndependentAndResponseShouldBeInInputSchema IndependentAndResponseShouldBeDifferent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IndependentAndResponseShouldBeInInputSchema='Tuple {\n\tmessage : String = \'Independent variables and response variables should be specified within the attributes of the input schema\',\n\tstatus : Boolean = \n\t\tself.independentVariables->forAll(v|self.inputSchema.attributes->includes(v) or self.inputSchema.idColumn = v) and self.responseVariables->forAll(v|self.inputSchema.attributes->includes(v) or self.inputSchema.idColumn = v)\n}.status' IndependentAndResponseShouldBeDifferent='Tuple {\n\tmessage : String = \'Independent variables and response variables should not be the same variables\',\n\tstatus : Boolean = \n\t\tself.independentVariables->intersection(self.responseVariables)->size() = 0\n}.status'"
 * @generated
 */
public interface ScatterPlot extends DataVisualization {
	/**
	 * Returns the value of the '<em><b>Independent Variables</b></em>' reference list.
	 * The list contents are of type {@link pipelineproject.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independent Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independent Variables</em>' reference list.
	 * @see pipelineproject.PipelineprojectPackage#getScatterPlot_IndependentVariables()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getIndependentVariables();

	/**
	 * Returns the value of the '<em><b>Response Variables</b></em>' reference list.
	 * The list contents are of type {@link pipelineproject.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Variables</em>' reference list.
	 * @see pipelineproject.PipelineprojectPackage#getScatterPlot_ResponseVariables()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getResponseVariables();

} // ScatterPlot
