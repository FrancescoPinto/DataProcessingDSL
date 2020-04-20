/**
 */
package pipelineproject.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipelineproject.JarvisPatrick;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jarvis Patrick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.JarvisPatrickImpl#getK <em>K</em>}</li>
 *   <li>{@link pipelineproject.impl.JarvisPatrickImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JarvisPatrickImpl extends ClusteringImpl implements JarvisPatrick {
	/**
	 * The default value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger K_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected BigInteger k = K_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal threshold = THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JarvisPatrickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.JARVIS_PATRICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK(BigInteger newK) {
		BigInteger oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.JARVIS_PATRICK__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(BigDecimal newThreshold) {
		BigDecimal oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.JARVIS_PATRICK__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.JARVIS_PATRICK__K:
				return getK();
			case PipelineprojectPackage.JARVIS_PATRICK__THRESHOLD:
				return getThreshold();
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
			case PipelineprojectPackage.JARVIS_PATRICK__K:
				setK((BigInteger)newValue);
				return;
			case PipelineprojectPackage.JARVIS_PATRICK__THRESHOLD:
				setThreshold((BigDecimal)newValue);
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
			case PipelineprojectPackage.JARVIS_PATRICK__K:
				setK(K_EDEFAULT);
				return;
			case PipelineprojectPackage.JARVIS_PATRICK__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
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
			case PipelineprojectPackage.JARVIS_PATRICK__K:
				return K_EDEFAULT == null ? k != null : !K_EDEFAULT.equals(k);
			case PipelineprojectPackage.JARVIS_PATRICK__THRESHOLD:
				return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
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
		result.append(" (K: ");
		result.append(k);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

} //JarvisPatrickImpl
