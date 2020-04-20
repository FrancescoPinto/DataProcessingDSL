
/*
 * 
 */
package pipelineproject.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class PipelineprojectPaletteFactory {

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
		paletteContainer.add(createJarvisPatrick17CreationTool());
		paletteContainer.add(createJoinAttributesList18CreationTool());
		paletteContainer.add(createKMeans19CreationTool());
		paletteContainer.add(createKNN20CreationTool());
		paletteContainer.add(createLabeledScatterPlot21CreationTool());
		paletteContainer.add(createLasso22CreationTool());
		paletteContainer.add(createLeClause23CreationTool());
		paletteContainer.add(createLinearRegression24CreationTool());
		paletteContainer.add(createLogisticRegression25CreationTool());
		paletteContainer.add(createLtClause26CreationTool());
		paletteContainer.add(createMean27CreationTool());
		paletteContainer.add(createMedian28CreationTool());
		paletteContainer.add(createNotClause29CreationTool());
		paletteContainer.add(createNullValuesRemoval30CreationTool());
		paletteContainer.add(createOrClause31CreationTool());
		paletteContainer.add(createOutputFile32CreationTool());
		paletteContainer.add(createPiePlot33CreationTool());
		paletteContainer.add(createPrimaryKey34CreationTool());
		paletteContainer.add(createProjectOnAttributes35CreationTool());
		paletteContainer.add(createQueryParam36CreationTool());
		paletteContainer.add(createRidge37CreationTool());
		paletteContainer.add(createRuntimeInfo38CreationTool());
		paletteContainer.add(createSVM39CreationTool());
		paletteContainer.add(createScatterPlot40CreationTool());
		paletteContainer.add(createSchema41CreationTool());
		paletteContainer.add(createSkewness42CreationTool());
		paletteContainer.add(createVariance43CreationTool());
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
				Collections.singletonList(PipelineprojectElementTypes.Agglomerative_2035));
		entry.setId("createAgglomerative1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Agglomerative_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAndClause2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.AndClause_3039);
		types.add(PipelineprojectElementTypes.AndClause_3040);
		types.add(PipelineprojectElementTypes.AndClause_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AndClause2CreationTool_title,
				Messages.AndClause2CreationTool_desc, types);
		entry.setId("createAndClause2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.AndClause_3039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attribute3CreationTool_title,
				Messages.Attribute3CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.Attribute_3068));
		entry.setId("createAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Attribute_3068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createChangeDataFormat4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ChangeDataFormat4CreationTool_title,
				Messages.ChangeDataFormat4CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.ChangeDataFormat_2052));
		entry.setId("createChangeDataFormat4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.ChangeDataFormat_2052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainsClause5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.ContainsClause_3048);
		types.add(PipelineprojectElementTypes.ContainsClause_3057);
		types.add(PipelineprojectElementTypes.ContainsClause_3065);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContainsClause5CreationTool_title,
				Messages.ContainsClause5CreationTool_desc, types);
		entry.setId("createContainsClause5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.ContainsClause_3048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCustomCleaning6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CustomCleaning6CreationTool_title,
				Messages.CustomCleaning6CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.CustomCleaning_2051));
		entry.setId("createCustomCleaning6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.CustomCleaning_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCustomParam7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CustomParam7CreationTool_title,
				Messages.CustomParam7CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.CustomParam_3037));
		entry.setId("createCustomParam7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.CustomParam_3037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDBSCAN8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DBSCAN8CreationTool_title,
				Messages.DBSCAN8CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.DBSCAN_2042));
		entry.setId("createDBSCAN8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.DBSCAN_2042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataCollection9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataCollection9CreationTool_title,
				Messages.DataCollection9CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.DataCollection_2053));
		entry.setId("createDataCollection9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.DataCollection_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataIntegration10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataIntegration10CreationTool_title,
				Messages.DataIntegration10CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.DataIntegration_2054));
		entry.setId("createDataIntegration10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.DataIntegration_2054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEqClause11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.EqClause_3045);
		types.add(PipelineprojectElementTypes.EqClause_3054);
		types.add(PipelineprojectElementTypes.EqClause_3062);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EqClause11CreationTool_title,
				Messages.EqClause11CreationTool_desc, types);
		entry.setId("createEqClause11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.EqClause_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Export12CreationTool_title,
				Messages.Export12CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.Export_2056));
		entry.setId("createExport12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Export_2056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeClause13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.GeClause_3047);
		types.add(PipelineprojectElementTypes.GeClause_3056);
		types.add(PipelineprojectElementTypes.GeClause_3064);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GeClause13CreationTool_title,
				Messages.GeClause13CreationTool_desc, types);
		entry.setId("createGeClause13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.GeClause_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGtClause14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.GtClause_3044);
		types.add(PipelineprojectElementTypes.GtClause_3053);
		types.add(PipelineprojectElementTypes.GtClause_3061);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GtClause14CreationTool_title,
				Messages.GtClause14CreationTool_desc, types);
		entry.setId("createGtClause14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.GtClause_3044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHistogram15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Histogram15CreationTool_title,
				Messages.Histogram15CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.Histogram_2064));
		entry.setId("createHistogram15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Histogram_2064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputSourceDeclaration16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputSourceDeclaration16CreationTool_title,
				Messages.InputSourceDeclaration16CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.InputSourceDeclaration_3038));
		entry.setId("createInputSourceDeclaration16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes
				.getImageDescriptor(PipelineprojectElementTypes.InputSourceDeclaration_3038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJarvisPatrick17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JarvisPatrick17CreationTool_title,
				Messages.JarvisPatrick17CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.JarvisPatrick_2043));
		entry.setId("createJarvisPatrick17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.JarvisPatrick_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinAttributesList18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JoinAttributesList18CreationTool_title,
				Messages.JoinAttributesList18CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.JoinAttributesList_3067));
		entry.setId("createJoinAttributesList18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.JoinAttributesList_3067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createKMeans19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.KMeans19CreationTool_title,
				Messages.KMeans19CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.KMeans_2041));
		entry.setId("createKMeans19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.KMeans_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createKNN20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.KNN20CreationTool_title,
				Messages.KNN20CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.KNN_2038));
		entry.setId("createKNN20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.KNN_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabeledScatterPlot21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LabeledScatterPlot21CreationTool_title,
				Messages.LabeledScatterPlot21CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.LabeledScatterPlot_2062));
		entry.setId("createLabeledScatterPlot21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.LabeledScatterPlot_2062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLasso22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Lasso22CreationTool_title,
				Messages.Lasso22CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.Lasso_2037));
		entry.setId("createLasso22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Lasso_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLeClause23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.LeClause_3046);
		types.add(PipelineprojectElementTypes.LeClause_3055);
		types.add(PipelineprojectElementTypes.LeClause_3063);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LeClause23CreationTool_title,
				Messages.LeClause23CreationTool_desc, types);
		entry.setId("createLeClause23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.LeClause_3046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLinearRegression24CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LinearRegression24CreationTool_title,
				Messages.LinearRegression24CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.LinearRegression_2044));
		entry.setId("createLinearRegression24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.LinearRegression_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLogisticRegression25CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LogisticRegression25CreationTool_title,
				Messages.LogisticRegression25CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.LogisticRegression_2059));
		entry.setId("createLogisticRegression25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.LogisticRegression_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLtClause26CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.LtClause_3042);
		types.add(PipelineprojectElementTypes.LtClause_3052);
		types.add(PipelineprojectElementTypes.LtClause_3060);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LtClause26CreationTool_title,
				Messages.LtClause26CreationTool_desc, types);
		entry.setId("createLtClause26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.LtClause_3042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMean27CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Mean27CreationTool_title,
				Messages.Mean27CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.Mean_2045));
		entry.setId("createMean27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Mean_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMedian28CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Median28CreationTool_title,
				Messages.Median28CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.Median_2046));
		entry.setId("createMedian28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Median_2046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNotClause29CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.NotClause_3049);
		types.add(PipelineprojectElementTypes.NotClause_3058);
		types.add(PipelineprojectElementTypes.NotClause_3066);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NotClause29CreationTool_title,
				Messages.NotClause29CreationTool_desc, types);
		entry.setId("createNotClause29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.NotClause_3049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNullValuesRemoval30CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NullValuesRemoval30CreationTool_title,
				Messages.NullValuesRemoval30CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.NullValuesRemoval_2050));
		entry.setId("createNullValuesRemoval30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.NullValuesRemoval_2050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOrClause31CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PipelineprojectElementTypes.OrClause_3041);
		types.add(PipelineprojectElementTypes.OrClause_3051);
		types.add(PipelineprojectElementTypes.OrClause_3059);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OrClause31CreationTool_title,
				Messages.OrClause31CreationTool_desc, types);
		entry.setId("createOrClause31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.OrClause_3041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputFile32CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputFile32CreationTool_title,
				Messages.OutputFile32CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.OutputFile_2058));
		entry.setId("createOutputFile32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.OutputFile_2058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPiePlot33CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PiePlot33CreationTool_title,
				Messages.PiePlot33CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.PiePlot_2065));
		entry.setId("createPiePlot33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.PiePlot_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimaryKey34CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrimaryKey34CreationTool_title,
				Messages.PrimaryKey34CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.PrimaryKey_3069));
		entry.setId("createPrimaryKey34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.PrimaryKey_3069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProjectOnAttributes35CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ProjectOnAttributes35CreationTool_title,
				Messages.ProjectOnAttributes35CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.ProjectOnAttributes_2066));
		entry.setId("createProjectOnAttributes35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.ProjectOnAttributes_2066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQueryParam36CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.QueryParam36CreationTool_title,
				Messages.QueryParam36CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.QueryParam_3070));
		entry.setId("createQueryParam36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.QueryParam_3070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRidge37CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ridge37CreationTool_title,
				Messages.Ridge37CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.Ridge_2036));
		entry.setId("createRidge37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Ridge_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRuntimeInfo38CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RuntimeInfo38CreationTool_title,
				Messages.RuntimeInfo38CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.RuntimeInfo_3036));
		entry.setId("createRuntimeInfo38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.RuntimeInfo_3036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSVM39CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SVM39CreationTool_title,
				Messages.SVM39CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.SVM_2039));
		entry.setId("createSVM39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.SVM_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createScatterPlot40CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ScatterPlot40CreationTool_title,
				Messages.ScatterPlot40CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.ScatterPlot_2063));
		entry.setId("createScatterPlot40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.ScatterPlot_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema41CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Schema41CreationTool_title,
				Messages.Schema41CreationTool_desc, Collections.singletonList(PipelineprojectElementTypes.Schema_2057));
		entry.setId("createSchema41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Schema_2057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSkewness42CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Skewness42CreationTool_title,
				Messages.Skewness42CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.Skewness_2060));
		entry.setId("createSkewness42CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Skewness_2060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVariance43CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Variance43CreationTool_title,
				Messages.Variance43CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.Variance_2047));
		entry.setId("createVariance43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.Variance_2047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCopies1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Copies1CreationTool_title,
				Messages.Copies1CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.PrimaryKeyCopies_4017));
		entry.setId("createCopies1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.PrimaryKeyCopies_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFlow2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataFlow2CreationTool_title,
				Messages.DataFlow2CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.DataFlow_4007));
		entry.setId("createDataFlow2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.DataFlow_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputSchema3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InputSchema3CreationTool_title,
				Messages.InputSchema3CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.TaskInputSchema_4015));
		entry.setId("createInputSchema3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.TaskInputSchema_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputSchema4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.OutputSchema4CreationTool_title,
				Messages.OutputSchema4CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.TaskOutputSchema_4016));
		entry.setId("createOutputSchema4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.TaskOutputSchema_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSourceSchema5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SourceSchema5CreationTool_title,
				Messages.SourceSchema5CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011));
		entry.setId("createSourceSchema5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineprojectElementTypes
				.getImageDescriptor(PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWrites6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Writes6CreationTool_title,
				Messages.Writes6CreationTool_desc,
				Collections.singletonList(PipelineprojectElementTypes.ExportWrites_4010));
		entry.setId("createWrites6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineprojectElementTypes.getImageDescriptor(PipelineprojectElementTypes.ExportWrites_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
