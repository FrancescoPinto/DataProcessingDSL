/**
 */
package pipelineproject;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.RuntimeInfo#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link pipelineproject.RuntimeInfo#getEndTime <em>End Time</em>}</li>
 *   <li>{@link pipelineproject.RuntimeInfo#getExecutionId <em>Execution Id</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getRuntimeInfo()
 * @model annotation="gmf.node label='executionId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StartTimeBeforeEndTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StartTimeBeforeEndTime='Tuple {\n\tmessage : String = \'Start time must come before End time in a same task\',\n\tstatus : Boolean = \n\t\t\tself.startTime < self.endTime\n}.status'"
 * @generated
 */
public interface RuntimeInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(BigDecimal)
	 * @see pipelineproject.PipelineprojectPackage#getRuntimeInfo_StartTime()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getStartTime();

	/**
	 * Sets the value of the '{@link pipelineproject.RuntimeInfo#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(BigDecimal)
	 * @see pipelineproject.PipelineprojectPackage#getRuntimeInfo_EndTime()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getEndTime();

	/**
	 * Sets the value of the '{@link pipelineproject.RuntimeInfo#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Execution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Id</em>' attribute.
	 * @see #setExecutionId(BigInteger)
	 * @see pipelineproject.PipelineprojectPackage#getRuntimeInfo_ExecutionId()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getExecutionId();

	/**
	 * Sets the value of the '{@link pipelineproject.RuntimeInfo#getExecutionId <em>Execution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Id</em>' attribute.
	 * @see #getExecutionId()
	 * @generated
	 */
	void setExecutionId(BigInteger value);

} // RuntimeInfo
