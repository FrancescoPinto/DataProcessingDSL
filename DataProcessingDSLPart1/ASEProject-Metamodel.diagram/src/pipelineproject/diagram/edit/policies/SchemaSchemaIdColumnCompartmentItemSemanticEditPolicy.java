/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.PrimaryKeyCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class SchemaSchemaIdColumnCompartmentItemSemanticEditPolicy extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SchemaSchemaIdColumnCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.Schema_2057);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.PrimaryKey_3069 == req.getElementType()) {
			return getGEFWrapper(new PrimaryKeyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
