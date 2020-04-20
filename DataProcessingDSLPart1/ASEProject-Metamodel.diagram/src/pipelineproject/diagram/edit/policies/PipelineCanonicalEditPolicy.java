/*
* 
*/
package pipelineproject.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

import pipelineproject.PipelineprojectPackage;
import pipelineproject.diagram.edit.parts.AgglomerativeEditPart;
import pipelineproject.diagram.edit.parts.AndClause2EditPart;
import pipelineproject.diagram.edit.parts.AndClause3EditPart;
import pipelineproject.diagram.edit.parts.AndClauseEditPart;
import pipelineproject.diagram.edit.parts.AttributeEditPart;
import pipelineproject.diagram.edit.parts.ChangeDataFormatEditPart;
import pipelineproject.diagram.edit.parts.ContainsClause2EditPart;
import pipelineproject.diagram.edit.parts.ContainsClause3EditPart;
import pipelineproject.diagram.edit.parts.ContainsClauseEditPart;
import pipelineproject.diagram.edit.parts.CustomCleaningEditPart;
import pipelineproject.diagram.edit.parts.CustomParamEditPart;
import pipelineproject.diagram.edit.parts.DBSCANEditPart;
import pipelineproject.diagram.edit.parts.DataCollectionEditPart;
import pipelineproject.diagram.edit.parts.DataFlowEditPart;
import pipelineproject.diagram.edit.parts.DataIntegrationEditPart;
import pipelineproject.diagram.edit.parts.EqClause2EditPart;
import pipelineproject.diagram.edit.parts.EqClause3EditPart;
import pipelineproject.diagram.edit.parts.EqClauseEditPart;
import pipelineproject.diagram.edit.parts.ExportEditPart;
import pipelineproject.diagram.edit.parts.GeClause2EditPart;
import pipelineproject.diagram.edit.parts.GeClause3EditPart;
import pipelineproject.diagram.edit.parts.GeClauseEditPart;
import pipelineproject.diagram.edit.parts.GtClause2EditPart;
import pipelineproject.diagram.edit.parts.GtClause3EditPart;
import pipelineproject.diagram.edit.parts.GtClauseEditPart;
import pipelineproject.diagram.edit.parts.HistogramEditPart;
import pipelineproject.diagram.edit.parts.InputSourceDeclarationEditPart;
import pipelineproject.diagram.edit.parts.JarvisPatrickEditPart;
import pipelineproject.diagram.edit.parts.JoinAttributesListEditPart;
import pipelineproject.diagram.edit.parts.KMeansEditPart;
import pipelineproject.diagram.edit.parts.KNNEditPart;
import pipelineproject.diagram.edit.parts.LabeledScatterPlotEditPart;
import pipelineproject.diagram.edit.parts.LassoEditPart;
import pipelineproject.diagram.edit.parts.LeClause2EditPart;
import pipelineproject.diagram.edit.parts.LeClause3EditPart;
import pipelineproject.diagram.edit.parts.LeClauseEditPart;
import pipelineproject.diagram.edit.parts.LinearRegressionEditPart;
import pipelineproject.diagram.edit.parts.LogisticRegressionEditPart;
import pipelineproject.diagram.edit.parts.LtClause2EditPart;
import pipelineproject.diagram.edit.parts.LtClause3EditPart;
import pipelineproject.diagram.edit.parts.LtClauseEditPart;
import pipelineproject.diagram.edit.parts.MeanEditPart;
import pipelineproject.diagram.edit.parts.MedianEditPart;
import pipelineproject.diagram.edit.parts.NotClause2EditPart;
import pipelineproject.diagram.edit.parts.NotClause3EditPart;
import pipelineproject.diagram.edit.parts.NotClauseEditPart;
import pipelineproject.diagram.edit.parts.NullValuesRemovalEditPart;
import pipelineproject.diagram.edit.parts.OrClause2EditPart;
import pipelineproject.diagram.edit.parts.OrClause3EditPart;
import pipelineproject.diagram.edit.parts.OrClauseEditPart;
import pipelineproject.diagram.edit.parts.OutputFileEditPart;
import pipelineproject.diagram.edit.parts.PiePlotEditPart;
import pipelineproject.diagram.edit.parts.PipelineEditPart;
import pipelineproject.diagram.edit.parts.PrimaryKeyEditPart;
import pipelineproject.diagram.edit.parts.ProjectOnAttributesEditPart;
import pipelineproject.diagram.edit.parts.QueryParamEditPart;
import pipelineproject.diagram.edit.parts.RidgeEditPart;
import pipelineproject.diagram.edit.parts.RuntimeInfoEditPart;
import pipelineproject.diagram.edit.parts.SVMEditPart;
import pipelineproject.diagram.edit.parts.ScatterPlotEditPart;
import pipelineproject.diagram.edit.parts.SchemaEditPart;
import pipelineproject.diagram.edit.parts.SkewnessEditPart;
import pipelineproject.diagram.edit.parts.VarianceEditPart;
import pipelineproject.diagram.part.PipelineprojectDiagramUpdater;
import pipelineproject.diagram.part.PipelineprojectLinkDescriptor;
import pipelineproject.diagram.part.PipelineprojectNodeDescriptor;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;

