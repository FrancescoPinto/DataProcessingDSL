/*
* 
*/
package pipelineproject.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import pipelineproject.Agglomerative;
import pipelineproject.AndClause;
import pipelineproject.Attribute;
import pipelineproject.ChangeDataFormat;
import pipelineproject.ContainsClause;
import pipelineproject.CustomCleaning;
import pipelineproject.CustomParam;
import pipelineproject.DataCollection;
import pipelineproject.DataFlow;
import pipelineproject.DataIntegration;
import pipelineproject.EqClause;
import pipelineproject.Export;
import pipelineproject.GeClause;
import pipelineproject.GtClause;
import pipelineproject.Histogram;
import pipelineproject.InputSourceDeclaration;
import pipelineproject.JarvisPatrick;
import pipelineproject.JoinAttributesList;
import pipelineproject.KMeans;
import pipelineproject.LabeledScatterPlot;
import pipelineproject.Lasso;
import pipelineproject.LeClause;
import pipelineproject.LinearRegression;
import pipelineproject.LogicProposition;
import pipelineproject.LogisticRegression;
import pipelineproject.LtClause;
import pipelineproject.Mean;
import pipelineproject.Median;
import pipelineproject.NotClause;
import pipelineproject.NullValuesRemoval;
import pipelineproject.OrClause;
import pipelineproject.OutputFile;
import pipelineproject.PiePlot;
import pipelineproject.Pipeline;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.PrimaryKey;
import pipelineproject.ProjectOnAttributes;
import pipelineproject.QueryParam;
import pipelineproject.Ridge;
import pipelineproject.RuntimeInfo;
import pipelineproject.ScatterPlot;
import pipelineproject.Schema;
import pipelineproject.Skewness;
import pipelineproject.Task;
import pipelineproject.Variance;
import pipelineproject.diagram.edit.parts.*;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class PipelineprojectDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getSemanticChildren(View view) {
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000SemanticChildren(view);
		case AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getAgglomerativeAgglomerativeRuntimeInfoCompartment_7077SemanticChildren(view);
		case RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getRidgeRidgeRuntimeInfoCompartment_7078SemanticChildren(view);
		case LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLassoLassoRuntimeInfoCompartment_7079SemanticChildren(view);
		case KNNKNNRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getKNNKNNRuntimeInfoCompartment_7080SemanticChildren(view);
		case SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getSVMSVMRuntimeInfoCompartment_7081SemanticChildren(view);
		case KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getKMeansKMeansRuntimeInfoCompartment_7083SemanticChildren(view);
		case DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getDBSCANDBSCANRuntimeInfoCompartment_7084SemanticChildren(view);
		case JarvisPatrickJarvisPatrickRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getJarvisPatrickJarvisPatrickRuntimeInfoCompartment_7085SemanticChildren(view);
		case LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLinearRegressionLinearRegressionRuntimeInfoCompartment_7086SemanticChildren(view);
		case MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getMeanMeanRuntimeInfoCompartment_7087SemanticChildren(view);
		case MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getMedianMedianRuntimeInfoCompartment_7088SemanticChildren(view);
		case VarianceVarianceRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getVarianceVarianceRuntimeInfoCompartment_7089SemanticChildren(view);
		case LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLogisticRegressionLogisticRegressionRuntimeInfoCompartment_7132SemanticChildren(view);
		case SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getSkewnessSkewnessRuntimeInfoCompartment_7134SemanticChildren(view);
		case LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartment_7136SemanticChildren(view);
		case NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getNullValuesRemovalNullValuesRemovalRuntimeInfoCompartment_7092SemanticChildren(view);
		case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getCustomCleaningCustomCleaningRuntimeInfoCompartment_7093SemanticChildren(view);
		case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
			return getCustomCleaningCustomCleaningCustomParamsCompartment_7094SemanticChildren(view);
		case ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getChangeDataFormatChangeDataFormatRuntimeInfoCompartment_7095SemanticChildren(view);
		case ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getScatterPlotScatterPlotRuntimeInfoCompartment_7137SemanticChildren(view);
		case HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getHistogramHistogramRuntimeInfoCompartment_7138SemanticChildren(view);
		case PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getPiePlotPiePlotRuntimeInfoCompartment_7139SemanticChildren(view);
		case ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getProjectOnAttributesProjectOnAttributesRuntimeInfoCompartment_7140SemanticChildren(view);
		case DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getDataCollectionDataCollectionRuntimeInfoCompartment_7096SemanticChildren(view);
		case DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID:
			return getDataCollectionDataCollectionSourceDeclarationCompartment_7097SemanticChildren(view);
		case InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID:
			return getInputSourceDeclarationInputSourceDeclarationQueryConditionsCompartment_7098SemanticChildren(view);
		case AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID:
			return getAndClauseAndClauseOperandsCompartment_7099SemanticChildren(view);
		case AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID:
			return getAndClauseAndClauseOperandsCompartment_7100SemanticChildren(view);
		case OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID:
			return getOrClauseOrClauseOperandsCompartment_7101SemanticChildren(view);
		case LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getLtClauseLtClauseConditionFieldCompartment_7102SemanticChildren(view);
		case GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getGtClauseGtClauseConditionFieldCompartment_7103SemanticChildren(view);
		case EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getEqClauseEqClauseConditionFieldCompartment_7104SemanticChildren(view);
		case LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getLeClauseLeClauseConditionFieldCompartment_7105SemanticChildren(view);
		case GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getGeClauseGeClauseConditionFieldCompartment_7106SemanticChildren(view);
		case ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getContainsClauseContainsClauseConditionFieldCompartment_7107SemanticChildren(view);
		case NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID:
			return getNotClauseNotClauseSubClauseCompartment_7108SemanticChildren(view);
		case AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID:
			return getAndClauseAndClauseOperandsCompartment_7109SemanticChildren(view);
		case OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID:
			return getOrClauseOrClauseOperandsCompartment_7110SemanticChildren(view);
		case LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getLtClauseLtClauseConditionFieldCompartment_7111SemanticChildren(view);
		case GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getGtClauseGtClauseConditionFieldCompartment_7112SemanticChildren(view);
		case EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getEqClauseEqClauseConditionFieldCompartment_7113SemanticChildren(view);
		case LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getLeClauseLeClauseConditionFieldCompartment_7114SemanticChildren(view);
		case GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getGeClauseGeClauseConditionFieldCompartment_7115SemanticChildren(view);
		case ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getContainsClauseContainsClauseConditionFieldCompartment_7116SemanticChildren(view);
		case NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID:
			return getNotClauseNotClauseSubClauseCompartment_7117SemanticChildren(view);
		case OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID:
			return getOrClauseOrClauseOperandsCompartment_7118SemanticChildren(view);
		case LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getLtClauseLtClauseConditionFieldCompartment_7119SemanticChildren(view);
		case GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getGtClauseGtClauseConditionFieldCompartment_7120SemanticChildren(view);
		case EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getEqClauseEqClauseConditionFieldCompartment_7121SemanticChildren(view);
		case LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getLeClauseLeClauseConditionFieldCompartment_7122SemanticChildren(view);
		case GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getGeClauseGeClauseConditionFieldCompartment_7123SemanticChildren(view);
		case ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getContainsClauseContainsClauseConditionFieldCompartment_7124SemanticChildren(view);
		case NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID:
			return getNotClauseNotClauseSubClauseCompartment_7125SemanticChildren(view);
		case DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getDataIntegrationDataIntegrationRuntimeInfoCompartment_7126SemanticChildren(view);
		case DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID:
			return getDataIntegrationDataIntegrationJoinAttributesListCompartment_7127SemanticChildren(view);
		case ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getExportExportRuntimeInfoCompartment_7129SemanticChildren(view);
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			return getSchemaSchemaAttributesCompartment_7130SemanticChildren(view);
		case SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID:
			return getSchemaSchemaIdColumnCompartment_7133SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getPipeline_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AgglomerativeEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RidgeEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LassoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == KNNEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SVMEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == KMeansEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBSCANEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JarvisPatrickEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LinearRegressionEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MeanEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MedianEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == VarianceEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogisticRegressionEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SkewnessEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabeledScatterPlotEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullValuesRemovalEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomCleaningEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChangeDataFormatEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScatterPlotEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HistogramEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PiePlotEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProjectOnAttributesEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataCollectionEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataIntegrationEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExportEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSchema().iterator(); it.hasNext();) {
			Schema childElement = (Schema) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SchemaEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputFile().iterator(); it.hasNext();) {
			OutputFile childElement = (OutputFile) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputFileEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getAgglomerativeAgglomerativeRuntimeInfoCompartment_7077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Agglomerative modelElement = (Agglomerative) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getRidgeRidgeRuntimeInfoCompartment_7078SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ridge modelElement = (Ridge) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLassoLassoRuntimeInfoCompartment_7079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Lasso modelElement = (Lasso) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getKNNKNNRuntimeInfoCompartment_7080SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		pipelineproject.KNN modelElement = (pipelineproject.KNN) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getSVMSVMRuntimeInfoCompartment_7081SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		pipelineproject.SVM modelElement = (pipelineproject.SVM) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getKMeansKMeansRuntimeInfoCompartment_7083SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KMeans modelElement = (KMeans) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getDBSCANDBSCANRuntimeInfoCompartment_7084SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		pipelineproject.DBSCAN modelElement = (pipelineproject.DBSCAN) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getJarvisPatrickJarvisPatrickRuntimeInfoCompartment_7085SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		JarvisPatrick modelElement = (JarvisPatrick) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLinearRegressionLinearRegressionRuntimeInfoCompartment_7086SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LinearRegression modelElement = (LinearRegression) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getMeanMeanRuntimeInfoCompartment_7087SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Mean modelElement = (Mean) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getMedianMedianRuntimeInfoCompartment_7088SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Median modelElement = (Median) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getVarianceVarianceRuntimeInfoCompartment_7089SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Variance modelElement = (Variance) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLogisticRegressionLogisticRegressionRuntimeInfoCompartment_7132SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LogisticRegression modelElement = (LogisticRegression) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getSkewnessSkewnessRuntimeInfoCompartment_7134SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Skewness modelElement = (Skewness) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartment_7136SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LabeledScatterPlot modelElement = (LabeledScatterPlot) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getNullValuesRemovalNullValuesRemovalRuntimeInfoCompartment_7092SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NullValuesRemoval modelElement = (NullValuesRemoval) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getCustomCleaningCustomCleaningRuntimeInfoCompartment_7093SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CustomCleaning modelElement = (CustomCleaning) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getCustomCleaningCustomCleaningCustomParamsCompartment_7094SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CustomCleaning modelElement = (CustomCleaning) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCustomParams().iterator(); it.hasNext();) {
			CustomParam childElement = (CustomParam) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CustomParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getChangeDataFormatChangeDataFormatRuntimeInfoCompartment_7095SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ChangeDataFormat modelElement = (ChangeDataFormat) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getScatterPlotScatterPlotRuntimeInfoCompartment_7137SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScatterPlot modelElement = (ScatterPlot) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getHistogramHistogramRuntimeInfoCompartment_7138SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Histogram modelElement = (Histogram) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getPiePlotPiePlotRuntimeInfoCompartment_7139SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PiePlot modelElement = (PiePlot) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getProjectOnAttributesProjectOnAttributesRuntimeInfoCompartment_7140SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProjectOnAttributes modelElement = (ProjectOnAttributes) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getDataCollectionDataCollectionRuntimeInfoCompartment_7096SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataCollection modelElement = (DataCollection) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getDataCollectionDataCollectionSourceDeclarationCompartment_7097SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataCollection modelElement = (DataCollection) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			InputSourceDeclaration childElement = modelElement.getSourceDeclaration();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputSourceDeclarationEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getInputSourceDeclarationInputSourceDeclarationQueryConditionsCompartment_7098SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputSourceDeclaration modelElement = (InputSourceDeclaration) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getQueryConditions();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getAndClauseAndClauseOperandsCompartment_7099SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndClause modelElement = (AndClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getAndClauseAndClauseOperandsCompartment_7100SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndClause modelElement = (AndClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getOrClauseOrClauseOperandsCompartment_7101SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrClause modelElement = (OrClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLtClauseLtClauseConditionFieldCompartment_7102SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LtClause modelElement = (LtClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getGtClauseGtClauseConditionFieldCompartment_7103SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GtClause modelElement = (GtClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getEqClauseEqClauseConditionFieldCompartment_7104SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EqClause modelElement = (EqClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLeClauseLeClauseConditionFieldCompartment_7105SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LeClause modelElement = (LeClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getGeClauseGeClauseConditionFieldCompartment_7106SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GeClause modelElement = (GeClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getContainsClauseContainsClauseConditionFieldCompartment_7107SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContainsClause modelElement = (ContainsClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getNotClauseNotClauseSubClauseCompartment_7108SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NotClause modelElement = (NotClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getSubClause();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getAndClauseAndClauseOperandsCompartment_7109SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndClause modelElement = (AndClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getOrClauseOrClauseOperandsCompartment_7110SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrClause modelElement = (OrClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLtClauseLtClauseConditionFieldCompartment_7111SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LtClause modelElement = (LtClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getGtClauseGtClauseConditionFieldCompartment_7112SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GtClause modelElement = (GtClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getEqClauseEqClauseConditionFieldCompartment_7113SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EqClause modelElement = (EqClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLeClauseLeClauseConditionFieldCompartment_7114SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LeClause modelElement = (LeClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getGeClauseGeClauseConditionFieldCompartment_7115SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GeClause modelElement = (GeClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getContainsClauseContainsClauseConditionFieldCompartment_7116SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContainsClause modelElement = (ContainsClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getNotClauseNotClauseSubClauseCompartment_7117SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NotClause modelElement = (NotClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getSubClause();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getOrClauseOrClauseOperandsCompartment_7118SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrClause modelElement = (OrClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLtClauseLtClauseConditionFieldCompartment_7119SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LtClause modelElement = (LtClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getGtClauseGtClauseConditionFieldCompartment_7120SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GtClause modelElement = (GtClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getEqClauseEqClauseConditionFieldCompartment_7121SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EqClause modelElement = (EqClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getLeClauseLeClauseConditionFieldCompartment_7122SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LeClause modelElement = (LeClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getGeClauseGeClauseConditionFieldCompartment_7123SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GeClause modelElement = (GeClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getContainsClauseContainsClauseConditionFieldCompartment_7124SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContainsClause modelElement = (ContainsClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getNotClauseNotClauseSubClauseCompartment_7125SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NotClause modelElement = (NotClause) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getSubClause();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause3EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause2EditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getDataIntegrationDataIntegrationRuntimeInfoCompartment_7126SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataIntegration modelElement = (DataIntegration) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getDataIntegrationDataIntegrationJoinAttributesListCompartment_7127SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataIntegration modelElement = (DataIntegration) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			JoinAttributesList childElement = modelElement.getJoinAttributesList();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JoinAttributesListEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getExportExportRuntimeInfoCompartment_7129SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Export modelElement = (Export) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getSchemaSchemaAttributesCompartment_7130SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectNodeDescriptor> getSchemaSchemaIdColumnCompartment_7133SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) containerView.getElement();
		LinkedList<PipelineprojectNodeDescriptor> result = new LinkedList<PipelineprojectNodeDescriptor>();
		{
			PrimaryKey childElement = modelElement.getIdColumn();
			int visualID = PipelineprojectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PrimaryKeyEditPart.VISUAL_ID) {
				result.add(new PipelineprojectNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectLinkDescriptor> getContainedLinks(View view) {
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000ContainedLinks(view);
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2035ContainedLinks(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2036ContainedLinks(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2037ContainedLinks(view);
		case KNNEditPart.VISUAL_ID:
			return getKNN_2038ContainedLinks(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2039ContainedLinks(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2041ContainedLinks(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2042ContainedLinks(view);
		case JarvisPatrickEditPart.VISUAL_ID:
			return getJarvisPatrick_2043ContainedLinks(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2044ContainedLinks(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2045ContainedLinks(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2046ContainedLinks(view);
		case VarianceEditPart.VISUAL_ID:
			return getVariance_2047ContainedLinks(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2059ContainedLinks(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2060ContainedLinks(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2062ContainedLinks(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2050ContainedLinks(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2051ContainedLinks(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2052ContainedLinks(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2063ContainedLinks(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2064ContainedLinks(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2065ContainedLinks(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2066ContainedLinks(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2053ContainedLinks(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2054ContainedLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2056ContainedLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2057ContainedLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2058ContainedLinks(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3036ContainedLinks(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3037ContainedLinks(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3038ContainedLinks(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3039ContainedLinks(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3040ContainedLinks(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3041ContainedLinks(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3042ContainedLinks(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3070ContainedLinks(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3044ContainedLinks(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3045ContainedLinks(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3046ContainedLinks(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3047ContainedLinks(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3048ContainedLinks(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3049ContainedLinks(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3050ContainedLinks(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3051ContainedLinks(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3052ContainedLinks(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3053ContainedLinks(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3054ContainedLinks(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3055ContainedLinks(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3056ContainedLinks(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3057ContainedLinks(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3058ContainedLinks(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3059ContainedLinks(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3060ContainedLinks(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3061ContainedLinks(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3062ContainedLinks(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3063ContainedLinks(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3064ContainedLinks(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3065ContainedLinks(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3066ContainedLinks(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3067ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3068ContainedLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3069ContainedLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectLinkDescriptor> getIncomingLinks(View view) {
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2035IncomingLinks(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2036IncomingLinks(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2037IncomingLinks(view);
		case KNNEditPart.VISUAL_ID:
			return getKNN_2038IncomingLinks(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2039IncomingLinks(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2041IncomingLinks(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2042IncomingLinks(view);
		case JarvisPatrickEditPart.VISUAL_ID:
			return getJarvisPatrick_2043IncomingLinks(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2044IncomingLinks(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2045IncomingLinks(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2046IncomingLinks(view);
		case VarianceEditPart.VISUAL_ID:
			return getVariance_2047IncomingLinks(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2059IncomingLinks(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2060IncomingLinks(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2062IncomingLinks(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2050IncomingLinks(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2051IncomingLinks(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2052IncomingLinks(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2063IncomingLinks(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2064IncomingLinks(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2065IncomingLinks(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2066IncomingLinks(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2053IncomingLinks(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2054IncomingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2056IncomingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2057IncomingLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2058IncomingLinks(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3036IncomingLinks(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3037IncomingLinks(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3038IncomingLinks(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3039IncomingLinks(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3040IncomingLinks(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3041IncomingLinks(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3042IncomingLinks(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3070IncomingLinks(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3044IncomingLinks(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3045IncomingLinks(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3046IncomingLinks(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3047IncomingLinks(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3048IncomingLinks(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3049IncomingLinks(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3050IncomingLinks(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3051IncomingLinks(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3052IncomingLinks(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3053IncomingLinks(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3054IncomingLinks(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3055IncomingLinks(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3056IncomingLinks(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3057IncomingLinks(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3058IncomingLinks(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3059IncomingLinks(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3060IncomingLinks(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3061IncomingLinks(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3062IncomingLinks(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3063IncomingLinks(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3064IncomingLinks(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3065IncomingLinks(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3066IncomingLinks(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3067IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3068IncomingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3069IncomingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineprojectLinkDescriptor> getOutgoingLinks(View view) {
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2035OutgoingLinks(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2036OutgoingLinks(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2037OutgoingLinks(view);
		case KNNEditPart.VISUAL_ID:
			return getKNN_2038OutgoingLinks(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2039OutgoingLinks(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2041OutgoingLinks(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2042OutgoingLinks(view);
		case JarvisPatrickEditPart.VISUAL_ID:
			return getJarvisPatrick_2043OutgoingLinks(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2044OutgoingLinks(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2045OutgoingLinks(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2046OutgoingLinks(view);
		case VarianceEditPart.VISUAL_ID:
			return getVariance_2047OutgoingLinks(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2059OutgoingLinks(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2060OutgoingLinks(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2062OutgoingLinks(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2050OutgoingLinks(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2051OutgoingLinks(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2052OutgoingLinks(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2063OutgoingLinks(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2064OutgoingLinks(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2065OutgoingLinks(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2066OutgoingLinks(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2053OutgoingLinks(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2054OutgoingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2056OutgoingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2057OutgoingLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2058OutgoingLinks(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3036OutgoingLinks(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3037OutgoingLinks(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3038OutgoingLinks(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3039OutgoingLinks(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3040OutgoingLinks(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3041OutgoingLinks(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3042OutgoingLinks(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3070OutgoingLinks(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3044OutgoingLinks(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3045OutgoingLinks(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3046OutgoingLinks(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3047OutgoingLinks(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3048OutgoingLinks(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3049OutgoingLinks(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3050OutgoingLinks(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3051OutgoingLinks(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3052OutgoingLinks(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3053OutgoingLinks(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3054OutgoingLinks(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3055OutgoingLinks(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3056OutgoingLinks(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3057OutgoingLinks(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3058OutgoingLinks(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3059OutgoingLinks(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3060OutgoingLinks(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3061OutgoingLinks(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3062OutgoingLinks(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3063OutgoingLinks(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3064OutgoingLinks(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3065OutgoingLinks(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3066OutgoingLinks(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3067OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3068OutgoingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3069OutgoingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DataFlow_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAgglomerative_2035ContainedLinks(View view) {
		Agglomerative modelElement = (Agglomerative) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getRidge_2036ContainedLinks(View view) {
		Ridge modelElement = (Ridge) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLasso_2037ContainedLinks(View view) {
		Lasso modelElement = (Lasso) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getKNN_2038ContainedLinks(View view) {
		pipelineproject.KNN modelElement = (pipelineproject.KNN) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSVM_2039ContainedLinks(View view) {
		pipelineproject.SVM modelElement = (pipelineproject.SVM) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getKMeans_2041ContainedLinks(View view) {
		KMeans modelElement = (KMeans) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDBSCAN_2042ContainedLinks(View view) {
		pipelineproject.DBSCAN modelElement = (pipelineproject.DBSCAN) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getJarvisPatrick_2043ContainedLinks(View view) {
		JarvisPatrick modelElement = (JarvisPatrick) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLinearRegression_2044ContainedLinks(View view) {
		LinearRegression modelElement = (LinearRegression) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getMean_2045ContainedLinks(View view) {
		Mean modelElement = (Mean) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getMedian_2046ContainedLinks(View view) {
		Median modelElement = (Median) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getVariance_2047ContainedLinks(View view) {
		Variance modelElement = (Variance) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLogisticRegression_2059ContainedLinks(View view) {
		LogisticRegression modelElement = (LogisticRegression) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSkewness_2060ContainedLinks(View view) {
		Skewness modelElement = (Skewness) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLabeledScatterPlot_2062ContainedLinks(View view) {
		LabeledScatterPlot modelElement = (LabeledScatterPlot) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNullValuesRemoval_2050ContainedLinks(View view) {
		NullValuesRemoval modelElement = (NullValuesRemoval) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getCustomCleaning_2051ContainedLinks(View view) {
		CustomCleaning modelElement = (CustomCleaning) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getChangeDataFormat_2052ContainedLinks(View view) {
		ChangeDataFormat modelElement = (ChangeDataFormat) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getScatterPlot_2063ContainedLinks(View view) {
		ScatterPlot modelElement = (ScatterPlot) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getHistogram_2064ContainedLinks(View view) {
		Histogram modelElement = (Histogram) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPiePlot_2065ContainedLinks(View view) {
		PiePlot modelElement = (PiePlot) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getProjectOnAttributes_2066ContainedLinks(View view) {
		ProjectOnAttributes modelElement = (ProjectOnAttributes) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataCollection_2053ContainedLinks(View view) {
		DataCollection modelElement = (DataCollection) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataIntegration_2054ContainedLinks(View view) {
		DataIntegration modelElement = (DataIntegration) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getExport_2056ContainedLinks(View view) {
		Export modelElement = (Export) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Writes_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSchema_2057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOutputFile_2058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getRuntimeInfo_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getCustomParam_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getInputSourceDeclaration_3038ContainedLinks(View view) {
		InputSourceDeclaration modelElement = (InputSourceDeclaration) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getQueryParam_3070ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3066ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getJoinAttributesList_3067ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAttribute_3068ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPrimaryKey_3069ContainedLinks(View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PrimaryKey_Copies_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataFlow_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAgglomerative_2035IncomingLinks(View view) {
		Agglomerative modelElement = (Agglomerative) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getRidge_2036IncomingLinks(View view) {
		Ridge modelElement = (Ridge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLasso_2037IncomingLinks(View view) {
		Lasso modelElement = (Lasso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getKNN_2038IncomingLinks(View view) {
		pipelineproject.KNN modelElement = (pipelineproject.KNN) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSVM_2039IncomingLinks(View view) {
		pipelineproject.SVM modelElement = (pipelineproject.SVM) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getKMeans_2041IncomingLinks(View view) {
		KMeans modelElement = (KMeans) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDBSCAN_2042IncomingLinks(View view) {
		pipelineproject.DBSCAN modelElement = (pipelineproject.DBSCAN) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getJarvisPatrick_2043IncomingLinks(View view) {
		JarvisPatrick modelElement = (JarvisPatrick) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLinearRegression_2044IncomingLinks(View view) {
		LinearRegression modelElement = (LinearRegression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getMean_2045IncomingLinks(View view) {
		Mean modelElement = (Mean) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getMedian_2046IncomingLinks(View view) {
		Median modelElement = (Median) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getVariance_2047IncomingLinks(View view) {
		Variance modelElement = (Variance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLogisticRegression_2059IncomingLinks(View view) {
		LogisticRegression modelElement = (LogisticRegression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSkewness_2060IncomingLinks(View view) {
		Skewness modelElement = (Skewness) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLabeledScatterPlot_2062IncomingLinks(View view) {
		LabeledScatterPlot modelElement = (LabeledScatterPlot) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNullValuesRemoval_2050IncomingLinks(View view) {
		NullValuesRemoval modelElement = (NullValuesRemoval) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getCustomCleaning_2051IncomingLinks(View view) {
		CustomCleaning modelElement = (CustomCleaning) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getChangeDataFormat_2052IncomingLinks(View view) {
		ChangeDataFormat modelElement = (ChangeDataFormat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getScatterPlot_2063IncomingLinks(View view) {
		ScatterPlot modelElement = (ScatterPlot) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getHistogram_2064IncomingLinks(View view) {
		Histogram modelElement = (Histogram) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPiePlot_2065IncomingLinks(View view) {
		PiePlot modelElement = (PiePlot) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getProjectOnAttributes_2066IncomingLinks(View view) {
		ProjectOnAttributes modelElement = (ProjectOnAttributes) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataCollection_2053IncomingLinks(View view) {
		DataCollection modelElement = (DataCollection) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataIntegration_2054IncomingLinks(View view) {
		DataIntegration modelElement = (DataIntegration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getExport_2056IncomingLinks(View view) {
		Export modelElement = (Export) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSchema_2057IncomingLinks(View view) {
		Schema modelElement = (Schema) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4011(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOutputFile_2058IncomingLinks(View view) {
		OutputFile modelElement = (OutputFile) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Export_Writes_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getRuntimeInfo_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getCustomParam_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getInputSourceDeclaration_3038IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3039IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getQueryParam_3070IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3046IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3049IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3057IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3059IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3060IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3061IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3062IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3063IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3064IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3065IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3066IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getJoinAttributesList_3067IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAttribute_3068IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPrimaryKey_3069IncomingLinks(View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PrimaryKey_Copies_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataFlow_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAgglomerative_2035OutgoingLinks(View view) {
		Agglomerative modelElement = (Agglomerative) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getRidge_2036OutgoingLinks(View view) {
		Ridge modelElement = (Ridge) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLasso_2037OutgoingLinks(View view) {
		Lasso modelElement = (Lasso) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getKNN_2038OutgoingLinks(View view) {
		pipelineproject.KNN modelElement = (pipelineproject.KNN) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSVM_2039OutgoingLinks(View view) {
		pipelineproject.SVM modelElement = (pipelineproject.SVM) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getKMeans_2041OutgoingLinks(View view) {
		KMeans modelElement = (KMeans) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDBSCAN_2042OutgoingLinks(View view) {
		pipelineproject.DBSCAN modelElement = (pipelineproject.DBSCAN) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getJarvisPatrick_2043OutgoingLinks(View view) {
		JarvisPatrick modelElement = (JarvisPatrick) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLinearRegression_2044OutgoingLinks(View view) {
		LinearRegression modelElement = (LinearRegression) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getMean_2045OutgoingLinks(View view) {
		Mean modelElement = (Mean) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getMedian_2046OutgoingLinks(View view) {
		Median modelElement = (Median) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getVariance_2047OutgoingLinks(View view) {
		Variance modelElement = (Variance) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLogisticRegression_2059OutgoingLinks(View view) {
		LogisticRegression modelElement = (LogisticRegression) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSkewness_2060OutgoingLinks(View view) {
		Skewness modelElement = (Skewness) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLabeledScatterPlot_2062OutgoingLinks(View view) {
		LabeledScatterPlot modelElement = (LabeledScatterPlot) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNullValuesRemoval_2050OutgoingLinks(View view) {
		NullValuesRemoval modelElement = (NullValuesRemoval) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getCustomCleaning_2051OutgoingLinks(View view) {
		CustomCleaning modelElement = (CustomCleaning) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getChangeDataFormat_2052OutgoingLinks(View view) {
		ChangeDataFormat modelElement = (ChangeDataFormat) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getScatterPlot_2063OutgoingLinks(View view) {
		ScatterPlot modelElement = (ScatterPlot) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getHistogram_2064OutgoingLinks(View view) {
		Histogram modelElement = (Histogram) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPiePlot_2065OutgoingLinks(View view) {
		PiePlot modelElement = (PiePlot) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getProjectOnAttributes_2066OutgoingLinks(View view) {
		ProjectOnAttributes modelElement = (ProjectOnAttributes) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataCollection_2053OutgoingLinks(View view) {
		DataCollection modelElement = (DataCollection) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataIntegration_2054OutgoingLinks(View view) {
		DataIntegration modelElement = (DataIntegration) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getExport_2056OutgoingLinks(View view) {
		Export modelElement = (Export) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Writes_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getSchema_2057OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOutputFile_2058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getRuntimeInfo_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getCustomParam_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getInputSourceDeclaration_3038OutgoingLinks(View view) {
		InputSourceDeclaration modelElement = (InputSourceDeclaration) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getQueryParam_3070OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAndClause_3050OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3056OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3057OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getOrClause_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLtClause_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGtClause_3061OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getEqClause_3062OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getLeClause_3063OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getGeClause_3064OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getContainsClause_3065OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getNotClause_3066OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getJoinAttributesList_3067OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getAttribute_3068OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getPrimaryKey_3069OutgoingLinks(View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PrimaryKey_Copies_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineprojectLinkDescriptor> getDataFlow_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getContainedTypeModelFacetLinks_DataFlow_4007(
			Pipeline container) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		for (Iterator<?> links = container.getDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) linkObject;
			if (DataFlowEditPart.VISUAL_ID != PipelineprojectVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTo();
			Task src = link.getFrom();
			result.add(new PipelineprojectLinkDescriptor(src, dst, link, PipelineprojectElementTypes.DataFlow_4007,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineprojectLinkDescriptor> getIncomingTypeModelFacetLinks_DataFlow_4007(Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PipelineprojectPackage.eINSTANCE.getDataFlow_To()
					|| false == setting.getEObject() instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) setting.getEObject();
			if (DataFlowEditPart.VISUAL_ID != PipelineprojectVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getFrom();
			result.add(new PipelineprojectLinkDescriptor(src, target, link, PipelineprojectElementTypes.DataFlow_4007,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineprojectLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_InputSchema_4015(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelineprojectPackage.eINSTANCE.getTask_InputSchema()) {
				result.add(new PipelineprojectLinkDescriptor(setting.getEObject(), target,
						PipelineprojectElementTypes.TaskInputSchema_4015, TaskInputSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineprojectLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_OutputSchema_4016(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelineprojectPackage.eINSTANCE.getTask_OutputSchema()) {
				result.add(new PipelineprojectLinkDescriptor(setting.getEObject(), target,
						PipelineprojectElementTypes.TaskOutputSchema_4016, TaskOutputSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineprojectLinkDescriptor> getIncomingFeatureModelFacetLinks_Export_Writes_4010(
			OutputFile target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelineprojectPackage.eINSTANCE.getExport_Writes()) {
				result.add(new PipelineprojectLinkDescriptor(setting.getEObject(), target,
						PipelineprojectElementTypes.ExportWrites_4010, ExportWritesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineprojectLinkDescriptor> getIncomingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4011(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelineprojectPackage.eINSTANCE
					.getInputSourceDeclaration_SourceSchema()) {
				result.add(new PipelineprojectLinkDescriptor(setting.getEObject(), target,
						PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011,
						InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getIncomingFeatureModelFacetLinks_PrimaryKey_Copies_4017(
			PrimaryKey target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelineprojectPackage.eINSTANCE.getPrimaryKey_Copies()) {
				result.add(new PipelineprojectLinkDescriptor(setting.getEObject(), target,
						PipelineprojectElementTypes.PrimaryKeyCopies_4017, PrimaryKeyCopiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getOutgoingTypeModelFacetLinks_DataFlow_4007(Task source) {
		Pipeline container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Pipeline) {
				container = (Pipeline) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		for (Iterator<?> links = container.getDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) linkObject;
			if (DataFlowEditPart.VISUAL_ID != PipelineprojectVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTo();
			Task src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new PipelineprojectLinkDescriptor(src, dst, link, PipelineprojectElementTypes.DataFlow_4007,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_InputSchema_4015(
			Task source) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		for (Iterator<?> destinations = source.getInputSchema().iterator(); destinations.hasNext();) {
			Schema destination = (Schema) destinations.next();
			result.add(new PipelineprojectLinkDescriptor(source, destination,
					PipelineprojectElementTypes.TaskInputSchema_4015, TaskInputSchemaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4016(
			Task source) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Schema destination = source.getOutputSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineprojectLinkDescriptor(source, destination,
				PipelineprojectElementTypes.TaskOutputSchema_4016, TaskOutputSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getOutgoingFeatureModelFacetLinks_Export_Writes_4010(
			Export source) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		for (Iterator<?> destinations = source.getWrites().iterator(); destinations.hasNext();) {
			OutputFile destination = (OutputFile) destinations.next();
			result.add(new PipelineprojectLinkDescriptor(source, destination,
					PipelineprojectElementTypes.ExportWrites_4010, ExportWritesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getOutgoingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4011(
			InputSourceDeclaration source) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		Schema destination = source.getSourceSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineprojectLinkDescriptor(source, destination,
				PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011,
				InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineprojectLinkDescriptor> getOutgoingFeatureModelFacetLinks_PrimaryKey_Copies_4017(
			PrimaryKey source) {
		LinkedList<PipelineprojectLinkDescriptor> result = new LinkedList<PipelineprojectLinkDescriptor>();
		PrimaryKey destination = source.getCopies();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineprojectLinkDescriptor(source, destination,
				PipelineprojectElementTypes.PrimaryKeyCopies_4017, PrimaryKeyCopiesEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PipelineprojectNodeDescriptor> getSemanticChildren(View view) {
			return PipelineprojectDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PipelineprojectLinkDescriptor> getContainedLinks(View view) {
			return PipelineprojectDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PipelineprojectLinkDescriptor> getIncomingLinks(View view) {
			return PipelineprojectDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PipelineprojectLinkDescriptor> getOutgoingLinks(View view) {
			return PipelineprojectDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
