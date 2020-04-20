/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.DataCollection#getSourceDeclaration <em>Source Declaration</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getDataCollection()
 * @model
 * @generated
 */
public interface DataCollection extends Task {
	/**
	 * Returns the value of the '<em><b>Source Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Declaration</em>' containment reference.
	 * @see #setSourceDeclaration(InputSourceDeclaration)
	 * @see pipelineproject.PipelineprojectPackage#getDataCollection_SourceDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputSourceDeclaration getSourceDeclaration();

	/**
	 * Sets the value of the '{@link pipelineproject.DataCollection#getSourceDeclaration <em>Source Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Declaration</em>' containment reference.
	 * @see #getSourceDeclaration()
	 * @generated
	 */
	void setSourceDeclaration(InputSourceDeclaration value);

} // DataCollection
