/**
 */
package pipelineproject.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pipelineproject.Attribute;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.ScatterPlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.ScatterPlotImpl#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link pipelineproject.impl.ScatterPlotImpl#getResponseVariables <em>Response Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScatterPlotImpl extends DataVisualizationImpl implements ScatterPlot {
	/**
	 * The cached value of the '{@link #getIndependentVariables() <em>Independent Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> independentVariables;

	/**
	 * The cached value of the '{@link #getResponseVariables() <em>Response Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> responseVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScatterPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.SCATTER_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getIndependentVariables() {
		if (independentVariables == null) {
			independentVariables = new EObjectResolvingEList<Attribute>(Attribute.class, this, PipelineprojectPackage.SCATTER_PLOT__INDEPENDENT_VARIABLES);
		}
		return independentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getResponseVariables() {
		if (responseVariables == null) {
			responseVariables = new EObjectResolvingEList<Attribute>(Attribute.class, this, PipelineprojectPackage.SCATTER_PLOT__RESPONSE_VARIABLES);
		}
		return responseVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				return getIndependentVariables();
			case PipelineprojectPackage.SCATTER_PLOT__RESPONSE_VARIABLES:
				return getResponseVariables();
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
			case PipelineprojectPackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				getIndependentVariables().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PipelineprojectPackage.SCATTER_PLOT__RESPONSE_VARIABLES:
				getResponseVariables().clear();
				getResponseVariables().addAll((Collection<? extends Attribute>)newValue);
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
			case PipelineprojectPackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				return;
			case PipelineprojectPackage.SCATTER_PLOT__RESPONSE_VARIABLES:
				getResponseVariables().clear();
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
			case PipelineprojectPackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				return independentVariables != null && !independentVariables.isEmpty();
			case PipelineprojectPackage.SCATTER_PLOT__RESPONSE_VARIABLES:
				return responseVariables != null && !responseVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScatterPlotImpl
