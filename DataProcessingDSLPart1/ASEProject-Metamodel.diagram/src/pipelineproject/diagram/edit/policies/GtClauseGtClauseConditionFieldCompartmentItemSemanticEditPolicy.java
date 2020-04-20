/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.QueryParamCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class GtClauseGtClauseConditionFieldCompartmentItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GtClauseGtClauseConditionFieldCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.GtClause_3044);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.QueryParam_3070 == req.getElementType()) {
			return getGEFWrapper(new QueryParamCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
