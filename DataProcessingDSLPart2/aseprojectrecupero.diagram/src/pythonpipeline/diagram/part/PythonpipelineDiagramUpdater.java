/*
* 
*/
package pythonpipeline.diagram.part;

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

import pythonpipeline.Agglomerative;
import pythonpipeline.AndClause;
import pythonpipeline.Attribute;
import pythonpipeline.ChangeDataFormat;
import pythonpipeline.ContainsClause;
import pythonpipeline.CustomCleaning;
import pythonpipeline.CustomParam;
import pythonpipeline.DataCollection;
import pythonpipeline.DataFlow;
import pythonpipeline.DataIntegration;
import pythonpipeline.EqClause;
import pythonpipeline.Export;
import pythonpipeline.GeClause;
import pythonpipeline.GtClause;
import pythonpipeline.Histogram;
import pythonpipeline.InputSourceDeclaration;
import pythonpipeline.JoinAttributesList;
import pythonpipeline.KMeans;
import pythonpipeline.LabeledScatterPlot;
import pythonpipeline.Lasso;
import pythonpipeline.LeClause;
import pythonpipeline.LinearRegression;
import pythonpipeline.LogicProposition;
import pythonpipeline.LogisticRegression;
import pythonpipeline.LtClause;
import pythonpipeline.Mean;
import pythonpipeline.Median;
import pythonpipeline.NotClause;
import pythonpipeline.NullValuesRemoval;
import pythonpipeline.OrClause;
import pythonpipeline.OutputFile;
import pythonpipeline.PiePlot;
import pythonpipeline.Pipeline;
import pythonpipeline.PrimaryKey;
import pythonpipeline.ProjectOnAttributes;
import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.QueryParam;
import pythonpipeline.Ridge;
import pythonpipeline.RuntimeInfo;
import pythonpipeline.ScatterPlot;
import pythonpipeline.Schema;
import pythonpipeline.Skewness;
import pythonpipeline.StandardDeviation;
import pythonpipeline.SupportVector;
import pythonpipeline.Task;
import pythonpipeline.diagram.edit.parts.*;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class PythonpipelineDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getSemanticChildren(View view) {
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000SemanticChildren(view);
		case AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getAgglomerativeAgglomerativeRuntimeInfoCompartment_7001SemanticChildren(view);
		case RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getRidgeRidgeRuntimeInfoCompartment_7002SemanticChildren(view);
		case LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLassoLassoRuntimeInfoCompartment_7003SemanticChildren(view);
		case SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getSVMSVMRuntimeInfoCompartment_7004SemanticChildren(view);
		case SVMSVMSupportVectorsCompartmentEditPart.VISUAL_ID:
			return getSVMSVMSupportVectorsCompartment_7057SemanticChildren(view);
		case KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getKMeansKMeansRuntimeInfoCompartment_7005SemanticChildren(view);
		case DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getDBSCANDBSCANRuntimeInfoCompartment_7006SemanticChildren(view);
		case LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLinearRegressionLinearRegressionRuntimeInfoCompartment_7007SemanticChildren(view);
		case MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getMeanMeanRuntimeInfoCompartment_7008SemanticChildren(view);
		case MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getMedianMedianRuntimeInfoCompartment_7009SemanticChildren(view);
		case StandardDeviationStandardDeviationRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getStandardDeviationStandardDeviationRuntimeInfoCompartment_7010SemanticChildren(view);
		case LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLogisticRegressionLogisticRegressionRuntimeInfoCompartment_7011SemanticChildren(view);
		case SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getSkewnessSkewnessRuntimeInfoCompartment_7012SemanticChildren(view);
		case LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getLabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartment_7013SemanticChildren(view);
		case NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getNullValuesRemovalNullValuesRemovalRuntimeInfoCompartment_7014SemanticChildren(view);
		case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getCustomCleaningCustomCleaningRuntimeInfoCompartment_7015SemanticChildren(view);
		case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
			return getCustomCleaningCustomCleaningCustomParamsCompartment_7016SemanticChildren(view);
		case ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getChangeDataFormatChangeDataFormatRuntimeInfoCompartment_7017SemanticChildren(view);
		case ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getScatterPlotScatterPlotRuntimeInfoCompartment_7018SemanticChildren(view);
		case HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getHistogramHistogramRuntimeInfoCompartment_7019SemanticChildren(view);
		case PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getPiePlotPiePlotRuntimeInfoCompartment_7020SemanticChildren(view);
		case ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getProjectOnAttributesProjectOnAttributesRuntimeInfoCompartment_7021SemanticChildren(view);
		case DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getDataCollectionDataCollectionRuntimeInfoCompartment_7022SemanticChildren(view);
		case DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID:
			return getDataCollectionDataCollectionSourceDeclarationCompartment_7023SemanticChildren(view);
		case InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID:
			return getInputSourceDeclarationInputSourceDeclarationQueryConditionsCompartment_7024SemanticChildren(view);
		case AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID:
			return getAndClauseAndClauseOperandsCompartment_7025SemanticChildren(view);
		case AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID:
			return getAndClauseAndClauseOperandsCompartment_7026SemanticChildren(view);
		case OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID:
			return getOrClauseOrClauseOperandsCompartment_7027SemanticChildren(view);
		case LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getLtClauseLtClauseConditionFieldCompartment_7028SemanticChildren(view);
		case GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getGtClauseGtClauseConditionFieldCompartment_7029SemanticChildren(view);
		case EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getEqClauseEqClauseConditionFieldCompartment_7030SemanticChildren(view);
		case LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getLeClauseLeClauseConditionFieldCompartment_7031SemanticChildren(view);
		case GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getGeClauseGeClauseConditionFieldCompartment_7032SemanticChildren(view);
		case ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID:
			return getContainsClauseContainsClauseConditionFieldCompartment_7033SemanticChildren(view);
		case NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID:
			return getNotClauseNotClauseSubClauseCompartment_7034SemanticChildren(view);
		case AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID:
			return getAndClauseAndClauseOperandsCompartment_7035SemanticChildren(view);
		case OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID:
			return getOrClauseOrClauseOperandsCompartment_7036SemanticChildren(view);
		case LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getLtClauseLtClauseConditionFieldCompartment_7037SemanticChildren(view);
		case GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getGtClauseGtClauseConditionFieldCompartment_7038SemanticChildren(view);
		case EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getEqClauseEqClauseConditionFieldCompartment_7039SemanticChildren(view);
		case LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getLeClauseLeClauseConditionFieldCompartment_7040SemanticChildren(view);
		case GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getGeClauseGeClauseConditionFieldCompartment_7041SemanticChildren(view);
		case ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID:
			return getContainsClauseContainsClauseConditionFieldCompartment_7042SemanticChildren(view);
		case NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID:
			return getNotClauseNotClauseSubClauseCompartment_7043SemanticChildren(view);
		case OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID:
			return getOrClauseOrClauseOperandsCompartment_7044SemanticChildren(view);
		case LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getLtClauseLtClauseConditionFieldCompartment_7045SemanticChildren(view);
		case GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getGtClauseGtClauseConditionFieldCompartment_7046SemanticChildren(view);
		case EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getEqClauseEqClauseConditionFieldCompartment_7047SemanticChildren(view);
		case LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getLeClauseLeClauseConditionFieldCompartment_7048SemanticChildren(view);
		case GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getGeClauseGeClauseConditionFieldCompartment_7049SemanticChildren(view);
		case ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID:
			return getContainsClauseContainsClauseConditionFieldCompartment_7050SemanticChildren(view);
		case NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID:
			return getNotClauseNotClauseSubClauseCompartment_7051SemanticChildren(view);
		case DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getDataIntegrationDataIntegrationRuntimeInfoCompartment_7052SemanticChildren(view);
		case DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID:
			return getDataIntegrationDataIntegrationJoinAttributesListCompartment_7053SemanticChildren(view);
		case ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID:
			return getExportExportRuntimeInfoCompartment_7054SemanticChildren(view);
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			return getSchemaSchemaAttributesCompartment_7055SemanticChildren(view);
		case SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID:
			return getSchemaSchemaIdColumnCompartment_7056SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getPipeline_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AgglomerativeEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RidgeEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LassoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SVMEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == KMeansEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBSCANEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LinearRegressionEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MeanEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MedianEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StandardDeviationEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogisticRegressionEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SkewnessEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabeledScatterPlotEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NullValuesRemovalEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomCleaningEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChangeDataFormatEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScatterPlotEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HistogramEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PiePlotEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProjectOnAttributesEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataCollectionEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataIntegrationEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExportEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSchema().iterator(); it.hasNext();) {
			Schema childElement = (Schema) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SchemaEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputFile().iterator(); it.hasNext();) {
			OutputFile childElement = (OutputFile) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputFileEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getAgglomerativeAgglomerativeRuntimeInfoCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Agglomerative modelElement = (Agglomerative) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getRidgeRidgeRuntimeInfoCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ridge modelElement = (Ridge) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLassoLassoRuntimeInfoCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Lasso modelElement = (Lasso) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getSVMSVMRuntimeInfoCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		pythonpipeline.SVM modelElement = (pythonpipeline.SVM) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getSVMSVMSupportVectorsCompartment_7057SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		pythonpipeline.SVM modelElement = (pythonpipeline.SVM) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSupportVectors().iterator(); it.hasNext();) {
			SupportVector childElement = (SupportVector) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SupportVectorEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getKMeansKMeansRuntimeInfoCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KMeans modelElement = (KMeans) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getDBSCANDBSCANRuntimeInfoCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		pythonpipeline.DBSCAN modelElement = (pythonpipeline.DBSCAN) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLinearRegressionLinearRegressionRuntimeInfoCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LinearRegression modelElement = (LinearRegression) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getMeanMeanRuntimeInfoCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Mean modelElement = (Mean) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getMedianMedianRuntimeInfoCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Median modelElement = (Median) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getStandardDeviationStandardDeviationRuntimeInfoCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StandardDeviation modelElement = (StandardDeviation) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLogisticRegressionLogisticRegressionRuntimeInfoCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LogisticRegression modelElement = (LogisticRegression) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getSkewnessSkewnessRuntimeInfoCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Skewness modelElement = (Skewness) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LabeledScatterPlot modelElement = (LabeledScatterPlot) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getNullValuesRemovalNullValuesRemovalRuntimeInfoCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NullValuesRemoval modelElement = (NullValuesRemoval) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getCustomCleaningCustomCleaningRuntimeInfoCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CustomCleaning modelElement = (CustomCleaning) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getCustomCleaningCustomCleaningCustomParamsCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CustomCleaning modelElement = (CustomCleaning) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCustomParams().iterator(); it.hasNext();) {
			CustomParam childElement = (CustomParam) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CustomParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getChangeDataFormatChangeDataFormatRuntimeInfoCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ChangeDataFormat modelElement = (ChangeDataFormat) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getScatterPlotScatterPlotRuntimeInfoCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScatterPlot modelElement = (ScatterPlot) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getHistogramHistogramRuntimeInfoCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Histogram modelElement = (Histogram) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getPiePlotPiePlotRuntimeInfoCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PiePlot modelElement = (PiePlot) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getProjectOnAttributesProjectOnAttributesRuntimeInfoCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProjectOnAttributes modelElement = (ProjectOnAttributes) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getDataCollectionDataCollectionRuntimeInfoCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataCollection modelElement = (DataCollection) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getDataCollectionDataCollectionSourceDeclarationCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataCollection modelElement = (DataCollection) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSourceDeclaration().iterator(); it.hasNext();) {
			InputSourceDeclaration childElement = (InputSourceDeclaration) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputSourceDeclarationEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getInputSourceDeclarationInputSourceDeclarationQueryConditionsCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InputSourceDeclaration modelElement = (InputSourceDeclaration) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getQueryConditions();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getAndClauseAndClauseOperandsCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndClause modelElement = (AndClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getAndClauseAndClauseOperandsCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndClause modelElement = (AndClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getOrClauseOrClauseOperandsCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrClause modelElement = (OrClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLtClauseLtClauseConditionFieldCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LtClause modelElement = (LtClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getGtClauseGtClauseConditionFieldCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GtClause modelElement = (GtClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getEqClauseEqClauseConditionFieldCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EqClause modelElement = (EqClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLeClauseLeClauseConditionFieldCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LeClause modelElement = (LeClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getGeClauseGeClauseConditionFieldCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GeClause modelElement = (GeClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getContainsClauseContainsClauseConditionFieldCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContainsClause modelElement = (ContainsClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getNotClauseNotClauseSubClauseCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NotClause modelElement = (NotClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getSubClause();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getAndClauseAndClauseOperandsCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AndClause modelElement = (AndClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getOrClauseOrClauseOperandsCompartment_7036SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrClause modelElement = (OrClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLtClauseLtClauseConditionFieldCompartment_7037SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LtClause modelElement = (LtClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getGtClauseGtClauseConditionFieldCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GtClause modelElement = (GtClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getEqClauseEqClauseConditionFieldCompartment_7039SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EqClause modelElement = (EqClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLeClauseLeClauseConditionFieldCompartment_7040SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LeClause modelElement = (LeClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getGeClauseGeClauseConditionFieldCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GeClause modelElement = (GeClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getContainsClauseContainsClauseConditionFieldCompartment_7042SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContainsClause modelElement = (ContainsClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getNotClauseNotClauseSubClauseCompartment_7043SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NotClause modelElement = (NotClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getSubClause();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getOrClauseOrClauseOperandsCompartment_7044SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OrClause modelElement = (OrClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperands().iterator(); it.hasNext();) {
			LogicProposition childElement = (LogicProposition) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GtClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GeClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainsClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotClauseEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLtClauseLtClauseConditionFieldCompartment_7045SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LtClause modelElement = (LtClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getGtClauseGtClauseConditionFieldCompartment_7046SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GtClause modelElement = (GtClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getEqClauseEqClauseConditionFieldCompartment_7047SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EqClause modelElement = (EqClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getLeClauseLeClauseConditionFieldCompartment_7048SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LeClause modelElement = (LeClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getGeClauseGeClauseConditionFieldCompartment_7049SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GeClause modelElement = (GeClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getContainsClauseContainsClauseConditionFieldCompartment_7050SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContainsClause modelElement = (ContainsClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			QueryParam childElement = modelElement.getConditionField();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryParamEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getNotClauseNotClauseSubClauseCompartment_7051SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		NotClause modelElement = (NotClause) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			LogicProposition childElement = modelElement.getSubClause();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndClause3EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == OrClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LtClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GtClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == EqClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == LeClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == ContainsClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
			if (visualID == NotClause2EditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getDataIntegrationDataIntegrationRuntimeInfoCompartment_7052SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataIntegration modelElement = (DataIntegration) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getDataIntegrationDataIntegrationJoinAttributesListCompartment_7053SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataIntegration modelElement = (DataIntegration) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			JoinAttributesList childElement = modelElement.getJoinAttributesList();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JoinAttributesListEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getExportExportRuntimeInfoCompartment_7054SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Export modelElement = (Export) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			RuntimeInfo childElement = modelElement.getRuntimeInfo();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuntimeInfoEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getSchemaSchemaAttributesCompartment_7055SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineNodeDescriptor> getSchemaSchemaIdColumnCompartment_7056SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) containerView.getElement();
		LinkedList<PythonpipelineNodeDescriptor> result = new LinkedList<PythonpipelineNodeDescriptor>();
		{
			PrimaryKey childElement = modelElement.getIdColumn();
			int visualID = PythonpipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PrimaryKeyEditPart.VISUAL_ID) {
				result.add(new PythonpipelineNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineLinkDescriptor> getContainedLinks(View view) {
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000ContainedLinks(view);
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2001ContainedLinks(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2002ContainedLinks(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2003ContainedLinks(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2004ContainedLinks(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2005ContainedLinks(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2006ContainedLinks(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2007ContainedLinks(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2008ContainedLinks(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2009ContainedLinks(view);
		case StandardDeviationEditPart.VISUAL_ID:
			return getStandardDeviation_2010ContainedLinks(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2011ContainedLinks(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2012ContainedLinks(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2013ContainedLinks(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2014ContainedLinks(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2015ContainedLinks(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2016ContainedLinks(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2017ContainedLinks(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2018ContainedLinks(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2019ContainedLinks(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2020ContainedLinks(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2021ContainedLinks(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2022ContainedLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2023ContainedLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2024ContainedLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2025ContainedLinks(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3001ContainedLinks(view);
		case SupportVectorEditPart.VISUAL_ID:
			return getSupportVector_3035ContainedLinks(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3002ContainedLinks(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3003ContainedLinks(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3004ContainedLinks(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3005ContainedLinks(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3006ContainedLinks(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3007ContainedLinks(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3008ContainedLinks(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3009ContainedLinks(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3010ContainedLinks(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3011ContainedLinks(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3012ContainedLinks(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3013ContainedLinks(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3014ContainedLinks(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3015ContainedLinks(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3016ContainedLinks(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3017ContainedLinks(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3018ContainedLinks(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3019ContainedLinks(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3020ContainedLinks(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3021ContainedLinks(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3022ContainedLinks(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3023ContainedLinks(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3024ContainedLinks(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3025ContainedLinks(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3026ContainedLinks(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3027ContainedLinks(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3028ContainedLinks(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3029ContainedLinks(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3030ContainedLinks(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3031ContainedLinks(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3032ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3033ContainedLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3034ContainedLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineLinkDescriptor> getIncomingLinks(View view) {
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2001IncomingLinks(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2002IncomingLinks(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2003IncomingLinks(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2004IncomingLinks(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2005IncomingLinks(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2006IncomingLinks(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2007IncomingLinks(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2008IncomingLinks(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2009IncomingLinks(view);
		case StandardDeviationEditPart.VISUAL_ID:
			return getStandardDeviation_2010IncomingLinks(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2011IncomingLinks(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2012IncomingLinks(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2013IncomingLinks(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2014IncomingLinks(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2015IncomingLinks(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2016IncomingLinks(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2017IncomingLinks(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2018IncomingLinks(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2019IncomingLinks(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2020IncomingLinks(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2021IncomingLinks(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2022IncomingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2023IncomingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2024IncomingLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2025IncomingLinks(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3001IncomingLinks(view);
		case SupportVectorEditPart.VISUAL_ID:
			return getSupportVector_3035IncomingLinks(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3002IncomingLinks(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3003IncomingLinks(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3004IncomingLinks(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3005IncomingLinks(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3006IncomingLinks(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3007IncomingLinks(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3008IncomingLinks(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3009IncomingLinks(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3010IncomingLinks(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3011IncomingLinks(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3012IncomingLinks(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3013IncomingLinks(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3014IncomingLinks(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3015IncomingLinks(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3016IncomingLinks(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3017IncomingLinks(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3018IncomingLinks(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3019IncomingLinks(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3020IncomingLinks(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3021IncomingLinks(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3022IncomingLinks(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3023IncomingLinks(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3024IncomingLinks(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3025IncomingLinks(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3026IncomingLinks(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3027IncomingLinks(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3028IncomingLinks(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3029IncomingLinks(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3030IncomingLinks(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3031IncomingLinks(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3032IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3033IncomingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3034IncomingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PythonpipelineLinkDescriptor> getOutgoingLinks(View view) {
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2001OutgoingLinks(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2002OutgoingLinks(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2003OutgoingLinks(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2004OutgoingLinks(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2005OutgoingLinks(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2006OutgoingLinks(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2007OutgoingLinks(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2008OutgoingLinks(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2009OutgoingLinks(view);
		case StandardDeviationEditPart.VISUAL_ID:
			return getStandardDeviation_2010OutgoingLinks(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2011OutgoingLinks(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2012OutgoingLinks(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2013OutgoingLinks(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2014OutgoingLinks(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2015OutgoingLinks(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2016OutgoingLinks(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2017OutgoingLinks(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2018OutgoingLinks(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2019OutgoingLinks(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2020OutgoingLinks(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2021OutgoingLinks(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2022OutgoingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2023OutgoingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2024OutgoingLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2025OutgoingLinks(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3001OutgoingLinks(view);
		case SupportVectorEditPart.VISUAL_ID:
			return getSupportVector_3035OutgoingLinks(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3002OutgoingLinks(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3003OutgoingLinks(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3004OutgoingLinks(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3005OutgoingLinks(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3006OutgoingLinks(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3007OutgoingLinks(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3008OutgoingLinks(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3009OutgoingLinks(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3010OutgoingLinks(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3011OutgoingLinks(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3012OutgoingLinks(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3013OutgoingLinks(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3014OutgoingLinks(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3015OutgoingLinks(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3016OutgoingLinks(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3017OutgoingLinks(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3018OutgoingLinks(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3019OutgoingLinks(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3020OutgoingLinks(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3021OutgoingLinks(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3022OutgoingLinks(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3023OutgoingLinks(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3024OutgoingLinks(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3025OutgoingLinks(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3026OutgoingLinks(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3027OutgoingLinks(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3028OutgoingLinks(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3029OutgoingLinks(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3030OutgoingLinks(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3031OutgoingLinks(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3032OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3033OutgoingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3034OutgoingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DataFlow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAgglomerative_2001ContainedLinks(View view) {
		Agglomerative modelElement = (Agglomerative) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getRidge_2002ContainedLinks(View view) {
		Ridge modelElement = (Ridge) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLasso_2003ContainedLinks(View view) {
		Lasso modelElement = (Lasso) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSVM_2004ContainedLinks(View view) {
		pythonpipeline.SVM modelElement = (pythonpipeline.SVM) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getKMeans_2005ContainedLinks(View view) {
		KMeans modelElement = (KMeans) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDBSCAN_2006ContainedLinks(View view) {
		pythonpipeline.DBSCAN modelElement = (pythonpipeline.DBSCAN) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLinearRegression_2007ContainedLinks(View view) {
		LinearRegression modelElement = (LinearRegression) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getMean_2008ContainedLinks(View view) {
		Mean modelElement = (Mean) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getMedian_2009ContainedLinks(View view) {
		Median modelElement = (Median) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getStandardDeviation_2010ContainedLinks(View view) {
		StandardDeviation modelElement = (StandardDeviation) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLogisticRegression_2011ContainedLinks(View view) {
		LogisticRegression modelElement = (LogisticRegression) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSkewness_2012ContainedLinks(View view) {
		Skewness modelElement = (Skewness) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLabeledScatterPlot_2013ContainedLinks(View view) {
		LabeledScatterPlot modelElement = (LabeledScatterPlot) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNullValuesRemoval_2014ContainedLinks(View view) {
		NullValuesRemoval modelElement = (NullValuesRemoval) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getCustomCleaning_2015ContainedLinks(View view) {
		CustomCleaning modelElement = (CustomCleaning) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getChangeDataFormat_2016ContainedLinks(View view) {
		ChangeDataFormat modelElement = (ChangeDataFormat) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getScatterPlot_2017ContainedLinks(View view) {
		ScatterPlot modelElement = (ScatterPlot) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getHistogram_2018ContainedLinks(View view) {
		Histogram modelElement = (Histogram) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPiePlot_2019ContainedLinks(View view) {
		PiePlot modelElement = (PiePlot) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getProjectOnAttributes_2020ContainedLinks(View view) {
		ProjectOnAttributes modelElement = (ProjectOnAttributes) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataCollection_2021ContainedLinks(View view) {
		DataCollection modelElement = (DataCollection) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataIntegration_2022ContainedLinks(View view) {
		DataIntegration modelElement = (DataIntegration) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getExport_2023ContainedLinks(View view) {
		Export modelElement = (Export) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Writes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSchema_2024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOutputFile_2025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getRuntimeInfo_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSupportVector_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getCustomParam_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getInputSourceDeclaration_3003ContainedLinks(View view) {
		InputSourceDeclaration modelElement = (InputSourceDeclaration) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getQueryParam_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getJoinAttributesList_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAttribute_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPrimaryKey_3034ContainedLinks(View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PrimaryKey_Copies_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataFlow_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAgglomerative_2001IncomingLinks(View view) {
		Agglomerative modelElement = (Agglomerative) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getRidge_2002IncomingLinks(View view) {
		Ridge modelElement = (Ridge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLasso_2003IncomingLinks(View view) {
		Lasso modelElement = (Lasso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSVM_2004IncomingLinks(View view) {
		pythonpipeline.SVM modelElement = (pythonpipeline.SVM) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getKMeans_2005IncomingLinks(View view) {
		KMeans modelElement = (KMeans) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDBSCAN_2006IncomingLinks(View view) {
		pythonpipeline.DBSCAN modelElement = (pythonpipeline.DBSCAN) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLinearRegression_2007IncomingLinks(View view) {
		LinearRegression modelElement = (LinearRegression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getMean_2008IncomingLinks(View view) {
		Mean modelElement = (Mean) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getMedian_2009IncomingLinks(View view) {
		Median modelElement = (Median) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getStandardDeviation_2010IncomingLinks(View view) {
		StandardDeviation modelElement = (StandardDeviation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLogisticRegression_2011IncomingLinks(View view) {
		LogisticRegression modelElement = (LogisticRegression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSkewness_2012IncomingLinks(View view) {
		Skewness modelElement = (Skewness) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLabeledScatterPlot_2013IncomingLinks(View view) {
		LabeledScatterPlot modelElement = (LabeledScatterPlot) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNullValuesRemoval_2014IncomingLinks(View view) {
		NullValuesRemoval modelElement = (NullValuesRemoval) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getCustomCleaning_2015IncomingLinks(View view) {
		CustomCleaning modelElement = (CustomCleaning) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getChangeDataFormat_2016IncomingLinks(View view) {
		ChangeDataFormat modelElement = (ChangeDataFormat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getScatterPlot_2017IncomingLinks(View view) {
		ScatterPlot modelElement = (ScatterPlot) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getHistogram_2018IncomingLinks(View view) {
		Histogram modelElement = (Histogram) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPiePlot_2019IncomingLinks(View view) {
		PiePlot modelElement = (PiePlot) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getProjectOnAttributes_2020IncomingLinks(View view) {
		ProjectOnAttributes modelElement = (ProjectOnAttributes) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataCollection_2021IncomingLinks(View view) {
		DataCollection modelElement = (DataCollection) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataIntegration_2022IncomingLinks(View view) {
		DataIntegration modelElement = (DataIntegration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getExport_2023IncomingLinks(View view) {
		Export modelElement = (Export) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSchema_2024IncomingLinks(View view) {
		Schema modelElement = (Schema) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4005(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOutputFile_2025IncomingLinks(View view) {
		OutputFile modelElement = (OutputFile) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Export_Writes_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getRuntimeInfo_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSupportVector_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getCustomParam_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getInputSourceDeclaration_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getQueryParam_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getJoinAttributesList_3032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAttribute_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPrimaryKey_3034IncomingLinks(View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PrimaryKey_Copies_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataFlow_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAgglomerative_2001OutgoingLinks(View view) {
		Agglomerative modelElement = (Agglomerative) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getRidge_2002OutgoingLinks(View view) {
		Ridge modelElement = (Ridge) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLasso_2003OutgoingLinks(View view) {
		Lasso modelElement = (Lasso) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSVM_2004OutgoingLinks(View view) {
		pythonpipeline.SVM modelElement = (pythonpipeline.SVM) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getKMeans_2005OutgoingLinks(View view) {
		KMeans modelElement = (KMeans) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDBSCAN_2006OutgoingLinks(View view) {
		pythonpipeline.DBSCAN modelElement = (pythonpipeline.DBSCAN) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLinearRegression_2007OutgoingLinks(View view) {
		LinearRegression modelElement = (LinearRegression) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getMean_2008OutgoingLinks(View view) {
		Mean modelElement = (Mean) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getMedian_2009OutgoingLinks(View view) {
		Median modelElement = (Median) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getStandardDeviation_2010OutgoingLinks(View view) {
		StandardDeviation modelElement = (StandardDeviation) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLogisticRegression_2011OutgoingLinks(View view) {
		LogisticRegression modelElement = (LogisticRegression) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSkewness_2012OutgoingLinks(View view) {
		Skewness modelElement = (Skewness) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLabeledScatterPlot_2013OutgoingLinks(View view) {
		LabeledScatterPlot modelElement = (LabeledScatterPlot) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNullValuesRemoval_2014OutgoingLinks(View view) {
		NullValuesRemoval modelElement = (NullValuesRemoval) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getCustomCleaning_2015OutgoingLinks(View view) {
		CustomCleaning modelElement = (CustomCleaning) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getChangeDataFormat_2016OutgoingLinks(View view) {
		ChangeDataFormat modelElement = (ChangeDataFormat) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getScatterPlot_2017OutgoingLinks(View view) {
		ScatterPlot modelElement = (ScatterPlot) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getHistogram_2018OutgoingLinks(View view) {
		Histogram modelElement = (Histogram) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPiePlot_2019OutgoingLinks(View view) {
		PiePlot modelElement = (PiePlot) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getProjectOnAttributes_2020OutgoingLinks(View view) {
		ProjectOnAttributes modelElement = (ProjectOnAttributes) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataCollection_2021OutgoingLinks(View view) {
		DataCollection modelElement = (DataCollection) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataIntegration_2022OutgoingLinks(View view) {
		DataIntegration modelElement = (DataIntegration) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getExport_2023OutgoingLinks(View view) {
		Export modelElement = (Export) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Writes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSchema_2024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOutputFile_2025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getRuntimeInfo_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getSupportVector_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getCustomParam_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getInputSourceDeclaration_3003OutgoingLinks(View view) {
		InputSourceDeclaration modelElement = (InputSourceDeclaration) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getQueryParam_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAndClause_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getOrClause_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLtClause_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGtClause_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getEqClause_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getLeClause_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getGeClause_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getContainsClause_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getNotClause_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getJoinAttributesList_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getAttribute_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getPrimaryKey_3034OutgoingLinks(View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PrimaryKey_Copies_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PythonpipelineLinkDescriptor> getDataFlow_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getContainedTypeModelFacetLinks_DataFlow_4001(
			Pipeline container) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		for (Iterator<?> links = container.getDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) linkObject;
			if (DataFlowEditPart.VISUAL_ID != PythonpipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTo();
			Task src = link.getFrom();
			result.add(new PythonpipelineLinkDescriptor(src, dst, link, PythonpipelineElementTypes.DataFlow_4001,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PythonpipelineLinkDescriptor> getIncomingTypeModelFacetLinks_DataFlow_4001(Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PythonpipelinePackage.eINSTANCE.getDataFlow_To()
					|| false == setting.getEObject() instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) setting.getEObject();
			if (DataFlowEditPart.VISUAL_ID != PythonpipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getFrom();
			result.add(new PythonpipelineLinkDescriptor(src, target, link, PythonpipelineElementTypes.DataFlow_4001,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PythonpipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_InputSchema_4002(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PythonpipelinePackage.eINSTANCE.getTask_InputSchema()) {
				result.add(new PythonpipelineLinkDescriptor(setting.getEObject(), target,
						PythonpipelineElementTypes.TaskInputSchema_4002, TaskInputSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PythonpipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_OutputSchema_4003(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PythonpipelinePackage.eINSTANCE.getTask_OutputSchema()) {
				result.add(new PythonpipelineLinkDescriptor(setting.getEObject(), target,
						PythonpipelineElementTypes.TaskOutputSchema_4003, TaskOutputSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PythonpipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Export_Writes_4004(
			OutputFile target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PythonpipelinePackage.eINSTANCE.getExport_Writes()) {
				result.add(new PythonpipelineLinkDescriptor(setting.getEObject(), target,
						PythonpipelineElementTypes.ExportWrites_4004, ExportWritesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PythonpipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4005(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PythonpipelinePackage.eINSTANCE
					.getInputSourceDeclaration_SourceSchema()) {
				result.add(new PythonpipelineLinkDescriptor(setting.getEObject(), target,
						PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005,
						InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PythonpipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_PrimaryKey_Copies_4006(
			PrimaryKey target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PythonpipelinePackage.eINSTANCE.getPrimaryKey_Copies()) {
				result.add(new PythonpipelineLinkDescriptor(setting.getEObject(), target,
						PythonpipelineElementTypes.PrimaryKeyCopies_4006, PrimaryKeyCopiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getOutgoingTypeModelFacetLinks_DataFlow_4001(Task source) {
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
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		for (Iterator<?> links = container.getDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) linkObject;
			if (DataFlowEditPart.VISUAL_ID != PythonpipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTo();
			Task src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new PythonpipelineLinkDescriptor(src, dst, link, PythonpipelineElementTypes.DataFlow_4001,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_InputSchema_4002(
			Task source) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getInputSchema().iterator(); destinations.hasNext();) {
			Schema destination = (Schema) destinations.next();
			result.add(new PythonpipelineLinkDescriptor(source, destination,
					PythonpipelineElementTypes.TaskInputSchema_4002, TaskInputSchemaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_OutputSchema_4003(
			Task source) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getOutputSchema().iterator(); destinations.hasNext();) {
			Schema destination = (Schema) destinations.next();
			result.add(new PythonpipelineLinkDescriptor(source, destination,
					PythonpipelineElementTypes.TaskOutputSchema_4003, TaskOutputSchemaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Export_Writes_4004(
			Export source) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getWrites().iterator(); destinations.hasNext();) {
			OutputFile destination = (OutputFile) destinations.next();
			result.add(new PythonpipelineLinkDescriptor(source, destination,
					PythonpipelineElementTypes.ExportWrites_4004, ExportWritesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_InputSourceDeclaration_SourceSchema_4005(
			InputSourceDeclaration source) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		Schema destination = source.getSourceSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PythonpipelineLinkDescriptor(source, destination,
				PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005,
				InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PythonpipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_PrimaryKey_Copies_4006(
			PrimaryKey source) {
		LinkedList<PythonpipelineLinkDescriptor> result = new LinkedList<PythonpipelineLinkDescriptor>();
		PrimaryKey destination = source.getCopies();
		if (destination == null) {
			return result;
		}
		result.add(new PythonpipelineLinkDescriptor(source, destination,
				PythonpipelineElementTypes.PrimaryKeyCopies_4006, PrimaryKeyCopiesEditPart.VISUAL_ID));
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

		public List<PythonpipelineNodeDescriptor> getSemanticChildren(View view) {
			return PythonpipelineDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PythonpipelineLinkDescriptor> getContainedLinks(View view) {
			return PythonpipelineDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PythonpipelineLinkDescriptor> getIncomingLinks(View view) {
			return PythonpipelineDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PythonpipelineLinkDescriptor> getOutgoingLinks(View view) {
			return PythonpipelineDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
