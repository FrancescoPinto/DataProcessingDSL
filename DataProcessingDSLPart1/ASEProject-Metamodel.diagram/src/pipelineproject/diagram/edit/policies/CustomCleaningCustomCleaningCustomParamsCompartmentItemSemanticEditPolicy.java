/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.CustomParamCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class CustomCleaningCustomCleaningCustomParamsCompartmentItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CustomCleaningCustomCleaningCustomParamsCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.CustomCleaning_2051);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.CustomParam_3037 == req.getElementType()) {
			return getGEFWrapper(new CustomParamCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
