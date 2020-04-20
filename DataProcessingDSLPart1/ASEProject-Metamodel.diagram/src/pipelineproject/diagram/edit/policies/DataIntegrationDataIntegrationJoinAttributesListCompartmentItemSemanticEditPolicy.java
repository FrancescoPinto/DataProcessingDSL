/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.JoinAttributesListCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class DataIntegrationDataIntegrationJoinAttributesListCompartmentItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataIntegrationDataIntegrationJoinAttributesListCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.DataIntegration_2054);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.JoinAttributesList_3067 == req.getElementType()) {
			return getGEFWrapper(new JoinAttributesListCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
