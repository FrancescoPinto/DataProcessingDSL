/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.AndClause3CreateCommand;
import pipelineproject.diagram.edit.commands.ContainsClause2CreateCommand;
import pipelineproject.diagram.edit.commands.EqClause2CreateCommand;
import pipelineproject.diagram.edit.commands.GeClause2CreateCommand;
import pipelineproject.diagram.edit.commands.GtClause2CreateCommand;
import pipelineproject.diagram.edit.commands.LeClause2CreateCommand;
import pipelineproject.diagram.edit.commands.LtClause2CreateCommand;
import pipelineproject.diagram.edit.commands.NotClause2CreateCommand;
import pipelineproject.diagram.edit.commands.OrClause2CreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class NotClauseNotClauseSubClauseCompartment3ItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NotClauseNotClauseSubClauseCompartment3ItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.NotClause_3066);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.AndClause_3050 == req.getElementType()) {
			return getGEFWrapper(new AndClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.OrClause_3051 == req.getElementType()) {
			return getGEFWrapper(new OrClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.LtClause_3052 == req.getElementType()) {
			return getGEFWrapper(new LtClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.GtClause_3053 == req.getElementType()) {
			return getGEFWrapper(new GtClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.EqClause_3054 == req.getElementType()) {
			return getGEFWrapper(new EqClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.LeClause_3055 == req.getElementType()) {
			return getGEFWrapper(new LeClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.GeClause_3056 == req.getElementType()) {
			return getGEFWrapper(new GeClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.ContainsClause_3057 == req.getElementType()) {
			return getGEFWrapper(new ContainsClause2CreateCommand(req));
		}
		if (PipelineprojectElementTypes.NotClause_3058 == req.getElementType()) {
			return getGEFWrapper(new NotClause2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
