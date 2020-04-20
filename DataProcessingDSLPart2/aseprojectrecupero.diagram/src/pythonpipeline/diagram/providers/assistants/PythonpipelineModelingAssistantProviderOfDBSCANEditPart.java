/*
 * 
 */
package pythonpipeline.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pythonpipeline.diagram.edit.parts.AgglomerativeEditPart;
import pythonpipeline.diagram.edit.parts.ChangeDataFormatEditPart;
import pythonpipeline.diagram.edit.parts.CustomCleaningEditPart;
import pythonpipeline.diagram.edit.parts.DBSCANEditPart;
import pythonpipeline.diagram.edit.parts.DataCollectionEditPart;
import pythonpipeline.diagram.edit.parts.DataIntegrationEditPart;
import pythonpipeline.diagram.edit.parts.ExportEditPart;
import pythonpipeline.diagram.edit.parts.HistogramEditPart;
import pythonpipeline.diagram.edit.parts.KMeansEditPart;
import pythonpipeline.diagram.edit.parts.LabeledScatterPlotEditPart;
import pythonpipeline.diagram.edit.parts.LassoEditPart;
import pythonpipeline.diagram.edit.parts.LinearRegressionEditPart;
import pythonpipeline.diagram.edit.parts.LogisticRegressionEditPart;
import pythonpipeline.diagram.edit.parts.MeanEditPart;
import pythonpipeline.diagram.edit.parts.MedianEditPart;
import pythonpipeline.diagram.edit.parts.NullValuesRemovalEditPart;
import pythonpipeline.diagram.edit.parts.PiePlotEditPart;
import pythonpipeline.diagram.edit.parts.ProjectOnAttributesEditPart;
import pythonpipeline.diagram.edit.parts.RidgeEditPart;
import pythonpipeline.diagram.edit.parts.SVMEditPart;
import pythonpipeline.diagram.edit.parts.ScatterPlotEditPart;
import pythonpipeline.diagram.edit.parts.SchemaEditPart;
import pythonpipeline.diagram.edit.parts.SkewnessEditPart;
import pythonpipeline.diagram.edit.parts.StandardDeviationEditPart;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;
import pythonpipeline.diagram.providers.PythonpipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PythonpipelineModelingAssistantProviderOfDBSCANEditPart extends PythonpipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DBSCANEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DBSCANEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.DataFlow_4001);
		types.add(PythonpipelineElementTypes.TaskInputSchema_4002);
		types.add(PythonpipelineElementTypes.TaskOutputSchema_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DBSCANEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DBSCANEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AgglomerativeEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof RidgeEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof LassoEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof SVMEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof KMeansEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof DBSCANEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof LinearRegressionEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof MeanEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof MedianEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof StandardDeviationEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof LogisticRegressionEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof SkewnessEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof LabeledScatterPlotEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof NullValuesRemovalEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof CustomCleaningEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof ChangeDataFormatEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof ScatterPlotEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof HistogramEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof PiePlotEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof ProjectOnAttributesEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof DataCollectionEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof DataIntegrationEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof ExportEditPart) {
			types.add(PythonpipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof SchemaEditPart) {
			types.add(PythonpipelineElementTypes.TaskInputSchema_4002);
		}
		if (targetEditPart instanceof SchemaEditPart) {
			types.add(PythonpipelineElementTypes.TaskOutputSchema_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DBSCANEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DBSCANEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PythonpipelineElementTypes.DataFlow_4001) {
			types.add(PythonpipelineElementTypes.Agglomerative_2001);
			types.add(PythonpipelineElementTypes.Ridge_2002);
			types.add(PythonpipelineElementTypes.Lasso_2003);
			types.add(PythonpipelineElementTypes.SVM_2004);
			types.add(PythonpipelineElementTypes.KMeans_2005);
			types.add(PythonpipelineElementTypes.DBSCAN_2006);
			types.add(PythonpipelineElementTypes.LinearRegression_2007);
			types.add(PythonpipelineElementTypes.Mean_2008);
			types.add(PythonpipelineElementTypes.Median_2009);
			types.add(PythonpipelineElementTypes.StandardDeviation_2010);
			types.add(PythonpipelineElementTypes.LogisticRegression_2011);
			types.add(PythonpipelineElementTypes.Skewness_2012);
			types.add(PythonpipelineElementTypes.LabeledScatterPlot_2013);
			types.add(PythonpipelineElementTypes.NullValuesRemoval_2014);
			types.add(PythonpipelineElementTypes.CustomCleaning_2015);
			types.add(PythonpipelineElementTypes.ChangeDataFormat_2016);
			types.add(PythonpipelineElementTypes.ScatterPlot_2017);
			types.add(PythonpipelineElementTypes.Histogram_2018);
			types.add(PythonpipelineElementTypes.PiePlot_2019);
			types.add(PythonpipelineElementTypes.ProjectOnAttributes_2020);
			types.add(PythonpipelineElementTypes.DataCollection_2021);
			types.add(PythonpipelineElementTypes.DataIntegration_2022);
			types.add(PythonpipelineElementTypes.Export_2023);
		} else if (relationshipType == PythonpipelineElementTypes.TaskInputSchema_4002) {
			types.add(PythonpipelineElementTypes.Schema_2024);
		} else if (relationshipType == PythonpipelineElementTypes.TaskOutputSchema_4003) {
			types.add(PythonpipelineElementTypes.Schema_2024);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DBSCANEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DBSCANEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PythonpipelineElementTypes.DataFlow_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DBSCANEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DBSCANEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PythonpipelineElementTypes.DataFlow_4001) {
			types.add(PythonpipelineElementTypes.Agglomerative_2001);
			types.add(PythonpipelineElementTypes.Ridge_2002);
			types.add(PythonpipelineElementTypes.Lasso_2003);
			types.add(PythonpipelineElementTypes.SVM_2004);
			types.add(PythonpipelineElementTypes.KMeans_2005);
			types.add(PythonpipelineElementTypes.DBSCAN_2006);
			types.add(PythonpipelineElementTypes.LinearRegression_2007);
			types.add(PythonpipelineElementTypes.Mean_2008);
			types.add(PythonpipelineElementTypes.Median_2009);
			types.add(PythonpipelineElementTypes.StandardDeviation_2010);
			types.add(PythonpipelineElementTypes.LogisticRegression_2011);
			types.add(PythonpipelineElementTypes.Skewness_2012);
			types.add(PythonpipelineElementTypes.LabeledScatterPlot_2013);
			types.add(PythonpipelineElementTypes.NullValuesRemoval_2014);
			types.add(PythonpipelineElementTypes.CustomCleaning_2015);
			types.add(PythonpipelineElementTypes.ChangeDataFormat_2016);
			types.add(PythonpipelineElementTypes.ScatterPlot_2017);
			types.add(PythonpipelineElementTypes.Histogram_2018);
			types.add(PythonpipelineElementTypes.PiePlot_2019);
			types.add(PythonpipelineElementTypes.ProjectOnAttributes_2020);
			types.add(PythonpipelineElementTypes.DataCollection_2021);
			types.add(PythonpipelineElementTypes.DataIntegration_2022);
			types.add(PythonpipelineElementTypes.Export_2023);
		}
		return types;
	}

}
