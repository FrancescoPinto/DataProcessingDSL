/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.AndClause2CreateCommand;
import pipelineproject.diagram.edit.commands.ContainsClauseCreateCommand;
import pipelineproject.diagram.edit.commands.EqClauseCreateCommand;
import pipelineproject.diagram.edit.commands.GeClauseCreateCommand;
import pipelineproject.diagram.edit.commands.GtClauseCreateCommand;
import pipelineproject.diagram.edit.commands.LeClauseCreateCommand;
import pipelineproject.diagram.edit.commands.LtClauseCreateCommand;
import pipelineproject.diagram.edit.commands.NotClauseCreateCommand;
import pipelineproject.diagram.edit.commands.OrClauseCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class OrClauseOrClauseOperandsCompartment3ItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OrClauseOrClauseOperandsCompartment3ItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.OrClause_3059);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.AndClause_3040 == req.getElementType()) {
			return getGEFWrapper(new AndClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.OrClause_3041 == req.getElementType()) {
			return getGEFWrapper(new OrClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.LtClause_3042 == req.getElementType()) {
			return getGEFWrapper(new LtClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.GtClause_3044 == req.getElementType()) {
			return getGEFWrapper(new GtClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.EqClause_3045 == req.getElementType()) {
			return getGEFWrapper(new EqClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.LeClause_3046 == req.getElementType()) {
			return getGEFWrapper(new LeClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.GeClause_3047 == req.getElementType()) {
			return getGEFWrapper(new GeClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.ContainsClause_3048 == req.getElementType()) {
			return getGEFWrapper(new ContainsClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.NotClause_3049 == req.getElementType()) {
			return getGEFWrapper(new NotClauseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
