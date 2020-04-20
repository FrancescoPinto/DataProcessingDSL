/*
 * 
 */
package pythonpipeline.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;

/**
 * @generated
 */
public class PythonpipelineEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {

			case PipelineEditPart.VISUAL_ID:
				return new PipelineEditPart(view);

			case AgglomerativeEditPart.VISUAL_ID:
				return new AgglomerativeEditPart(view);

			case AgglomerativeIdEditPart.VISUAL_ID:
				return new AgglomerativeIdEditPart(view);

			case RidgeEditPart.VISUAL_ID:
				return new RidgeEditPart(view);

			case RidgeIdEditPart.VISUAL_ID:
				return new RidgeIdEditPart(view);

			case LassoEditPart.VISUAL_ID:
				return new LassoEditPart(view);

			case LassoIdEditPart.VISUAL_ID:
				return new LassoIdEditPart(view);

			case SVMEditPart.VISUAL_ID:
				return new SVMEditPart(view);

			case SVMIdEditPart.VISUAL_ID:
				return new SVMIdEditPart(view);

			case KMeansEditPart.VISUAL_ID:
				return new KMeansEditPart(view);

			case KMeansIdEditPart.VISUAL_ID:
				return new KMeansIdEditPart(view);

			case DBSCANEditPart.VISUAL_ID:
				return new DBSCANEditPart(view);

			case DBSCANIdEditPart.VISUAL_ID:
				return new DBSCANIdEditPart(view);

			case LinearRegressionEditPart.VISUAL_ID:
				return new LinearRegressionEditPart(view);

			case LinearRegressionIdEditPart.VISUAL_ID:
				return new LinearRegressionIdEditPart(view);

			case MeanEditPart.VISUAL_ID:
				return new MeanEditPart(view);

			case MeanIdEditPart.VISUAL_ID:
				return new MeanIdEditPart(view);

			case MedianEditPart.VISUAL_ID:
				return new MedianEditPart(view);

			case MedianIdEditPart.VISUAL_ID:
				return new MedianIdEditPart(view);

			case StandardDeviationEditPart.VISUAL_ID:
				return new StandardDeviationEditPart(view);

			case StandardDeviationIdEditPart.VISUAL_ID:
				return new StandardDeviationIdEditPart(view);

			case LogisticRegressionEditPart.VISUAL_ID:
				return new LogisticRegressionEditPart(view);

			case LogisticRegressionIdEditPart.VISUAL_ID:
				return new LogisticRegressionIdEditPart(view);

			case SkewnessEditPart.VISUAL_ID:
				return new SkewnessEditPart(view);

			case SkewnessIdEditPart.VISUAL_ID:
				return new SkewnessIdEditPart(view);

			case LabeledScatterPlotEditPart.VISUAL_ID:
				return new LabeledScatterPlotEditPart(view);

			case LabeledScatterPlotIdEditPart.VISUAL_ID:
				return new LabeledScatterPlotIdEditPart(view);

			case NullValuesRemovalEditPart.VISUAL_ID:
				return new NullValuesRemovalEditPart(view);

			case NullValuesRemovalIdEditPart.VISUAL_ID:
				return new NullValuesRemovalIdEditPart(view);

			case CustomCleaningEditPart.VISUAL_ID:
				return new CustomCleaningEditPart(view);

			case CustomCleaningIdEditPart.VISUAL_ID:
				return new CustomCleaningIdEditPart(view);

			case ChangeDataFormatEditPart.VISUAL_ID:
				return new ChangeDataFormatEditPart(view);

			case ChangeDataFormatIdEditPart.VISUAL_ID:
				return new ChangeDataFormatIdEditPart(view);

			case ScatterPlotEditPart.VISUAL_ID:
				return new ScatterPlotEditPart(view);

			case ScatterPlotIdEditPart.VISUAL_ID:
				return new ScatterPlotIdEditPart(view);

			case HistogramEditPart.VISUAL_ID:
				return new HistogramEditPart(view);

			case HistogramIdEditPart.VISUAL_ID:
				return new HistogramIdEditPart(view);

			case PiePlotEditPart.VISUAL_ID:
				return new PiePlotEditPart(view);

			case PiePlotIdEditPart.VISUAL_ID:
				return new PiePlotIdEditPart(view);

