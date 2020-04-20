/*
* 
*/
package pythonpipeline.diagram.edit.policies;

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

import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.diagram.edit.parts.AgglomerativeEditPart;
import pythonpipeline.diagram.edit.parts.AndClause2EditPart;
import pythonpipeline.diagram.edit.parts.AndClause3EditPart;
import pythonpipeline.diagram.edit.parts.AndClauseEditPart;
import pythonpipeline.diagram.edit.parts.AttributeEditPart;
import pythonpipeline.diagram.edit.parts.ChangeDataFormatEditPart;
import pythonpipeline.diagram.edit.parts.ContainsClause2EditPart;
import pythonpipeline.diagram.edit.parts.ContainsClause3EditPart;
import pythonpipeline.diagram.edit.parts.ContainsClauseEditPart;
import pythonpipeline.diagram.edit.parts.CustomCleaningEditPart;
import pythonpipeline.diagram.edit.parts.CustomParamEditPart;
import pythonpipeline.diagram.edit.parts.DBSCANEditPart;
import pythonpipeline.diagram.edit.parts.DataCollectionEditPart;
import pythonpipeline.diagram.edit.parts.DataFlowEditPart;
import pythonpipeline.diagram.edit.parts.DataIntegrationEditPart;
import pythonpipeline.diagram.edit.parts.EqClause2EditPart;
import pythonpipeline.diagram.edit.parts.EqClause3EditPart;
import pythonpipeline.diagram.edit.parts.EqClauseEditPart;
import pythonpipeline.diagram.edit.parts.ExportEditPart;
import pythonpipeline.diagram.edit.parts.GeClause2EditPart;
import pythonpipeline.diagram.edit.parts.GeClause3EditPart;
import pythonpipeline.diagram.edit.parts.GeClauseEditPart;
import pythonpipeline.diagram.edit.parts.GtClause2EditPart;
import pythonpipeline.diagram.edit.parts.GtClause3EditPart;
import pythonpipeline.diagram.edit.parts.GtClauseEditPart;
import pythonpipeline.diagram.edit.parts.HistogramEditPart;
import pythonpipeline.diagram.edit.parts.InputSourceDeclarationEditPart;
import pythonpipeline.diagram.edit.parts.JoinAttributesListEditPart;
import pythonpipeline.diagram.edit.parts.KMeansEditPart;
import pythonpipeline.diagram.edit.parts.LabeledScatterPlotEditPart;
import pythonpipeline.diagram.edit.parts.LassoEditPart;
import pythonpipeline.diagram.edit.parts.LeClause2EditPart;
import pythonpipeline.diagram.edit.parts.LeClause3EditPart;
import pythonpipeline.diagram.edit.parts.LeClauseEditPart;
import pythonpipeline.diagram.edit.parts.LinearRegressionEditPart;
import pythonpipeline.diagram.edit.parts.LogisticRegressionEditPart;
import pythonpipeline.diagram.edit.parts.LtClause2EditPart;
import pythonpipeline.diagram.edit.parts.LtClause3EditPart;
import pythonpipeline.diagram.edit.parts.LtClauseEditPart;
import pythonpipeline.diagram.edit.parts.MeanEditPart;
import pythonpipeline.diagram.edit.parts.MedianEditPart;
import pythonpipeline.diagram.edit.parts.NotClause2EditPart;
import pythonpipeline.diagram.edit.parts.NotClause3EditPart;
import pythonpipeline.diagram.edit.parts.NotClauseEditPart;
import pythonpipeline.diagram.edit.parts.NullValuesRemovalEditPart;
import pythonpipeline.diagram.edit.parts.OrClause2EditPart;
import pythonpipeline.diagram.edit.parts.OrClause3EditPart;
import pythonpipeline.diagram.edit.parts.OrClauseEditPart;
import pythonpipeline.diagram.edit.parts.OutputFileEditPart;
import pythonpipeline.diagram.edit.parts.PiePlotEditPart;
import pythonpipeline.diagram.edit.parts.PipelineEditPart;
import pythonpipeline.diagram.edit.parts.PrimaryKeyEditPart;
import pythonpipeline.diagram.edit.parts.ProjectOnAttributesEditPart;
import pythonpipeline.diagram.edit.parts.QueryParamEditPart;
import pythonpipeline.diagram.edit.parts.RidgeEditPart;
import pythonpipeline.diagram.edit.parts.RuntimeInfoEditPart;
import pythonpipeline.diagram.edit.parts.SVMEditPart;
import pythonpipeline.diagram.edit.parts.ScatterPlotEditPart;
import pythonpipeline.diagram.edit.parts.SchemaEditPart;
import pythonpipeline.diagram.edit.parts.SkewnessEditPart;
import pythonpipeline.diagram.edit.parts.StandardDeviationEditPart;
import pythonpipeline.diagram.edit.parts.SupportVectorEditPart;
import pythonpipeline.diagram.part.PythonpipelineDiagramUpdater;
import pythonpipeline.diagram.part.PythonpipelineLinkDescriptor;
import pythonpipeline.diagram.part.PythonpipelineNodeDescriptor;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;

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
			myFeaturesToSynchronize.add(PythonpipelinePackage.eINSTANCE.getPipeline_Tasks());
			myFeaturesToSynchronize.add(PythonpipelinePackage.eINSTANCE.getPipeline_Schema());
			myFeaturesToSynchronize.add(PythonpipelinePackage.eINSTANCE.getPipeline_OutputFile());
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
		List<PythonpipelineNodeDescriptor> childDescriptors = PythonpipelineDiagramUpdater
				.getPipeline_1000SemanticChildren(viewObject);
		for (PythonpipelineNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	* @generated
	*/
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		if (isShortcut(view)) {
			return PythonpipelineDiagramUpdater.isShortcutOrphaned(view);
		}
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	* @generated
	*/
	private boolean isMyDiagramElement(View view) {
		int visualID = PythonpipelineVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case AgglomerativeEditPart.VISUAL_ID:
		case RidgeEditPart.VISUAL_ID:
		case LassoEditPart.VISUAL_ID:
		case SVMEditPart.VISUAL_ID:
		case KMeansEditPart.VISUAL_ID:
		case DBSCANEditPart.VISUAL_ID:
		case LinearRegressionEditPart.VISUAL_ID:
		case MeanEditPart.VISUAL_ID:
		case MedianEditPart.VISUAL_ID:
		case StandardDeviationEditPart.VISUAL_ID:
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
		List<PythonpipelineNodeDescriptor> childDescriptors = PythonpipelineDiagramUpdater
				.getPipeline_1000SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours and not shortcuts
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isShortcut(v)) {
				if (PythonpipelineDiagramUpdater.isShortcutOrphaned(v)) {
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
		for (Iterator<PythonpipelineNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			PythonpipelineNodeDescriptor next = descriptorsIterator.next();
			String hint = PythonpipelineVisualIDRegistry.getType(next.getVisualID());
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
		for (PythonpipelineNodeDescriptor next : childDescriptors) {
			String hint = PythonpipelineVisualIDRegistry.getType(next.getVisualID());
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
		Collection<PythonpipelineLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = PythonpipelineVisualIDRegistry.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator<PythonpipelineLinkDescriptor> linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				PythonpipelineLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
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
	private Collection<PythonpipelineLinkDescriptor> collectAllLinks(View view, Domain2Notation domain2NotationMap) {
		if (!PipelineEditPart.MODEL_ID.equals(PythonpipelineVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getPipeline_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AgglomerativeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getAgglomerative_2001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case RidgeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getRidge_2002ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LassoEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLasso_2003ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SVMEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getSVM_2004ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case KMeansEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getKMeans_2005ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DBSCANEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getDBSCAN_2006ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LinearRegressionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLinearRegression_2007ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case MeanEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getMean_2008ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case MedianEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getMedian_2009ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case StandardDeviationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getStandardDeviation_2010ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LogisticRegressionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLogisticRegression_2011ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SkewnessEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getSkewness_2012ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LabeledScatterPlotEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLabeledScatterPlot_2013ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NullValuesRemovalEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getNullValuesRemoval_2014ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CustomCleaningEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getCustomCleaning_2015ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ChangeDataFormatEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getChangeDataFormat_2016ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ScatterPlotEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getScatterPlot_2017ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HistogramEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getHistogram_2018ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case PiePlotEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getPiePlot_2019ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ProjectOnAttributesEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getProjectOnAttributes_2020ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DataCollectionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getDataCollection_2021ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DataIntegrationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getDataIntegration_2022ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ExportEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getExport_2023ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SchemaEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getSchema_2024ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OutputFileEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getOutputFile_2025ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case RuntimeInfoEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getRuntimeInfo_3001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SupportVectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getSupportVector_3035ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case CustomParamEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getCustomParam_3002ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case InputSourceDeclarationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getInputSourceDeclaration_3003ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AndClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getAndClause_3004ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AndClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getAndClause_3005ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OrClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getOrClause_3006ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LtClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLtClause_3007ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case QueryParamEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getQueryParam_3008ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GtClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getGtClause_3009ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case EqClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getEqClause_3010ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LeClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLeClause_3011ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GeClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getGeClause_3012ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContainsClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getContainsClause_3013ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NotClauseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getNotClause_3014ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AndClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getAndClause_3015ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OrClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getOrClause_3016ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LtClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLtClause_3017ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GtClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getGtClause_3018ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case EqClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getEqClause_3019ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LeClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLeClause_3020ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GeClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getGeClause_3021ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContainsClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getContainsClause_3022ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NotClause2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getNotClause_3023ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case OrClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getOrClause_3024ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LtClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLtClause_3025ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GtClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getGtClause_3026ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case EqClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getEqClause_3027ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LeClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getLeClause_3028ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case GeClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getGeClause_3029ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ContainsClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getContainsClause_3030ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NotClause3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getNotClause_3031ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case JoinAttributesListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getJoinAttributesList_3032ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case AttributeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getAttribute_3033ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case PrimaryKeyEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getPrimaryKey_3034ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DataFlowEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(PythonpipelineDiagramUpdater.getDataFlow_4001ContainedLinks(view));
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
	private Collection<IAdaptable> createConnections(Collection<PythonpipelineLinkDescriptor> linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (PythonpipelineLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					PythonpipelineVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND, false,
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
				PythonpipelineVisualIDRegistry.getType(hintVisualId));
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
