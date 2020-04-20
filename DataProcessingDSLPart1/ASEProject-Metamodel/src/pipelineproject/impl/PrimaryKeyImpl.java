/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.PrimaryKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.PrimaryKeyImpl#getCopies <em>Copies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends ColumnImpl implements PrimaryKey {
	/**
	 * The cached value of the '{@link #getCopies() <em>Copies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey copies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.PRIMARY_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getCopies() {
		if (copies != null && copies.eIsProxy()) {
			InternalEObject oldCopies = (InternalEObject)copies;
			copies = (PrimaryKey)eResolveProxy(oldCopies);
			if (copies != oldCopies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.PRIMARY_KEY__COPIES, oldCopies, copies));
			}
		}
		return copies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetCopies() {
		return copies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopies(PrimaryKey newCopies) {
		PrimaryKey oldCopies = copies;
		copies = newCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.PRIMARY_KEY__COPIES, oldCopies, copies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.PRIMARY_KEY__COPIES:
				if (resolve) return getCopies();
				return basicGetCopies();
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
			case PipelineprojectPackage.PRIMARY_KEY__COPIES:
				setCopies((PrimaryKey)newValue);
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
			case PipelineprojectPackage.PRIMARY_KEY__COPIES:
				setCopies((PrimaryKey)null);
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
			case PipelineprojectPackage.PRIMARY_KEY__COPIES:
				return copies != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
