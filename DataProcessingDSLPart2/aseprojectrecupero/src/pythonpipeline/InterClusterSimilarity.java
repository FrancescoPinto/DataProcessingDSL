/**
 */
package pythonpipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Inter Cluster Similarity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pythonpipeline.PythonpipelinePackage#getInterClusterSimilarity()
 * @model
 * @generated
 */
public enum InterClusterSimilarity implements Enumerator {
	/**
	 * The '<em><b>WD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WD_VALUE
	 * @generated
	 * @ordered
	 */
	WD(0, "WD", "WD"),

	/**
	 * The '<em><b>CL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CL_VALUE
	 * @generated
	 * @ordered
	 */
	CL(0, "CL", "CL"),

	/**
	 * The '<em><b>GA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GA_VALUE
	 * @generated
	 * @ordered
	 */
	GA(0, "GA", "GA");

	/**
	 * The '<em><b>WD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WD_VALUE = 0;

	/**
	 * The '<em><b>CL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CL_VALUE = 0;

	/**
	 * The '<em><b>GA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GA_VALUE = 0;

	/**
	 * An array of all the '<em><b>Inter Cluster Similarity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterClusterSimilarity[] VALUES_ARRAY =
		new InterClusterSimilarity[] {
			WD,
			CL,
			GA,
		};

	/**
	 * A public read-only list of all the '<em><b>Inter Cluster Similarity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterClusterSimilarity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Inter Cluster Similarity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterClusterSimilarity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterClusterSimilarity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inter Cluster Similarity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterClusterSimilarity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterClusterSimilarity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inter Cluster Similarity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterClusterSimilarity get(int value) {
		switch (value) {
			case WD_VALUE: return WD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InterClusterSimilarity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InterClusterSimilarity
