/*
* 
*/
package pythonpipeline.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import pythonpipeline.Pipeline;
import pythonpipeline.diagram.edit.parts.*;
import pythonpipeline.diagram.part.PythonpipelineDiagramEditorPlugin;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;
import pythonpipeline.diagram.providers.PythonpipelineParserProvider;

/**
 * @generated
 */
public class PythonpipelineNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PythonpipelineDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PythonpipelineDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PythonpipelineNavigatorItem
				&& !isOwnView(((PythonpipelineNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PythonpipelineNavigatorGroup) {
			PythonpipelineNavigatorGroup group = (PythonpipelineNavigatorGroup) element;
			return PythonpipelineDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PythonpipelineNavigatorItem) {
			PythonpipelineNavigatorItem navigatorItem = (PythonpipelineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.ase.it/pm/python?Pipeline", //$NON-NLS-1$
					PythonpipelineElementTypes.Pipeline_1000);
		case AgglomerativeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Agglomerative", //$NON-NLS-1$
					PythonpipelineElementTypes.Agglomerative_2001);
		case RidgeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Ridge", //$NON-NLS-1$
					PythonpipelineElementTypes.Ridge_2002);
		case LassoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Lasso", //$NON-NLS-1$
					PythonpipelineElementTypes.Lasso_2003);
		case SVMEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?SVM", //$NON-NLS-1$
					PythonpipelineElementTypes.SVM_2004);
		case KMeansEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?KMeans", //$NON-NLS-1$
					PythonpipelineElementTypes.KMeans_2005);
		case DBSCANEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?DBSCAN", //$NON-NLS-1$
					PythonpipelineElementTypes.DBSCAN_2006);
		case LinearRegressionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?LinearRegression", //$NON-NLS-1$
					PythonpipelineElementTypes.LinearRegression_2007);
		case MeanEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Mean", //$NON-NLS-1$
					PythonpipelineElementTypes.Mean_2008);
		case MedianEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Median", //$NON-NLS-1$
					PythonpipelineElementTypes.Median_2009);
		case StandardDeviationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?StandardDeviation", //$NON-NLS-1$
					PythonpipelineElementTypes.StandardDeviation_2010);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?LogisticRegression", //$NON-NLS-1$
					PythonpipelineElementTypes.LogisticRegression_2011);
		case SkewnessEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Skewness", //$NON-NLS-1$
					PythonpipelineElementTypes.Skewness_2012);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?LabeledScatterPlot", //$NON-NLS-1$
					PythonpipelineElementTypes.LabeledScatterPlot_2013);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?NullValuesRemoval", //$NON-NLS-1$
					PythonpipelineElementTypes.NullValuesRemoval_2014);
		case CustomCleaningEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?CustomCleaning", //$NON-NLS-1$
					PythonpipelineElementTypes.CustomCleaning_2015);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?ChangeDataFormat", //$NON-NLS-1$
					PythonpipelineElementTypes.ChangeDataFormat_2016);
		case ScatterPlotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?ScatterPlot", //$NON-NLS-1$
					PythonpipelineElementTypes.ScatterPlot_2017);
		case HistogramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Histogram", //$NON-NLS-1$
					PythonpipelineElementTypes.Histogram_2018);
		case PiePlotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?PiePlot", //$NON-NLS-1$
					PythonpipelineElementTypes.PiePlot_2019);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?ProjectOnAttributes", //$NON-NLS-1$
					PythonpipelineElementTypes.ProjectOnAttributes_2020);
		case DataCollectionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?DataCollection", //$NON-NLS-1$
					PythonpipelineElementTypes.DataCollection_2021);
		case DataIntegrationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?DataIntegration", //$NON-NLS-1$
					PythonpipelineElementTypes.DataIntegration_2022);
		case ExportEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Export", //$NON-NLS-1$
					PythonpipelineElementTypes.Export_2023);
		case SchemaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?Schema", //$NON-NLS-1$
					PythonpipelineElementTypes.Schema_2024);
		case OutputFileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm/python?OutputFile", //$NON-NLS-1$
					PythonpipelineElementTypes.OutputFile_2025);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?RuntimeInfo", //$NON-NLS-1$
					PythonpipelineElementTypes.RuntimeInfo_3001);
		case CustomParamEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?CustomParam", //$NON-NLS-1$
					PythonpipelineElementTypes.CustomParam_3002);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?InputSourceDeclaration", //$NON-NLS-1$
					PythonpipelineElementTypes.InputSourceDeclaration_3003);
		case AndClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?AndClause", //$NON-NLS-1$
					PythonpipelineElementTypes.AndClause_3004);
		case AndClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?AndClause", //$NON-NLS-1$
					PythonpipelineElementTypes.AndClause_3005);
		case OrClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?OrClause", //$NON-NLS-1$
					PythonpipelineElementTypes.OrClause_3006);
		case LtClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?LtClause", //$NON-NLS-1$
					PythonpipelineElementTypes.LtClause_3007);
		case QueryParamEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?QueryParam", //$NON-NLS-1$
					PythonpipelineElementTypes.QueryParam_3008);
		case GtClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?GtClause", //$NON-NLS-1$
					PythonpipelineElementTypes.GtClause_3009);
		case EqClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?EqClause", //$NON-NLS-1$
					PythonpipelineElementTypes.EqClause_3010);
		case LeClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?LeClause", //$NON-NLS-1$
					PythonpipelineElementTypes.LeClause_3011);
		case GeClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?GeClause", //$NON-NLS-1$
					PythonpipelineElementTypes.GeClause_3012);
		case ContainsClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?ContainsClause", //$NON-NLS-1$
					PythonpipelineElementTypes.ContainsClause_3013);
		case NotClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?NotClause", //$NON-NLS-1$
					PythonpipelineElementTypes.NotClause_3014);
		case AndClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?AndClause", //$NON-NLS-1$
					PythonpipelineElementTypes.AndClause_3015);
		case OrClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?OrClause", //$NON-NLS-1$
					PythonpipelineElementTypes.OrClause_3016);
		case LtClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?LtClause", //$NON-NLS-1$
					PythonpipelineElementTypes.LtClause_3017);
		case GtClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?GtClause", //$NON-NLS-1$
					PythonpipelineElementTypes.GtClause_3018);
		case EqClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?EqClause", //$NON-NLS-1$
					PythonpipelineElementTypes.EqClause_3019);
		case LeClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?LeClause", //$NON-NLS-1$
					PythonpipelineElementTypes.LeClause_3020);
		case GeClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?GeClause", //$NON-NLS-1$
					PythonpipelineElementTypes.GeClause_3021);
		case ContainsClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?ContainsClause", //$NON-NLS-1$
					PythonpipelineElementTypes.ContainsClause_3022);
		case NotClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?NotClause", //$NON-NLS-1$
					PythonpipelineElementTypes.NotClause_3023);
		case OrClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?OrClause", //$NON-NLS-1$
					PythonpipelineElementTypes.OrClause_3024);
		case LtClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?LtClause", //$NON-NLS-1$
					PythonpipelineElementTypes.LtClause_3025);
		case GtClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?GtClause", //$NON-NLS-1$
					PythonpipelineElementTypes.GtClause_3026);
		case EqClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?EqClause", //$NON-NLS-1$
					PythonpipelineElementTypes.EqClause_3027);
		case LeClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?LeClause", //$NON-NLS-1$
					PythonpipelineElementTypes.LeClause_3028);
		case GeClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?GeClause", //$NON-NLS-1$
					PythonpipelineElementTypes.GeClause_3029);
		case ContainsClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?ContainsClause", //$NON-NLS-1$
					PythonpipelineElementTypes.ContainsClause_3030);
		case NotClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?NotClause", //$NON-NLS-1$
					PythonpipelineElementTypes.NotClause_3031);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?JoinAttributesList", //$NON-NLS-1$
					PythonpipelineElementTypes.JoinAttributesList_3032);
		case AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?Attribute", //$NON-NLS-1$
					PythonpipelineElementTypes.Attribute_3033);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?PrimaryKey", //$NON-NLS-1$
					PythonpipelineElementTypes.PrimaryKey_3034);
		case SupportVectorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm/python?SupportVector", //$NON-NLS-1$
					PythonpipelineElementTypes.SupportVector_3035);
		case DataFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm/python?DataFlow", //$NON-NLS-1$
					PythonpipelineElementTypes.DataFlow_4001);
		case TaskInputSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm/python?Task?inputSchema", //$NON-NLS-1$
					PythonpipelineElementTypes.TaskInputSchema_4002);
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm/python?Task?outputSchema", //$NON-NLS-1$
					PythonpipelineElementTypes.TaskOutputSchema_4003);
		case ExportWritesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm/python?Export?writes", //$NON-NLS-1$
					PythonpipelineElementTypes.ExportWrites_4004);
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm/python?InputSourceDeclaration?sourceSchema", //$NON-NLS-1$
					PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005);
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm/python?PrimaryKey?copies", //$NON-NLS-1$
					PythonpipelineElementTypes.PrimaryKeyCopies_4006);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PythonpipelineDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PythonpipelineElementTypes.isKnownElementType(elementType)) {
			image = PythonpipelineElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof PythonpipelineNavigatorGroup) {
			PythonpipelineNavigatorGroup group = (PythonpipelineNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PythonpipelineNavigatorItem) {
			PythonpipelineNavigatorItem navigatorItem = (PythonpipelineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PythonpipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000Text(view);
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2001Text(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2002Text(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2003Text(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2004Text(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2005Text(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2006Text(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2007Text(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2008Text(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2009Text(view);
		case StandardDeviationEditPart.VISUAL_ID:
			return getStandardDeviation_2010Text(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2011Text(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2012Text(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2013Text(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2014Text(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2015Text(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2016Text(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2017Text(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2018Text(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2019Text(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2020Text(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2021Text(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2022Text(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2023Text(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2024Text(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2025Text(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3001Text(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3002Text(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3003Text(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3004Text(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3005Text(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3006Text(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3007Text(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3008Text(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3009Text(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3010Text(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3011Text(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3012Text(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3013Text(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3014Text(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3015Text(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3016Text(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3017Text(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3018Text(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3019Text(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3020Text(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3021Text(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3022Text(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3023Text(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3024Text(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3025Text(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3026Text(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3027Text(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3028Text(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3029Text(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3030Text(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3031Text(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3032Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3033Text(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3034Text(view);
		case SupportVectorEditPart.VISUAL_ID:
			return getSupportVector_3035Text(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001Text(view);
		case TaskInputSchemaEditPart.VISUAL_ID:
			return getTaskInputSchema_4002Text(view);
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return getTaskOutputSchema_4003Text(view);
		case ExportWritesEditPart.VISUAL_ID:
			return getExportWrites_4004Text(view);
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return getInputSourceDeclarationSourceSchema_4005Text(view);
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return getPrimaryKeyCopies_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPipeline_1000Text(View view) {
		Pipeline domainModelElement = (Pipeline) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getPipelineName();
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAgglomerative_2001Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Agglomerative_2001,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(AgglomerativeIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRidge_2002Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Ridge_2002,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(RidgeIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLasso_2003Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Lasso_2003,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LassoIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSVM_2004Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.SVM_2004,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(SVMIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getKMeans_2005Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.KMeans_2005,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(KMeansIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDBSCAN_2006Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.DBSCAN_2006,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(DBSCANIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLinearRegression_2007Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LinearRegression_2007,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LinearRegressionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMean_2008Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Mean_2008,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(MeanIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMedian_2009Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Median_2009,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(MedianIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStandardDeviation_2010Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.StandardDeviation_2010,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(StandardDeviationIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLogisticRegression_2011Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LogisticRegression_2011,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LogisticRegressionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSkewness_2012Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Skewness_2012,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(SkewnessIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabeledScatterPlot_2013Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LabeledScatterPlot_2013,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LabeledScatterPlotIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullValuesRemoval_2014Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.NullValuesRemoval_2014,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(NullValuesRemovalIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCustomCleaning_2015Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.CustomCleaning_2015,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(CustomCleaningIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChangeDataFormat_2016Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ChangeDataFormat_2016,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ChangeDataFormatIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getScatterPlot_2017Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ScatterPlot_2017,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ScatterPlotIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHistogram_2018Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Histogram_2018,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(HistogramIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPiePlot_2019Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.PiePlot_2019,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(PiePlotIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProjectOnAttributes_2020Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ProjectOnAttributes_2020,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ProjectOnAttributesIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataCollection_2021Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.DataCollection_2021,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(DataCollectionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataIntegration_2022Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.DataIntegration_2022,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(DataIntegrationIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_2023Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Export_2023,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ExportIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSchema_2024Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Schema_2024,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(SchemaIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutputFile_2025Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.OutputFile_2025,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(OutputFileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRuntimeInfo_3001Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.RuntimeInfo_3001,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(RuntimeInfoExecutionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCustomParam_3002Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.CustomParam_3002,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(CustomParamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputSourceDeclaration_3003Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.InputSourceDeclaration_3003,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(InputSourceDeclarationSourceURIEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAndClause_3004Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.AndClause_3004,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(AndClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAndClause_3005Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.AndClause_3005,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(AndClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrClause_3006Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.OrClause_3006,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(OrClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLtClause_3007Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LtClause_3007,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LtClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQueryParam_3008Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.QueryParam_3008,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(QueryParamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGtClause_3009Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.GtClause_3009,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(GtClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqClause_3010Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.EqClause_3010,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(EqClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeClause_3011Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LeClause_3011,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LeClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeClause_3012Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.GeClause_3012,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(GeClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainsClause_3013Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ContainsClause_3013,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ContainsClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotClause_3014Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.NotClause_3014,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(NotClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAndClause_3015Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.AndClause_3015,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(AndClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrClause_3016Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.OrClause_3016,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(OrClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLtClause_3017Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LtClause_3017,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LtClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGtClause_3018Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.GtClause_3018,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(GtClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqClause_3019Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.EqClause_3019,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(EqClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeClause_3020Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LeClause_3020,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LeClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeClause_3021Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.GeClause_3021,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(GeClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainsClause_3022Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ContainsClause_3022,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ContainsClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotClause_3023Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.NotClause_3023,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(NotClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrClause_3024Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.OrClause_3024,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(OrClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLtClause_3025Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LtClause_3025,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LtClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGtClause_3026Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.GtClause_3026,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(GtClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqClause_3027Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.EqClause_3027,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(EqClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeClause_3028Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.LeClause_3028,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(LeClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeClause_3029Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.GeClause_3029,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(GeClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainsClause_3030Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ContainsClause_3030,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(ContainsClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotClause_3031Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.NotClause_3031,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(NotClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJoinAttributesList_3032Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.JoinAttributesList_3032,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(JoinAttributesListIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3033Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.Attribute_3033,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimaryKey_3034Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.PrimaryKey_3034,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(PrimaryKeyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupportVector_3035Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.SupportVector_3035,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(SupportVectorIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFlow_4001Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.DataFlow_4001,
				view.getElement() != null ? view.getElement() : view,
				PythonpipelineVisualIDRegistry.getType(DataFlowFormatEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaskInputSchema_4002Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.TaskInputSchema_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaskOutputSchema_4003Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.TaskOutputSchema_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportWrites_4004Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.ExportWrites_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputSourceDeclarationSourceSchema_4005Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(
				PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimaryKeyCopies_4006Text(View view) {
		IParser parser = PythonpipelineParserProvider.getParser(PythonpipelineElementTypes.PrimaryKeyCopies_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PythonpipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return PipelineEditPart.MODEL_ID.equals(PythonpipelineVisualIDRegistry.getModelID(view));
	}

}
