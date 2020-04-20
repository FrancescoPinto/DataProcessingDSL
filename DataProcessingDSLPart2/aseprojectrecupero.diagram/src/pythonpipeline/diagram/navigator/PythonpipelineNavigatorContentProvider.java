/*
* 
*/
package pythonpipeline.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import pythonpipeline.diagram.edit.parts.*;
import pythonpipeline.diagram.part.Messages;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;

/**
 * @generated
 */
public class PythonpipelineNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public PythonpipelineNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<PythonpipelineNavigatorItem> result = new ArrayList<PythonpipelineNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, PipelineEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof PythonpipelineNavigatorGroup) {
			PythonpipelineNavigatorGroup group = (PythonpipelineNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PythonpipelineNavigatorItem) {
			PythonpipelineNavigatorItem navigatorItem = (PythonpipelineNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {

		case PipelineEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			PythonpipelineNavigatorGroup links = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Pipeline_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(StandardDeviationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case AgglomerativeEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Agglomerative_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Agglomerative_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RidgeEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Ridge_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Ridge_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LassoEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Lasso_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Lasso_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SVMEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_SVM_2004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_SVM_2004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMSVMSupportVectorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(SupportVectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KMeansEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_KMeans_2005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_KMeans_2005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DBSCANEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DBSCAN_2006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DBSCAN_2006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LinearRegressionEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_LinearRegression_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_LinearRegression_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MeanEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Mean_2008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Mean_2008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MedianEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Median_2009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Median_2009_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StandardDeviationEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_StandardDeviation_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_StandardDeviation_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(StandardDeviationStandardDeviationRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LogisticRegressionEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_LogisticRegression_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_LogisticRegression_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SkewnessEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Skewness_2012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Skewness_2012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LabeledScatterPlotEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_LabeledScatterPlot_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_LabeledScatterPlot_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NullValuesRemovalEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_NullValuesRemoval_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_NullValuesRemoval_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CustomCleaningEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_CustomCleaning_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_CustomCleaning_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(CustomParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ChangeDataFormatEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ChangeDataFormat_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ChangeDataFormat_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScatterPlotEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ScatterPlot_2017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ScatterPlot_2017_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HistogramEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Histogram_2018_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Histogram_2018_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PiePlotEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_PiePlot_2019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_PiePlot_2019_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ProjectOnAttributesEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ProjectOnAttributes_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ProjectOnAttributes_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataCollectionEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataCollection_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataCollection_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(InputSourceDeclarationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataIntegrationEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataIntegration_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataIntegration_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(JoinAttributesListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExportEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Export_2023_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Export_2023_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SchemaEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_Schema_2024_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputFileEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_OutputFile_2025_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InputSourceDeclarationEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_InputSourceDeclaration_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AndClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AndClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case OrClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LtClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GtClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EqClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LeClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GeClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainsClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case NotClauseEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AndClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case OrClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LtClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GtClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EqClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LeClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GeClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainsClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case NotClause2EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case OrClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LtClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GtClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EqClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LeClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GeClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainsClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PythonpipelineVisualIDRegistry
					.getType(ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case NotClause3EditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PythonpipelineVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PrimaryKeyEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PythonpipelineNavigatorGroup incominglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKey_3034_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup outgoinglinks = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKey_3034_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataFlowEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PythonpipelineNavigatorGroup target = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlow_4001_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup source = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlow_4001_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(StandardDeviationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(StandardDeviationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TaskInputSchemaEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PythonpipelineNavigatorGroup target = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_TaskInputSchema_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup source = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_TaskInputSchema_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(StandardDeviationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TaskOutputSchemaEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PythonpipelineNavigatorGroup target = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_TaskOutputSchema_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup source = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_TaskOutputSchema_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(StandardDeviationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExportWritesEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PythonpipelineNavigatorGroup target = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportWrites_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup source = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportWrites_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PythonpipelineNavigatorGroup target = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_InputSourceDeclarationSourceSchema_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PythonpipelineNavigatorGroup source = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_InputSourceDeclarationSourceSchema_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(InputSourceDeclarationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PrimaryKeyCopiesEditPart.VISUAL_ID: {
			LinkedList<PythonpipelineAbstractNavigatorItem> result = new LinkedList<PythonpipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PythonpipelineNavigatorGroup target = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKeyCopies_4006_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PythonpipelineNavigatorGroup source = new PythonpipelineNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKeyCopies_4006_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PythonpipelineVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PipelineEditPart.MODEL_ID.equals(PythonpipelineVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PythonpipelineNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<PythonpipelineNavigatorItem> result = new ArrayList<PythonpipelineNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new PythonpipelineNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<PythonpipelineNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof PythonpipelineAbstractNavigatorItem) {
			PythonpipelineAbstractNavigatorItem abstractNavigatorItem = (PythonpipelineAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
