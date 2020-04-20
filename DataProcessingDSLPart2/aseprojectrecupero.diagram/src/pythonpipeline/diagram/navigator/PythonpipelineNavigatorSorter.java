/*
* 
*/
package pythonpipeline.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;

/**
 * @generated
 */
public class PythonpipelineNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7059;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7058;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof PythonpipelineNavigatorItem) {
			PythonpipelineNavigatorItem item = (PythonpipelineNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return PythonpipelineVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
