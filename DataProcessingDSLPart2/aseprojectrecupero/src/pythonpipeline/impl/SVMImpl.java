/**
 */
package pythonpipeline.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pythonpipeline.KernelFunction;
import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.SVM;
import pythonpipeline.SupportVector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.SVMImpl#getKernelFunction <em>Kernel Function</em>}</li>
 *   <li>{@link pythonpipeline.impl.SVMImpl#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 *   <li>{@link pythonpipeline.impl.SVMImpl#getKernelParams <em>Kernel Params</em>}</li>
 *   <li>{@link pythonpipeline.impl.SVMImpl#getSupportVectors <em>Support Vectors</em>}</li>
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
	protected static final KernelFunction KERNEL_FUNCTION_EDEFAULT = KernelFunction.LINEAR;

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
	 * The cached value of the '{@link #getKernelParams() <em>Kernel Params</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelParams()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> kernelParams;

	/**
	 * The cached value of the '{@link #getSupportVectors() <em>Support Vectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportVectors()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportVector> supportVectors;

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
		return PythonpipelinePackage.Literals.SVM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.SVM__KERNEL_FUNCTION, oldKernelFunction, kernelFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getEstimatedCoefficients() {
		if (estimatedCoefficients == null) {
			estimatedCoefficients = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, PythonpipelinePackage.SVM__ESTIMATED_COEFFICIENTS);
		}
		return estimatedCoefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getKernelParams() {
		if (kernelParams == null) {
			kernelParams = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, PythonpipelinePackage.SVM__KERNEL_PARAMS);
		}
		return kernelParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportVector> getSupportVectors() {
		if (supportVectors == null) {
			supportVectors = new EObjectContainmentEList<SupportVector>(SupportVector.class, this, PythonpipelinePackage.SVM__SUPPORT_VECTORS);
		}
		return supportVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonpipelinePackage.SVM__SUPPORT_VECTORS:
				return ((InternalEList<?>)getSupportVectors()).basicRemove(otherEnd, msgs);
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
			case PythonpipelinePackage.SVM__KERNEL_FUNCTION:
				return getKernelFunction();
			case PythonpipelinePackage.SVM__ESTIMATED_COEFFICIENTS:
				return getEstimatedCoefficients();
			case PythonpipelinePackage.SVM__KERNEL_PARAMS:
				return getKernelParams();
			case PythonpipelinePackage.SVM__SUPPORT_VECTORS:
				return getSupportVectors();
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
			case PythonpipelinePackage.SVM__KERNEL_FUNCTION:
				setKernelFunction((KernelFunction)newValue);
				return;
			case PythonpipelinePackage.SVM__ESTIMATED_COEFFICIENTS:
				getEstimatedCoefficients().clear();
				getEstimatedCoefficients().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case PythonpipelinePackage.SVM__KERNEL_PARAMS:
				getKernelParams().clear();
				getKernelParams().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case PythonpipelinePackage.SVM__SUPPORT_VECTORS:
				getSupportVectors().clear();
				getSupportVectors().addAll((Collection<? extends SupportVector>)newValue);
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
			case PythonpipelinePackage.SVM__KERNEL_FUNCTION:
				setKernelFunction(KERNEL_FUNCTION_EDEFAULT);
				return;
			case PythonpipelinePackage.SVM__ESTIMATED_COEFFICIENTS:
				getEstimatedCoefficients().clear();
				return;
			case PythonpipelinePackage.SVM__KERNEL_PARAMS:
				getKernelParams().clear();
				return;
			case PythonpipelinePackage.SVM__SUPPORT_VECTORS:
				getSupportVectors().clear();
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
			case PythonpipelinePackage.SVM__KERNEL_FUNCTION:
				return kernelFunction != KERNEL_FUNCTION_EDEFAULT;
			case PythonpipelinePackage.SVM__ESTIMATED_COEFFICIENTS:
				return estimatedCoefficients != null && !estimatedCoefficients.isEmpty();
			case PythonpipelinePackage.SVM__KERNEL_PARAMS:
				return kernelParams != null && !kernelParams.isEmpty();
			case PythonpipelinePackage.SVM__SUPPORT_VECTORS:
				return supportVectors != null && !supportVectors.isEmpty();
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
		result.append(", kernelParams: ");
		result.append(kernelParams);
		result.append(')');
		return result.toString();
	}

} //SVMImpl
