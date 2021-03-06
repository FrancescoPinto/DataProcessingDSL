/**
 */
package pipelineproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kernel Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipelineproject.PipelineprojectPackage#getKernelFunction()
 * @model
 * @generated
 */
public enum KernelFunction implements Enumerator {
	/**
	 * The '<em><b>Gaussian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAUSSIAN_VALUE
	 * @generated
	 * @ordered
	 */
	GAUSSIAN(0, "Gaussian", "Gaussian"),

	/**
	 * The '<em><b>Polynomial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYNOMIAL_VALUE
	 * @generated
	 * @ordered
	 */
	POLYNOMIAL(0, "Polynomial", "Polynomial"),

	/**
	 * The '<em><b>Tanh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TANH_VALUE
	 * @generated
	 * @ordered
	 */
	TANH(0, "Tanh", "Tanh");

	/**
	 * The '<em><b>Gaussian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaussian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAUSSIAN
	 * @model name="Gaussian"
	 * @generated
	 * @ordered
	 */
	public static final int GAUSSIAN_VALUE = 0;

	/**
	 * The '<em><b>Polynomial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polynomial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYNOMIAL
	 * @model name="Polynomial"
	 * @generated
	 * @ordered
	 */
	public static final int POLYNOMIAL_VALUE = 0;

	/**
	 * The '<em><b>Tanh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tanh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TANH
	 * @model name="Tanh"
	 * @generated
	 * @ordered
	 */
	public static final int TANH_VALUE = 0;

	/**
	 * An array of all the '<em><b>Kernel Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KernelFunction[] VALUES_ARRAY =
		new KernelFunction[] {
			GAUSSIAN,
			POLYNOMIAL,
			TANH,
		};

	/**
	 * A public read-only list of all the '<em><b>Kernel Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KernelFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kernel Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KernelFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KernelFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kernel Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KernelFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KernelFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kernel Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KernelFunction get(int value) {
		switch (value) {
			case GAUSSIAN_VALUE: return GAUSSIAN;
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
	private KernelFunction(int value, String name, String literal) {
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
	
} //KernelFunction
