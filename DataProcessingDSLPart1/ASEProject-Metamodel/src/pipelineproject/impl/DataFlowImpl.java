/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipelineproject.DataFlow;
import pipelineproject.Format;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.Schema;
import pipelineproject.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.DataFlowImpl#getFrom <em>From</em>}</li>
 *   <li>{@link pipelineproject.impl.DataFlowImpl#getTo <em>To</em>}</li>
 *   <li>{@link pipelineproject.impl.DataFlowImpl#getTypeOfData <em>Type Of Data</em>}</li>
 *   <li>{@link pipelineproject.impl.DataFlowImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link pipelineproject.impl.DataFlowImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends EObjectImpl implements DataFlow {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Task from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Task to;

	/**
	 * The cached setting delegate for the '{@link #getTypeOfData() <em>Type Of Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfData()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TYPE_OF_DATA__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PipelineprojectPackage.Literals.DATA_FLOW__TYPE_OF_DATA).getSettingDelegate();

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format FORMAT_EDEFAULT = Format.JSON;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected Format format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Task)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.DATA_FLOW__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Task newFrom, NotificationChain msgs) {
		Task oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_FLOW__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Task newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, PipelineprojectPackage.TASK__OUTPUT, Task.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, PipelineprojectPackage.TASK__OUTPUT, Task.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_FLOW__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Task)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.DATA_FLOW__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Task newTo, NotificationChain msgs) {
		Task oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_FLOW__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Task newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, PipelineprojectPackage.TASK__INPUT, Task.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, PipelineprojectPackage.TASK__INPUT, Task.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_FLOW__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getTypeOfData() {
		return (Schema)TYPE_OF_DATA__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetTypeOfData() {
		return (Schema)TYPE_OF_DATA__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfData(Schema newTypeOfData) {
		TYPE_OF_DATA__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTypeOfData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(Format newFormat) {
		Format oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_FLOW__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.DATA_FLOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.DATA_FLOW__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, PipelineprojectPackage.TASK__OUTPUT, Task.class, msgs);
				return basicSetFrom((Task)otherEnd, msgs);
			case PipelineprojectPackage.DATA_FLOW__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, PipelineprojectPackage.TASK__INPUT, Task.class, msgs);
				return basicSetTo((Task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.DATA_FLOW__FROM:
				return basicSetFrom(null, msgs);
			case PipelineprojectPackage.DATA_FLOW__TO:
				return basicSetTo(null, msgs);
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
			case PipelineprojectPackage.DATA_FLOW__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case PipelineprojectPackage.DATA_FLOW__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case PipelineprojectPackage.DATA_FLOW__TYPE_OF_DATA:
				if (resolve) return getTypeOfData();
				return basicGetTypeOfData();
			case PipelineprojectPackage.DATA_FLOW__FORMAT:
				return getFormat();
			case PipelineprojectPackage.DATA_FLOW__ID:
				return getId();
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
			case PipelineprojectPackage.DATA_FLOW__FROM:
				setFrom((Task)newValue);
				return;
			case PipelineprojectPackage.DATA_FLOW__TO:
				setTo((Task)newValue);
				return;
			case PipelineprojectPackage.DATA_FLOW__TYPE_OF_DATA:
				setTypeOfData((Schema)newValue);
				return;
			case PipelineprojectPackage.DATA_FLOW__FORMAT:
				setFormat((Format)newValue);
				return;
			case PipelineprojectPackage.DATA_FLOW__ID:
				setId((String)newValue);
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
			case PipelineprojectPackage.DATA_FLOW__FROM:
				setFrom((Task)null);
				return;
			case PipelineprojectPackage.DATA_FLOW__TO:
				setTo((Task)null);
				return;
			case PipelineprojectPackage.DATA_FLOW__TYPE_OF_DATA:
				setTypeOfData((Schema)null);
				return;
			case PipelineprojectPackage.DATA_FLOW__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case PipelineprojectPackage.DATA_FLOW__ID:
				setId(ID_EDEFAULT);
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
			case PipelineprojectPackage.DATA_FLOW__FROM:
				return from != null;
			case PipelineprojectPackage.DATA_FLOW__TO:
				return to != null;
			case PipelineprojectPackage.DATA_FLOW__TYPE_OF_DATA:
				return TYPE_OF_DATA__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PipelineprojectPackage.DATA_FLOW__FORMAT:
				return format != FORMAT_EDEFAULT;
			case PipelineprojectPackage.DATA_FLOW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (format: ");
		result.append(format);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DataFlowImpl
