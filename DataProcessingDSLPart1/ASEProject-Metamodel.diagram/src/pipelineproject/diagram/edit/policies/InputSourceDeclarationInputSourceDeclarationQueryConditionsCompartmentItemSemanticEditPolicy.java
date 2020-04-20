/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipelineproject.diagram.edit.commands.AndClauseCreateCommand;
import pipelineproject.diagram.edit.commands.ContainsClause3CreateCommand;
import pipelineproject.diagram.edit.commands.EqClause3CreateCommand;
import pipelineproject.diagram.edit.commands.GeClause3CreateCommand;
import pipelineproject.diagram.edit.commands.GtClause3CreateCommand;
import pipelineproject.diagram.edit.commands.LeClause3CreateCommand;
import pipelineproject.diagram.edit.commands.LtClause3CreateCommand;
import pipelineproject.diagram.edit.commands.NotClause3CreateCommand;
import pipelineproject.diagram.edit.commands.OrClause3CreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.InputSourceDeclaration_3038);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.AndClause_3039 == req.getElementType()) {
			return getGEFWrapper(new AndClauseCreateCommand(req));
		}
		if (PipelineprojectElementTypes.OrClause_3059 == req.getElementType()) {
			return getGEFWrapper(new OrClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.LtClause_3060 == req.getElementType()) {
			return getGEFWrapper(new LtClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.GtClause_3061 == req.getElementType()) {
			return getGEFWrapper(new GtClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.EqClause_3062 == req.getElementType()) {
			return getGEFWrapper(new EqClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.LeClause_3063 == req.getElementType()) {
			return getGEFWrapper(new LeClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.GeClause_3064 == req.getElementType()) {
			return getGEFWrapper(new GeClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.ContainsClause_3065 == req.getElementType()) {
			return getGEFWrapper(new ContainsClause3CreateCommand(req));
		}
		if (PipelineprojectElementTypes.NotClause_3066 == req.getElementType()) {
			return getGEFWrapper(new NotClause3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
