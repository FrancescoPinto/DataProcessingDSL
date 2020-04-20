/*
 * 
 */
package pythonpipeline.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import pythonpipeline.PythonpipelinePackage;
import pythonpipeline.diagram.edit.parts.AgglomerativeIdEditPart;
import pythonpipeline.diagram.edit.parts.AndClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.AndClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.AndClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.AttributeNameEditPart;
import pythonpipeline.diagram.edit.parts.ChangeDataFormatIdEditPart;
import pythonpipeline.diagram.edit.parts.ContainsClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.ContainsClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.ContainsClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.CustomCleaningIdEditPart;
import pythonpipeline.diagram.edit.parts.CustomParamNameEditPart;
import pythonpipeline.diagram.edit.parts.DBSCANIdEditPart;
import pythonpipeline.diagram.edit.parts.DataCollectionIdEditPart;
import pythonpipeline.diagram.edit.parts.DataFlowFormatEditPart;
import pythonpipeline.diagram.edit.parts.DataIntegrationIdEditPart;
import pythonpipeline.diagram.edit.parts.EqClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.EqClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.EqClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.ExportIdEditPart;
import pythonpipeline.diagram.edit.parts.GeClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.GeClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.GeClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.GtClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.GtClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.GtClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.HistogramIdEditPart;
import pythonpipeline.diagram.edit.parts.InputSourceDeclarationSourceURIEditPart;
import pythonpipeline.diagram.edit.parts.JoinAttributesListIdEditPart;
import pythonpipeline.diagram.edit.parts.KMeansIdEditPart;
import pythonpipeline.diagram.edit.parts.LabeledScatterPlotIdEditPart;
import pythonpipeline.diagram.edit.parts.LassoIdEditPart;
import pythonpipeline.diagram.edit.parts.LeClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.LeClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.LeClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.LinearRegressionIdEditPart;
import pythonpipeline.diagram.edit.parts.LogisticRegressionIdEditPart;
import pythonpipeline.diagram.edit.parts.LtClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.LtClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.LtClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.MeanIdEditPart;
import pythonpipeline.diagram.edit.parts.MedianIdEditPart;
import pythonpipeline.diagram.edit.parts.NotClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.NotClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.NotClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.NullValuesRemovalIdEditPart;
import pythonpipeline.diagram.edit.parts.OrClauseId2EditPart;
import pythonpipeline.diagram.edit.parts.OrClauseId3EditPart;
import pythonpipeline.diagram.edit.parts.OrClauseIdEditPart;
import pythonpipeline.diagram.edit.parts.OutputFileNameEditPart;
import pythonpipeline.diagram.edit.parts.PiePlotIdEditPart;
import pythonpipeline.diagram.edit.parts.PrimaryKeyNameEditPart;
import pythonpipeline.diagram.edit.parts.ProjectOnAttributesIdEditPart;
import pythonpipeline.diagram.edit.parts.QueryParamNameEditPart;
import pythonpipeline.diagram.edit.parts.RidgeIdEditPart;
import pythonpipeline.diagram.edit.parts.RuntimeInfoExecutionIdEditPart;
import pythonpipeline.diagram.edit.parts.SVMIdEditPart;
import pythonpipeline.diagram.edit.parts.ScatterPlotIdEditPart;
import pythonpipeline.diagram.edit.parts.SchemaIdEditPart;
import pythonpipeline.diagram.edit.parts.SkewnessIdEditPart;
import pythonpipeline.diagram.edit.parts.StandardDeviationIdEditPart;
import pythonpipeline.diagram.edit.parts.SupportVectorIndexEditPart;
import pythonpipeline.diagram.parsers.MessageFormatParser;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;

/**
 * @generated
 */
