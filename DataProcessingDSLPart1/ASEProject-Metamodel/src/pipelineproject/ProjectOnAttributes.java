/**
 */
package pipelineproject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project On Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.ProjectOnAttributes#getProjectionAttributes <em>Projection Attributes</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getProjectOnAttributes()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProjectOnAttributesInInputSchema ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProjectOnAttributesInInputSchema='Tuple {\n\tmessage : String = \'Projection should occur on attributes of input schema\',\n\tstatus : Boolean = \n\t\tself.projectionAttributes->forAll(a|self.inputSchema->first().attributes->includes(a))\n}.status' ProjectOnAttributesShouldBeTheOneAndOnlyOneInOutputSchema='Tuple {\n\tmessage : String = \'Projection attributes should be the one and only one in output schema\',\n\tstatus : Boolean = \n\t\tself.projectionAttributes->forAll(a|self.outputSchema.attributes->exists(a1|a.name=a1.name and a.type = a1.type)) and self.outputSchema.attributes->forAll(a|self.projectionAttributes->exists(a1|a.name=a1.name and a.type = a1.type))\n}.status'"
 * @generated
 */
public interface ProjectOnAttributes extends DataCleaning {
	/**
	 * Returns the value of the '<em><b>Projection Attributes</b></em>' reference list.
	 * The list contents are of type {@link pipelineproject.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Attributes</em>' reference list.
	 * @see pipelineproject.PipelineprojectPackage#getProjectOnAttributes_ProjectionAttributes()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getProjectionAttributes();

} // ProjectOnAttributes
