/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipelineproject.Attribute;
import pipelineproject.LabeledScatterPlot;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.LabeledScatterPlotImpl#getLabelAttribute <em>Label Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledScatterPlotImpl extends ScatterPlotImpl implements LabeledScatterPlot {
	/**
	 * The cached value of the '{@link #getLabelAttribute() <em>Label Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute labelAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledScatterPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.LABELED_SCATTER_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getLabelAttribute() {
		if (labelAttribute != null && labelAttribute.eIsProxy()) {
			InternalEObject oldLabelAttribute = (InternalEObject)labelAttribute;
			labelAttribute = (Attribute)eResolveProxy(oldLabelAttribute);
			if (labelAttribute != oldLabelAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE, oldLabelAttribute, labelAttribute));
			}
		}
		return labelAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetLabelAttribute() {
		return labelAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelAttribute(Attribute newLabelAttribute) {
		Attribute oldLabelAttribute = labelAttribute;
		labelAttribute = newLabelAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE, oldLabelAttribute, labelAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE:
				if (resolve) return getLabelAttribute();
				return basicGetLabelAttribute();
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
			case PipelineprojectPackage.LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE:
				setLabelAttribute((Attribute)newValue);
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
			case PipelineprojectPackage.LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE:
				setLabelAttribute((Attribute)null);
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
			case PipelineprojectPackage.LABELED_SCATTER_PLOT__LABEL_ATTRIBUTE:
				return labelAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //LabeledScatterPlotImpl
