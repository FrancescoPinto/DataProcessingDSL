/*
* 
*/
package pythonpipeline.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import pythonpipeline.diagram.edit.commands.AgglomerativeCreateCommand;
import pythonpipeline.diagram.edit.commands.ChangeDataFormatCreateCommand;
import pythonpipeline.diagram.edit.commands.CustomCleaningCreateCommand;
import pythonpipeline.diagram.edit.commands.DBSCANCreateCommand;
import pythonpipeline.diagram.edit.commands.DataCollectionCreateCommand;
import pythonpipeline.diagram.edit.commands.DataIntegrationCreateCommand;
import pythonpipeline.diagram.edit.commands.ExportCreateCommand;
import pythonpipeline.diagram.edit.commands.HistogramCreateCommand;
import pythonpipeline.diagram.edit.commands.KMeansCreateCommand;
import pythonpipeline.diagram.edit.commands.LabeledScatterPlotCreateCommand;
import pythonpipeline.diagram.edit.commands.LassoCreateCommand;
import pythonpipeline.diagram.edit.commands.LinearRegressionCreateCommand;
import pythonpipeline.diagram.edit.commands.LogisticRegressionCreateCommand;
import pythonpipeline.diagram.edit.commands.MeanCreateCommand;
import pythonpipeline.diagram.edit.commands.MedianCreateCommand;
import pythonpipeline.diagram.edit.commands.NullValuesRemovalCreateCommand;
import pythonpipeline.diagram.edit.commands.OutputFileCreateCommand;
import pythonpipeline.diagram.edit.commands.PiePlotCreateCommand;
import pythonpipeline.diagram.edit.commands.ProjectOnAttributesCreateCommand;
import pythonpipeline.diagram.edit.commands.RidgeCreateCommand;
import pythonpipeline.diagram.edit.commands.SVMCreateCommand;
import pythonpipeline.diagram.edit.commands.ScatterPlotCreateCommand;
import pythonpipeline.diagram.edit.commands.SchemaCreateCommand;
import pythonpipeline.diagram.edit.commands.SkewnessCreateCommand;
import pythonpipeline.diagram.edit.commands.StandardDeviationCreateCommand;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class PipelineItemSemanticEditPolicy extends PythonpipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PipelineItemSemanticEditPolicy() {
		super(PythonpipelineElementTypes.Pipeline_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PythonpipelineElementTypes.Agglomerative_2001 == req.getElementType()) {
			return getGEFWrapper(new AgglomerativeCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Ridge_2002 == req.getElementType()) {
			return getGEFWrapper(new RidgeCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Lasso_2003 == req.getElementType()) {
			return getGEFWrapper(new LassoCreateCommand(req));
		}
		if (PythonpipelineElementTypes.SVM_2004 == req.getElementType()) {
			return getGEFWrapper(new SVMCreateCommand(req));
		}
		if (PythonpipelineElementTypes.KMeans_2005 == req.getElementType()) {
			return getGEFWrapper(new KMeansCreateCommand(req));
		}
		if (PythonpipelineElementTypes.DBSCAN_2006 == req.getElementType()) {
			return getGEFWrapper(new DBSCANCreateCommand(req));
		}
		if (PythonpipelineElementTypes.LinearRegression_2007 == req.getElementType()) {
			return getGEFWrapper(new LinearRegressionCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Mean_2008 == req.getElementType()) {
			return getGEFWrapper(new MeanCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Median_2009 == req.getElementType()) {
			return getGEFWrapper(new MedianCreateCommand(req));
		}
		if (PythonpipelineElementTypes.StandardDeviation_2010 == req.getElementType()) {
			return getGEFWrapper(new StandardDeviationCreateCommand(req));
		}
		if (PythonpipelineElementTypes.LogisticRegression_2011 == req.getElementType()) {
			return getGEFWrapper(new LogisticRegressionCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Skewness_2012 == req.getElementType()) {
			return getGEFWrapper(new SkewnessCreateCommand(req));
		}
		if (PythonpipelineElementTypes.LabeledScatterPlot_2013 == req.getElementType()) {
			return getGEFWrapper(new LabeledScatterPlotCreateCommand(req));
		}
		if (PythonpipelineElementTypes.NullValuesRemoval_2014 == req.getElementType()) {
			return getGEFWrapper(new NullValuesRemovalCreateCommand(req));
		}
		if (PythonpipelineElementTypes.CustomCleaning_2015 == req.getElementType()) {
			return getGEFWrapper(new CustomCleaningCreateCommand(req));
		}
		if (PythonpipelineElementTypes.ChangeDataFormat_2016 == req.getElementType()) {
			return getGEFWrapper(new ChangeDataFormatCreateCommand(req));
		}
		if (PythonpipelineElementTypes.ScatterPlot_2017 == req.getElementType()) {
			return getGEFWrapper(new ScatterPlotCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Histogram_2018 == req.getElementType()) {
			return getGEFWrapper(new HistogramCreateCommand(req));
		}
		if (PythonpipelineElementTypes.PiePlot_2019 == req.getElementType()) {
			return getGEFWrapper(new PiePlotCreateCommand(req));
		}
		if (PythonpipelineElementTypes.ProjectOnAttributes_2020 == req.getElementType()) {
			return getGEFWrapper(new ProjectOnAttributesCreateCommand(req));
		}
		if (PythonpipelineElementTypes.DataCollection_2021 == req.getElementType()) {
			return getGEFWrapper(new DataCollectionCreateCommand(req));
		}
		if (PythonpipelineElementTypes.DataIntegration_2022 == req.getElementType()) {
			return getGEFWrapper(new DataIntegrationCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Export_2023 == req.getElementType()) {
			return getGEFWrapper(new ExportCreateCommand(req));
		}
		if (PythonpipelineElementTypes.Schema_2024 == req.getElementType()) {
			return getGEFWrapper(new SchemaCreateCommand(req));
		}
		if (PythonpipelineElementTypes.OutputFile_2025 == req.getElementType()) {
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
