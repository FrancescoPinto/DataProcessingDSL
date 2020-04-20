/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.AttributeCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class SchemaSchemaAttributesCompartmentItemSemanticEditPolicy extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SchemaSchemaAttributesCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.Schema_2024);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.Attribute_3033 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
