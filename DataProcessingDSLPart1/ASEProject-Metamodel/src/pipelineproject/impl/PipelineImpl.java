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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pipelineproject.DataFlow;
import pipelineproject.OutputFile;
import pipelineproject.Pipeline;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.Schema;
import pipelineproject.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.PipelineImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link pipelineproject.impl.PipelineImpl#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link pipelineproject.impl.PipelineImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link pipelineproject.impl.PipelineImpl#getOutputFile <em>Output File</em>}</li>
 *   <li>{@link pipelineproject.impl.PipelineImpl#getPipelineName <em>Pipeline Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends EObjectImpl implements Pipeline {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getDataFlows() <em>Data Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> dataFlows;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputFile> outputFile;

	/**
	 * The default value of the '{@link #getPipelineName() <em>Pipeline Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelineName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIPELINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPipelineName() <em>Pipeline Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelineName()
	 * @generated
	 * @ordered
	 */
	protected String pipelineName = PIPELINE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, PipelineprojectPackage.PIPELINE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getDataFlows() {
		if (dataFlows == null) {
			dataFlows = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, PipelineprojectPackage.PIPELINE__DATA_FLOWS);
		}
		return dataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, PipelineprojectPackage.PIPELINE__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputFile> getOutputFile() {
		if (outputFile == null) {
			outputFile = new EObjectContainmentEList<OutputFile>(OutputFile.class, this, PipelineprojectPackage.PIPELINE__OUTPUT_FILE);
		}
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPipelineName() {
		return pipelineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPipelineName(String newPipelineName) {
		String oldPipelineName = pipelineName;
		pipelineName = newPipelineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.PIPELINE__PIPELINE_NAME, oldPipelineName, pipelineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.PIPELINE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case PipelineprojectPackage.PIPELINE__DATA_FLOWS:
				return ((InternalEList<?>)getDataFlows()).basicRemove(otherEnd, msgs);
			case PipelineprojectPackage.PIPELINE__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
			case PipelineprojectPackage.PIPELINE__OUTPUT_FILE:
				return ((InternalEList<?>)getOutputFile()).basicRemove(otherEnd, msgs);
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
			case PipelineprojectPackage.PIPELINE__TASKS:
				return getTasks();
			case PipelineprojectPackage.PIPELINE__DATA_FLOWS:
				return getDataFlows();
			case PipelineprojectPackage.PIPELINE__SCHEMA:
				return getSchema();
			case PipelineprojectPackage.PIPELINE__OUTPUT_FILE:
				return getOutputFile();
			case PipelineprojectPackage.PIPELINE__PIPELINE_NAME:
				return getPipelineName();
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
			case PipelineprojectPackage.PIPELINE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PipelineprojectPackage.PIPELINE__DATA_FLOWS:
				getDataFlows().clear();
				getDataFlows().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case PipelineprojectPackage.PIPELINE__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case PipelineprojectPackage.PIPELINE__OUTPUT_FILE:
				getOutputFile().clear();
				getOutputFile().addAll((Collection<? extends OutputFile>)newValue);
				return;
			case PipelineprojectPackage.PIPELINE__PIPELINE_NAME:
				setPipelineName((String)newValue);
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
			case PipelineprojectPackage.PIPELINE__TASKS:
				getTasks().clear();
				return;
			case PipelineprojectPackage.PIPELINE__DATA_FLOWS:
				getDataFlows().clear();
				return;
			case PipelineprojectPackage.PIPELINE__SCHEMA:
				getSchema().clear();
				return;
			case PipelineprojectPackage.PIPELINE__OUTPUT_FILE:
				getOutputFile().clear();
				return;
			case PipelineprojectPackage.PIPELINE__PIPELINE_NAME:
				setPipelineName(PIPELINE_NAME_EDEFAULT);
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
			case PipelineprojectPackage.PIPELINE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case PipelineprojectPackage.PIPELINE__DATA_FLOWS:
				return dataFlows != null && !dataFlows.isEmpty();
			case PipelineprojectPackage.PIPELINE__SCHEMA:
				return schema != null && !schema.isEmpty();
			case PipelineprojectPackage.PIPELINE__OUTPUT_FILE:
				return outputFile != null && !outputFile.isEmpty();
			case PipelineprojectPackage.PIPELINE__PIPELINE_NAME:
				return PIPELINE_NAME_EDEFAULT == null ? pipelineName != null : !PIPELINE_NAME_EDEFAULT.equals(pipelineName);
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
		result.append(" (pipelineName: ");
		result.append(pipelineName);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
