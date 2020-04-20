/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.LogicProposition;
import pythonpipeline.NotClause;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.NotClauseImpl#getSubClause <em>Sub Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotClauseImpl extends LogicPropositionImpl implements NotClause {
	/**
	 * The cached value of the '{@link #getSubClause() <em>Sub Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClause()
	 * @generated
	 * @ordered
	 */
	protected LogicProposition subClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.NOT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProposition getSubClause() {
		return subClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClause(LogicProposition newSubClause, NotificationChain msgs) {
		LogicProposition oldSubClause = subClause;
		subClause = newSubClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE, oldSubClause, newSubClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClause(LogicProposition newSubClause) {
		if (newSubClause != subClause) {
			NotificationChain msgs = null;
			if (subClause != null)
				msgs = ((InternalEObject)subClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE, null, msgs);
			if (newSubClause != null)
				msgs = ((InternalEObject)newSubClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE, null, msgs);
			msgs = basicSetSubClause(newSubClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE, newSubClause, newSubClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE:
				return basicSetSubClause(null, msgs);
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
			case PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE:
				return getSubClause();
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
			case PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE:
				setSubClause((LogicProposition)newValue);
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
			case PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE:
				setSubClause((LogicProposition)null);
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
			case PythonpipelinePackage.NOT_CLAUSE__SUB_CLAUSE:
				return subClause != null;
		}
		return super.eIsSet(featureID);
	}

} //NotClauseImpl
