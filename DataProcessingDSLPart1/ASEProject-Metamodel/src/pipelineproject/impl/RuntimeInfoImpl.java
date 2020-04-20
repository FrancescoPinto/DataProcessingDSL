/**
 */
package pipelineproject.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipelineproject.PipelineprojectPackage;
import pipelineproject.RuntimeInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.RuntimeInfoImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link pipelineproject.impl.RuntimeInfoImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link pipelineproject.impl.RuntimeInfoImpl#getExecutionId <em>Execution Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeInfoImpl extends EObjectImpl implements RuntimeInfo {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionId() <em>Execution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXECUTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionId() <em>Execution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger executionId = EXECUTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.RUNTIME_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(BigDecimal newStartTime) {
		BigDecimal oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.RUNTIME_INFO__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(BigDecimal newEndTime) {
		BigDecimal oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.RUNTIME_INFO__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getExecutionId() {
		return executionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionId(BigInteger newExecutionId) {
		BigInteger oldExecutionId = executionId;
		executionId = newExecutionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.RUNTIME_INFO__EXECUTION_ID, oldExecutionId, executionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.RUNTIME_INFO__START_TIME:
				return getStartTime();
			case PipelineprojectPackage.RUNTIME_INFO__END_TIME:
				return getEndTime();
			case PipelineprojectPackage.RUNTIME_INFO__EXECUTION_ID:
				return getExecutionId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelineprojectPackage.RUNTIME_INFO__START_TIME:
				setStartTime((BigDecimal)newValue);
				return;
			case PipelineprojectPackage.RUNTIME_INFO__END_TIME:
				setEndTime((BigDecimal)newValue);
				return;
			case PipelineprojectPackage.RUNTIME_INFO__EXECUTION_ID:
				setExecutionId((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PipelineprojectPackage.RUNTIME_INFO__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case PipelineprojectPackage.RUNTIME_INFO__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case PipelineprojectPackage.RUNTIME_INFO__EXECUTION_ID:
				setExecutionId(EXECUTION_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PipelineprojectPackage.RUNTIME_INFO__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case PipelineprojectPackage.RUNTIME_INFO__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case PipelineprojectPackage.RUNTIME_INFO__EXECUTION_ID:
				return EXECUTION_ID_EDEFAULT == null ? executionId != null : !EXECUTION_ID_EDEFAULT.equals(executionId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", executionId: ");
		result.append(executionId);
		result.append(')');
		return result.toString();
	}

} //RuntimeInfoImpl
