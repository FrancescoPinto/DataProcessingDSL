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

import pythonpipeline.LogicProposition;
import pythonpipeline.MultiOperandClause;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Operand Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.MultiOperandClauseImpl#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MultiOperandClauseImpl extends LogicPropositionImpl implements MultiOperandClause {
	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicProposition> operands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiOperandClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.MULTI_OPERAND_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicProposition> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList<LogicProposition>(LogicProposition.class, this, PythonpipelinePackage.MULTI_OPERAND_CLAUSE__OPERANDS);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonpipelinePackage.MULTI_OPERAND_CLAUSE__OPERANDS:
				return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
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
			case PythonpipelinePackage.MULTI_OPERAND_CLAUSE__OPERANDS:
				return getOperands();
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
			case PythonpipelinePackage.MULTI_OPERAND_CLAUSE__OPERANDS:
				getOperands().clear();
				getOperands().addAll((Collection<? extends LogicProposition>)newValue);
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
			case PythonpipelinePackage.MULTI_OPERAND_CLAUSE__OPERANDS:
				getOperands().clear();
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
			case PythonpipelinePackage.MULTI_OPERAND_CLAUSE__OPERANDS:
				return operands != null && !operands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiOperandClauseImpl
