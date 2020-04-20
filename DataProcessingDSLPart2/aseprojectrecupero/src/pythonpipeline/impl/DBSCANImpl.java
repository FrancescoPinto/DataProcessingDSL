/**
 */
package pythonpipeline.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.DBSCAN;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DBSCAN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.DBSCANImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link pythonpipeline.impl.DBSCANImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBSCANImpl extends ClusteringImpl implements DBSCAN {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected BigInteger threshold = THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBSCANImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.DBSCAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(BigDecimal newRadius) {
		BigDecimal oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DBSCAN__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(BigInteger newThreshold) {
		BigInteger oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DBSCAN__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.DBSCAN__RADIUS:
				return getRadius();
			case PythonpipelinePackage.DBSCAN__THRESHOLD:
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
			case PythonpipelinePackage.DBSCAN__RADIUS:
				setRadius((BigDecimal)newValue);
				return;
			case PythonpipelinePackage.DBSCAN__THRESHOLD:
				setThreshold((BigInteger)newValue);
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
			case PythonpipelinePackage.DBSCAN__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case PythonpipelinePackage.DBSCAN__THRESHOLD:
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
			case PythonpipelinePackage.DBSCAN__RADIUS:
				return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
			case PythonpipelinePackage.DBSCAN__THRESHOLD:
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

} //DBSCANImpl
