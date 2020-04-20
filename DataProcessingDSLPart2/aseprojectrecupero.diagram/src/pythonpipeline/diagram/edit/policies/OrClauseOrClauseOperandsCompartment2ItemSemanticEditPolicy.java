/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.AndClause2CreateCommand;
import pythonpipeline.diagram.edit.commands.ContainsClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.EqClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.GeClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.GtClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.LeClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.LtClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.NotClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.OrClauseCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class OrClauseOrClauseOperandsCompartment2ItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OrClauseOrClauseOperandsCompartment2ItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.OrClause_3016);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.AndClause_3005 == req.getElementType()) {
			return getGEFWrapper(new AndClause2CreateCommand(req));
		}
		if (PythonpipelineElementTypes.OrClause_3006 == req.getElementType()) {
			return getGEFWrapper(new OrClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.LtClause_3007 == req.getElementType()) {
			return getGEFWrapper(new LtClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.GtClause_3009 == req.getElementType()) {
			return getGEFWrapper(new GtClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.EqClause_3010 == req.getElementType()) {
			return getGEFWrapper(new EqClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.LeClause_3011 == req.getElementType()) {
			return getGEFWrapper(new LeClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.GeClause_3012 == req.getElementType()) {
			return getGEFWrapper(new GeClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.ContainsClause_3013 == req.getElementType()) {
			return getGEFWrapper(new ContainsClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.NotClause_3014 == req.getElementType()) {
			return getGEFWrapper(new NotClauseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
