/**
 */
package pipelineproject;

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
 *   <li>{@link pipelineproject.InputSourceDeclaration#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link pipelineproject.InputSourceDeclaration#getQueryEndpoint <em>Query Endpoint</em>}</li>
 *   <li>{@link pipelineproject.InputSourceDeclaration#getExchangeFormat <em>Exchange Format</em>}</li>
 *   <li>{@link pipelineproject.InputSourceDeclaration#getSourceSchema <em>Source Schema</em>}</li>
 *   <li>{@link pipelineproject.InputSourceDeclaration#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link pipelineproject.InputSourceDeclaration#getQueryConditions <em>Query Conditions</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration()
 * @model annotation="gmf.node label='sourceURI' figure='rectangle'"
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
	 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration_SourceURI()
	 * @model required="true"
	 * @generated
	 */
	String getSourceURI();

	/**
	 * Sets the value of the '{@link pipelineproject.InputSourceDeclaration#getSourceURI <em>Source URI</em>}' attribute.
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
	 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration_QueryEndpoint()
	 * @model
	 * @generated
	 */
	String getQueryEndpoint();

	/**
	 * Sets the value of the '{@link pipelineproject.InputSourceDeclaration#getQueryEndpoint <em>Query Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Endpoint</em>' attribute.
	 * @see #getQueryEndpoint()
	 * @generated
	 */
	void setQueryEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Exchange Format</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #setExchangeFormat(Format)
	 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration_ExchangeFormat()
	 * @model required="true"
	 * @generated
	 */
	Format getExchangeFormat();

	/**
	 * Sets the value of the '{@link pipelineproject.InputSourceDeclaration#getExchangeFormat <em>Exchange Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Format</em>' attribute.
	 * @see pipelineproject.Format
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
	 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration_SourceSchema()
	 * @model annotation="gmf.link target='sourceSchema' style='dot'"
	 * @generated
	 */
	Schema getSourceSchema();

	/**
	 * Sets the value of the '{@link pipelineproject.InputSourceDeclaration#getSourceSchema <em>Source Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Schema</em>' reference.
	 * @see #getSourceSchema()
	 * @generated
	 */
	void setSourceSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.SourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see pipelineproject.SourceType
	 * @see #setSourceType(SourceType)
	 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration_SourceType()
	 * @model required="true"
	 * @generated
	 */
	SourceType getSourceType();

	/**
	 * Sets the value of the '{@link pipelineproject.InputSourceDeclaration#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see pipelineproject.SourceType
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
	 * @see pipelineproject.PipelineprojectPackage#getInputSourceDeclaration_QueryConditions()
	 * @model containment="true"
	 * @generated
	 */
	LogicProposition getQueryConditions();

	/**
	 * Sets the value of the '{@link pipelineproject.InputSourceDeclaration#getQueryConditions <em>Query Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Conditions</em>' containment reference.
	 * @see #getQueryConditions()
	 * @generated
	 */
	void setQueryConditions(LogicProposition value);

} // InputSourceDeclaration