			case ProjectOnAttributesEditPart.VISUAL_ID:
				return new ProjectOnAttributesEditPart(view);

			case ProjectOnAttributesIdEditPart.VISUAL_ID:
				return new ProjectOnAttributesIdEditPart(view);

			case DataCollectionEditPart.VISUAL_ID:
				return new DataCollectionEditPart(view);

			case DataCollectionIdEditPart.VISUAL_ID:
				return new DataCollectionIdEditPart(view);

			case DataIntegrationEditPart.VISUAL_ID:
				return new DataIntegrationEditPart(view);

			case DataIntegrationIdEditPart.VISUAL_ID:
				return new DataIntegrationIdEditPart(view);

			case ExportEditPart.VISUAL_ID:
				return new ExportEditPart(view);

			case ExportIdEditPart.VISUAL_ID:
				return new ExportIdEditPart(view);

			case SchemaEditPart.VISUAL_ID:
				return new SchemaEditPart(view);

			case SchemaIdEditPart.VISUAL_ID:
				return new SchemaIdEditPart(view);

			case OutputFileEditPart.VISUAL_ID:
				return new OutputFileEditPart(view);

			case OutputFileNameEditPart.VISUAL_ID:
				return new OutputFileNameEditPart(view);

			case RuntimeInfoEditPart.VISUAL_ID:
				return new RuntimeInfoEditPart(view);

			case RuntimeInfoExecutionIdEditPart.VISUAL_ID:
				return new RuntimeInfoExecutionIdEditPart(view);

			case SupportVectorEditPart.VISUAL_ID:
				return new SupportVectorEditPart(view);

			case SupportVectorIndexEditPart.VISUAL_ID:
				return new SupportVectorIndexEditPart(view);

			case CustomParamEditPart.VISUAL_ID:
				return new CustomParamEditPart(view);

			case CustomParamNameEditPart.VISUAL_ID:
				return new CustomParamNameEditPart(view);

			case InputSourceDeclarationEditPart.VISUAL_ID:
				return new InputSourceDeclarationEditPart(view);

			case InputSourceDeclarationSourceURIEditPart.VISUAL_ID:
				return new InputSourceDeclarationSourceURIEditPart(view);

			case AndClauseEditPart.VISUAL_ID:
				return new AndClauseEditPart(view);

			case AndClauseIdEditPart.VISUAL_ID:
				return new AndClauseIdEditPart(view);

			case AndClause2EditPart.VISUAL_ID:
				return new AndClause2EditPart(view);

			case AndClauseId2EditPart.VISUAL_ID:
				return new AndClauseId2EditPart(view);

			case OrClauseEditPart.VISUAL_ID:
				return new OrClauseEditPart(view);

			case OrClauseIdEditPart.VISUAL_ID:
				return new OrClauseIdEditPart(view);

			case LtClauseEditPart.VISUAL_ID:
				return new LtClauseEditPart(view);

			case LtClauseIdEditPart.VISUAL_ID:
				return new LtClauseIdEditPart(view);

			case QueryParamEditPart.VISUAL_ID:
				return new QueryParamEditPart(view);

			case QueryParamNameEditPart.VISUAL_ID:
				return new QueryParamNameEditPart(view);

			case GtClauseEditPart.VISUAL_ID:
				return new GtClauseEditPart(view);

			case GtClauseIdEditPart.VISUAL_ID:
				return new GtClauseIdEditPart(view);

			case EqClauseEditPart.VISUAL_ID:
				return new EqClauseEditPart(view);

			case EqClauseIdEditPart.VISUAL_ID:
				return new EqClauseIdEditPart(view);

			case LeClauseEditPart.VISUAL_ID:
				return new LeClauseEditPart(view);

			case LeClauseIdEditPart.VISUAL_ID:
				return new LeClauseIdEditPart(view);

			case GeClauseEditPart.VISUAL_ID:
				return new GeClauseEditPart(view);

			case GeClauseIdEditPart.VISUAL_ID:
				return new GeClauseIdEditPart(view);

			case ContainsClauseEditPart.VISUAL_ID:
				return new ContainsClauseEditPart(view);

			case ContainsClauseIdEditPart.VISUAL_ID:
				return new ContainsClauseIdEditPart(view);

