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
public class GeClauseGeClauseConditionFieldCompartment2ItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GeClauseGeClauseConditionFieldCompartment2ItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.GeClause_3056);
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
