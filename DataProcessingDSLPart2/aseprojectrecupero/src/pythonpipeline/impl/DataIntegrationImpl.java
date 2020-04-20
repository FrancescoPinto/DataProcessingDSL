/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.DataIntegration;
import pythonpipeline.JoinAttributesList;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.DataIntegrationImpl#getJoinAttributesList <em>Join Attributes List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataIntegrationImpl extends TaskImpl implements DataIntegration {
	/**
	 * The cached value of the '{@link #getJoinAttributesList() <em>Join Attributes List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinAttributesList()
	 * @generated
	 * @ordered
	 */
	protected JoinAttributesList joinAttributesList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataIntegrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.DATA_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinAttributesList getJoinAttributesList() {
		return joinAttributesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinAttributesList(JoinAttributesList newJoinAttributesList, NotificationChain msgs) {
		JoinAttributesList oldJoinAttributesList = joinAttributesList;
		joinAttributesList = newJoinAttributesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST, oldJoinAttributesList, newJoinAttributesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinAttributesList(JoinAttributesList newJoinAttributesList) {
		if (newJoinAttributesList != joinAttributesList) {
			NotificationChain msgs = null;
			if (joinAttributesList != null)
				msgs = ((InternalEObject)joinAttributesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST, null, msgs);
			if (newJoinAttributesList != null)
				msgs = ((InternalEObject)newJoinAttributesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST, null, msgs);
			msgs = basicSetJoinAttributesList(newJoinAttributesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST, newJoinAttributesList, newJoinAttributesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST:
				return basicSetJoinAttributesList(null, msgs);
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
			case PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST:
				return getJoinAttributesList();
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
			case PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST:
				setJoinAttributesList((JoinAttributesList)newValue);
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
			case PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST:
				setJoinAttributesList((JoinAttributesList)null);
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
			case PythonpipelinePackage.DATA_INTEGRATION__JOIN_ATTRIBUTES_LIST:
				return joinAttributesList != null;
		}
		return super.eIsSet(featureID);
	}

} //DataIntegrationImpl
