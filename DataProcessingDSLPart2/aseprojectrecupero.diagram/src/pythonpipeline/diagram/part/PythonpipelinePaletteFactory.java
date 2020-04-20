
/*
 * 
 */
package pythonpipeline.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class PythonpipelinePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAgglomerative1CreationTool());
		paletteContainer.add(createAndClause2CreationTool());
		paletteContainer.add(createAttribute3CreationTool());
		paletteContainer.add(createChangeDataFormat4CreationTool());
		paletteContainer.add(createContainsClause5CreationTool());
		paletteContainer.add(createCustomCleaning6CreationTool());
		paletteContainer.add(createCustomParam7CreationTool());
		paletteContainer.add(createDBSCAN8CreationTool());
		paletteContainer.add(createDataCollection9CreationTool());
		paletteContainer.add(createDataIntegration10CreationTool());
		paletteContainer.add(createEqClause11CreationTool());
		paletteContainer.add(createExport12CreationTool());
		paletteContainer.add(createGeClause13CreationTool());
		paletteContainer.add(createGtClause14CreationTool());
		paletteContainer.add(createHistogram15CreationTool());
		paletteContainer.add(createInputSourceDeclaration16CreationTool());
		paletteContainer.add(createJoinAttributesList17CreationTool());
		paletteContainer.add(createKMeans18CreationTool());
		paletteContainer.add(createLabeledScatterPlot19CreationTool());
		paletteContainer.add(createLasso20CreationTool());
		paletteContainer.add(createLeClause21CreationTool());
		paletteContainer.add(createLinearRegression22CreationTool());
		paletteContainer.add(createLogisticRegression23CreationTool());
		paletteContainer.add(createLtClause24CreationTool());
		paletteContainer.add(createMean25CreationTool());
		paletteContainer.add(createMedian26CreationTool());
		paletteContainer.add(createNotClause27CreationTool());
		paletteContainer.add(createNullValuesRemoval28CreationTool());
		paletteContainer.add(createOrClause29CreationTool());
		paletteContainer.add(createOutputFile30CreationTool());
		paletteContainer.add(createPiePlot31CreationTool());
		paletteContainer.add(createPrimaryKey32CreationTool());
		paletteContainer.add(createProjectOnAttributes33CreationTool());
		paletteContainer.add(createQueryParam34CreationTool());
		paletteContainer.add(createRidge35CreationTool());
		paletteContainer.add(createRuntimeInfo36CreationTool());
		paletteContainer.add(createSVM37CreationTool());
		paletteContainer.add(createScatterPlot38CreationTool());
		paletteContainer.add(createSchema39CreationTool());
		paletteContainer.add(createSkewness40CreationTool());
		paletteContainer.add(createStandardDeviation41CreationTool());
		paletteContainer.add(createSupportVector42CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createCopies1CreationTool());
		paletteContainer.add(createDataFlow2CreationTool());
		paletteContainer.add(createInputSchema3CreationTool());
		paletteContainer.add(createOutputSchema4CreationTool());
		paletteContainer.add(createSourceSchema5CreationTool());
		paletteContainer.add(createWrites6CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAgglomerative1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Agglomerative1CreationTool_title,
				Messages.Agglomerative1CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.Agglomerative_2001));
		entry.setId("createAgglomerative1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Agglomerative_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAndClause2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.AndClause_3004);
		types.add(PythonpipelineElementTypes.AndClause_3005);
		types.add(PythonpipelineElementTypes.AndClause_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AndClause2CreationTool_title,
				Messages.AndClause2CreationTool_desc, types);
		entry.setId("createAndClause2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.AndClause_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attribute3CreationTool_title,
				Messages.Attribute3CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.Attribute_3033));
		entry.setId("createAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Attribute_3033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createChangeDataFormat4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ChangeDataFormat4CreationTool_title,
				Messages.ChangeDataFormat4CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.ChangeDataFormat_2016));
		entry.setId("createChangeDataFormat4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.ChangeDataFormat_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainsClause5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.ContainsClause_3013);
		types.add(PythonpipelineElementTypes.ContainsClause_3022);
		types.add(PythonpipelineElementTypes.ContainsClause_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContainsClause5CreationTool_title,
				Messages.ContainsClause5CreationTool_desc, types);
		entry.setId("createContainsClause5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.ContainsClause_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCustomCleaning6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CustomCleaning6CreationTool_title,
				Messages.CustomCleaning6CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.CustomCleaning_2015));
		entry.setId("createCustomCleaning6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.CustomCleaning_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCustomParam7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CustomParam7CreationTool_title,
				Messages.CustomParam7CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.CustomParam_3002));
		entry.setId("createCustomParam7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.CustomParam_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDBSCAN8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DBSCAN8CreationTool_title,
				Messages.DBSCAN8CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.DBSCAN_2006));
		entry.setId("createDBSCAN8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.DBSCAN_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataCollection9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataCollection9CreationTool_title,
				Messages.DataCollection9CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.DataCollection_2021));
		entry.setId("createDataCollection9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.DataCollection_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataIntegration10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataIntegration10CreationTool_title,
				Messages.DataIntegration10CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.DataIntegration_2022));
		entry.setId("createDataIntegration10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.DataIntegration_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEqClause11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.EqClause_3010);
		types.add(PythonpipelineElementTypes.EqClause_3019);
		types.add(PythonpipelineElementTypes.EqClause_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EqClause11CreationTool_title,
				Messages.EqClause11CreationTool_desc, types);
		entry.setId("createEqClause11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.EqClause_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Export12CreationTool_title,
				Messages.Export12CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.Export_2023));
		entry.setId("createExport12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Export_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeClause13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.GeClause_3012);
		types.add(PythonpipelineElementTypes.GeClause_3021);
		types.add(PythonpipelineElementTypes.GeClause_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GeClause13CreationTool_title,
				Messages.GeClause13CreationTool_desc, types);
		entry.setId("createGeClause13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.GeClause_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGtClause14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.GtClause_3009);
		types.add(PythonpipelineElementTypes.GtClause_3018);
		types.add(PythonpipelineElementTypes.GtClause_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GtClause14CreationTool_title,
				Messages.GtClause14CreationTool_desc, types);
		entry.setId("createGtClause14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.GtClause_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHistogram15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Histogram15CreationTool_title,
				Messages.Histogram15CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.Histogram_2018));
		entry.setId("createHistogram15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Histogram_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputSourceDeclaration16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputSourceDeclaration16CreationTool_title,
				Messages.InputSourceDeclaration16CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.InputSourceDeclaration_3003));
		entry.setId("createInputSourceDeclaration16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.InputSourceDeclaration_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinAttributesList17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JoinAttributesList17CreationTool_title,
				Messages.JoinAttributesList17CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.JoinAttributesList_3032));
		entry.setId("createJoinAttributesList17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.JoinAttributesList_3032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createKMeans18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.KMeans18CreationTool_title,
				Messages.KMeans18CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.KMeans_2005));
		entry.setId("createKMeans18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.KMeans_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabeledScatterPlot19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LabeledScatterPlot19CreationTool_title,
				Messages.LabeledScatterPlot19CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.LabeledScatterPlot_2013));
		entry.setId("createLabeledScatterPlot19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.LabeledScatterPlot_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLasso20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Lasso20CreationTool_title,
				Messages.Lasso20CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.Lasso_2003));
		entry.setId("createLasso20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Lasso_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLeClause21CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.LeClause_3011);
		types.add(PythonpipelineElementTypes.LeClause_3020);
		types.add(PythonpipelineElementTypes.LeClause_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LeClause21CreationTool_title,
				Messages.LeClause21CreationTool_desc, types);
		entry.setId("createLeClause21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.LeClause_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLinearRegression22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LinearRegression22CreationTool_title,
				Messages.LinearRegression22CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.LinearRegression_2007));
		entry.setId("createLinearRegression22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.LinearRegression_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLogisticRegression23CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LogisticRegression23CreationTool_title,
				Messages.LogisticRegression23CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.LogisticRegression_2011));
		entry.setId("createLogisticRegression23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.LogisticRegression_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLtClause24CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.LtClause_3007);
		types.add(PythonpipelineElementTypes.LtClause_3017);
		types.add(PythonpipelineElementTypes.LtClause_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LtClause24CreationTool_title,
				Messages.LtClause24CreationTool_desc, types);
		entry.setId("createLtClause24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.LtClause_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMean25CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Mean25CreationTool_title,
				Messages.Mean25CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.Mean_2008));
		entry.setId("createMean25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Mean_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMedian26CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Median26CreationTool_title,
				Messages.Median26CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.Median_2009));
		entry.setId("createMedian26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Median_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNotClause27CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.NotClause_3014);
		types.add(PythonpipelineElementTypes.NotClause_3023);
		types.add(PythonpipelineElementTypes.NotClause_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NotClause27CreationTool_title,
				Messages.NotClause27CreationTool_desc, types);
		entry.setId("createNotClause27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.NotClause_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNullValuesRemoval28CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NullValuesRemoval28CreationTool_title,
				Messages.NullValuesRemoval28CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.NullValuesRemoval_2014));
		entry.setId("createNullValuesRemoval28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.NullValuesRemoval_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOrClause29CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PythonpipelineElementTypes.OrClause_3006);
		types.add(PythonpipelineElementTypes.OrClause_3016);
		types.add(PythonpipelineElementTypes.OrClause_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OrClause29CreationTool_title,
				Messages.OrClause29CreationTool_desc, types);
		entry.setId("createOrClause29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.OrClause_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputFile30CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputFile30CreationTool_title,
				Messages.OutputFile30CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.OutputFile_2025));
		entry.setId("createOutputFile30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.OutputFile_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPiePlot31CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PiePlot31CreationTool_title,
				Messages.PiePlot31CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.PiePlot_2019));
		entry.setId("createPiePlot31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.PiePlot_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimaryKey32CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrimaryKey32CreationTool_title,
				Messages.PrimaryKey32CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.PrimaryKey_3034));
		entry.setId("createPrimaryKey32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.PrimaryKey_3034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProjectOnAttributes33CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ProjectOnAttributes33CreationTool_title,
				Messages.ProjectOnAttributes33CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.ProjectOnAttributes_2020));
		entry.setId("createProjectOnAttributes33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.ProjectOnAttributes_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQueryParam34CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.QueryParam34CreationTool_title,
				Messages.QueryParam34CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.QueryParam_3008));
		entry.setId("createQueryParam34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.QueryParam_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRidge35CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ridge35CreationTool_title,
				Messages.Ridge35CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.Ridge_2002));
		entry.setId("createRidge35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Ridge_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRuntimeInfo36CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RuntimeInfo36CreationTool_title,
				Messages.RuntimeInfo36CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.RuntimeInfo_3001));
		entry.setId("createRuntimeInfo36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.RuntimeInfo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSVM37CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SVM37CreationTool_title,
				Messages.SVM37CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.SVM_2004));
		entry.setId("createSVM37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.SVM_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createScatterPlot38CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ScatterPlot38CreationTool_title,
				Messages.ScatterPlot38CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.ScatterPlot_2017));
		entry.setId("createScatterPlot38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.ScatterPlot_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema39CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Schema39CreationTool_title,
				Messages.Schema39CreationTool_desc, Collections.singletonList(PythonpipelineElementTypes.Schema_2024));
		entry.setId("createSchema39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Schema_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSkewness40CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Skewness40CreationTool_title,
				Messages.Skewness40CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.Skewness_2012));
		entry.setId("createSkewness40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.Skewness_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStandardDeviation41CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StandardDeviation41CreationTool_title,
				Messages.StandardDeviation41CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.StandardDeviation_2010));
		entry.setId("createStandardDeviation41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.StandardDeviation_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSupportVector42CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SupportVector42CreationTool_title,
				Messages.SupportVector42CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.SupportVector_3035));
		entry.setId("createSupportVector42CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.SupportVector_3035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCopies1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Copies1CreationTool_title,
				Messages.Copies1CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.PrimaryKeyCopies_4006));
		entry.setId("createCopies1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.PrimaryKeyCopies_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFlow2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataFlow2CreationTool_title,
				Messages.DataFlow2CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.DataFlow_4001));
		entry.setId("createDataFlow2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.DataFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputSchema3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InputSchema3CreationTool_title,
				Messages.InputSchema3CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.TaskInputSchema_4002));
		entry.setId("createInputSchema3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.TaskInputSchema_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputSchema4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.OutputSchema4CreationTool_title,
				Messages.OutputSchema4CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.TaskOutputSchema_4003));
		entry.setId("createOutputSchema4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.TaskOutputSchema_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSourceSchema5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SourceSchema5CreationTool_title,
				Messages.SourceSchema5CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005));
		entry.setId("createSourceSchema5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes
				.getImageDescriptor(PythonpipelineElementTypes.InputSourceDeclarationSourceSchema_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWrites6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Writes6CreationTool_title,
				Messages.Writes6CreationTool_desc,
				Collections.singletonList(PythonpipelineElementTypes.ExportWrites_4004));
		entry.setId("createWrites6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PythonpipelineElementTypes.getImageDescriptor(PythonpipelineElementTypes.ExportWrites_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
