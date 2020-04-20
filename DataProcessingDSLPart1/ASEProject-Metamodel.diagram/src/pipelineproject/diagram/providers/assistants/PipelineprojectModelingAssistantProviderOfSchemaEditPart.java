/*
 * 
 */
package pipelineproject.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipelineproject.diagram.edit.parts.SchemaEditPart;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;
import pipelineproject.diagram.providers.PipelineprojectModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineprojectModelingAssistantProviderOfSchemaEditPart extends PipelineprojectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SchemaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(SchemaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.TaskInputSchema_4015);
		types.add(PipelineprojectElementTypes.TaskOutputSchema_4016);
		types.add(PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SchemaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(SchemaEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineprojectElementTypes.TaskInputSchema_4015) {
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
		} else if (relationshipType == PipelineprojectElementTypes.TaskOutputSchema_4016) {
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
		} else if (relationshipType == PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011) {
			types.add(PipelineprojectElementTypes.InputSourceDeclaration_3038);
		}
		return types;
	}

}
