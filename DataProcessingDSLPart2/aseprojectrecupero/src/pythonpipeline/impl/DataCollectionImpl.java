/**
 */
package pythonpipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pythonpipeline.DataCollection;
import pythonpipeline.InputSourceDeclaration;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.DataCollectionImpl#getSourceDeclaration <em>Source Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCollectionImpl extends TaskImpl implements DataCollection {
	/**
	 * The cached value of the '{@link #getSourceDeclaration() <em>Source Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSourceDeclaration> sourceDeclaration;

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
		return PythonpipelinePackage.Literals.DATA_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSourceDeclaration> getSourceDeclaration() {
		if (sourceDeclaration == null) {
			sourceDeclaration = new EObjectContainmentEList<InputSourceDeclaration>(InputSourceDeclaration.class, this, PythonpipelinePackage.DATA_COLLECTION__SOURCE_DECLARATION);
		}
		return sourceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonpipelinePackage.DATA_COLLECTION__SOURCE_DECLARATION:
				return ((InternalEList<?>)getSourceDeclaration()).basicRemove(otherEnd, msgs);
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
			case PythonpipelinePackage.DATA_COLLECTION__SOURCE_DECLARATION:
				return getSourceDeclaration();
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
			case PythonpipelinePackage.DATA_COLLECTION__SOURCE_DECLARATION:
				getSourceDeclaration().clear();
				getSourceDeclaration().addAll((Collection<? extends InputSourceDeclaration>)newValue);
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
			case PythonpipelinePackage.DATA_COLLECTION__SOURCE_DECLARATION:
				getSourceDeclaration().clear();
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
			case PythonpipelinePackage.DATA_COLLECTION__SOURCE_DECLARATION:
				return sourceDeclaration != null && !sourceDeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataCollectionImpl
