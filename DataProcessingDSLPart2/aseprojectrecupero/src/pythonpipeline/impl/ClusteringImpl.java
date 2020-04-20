/**
 */
package pythonpipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.Attribute;
import pythonpipeline.Clustering;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.ClusteringImpl#getClusters <em>Clusters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClusteringImpl extends DataAnalysisImpl implements Clustering {
	/**
	 * The cached value of the '{@link #getClusters() <em>Clusters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusters()
	 * @generated
	 * @ordered
	 */
	protected Attribute clusters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusteringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.CLUSTERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getClusters() {
		if (clusters != null && clusters.eIsProxy()) {
			InternalEObject oldClusters = (InternalEObject)clusters;
			clusters = (Attribute)eResolveProxy(oldClusters);
			if (clusters != oldClusters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PythonpipelinePackage.CLUSTERING__CLUSTERS, oldClusters, clusters));
			}
		}
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetClusters() {
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusters(Attribute newClusters) {
		Attribute oldClusters = clusters;
		clusters = newClusters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.CLUSTERING__CLUSTERS, oldClusters, clusters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.CLUSTERING__CLUSTERS:
				if (resolve) return getClusters();
				return basicGetClusters();
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
			case PythonpipelinePackage.CLUSTERING__CLUSTERS:
				setClusters((Attribute)newValue);
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
			case PythonpipelinePackage.CLUSTERING__CLUSTERS:
				setClusters((Attribute)null);
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
			case PythonpipelinePackage.CLUSTERING__CLUSTERS:
				return clusters != null;
		}
		return super.eIsSet(featureID);
	}

} //ClusteringImpl
