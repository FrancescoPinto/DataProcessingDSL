/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.AttributeCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class SchemaSchemaAttributesCompartmentItemSemanticEditPolicy extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SchemaSchemaAttributesCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.Schema_2057);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.Attribute_3068 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
