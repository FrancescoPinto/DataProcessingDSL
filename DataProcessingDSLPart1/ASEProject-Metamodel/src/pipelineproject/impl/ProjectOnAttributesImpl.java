/**
 */
package pipelineproject.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pipelineproject.Attribute;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.ProjectOnAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project On Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.ProjectOnAttributesImpl#getProjectionAttributes <em>Projection Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectOnAttributesImpl extends DataCleaningImpl implements ProjectOnAttributes {
	/**
	 * The cached value of the '{@link #getProjectionAttributes() <em>Projection Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> projectionAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectOnAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.PROJECT_ON_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getProjectionAttributes() {
		if (projectionAttributes == null) {
			projectionAttributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, PipelineprojectPackage.PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES);
		}
		return projectionAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES:
				return getProjectionAttributes();
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
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES:
				getProjectionAttributes().clear();
				getProjectionAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES:
				getProjectionAttributes().clear();
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
			case PipelineprojectPackage.PROJECT_ON_ATTRIBUTES__PROJECTION_ATTRIBUTES:
				return projectionAttributes != null && !projectionAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectOnAttributesImpl
