/**
 */
package pythonpipeline;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agglomerative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Agglomerative#getInterClusterSimilarity <em>Inter Cluster Similarity</em>}</li>
 *   <li>{@link pythonpipeline.Agglomerative#getCutHeight <em>Cut Height</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getAgglomerative()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CutHeightGe1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CutHeightGe1='Tuple {\n\tmessage : String = \'Cut Height >= 1\',\n\tstatus : Boolean = self.CutHeight >= 1\n}.status'"
 * @generated
 */
public interface Agglomerative extends Hierarchical {
	/**
	 * Returns the value of the '<em><b>Inter Cluster Similarity</b></em>' attribute.
	 * The literals are from the enumeration {@link pythonpipeline.InterClusterSimilarity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Cluster Similarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Cluster Similarity</em>' attribute.
	 * @see pythonpipeline.InterClusterSimilarity
	 * @see #setInterClusterSimilarity(InterClusterSimilarity)
	 * @see pythonpipeline.PythonpipelinePackage#getAgglomerative_InterClusterSimilarity()
	 * @model required="true"
	 * @generated
	 */
	InterClusterSimilarity getInterClusterSimilarity();

	/**
	 * Sets the value of the '{@link pythonpipeline.Agglomerative#getInterClusterSimilarity <em>Inter Cluster Similarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Cluster Similarity</em>' attribute.
	 * @see pythonpipeline.InterClusterSimilarity
	 * @see #getInterClusterSimilarity()
	 * @generated
	 */
	void setInterClusterSimilarity(InterClusterSimilarity value);

	/**
	 * Returns the value of the '<em><b>Cut Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Height</em>' attribute.
	 * @see #setCutHeight(BigInteger)
	 * @see pythonpipeline.PythonpipelinePackage#getAgglomerative_CutHeight()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCutHeight();

	/**
	 * Sets the value of the '{@link pythonpipeline.Agglomerative#getCutHeight <em>Cut Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Height</em>' attribute.
	 * @see #getCutHeight()
	 * @generated
	 */
	void setCutHeight(BigInteger value);

} // Agglomerative
