/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class InputSourceDeclarationSourceSchemaItemSemanticEditPolicy
		extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputSourceDeclarationSourceSchemaItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
