/*
 * 
 */
package pipelineproject.diagram.providers;

import pipelineproject.diagram.part.PipelineprojectDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = PipelineprojectDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PipelineprojectDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
