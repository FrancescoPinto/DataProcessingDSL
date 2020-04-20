/*
 * 
 */
package pipelineproject.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import pipelineproject.diagram.edit.parts.PipelineEditPart;
import pipelineproject.diagram.edit.parts.PipelineprojectEditPartFactory;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;

/**
 * @generated
 */
public class PipelineprojectEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PipelineprojectEditPartProvider() {
		super(new PipelineprojectEditPartFactory(), PipelineprojectVisualIDRegistry.TYPED_INSTANCE,
				PipelineEditPart.MODEL_ID);
	}

}