			case NotClauseEditPart.VISUAL_ID:
				return new NotClauseEditPart(view);

			case NotClauseIdEditPart.VISUAL_ID:
				return new NotClauseIdEditPart(view);

			case AndClause3EditPart.VISUAL_ID:
				return new AndClause3EditPart(view);

			case AndClauseId3EditPart.VISUAL_ID:
				return new AndClauseId3EditPart(view);

			case OrClause2EditPart.VISUAL_ID:
				return new OrClause2EditPart(view);

			case OrClauseId2EditPart.VISUAL_ID:
				return new OrClauseId2EditPart(view);

			case LtClause2EditPart.VISUAL_ID:
				return new LtClause2EditPart(view);

			case LtClauseId2EditPart.VISUAL_ID:
				return new LtClauseId2EditPart(view);

			case GtClause2EditPart.VISUAL_ID:
				return new GtClause2EditPart(view);

			case GtClauseId2EditPart.VISUAL_ID:
				return new GtClauseId2EditPart(view);

			case EqClause2EditPart.VISUAL_ID:
				return new EqClause2EditPart(view);

			case EqClauseId2EditPart.VISUAL_ID:
				return new EqClauseId2EditPart(view);

			case LeClause2EditPart.VISUAL_ID:
				return new LeClause2EditPart(view);

			case LeClauseId2EditPart.VISUAL_ID:
				return new LeClauseId2EditPart(view);

			case GeClause2EditPart.VISUAL_ID:
				return new GeClause2EditPart(view);

			case GeClauseId2EditPart.VISUAL_ID:
				return new GeClauseId2EditPart(view);

			case ContainsClause2EditPart.VISUAL_ID:
				return new ContainsClause2EditPart(view);

			case ContainsClauseId2EditPart.VISUAL_ID:
				return new ContainsClauseId2EditPart(view);

			case NotClause2EditPart.VISUAL_ID:
				return new NotClause2EditPart(view);

			case NotClauseId2EditPart.VISUAL_ID:
				return new NotClauseId2EditPart(view);

			case OrClause3EditPart.VISUAL_ID:
				return new OrClause3EditPart(view);

			case OrClauseId3EditPart.VISUAL_ID:
				return new OrClauseId3EditPart(view);

			case LtClause3EditPart.VISUAL_ID:
				return new LtClause3EditPart(view);

			case LtClauseId3EditPart.VISUAL_ID:
				return new LtClauseId3EditPart(view);

			case GtClause3EditPart.VISUAL_ID:
				return new GtClause3EditPart(view);

			case GtClauseId3EditPart.VISUAL_ID:
				return new GtClauseId3EditPart(view);

			case EqClause3EditPart.VISUAL_ID:
				return new EqClause3EditPart(view);

			case EqClauseId3EditPart.VISUAL_ID:
				return new EqClauseId3EditPart(view);

			case LeClause3EditPart.VISUAL_ID:
				return new LeClause3EditPart(view);

			case LeClauseId3EditPart.VISUAL_ID:
				return new LeClauseId3EditPart(view);

			case GeClause3EditPart.VISUAL_ID:
				return new GeClause3EditPart(view);

			case GeClauseId3EditPart.VISUAL_ID:
				return new GeClauseId3EditPart(view);

			case ContainsClause3EditPart.VISUAL_ID:
				return new ContainsClause3EditPart(view);

			case ContainsClauseId3EditPart.VISUAL_ID:
				return new ContainsClauseId3EditPart(view);

			case NotClause3EditPart.VISUAL_ID:
				return new NotClause3EditPart(view);

			case NotClauseId3EditPart.VISUAL_ID:
				return new NotClauseId3EditPart(view);

			case JoinAttributesListEditPart.VISUAL_ID:
				return new JoinAttributesListEditPart(view);

			case JoinAttributesListIdEditPart.VISUAL_ID:
				return new JoinAttributesListIdEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case PrimaryKeyEditPart.VISUAL_ID:
				return new PrimaryKeyEditPart(view);

			case PrimaryKeyNameEditPart.VISUAL_ID:
				return new PrimaryKeyNameEditPart(view);

			case AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new AgglomerativeAgglomerativeRuntimeInfoCompartmentEditPart(view);

