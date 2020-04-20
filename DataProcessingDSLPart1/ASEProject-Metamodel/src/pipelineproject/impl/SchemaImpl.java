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

import pipelineproject.Attribute;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.PrimaryKey;
import pipelineproject.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.SchemaImpl#getId <em>Id</em>}</li>
 *   <li>{@link pipelineproject.impl.SchemaImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link pipelineproject.impl.SchemaImpl#getIdColumn <em>Id Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getIdColumn() <em>Id Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColumn()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey idColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.SCHEMA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, PipelineprojectPackage.SCHEMA__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getIdColumn() {
		return idColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdColumn(PrimaryKey newIdColumn, NotificationChain msgs) {
		PrimaryKey oldIdColumn = idColumn;
		idColumn = newIdColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.SCHEMA__ID_COLUMN, oldIdColumn, newIdColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdColumn(PrimaryKey newIdColumn) {
		if (newIdColumn != idColumn) {
			NotificationChain msgs = null;
			if (idColumn != null)
				msgs = ((InternalEObject)idColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.SCHEMA__ID_COLUMN, null, msgs);
			if (newIdColumn != null)
				msgs = ((InternalEObject)newIdColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.SCHEMA__ID_COLUMN, null, msgs);
			msgs = basicSetIdColumn(newIdColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.SCHEMA__ID_COLUMN, newIdColumn, newIdColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.SCHEMA__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case PipelineprojectPackage.SCHEMA__ID_COLUMN:
				return basicSetIdColumn(null, msgs);
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
			case PipelineprojectPackage.SCHEMA__ID:
				return getId();
			case PipelineprojectPackage.SCHEMA__ATTRIBUTES:
				return getAttributes();
			case PipelineprojectPackage.SCHEMA__ID_COLUMN:
				return getIdColumn();
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
			case PipelineprojectPackage.SCHEMA__ID:
				setId((String)newValue);
				return;
			case PipelineprojectPackage.SCHEMA__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PipelineprojectPackage.SCHEMA__ID_COLUMN:
				setIdColumn((PrimaryKey)newValue);
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
			case PipelineprojectPackage.SCHEMA__ID:
				setId(ID_EDEFAULT);
				return;
			case PipelineprojectPackage.SCHEMA__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PipelineprojectPackage.SCHEMA__ID_COLUMN:
				setIdColumn((PrimaryKey)null);
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
			case PipelineprojectPackage.SCHEMA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelineprojectPackage.SCHEMA__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PipelineprojectPackage.SCHEMA__ID_COLUMN:
				return idColumn != null;
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

} //SchemaImpl
