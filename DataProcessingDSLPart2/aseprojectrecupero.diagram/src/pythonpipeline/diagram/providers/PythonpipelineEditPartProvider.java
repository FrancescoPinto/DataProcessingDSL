/*
 * 
 */
package pythonpipeline.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import pythonpipeline.diagram.edit.parts.PipelineEditPart;
import pythonpipeline.diagram.edit.parts.PythonpipelineEditPartFactory;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;

/**
 * @generated
 */
public class PythonpipelineEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PythonpipelineEditPartProvider() {
		super(new PythonpipelineEditPartFactory(), PythonpipelineVisualIDRegistry.TYPED_INSTANCE,
				PipelineEditPart.MODEL_ID);
	}

}
