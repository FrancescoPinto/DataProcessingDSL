/**
 */
package pipelineproject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Operand Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.MultiOperandClause#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getMultiOperandClause()
 * @model abstract="true"
 * @generated
 */
public interface MultiOperandClause extends LogicProposition {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link pipelineproject.LogicProposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see pipelineproject.PipelineprojectPackage#getMultiOperandClause_Operands()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<LogicProposition> getOperands();

} // MultiOperandClause
