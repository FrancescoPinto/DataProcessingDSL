/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipelineproject.ChangeDataFormat;
import pipelineproject.Format;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.ChangeDataFormatImpl#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link pipelineproject.impl.ChangeDataFormatImpl#getOutputFormat <em>Output Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeDataFormatImpl extends DataCleaningImpl implements ChangeDataFormat {
	/**
	 * The default value of the '{@link #getInputFormat() <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format INPUT_FORMAT_EDEFAULT = Format.JSON;

	/**
	 * The cached value of the '{@link #getInputFormat() <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormat()
	 * @generated
	 * @ordered
	 */
	protected Format inputFormat = INPUT_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format OUTPUT_FORMAT_EDEFAULT = Format.JSON;

	/**
	 * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected Format outputFormat = OUTPUT_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.CHANGE_DATA_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format getInputFormat() {
		return inputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFormat(Format newInputFormat) {
		Format oldInputFormat = inputFormat;
		inputFormat = newInputFormat == null ? INPUT_FORMAT_EDEFAULT : newInputFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.CHANGE_DATA_FORMAT__INPUT_FORMAT, oldInputFormat, inputFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format getOutputFormat() {
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFormat(Format newOutputFormat) {
		Format oldOutputFormat = outputFormat;
		outputFormat = newOutputFormat == null ? OUTPUT_FORMAT_EDEFAULT : newOutputFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.CHANGE_DATA_FORMAT__OUTPUT_FORMAT, oldOutputFormat, outputFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__INPUT_FORMAT:
				return getInputFormat();
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__OUTPUT_FORMAT:
				return getOutputFormat();
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
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__INPUT_FORMAT:
				setInputFormat((Format)newValue);
				return;
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__OUTPUT_FORMAT:
				setOutputFormat((Format)newValue);
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
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__INPUT_FORMAT:
				setInputFormat(INPUT_FORMAT_EDEFAULT);
				return;
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__OUTPUT_FORMAT:
				setOutputFormat(OUTPUT_FORMAT_EDEFAULT);
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
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__INPUT_FORMAT:
				return inputFormat != INPUT_FORMAT_EDEFAULT;
			case PipelineprojectPackage.CHANGE_DATA_FORMAT__OUTPUT_FORMAT:
				return outputFormat != OUTPUT_FORMAT_EDEFAULT;
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
		result.append(" (inputFormat: ");
		result.append(inputFormat);
		result.append(", outputFormat: ");
		result.append(outputFormat);
		result.append(')');
		return result.toString();
	}

} //ChangeDataFormatImpl
