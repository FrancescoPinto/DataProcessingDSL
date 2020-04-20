/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipelineproject.DataCollection;
import pipelineproject.InputSourceDeclaration;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.DataCollectionImpl#getSourceDeclaration <em>Source Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCollectionImpl extends TaskImpl implements DataCollection {
	/**
	 * The cached value of the '{@link #getSourceDeclaration() <em>Source Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InputSourceDeclaration sourceDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.DATA_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSourceDeclaration getSourceDeclaration() {
		return sourceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDeclaration(InputSourceDeclaration newSourceDeclaration, NotificationChain msgs) {
		InputSourceDeclaration oldSourceDeclaration = sourceDeclaration;
		sourceDeclaration = newSourceDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION, oldSourceDeclaration, newSourceDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDeclaration(InputSourceDeclaration newSourceDeclaration) {
		if (newSourceDeclaration != sourceDeclaration) {
			NotificationChain msgs = null;
			if (sourceDeclaration != null)
				msgs = ((InternalEObject)sourceDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION, null, msgs);
			if (newSourceDeclaration != null)
				msgs = ((InternalEObject)newSourceDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION, null, msgs);
			msgs = basicSetSourceDeclaration(newSourceDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION, newSourceDeclaration, newSourceDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION:
				return basicSetSourceDeclaration(null, msgs);
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
			case PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION:
				return getSourceDeclaration();
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
			case PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION:
				setSourceDeclaration((InputSourceDeclaration)newValue);
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
			case PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION:
				setSourceDeclaration((InputSourceDeclaration)null);
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
			case PipelineprojectPackage.DATA_COLLECTION__SOURCE_DECLARATION:
				return sourceDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //DataCollectionImpl
