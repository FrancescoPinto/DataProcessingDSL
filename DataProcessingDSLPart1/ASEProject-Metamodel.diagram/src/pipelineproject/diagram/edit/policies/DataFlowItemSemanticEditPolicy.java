/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class DataFlowItemSemanticEditPolicy extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataFlowItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.DataFlow_4007);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
