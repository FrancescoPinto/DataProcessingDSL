/**
 */
package pythonpipeline.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.Lasso;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lasso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.LassoImpl#getPenaltyFactor <em>Penalty Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LassoImpl extends LinearRegressionImpl implements Lasso {
	/**
	 * The default value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyFactor()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PENALTY_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyFactor()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal penaltyFactor = PENALTY_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LassoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.LASSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPenaltyFactor() {
		return penaltyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenaltyFactor(BigDecimal newPenaltyFactor) {
		BigDecimal oldPenaltyFactor = penaltyFactor;
		penaltyFactor = newPenaltyFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.LASSO__PENALTY_FACTOR, oldPenaltyFactor, penaltyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.LASSO__PENALTY_FACTOR:
				return getPenaltyFactor();
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
			case PythonpipelinePackage.LASSO__PENALTY_FACTOR:
				setPenaltyFactor((BigDecimal)newValue);
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
			case PythonpipelinePackage.LASSO__PENALTY_FACTOR:
				setPenaltyFactor(PENALTY_FACTOR_EDEFAULT);
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
			case PythonpipelinePackage.LASSO__PENALTY_FACTOR:
				return PENALTY_FACTOR_EDEFAULT == null ? penaltyFactor != null : !PENALTY_FACTOR_EDEFAULT.equals(penaltyFactor);
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
		result.append(" (penaltyFactor: ");
		result.append(penaltyFactor);
		result.append(')');
		return result.toString();
	}

} //LassoImpl
