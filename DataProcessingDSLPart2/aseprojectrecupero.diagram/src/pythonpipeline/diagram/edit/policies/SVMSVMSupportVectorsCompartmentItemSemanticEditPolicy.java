/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.SupportVectorCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class SVMSVMSupportVectorsCompartmentItemSemanticEditPolicy extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SVMSVMSupportVectorsCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.SVM_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.SupportVector_3035 == req.getElementType()) {
			return getGEFWrapper(new SupportVectorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
