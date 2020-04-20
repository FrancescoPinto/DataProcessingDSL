/**
 */
package pythonpipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pythonpipeline.Attribute;
import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.ScatterPlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.ScatterPlotImpl#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link pythonpipeline.impl.ScatterPlotImpl#getResponseVariable <em>Response Variable</em>}</li>
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
	 * The cached value of the '{@link #getResponseVariable() <em>Response Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseVariable()
	 * @generated
	 * @ordered
	 */
	protected Attribute responseVariable;

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
		return PythonpipelinePackage.Literals.SCATTER_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getIndependentVariables() {
		if (independentVariables == null) {
			independentVariables = new EObjectResolvingEList<Attribute>(Attribute.class, this, PythonpipelinePackage.SCATTER_PLOT__INDEPENDENT_VARIABLES);
		}
		return independentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getResponseVariable() {
		if (responseVariable != null && responseVariable.eIsProxy()) {
			InternalEObject oldResponseVariable = (InternalEObject)responseVariable;
			responseVariable = (Attribute)eResolveProxy(oldResponseVariable);
			if (responseVariable != oldResponseVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PythonpipelinePackage.SCATTER_PLOT__RESPONSE_VARIABLE, oldResponseVariable, responseVariable));
			}
		}
		return responseVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetResponseVariable() {
		return responseVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseVariable(Attribute newResponseVariable) {
		Attribute oldResponseVariable = responseVariable;
		responseVariable = newResponseVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.SCATTER_PLOT__RESPONSE_VARIABLE, oldResponseVariable, responseVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				return getIndependentVariables();
			case PythonpipelinePackage.SCATTER_PLOT__RESPONSE_VARIABLE:
				if (resolve) return getResponseVariable();
				return basicGetResponseVariable();
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
			case PythonpipelinePackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				getIndependentVariables().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PythonpipelinePackage.SCATTER_PLOT__RESPONSE_VARIABLE:
				setResponseVariable((Attribute)newValue);
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
			case PythonpipelinePackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				return;
			case PythonpipelinePackage.SCATTER_PLOT__RESPONSE_VARIABLE:
				setResponseVariable((Attribute)null);
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
			case PythonpipelinePackage.SCATTER_PLOT__INDEPENDENT_VARIABLES:
				return independentVariables != null && !independentVariables.isEmpty();
			case PythonpipelinePackage.SCATTER_PLOT__RESPONSE_VARIABLE:
				return responseVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ScatterPlotImpl
