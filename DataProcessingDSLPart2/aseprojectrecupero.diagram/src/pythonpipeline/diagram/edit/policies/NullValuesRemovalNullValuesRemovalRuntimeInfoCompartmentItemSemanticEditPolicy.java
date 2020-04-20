/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.RuntimeInfoCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.NullValuesRemoval_2014);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.RuntimeInfo_3001 == req.getElementType()) {
			return getGEFWrapper(new RuntimeInfoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
