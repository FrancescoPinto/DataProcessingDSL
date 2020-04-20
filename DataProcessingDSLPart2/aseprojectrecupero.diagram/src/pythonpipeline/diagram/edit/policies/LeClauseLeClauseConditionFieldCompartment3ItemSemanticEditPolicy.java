/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.QueryParamCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class LeClauseLeClauseConditionFieldCompartment3ItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LeClauseLeClauseConditionFieldCompartment3ItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.LeClause_3028);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.QueryParam_3008 == req.getElementType()) {
			return getGEFWrapper(new QueryParamCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
