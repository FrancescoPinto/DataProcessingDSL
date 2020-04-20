/**
 */
package pipelineproject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pipelineproject.CustomCleaning;
import pipelineproject.CustomParam;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Cleaning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.CustomCleaningImpl#getName <em>Name</em>}</li>
 *   <li>{@link pipelineproject.impl.CustomCleaningImpl#getCustomParams <em>Custom Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomCleaningImpl extends DataCleaningImpl implements CustomCleaning {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomParams() <em>Custom Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomParams()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomParam> customParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomCleaningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.CUSTOM_CLEANING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.CUSTOM_CLEANING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomParam> getCustomParams() {
		if (customParams == null) {
			customParams = new EObjectContainmentEList<CustomParam>(CustomParam.class, this, PipelineprojectPackage.CUSTOM_CLEANING__CUSTOM_PARAMS);
		}
		return customParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.CUSTOM_CLEANING__CUSTOM_PARAMS:
				return ((InternalEList<?>)getCustomParams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.CUSTOM_CLEANING__NAME:
				return getName();
			case PipelineprojectPackage.CUSTOM_CLEANING__CUSTOM_PARAMS:
				return getCustomParams();
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
			case PipelineprojectPackage.CUSTOM_CLEANING__NAME:
				setName((String)newValue);
				return;
			case PipelineprojectPackage.CUSTOM_CLEANING__CUSTOM_PARAMS:
				getCustomParams().clear();
				getCustomParams().addAll((Collection<? extends CustomParam>)newValue);
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
			case PipelineprojectPackage.CUSTOM_CLEANING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipelineprojectPackage.CUSTOM_CLEANING__CUSTOM_PARAMS:
				getCustomParams().clear();
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
			case PipelineprojectPackage.CUSTOM_CLEANING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PipelineprojectPackage.CUSTOM_CLEANING__CUSTOM_PARAMS:
				return customParams != null && !customParams.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CustomCleaningImpl
