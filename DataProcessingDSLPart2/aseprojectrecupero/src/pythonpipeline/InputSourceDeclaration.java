/**
 */
package pythonpipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Source Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getQueryEndpoint <em>Query Endpoint</em>}</li>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getExchangeFormat <em>Exchange Format</em>}</li>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getSourceSchema <em>Source Schema</em>}</li>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getQueryConditions <em>Query Conditions</em>}</li>
 *   <li>{@link pythonpipeline.InputSourceDeclaration#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration()
 * @model annotation="gmf.node label='sourceURI' figure='rectangle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InputShouldNotCopy InputSOurceIDMustBeSpecified'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InputShouldNotCopy='Tuple {\n\tmessage : String = \'input source schema should not be copying\',\n\tstatus : Boolean = \n\t\tself.sourceSchema.idColumn.copies.oclIsUndefined() and self.sourceSchema.attributes.copies->forAll(a|a.oclIsUndefined())\n}.status' InputSOurceIDMustBeSpecified='Tuple {\n\tmessage : String = \'input source id should be specified\',\n\tstatus : Boolean = \n\t\tself.id <> \'\' or self.id.size() > 0\n}.status'"
 * @generated
 */
public interface InputSourceDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source URI</em>' attribute.
	 * @see #setSourceURI(String)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_SourceURI()
	 * @model required="true"
	 * @generated
	 */
	String getSourceURI();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getSourceURI <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source URI</em>' attribute.
	 * @see #getSourceURI()
	 * @generated
	 */
	void setSourceURI(String value);

	/**
	 * Returns the value of the '<em><b>Query Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Endpoint</em>' attribute.
	 * @see #setQueryEndpoint(String)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_QueryEndpoint()
	 * @model
	 * @generated
	 */
	String getQueryEndpoint();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getQueryEndpoint <em>Query Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Endpoint</em>' attribute.
	 * @see #getQueryEndpoint()
	 * @generated
	 */
	void setQueryEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Format</b></em>' attribute.
	 * The literals are from the enumeration {@link pythonpipeline.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Format</em>' attribute.
	 * @see pythonpipeline.Format
	 * @see #setExchangeFormat(Format)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_ExchangeFormat()
	 * @model required="true"
	 * @generated
	 */
	Format getExchangeFormat();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getExchangeFormat <em>Exchange Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Format</em>' attribute.
	 * @see pythonpipeline.Format
	 * @see #getExchangeFormat()
	 * @generated
	 */
	void setExchangeFormat(Format value);

	/**
	 * Returns the value of the '<em><b>Source Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Schema</em>' reference.
	 * @see #setSourceSchema(Schema)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_SourceSchema()
	 * @model required="true"
	 *        annotation="gmf.link target='sourceSchema' style='dot'"
	 * @generated
	 */
	Schema getSourceSchema();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getSourceSchema <em>Source Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Schema</em>' reference.
	 * @see #getSourceSchema()
	 * @generated
	 */
	void setSourceSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pythonpipeline.SourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see pythonpipeline.SourceType
	 * @see #setSourceType(SourceType)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_SourceType()
	 * @model required="true"
	 * @generated
	 */
	SourceType getSourceType();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see pythonpipeline.SourceType
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(SourceType value);

	/**
	 * Returns the value of the '<em><b>Query Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Conditions</em>' containment reference.
	 * @see #setQueryConditions(LogicProposition)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_QueryConditions()
	 * @model containment="true"
	 * @generated
	 */
	LogicProposition getQueryConditions();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getQueryConditions <em>Query Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Conditions</em>' containment reference.
	 * @see #getQueryConditions()
	 * @generated
	 */
	void setQueryConditions(LogicProposition value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pythonpipeline.PythonpipelinePackage#getInputSourceDeclaration_Id()
	 * @model default="" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pythonpipeline.InputSourceDeclaration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // InputSourceDeclaration
