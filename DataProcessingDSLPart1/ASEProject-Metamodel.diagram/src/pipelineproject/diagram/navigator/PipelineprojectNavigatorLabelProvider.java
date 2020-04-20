/*
* 
*/
package pipelineproject.diagram.navigator;

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

import pipelineproject.Pipeline;
import pipelineproject.diagram.edit.parts.*;
import pipelineproject.diagram.part.PipelineprojectDiagramEditorPlugin;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;
import pipelineproject.diagram.providers.PipelineprojectParserProvider;

/**
 * @generated
 */
public class PipelineprojectNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PipelineprojectDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PipelineprojectDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PipelineprojectNavigatorItem
				&& !isOwnView(((PipelineprojectNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PipelineprojectNavigatorGroup) {
			PipelineprojectNavigatorGroup group = (PipelineprojectNavigatorGroup) element;
			return PipelineprojectDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PipelineprojectNavigatorItem) {
			PipelineprojectNavigatorItem navigatorItem = (PipelineprojectNavigatorItem) element;
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
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.ase.it/pm?Pipeline", //$NON-NLS-1$
					PipelineprojectElementTypes.Pipeline_1000);
		case AgglomerativeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Agglomerative", //$NON-NLS-1$
					PipelineprojectElementTypes.Agglomerative_2035);
		case RidgeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Ridge", //$NON-NLS-1$
					PipelineprojectElementTypes.Ridge_2036);
		case LassoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Lasso", //$NON-NLS-1$
					PipelineprojectElementTypes.Lasso_2037);
		case KNNEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?KNN", PipelineprojectElementTypes.KNN_2038); //$NON-NLS-1$
		case SVMEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?SVM", PipelineprojectElementTypes.SVM_2039); //$NON-NLS-1$
		case KMeansEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?KMeans", //$NON-NLS-1$
					PipelineprojectElementTypes.KMeans_2041);
		case DBSCANEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?DBSCAN", //$NON-NLS-1$
					PipelineprojectElementTypes.DBSCAN_2042);
		case JarvisPatrickEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?JarvisPatrick", //$NON-NLS-1$
					PipelineprojectElementTypes.JarvisPatrick_2043);
		case LinearRegressionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?LinearRegression", //$NON-NLS-1$
					PipelineprojectElementTypes.LinearRegression_2044);
		case MeanEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Mean", PipelineprojectElementTypes.Mean_2045); //$NON-NLS-1$
		case MedianEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Median", //$NON-NLS-1$
					PipelineprojectElementTypes.Median_2046);
		case VarianceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Variance", //$NON-NLS-1$
					PipelineprojectElementTypes.Variance_2047);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?NullValuesRemoval", //$NON-NLS-1$
					PipelineprojectElementTypes.NullValuesRemoval_2050);
		case CustomCleaningEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?CustomCleaning", //$NON-NLS-1$
					PipelineprojectElementTypes.CustomCleaning_2051);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?ChangeDataFormat", //$NON-NLS-1$
					PipelineprojectElementTypes.ChangeDataFormat_2052);
		case DataCollectionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?DataCollection", //$NON-NLS-1$
					PipelineprojectElementTypes.DataCollection_2053);
		case DataIntegrationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?DataIntegration", //$NON-NLS-1$
					PipelineprojectElementTypes.DataIntegration_2054);
		case ExportEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Export", //$NON-NLS-1$
					PipelineprojectElementTypes.Export_2056);
		case SchemaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Schema", //$NON-NLS-1$
					PipelineprojectElementTypes.Schema_2057);
		case OutputFileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?OutputFile", //$NON-NLS-1$
					PipelineprojectElementTypes.OutputFile_2058);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?LogisticRegression", //$NON-NLS-1$
					PipelineprojectElementTypes.LogisticRegression_2059);
		case SkewnessEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Skewness", //$NON-NLS-1$
					PipelineprojectElementTypes.Skewness_2060);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?LabeledScatterPlot", //$NON-NLS-1$
					PipelineprojectElementTypes.LabeledScatterPlot_2062);
		case ScatterPlotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?ScatterPlot", //$NON-NLS-1$
					PipelineprojectElementTypes.ScatterPlot_2063);
		case HistogramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?Histogram", //$NON-NLS-1$
					PipelineprojectElementTypes.Histogram_2064);
		case PiePlotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?PiePlot", //$NON-NLS-1$
					PipelineprojectElementTypes.PiePlot_2065);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/pm?ProjectOnAttributes", //$NON-NLS-1$
					PipelineprojectElementTypes.ProjectOnAttributes_2066);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?RuntimeInfo", //$NON-NLS-1$
					PipelineprojectElementTypes.RuntimeInfo_3036);
		case CustomParamEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?CustomParam", //$NON-NLS-1$
					PipelineprojectElementTypes.CustomParam_3037);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?InputSourceDeclaration", //$NON-NLS-1$
					PipelineprojectElementTypes.InputSourceDeclaration_3038);
		case AndClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?AndClause", //$NON-NLS-1$
					PipelineprojectElementTypes.AndClause_3039);
		case AndClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?AndClause", //$NON-NLS-1$
					PipelineprojectElementTypes.AndClause_3040);
		case OrClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?OrClause", PipelineprojectElementTypes.OrClause_3041); //$NON-NLS-1$
		case LtClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?LtClause", PipelineprojectElementTypes.LtClause_3042); //$NON-NLS-1$
		case GtClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?GtClause", PipelineprojectElementTypes.GtClause_3044); //$NON-NLS-1$
		case EqClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?EqClause", PipelineprojectElementTypes.EqClause_3045); //$NON-NLS-1$
		case LeClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?LeClause", PipelineprojectElementTypes.LeClause_3046); //$NON-NLS-1$
		case GeClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?GeClause", PipelineprojectElementTypes.GeClause_3047); //$NON-NLS-1$
		case ContainsClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?ContainsClause", //$NON-NLS-1$
					PipelineprojectElementTypes.ContainsClause_3048);
		case NotClauseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?NotClause", //$NON-NLS-1$
					PipelineprojectElementTypes.NotClause_3049);
		case AndClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?AndClause", //$NON-NLS-1$
					PipelineprojectElementTypes.AndClause_3050);
		case OrClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?OrClause", PipelineprojectElementTypes.OrClause_3051); //$NON-NLS-1$
		case LtClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?LtClause", PipelineprojectElementTypes.LtClause_3052); //$NON-NLS-1$
		case GtClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?GtClause", PipelineprojectElementTypes.GtClause_3053); //$NON-NLS-1$
		case EqClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?EqClause", PipelineprojectElementTypes.EqClause_3054); //$NON-NLS-1$
		case LeClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?LeClause", PipelineprojectElementTypes.LeClause_3055); //$NON-NLS-1$
		case GeClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?GeClause", PipelineprojectElementTypes.GeClause_3056); //$NON-NLS-1$
		case ContainsClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?ContainsClause", //$NON-NLS-1$
					PipelineprojectElementTypes.ContainsClause_3057);
		case NotClause2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?NotClause", //$NON-NLS-1$
					PipelineprojectElementTypes.NotClause_3058);
		case OrClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?OrClause", PipelineprojectElementTypes.OrClause_3059); //$NON-NLS-1$
		case LtClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?LtClause", PipelineprojectElementTypes.LtClause_3060); //$NON-NLS-1$
		case GtClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?GtClause", PipelineprojectElementTypes.GtClause_3061); //$NON-NLS-1$
		case EqClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?EqClause", PipelineprojectElementTypes.EqClause_3062); //$NON-NLS-1$
		case LeClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?LeClause", PipelineprojectElementTypes.LeClause_3063); //$NON-NLS-1$
		case GeClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?GeClause", PipelineprojectElementTypes.GeClause_3064); //$NON-NLS-1$
		case ContainsClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?ContainsClause", //$NON-NLS-1$
					PipelineprojectElementTypes.ContainsClause_3065);
		case NotClause3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?NotClause", //$NON-NLS-1$
					PipelineprojectElementTypes.NotClause_3066);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?JoinAttributesList", //$NON-NLS-1$
					PipelineprojectElementTypes.JoinAttributesList_3067);
		case AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?Attribute", //$NON-NLS-1$
					PipelineprojectElementTypes.Attribute_3068);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?PrimaryKey", //$NON-NLS-1$
					PipelineprojectElementTypes.PrimaryKey_3069);
		case QueryParamEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/pm?QueryParam", //$NON-NLS-1$
					PipelineprojectElementTypes.QueryParam_3070);
		case DataFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm?DataFlow", PipelineprojectElementTypes.DataFlow_4007); //$NON-NLS-1$
		case ExportWritesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm?Export?writes", //$NON-NLS-1$
					PipelineprojectElementTypes.ExportWrites_4010);
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm?InputSourceDeclaration?sourceSchema", //$NON-NLS-1$
					PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011);
		case TaskInputSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm?Task?inputSchema", //$NON-NLS-1$
					PipelineprojectElementTypes.TaskInputSchema_4015);
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm?Task?outputSchema", //$NON-NLS-1$
					PipelineprojectElementTypes.TaskOutputSchema_4016);
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/pm?PrimaryKey?copies", //$NON-NLS-1$
					PipelineprojectElementTypes.PrimaryKeyCopies_4017);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PipelineprojectDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PipelineprojectElementTypes.isKnownElementType(elementType)) {
			image = PipelineprojectElementTypes.getImage(elementType);
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
		if (element instanceof PipelineprojectNavigatorGroup) {
			PipelineprojectNavigatorGroup group = (PipelineprojectNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PipelineprojectNavigatorItem) {
			PipelineprojectNavigatorItem navigatorItem = (PipelineprojectNavigatorItem) element;
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
		switch (PipelineprojectVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000Text(view);
		case AgglomerativeEditPart.VISUAL_ID:
			return getAgglomerative_2035Text(view);
		case RidgeEditPart.VISUAL_ID:
			return getRidge_2036Text(view);
		case LassoEditPart.VISUAL_ID:
			return getLasso_2037Text(view);
		case KNNEditPart.VISUAL_ID:
			return getKNN_2038Text(view);
		case SVMEditPart.VISUAL_ID:
			return getSVM_2039Text(view);
		case KMeansEditPart.VISUAL_ID:
			return getKMeans_2041Text(view);
		case DBSCANEditPart.VISUAL_ID:
			return getDBSCAN_2042Text(view);
		case JarvisPatrickEditPart.VISUAL_ID:
			return getJarvisPatrick_2043Text(view);
		case LinearRegressionEditPart.VISUAL_ID:
			return getLinearRegression_2044Text(view);
		case MeanEditPart.VISUAL_ID:
			return getMean_2045Text(view);
		case MedianEditPart.VISUAL_ID:
			return getMedian_2046Text(view);
		case VarianceEditPart.VISUAL_ID:
			return getVariance_2047Text(view);
		case NullValuesRemovalEditPart.VISUAL_ID:
			return getNullValuesRemoval_2050Text(view);
		case CustomCleaningEditPart.VISUAL_ID:
			return getCustomCleaning_2051Text(view);
		case ChangeDataFormatEditPart.VISUAL_ID:
			return getChangeDataFormat_2052Text(view);
		case DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_2053Text(view);
		case DataIntegrationEditPart.VISUAL_ID:
			return getDataIntegration_2054Text(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_2056Text(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2057Text(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2058Text(view);
		case LogisticRegressionEditPart.VISUAL_ID:
			return getLogisticRegression_2059Text(view);
		case SkewnessEditPart.VISUAL_ID:
			return getSkewness_2060Text(view);
		case LabeledScatterPlotEditPart.VISUAL_ID:
			return getLabeledScatterPlot_2062Text(view);
		case ScatterPlotEditPart.VISUAL_ID:
			return getScatterPlot_2063Text(view);
		case HistogramEditPart.VISUAL_ID:
			return getHistogram_2064Text(view);
		case PiePlotEditPart.VISUAL_ID:
			return getPiePlot_2065Text(view);
		case ProjectOnAttributesEditPart.VISUAL_ID:
			return getProjectOnAttributes_2066Text(view);
		case RuntimeInfoEditPart.VISUAL_ID:
			return getRuntimeInfo_3036Text(view);
		case CustomParamEditPart.VISUAL_ID:
			return getCustomParam_3037Text(view);
		case InputSourceDeclarationEditPart.VISUAL_ID:
			return getInputSourceDeclaration_3038Text(view);
		case AndClauseEditPart.VISUAL_ID:
			return getAndClause_3039Text(view);
		case AndClause2EditPart.VISUAL_ID:
			return getAndClause_3040Text(view);
		case OrClauseEditPart.VISUAL_ID:
			return getOrClause_3041Text(view);
		case LtClauseEditPart.VISUAL_ID:
			return getLtClause_3042Text(view);
		case GtClauseEditPart.VISUAL_ID:
			return getGtClause_3044Text(view);
		case EqClauseEditPart.VISUAL_ID:
			return getEqClause_3045Text(view);
		case LeClauseEditPart.VISUAL_ID:
			return getLeClause_3046Text(view);
		case GeClauseEditPart.VISUAL_ID:
			return getGeClause_3047Text(view);
		case ContainsClauseEditPart.VISUAL_ID:
			return getContainsClause_3048Text(view);
		case NotClauseEditPart.VISUAL_ID:
			return getNotClause_3049Text(view);
		case AndClause3EditPart.VISUAL_ID:
			return getAndClause_3050Text(view);
		case OrClause2EditPart.VISUAL_ID:
			return getOrClause_3051Text(view);
		case LtClause2EditPart.VISUAL_ID:
			return getLtClause_3052Text(view);
		case GtClause2EditPart.VISUAL_ID:
			return getGtClause_3053Text(view);
		case EqClause2EditPart.VISUAL_ID:
			return getEqClause_3054Text(view);
		case LeClause2EditPart.VISUAL_ID:
			return getLeClause_3055Text(view);
		case GeClause2EditPart.VISUAL_ID:
			return getGeClause_3056Text(view);
		case ContainsClause2EditPart.VISUAL_ID:
			return getContainsClause_3057Text(view);
		case NotClause2EditPart.VISUAL_ID:
			return getNotClause_3058Text(view);
		case OrClause3EditPart.VISUAL_ID:
			return getOrClause_3059Text(view);
		case LtClause3EditPart.VISUAL_ID:
			return getLtClause_3060Text(view);
		case GtClause3EditPart.VISUAL_ID:
			return getGtClause_3061Text(view);
		case EqClause3EditPart.VISUAL_ID:
			return getEqClause_3062Text(view);
		case LeClause3EditPart.VISUAL_ID:
			return getLeClause_3063Text(view);
		case GeClause3EditPart.VISUAL_ID:
			return getGeClause_3064Text(view);
		case ContainsClause3EditPart.VISUAL_ID:
			return getContainsClause_3065Text(view);
		case NotClause3EditPart.VISUAL_ID:
			return getNotClause_3066Text(view);
		case JoinAttributesListEditPart.VISUAL_ID:
			return getJoinAttributesList_3067Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3068Text(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3069Text(view);
		case QueryParamEditPart.VISUAL_ID:
			return getQueryParam_3070Text(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4007Text(view);
		case ExportWritesEditPart.VISUAL_ID:
			return getExportWrites_4010Text(view);
		case InputSourceDeclarationSourceSchemaEditPart.VISUAL_ID:
			return getInputSourceDeclarationSourceSchema_4011Text(view);
		case TaskInputSchemaEditPart.VISUAL_ID:
			return getTaskInputSchema_4015Text(view);
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return getTaskOutputSchema_4016Text(view);
		case PrimaryKeyCopiesEditPart.VISUAL_ID:
			return getPrimaryKeyCopies_4017Text(view);
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
			PipelineprojectDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAgglomerative_2035Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Agglomerative_2035,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(AgglomerativeIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5125); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRidge_2036Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Ridge_2036,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(RidgeIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5126); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLasso_2037Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Lasso_2037,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LassoIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5127); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getKNN_2038Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.KNN_2038,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(KNNIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5128); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSVM_2039Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.SVM_2039,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(SVMIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5129); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getKMeans_2041Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.KMeans_2041,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(KMeansIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5131); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDBSCAN_2042Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.DBSCAN_2042,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(DBSCANIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5132); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJarvisPatrick_2043Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.JarvisPatrick_2043,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(JarvisPatrickIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLinearRegression_2044Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LinearRegression_2044,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LinearRegressionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5134); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMean_2045Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Mean_2045,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(MeanIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5135); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMedian_2046Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Median_2046,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(MedianIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5136); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVariance_2047Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Variance_2047,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(VarianceIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5137); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNullValuesRemoval_2050Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.NullValuesRemoval_2050,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(NullValuesRemovalIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5140); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCustomCleaning_2051Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.CustomCleaning_2051,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(CustomCleaningIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChangeDataFormat_2052Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ChangeDataFormat_2052,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ChangeDataFormatIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5143); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataCollection_2053Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.DataCollection_2053,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(DataCollectionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5173); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataIntegration_2054Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.DataIntegration_2054,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(DataIntegrationIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5175); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_2056Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Export_2056,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ExportIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5177); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSchema_2057Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Schema_2057,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(SchemaIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5180); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutputFile_2058Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.OutputFile_2058,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(OutputFileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5181); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLogisticRegression_2059Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LogisticRegression_2059,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LogisticRegressionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5182); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSkewness_2060Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Skewness_2060,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(SkewnessIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5184); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabeledScatterPlot_2062Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LabeledScatterPlot_2062,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LabeledScatterPlotIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5186); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getScatterPlot_2063Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ScatterPlot_2063,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ScatterPlotIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5187); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHistogram_2064Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Histogram_2064,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(HistogramIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5188); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPiePlot_2065Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.PiePlot_2065,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(PiePlotIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5189); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProjectOnAttributes_2066Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ProjectOnAttributes_2066,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ProjectOnAttributesIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5190); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRuntimeInfo_3036Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.RuntimeInfo_3036,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(RuntimeInfoExecutionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5124); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCustomParam_3037Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.CustomParam_3037,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(CustomParamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5141); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputSourceDeclaration_3038Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(
				PipelineprojectElementTypes.InputSourceDeclaration_3038,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(InputSourceDeclarationSourceURIEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5172); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAndClause_3039Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.AndClause_3039,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(AndClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5163); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAndClause_3040Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.AndClause_3040,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(AndClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5162); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrClause_3041Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.OrClause_3041,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(OrClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5161); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLtClause_3042Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LtClause_3042,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LtClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5145); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGtClause_3044Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.GtClause_3044,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(GtClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5146); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqClause_3045Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.EqClause_3045,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(EqClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5147); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeClause_3046Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LeClause_3046,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LeClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5148); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeClause_3047Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.GeClause_3047,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(GeClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainsClause_3048Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ContainsClause_3048,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ContainsClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5150); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotClause_3049Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.NotClause_3049,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(NotClauseIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5160); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAndClause_3050Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.AndClause_3050,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(AndClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5151); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrClause_3051Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.OrClause_3051,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(OrClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5152); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLtClause_3052Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LtClause_3052,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LtClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5153); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGtClause_3053Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.GtClause_3053,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(GtClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5154); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqClause_3054Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.EqClause_3054,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(EqClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5155); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeClause_3055Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LeClause_3055,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LeClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5156); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeClause_3056Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.GeClause_3056,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(GeClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5157); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainsClause_3057Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ContainsClause_3057,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ContainsClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5158); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotClause_3058Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.NotClause_3058,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(NotClauseId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5159); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrClause_3059Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.OrClause_3059,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(OrClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5164); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLtClause_3060Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LtClause_3060,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LtClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5165); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGtClause_3061Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.GtClause_3061,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(GtClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5166); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEqClause_3062Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.EqClause_3062,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(EqClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5167); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLeClause_3063Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.LeClause_3063,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(LeClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5168); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeClause_3064Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.GeClause_3064,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(GeClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5169); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainsClause_3065Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ContainsClause_3065,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(ContainsClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5170); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotClause_3066Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.NotClause_3066,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(NotClauseId3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5171); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJoinAttributesList_3067Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.JoinAttributesList_3067,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(JoinAttributesListIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5174); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3068Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.Attribute_3068,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5178); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimaryKey_3069Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.PrimaryKey_3069,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(PrimaryKeyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5183); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQueryParam_3070Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.QueryParam_3070,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(QueryParamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5191); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFlow_4007Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.DataFlow_4007,
				view.getElement() != null ? view.getElement() : view,
				PipelineprojectVisualIDRegistry.getType(DataFlowFormatEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportWrites_4010Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.ExportWrites_4010,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputSourceDeclarationSourceSchema_4011Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(
				PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaskInputSchema_4015Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.TaskInputSchema_4015,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaskOutputSchema_4016Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.TaskOutputSchema_4016,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimaryKeyCopies_4017Text(View view) {
		IParser parser = PipelineprojectParserProvider.getParser(PipelineprojectElementTypes.PrimaryKeyCopies_4017,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineprojectDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6017); //$NON-NLS-1$
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
		return PipelineEditPart.MODEL_ID.equals(PipelineprojectVisualIDRegistry.getModelID(view));
	}

}