/**
 * @generated
 */
public class PipelineCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	* @generated
	*/
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	* @generated
	*/
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	* @generated
	*/
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize.add(PipelineprojectPackage.eINSTANCE.getPipeline_Tasks());
			myFeaturesToSynchronize.add(PipelineprojectPackage.eINSTANCE.getPipeline_Schema());
			myFeaturesToSynchronize.add(PipelineprojectPackage.eINSTANCE.getPipeline_OutputFile());
		}
		return myFeaturesToSynchronize;
	}

	/**
	* @generated
	*/
	@SuppressWarnings("rawtypes")

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<PipelineprojectNodeDescriptor> childDescriptors = PipelineprojectDiagramUpdater
				.getPipeline_1000SemanticChildren(viewObject);
		for (PipelineprojectNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	* @generated
	*/
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		if (isShortcut(view)) {
			return PipelineprojectDiagramUpdater.isShortcutOrphaned(view);
		}
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	* @generated
	*/
	private boolean isMyDiagramElement(View view) {
		int visualID = PipelineprojectVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case AgglomerativeEditPart.VISUAL_ID:
		case RidgeEditPart.VISUAL_ID:
		case LassoEditPart.VISUAL_ID:
		case KNNEditPart.VISUAL_ID:
		case SVMEditPart.VISUAL_ID:
		case KMeansEditPart.VISUAL_ID:
		case DBSCANEditPart.VISUAL_ID:
		case JarvisPatrickEditPart.VISUAL_ID:
		case LinearRegressionEditPart.VISUAL_ID:
		case MeanEditPart.VISUAL_ID:
		case MedianEditPart.VISUAL_ID:
		case VarianceEditPart.VISUAL_ID:
		case LogisticRegressionEditPart.VISUAL_ID:
		case SkewnessEditPart.VISUAL_ID:
		case LabeledScatterPlotEditPart.VISUAL_ID:
		case NullValuesRemovalEditPart.VISUAL_ID:
		case CustomCleaningEditPart.VISUAL_ID:
		case ChangeDataFormatEditPart.VISUAL_ID:
		case ScatterPlotEditPart.VISUAL_ID:
		case HistogramEditPart.VISUAL_ID:
		case PiePlotEditPart.VISUAL_ID:
		case ProjectOnAttributesEditPart.VISUAL_ID:
		case DataCollectionEditPart.VISUAL_ID:
		case DataIntegrationEditPart.VISUAL_ID:
		case ExportEditPart.VISUAL_ID:
		case SchemaEditPart.VISUAL_ID:
		case OutputFileEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected static boolean isShortcut(View view) {
		return view.getEAnnotation("Shortcut") != null; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<PipelineprojectNodeDescriptor> childDescriptors = PipelineprojectDiagramUpdater
				.getPipeline_1000SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours and not shortcuts
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isShortcut(v)) {
				if (PipelineprojectDiagramUpdater.isShortcutOrphaned(v)) {
					orphaned.add(v);
				}
				continue;
			}
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<PipelineprojectNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			PipelineprojectNodeDescriptor next = descriptorsIterator.next();
			String hint = PipelineprojectVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (PipelineprojectNodeDescriptor next : childDescriptors) {
			String hint = PipelineprojectVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	* @generated
	*/
	private Collection<IAdaptable> refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection<PipelineprojectLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = PipelineprojectVisualIDRegistry.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator<PipelineprojectLinkDescriptor> linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				PipelineprojectLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	* @generated
	*/
	private Collection<PipelineprojectLinkDescriptor> collectAllLinks(View view, Domain2Notation domain2NotationMap) {
		if (!PipelineEditPart.MODEL_ID.equals(PipelineprojectVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getPipeline_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AgglomerativeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getAgglomerative_2035ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case RidgeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getRidge_2036ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LassoEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLasso_2037ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case KNNEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getKNN_2038ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SVMEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getSVM_2039ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case KMeansEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getKMeans_2041ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DBSCANEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getDBSCAN_2042ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case JarvisPatrickEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getJarvisPatrick_2043ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LinearRegressionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLinearRegression_2044ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case MeanEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getMean_2045ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case MedianEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getMedian_2046ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case VarianceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getVariance_2047ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LogisticRegressionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLogisticRegression_2059ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SkewnessEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getSkewness_2060ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LabeledScatterPlotEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLabeledScatterPlot_2062ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NullValuesRemovalEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getNullValuesRemoval_2050ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CustomCleaningEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getCustomCleaning_2051ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ChangeDataFormatEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getChangeDataFormat_2052ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ScatterPlotEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getScatterPlot_2063ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HistogramEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getHistogram_2064ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case PiePlotEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getPiePlot_2065ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ProjectOnAttributesEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getProjectOnAttributes_2066ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DataCollectionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getDataCollection_2053ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DataIntegrationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getDataIntegration_2054ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ExportEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getExport_2056ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SchemaEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getSchema_2057ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OutputFileEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getOutputFile_2058ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case RuntimeInfoEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getRuntimeInfo_3036ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CustomParamEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getCustomParam_3037ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case InputSourceDeclarationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getInputSourceDeclaration_3038ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AndClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getAndClause_3039ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AndClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getAndClause_3040ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OrClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getOrClause_3041ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LtClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLtClause_3042ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case QueryParamEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getQueryParam_3070ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GtClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getGtClause_3044ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case EqClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getEqClause_3045ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LeClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLeClause_3046ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GeClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getGeClause_3047ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContainsClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getContainsClause_3048ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NotClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getNotClause_3049ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AndClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getAndClause_3050ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OrClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getOrClause_3051ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LtClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLtClause_3052ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GtClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getGtClause_3053ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case EqClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getEqClause_3054ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LeClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLeClause_3055ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GeClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getGeClause_3056ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContainsClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getContainsClause_3057ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NotClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getNotClause_3058ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OrClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getOrClause_3059ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LtClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLtClause_3060ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GtClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getGtClause_3061ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case EqClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getEqClause_3062ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LeClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getLeClause_3063ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GeClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getGeClause_3064ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContainsClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getContainsClause_3065ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NotClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getNotClause_3066ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case JoinAttributesListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getJoinAttributesList_3067ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AttributeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getAttribute_3068ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case PrimaryKeyEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getPrimaryKey_3069ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DataFlowEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PipelineprojectDiagramUpdater.getDataFlow_4007ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(), domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(), domain2NotationMap));
		}
		return result;
	}

	/**
	* @generated
	*/
	private Collection<IAdaptable> createConnections(Collection<PipelineprojectLinkDescriptor> linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (PipelineprojectLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					PipelineprojectVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	* @generated
	*/
	private EditPart getEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	* @generated
	*/
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	* @generated
	*/
	private EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	/**
	* @generated
	*/
	private EditPart getTargetEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	/**
	* @generated
	*/
	protected final EditPart getHintedEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap,
			int hintVisualId) {
		View view = (View) domain2NotationMap.getHinted(domainModelElement,
				PipelineprojectVisualIDRegistry.getType(hintVisualId));
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	* @generated
	*/
	@SuppressWarnings("serial")
	protected static class Domain2Notation extends HashMap<EObject, View> {
		/**
		* @generated
		*/
		public boolean containsDomainElement(EObject domainElement) {
			return this.containsKey(domainElement);
		}

		/**
		* @generated
		*/
		public View getHinted(EObject domainEObject, String hint) {
			return this.get(domainEObject);
		}

		/**
		* @generated
		*/
		public void putView(EObject domainElement, View view) {
			if (!containsKey(view.getElement()) || !isShortcut(view)) {
				this.put(domainElement, view);
			}
		}

	}
}
