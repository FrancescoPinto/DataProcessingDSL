/**
 */
package pythonpipeline.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.RuntimeInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.RuntimeInfoImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link pythonpipeline.impl.RuntimeInfoImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link pythonpipeline.impl.RuntimeInfoImpl#getExecutionId <em>Execution Id</em>}</li>
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
	protected static final BigDecimal EXECUTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionId() <em>Execution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionId()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal executionId = EXECUTION_ID_EDEFAULT;

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
		return PythonpipelinePackage.Literals.RUNTIME_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.RUNTIME_INFO__START_TIME, oldStartTime, startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.RUNTIME_INFO__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getExecutionId() {
		return executionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionId(BigDecimal newExecutionId) {
		BigDecimal oldExecutionId = executionId;
		executionId = newExecutionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.RUNTIME_INFO__EXECUTION_ID, oldExecutionId, executionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.RUNTIME_INFO__START_TIME:
				return getStartTime();
			case PythonpipelinePackage.RUNTIME_INFO__END_TIME:
				return getEndTime();
			case PythonpipelinePackage.RUNTIME_INFO__EXECUTION_ID:
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
			case PythonpipelinePackage.RUNTIME_INFO__START_TIME:
				setStartTime((BigDecimal)newValue);
				return;
			case PythonpipelinePackage.RUNTIME_INFO__END_TIME:
				setEndTime((BigDecimal)newValue);
				return;
			case PythonpipelinePackage.RUNTIME_INFO__EXECUTION_ID:
				setExecutionId((BigDecimal)newValue);
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
			case PythonpipelinePackage.RUNTIME_INFO__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case PythonpipelinePackage.RUNTIME_INFO__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case PythonpipelinePackage.RUNTIME_INFO__EXECUTION_ID:
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
			case PythonpipelinePackage.RUNTIME_INFO__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case PythonpipelinePackage.RUNTIME_INFO__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case PythonpipelinePackage.RUNTIME_INFO__EXECUTION_ID:
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
