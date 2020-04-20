/*
* 
*/
package pipelineproject.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import pipelineproject.diagram.edit.commands.AgglomerativeCreateCommand;
import pipelineproject.diagram.edit.commands.ChangeDataFormatCreateCommand;
import pipelineproject.diagram.edit.commands.CustomCleaningCreateCommand;
import pipelineproject.diagram.edit.commands.DBSCANCreateCommand;
import pipelineproject.diagram.edit.commands.DataCollectionCreateCommand;
import pipelineproject.diagram.edit.commands.DataIntegrationCreateCommand;
import pipelineproject.diagram.edit.commands.ExportCreateCommand;
import pipelineproject.diagram.edit.commands.HistogramCreateCommand;
import pipelineproject.diagram.edit.commands.JarvisPatrickCreateCommand;
import pipelineproject.diagram.edit.commands.KMeansCreateCommand;
import pipelineproject.diagram.edit.commands.KNNCreateCommand;
import pipelineproject.diagram.edit.commands.LabeledScatterPlotCreateCommand;
import pipelineproject.diagram.edit.commands.LassoCreateCommand;
import pipelineproject.diagram.edit.commands.LinearRegressionCreateCommand;
import pipelineproject.diagram.edit.commands.LogisticRegressionCreateCommand;
import pipelineproject.diagram.edit.commands.MeanCreateCommand;
import pipelineproject.diagram.edit.commands.MedianCreateCommand;
import pipelineproject.diagram.edit.commands.NullValuesRemovalCreateCommand;
import pipelineproject.diagram.edit.commands.OutputFileCreateCommand;
import pipelineproject.diagram.edit.commands.PiePlotCreateCommand;
import pipelineproject.diagram.edit.commands.ProjectOnAttributesCreateCommand;
import pipelineproject.diagram.edit.commands.RidgeCreateCommand;
import pipelineproject.diagram.edit.commands.SVMCreateCommand;
import pipelineproject.diagram.edit.commands.ScatterPlotCreateCommand;
import pipelineproject.diagram.edit.commands.SchemaCreateCommand;
import pipelineproject.diagram.edit.commands.SkewnessCreateCommand;
import pipelineproject.diagram.edit.commands.VarianceCreateCommand;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class PipelineItemSemanticEditPolicy extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PipelineItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.Pipeline_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineprojectElementTypes.Agglomerative_2035 == req.getElementType()) {
			return getGEFWrapper(new AgglomerativeCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Ridge_2036 == req.getElementType()) {
			return getGEFWrapper(new RidgeCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Lasso_2037 == req.getElementType()) {
			return getGEFWrapper(new LassoCreateCommand(req));
		}
		if (PipelineprojectElementTypes.KNN_2038 == req.getElementType()) {
			return getGEFWrapper(new KNNCreateCommand(req));
		}
		if (PipelineprojectElementTypes.SVM_2039 == req.getElementType()) {
			return getGEFWrapper(new SVMCreateCommand(req));
		}
		if (PipelineprojectElementTypes.KMeans_2041 == req.getElementType()) {
			return getGEFWrapper(new KMeansCreateCommand(req));
		}
		if (PipelineprojectElementTypes.DBSCAN_2042 == req.getElementType()) {
			return getGEFWrapper(new DBSCANCreateCommand(req));
		}
		if (PipelineprojectElementTypes.JarvisPatrick_2043 == req.getElementType()) {
			return getGEFWrapper(new JarvisPatrickCreateCommand(req));
		}
		if (PipelineprojectElementTypes.LinearRegression_2044 == req.getElementType()) {
			return getGEFWrapper(new LinearRegressionCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Mean_2045 == req.getElementType()) {
			return getGEFWrapper(new MeanCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Median_2046 == req.getElementType()) {
			return getGEFWrapper(new MedianCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Variance_2047 == req.getElementType()) {
			return getGEFWrapper(new VarianceCreateCommand(req));
		}
		if (PipelineprojectElementTypes.LogisticRegression_2059 == req.getElementType()) {
			return getGEFWrapper(new LogisticRegressionCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Skewness_2060 == req.getElementType()) {
			return getGEFWrapper(new SkewnessCreateCommand(req));
		}
		if (PipelineprojectElementTypes.LabeledScatterPlot_2062 == req.getElementType()) {
			return getGEFWrapper(new LabeledScatterPlotCreateCommand(req));
		}
		if (PipelineprojectElementTypes.NullValuesRemoval_2050 == req.getElementType()) {
			return getGEFWrapper(new NullValuesRemovalCreateCommand(req));
		}
		if (PipelineprojectElementTypes.CustomCleaning_2051 == req.getElementType()) {
			return getGEFWrapper(new CustomCleaningCreateCommand(req));
		}
		if (PipelineprojectElementTypes.ChangeDataFormat_2052 == req.getElementType()) {
			return getGEFWrapper(new ChangeDataFormatCreateCommand(req));
		}
		if (PipelineprojectElementTypes.ScatterPlot_2063 == req.getElementType()) {
			return getGEFWrapper(new ScatterPlotCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Histogram_2064 == req.getElementType()) {
			return getGEFWrapper(new HistogramCreateCommand(req));
		}
		if (PipelineprojectElementTypes.PiePlot_2065 == req.getElementType()) {
			return getGEFWrapper(new PiePlotCreateCommand(req));
		}
		if (PipelineprojectElementTypes.ProjectOnAttributes_2066 == req.getElementType()) {
			return getGEFWrapper(new ProjectOnAttributesCreateCommand(req));
		}
		if (PipelineprojectElementTypes.DataCollection_2053 == req.getElementType()) {
			return getGEFWrapper(new DataCollectionCreateCommand(req));
		}
		if (PipelineprojectElementTypes.DataIntegration_2054 == req.getElementType()) {
			return getGEFWrapper(new DataIntegrationCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Export_2056 == req.getElementType()) {
			return getGEFWrapper(new ExportCreateCommand(req));
		}
		if (PipelineprojectElementTypes.Schema_2057 == req.getElementType()) {
			return getGEFWrapper(new SchemaCreateCommand(req));
		}
		if (PipelineprojectElementTypes.OutputFile_2058 == req.getElementType()) {
			return getGEFWrapper(new OutputFileCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
