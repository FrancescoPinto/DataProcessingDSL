/**
 */
package pythonpipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pythonpipeline.Column;
import pythonpipeline.JoinAttributesList;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Attributes List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.JoinAttributesListImpl#getJoinAttributes <em>Join Attributes</em>}</li>
 *   <li>{@link pythonpipeline.impl.JoinAttributesListImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinAttributesListImpl extends EObjectImpl implements JoinAttributesList {
	/**
	 * The cached value of the '{@link #getJoinAttributes() <em>Join Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> joinAttributes;

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
	protected JoinAttributesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.JOIN_ATTRIBUTES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getJoinAttributes() {
		if (joinAttributes == null) {
			joinAttributes = new EObjectResolvingEList<Column>(Column.class, this, PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES);
		}
		return joinAttributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES:
				return getJoinAttributes();
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__ID:
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
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES:
				getJoinAttributes().clear();
				getJoinAttributes().addAll((Collection<? extends Column>)newValue);
				return;
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__ID:
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
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES:
				getJoinAttributes().clear();
				return;
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__ID:
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
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__JOIN_ATTRIBUTES:
				return joinAttributes != null && !joinAttributes.isEmpty();
			case PythonpipelinePackage.JOIN_ATTRIBUTES_LIST__ID:
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

} //JoinAttributesListImpl