			case RidgeRidgeRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new RidgeRidgeRuntimeInfoCompartmentEditPart(view);

			case LassoLassoRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new LassoLassoRuntimeInfoCompartmentEditPart(view);

			case SVMSVMRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new SVMSVMRuntimeInfoCompartmentEditPart(view);

			case SVMSVMSupportVectorsCompartmentEditPart.VISUAL_ID:
				return new SVMSVMSupportVectorsCompartmentEditPart(view);

			case KMeansKMeansRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new KMeansKMeansRuntimeInfoCompartmentEditPart(view);

			case DBSCANDBSCANRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new DBSCANDBSCANRuntimeInfoCompartmentEditPart(view);

			case LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new LinearRegressionLinearRegressionRuntimeInfoCompartmentEditPart(view);

			case MeanMeanRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new MeanMeanRuntimeInfoCompartmentEditPart(view);

			case MedianMedianRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new MedianMedianRuntimeInfoCompartmentEditPart(view);

			case StandardDeviationStandardDeviationRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new StandardDeviationStandardDeviationRuntimeInfoCompartmentEditPart(view);

			case LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new LogisticRegressionLogisticRegressionRuntimeInfoCompartmentEditPart(view);

			case SkewnessSkewnessRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new SkewnessSkewnessRuntimeInfoCompartmentEditPart(view);

			case LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new LabeledScatterPlotLabeledScatterPlotRuntimeInfoCompartmentEditPart(view);

			case NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new NullValuesRemovalNullValuesRemovalRuntimeInfoCompartmentEditPart(view);

			case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart(view);

			case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
				return new CustomCleaningCustomCleaningCustomParamsCompartmentEditPart(view);

			case ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new ChangeDataFormatChangeDataFormatRuntimeInfoCompartmentEditPart(view);

			case ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new ScatterPlotScatterPlotRuntimeInfoCompartmentEditPart(view);

			case HistogramHistogramRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new HistogramHistogramRuntimeInfoCompartmentEditPart(view);

			case PiePlotPiePlotRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new PiePlotPiePlotRuntimeInfoCompartmentEditPart(view);

			case ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new ProjectOnAttributesProjectOnAttributesRuntimeInfoCompartmentEditPart(view);

			case DataCollectionDataCollectionRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new DataCollectionDataCollectionRuntimeInfoCompartmentEditPart(view);

			case DataCollectionDataCollectionSourceDeclarationCompartmentEditPart.VISUAL_ID:
				return new DataCollectionDataCollectionSourceDeclarationCompartmentEditPart(view);

			case InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart.VISUAL_ID:
				return new InputSourceDeclarationInputSourceDeclarationQueryConditionsCompartmentEditPart(view);

			case AndClauseAndClauseOperandsCompartmentEditPart.VISUAL_ID:
				return new AndClauseAndClauseOperandsCompartmentEditPart(view);

			case AndClauseAndClauseOperandsCompartment2EditPart.VISUAL_ID:
				return new AndClauseAndClauseOperandsCompartment2EditPart(view);

			case OrClauseOrClauseOperandsCompartmentEditPart.VISUAL_ID:
				return new OrClauseOrClauseOperandsCompartmentEditPart(view);

			case LtClauseLtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
				return new LtClauseLtClauseConditionFieldCompartmentEditPart(view);

			case GtClauseGtClauseConditionFieldCompartmentEditPart.VISUAL_ID:
				return new GtClauseGtClauseConditionFieldCompartmentEditPart(view);

			case EqClauseEqClauseConditionFieldCompartmentEditPart.VISUAL_ID:
				return new EqClauseEqClauseConditionFieldCompartmentEditPart(view);

			case LeClauseLeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
				return new LeClauseLeClauseConditionFieldCompartmentEditPart(view);

			case GeClauseGeClauseConditionFieldCompartmentEditPart.VISUAL_ID:
				return new GeClauseGeClauseConditionFieldCompartmentEditPart(view);

			case ContainsClauseContainsClauseConditionFieldCompartmentEditPart.VISUAL_ID:
				return new ContainsClauseContainsClauseConditionFieldCompartmentEditPart(view);

			case NotClauseNotClauseSubClauseCompartmentEditPart.VISUAL_ID:
				return new NotClauseNotClauseSubClauseCompartmentEditPart(view);

