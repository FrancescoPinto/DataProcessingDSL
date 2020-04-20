/*
* 
*/
package pipelineproject.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;

/**
 * @generated
 */
public class PipelineprojectNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7142;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7141;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof PipelineprojectNavigatorItem) {
			PipelineprojectNavigatorItem item = (PipelineprojectNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return PipelineprojectVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
