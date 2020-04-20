/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.AndClauseCreateCommand;
import pythonpipeline.diagram.edit.commands.ContainsClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.EqClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.GeClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.GtClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.LeClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.LtClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.NotClause3CreateCommand;
import pythonpipeline.diagram.edit.commands.OrClause3CreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.InputSourceDeclaration_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.AndClause_3004 == req.getElementType()) {
			return getGEFWrapper(new AndClauseCreateCommand(req));
		}
		if (PythonpipelineElementTypes.OrClause_3024 == req.getElementType()) {
			return getGEFWrapper(new OrClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.LtClause_3025 == req.getElementType()) {
			return getGEFWrapper(new LtClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.GtClause_3026 == req.getElementType()) {
			return getGEFWrapper(new GtClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.EqClause_3027 == req.getElementType()) {
			return getGEFWrapper(new EqClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.LeClause_3028 == req.getElementType()) {
			return getGEFWrapper(new LeClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.GeClause_3029 == req.getElementType()) {
			return getGEFWrapper(new GeClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.ContainsClause_3030 == req.getElementType()) {
			return getGEFWrapper(new ContainsClause3CreateCommand(req));
		}
		if (PythonpipelineElementTypes.NotClause_3031 == req.getElementType()) {
			return getGEFWrapper(new NotClause3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
