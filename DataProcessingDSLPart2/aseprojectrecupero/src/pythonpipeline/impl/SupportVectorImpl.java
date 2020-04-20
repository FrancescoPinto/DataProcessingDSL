/**
 */
package pythonpipeline.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.SupportVector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Support Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.SupportVectorImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link pythonpipeline.impl.SupportVectorImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportVectorImpl extends EObjectImpl implements SupportVector {
	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> vector;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.SUPPORT_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getVector() {
		if (vector == null) {
			vector = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, PythonpipelinePackage.SUPPORT_VECTOR__VECTOR);
		}
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(BigDecimal newIndex) {
		BigDecimal oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.SUPPORT_VECTOR__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.SUPPORT_VECTOR__VECTOR:
				return getVector();
			case PythonpipelinePackage.SUPPORT_VECTOR__INDEX:
				return getIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PythonpipelinePackage.SUPPORT_VECTOR__VECTOR:
				getVector().clear();
				getVector().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case PythonpipelinePackage.SUPPORT_VECTOR__INDEX:
				setIndex((BigDecimal)newValue);
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
			case PythonpipelinePackage.SUPPORT_VECTOR__VECTOR:
				getVector().clear();
				return;
			case PythonpipelinePackage.SUPPORT_VECTOR__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case PythonpipelinePackage.SUPPORT_VECTOR__VECTOR:
				return vector != null && !vector.isEmpty();
			case PythonpipelinePackage.SUPPORT_VECTOR__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
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
		result.append(" (vector: ");
		result.append(vector);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //SupportVectorImpl
