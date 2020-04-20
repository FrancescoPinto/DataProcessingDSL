/*
 * 
 */
package pythonpipeline.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pythonpipeline.diagram.edit.parts.SchemaEditPart;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;
import pythonpipeline.diagram.providers.PythonpipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PythonpipelineModelingAssistantProviderOfSchemaEditPart extends PythonpipelineModelingAssistantProvider {

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
		types.add(PythonpipelineElementTypes.TaskInputSchema_4002);
		types.add(PythonpipelineElementTypes.TaskOutputSchema_4003);
		types.add(PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005);
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
		if (relationshipType == PythonpipelineElementTypes.TaskInputSchema_4002) {
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
		} else if (relationshipType == PythonpipelineElementTypes.TaskOutputSchema_4003) {
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
		} else if (relationshipType == PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005) {
			types.add(PythonpipelineElementTypes.InputSourceDeclaration_3003);
		}
		return types;
	}

}
