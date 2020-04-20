/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.RuntimeInfoCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class SkewnessSkewnessRuntimeInfoCompartmentItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SkewnessSkewnessRuntimeInfoCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.Skewness_2060);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.RuntimeInfo_3036 == req.getElementType()) {
			return getGEFWrapper(new RuntimeInfoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
