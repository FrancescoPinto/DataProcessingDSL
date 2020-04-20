/*
* 
*/
package pipelineproject.diagram.navigator;

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

import pipelineproject.diagram.edit.parts.*;
import pipelineproject.diagram.part.Messages;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;

/**
 * @generated
 */
public class PipelineprojectNavigatorContentProvider implements ICommonContentProvider {

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
	public PipelineprojectNavigatorContentProvider() {
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
			ArrayList<PipelineprojectNavigatorItem> result = new ArrayList<PipelineprojectNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, PipelineEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof PipelineprojectNavigatorGroup) {
			PipelineprojectNavigatorGroup group = (PipelineprojectNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PipelineprojectNavigatorItem) {
			PipelineprojectNavigatorItem navigatorItem = (PipelineprojectNavigatorItem) parentElement;
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
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {

		case PipelineEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			PipelineprojectNavigatorGroup links = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Pipeline_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KNNEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(JarvisPatrickEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(VarianceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case AgglomerativeEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Agglomerative_2035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Agglomerative_2035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Ridge_2036_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Ridge_2036_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Lasso_2037_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Lasso_2037_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KNNEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_KNN_2038_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_KNN_2038_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_SVM_2039_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_SVM_2039_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_KMeans_2041_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_KMeans_2041_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DBSCAN_2042_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DBSCAN_2042_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case JarvisPatrickEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_JarvisPatrick_2043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_JarvisPatrick_2043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_LinearRegression_2044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_LinearRegression_2044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Mean_2045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Mean_2045_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Median_2046_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Median_2046_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case VarianceEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Variance_2047_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Variance_2047_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_NullValuesRemoval_2050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_NullValuesRemoval_2050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_CustomCleaning_2051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_CustomCleaning_2051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(CustomParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ChangeDataFormat_2052_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ChangeDataFormat_2052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DataCollection_2053_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DataCollection_2053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DataIntegration_2054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DataIntegration_2054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(JoinAttributesListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Export_2056_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Export_2056_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Schema_2057_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputFileEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_OutputFile_2058_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LogisticRegressionEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_LogisticRegression_2059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_LogisticRegression_2059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Skewness_2060_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Skewness_2060_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_LabeledScatterPlot_2062_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_LabeledScatterPlot_2062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ScatterPlot_2063_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ScatterPlot_2063_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Histogram_2064_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_Histogram_2064_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_PiePlot_2065_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_PiePlot_2065_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ProjectOnAttributes_2066_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ProjectOnAttributes_2066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InputSourceDeclarationEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_InputSourceDeclaration_3038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AndClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AndClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case OrClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LtClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GtClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EqClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LeClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GeClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainsClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case NotClauseEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AndClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case OrClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LtClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GtClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EqClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LeClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GeClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainsClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case NotClause2EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case OrClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LtClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GtClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EqClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LeClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GeClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainsClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineprojectVisualIDRegistry
					.getType(ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case NotClause3EditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineprojectVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PrimaryKeyEditPart.VISUAL_ID: {
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineprojectNavigatorGroup incominglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKey_3069_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup outgoinglinks = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKey_3069_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineprojectNavigatorGroup target = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DataFlow_4007_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup source = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_DataFlow_4007_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KNNEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(JarvisPatrickEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(VarianceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KNNEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(JarvisPatrickEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(VarianceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineprojectNavigatorGroup target = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ExportWrites_4010_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup source = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_ExportWrites_4010_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineprojectNavigatorGroup target = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_InputSourceDeclarationSourceSchema_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineprojectNavigatorGroup source = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_InputSourceDeclarationSourceSchema_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineprojectNavigatorGroup target = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_TaskInputSchema_4015_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup source = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_TaskInputSchema_4015_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KNNEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(JarvisPatrickEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(VarianceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineprojectNavigatorGroup target = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_TaskOutputSchema_4016_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup source = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_TaskOutputSchema_4016_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KNNEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(JarvisPatrickEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(VarianceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
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
			LinkedList<PipelineprojectAbstractNavigatorItem> result = new LinkedList<PipelineprojectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineprojectNavigatorGroup target = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKeyCopies_4017_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineprojectNavigatorGroup source = new PipelineprojectNavigatorGroup(
					Messages.NavigatorGroupName_PrimaryKeyCopies_4017_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineprojectVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
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
		return PipelineEditPart.MODEL_ID.equals(PipelineprojectVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PipelineprojectNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<PipelineprojectNavigatorItem> result = new ArrayList<PipelineprojectNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new PipelineprojectNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<PipelineprojectNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
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
		if (element instanceof PipelineprojectAbstractNavigatorItem) {
			PipelineprojectAbstractNavigatorItem abstractNavigatorItem = (PipelineprojectAbstractNavigatorItem) element;
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
