/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.AndClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.ContainsClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.EqClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.GeClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.GtClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.LeClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.LtClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.NotClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.OrClause2CreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class NotClauseNotClauseSubClauseCompartment3ItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NotClauseNotClauseSubClauseCompartment3ItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.NotClause_3031);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.AndClause_3015 == req.getElementType()) {
			return getGEFWrapper(new AndClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.OrClause_3016 == req.getElementType()) {
			return getGEFWrapper(new OrClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.LtClause_3017 == req.getElementType()) {
			return getGEFWrapper(new LtClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.GtClause_3018 == req.getElementType()) {
			return getGEFWrapper(new GtClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.EqClause_3019 == req.getElementType()) {
			return getGEFWrapper(new EqClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.LeClause_3020 == req.getElementType()) {
			return getGEFWrapper(new LeClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.GeClause_3021 == req.getElementType()) {
			return getGEFWrapper(new GeClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.ContainsClause_3022 == req.getElementType()) {
			return getGEFWrapper(new ContainsClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.NotClause_3023 == req.getElementType()) {
			return getGEFWrapper(new NotClause2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
