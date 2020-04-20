/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.InputSourceDeclarationCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class DataCollectionDataCollectionSourceDeclarationCompartmentItemSemanticEditPolicy
		extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataCollectionDataCollectionSourceDeclarationCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.DataCollection_2021);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.InputSourceDeclaration_3003 == req.getElementType()) {
			return getGEFWrapper(new InputSourceDeclarationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
