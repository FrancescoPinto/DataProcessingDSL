/*
 * 
 */
package pipelineproject.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipelineproject.diagram.edit.parts.AgglomerativeEditPart;
import pipelineproject.diagram.edit.parts.ChangeDataFormatEditPart;
import pipelineproject.diagram.edit.parts.CustomCleaningEditPart;
import pipelineproject.diagram.edit.parts.DBSCANEditPart;
import pipelineproject.diagram.edit.parts.DataCollectionEditPart;
import pipelineproject.diagram.edit.parts.DataIntegrationEditPart;
import pipelineproject.diagram.edit.parts.ExportEditPart;
import pipelineproject.diagram.edit.parts.HistogramEditPart;
import pipelineproject.diagram.edit.parts.JarvisPatrickEditPart;
import pipelineproject.diagram.edit.parts.KMeansEditPart;
import pipelineproject.diagram.edit.parts.KNNEditPart;
import pipelineproject.diagram.edit.parts.LabeledScatterPlotEditPart;
import pipelineproject.diagram.edit.parts.LassoEditPart;
import pipelineproject.diagram.edit.parts.LinearRegressionEditPart;
import pipelineproject.diagram.edit.parts.LogisticRegressionEditPart;
import pipelineproject.diagram.edit.parts.MeanEditPart;
import pipelineproject.diagram.edit.parts.MedianEditPart;
import pipelineproject.diagram.edit.parts.NullValuesRemovalEditPart;
import pipelineproject.diagram.edit.parts.PiePlotEditPart;
import pipelineproject.diagram.edit.parts.ProjectOnAttributesEditPart;
import pipelineproject.diagram.edit.parts.RidgeEditPart;
import pipelineproject.diagram.edit.parts.SVMEditPart;
import pipelineproject.diagram.edit.parts.ScatterPlotEditPart;
import pipelineproject.diagram.edit.parts.SchemaEditPart;
import pipelineproject.diagram.edit.parts.SkewnessEditPart;
import pipelineproject.diagram.edit.parts.VarianceEditPart;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;
import pipelineproject.diagram.providers.PipelineprojectModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineprojectModelingAssistantProviderOfMeanEditPart extends PipelineprojectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MeanEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(MeanEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.DataFlow_4007);
		types.add(PipelineprojectElementTypes.TaskInputSchema_4015);
		types.add(PipelineprojectElementTypes.TaskOutputSchema_4016);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((MeanEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(MeanEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AgglomerativeEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof RidgeEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof LassoEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof KNNEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof SVMEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof KMeansEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof DBSCANEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof JarvisPatrickEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof LinearRegressionEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof MeanEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof MedianEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof VarianceEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof LogisticRegressionEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof SkewnessEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof LabeledScatterPlotEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof NullValuesRemovalEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof CustomCleaningEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof ChangeDataFormatEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof ScatterPlotEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof HistogramEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof PiePlotEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof ProjectOnAttributesEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof DataCollectionEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof DataIntegrationEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof ExportEditPart) {
			types.add(PipelineprojectElementTypes.DataFlow_4007);
		}
		if (targetEditPart instanceof SchemaEditPart) {
			types.add(PipelineprojectElementTypes.TaskInputSchema_4015);
		}
		if (targetEditPart instanceof SchemaEditPart) {
			types.add(PipelineprojectElementTypes.TaskOutputSchema_4016);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((MeanEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(MeanEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineprojectElementTypes.DataFlow_4007) {
			types.add(PipelineprojectElementTypes.Agglomerative_2035);
			types.add(PipelineprojectElementTypes.Ridge_2036);
			types.add(PipelineprojectElementTypes.Lasso_2037);
			types.add(PipelineprojectElementTypes.KNN_2038);
			types.add(PipelineprojectElementTypes.SVM_2039);
			types.add(PipelineprojectElementTypes.KMeans_2041);
			types.add(PipelineprojectElementTypes.DBSCAN_2042);
			types.add(PipelineprojectElementTypes.JarvisPatrick_2043);
			types.add(PipelineprojectElementTypes.LinearRegression_2044);
			types.add(PipelineprojectElementTypes.Mean_2045);
			types.add(PipelineprojectElementTypes.Median_2046);
			types.add(PipelineprojectElementTypes.Variance_2047);
			types.add(PipelineprojectElementTypes.LogisticRegression_2059);
			types.add(PipelineprojectElementTypes.Skewness_2060);
			types.add(PipelineprojectElementTypes.LabeledScatterPlot_2062);
			types.add(PipelineprojectElementTypes.NullValuesRemoval_2050);
			types.add(PipelineprojectElementTypes.CustomCleaning_2051);
			types.add(PipelineprojectElementTypes.ChangeDataFormat_2052);
			types.add(PipelineprojectElementTypes.ScatterPlot_2063);
			types.add(PipelineprojectElementTypes.Histogram_2064);
			types.add(PipelineprojectElementTypes.PiePlot_2065);
			types.add(PipelineprojectElementTypes.ProjectOnAttributes_2066);
			types.add(PipelineprojectElementTypes.DataCollection_2053);
			types.add(PipelineprojectElementTypes.DataIntegration_2054);
			types.add(PipelineprojectElementTypes.Export_2056);
		} else if (relationshipType == PipelineprojectElementTypes.TaskInputSchema_4015) {
			types.add(PipelineprojectElementTypes.Schema_2057);
		} else if (relationshipType == PipelineprojectElementTypes.TaskOutputSchema_4016) {
			types.add(PipelineprojectElementTypes.Schema_2057);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MeanEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(MeanEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineprojectElementTypes.DataFlow_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MeanEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(MeanEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineprojectElementTypes.DataFlow_4007) {
			types.add(PipelineprojectElementTypes.Agglomerative_2035);
			types.add(PipelineprojectElementTypes.Ridge_2036);
			types.add(PipelineprojectElementTypes.Lasso_2037);
			types.add(PipelineprojectElementTypes.KNN_2038);
			types.add(PipelineprojectElementTypes.SVM_2039);
			types.add(PipelineprojectElementTypes.KMeans_2041);
			types.add(PipelineprojectElementTypes.DBSCAN_2042);
			types.add(PipelineprojectElementTypes.JarvisPatrick_2043);
			types.add(PipelineprojectElementTypes.LinearRegression_2044);
			types.add(PipelineprojectElementTypes.Mean_2045);
			types.add(PipelineprojectElementTypes.Median_2046);
			types.add(PipelineprojectElementTypes.Variance_2047);
			types.add(PipelineprojectElementTypes.LogisticRegression_2059);
			types.add(PipelineprojectElementTypes.Skewness_2060);
			types.add(PipelineprojectElementTypes.LabeledScatterPlot_2062);
			types.add(PipelineprojectElementTypes.NullValuesRemoval_2050);
			types.add(PipelineprojectElementTypes.CustomCleaning_2051);
			types.add(PipelineprojectElementTypes.ChangeDataFormat_2052);
			types.add(PipelineprojectElementTypes.ScatterPlot_2063);
			types.add(PipelineprojectElementTypes.Histogram_2064);
			types.add(PipelineprojectElementTypes.PiePlot_2065);
			types.add(PipelineprojectElementTypes.ProjectOnAttributes_2066);
			types.add(PipelineprojectElementTypes.DataCollection_2053);
			types.add(PipelineprojectElementTypes.DataIntegration_2054);
			types.add(PipelineprojectElementTypes.Export_2056);
		}
		return types;
	}

}
