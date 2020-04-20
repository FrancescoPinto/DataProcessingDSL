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
public class LinearRegressionLinearRegressionRuntimeInfoCompartmentItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LinearRegressionLinearRegressionRuntimeInfoCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.LinearRegression_2007);
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
