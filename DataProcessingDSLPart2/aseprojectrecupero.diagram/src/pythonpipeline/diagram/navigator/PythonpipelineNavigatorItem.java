/*
* 
*/
package pythonpipeline.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PythonpipelineNavigatorItem extends PythonpipelineAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof pythonpipeline.diagram.navigator.PythonpipelineNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((pythonpipeline.diagram.navigator.PythonpipelineNavigatorItem) adaptableObject).getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, pythonpipeline.diagram.navigator.PythonpipelineNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public PythonpipelineNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof pythonpipeline.diagram.navigator.PythonpipelineNavigatorItem) {
			return EcoreUtil.getURI(getView()).equals(
					EcoreUtil.getURI(((pythonpipeline.diagram.navigator.PythonpipelineNavigatorItem) obj).getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
