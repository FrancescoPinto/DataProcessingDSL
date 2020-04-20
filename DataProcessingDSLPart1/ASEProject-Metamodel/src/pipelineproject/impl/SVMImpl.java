/**
 */
package pipelineproject.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pipelineproject.KernelFunction;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.SVM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.SVMImpl#getKernelFunction <em>Kernel Function</em>}</li>
 *   <li>{@link pipelineproject.impl.SVMImpl#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SVMImpl extends ClassificationImpl implements SVM {
	/**
	 * The default value of the '{@link #getKernelFunction() <em>Kernel Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelFunction()
	 * @generated
	 * @ordered
	 */
	protected static final KernelFunction KERNEL_FUNCTION_EDEFAULT = KernelFunction.GAUSSIAN;

	/**
	 * The cached value of the '{@link #getKernelFunction() <em>Kernel Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelFunction()
	 * @generated
	 * @ordered
	 */
	protected KernelFunction kernelFunction = KERNEL_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstimatedCoefficients() <em>Estimated Coefficients</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCoefficients()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> estimatedCoefficients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.SVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFunction getKernelFunction() {
		return kernelFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernelFunction(KernelFunction newKernelFunction) {
		KernelFunction oldKernelFunction = kernelFunction;
		kernelFunction = newKernelFunction == null ? KERNEL_FUNCTION_EDEFAULT : newKernelFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.SVM__KERNEL_FUNCTION, oldKernelFunction, kernelFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getEstimatedCoefficients() {
		if (estimatedCoefficients == null) {
			estimatedCoefficients = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, PipelineprojectPackage.SVM__ESTIMATED_COEFFICIENTS);
		}
		return estimatedCoefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.SVM__KERNEL_FUNCTION:
				return getKernelFunction();
			case PipelineprojectPackage.SVM__ESTIMATED_COEFFICIENTS:
				return getEstimatedCoefficients();
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
			case PipelineprojectPackage.SVM__KERNEL_FUNCTION:
				setKernelFunction((KernelFunction)newValue);
				return;
			case PipelineprojectPackage.SVM__ESTIMATED_COEFFICIENTS:
				getEstimatedCoefficients().clear();
				getEstimatedCoefficients().addAll((Collection<? extends BigDecimal>)newValue);
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
			case PipelineprojectPackage.SVM__KERNEL_FUNCTION:
				setKernelFunction(KERNEL_FUNCTION_EDEFAULT);
				return;
			case PipelineprojectPackage.SVM__ESTIMATED_COEFFICIENTS:
				getEstimatedCoefficients().clear();
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
			case PipelineprojectPackage.SVM__KERNEL_FUNCTION:
				return kernelFunction != KERNEL_FUNCTION_EDEFAULT;
			case PipelineprojectPackage.SVM__ESTIMATED_COEFFICIENTS:
				return estimatedCoefficients != null && !estimatedCoefficients.isEmpty();
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
		result.append(" (kernelFunction: ");
		result.append(kernelFunction);
		result.append(", estimatedCoefficients: ");
		result.append(estimatedCoefficients);
		result.append(')');
		return result.toString();
	}

} //SVMImpl
