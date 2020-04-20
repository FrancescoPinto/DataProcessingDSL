/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class TaskInputSchemaItemSemanticEditPolicy extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TaskInputSchemaItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.TaskInputSchema_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