public class PythonpipelineParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser agglomerativeId_5002Parser;

	/**
	* @generated
	*/
	private IParser getAgglomerativeId_5002Parser() {
		if (agglomerativeId_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agglomerativeId_5002Parser = parser;
		}
		return agglomerativeId_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser ridgeId_5003Parser;

	/**
	* @generated
	*/
	private IParser getRidgeId_5003Parser() {
		if (ridgeId_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ridgeId_5003Parser = parser;
		}
		return ridgeId_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser lassoId_5004Parser;

	/**
	* @generated
	*/
	private IParser getLassoId_5004Parser() {
		if (lassoId_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lassoId_5004Parser = parser;
		}
		return lassoId_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser sVMId_5005Parser;

	/**
	* @generated
	*/
	private IParser getSVMId_5005Parser() {
		if (sVMId_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sVMId_5005Parser = parser;
		}
		return sVMId_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser kMeansId_5006Parser;

	/**
	* @generated
	*/
	private IParser getKMeansId_5006Parser() {
		if (kMeansId_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			kMeansId_5006Parser = parser;
		}
		return kMeansId_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser dBSCANId_5007Parser;

	/**
	* @generated
	*/
	private IParser getDBSCANId_5007Parser() {
		if (dBSCANId_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBSCANId_5007Parser = parser;
		}
		return dBSCANId_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser linearRegressionId_5008Parser;

	/**
	* @generated
	*/
	private IParser getLinearRegressionId_5008Parser() {
		if (linearRegressionId_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linearRegressionId_5008Parser = parser;
		}
		return linearRegressionId_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser meanId_5009Parser;

	/**
	* @generated
	*/
	private IParser getMeanId_5009Parser() {
		if (meanId_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			meanId_5009Parser = parser;
		}
		return meanId_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser medianId_5010Parser;

	/**
	* @generated
	*/
	private IParser getMedianId_5010Parser() {
		if (medianId_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			medianId_5010Parser = parser;
		}
		return medianId_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser standardDeviationId_5011Parser;

	/**
	* @generated
	*/
	private IParser getStandardDeviationId_5011Parser() {
		if (standardDeviationId_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			standardDeviationId_5011Parser = parser;
		}
		return standardDeviationId_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser logisticRegressionId_5012Parser;

	/**
	* @generated
	*/
	private IParser getLogisticRegressionId_5012Parser() {
		if (logisticRegressionId_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logisticRegressionId_5012Parser = parser;
		}
		return logisticRegressionId_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser skewnessId_5013Parser;

	/**
	* @generated
	*/
	private IParser getSkewnessId_5013Parser() {
		if (skewnessId_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			skewnessId_5013Parser = parser;
		}
		return skewnessId_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser labeledScatterPlotId_5014Parser;

	/**
	* @generated
	*/
	private IParser getLabeledScatterPlotId_5014Parser() {
		if (labeledScatterPlotId_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labeledScatterPlotId_5014Parser = parser;
		}
		return labeledScatterPlotId_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser nullValuesRemovalId_5015Parser;

	/**
	* @generated
	*/
	private IParser getNullValuesRemovalId_5015Parser() {
		if (nullValuesRemovalId_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nullValuesRemovalId_5015Parser = parser;
		}
		return nullValuesRemovalId_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser customCleaningId_5017Parser;

	/**
	* @generated
	*/
	private IParser getCustomCleaningId_5017Parser() {
		if (customCleaningId_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customCleaningId_5017Parser = parser;
		}
		return customCleaningId_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser changeDataFormatId_5018Parser;

	/**
	* @generated
	*/
	private IParser getChangeDataFormatId_5018Parser() {
		if (changeDataFormatId_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			changeDataFormatId_5018Parser = parser;
		}
		return changeDataFormatId_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser scatterPlotId_5019Parser;

	/**
	* @generated
	*/
	private IParser getScatterPlotId_5019Parser() {
		if (scatterPlotId_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scatterPlotId_5019Parser = parser;
		}
		return scatterPlotId_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser histogramId_5020Parser;

	/**
	* @generated
	*/
	private IParser getHistogramId_5020Parser() {
		if (histogramId_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			histogramId_5020Parser = parser;
		}
		return histogramId_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser piePlotId_5021Parser;

	/**
	* @generated
	*/
	private IParser getPiePlotId_5021Parser() {
		if (piePlotId_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			piePlotId_5021Parser = parser;
		}
		return piePlotId_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser projectOnAttributesId_5022Parser;

	/**
	* @generated
	*/
	private IParser getProjectOnAttributesId_5022Parser() {
		if (projectOnAttributesId_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			projectOnAttributesId_5022Parser = parser;
		}
		return projectOnAttributesId_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser dataCollectionId_5052Parser;

	/**
	* @generated
	*/
	private IParser getDataCollectionId_5052Parser() {
		if (dataCollectionId_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataCollectionId_5052Parser = parser;
		}
		return dataCollectionId_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser dataIntegrationId_5054Parser;

	/**
	* @generated
	*/
	private IParser getDataIntegrationId_5054Parser() {
		if (dataIntegrationId_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataIntegrationId_5054Parser = parser;
		}
		return dataIntegrationId_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser exportId_5055Parser;

	/**
	* @generated
	*/
	private IParser getExportId_5055Parser() {
		if (exportId_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportId_5055Parser = parser;
		}
		return exportId_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser schemaId_5058Parser;

	/**
	* @generated
	*/
	private IParser getSchemaId_5058Parser() {
		if (schemaId_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getSchema_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			schemaId_5058Parser = parser;
		}
		return schemaId_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser outputFileName_5059Parser;

	/**
	* @generated
	*/
	private IParser getOutputFileName_5059Parser() {
		if (outputFileName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getOutputFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputFileName_5059Parser = parser;
		}
		return outputFileName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser runtimeInfoExecutionId_5001Parser;

	/**
	* @generated
	*/
	private IParser getRuntimeInfoExecutionId_5001Parser() {
		if (runtimeInfoExecutionId_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getRuntimeInfo_ExecutionId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			runtimeInfoExecutionId_5001Parser = parser;
		}
		return runtimeInfoExecutionId_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser supportVectorIndex_5060Parser;

	/**
	* @generated
	*/
	private IParser getSupportVectorIndex_5060Parser() {
		if (supportVectorIndex_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getSupportVector_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			supportVectorIndex_5060Parser = parser;
		}
		return supportVectorIndex_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser customParamName_5016Parser;

	/**
	* @generated
	*/
	private IParser getCustomParamName_5016Parser() {
		if (customParamName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getCustomParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customParamName_5016Parser = parser;
		}
		return customParamName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser inputSourceDeclarationSourceURI_5051Parser;

	/**
	* @generated
	*/
	private IParser getInputSourceDeclarationSourceURI_5051Parser() {
		if (inputSourceDeclarationSourceURI_5051Parser == null) {
			EAttribute[] features = new EAttribute[] {
					PythonpipelinePackage.eINSTANCE.getInputSourceDeclaration_SourceURI() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputSourceDeclarationSourceURI_5051Parser = parser;
		}
		return inputSourceDeclarationSourceURI_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser andClauseId_5042Parser;

	/**
	* @generated
	*/
	private IParser getAndClauseId_5042Parser() {
		if (andClauseId_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andClauseId_5042Parser = parser;
		}
		return andClauseId_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser andClauseId_5041Parser;

	/**
	* @generated
	*/
	private IParser getAndClauseId_5041Parser() {
		if (andClauseId_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andClauseId_5041Parser = parser;
		}
		return andClauseId_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser orClauseId_5040Parser;

	/**
	* @generated
	*/
	private IParser getOrClauseId_5040Parser() {
		if (orClauseId_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orClauseId_5040Parser = parser;
		}
		return orClauseId_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser ltClauseId_5024Parser;

	/**
	* @generated
	*/
	private IParser getLtClauseId_5024Parser() {
		if (ltClauseId_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ltClauseId_5024Parser = parser;
		}
		return ltClauseId_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser queryParamName_5023Parser;

	/**
	* @generated
	*/
	private IParser getQueryParamName_5023Parser() {
		if (queryParamName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getQueryParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			queryParamName_5023Parser = parser;
		}
		return queryParamName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser gtClauseId_5025Parser;

	/**
	* @generated
	*/
	private IParser getGtClauseId_5025Parser() {
		if (gtClauseId_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gtClauseId_5025Parser = parser;
		}
		return gtClauseId_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser eqClauseId_5026Parser;

	/**
	* @generated
	*/
	private IParser getEqClauseId_5026Parser() {
		if (eqClauseId_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eqClauseId_5026Parser = parser;
		}
		return eqClauseId_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser leClauseId_5027Parser;

	/**
	* @generated
	*/
	private IParser getLeClauseId_5027Parser() {
		if (leClauseId_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leClauseId_5027Parser = parser;
		}
		return leClauseId_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser geClauseId_5028Parser;

	/**
	* @generated
	*/
	private IParser getGeClauseId_5028Parser() {
		if (geClauseId_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			geClauseId_5028Parser = parser;
		}
		return geClauseId_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser containsClauseId_5029Parser;

	/**
	* @generated
	*/
	private IParser getContainsClauseId_5029Parser() {
		if (containsClauseId_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containsClauseId_5029Parser = parser;
		}
		return containsClauseId_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser notClauseId_5039Parser;

	/**
	* @generated
	*/
	private IParser getNotClauseId_5039Parser() {
		if (notClauseId_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notClauseId_5039Parser = parser;
		}
		return notClauseId_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser andClauseId_5030Parser;

	/**
	* @generated
	*/
	private IParser getAndClauseId_5030Parser() {
		if (andClauseId_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andClauseId_5030Parser = parser;
		}
		return andClauseId_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser orClauseId_5031Parser;

	/**
	* @generated
	*/
	private IParser getOrClauseId_5031Parser() {
		if (orClauseId_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orClauseId_5031Parser = parser;
		}
		return orClauseId_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser ltClauseId_5032Parser;

	/**
	* @generated
	*/
	private IParser getLtClauseId_5032Parser() {
		if (ltClauseId_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ltClauseId_5032Parser = parser;
		}
		return ltClauseId_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser gtClauseId_5033Parser;

	/**
	* @generated
	*/
	private IParser getGtClauseId_5033Parser() {
		if (gtClauseId_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gtClauseId_5033Parser = parser;
		}
		return gtClauseId_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser eqClauseId_5034Parser;

	/**
	* @generated
	*/
	private IParser getEqClauseId_5034Parser() {
		if (eqClauseId_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eqClauseId_5034Parser = parser;
		}
		return eqClauseId_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser leClauseId_5035Parser;

	/**
	* @generated
	*/
	private IParser getLeClauseId_5035Parser() {
		if (leClauseId_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leClauseId_5035Parser = parser;
		}
		return leClauseId_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser geClauseId_5036Parser;

	/**
	* @generated
	*/
	private IParser getGeClauseId_5036Parser() {
		if (geClauseId_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			geClauseId_5036Parser = parser;
		}
		return geClauseId_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser containsClauseId_5037Parser;

	/**
	* @generated
	*/
	private IParser getContainsClauseId_5037Parser() {
		if (containsClauseId_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containsClauseId_5037Parser = parser;
		}
		return containsClauseId_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser notClauseId_5038Parser;

	/**
	* @generated
	*/
	private IParser getNotClauseId_5038Parser() {
		if (notClauseId_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notClauseId_5038Parser = parser;
		}
		return notClauseId_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser orClauseId_5043Parser;

	/**
	* @generated
	*/
	private IParser getOrClauseId_5043Parser() {
		if (orClauseId_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orClauseId_5043Parser = parser;
		}
		return orClauseId_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser ltClauseId_5044Parser;

	/**
	* @generated
	*/
	private IParser getLtClauseId_5044Parser() {
		if (ltClauseId_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ltClauseId_5044Parser = parser;
		}
		return ltClauseId_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser gtClauseId_5045Parser;

	/**
	* @generated
	*/
	private IParser getGtClauseId_5045Parser() {
		if (gtClauseId_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gtClauseId_5045Parser = parser;
		}
		return gtClauseId_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser eqClauseId_5046Parser;

	/**
	* @generated
	*/
	private IParser getEqClauseId_5046Parser() {
		if (eqClauseId_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eqClauseId_5046Parser = parser;
		}
		return eqClauseId_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser leClauseId_5047Parser;

	/**
	* @generated
	*/
	private IParser getLeClauseId_5047Parser() {
		if (leClauseId_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leClauseId_5047Parser = parser;
		}
		return leClauseId_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser geClauseId_5048Parser;

	/**
	* @generated
	*/
	private IParser getGeClauseId_5048Parser() {
		if (geClauseId_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			geClauseId_5048Parser = parser;
		}
		return geClauseId_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser containsClauseId_5049Parser;

	/**
	* @generated
	*/
	private IParser getContainsClauseId_5049Parser() {
		if (containsClauseId_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containsClauseId_5049Parser = parser;
		}
		return containsClauseId_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser notClauseId_5050Parser;

	/**
	* @generated
	*/
	private IParser getNotClauseId_5050Parser() {
		if (notClauseId_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notClauseId_5050Parser = parser;
		}
		return notClauseId_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser joinAttributesListId_5053Parser;

	/**
	* @generated
	*/
	private IParser getJoinAttributesListId_5053Parser() {
		if (joinAttributesListId_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getJoinAttributesList_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			joinAttributesListId_5053Parser = parser;
		}
		return joinAttributesListId_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5056Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5056Parser() {
		if (attributeName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5056Parser = parser;
		}
		return attributeName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser primaryKeyName_5057Parser;

	/**
	* @generated
	*/
	private IParser getPrimaryKeyName_5057Parser() {
		if (primaryKeyName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { PythonpipelinePackage.eINSTANCE.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primaryKeyName_5057Parser = parser;
		}
		return primaryKeyName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser dataFlowFormat_6001Parser;

	/**
	* @generated
	*/
	private IParser getDataFlowFormat_6001Parser() {
		if (dataFlowFormat_6001Parser == null) {
			EAttribute editableFeature = PythonpipelinePackage.eINSTANCE.getDataFlow_Format();
			EnumParser parser = new EnumParser(editableFeature);
			dataFlowFormat_6001Parser = parser;
		}
		return dataFlowFormat_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AgglomerativeIdEditPart.VISUAL_ID:
			return getAgglomerativeId_5002Parser();
		case RidgeIdEditPart.VISUAL_ID:
			return getRidgeId_5003Parser();
		case LassoIdEditPart.VISUAL_ID:
			return getLassoId_5004Parser();
		case SVMIdEditPart.VISUAL_ID:
			return getSVMId_5005Parser();
		case KMeansIdEditPart.VISUAL_ID:
			return getKMeansId_5006Parser();
		case DBSCANIdEditPart.VISUAL_ID:
			return getDBSCANId_5007Parser();
		case LinearRegressionIdEditPart.VISUAL_ID:
			return getLinearRegressionId_5008Parser();
		case MeanIdEditPart.VISUAL_ID:
			return getMeanId_5009Parser();
		case MedianIdEditPart.VISUAL_ID:
			return getMedianId_5010Parser();
		case StandardDeviationIdEditPart.VISUAL_ID:
			return getStandardDeviationId_5011Parser();
		case LogisticRegressionIdEditPart.VISUAL_ID:
			return getLogisticRegressionId_5012Parser();
		case SkewnessIdEditPart.VISUAL_ID:
			return getSkewnessId_5013Parser();
		case LabeledScatterPlotIdEditPart.VISUAL_ID:
			return getLabeledScatterPlotId_5014Parser();
		case NullValuesRemovalIdEditPart.VISUAL_ID:
			return getNullValuesRemovalId_5015Parser();
		case CustomCleaningIdEditPart.VISUAL_ID:
			return getCustomCleaningId_5017Parser();
		case ChangeDataFormatIdEditPart.VISUAL_ID:
			return getChangeDataFormatId_5018Parser();
		case ScatterPlotIdEditPart.VISUAL_ID:
			return getScatterPlotId_5019Parser();
		case HistogramIdEditPart.VISUAL_ID:
			return getHistogramId_5020Parser();
		case PiePlotIdEditPart.VISUAL_ID:
			return getPiePlotId_5021Parser();
		case ProjectOnAttributesIdEditPart.VISUAL_ID:
			return getProjectOnAttributesId_5022Parser();
		case DataCollectionIdEditPart.VISUAL_ID:
			return getDataCollectionId_5052Parser();
		case DataIntegrationIdEditPart.VISUAL_ID:
			return getDataIntegrationId_5054Parser();
		case ExportIdEditPart.VISUAL_ID:
			return getExportId_5055Parser();
		case SchemaIdEditPart.VISUAL_ID:
			return getSchemaId_5058Parser();
		case OutputFileNameEditPart.VISUAL_ID:
			return getOutputFileName_5059Parser();
		case RuntimeInfoExecutionIdEditPart.VISUAL_ID:
			return getRuntimeInfoExecutionId_5001Parser();
		case SupportVectorIndexEditPart.VISUAL_ID:
			return getSupportVectorIndex_5060Parser();
		case CustomParamNameEditPart.VISUAL_ID:
			return getCustomParamName_5016Parser();
		case InputSourceDeclarationSourceURIEditPart.VISUAL_ID:
			return getInputSourceDeclarationSourceURI_5051Parser();
		case AndClauseIdEditPart.VISUAL_ID:
			return getAndClauseId_5042Parser();
		case AndClauseId2EditPart.VISUAL_ID:
			return getAndClauseId_5041Parser();
		case OrClauseIdEditPart.VISUAL_ID:
			return getOrClauseId_5040Parser();
		case LtClauseIdEditPart.VISUAL_ID:
			return getLtClauseId_5024Parser();
		case QueryParamNameEditPart.VISUAL_ID:
			return getQueryParamName_5023Parser();
		case GtClauseIdEditPart.VISUAL_ID:
			return getGtClauseId_5025Parser();
		case EqClauseIdEditPart.VISUAL_ID:
			return getEqClauseId_5026Parser();
		case LeClauseIdEditPart.VISUAL_ID:
			return getLeClauseId_5027Parser();
		case GeClauseIdEditPart.VISUAL_ID:
			return getGeClauseId_5028Parser();
		case ContainsClauseIdEditPart.VISUAL_ID:
			return getContainsClauseId_5029Parser();
		case NotClauseIdEditPart.VISUAL_ID:
			return getNotClauseId_5039Parser();
		case AndClauseId3EditPart.VISUAL_ID:
			return getAndClauseId_5030Parser();
		case OrClauseId2EditPart.VISUAL_ID:
			return getOrClauseId_5031Parser();
		case LtClauseId2EditPart.VISUAL_ID:
			return getLtClauseId_5032Parser();
		case GtClauseId2EditPart.VISUAL_ID:
			return getGtClauseId_5033Parser();
		case EqClauseId2EditPart.VISUAL_ID:
			return getEqClauseId_5034Parser();
		case LeClauseId2EditPart.VISUAL_ID:
			return getLeClauseId_5035Parser();
		case GeClauseId2EditPart.VISUAL_ID:
			return getGeClauseId_5036Parser();
		case ContainsClauseId2EditPart.VISUAL_ID:
			return getContainsClauseId_5037Parser();
		case NotClauseId2EditPart.VISUAL_ID:
			return getNotClauseId_5038Parser();
		case OrClauseId3EditPart.VISUAL_ID:
			return getOrClauseId_5043Parser();
		case LtClauseId3EditPart.VISUAL_ID:
			return getLtClauseId_5044Parser();
		case GtClauseId3EditPart.VISUAL_ID:
			return getGtClauseId_5045Parser();
		case EqClauseId3EditPart.VISUAL_ID:
			return getEqClauseId_5046Parser();
		case LeClauseId3EditPart.VISUAL_ID:
			return getLeClauseId_5047Parser();
		case GeClauseId3EditPart.VISUAL_ID:
			return getGeClauseId_5048Parser();
		case ContainsClauseId3EditPart.VISUAL_ID:
			return getContainsClauseId_5049Parser();
		case NotClauseId3EditPart.VISUAL_ID:
			return getNotClauseId_5050Parser();
		case JoinAttributesListIdEditPart.VISUAL_ID:
			return getJoinAttributesListId_5053Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5056Parser();
		case PrimaryKeyNameEditPart.VISUAL_ID:
			return getPrimaryKeyName_5057Parser();

		case DataFlowFormatEditPart.VISUAL_ID:
			return getDataFlowFormat_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PythonpipelineVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PythonpipelineVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PythonpipelineElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
