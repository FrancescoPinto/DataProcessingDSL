/**
 */
package pipelineproject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pipelineproject.DataFlow;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.RuntimeInfo;
import pipelineproject.Schema;
import pipelineproject.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.TaskImpl#getInput <em>Input</em>}</li>
 *   <li>{@link pipelineproject.impl.TaskImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link pipelineproject.impl.TaskImpl#getRuntimeInfo <em>Runtime Info</em>}</li>
 *   <li>{@link pipelineproject.impl.TaskImpl#getInputSchema <em>Input Schema</em>}</li>
 *   <li>{@link pipelineproject.impl.TaskImpl#getOutputSchema <em>Output Schema</em>}</li>
 *   <li>{@link pipelineproject.impl.TaskImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> output;

	/**
	 * The cached value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected RuntimeInfo runtimeInfo;

	/**
	 * The cached value of the '{@link #getInputSchema() <em>Input Schema</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> inputSchema;

	/**
	 * The cached value of the '{@link #getOutputSchema() <em>Output Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema outputSchema;

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
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<DataFlow>(DataFlow.class, this, PipelineprojectPackage.TASK__INPUT, PipelineprojectPackage.DATA_FLOW__TO);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList<DataFlow>(DataFlow.class, this, PipelineprojectPackage.TASK__OUTPUT, PipelineprojectPackage.DATA_FLOW__FROM);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeInfo getRuntimeInfo() {
		return runtimeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeInfo(RuntimeInfo newRuntimeInfo, NotificationChain msgs) {
		RuntimeInfo oldRuntimeInfo = runtimeInfo;
		runtimeInfo = newRuntimeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.TASK__RUNTIME_INFO, oldRuntimeInfo, newRuntimeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeInfo(RuntimeInfo newRuntimeInfo) {
		if (newRuntimeInfo != runtimeInfo) {
			NotificationChain msgs = null;
			if (runtimeInfo != null)
				msgs = ((InternalEObject)runtimeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.TASK__RUNTIME_INFO, null, msgs);
			if (newRuntimeInfo != null)
				msgs = ((InternalEObject)newRuntimeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.TASK__RUNTIME_INFO, null, msgs);
			msgs = basicSetRuntimeInfo(newRuntimeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.TASK__RUNTIME_INFO, newRuntimeInfo, newRuntimeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getInputSchema() {
		if (inputSchema == null) {
			inputSchema = new EObjectResolvingEList<Schema>(Schema.class, this, PipelineprojectPackage.TASK__INPUT_SCHEMA);
		}
		return inputSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getOutputSchema() {
		if (outputSchema != null && outputSchema.eIsProxy()) {
			InternalEObject oldOutputSchema = (InternalEObject)outputSchema;
			outputSchema = (Schema)eResolveProxy(oldOutputSchema);
			if (outputSchema != oldOutputSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.TASK__OUTPUT_SCHEMA, oldOutputSchema, outputSchema));
			}
		}
		return outputSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetOutputSchema() {
		return outputSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSchema(Schema newOutputSchema) {
		Schema oldOutputSchema = outputSchema;
		outputSchema = newOutputSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.TASK__OUTPUT_SCHEMA, oldOutputSchema, outputSchema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.TASK__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case PipelineprojectPackage.TASK__OUTPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutput()).basicAdd(otherEnd, msgs);
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
			case PipelineprojectPackage.TASK__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case PipelineprojectPackage.TASK__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case PipelineprojectPackage.TASK__RUNTIME_INFO:
				return basicSetRuntimeInfo(null, msgs);
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
			case PipelineprojectPackage.TASK__INPUT:
				return getInput();
			case PipelineprojectPackage.TASK__OUTPUT:
				return getOutput();
			case PipelineprojectPackage.TASK__RUNTIME_INFO:
				return getRuntimeInfo();
			case PipelineprojectPackage.TASK__INPUT_SCHEMA:
				return getInputSchema();
			case PipelineprojectPackage.TASK__OUTPUT_SCHEMA:
				if (resolve) return getOutputSchema();
				return basicGetOutputSchema();
			case PipelineprojectPackage.TASK__ID:
				return getId();
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
			case PipelineprojectPackage.TASK__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case PipelineprojectPackage.TASK__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case PipelineprojectPackage.TASK__RUNTIME_INFO:
				setRuntimeInfo((RuntimeInfo)newValue);
				return;
			case PipelineprojectPackage.TASK__INPUT_SCHEMA:
				getInputSchema().clear();
				getInputSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case PipelineprojectPackage.TASK__OUTPUT_SCHEMA:
				setOutputSchema((Schema)newValue);
				return;
			case PipelineprojectPackage.TASK__ID:
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
			case PipelineprojectPackage.TASK__INPUT:
				getInput().clear();
				return;
			case PipelineprojectPackage.TASK__OUTPUT:
				getOutput().clear();
				return;
			case PipelineprojectPackage.TASK__RUNTIME_INFO:
				setRuntimeInfo((RuntimeInfo)null);
				return;
			case PipelineprojectPackage.TASK__INPUT_SCHEMA:
				getInputSchema().clear();
				return;
			case PipelineprojectPackage.TASK__OUTPUT_SCHEMA:
				setOutputSchema((Schema)null);
				return;
			case PipelineprojectPackage.TASK__ID:
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
			case PipelineprojectPackage.TASK__INPUT:
				return input != null && !input.isEmpty();
			case PipelineprojectPackage.TASK__OUTPUT:
				return output != null && !output.isEmpty();
			case PipelineprojectPackage.TASK__RUNTIME_INFO:
				return runtimeInfo != null;
			case PipelineprojectPackage.TASK__INPUT_SCHEMA:
				return inputSchema != null && !inputSchema.isEmpty();
			case PipelineprojectPackage.TASK__OUTPUT_SCHEMA:
				return outputSchema != null;
			case PipelineprojectPackage.TASK__ID:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
