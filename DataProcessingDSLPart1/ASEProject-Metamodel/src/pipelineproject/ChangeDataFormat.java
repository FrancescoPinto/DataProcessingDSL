/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.ChangeDataFormat#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link pipelineproject.ChangeDataFormat#getOutputFormat <em>Output Format</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getChangeDataFormat()
 * @model
 * @generated
 */
public interface ChangeDataFormat extends DataCleaning {
	/**
	 * Returns the value of the '<em><b>Input Format</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #setInputFormat(Format)
	 * @see pipelineproject.PipelineprojectPackage#getChangeDataFormat_InputFormat()
	 * @model required="true"
	 * @generated
	 */
	Format getInputFormat();

	/**
	 * Sets the value of the '{@link pipelineproject.ChangeDataFormat#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #getInputFormat()
	 * @generated
	 */
	void setInputFormat(Format value);

	/**
	 * Returns the value of the '<em><b>Output Format</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #setOutputFormat(Format)
	 * @see pipelineproject.PipelineprojectPackage#getChangeDataFormat_OutputFormat()
	 * @model required="true"
	 * @generated
	 */
	Format getOutputFormat();

	/**
	 * Sets the value of the '{@link pipelineproject.ChangeDataFormat#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #getOutputFormat()
	 * @generated
	 */
	void setOutputFormat(Format value);

} // ChangeDataFormat
