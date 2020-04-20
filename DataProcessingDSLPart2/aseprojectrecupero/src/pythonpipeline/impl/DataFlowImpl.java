/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pythonpipeline.DataFlow;
import pythonpipeline.Format;
import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.Schema;
import pythonpipeline.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.DataFlowImpl#getFrom <em>From</em>}</li>
 *   <li>{@link pythonpipeline.impl.DataFlowImpl#getTo <em>To</em>}</li>
 *   <li>{@link pythonpipeline.impl.DataFlowImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link pythonpipeline.impl.DataFlowImpl#getId <em>Id</em>}</li>
 *   <li>{@link pythonpipeline.impl.DataFlowImpl#getTypeOfData <em>Type Of Data</em>}</li>
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
	 * The cached value of the '{@link #getTypeOfData() <em>Type Of Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfData()
	 * @generated
	 * @ordered
	 */
	protected Schema typeOfData;

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
		return PythonpipelinePackage.Literals.DATA_FLOW;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PythonpipelinePackage.DATA_FLOW__FROM, oldFrom, from));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__FROM, oldFrom, newFrom);
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
				msgs = ((InternalEObject)from).eInverseRemove(this, PythonpipelinePackage.TASK__OUTPUT, Task.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, PythonpipelinePackage.TASK__OUTPUT, Task.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__FROM, newFrom, newFrom));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PythonpipelinePackage.DATA_FLOW__TO, oldTo, to));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__TO, oldTo, newTo);
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
				msgs = ((InternalEObject)to).eInverseRemove(this, PythonpipelinePackage.TASK__INPUT, Task.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, PythonpipelinePackage.TASK__INPUT, Task.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__TO, newTo, newTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__FORMAT, oldFormat, format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getTypeOfData() {
		if (typeOfData != null && typeOfData.eIsProxy()) {
			InternalEObject oldTypeOfData = (InternalEObject)typeOfData;
			typeOfData = (Schema)eResolveProxy(oldTypeOfData);
			if (typeOfData != oldTypeOfData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PythonpipelinePackage.DATA_FLOW__TYPE_OF_DATA, oldTypeOfData, typeOfData));
			}
		}
		return typeOfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetTypeOfData() {
		return typeOfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfData(Schema newTypeOfData) {
		Schema oldTypeOfData = typeOfData;
		typeOfData = newTypeOfData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.DATA_FLOW__TYPE_OF_DATA, oldTypeOfData, typeOfData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonpipelinePackage.DATA_FLOW__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, PythonpipelinePackage.TASK__OUTPUT, Task.class, msgs);
				return basicSetFrom((Task)otherEnd, msgs);
			case PythonpipelinePackage.DATA_FLOW__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, PythonpipelinePackage.TASK__INPUT, Task.class, msgs);
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
			case PythonpipelinePackage.DATA_FLOW__FROM:
				return basicSetFrom(null, msgs);
			case PythonpipelinePackage.DATA_FLOW__TO:
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
			case PythonpipelinePackage.DATA_FLOW__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case PythonpipelinePackage.DATA_FLOW__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case PythonpipelinePackage.DATA_FLOW__FORMAT:
				return getFormat();
			case PythonpipelinePackage.DATA_FLOW__ID:
				return getId();
			case PythonpipelinePackage.DATA_FLOW__TYPE_OF_DATA:
				if (resolve) return getTypeOfData();
				return basicGetTypeOfData();
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
			case PythonpipelinePackage.DATA_FLOW__FROM:
				setFrom((Task)newValue);
				return;
			case PythonpipelinePackage.DATA_FLOW__TO:
				setTo((Task)newValue);
				return;
			case PythonpipelinePackage.DATA_FLOW__FORMAT:
				setFormat((Format)newValue);
				return;
			case PythonpipelinePackage.DATA_FLOW__ID:
				setId((String)newValue);
				return;
			case PythonpipelinePackage.DATA_FLOW__TYPE_OF_DATA:
				setTypeOfData((Schema)newValue);
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
			case PythonpipelinePackage.DATA_FLOW__FROM:
				setFrom((Task)null);
				return;
			case PythonpipelinePackage.DATA_FLOW__TO:
				setTo((Task)null);
				return;
			case PythonpipelinePackage.DATA_FLOW__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case PythonpipelinePackage.DATA_FLOW__ID:
				setId(ID_EDEFAULT);
				return;
			case PythonpipelinePackage.DATA_FLOW__TYPE_OF_DATA:
				setTypeOfData((Schema)null);
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
			case PythonpipelinePackage.DATA_FLOW__FROM:
				return from != null;
			case PythonpipelinePackage.DATA_FLOW__TO:
				return to != null;
			case PythonpipelinePackage.DATA_FLOW__FORMAT:
				return format != FORMAT_EDEFAULT;
			case PythonpipelinePackage.DATA_FLOW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PythonpipelinePackage.DATA_FLOW__TYPE_OF_DATA:
				return typeOfData != null;
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
