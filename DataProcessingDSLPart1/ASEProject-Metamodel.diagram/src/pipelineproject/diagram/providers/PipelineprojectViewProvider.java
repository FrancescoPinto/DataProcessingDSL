/*
 * 
 */
package pipelineproject.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import pipelineproject.diagram.edit.parts.*;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;

/**
 * @generated
 */
public class PipelineprojectViewProvider extends AbstractProvider implements IViewProvider {

	/**
	* @generated
	*/
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		    if (op.getViewKind() == Node.class)
		      return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		    if (op.getViewKind() == Edge.class)
		      return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		*/
		return true;
	}

	/**
	* @generated
	*/
	protected boolean provides(CreateDiagramViewOperation op) {
		return PipelineEditPart.MODEL_ID.equals(op.getSemanticHint()) && PipelineprojectVisualIDRegistry
				.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
	}

	/**
	* @generated
	*/
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = PipelineprojectVisualIDRegistry.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!PipelineprojectElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && visualID != PipelineprojectVisualIDRegistry
						.getNodeVisualID(op.getContainerView(), domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!PipelineEditPart.MODEL_ID
						.equals(PipelineprojectVisualIDRegistry.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
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
				case RuntimeInfoEditPart.VISUAL_ID:
				case CustomParamEditPart.VISUAL_ID:
				case InputSourceDeclarationEditPart.VISUAL_ID:
				case AndClauseEditPart.VISUAL_ID:
				case OrClauseEditPart.VISUAL_ID:
				case LtClauseEditPart.VISUAL_ID:
				case QueryParamEditPart.VISUAL_ID:
				case GtClauseEditPart.VISUAL_ID:
				case EqClauseEditPart.VISUAL_ID:
				case LeClauseEditPart.VISUAL_ID:
				case GeClauseEditPart.VISUAL_ID:
				case ContainsClauseEditPart.VISUAL_ID:
				case NotClauseEditPart.VISUAL_ID:
				case JoinAttributesListEditPart.VISUAL_ID:
				case AttributeEditPart.VISUAL_ID:
				case PrimaryKeyEditPart.VISUAL_ID:
				case AndClause2EditPart.VISUAL_ID:
				case AndClause3EditPart.VISUAL_ID:
				case OrClause2EditPart.VISUAL_ID:
				case LtClause2EditPart.VISUAL_ID:
				case GtClause2EditPart.VISUAL_ID:
				case EqClause2EditPart.VISUAL_ID:
				case LeClause2EditPart.VISUAL_ID:
				case GeClause2EditPart.VISUAL_ID:
				case ContainsClause2EditPart.VISUAL_ID:
				case NotClause2EditPart.VISUAL_ID:
				case OrClause3EditPart.VISUAL_ID:
				case LtClause3EditPart.VISUAL_ID:
				case GtClause3EditPart.VISUAL_ID:
				case EqClause3EditPart.VISUAL_ID:
				case LeClause3EditPart.VISUAL_ID:
				case GeClause3EditPart.VISUAL_ID:
				case ContainsClause3EditPart.VISUAL_ID:
				case NotClause3EditPart.VISUAL_ID:
					if (domainElement == null || visualID != PipelineprojectVisualIDRegistry
							.getNodeVisualID(op.getContainerView(), domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return AgglomerativeEditPart.VISUAL_ID == visualID || RidgeEditPart.VISUAL_ID == visualID
				|| LassoEditPart.VISUAL_ID == visualID || KNNEditPart.VISUAL_ID == visualID
				|| SVMEditPart.VISUAL_ID == visualID || KMeansEditPart.VISUAL_ID == visualID
				|| DBSCANEditPart.VISUAL_ID == visualID || JarvisPatrickEditPart.VISUAL_ID == visualID
				|| LinearRegressionEditPart.VISUAL_ID == visualID || MeanEditPart.VISUAL_ID == visualID
				|| MedianEditPart.VISUAL_ID == visualID || VarianceEditPart.VISUAL_ID == visualID
				|| LogisticRegressionEditPart.VISUAL_ID == visualID || SkewnessEditPart.VISUAL_ID == visualID
				|| LabeledScatterPlotEditPart.VISUAL_ID == visualID || NullValuesRemovalEditPart.VISUAL_ID == visualID
				|| CustomCleaningEditPart.VISUAL_ID == visualID || ChangeDataFormatEditPart.VISUAL_ID == visualID
				|| ScatterPlotEditPart.VISUAL_ID == visualID || HistogramEditPart.VISUAL_ID == visualID
				|| PiePlotEditPart.VISUAL_ID == visualID || ProjectOnAttributesEditPart.VISUAL_ID == visualID
				|| DataCollectionEditPart.VISUAL_ID == visualID || DataIntegrationEditPart.VISUAL_ID == visualID
				|| ExportEditPart.VISUAL_ID == visualID || SchemaEditPart.VISUAL_ID == visualID
				|| OutputFileEditPart.VISUAL_ID == visualID || RuntimeInfoEditPart.VISUAL_ID == visualID
				|| CustomParamEditPart.VISUAL_ID == visualID || InputSourceDeclarationEditPart.VISUAL_ID == visualID
				|| AndClauseEditPart.VISUAL_ID == visualID || AndClause2EditPart.VISUAL_ID == visualID
				|| OrClauseEditPart.VISUAL_ID == visualID || LtClauseEditPart.VISUAL_ID == visualID
				|| QueryParamEditPart.VISUAL_ID == visualID || GtClauseEditPart.VISUAL_ID == visualID
				|| EqClauseEditPart.VISUAL_ID == visualID || LeClauseEditPart.VISUAL_ID == visualID
				|| GeClauseEditPart.VISUAL_ID == visualID || ContainsClauseEditPart.VISUAL_ID == visualID
				|| NotClauseEditPart.VISUAL_ID == visualID || AndClause3EditPart.VISUAL_ID == visualID
				|| OrClause2EditPart.VISUAL_ID == visualID || LtClause2EditPart.VISUAL_ID == visualID
				|| GtClause2EditPart.VISUAL_ID == visualID || EqClause2EditPart.VISUAL_ID == visualID
				|| LeClause2EditPart.VISUAL_ID == visualID || GeClause2EditPart.VISUAL_ID == visualID
				|| ContainsClause2EditPart.VISUAL_ID == visualID || NotClause2EditPart.VISUAL_ID == visualID
				|| OrClause3EditPart.VISUAL_ID == visualID || LtClause3EditPart.VISUAL_ID == visualID
				|| GtClause3EditPart.VISUAL_ID == visualID || EqClause3EditPart.VISUAL_ID == visualID
				|| LeClause3EditPart.VISUAL_ID == visualID || GeClause3EditPart.VISUAL_ID == visualID
				|| ContainsClause3EditPart.VISUAL_ID == visualID || NotClause3EditPart.VISUAL_ID == visualID
				|| JoinAttributesListEditPart.VISUAL_ID == visualID || AttributeEditPart.VISUAL_ID == visualID
				|| PrimaryKeyEditPart.VISUAL_ID == visualID;
	}

	/**
	* @generated
	*/
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		if (!PipelineprojectElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = PipelineprojectVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != PipelineprojectVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	* @generated
	*/
	public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(PipelineEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	* @generated
	*/
	public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = PipelineprojectVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case AgglomerativeEditPart.VISUAL_ID:
			return createAgglomerative_2035(domainElement, containerView, index, persisted, preferencesHint);
		case RidgeEditPart.VISUAL_ID:
			return createRidge_2036(domainElement, containerView, index, persisted, preferencesHint);
		case LassoEditPart.VISUAL_ID:
			return createLasso_2037(domainElement, containerView, index, persisted, preferencesHint);
		case KNNEditPart.VISUAL_ID:
			return createKNN_2038(domainElement, containerView, index, persisted, preferencesHint);
		case SVMEditPart.VISUAL_ID:
			return createSVM_2039(domainElement, containerView, index, persisted, preferencesHint);
		case KMeansEditPart.VISUAL_ID:
			return createKMeans_2041(domainElement, containerView, index, persisted, preferencesHint);
		case DBSCANEditPart.VISUAL_ID:
			return createDBSCAN_2042(domainElement, containerView, index, persisted, preferencesHint);
		case JarvisPatrickEditPart.VISUAL_ID:
			return createJarvisPatrick_2043(domainElement, containerView, index, persisted, preferencesHint);
		case LinearRegressionEditPart.VISUAL_ID:
			return createLinearRegression_2044(domainElement, containerView, index, persisted, preferencesHint);
		case MeanEditPart.VISUAL_ID:
			return createMean_2045(domainElement, containerView, index, persisted, preferencesHint);
		case MedianEditPart.VISUAL_ID:
			return createMedian_2046(domainElement, containerView, index, persisted, preferencesHint);
		case VarianceEditPart.VISUAL_ID:
			return createVariance_2047(domainElement, containerView, index, persisted, preferencesHint);
		case LogisticRegressionEditPart.VISUAL_ID:
			return createLogisticRegression_2059(domainElement, containerView, index, persisted, preferencesHint);
		case SkewnessEditPart.VISUAL_ID:
			return createSkewness_2060(domainElement, containerView, index, persisted, preferencesHint);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return createLabeledScatterPlot_2062(domainElement, containerView, index, persisted, preferencesHint);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return createNullValuesRemoval_2050(domainElement, containerView, index, persisted, preferencesHint);
		case CustomCleaningEditPart.VISUAL_ID:
			return createCustomCleaning_2051(domainElement, containerView, index, persisted, preferencesHint);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return createChangeDataFormat_2052(domainElement, containerView, index, persisted, preferencesHint);
		case ScatterPlotEditPart.VISUAL_ID:
			return createScatterPlot_2063(domainElement, containerView, index, persisted, preferencesHint);
		case HistogramEditPart.VISUAL_ID:
			return createHistogram_2064(domainElement, containerView, index, persisted, preferencesHint);
		case PiePlotEditPart.VISUAL_ID:
			return createPiePlot_2065(domainElement, containerView, index, persisted, preferencesHint);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return createProjectOnAttributes_2066(domainElement, containerView, index, persisted, preferencesHint);
		case DataCollectionEditPart.VISUAL_ID:
			return createDataCollection_2053(domainElement, containerView, index, persisted, preferencesHint);
		case DataIntegrationEditPart.VISUAL_ID:
			return createDataIntegration_2054(domainElement, containerView, index, persisted, preferencesHint);
		case ExportEditPart.VISUAL_ID:
			return createExport_2056(domainElement, containerView, index, persisted, preferencesHint);
		case SchemaEditPart.VISUAL_ID:
			return createSchema_2057(domainElement, containerView, index, persisted, preferencesHint);
		case OutputFileEditPart.VISUAL_ID:
			return createOutputFile_2058(domainElement, containerView, index, persisted, preferencesHint);
		case RuntimeInfoEditPart.VISUAL_ID:
			return createRuntimeInfo_3036(domainElement, containerView, index, persisted, preferencesHint);
		case CustomParamEditPart.VISUAL_ID:
			return createCustomParam_3037(domainElement, containerView, index, persisted, preferencesHint);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return createInputSourceDeclaration_3038(domainElement, containerView, index, persisted, preferencesHint);
		case AndClauseEditPart.VISUAL_ID:
			return createAndClause_3039(domainElement, containerView, index, persisted, preferencesHint);
		case AndClause2EditPart.VISUAL_ID:
			return createAndClause_3040(domainElement, containerView, index, persisted, preferencesHint);
		case OrClauseEditPart.VISUAL_ID:
			return createOrClause_3041(domainElement, containerView, index, persisted, preferencesHint);
		case LtClauseEditPart.VISUAL_ID:
			return createLtClause_3042(domainElement, containerView, index, persisted, preferencesHint);
		case QueryParamEditPart.VISUAL_ID:
			return createQueryParam_3070(domainElement, containerView, index, persisted, preferencesHint);
		case GtClauseEditPart.VISUAL_ID:
			return createGtClause_3044(domainElement, containerView, index, persisted, preferencesHint);
		case EqClauseEditPart.VISUAL_ID:
			return createEqClause_3045(domainElement, containerView, index, persisted, preferencesHint);
		case LeClauseEditPart.VISUAL_ID:
			return createLeClause_3046(domainElement, containerView, index, persisted, preferencesHint);
		case GeClauseEditPart.VISUAL_ID:
			return createGeClause_3047(domainElement, containerView, index, persisted, preferencesHint);
		case ContainsClauseEditPart.VISUAL_ID:
			return createContainsClause_3048(domainElement, containerView, index, persisted, preferencesHint);
		case NotClauseEditPart.VISUAL_ID:
			return createNotClause_3049(domainElement, containerView, index, persisted, preferencesHint);
		case AndClause3EditPart.VISUAL_ID:
			return createAndClause_3050(domainElement, containerView, index, persisted, preferencesHint);
		case OrClause2EditPart.VISUAL_ID:
			return createOrClause_3051(domainElement, containerView, index, persisted, preferencesHint);
		case LtClause2EditPart.VISUAL_ID:
			return createLtClause_3052(domainElement, containerView, index, persisted, preferencesHint);
		case GtClause2EditPart.VISUAL_ID:
			return createGtClause_3053(domainElement, containerView, index, persisted, preferencesHint);
		case EqClause2EditPart.VISUAL_ID:
			return createEqClause_3054(domainElement, containerView, index, persisted, preferencesHint);
		case LeClause2EditPart.VISUAL_ID:
			return createLeClause_3055(domainElement, containerView, index, persisted, preferencesHint);
		case GeClause2EditPart.VISUAL_ID:
			return createGeClause_3056(domainElement, containerView, index, persisted, preferencesHint);
		case ContainsClause2EditPart.VISUAL_ID:
			return createContainsClause_3057(domainElement, containerView, index, persisted, preferencesHint);
		case NotClause2EditPart.VISUAL_ID:
			return createNotClause_3058(domainElement, containerView, index, persisted, preferencesHint);
		case OrClause3EditPart.VISUAL_ID:
			return createOrClause_3059(domainElement, containerView, index, persisted, preferencesHint);
		case LtClause3EditPart.VISUAL_ID:
			return createLtClause_3060(domainElement, containerView, index, persisted, preferencesHint);
		case GtClause3EditPart.VISUAL_ID:
			return createGtClause_3061(domainElement, containerView, index, persisted, preferencesHint);
		case EqClause3EditPart.VISUAL_ID:
			return createEqClause_3062(domainElement, containerView, index, persisted, preferencesHint);
		case LeClause3EditPart.VISUAL_ID:
			return createLeClause_3063(domainElement, containerView, index, persisted, preferencesHint);
		case GeClause3EditPart.VISUAL_ID:
			return createGeClause_3064(domainElement, containerView, index, persisted, preferencesHint);
		case ContainsClause3EditPart.VISUAL_ID:
			return createContainsClause_3065(domainElement, containerView, index, persisted, preferencesHint);
		case NotClause3EditPart.VISUAL_ID:
			return createNotClause_3066(domainElement, containerView, index, persisted, preferencesHint);
		case JoinAttributesListEditPart.VISUAL_ID:
			return createJoinAttributesList_3067(domainElement, containerView, index, persisted, preferencesHint);
		case AttributeEditPart.VISUAL_ID:
			return createAttribute_3068(domainElement, containerView, index, persisted, preferencesHint);
		case PrimaryKeyEditPart.VISUAL_ID:
			return createPrimaryKey_3069(domainElement, containerView, index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	* @generated
	*/
	public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (PipelineprojectVisualIDRegistry.getVisualID(elementTypeHint)) {
		case DataFlowEditPart.VISUAL_ID:
			return createDataFlow_4007(getSemanticElement(semanticAdapter), containerView, index, persisted,
					preferencesHint);
		case TaskInputSchemaEditPart.VISUAL_ID:
			return createTaskInputSchema_4015(containerView, index, persisted, preferencesHint);
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return createTaskOutputSchema_4016(containerView, index, persisted, preferencesHint);
		case ExportWritesEditPart.VISUAL_ID:
			return createExportWrites_4010(containerView, index, persisted, preferencesHint);
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return createInputSourceDeclarationSourceSchema_4011(containerView, index, persisted, preferencesHint);
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return createPrimaryKeyCopies_4017(containerView, index, persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	* @generated
	*/
	public Node createAgglomerative_2035(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(AgglomerativeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5125 = createLabel(node, PipelineprojectVisualIDRegistry.getType(AgglomerativeIdEditPart.VISUAL_ID));
		createCompartment(node, PipelineprojectVisualIDRegistry.getType(
				AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID), true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createRidge_2036(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(RidgeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5126 = createLabel(node, PipelineprojectVisualIDRegistry.getType(RidgeIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLasso_2037(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LassoEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5127 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LassoIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createKNN_2038(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(KNNEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5128 = createLabel(node, PipelineprojectVisualIDRegistry.getType(KNNIdEditPart.VISUAL_ID));
		createCompartment(node, PipelineprojectVisualIDRegistry.getType(KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createSVM_2039(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(SVMEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5129 = createLabel(node, PipelineprojectVisualIDRegistry.getType(SVMIdEditPart.VISUAL_ID));
		createCompartment(node, PipelineprojectVisualIDRegistry.getType(SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createKMeans_2041(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(KMeansEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5131 = createLabel(node, PipelineprojectVisualIDRegistry.getType(KMeansIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createDBSCAN_2042(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(DBSCANEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5132 = createLabel(node, PipelineprojectVisualIDRegistry.getType(DBSCANIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createJarvisPatrick_2043(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(JarvisPatrickEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5133 = createLabel(node, PipelineprojectVisualIDRegistry.getType(JarvisPatrickIdEditPart.VISUAL_ID));
		createCompartment(node, PipelineprojectVisualIDRegistry.getType(
				JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID), true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLinearRegression_2044(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LinearRegressionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5134 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(LinearRegressionIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createMean_2045(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(MeanEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5135 = createLabel(node, PipelineprojectVisualIDRegistry.getType(MeanIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID), true, false,
				false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createMedian_2046(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(MedianEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5136 = createLabel(node, PipelineprojectVisualIDRegistry.getType(MedianIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createVariance_2047(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(VarianceEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5137 = createLabel(node, PipelineprojectVisualIDRegistry.getType(VarianceIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLogisticRegression_2059(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LogisticRegressionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5182 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(LogisticRegressionIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createSkewness_2060(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(SkewnessEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5184 = createLabel(node, PipelineprojectVisualIDRegistry.getType(SkewnessIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLabeledScatterPlot_2062(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5186 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createNullValuesRemoval_2050(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(NullValuesRemovalEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5140 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(NullValuesRemovalIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createCustomCleaning_2051(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(CustomCleaningEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5142 = createLabel(node, PipelineprojectVisualIDRegistry.getType(CustomCleaningIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createChangeDataFormat_2052(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ChangeDataFormatEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5143 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(ChangeDataFormatIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createScatterPlot_2063(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ScatterPlotEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5187 = createLabel(node, PipelineprojectVisualIDRegistry.getType(ScatterPlotIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createHistogram_2064(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(HistogramEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5188 = createLabel(node, PipelineprojectVisualIDRegistry.getType(HistogramIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createPiePlot_2065(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(PiePlotEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5189 = createLabel(node, PipelineprojectVisualIDRegistry.getType(PiePlotIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createProjectOnAttributes_2066(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5190 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createDataCollection_2053(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(DataCollectionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5173 = createLabel(node, PipelineprojectVisualIDRegistry.getType(DataCollectionIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createDataIntegration_2054(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(DataIntegrationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5175 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(DataIntegrationIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createExport_2056(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5177 = createLabel(node, PipelineprojectVisualIDRegistry.getType(ExportIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createSchema_2057(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5180 = createLabel(node, PipelineprojectVisualIDRegistry.getType(SchemaIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID), true, false,
				false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createOutputFile_2058(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5181 = createLabel(node, PipelineprojectVisualIDRegistry.getType(OutputFileNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Node createRuntimeInfo_3036(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(RuntimeInfoEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5124 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(RuntimeInfoExecutionIdEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Node createCustomParam_3037(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(CustomParamEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5141 = createLabel(node, PipelineprojectVisualIDRegistry.getType(CustomParamNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Node createInputSourceDeclaration_3038(EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5172 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationSourceURIEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(
						InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createAndClause_3039(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(AndClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5163 = createLabel(node, PipelineprojectVisualIDRegistry.getType(AndClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createAndClause_3040(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(AndClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5162 = createLabel(node, PipelineprojectVisualIDRegistry.getType(AndClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createOrClause_3041(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(OrClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5161 = createLabel(node, PipelineprojectVisualIDRegistry.getType(OrClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLtClause_3042(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LtClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5145 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LtClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createQueryParam_3070(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(QueryParamEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5191 = createLabel(node, PipelineprojectVisualIDRegistry.getType(QueryParamNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Node createGtClause_3044(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(GtClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5146 = createLabel(node, PipelineprojectVisualIDRegistry.getType(GtClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createEqClause_3045(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(EqClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5147 = createLabel(node, PipelineprojectVisualIDRegistry.getType(EqClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLeClause_3046(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LeClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5148 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LeClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createGeClause_3047(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(GeClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5149 = createLabel(node, PipelineprojectVisualIDRegistry.getType(GeClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createContainsClause_3048(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ContainsClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5150 = createLabel(node, PipelineprojectVisualIDRegistry.getType(ContainsClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createNotClause_3049(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(NotClauseEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5160 = createLabel(node, PipelineprojectVisualIDRegistry.getType(NotClauseIdEditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createAndClause_3050(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(AndClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5151 = createLabel(node, PipelineprojectVisualIDRegistry.getType(AndClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createOrClause_3051(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(OrClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5152 = createLabel(node, PipelineprojectVisualIDRegistry.getType(OrClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLtClause_3052(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LtClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5153 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LtClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createGtClause_3053(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(GtClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5154 = createLabel(node, PipelineprojectVisualIDRegistry.getType(GtClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createEqClause_3054(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(EqClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5155 = createLabel(node, PipelineprojectVisualIDRegistry.getType(EqClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLeClause_3055(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LeClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5156 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LeClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createGeClause_3056(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(GeClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5157 = createLabel(node, PipelineprojectVisualIDRegistry.getType(GeClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createContainsClause_3057(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ContainsClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5158 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(ContainsClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createNotClause_3058(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(NotClause2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5159 = createLabel(node, PipelineprojectVisualIDRegistry.getType(NotClauseId2EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createOrClause_3059(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(OrClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5164 = createLabel(node, PipelineprojectVisualIDRegistry.getType(OrClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID), true,
				false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLtClause_3060(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LtClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5165 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LtClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createGtClause_3061(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(GtClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5166 = createLabel(node, PipelineprojectVisualIDRegistry.getType(GtClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createEqClause_3062(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(EqClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5167 = createLabel(node, PipelineprojectVisualIDRegistry.getType(EqClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createLeClause_3063(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(LeClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5168 = createLabel(node, PipelineprojectVisualIDRegistry.getType(LeClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createGeClause_3064(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(GeClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5169 = createLabel(node, PipelineprojectVisualIDRegistry.getType(GeClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createContainsClause_3065(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(ContainsClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5170 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(ContainsClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry
						.getType(ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createNotClause_3066(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(NotClause3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5171 = createLabel(node, PipelineprojectVisualIDRegistry.getType(NotClauseId3EditPart.VISUAL_ID));
		createCompartment(node,
				PipelineprojectVisualIDRegistry.getType(NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	* @generated
	*/
	public Node createJoinAttributesList_3067(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(JoinAttributesListEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5174 = createLabel(node,
				PipelineprojectVisualIDRegistry.getType(JoinAttributesListIdEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Node createAttribute_3068(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5178 = createLabel(node, PipelineprojectVisualIDRegistry.getType(AttributeNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Node createPrimaryKey_3069(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(PipelineprojectVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5183 = createLabel(node, PipelineprojectVisualIDRegistry.getType(PrimaryKeyNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	* @generated
	*/
	public Edge createDataFlow_4007(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(PipelineprojectVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		Node label6007 = createLabel(edge, PipelineprojectVisualIDRegistry.getType(DataFlowFormatEditPart.VISUAL_ID));
		label6007.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6007 = (Location) label6007.getLayoutConstraint();
		location6007.setX(0);
		location6007.setY(40);
		return edge;
	}

	/**
	* @generated
	*/
	public Edge createTaskInputSchema_4015(View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(PipelineprojectVisualIDRegistry.getType(TaskInputSchemaEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		Node label6015 = createLabel(edge, PipelineprojectVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		label6015.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		label6015.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6015 = (Location) label6015.getLayoutConstraint();
		location6015.setX(0);
		location6015.setY(40);
		return edge;
	}

	/**
	* @generated
	*/
	public Edge createTaskOutputSchema_4016(View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(PipelineprojectVisualIDRegistry.getType(TaskOutputSchemaEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		Node label6016 = createLabel(edge, PipelineprojectVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		label6016.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		label6016.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6016 = (Location) label6016.getLayoutConstraint();
		location6016.setX(0);
		location6016.setY(40);
		return edge;
	}

	/**
	* @generated
	*/
	public Edge createExportWrites_4010(View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(PipelineprojectVisualIDRegistry.getType(ExportWritesEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		Node label6010 = createLabel(edge,
				PipelineprojectVisualIDRegistry.getType(ExportWritesExternalLabelEditPart.VISUAL_ID));
		label6010.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		label6010.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6010 = (Location) label6010.getLayoutConstraint();
		location6010.setX(0);
		location6010.setY(40);
		return edge;
	}

	/**
	* @generated
	*/
	public Edge createInputSourceDeclarationSourceSchema_4011(View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		Node label6011 = createLabel(edge, PipelineprojectVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		label6011.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		label6011.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6011 = (Location) label6011.getLayoutConstraint();
		location6011.setX(0);
		location6011.setY(40);
		return edge;
	}

	/**
	* @generated
	*/
	public Edge createPrimaryKeyCopies_4017(View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(PipelineprojectVisualIDRegistry.getType(PrimaryKeyCopiesEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Routing routing = Routing.get(prefStore.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		Node label6017 = createLabel(edge, PipelineprojectVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
		label6017.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		label6017.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6017 = (Location) label6017.getLayoutConstraint();
		location6017.setX(0);
		location6017.setY(40);
		return edge;
	}

	/**
	* @generated
	*/
	private void stampShortcut(View containerView, Node target) {
		if (!PipelineEditPart.MODEL_ID.equals(PipelineprojectVisualIDRegistry.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put("modelID", PipelineEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	* @generated
	*/
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	* @generated
	*/
	private Node createCompartment(View owner, String hint, boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	* @generated
	*/
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
