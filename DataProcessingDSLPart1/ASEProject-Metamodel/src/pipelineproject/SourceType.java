/**
 */
package pipelineproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Source Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipelineproject.PipelineprojectPackage#getSourceType()
 * @model
 * @generated
 */
public enum SourceType implements Enumerator {
	/**
	 * The '<em><b>Io T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_T_VALUE
	 * @generated
	 * @ordered
	 */
	IO_T(0, "IoT", "IoT"),

	/**
	 * The '<em><b>Social Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL_MEDIA(0, "SocialMedia", "SocialMedia"),

	/**
	 * The '<em><b>Web</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(0, "Web", "Web");

	/**
	 * The '<em><b>Io T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Io T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IO_T
	 * @model name="IoT"
	 * @generated
	 * @ordered
	 */
	public static final int IO_T_VALUE = 0;

	/**
	 * The '<em><b>Social Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Social Media</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_MEDIA
	 * @model name="SocialMedia"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_MEDIA_VALUE = 0;

	/**
	 * The '<em><b>Web</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model name="Web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 0;

	/**
	 * An array of all the '<em><b>Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceType[] VALUES_ARRAY =
		new SourceType[] {
			IO_T,
			SOCIAL_MEDIA,
			WEB,
		};

	/**
	 * A public read-only list of all the '<em><b>Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SourceType get(int value) {
		switch (value) {
			case IO_T_VALUE: return IO_T;
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
	private SourceType(int value, String name, String literal) {
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
	
} //SourceType
