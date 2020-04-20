/*
 * 
 */
package pipelineproject.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipelineproject.diagram.providers.PipelineprojectElementTypes;
import pipelineproject.diagram.providers.PipelineprojectModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineprojectModelingAssistantProviderOfPipelineEditPart
		extends PipelineprojectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(27);
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
		types.add(PipelineprojectElementTypes.Schema_2057);
		types.add(PipelineprojectElementTypes.OutputFile_2058);
		return types;
	}

}
