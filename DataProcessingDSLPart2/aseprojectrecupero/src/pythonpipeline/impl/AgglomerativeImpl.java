/**
 */
package pythonpipeline.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pythonpipeline.Agglomerative;
import pythonpipeline.InterClusterSimilarity;
import pythonpipeline.PythonpipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agglomerative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.impl.AgglomerativeImpl#getInterClusterSimilarity <em>Inter Cluster Similarity</em>}</li>
 *   <li>{@link pythonpipeline.impl.AgglomerativeImpl#getCutHeight <em>Cut Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgglomerativeImpl extends HierarchicalImpl implements Agglomerative {
	/**
	 * The default value of the '{@link #getInterClusterSimilarity() <em>Inter Cluster Similarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterClusterSimilarity()
	 * @generated
	 * @ordered
	 */
	protected static final InterClusterSimilarity INTER_CLUSTER_SIMILARITY_EDEFAULT = InterClusterSimilarity.WD;

	/**
	 * The cached value of the '{@link #getInterClusterSimilarity() <em>Inter Cluster Similarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterClusterSimilarity()
	 * @generated
	 * @ordered
	 */
	protected InterClusterSimilarity interClusterSimilarity = INTER_CLUSTER_SIMILARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutHeight() <em>Cut Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CUT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCutHeight() <em>Cut Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cutHeight = CUT_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgglomerativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonpipelinePackage.Literals.AGGLOMERATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterClusterSimilarity getInterClusterSimilarity() {
		return interClusterSimilarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterClusterSimilarity(InterClusterSimilarity newInterClusterSimilarity) {
		InterClusterSimilarity oldInterClusterSimilarity = interClusterSimilarity;
		interClusterSimilarity = newInterClusterSimilarity == null ? INTER_CLUSTER_SIMILARITY_EDEFAULT : newInterClusterSimilarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY, oldInterClusterSimilarity, interClusterSimilarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCutHeight() {
		return cutHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutHeight(BigInteger newCutHeight) {
		BigInteger oldCutHeight = cutHeight;
		cutHeight = newCutHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonpipelinePackage.AGGLOMERATIVE__CUT_HEIGHT, oldCutHeight, cutHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonpipelinePackage.AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY:
				return getInterClusterSimilarity();
			case PythonpipelinePackage.AGGLOMERATIVE__CUT_HEIGHT:
				return getCutHeight();
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
			case PythonpipelinePackage.AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY:
				setInterClusterSimilarity((InterClusterSimilarity)newValue);
				return;
			case PythonpipelinePackage.AGGLOMERATIVE__CUT_HEIGHT:
				setCutHeight((BigInteger)newValue);
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
			case PythonpipelinePackage.AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY:
				setInterClusterSimilarity(INTER_CLUSTER_SIMILARITY_EDEFAULT);
				return;
			case PythonpipelinePackage.AGGLOMERATIVE__CUT_HEIGHT:
				setCutHeight(CUT_HEIGHT_EDEFAULT);
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
			case PythonpipelinePackage.AGGLOMERATIVE__INTER_CLUSTER_SIMILARITY:
				return interClusterSimilarity != INTER_CLUSTER_SIMILARITY_EDEFAULT;
			case PythonpipelinePackage.AGGLOMERATIVE__CUT_HEIGHT:
				return CUT_HEIGHT_EDEFAULT == null ? cutHeight != null : !CUT_HEIGHT_EDEFAULT.equals(cutHeight);
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
		result.append(" (interClusterSimilarity: ");
		result.append(interClusterSimilarity);
		result.append(", CutHeight: ");
		result.append(cutHeight);
		result.append(')');
		return result.toString();
	}

} //AgglomerativeImpl
