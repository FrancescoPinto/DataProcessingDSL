/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.Attribute;
import pythonpipeline.Classification;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.ClassificationImpl#getClassifies <em>Classifies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassificationImpl extends DataAnalysisImpl implements Classification {
	/**
	 * The cached value of the '{@link #getClassifies() <em>Classifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifies()
	 * @generated
	 * @ordered
	 */
	protected Attribute classifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.CLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getClassifies() {
		if (classifies != null && classifies.eIsProxy()) {
			InternalEObject oldClassifies = (InternalEObject)classifies;
			classifies = (Attribute)eResolveProxy(oldClassifies);
			if (classifies != oldClassifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PythonpipelinePackage.CLASSIFICATION__CLASSIFIES, oldClassifies, classifies));
			}
		}
		return classifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetClassifies() {
		return classifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifies(Attribute newClassifies) {
		Attribute oldClassifies = classifies;
		classifies = newClassifies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.CLASSIFICATION__CLASSIFIES, oldClassifies, classifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.CLASSIFICATION__CLASSIFIES:
				if (resolve) return getClassifies();
				return basicGetClassifies();
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
			case PythonpipelinePackage.CLASSIFICATION__CLASSIFIES:
				setClassifies((Attribute)newValue);
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
			case PythonpipelinePackage.CLASSIFICATION__CLASSIFIES:
				setClassifies((Attribute)null);
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
			case PythonpipelinePackage.CLASSIFICATION__CLASSIFIES:
				return classifies != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationImpl
