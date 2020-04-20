/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.JoinAttributesListCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class DataIntegrationDataIntegrationJoinAttributesListCompartmentItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataIntegrationDataIntegrationJoinAttributesListCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.DataIntegration_2022);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.JoinAttributesList_3032 == req.getElementType()) {
			return getGEFWrapper(new JoinAttributesListCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
