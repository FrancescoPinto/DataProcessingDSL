/**
 */
package pipelineproject.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pipelineproject.LinearRegression;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.LinearRegressionImpl#getEstimatedCoefficients <em>Estimated Coefficients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearRegressionImpl extends PredictionImpl implements LinearRegression {
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
	protected LinearRegressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.LINEAR_REGRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getEstimatedCoefficients() {
		if (estimatedCoefficients == null) {
			estimatedCoefficients = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, PipelineprojectPackage.LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS);
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
			case PipelineprojectPackage.LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS:
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
			case PipelineprojectPackage.LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS:
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
			case PipelineprojectPackage.LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS:
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
			case PipelineprojectPackage.LINEAR_REGRESSION__ESTIMATED_COEFFICIENTS:
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
		result.append(" (estimatedCoefficients: ");
		result.append(estimatedCoefficients);
		result.append(')');
		return result.toString();
	}

} //LinearRegressionImpl
