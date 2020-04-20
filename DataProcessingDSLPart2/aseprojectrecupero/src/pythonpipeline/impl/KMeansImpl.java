/**
 */
package pythonpipeline.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.KMeans;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KMeans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.KMeansImpl#getK <em>K</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KMeansImpl extends ClusteringImpl implements KMeans {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KMeansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.KMEANS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.KMEANS__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.KMEANS__K:
				return getK();
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
			case PythonpipelinePackage.KMEANS__K:
				setK((BigInteger)newValue);
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
			case PythonpipelinePackage.KMEANS__K:
				setK(K_EDEFAULT);
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
			case PythonpipelinePackage.KMEANS__K:
				return K_EDEFAULT == null ? k != null : !K_EDEFAULT.equals(k);
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
		result.append(')');
		return result.toString();
	}

} //KMeansImpl
