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
public class PrimaryKeyCopiesItemSemanticEditPolicy extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PrimaryKeyCopiesItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.PrimaryKeyCopies_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
