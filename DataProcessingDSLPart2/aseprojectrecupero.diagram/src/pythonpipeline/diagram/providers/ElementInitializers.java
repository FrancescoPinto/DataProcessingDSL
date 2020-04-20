/*
 * 
 */
package pythonpipeline.diagram.providers;

import pythonpipeline.diagram.part.PythonpipelineDiagramEditorPlugin;

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
		ElementInitializers cached = PythonpipelineDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PythonpipelineDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