			case AndClauseAndClauseOperandsCompartment3EditPart.VISUAL_ID:
				return new AndClauseAndClauseOperandsCompartment3EditPart(view);

			case OrClauseOrClauseOperandsCompartment2EditPart.VISUAL_ID:
				return new OrClauseOrClauseOperandsCompartment2EditPart(view);

			case LtClauseLtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
				return new LtClauseLtClauseConditionFieldCompartment2EditPart(view);

			case GtClauseGtClauseConditionFieldCompartment2EditPart.VISUAL_ID:
				return new GtClauseGtClauseConditionFieldCompartment2EditPart(view);

			case EqClauseEqClauseConditionFieldCompartment2EditPart.VISUAL_ID:
				return new EqClauseEqClauseConditionFieldCompartment2EditPart(view);

			case LeClauseLeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
				return new LeClauseLeClauseConditionFieldCompartment2EditPart(view);

			case GeClauseGeClauseConditionFieldCompartment2EditPart.VISUAL_ID:
				return new GeClauseGeClauseConditionFieldCompartment2EditPart(view);

			case ContainsClauseContainsClauseConditionFieldCompartment2EditPart.VISUAL_ID:
				return new ContainsClauseContainsClauseConditionFieldCompartment2EditPart(view);

			case NotClauseNotClauseSubClauseCompartment2EditPart.VISUAL_ID:
				return new NotClauseNotClauseSubClauseCompartment2EditPart(view);

			case OrClauseOrClauseOperandsCompartment3EditPart.VISUAL_ID:
				return new OrClauseOrClauseOperandsCompartment3EditPart(view);

			case LtClauseLtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
				return new LtClauseLtClauseConditionFieldCompartment3EditPart(view);

			case GtClauseGtClauseConditionFieldCompartment3EditPart.VISUAL_ID:
				return new GtClauseGtClauseConditionFieldCompartment3EditPart(view);

			case EqClauseEqClauseConditionFieldCompartment3EditPart.VISUAL_ID:
				return new EqClauseEqClauseConditionFieldCompartment3EditPart(view);

			case LeClauseLeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
				return new LeClauseLeClauseConditionFieldCompartment3EditPart(view);

			case GeClauseGeClauseConditionFieldCompartment3EditPart.VISUAL_ID:
				return new GeClauseGeClauseConditionFieldCompartment3EditPart(view);

			case ContainsClauseContainsClauseConditionFieldCompartment3EditPart.VISUAL_ID:
				return new ContainsClauseContainsClauseConditionFieldCompartment3EditPart(view);

			case NotClauseNotClauseSubClauseCompartment3EditPart.VISUAL_ID:
				return new NotClauseNotClauseSubClauseCompartment3EditPart(view);

			case DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new DataIntegrationDataIntegrationRuntimeInfoCompartmentEditPart(view);

			case DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart.VISUAL_ID:
				return new DataIntegrationDataIntegrationJoinAttributesListCompartmentEditPart(view);

			case ExportExportRuntimeInfoCompartmentEditPart.VISUAL_ID:
				return new ExportExportRuntimeInfoCompartmentEditPart(view);

			case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
				return new SchemaSchemaAttributesCompartmentEditPart(view);

			case SchemaSchemaIdColumnCompartmentEditPart.VISUAL_ID:
				return new SchemaSchemaIdColumnCompartmentEditPart(view);

			case DataFlowEditPart.VISUAL_ID:
				return new DataFlowEditPart(view);

			case DataFlowFormatEditPart.VISUAL_ID:
				return new DataFlowFormatEditPart(view);

			case TaskInputSchemaEditPart.VISUAL_ID:
				return new TaskInputSchemaEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case TaskOutputSchemaEditPart.VISUAL_ID:
				return new TaskOutputSchemaEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ExportWritesEditPart.VISUAL_ID:
				return new ExportWritesEditPart(view);

			case ExportWritesExternalLabelEditPart.VISUAL_ID:
				return new ExportWritesExternalLabelEditPart(view);

			case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
				return new InputSourceDeclarationSourceSchemaEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case PrimaryKeyCopiesEditPart.VISUAL_ID:
				return new PrimaryKeyCopiesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
