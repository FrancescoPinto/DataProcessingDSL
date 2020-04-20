/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.InputSourceDeclarationCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class DataCollectionDataCollectionSourceDeclarationCompartmentItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataCollectionDataCollectionSourceDeclarationCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.DataCollection_2053);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.InputSourceDeclaration_3038 == req.getElementType()) {
			return getGEFWrapper(new InputSourceDeclarationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
