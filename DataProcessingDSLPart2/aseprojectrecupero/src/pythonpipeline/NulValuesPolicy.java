/**
 */
package pythonpipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nul Values Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pythonpipeline.PythonpipelinePackage#getNulValuesPolicy()
 * @model
 * @generated
 */
public enum NulValuesPolicy implements Enumerator {
	/**
	 * The '<em><b>Drop Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	DROP_RECORD(0, "dropRecord", "dropRecord"),

	/**
	 * The '<em><b>Mean Imputation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_IMPUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN_IMPUTATION(0, "meanImputation", "meanImputation"),

	/**
	 * The '<em><b>Median Imputation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIAN_IMPUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN_IMPUTATION(0, "medianImputation", "medianImputation");

	/**
	 * The '<em><b>Drop Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drop Record</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROP_RECORD
	 * @model name="dropRecord"
	 * @generated
	 * @ordered
	 */
	public static final int DROP_RECORD_VALUE = 0;

	/**
	 * The '<em><b>Mean Imputation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mean Imputation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEAN_IMPUTATION
	 * @model name="meanImputation"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_IMPUTATION_VALUE = 0;

	/**
	 * The '<em><b>Median Imputation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Median Imputation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIAN_IMPUTATION
	 * @model name="medianImputation"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_IMPUTATION_VALUE = 0;

	/**
	 * An array of all the '<em><b>Nul Values Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NulValuesPolicy[] VALUES_ARRAY =
		new NulValuesPolicy[] {
			DROP_RECORD,
			MEAN_IMPUTATION,
			MEDIAN_IMPUTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Nul Values Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NulValuesPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nul Values Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NulValuesPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NulValuesPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nul Values Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NulValuesPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NulValuesPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nul Values Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NulValuesPolicy get(int value) {
		switch (value) {
			case DROP_RECORD_VALUE: return DROP_RECORD;
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
	private NulValuesPolicy(int value, String name, String literal) {
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
	
} //NulValuesPolicy
