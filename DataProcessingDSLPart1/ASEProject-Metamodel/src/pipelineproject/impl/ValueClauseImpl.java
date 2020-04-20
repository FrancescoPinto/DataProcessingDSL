/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipelineproject.PipelineprojectPackage;
import pipelineproject.QueryParam;
import pipelineproject.Type;
import pipelineproject.ValueClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.ValueClauseImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link pipelineproject.impl.ValueClauseImpl#getConditionField <em>Condition Field</em>}</li>
 *   <li>{@link pipelineproject.impl.ValueClauseImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueClauseImpl extends LogicPropositionImpl implements ValueClause {
	/**
	 * The default value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected String comparisonValue = COMPARISON_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionField() <em>Condition Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionField()
	 * @generated
	 * @ordered
	 */
	protected QueryParam conditionField;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.VALUE_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparisonValue() {
		return comparisonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonValue(String newComparisonValue) {
		String oldComparisonValue = comparisonValue;
		comparisonValue = newComparisonValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.VALUE_CLAUSE__COMPARISON_VALUE, oldComparisonValue, comparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam getConditionField() {
		return conditionField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionField(QueryParam newConditionField, NotificationChain msgs) {
		QueryParam oldConditionField = conditionField;
		conditionField = newConditionField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD, oldConditionField, newConditionField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionField(QueryParam newConditionField) {
		if (newConditionField != conditionField) {
			NotificationChain msgs = null;
			if (conditionField != null)
				msgs = ((InternalEObject)conditionField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD, null, msgs);
			if (newConditionField != null)
				msgs = ((InternalEObject)newConditionField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD, null, msgs);
			msgs = basicSetConditionField(newConditionField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD, newConditionField, newConditionField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.VALUE_CLAUSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD:
				return basicSetConditionField(null, msgs);
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
			case PipelineprojectPackage.VALUE_CLAUSE__COMPARISON_VALUE:
				return getComparisonValue();
			case PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD:
				return getConditionField();
			case PipelineprojectPackage.VALUE_CLAUSE__TYPE:
				return getType();
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
			case PipelineprojectPackage.VALUE_CLAUSE__COMPARISON_VALUE:
				setComparisonValue((String)newValue);
				return;
			case PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD:
				setConditionField((QueryParam)newValue);
				return;
			case PipelineprojectPackage.VALUE_CLAUSE__TYPE:
				setType((Type)newValue);
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
			case PipelineprojectPackage.VALUE_CLAUSE__COMPARISON_VALUE:
				setComparisonValue(COMPARISON_VALUE_EDEFAULT);
				return;
			case PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD:
				setConditionField((QueryParam)null);
				return;
			case PipelineprojectPackage.VALUE_CLAUSE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PipelineprojectPackage.VALUE_CLAUSE__COMPARISON_VALUE:
				return COMPARISON_VALUE_EDEFAULT == null ? comparisonValue != null : !COMPARISON_VALUE_EDEFAULT.equals(comparisonValue);
			case PipelineprojectPackage.VALUE_CLAUSE__CONDITION_FIELD:
				return conditionField != null;
			case PipelineprojectPackage.VALUE_CLAUSE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (comparisonValue: ");
		result.append(comparisonValue);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ValueClauseImpl
