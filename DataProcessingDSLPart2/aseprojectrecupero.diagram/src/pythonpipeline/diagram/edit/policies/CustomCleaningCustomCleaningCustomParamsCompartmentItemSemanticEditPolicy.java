/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.CustomParamCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class CustomCleaningCustomCleaningCustomParamsCompartmentItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CustomCleaningCustomCleaningCustomParamsCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.CustomCleaning_2015);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.CustomParam_3002 == req.getElementType()) {
			return getGEFWrapper(new CustomParamCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
