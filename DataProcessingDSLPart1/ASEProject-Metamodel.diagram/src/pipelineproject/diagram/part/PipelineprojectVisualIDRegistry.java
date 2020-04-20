/*
* 
*/
package pipelineproject.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import pipelineproject.Pipeline;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PipelineprojectVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ASEProject-Metamodel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PipelineEditPart.MODEL_ID.equals(view.getType())) {
				return PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PipelineprojectDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PipelineprojectPackage.eINSTANCE.getPipeline().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Pipeline) domainElement)) {
			return PipelineEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = pipelineproject.diagram.part.PipelineprojectVisualIDRegistry
				.getModelID(containerView);
		if (!PipelineEditPart.MODEL_ID.equals(containerModelID) && !"pipelineproject".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PipelineEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAgglomerative().isSuperTypeOf(domainElement.eClass())) {
				return AgglomerativeEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getRidge().isSuperTypeOf(domainElement.eClass())) {
				return RidgeEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLasso().isSuperTypeOf(domainElement.eClass())) {
				return LassoEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getKNN().isSuperTypeOf(domainElement.eClass())) {
				return KNNEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getSVM().isSuperTypeOf(domainElement.eClass())) {
				return SVMEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getKMeans().isSuperTypeOf(domainElement.eClass())) {
				return KMeansEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getDBSCAN().isSuperTypeOf(domainElement.eClass())) {
				return DBSCANEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getJarvisPatrick().isSuperTypeOf(domainElement.eClass())) {
				return JarvisPatrickEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLinearRegression().isSuperTypeOf(domainElement.eClass())) {
				return LinearRegressionEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getMean().isSuperTypeOf(domainElement.eClass())) {
				return MeanEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getMedian().isSuperTypeOf(domainElement.eClass())) {
				return MedianEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getVariance().isSuperTypeOf(domainElement.eClass())) {
				return VarianceEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLogisticRegression().isSuperTypeOf(domainElement.eClass())) {
				return LogisticRegressionEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getSkewness().isSuperTypeOf(domainElement.eClass())) {
				return SkewnessEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLabeledScatterPlot().isSuperTypeOf(domainElement.eClass())) {
				return LabeledScatterPlotEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNullValuesRemoval().isSuperTypeOf(domainElement.eClass())) {
				return NullValuesRemovalEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getCustomCleaning().isSuperTypeOf(domainElement.eClass())) {
				return CustomCleaningEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getChangeDataFormat().isSuperTypeOf(domainElement.eClass())) {
				return ChangeDataFormatEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getScatterPlot().isSuperTypeOf(domainElement.eClass())) {
				return ScatterPlotEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getHistogram().isSuperTypeOf(domainElement.eClass())) {
				return HistogramEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getPiePlot().isSuperTypeOf(domainElement.eClass())) {
				return PiePlotEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getProjectOnAttributes().isSuperTypeOf(domainElement.eClass())) {
				return ProjectOnAttributesEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getDataCollection().isSuperTypeOf(domainElement.eClass())) {
				return DataCollectionEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getDataIntegration().isSuperTypeOf(domainElement.eClass())) {
				return DataIntegrationEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getExport().isSuperTypeOf(domainElement.eClass())) {
				return ExportEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getSchema().isSuperTypeOf(domainElement.eClass())) {
				return SchemaEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOutputFile().isSuperTypeOf(domainElement.eClass())) {
				return OutputFileEditPart.VISUAL_ID;
			}
			break;
		case AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getCustomParam().isSuperTypeOf(domainElement.eClass())) {
				return CustomParamEditPart.VISUAL_ID;
			}
			break;
		case ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getInputSourceDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return InputSourceDeclarationEditPart.VISUAL_ID;
			}
			break;
		case InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClause3EditPart.VISUAL_ID;
			}
			break;
		case AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClauseEditPart.VISUAL_ID;
			}
			break;
		case AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClauseEditPart.VISUAL_ID;
			}
			break;
		case OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClauseEditPart.VISUAL_ID;
			}
			break;
		case LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClause2EditPart.VISUAL_ID;
			}
			break;
		case AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClauseEditPart.VISUAL_ID;
			}
			break;
		case OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClauseEditPart.VISUAL_ID;
			}
			break;
		case LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClause2EditPart.VISUAL_ID;
			}
			break;
		case OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClauseEditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClauseEditPart.VISUAL_ID;
			}
			break;
		case LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getQueryParam().isSuperTypeOf(domainElement.eClass())) {
				return QueryParamEditPart.VISUAL_ID;
			}
			break;
		case NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAndClause().isSuperTypeOf(domainElement.eClass())) {
				return AndClause3EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getOrClause().isSuperTypeOf(domainElement.eClass())) {
				return OrClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLtClause().isSuperTypeOf(domainElement.eClass())) {
				return LtClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGtClause().isSuperTypeOf(domainElement.eClass())) {
				return GtClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getEqClause().isSuperTypeOf(domainElement.eClass())) {
				return EqClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getLeClause().isSuperTypeOf(domainElement.eClass())) {
				return LeClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getGeClause().isSuperTypeOf(domainElement.eClass())) {
				return GeClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getContainsClause().isSuperTypeOf(domainElement.eClass())) {
				return ContainsClause2EditPart.VISUAL_ID;
			}
			if (PipelineprojectPackage.eINSTANCE.getNotClause().isSuperTypeOf(domainElement.eClass())) {
				return NotClause2EditPart.VISUAL_ID;
			}
			break;
		case DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getJoinAttributesList().isSuperTypeOf(domainElement.eClass())) {
				return JoinAttributesListEditPart.VISUAL_ID;
			}
			break;
		case ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getRuntimeInfo().isSuperTypeOf(domainElement.eClass())) {
				return RuntimeInfoEditPart.VISUAL_ID;
			}
			break;
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID:
			if (PipelineprojectPackage.eINSTANCE.getPrimaryKey().isSuperTypeOf(domainElement.eClass())) {
				return PrimaryKeyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = pipelineproject.diagram.part.PipelineprojectVisualIDRegistry
				.getModelID(containerView);
		if (!PipelineEditPart.MODEL_ID.equals(containerModelID) && !"pipelineproject".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PipelineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PipelineEditPart.VISUAL_ID:
			if (AgglomerativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RidgeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LassoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KNNEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SVMEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KMeansEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBSCANEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JarvisPatrickEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinearRegressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MeanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MedianEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VarianceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogisticRegressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SkewnessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabeledScatterPlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullValuesRemovalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomCleaningEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChangeDataFormatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScatterPlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistogramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PiePlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProjectOnAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataCollectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataIntegrationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SchemaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgglomerativeEditPart.VISUAL_ID:
			if (AgglomerativeIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RidgeEditPart.VISUAL_ID:
			if (RidgeIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LassoEditPart.VISUAL_ID:
			if (LassoIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KNNEditPart.VISUAL_ID:
			if (KNNIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SVMEditPart.VISUAL_ID:
			if (SVMIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KMeansEditPart.VISUAL_ID:
			if (KMeansIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBSCANEditPart.VISUAL_ID:
			if (DBSCANIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JarvisPatrickEditPart.VISUAL_ID:
			if (JarvisPatrickIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinearRegressionEditPart.VISUAL_ID:
			if (LinearRegressionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MeanEditPart.VISUAL_ID:
			if (MeanIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MedianEditPart.VISUAL_ID:
			if (MedianIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VarianceEditPart.VISUAL_ID:
			if (VarianceIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogisticRegressionEditPart.VISUAL_ID:
			if (LogisticRegressionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SkewnessEditPart.VISUAL_ID:
			if (SkewnessIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabeledScatterPlotEditPart.VISUAL_ID:
			if (LabeledScatterPlotIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullValuesRemovalEditPart.VISUAL_ID:
			if (NullValuesRemovalIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomCleaningEditPart.VISUAL_ID:
			if (CustomCleaningIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChangeDataFormatEditPart.VISUAL_ID:
			if (ChangeDataFormatIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScatterPlotEditPart.VISUAL_ID:
			if (ScatterPlotIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HistogramEditPart.VISUAL_ID:
			if (HistogramIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PiePlotEditPart.VISUAL_ID:
			if (PiePlotIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProjectOnAttributesEditPart.VISUAL_ID:
			if (ProjectOnAttributesIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataCollectionEditPart.VISUAL_ID:
			if (DataCollectionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataIntegrationEditPart.VISUAL_ID:
			if (DataIntegrationIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportEditPart.VISUAL_ID:
			if (ExportIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaEditPart.VISUAL_ID:
			if (SchemaIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputFileEditPart.VISUAL_ID:
			if (OutputFileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuntimeInfoEditPart.VISUAL_ID:
			if (RuntimeInfoExecutionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomParamEditPart.VISUAL_ID:
			if (CustomParamNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputSourceDeclarationEditPart.VISUAL_ID:
			if (InputSourceDeclarationSourceURIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndClauseEditPart.VISUAL_ID:
			if (AndClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndClause2EditPart.VISUAL_ID:
			if (AndClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrClauseEditPart.VISUAL_ID:
			if (OrClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LtClauseEditPart.VISUAL_ID:
			if (LtClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryParamEditPart.VISUAL_ID:
			if (QueryParamNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GtClauseEditPart.VISUAL_ID:
			if (GtClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqClauseEditPart.VISUAL_ID:
			if (EqClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeClauseEditPart.VISUAL_ID:
			if (LeClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeClauseEditPart.VISUAL_ID:
			if (GeClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainsClauseEditPart.VISUAL_ID:
			if (ContainsClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotClauseEditPart.VISUAL_ID:
			if (NotClauseIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndClause3EditPart.VISUAL_ID:
			if (AndClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrClause2EditPart.VISUAL_ID:
			if (OrClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LtClause2EditPart.VISUAL_ID:
			if (LtClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GtClause2EditPart.VISUAL_ID:
			if (GtClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqClause2EditPart.VISUAL_ID:
			if (EqClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeClause2EditPart.VISUAL_ID:
			if (LeClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeClause2EditPart.VISUAL_ID:
			if (GeClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainsClause2EditPart.VISUAL_ID:
			if (ContainsClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotClause2EditPart.VISUAL_ID:
			if (NotClauseId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrClause3EditPart.VISUAL_ID:
			if (OrClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LtClause3EditPart.VISUAL_ID:
			if (LtClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GtClause3EditPart.VISUAL_ID:
			if (GtClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqClause3EditPart.VISUAL_ID:
			if (EqClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeClause3EditPart.VISUAL_ID:
			if (LeClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeClause3EditPart.VISUAL_ID:
			if (GeClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainsClause3EditPart.VISUAL_ID:
			if (ContainsClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotClause3EditPart.VISUAL_ID:
			if (NotClauseId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JoinAttributesListEditPart.VISUAL_ID:
			if (JoinAttributesListIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimaryKeyEditPart.VISUAL_ID:
			if (PrimaryKeyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
			if (CustomParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID:
			if (InputSourceDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID:
			if (AndClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID:
			if (AndClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID:
			if (AndClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID:
			if (AndClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID:
			if (AndClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID:
			if (AndClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID:
			if (AndClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID:
			if (AndClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID:
			if (AndClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClauseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			if (QueryParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID:
			if (AndClause3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LtClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GtClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainsClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotClause2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID:
			if (JoinAttributesListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID:
			if (RuntimeInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID:
			if (PrimaryKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataFlowEditPart.VISUAL_ID:
			if (DataFlowFormatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskInputSchemaEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskOutputSchemaEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportWritesEditPart.VISUAL_ID:
			if (ExportWritesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PipelineprojectPackage.eINSTANCE.getDataFlow().isSuperTypeOf(domainElement.eClass())) {
			return DataFlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Pipeline element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
		case ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID:
		case InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID:
		case AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID:
		case AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID:
		case OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID:
		case LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
		case GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
		case EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID:
		case LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
		case GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
		case ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID:
		case NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID:
		case AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID:
		case OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID:
		case LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
		case GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
		case EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID:
		case LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
		case GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
		case ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID:
		case NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID:
		case OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID:
		case LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
		case GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
		case EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID:
		case LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
		case GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
		case ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID:
		case NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID:
		case DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID:
		case ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID:
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
		case SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PipelineEditPart.VISUAL_ID:
			return false;
		case OutputFileEditPart.VISUAL_ID:
		case RuntimeInfoEditPart.VISUAL_ID:
		case CustomParamEditPart.VISUAL_ID:
		case JoinAttributesListEditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case PrimaryKeyEditPart.VISUAL_ID:
		case QueryParamEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return pipelineproject.diagram.part.PipelineprojectVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
