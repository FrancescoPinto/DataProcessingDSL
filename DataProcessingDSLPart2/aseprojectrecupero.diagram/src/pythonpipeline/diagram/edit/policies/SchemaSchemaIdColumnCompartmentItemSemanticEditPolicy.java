/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pythonpipeline.diagram.edit.commands.PrimaryKeyCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class SchemaSchemaIdColumnCompartmentItemSemanticEditPolicy extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SchemaSchemaIdColumnCompartmentItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.Schema_2024);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.PrimaryKey_3034 == req.getElementType()) {
			return getGEFWrapper(new PrimaryKeyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
