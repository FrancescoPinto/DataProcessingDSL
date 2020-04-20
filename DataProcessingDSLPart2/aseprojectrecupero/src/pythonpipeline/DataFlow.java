/**
 */
package pythonpipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.DataFlow#getFrom <em>From</em>}</li>
 *   <li>{@link pythonpipeline.DataFlow#getTo <em>To</em>}</li>
 *   <li>{@link pythonpipeline.DataFlow#getFormat <em>Format</em>}</li>
 *   <li>{@link pythonpipeline.DataFlow#getId <em>Id</em>}</li>
 *   <li>{@link pythonpipeline.DataFlow#getTypeOfData <em>Type Of Data</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getDataFlow()
 * @model annotation="gmf.link source='from' target='to' target.decoration='filledclosedarrow' style='solid' label='format' width='4'"
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pythonpipeline.Task#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Task)
	 * @see pythonpipeline.PythonpipelinePackage#getDataFlow_From()
	 * @see pythonpipeline.Task#getOutput
	 * @model opposite="output" required="true"
	 * @generated
	 */
	Task getFrom();

	/**
	 * Sets the value of the '{@link pythonpipeline.DataFlow#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Task value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pythonpipeline.Task#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Task)
	 * @see pythonpipeline.PythonpipelinePackage#getDataFlow_To()
	 * @see pythonpipeline.Task#getInput
	 * @model opposite="input" required="true"
	 * @generated
	 */
	Task getTo();

	/**
	 * Sets the value of the '{@link pythonpipeline.DataFlow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Task value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link pythonpipeline.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see pythonpipeline.Format
	 * @see #setFormat(Format)
	 * @see pythonpipeline.PythonpipelinePackage#getDataFlow_Format()
	 * @model default=""
	 * @generated
	 */
	Format getFormat();

	/**
	 * Sets the value of the '{@link pythonpipeline.DataFlow#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see pythonpipeline.Format
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Format value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pythonpipeline.PythonpipelinePackage#getDataFlow_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pythonpipeline.DataFlow#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type Of Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Data</em>' reference.
	 * @see #setTypeOfData(Schema)
	 * @see pythonpipeline.PythonpipelinePackage#getDataFlow_TypeOfData()
	 * @model
	 * @generated
	 */
	Schema getTypeOfData();

	/**
	 * Sets the value of the '{@link pythonpipeline.DataFlow#getTypeOfData <em>Type Of Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Data</em>' reference.
	 * @see #getTypeOfData()
	 * @generated
	 */
	void setTypeOfData(Schema value);

} // DataFlow
