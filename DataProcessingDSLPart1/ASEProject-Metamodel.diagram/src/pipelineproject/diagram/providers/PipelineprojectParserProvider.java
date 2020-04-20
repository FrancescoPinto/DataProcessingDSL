/*
 * 
 */
package pipelineproject.diagram.providers;

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

import pipelineproject.PipelineprojectPackage;
import pipelineproject.diagram.edit.parts.AgglomerativeIdEditPart;
import pipelineproject.diagram.edit.parts.AndClauseId2EditPart;
import pipelineproject.diagram.edit.parts.AndClauseId3EditPart;
import pipelineproject.diagram.edit.parts.AndClauseIdEditPart;
import pipelineproject.diagram.edit.parts.AttributeNameEditPart;
import pipelineproject.diagram.edit.parts.ChangeDataFormatIdEditPart;
import pipelineproject.diagram.edit.parts.ContainsClauseId2EditPart;
import pipelineproject.diagram.edit.parts.ContainsClauseId3EditPart;
import pipelineproject.diagram.edit.parts.ContainsClauseIdEditPart;
import pipelineproject.diagram.edit.parts.CustomCleaningIdEditPart;
import pipelineproject.diagram.edit.parts.CustomParamNameEditPart;
import pipelineproject.diagram.edit.parts.DBSCANIdEditPart;
import pipelineproject.diagram.edit.parts.DataCollectionIdEditPart;
import pipelineproject.diagram.edit.parts.DataFlowFormatEditPart;
import pipelineproject.diagram.edit.parts.DataIntegrationIdEditPart;
import pipelineproject.diagram.edit.parts.EqClauseId2EditPart;
import pipelineproject.diagram.edit.parts.EqClauseId3EditPart;
import pipelineproject.diagram.edit.parts.EqClauseIdEditPart;
import pipelineproject.diagram.edit.parts.ExportIdEditPart;
import pipelineproject.diagram.edit.parts.GeClauseId2EditPart;
import pipelineproject.diagram.edit.parts.GeClauseId3EditPart;
import pipelineproject.diagram.edit.parts.GeClauseIdEditPart;
import pipelineproject.diagram.edit.parts.GtClauseId2EditPart;
import pipelineproject.diagram.edit.parts.GtClauseId3EditPart;
import pipelineproject.diagram.edit.parts.GtClauseIdEditPart;
import pipelineproject.diagram.edit.parts.HistogramIdEditPart;
import pipelineproject.diagram.edit.parts.InputSourceDeclarationSourceURIEditPart;
import pipelineproject.diagram.edit.parts.JarvisPatrickIdEditPart;
import pipelineproject.diagram.edit.parts.JoinAttributesListIdEditPart;
import pipelineproject.diagram.edit.parts.KMeansIdEditPart;
import pipelineproject.diagram.edit.parts.KNNIdEditPart;
import pipelineproject.diagram.edit.parts.LabeledScatterPlotIdEditPart;
import pipelineproject.diagram.edit.parts.LassoIdEditPart;
import pipelineproject.diagram.edit.parts.LeClauseId2EditPart;
import pipelineproject.diagram.edit.parts.LeClauseId3EditPart;
import pipelineproject.diagram.edit.parts.LeClauseIdEditPart;
import pipelineproject.diagram.edit.parts.LinearRegressionIdEditPart;
import pipelineproject.diagram.edit.parts.LogisticRegressionIdEditPart;
import pipelineproject.diagram.edit.parts.LtClauseId2EditPart;
import pipelineproject.diagram.edit.parts.LtClauseId3EditPart;
import pipelineproject.diagram.edit.parts.LtClauseIdEditPart;
import pipelineproject.diagram.edit.parts.MeanIdEditPart;
import pipelineproject.diagram.edit.parts.MedianIdEditPart;
import pipelineproject.diagram.edit.parts.NotClauseId2EditPart;
import pipelineproject.diagram.edit.parts.NotClauseId3EditPart;
import pipelineproject.diagram.edit.parts.NotClauseIdEditPart;
import pipelineproject.diagram.edit.parts.NullValuesRemovalIdEditPart;
import pipelineproject.diagram.edit.parts.OrClauseId2EditPart;
import pipelineproject.diagram.edit.parts.OrClauseId3EditPart;
import pipelineproject.diagram.edit.parts.OrClauseIdEditPart;
import pipelineproject.diagram.edit.parts.OutputFileNameEditPart;
import pipelineproject.diagram.edit.parts.PiePlotIdEditPart;
import pipelineproject.diagram.edit.parts.PrimaryKeyNameEditPart;
import pipelineproject.diagram.edit.parts.ProjectOnAttributesIdEditPart;
import pipelineproject.diagram.edit.parts.QueryParamNameEditPart;
import pipelineproject.diagram.edit.parts.RidgeIdEditPart;
import pipelineproject.diagram.edit.parts.RuntimeInfoExecutionIdEditPart;
import pipelineproject.diagram.edit.parts.SVMIdEditPart;
import pipelineproject.diagram.edit.parts.ScatterPlotIdEditPart;
import pipelineproject.diagram.edit.parts.SchemaIdEditPart;
import pipelineproject.diagram.edit.parts.SkewnessIdEditPart;
import pipelineproject.diagram.edit.parts.VarianceIdEditPart;
import pipelineproject.diagram.parsers.MessageFormatParser;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;

/**
 * @generated
 */
public class PipelineprojectParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser agglomerativeId_5125Parser;

	/**
	* @generated
	*/
	private IParser getAgglomerativeId_5125Parser() {
		if (agglomerativeId_5125Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agglomerativeId_5125Parser = parser;
		}
		return agglomerativeId_5125Parser;
	}

	/**
	* @generated
	*/
	private IParser ridgeId_5126Parser;

	/**
	* @generated
	*/
	private IParser getRidgeId_5126Parser() {
		if (ridgeId_5126Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ridgeId_5126Parser = parser;
		}
		return ridgeId_5126Parser;
	}

	/**
	* @generated
	*/
	private IParser lassoId_5127Parser;

	/**
	* @generated
	*/
	private IParser getLassoId_5127Parser() {
		if (lassoId_5127Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lassoId_5127Parser = parser;
		}
		return lassoId_5127Parser;
	}

	/**
	* @generated
	*/
	private IParser kNNId_5128Parser;

	/**
	* @generated
	*/
	private IParser getKNNId_5128Parser() {
		if (kNNId_5128Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			kNNId_5128Parser = parser;
		}
		return kNNId_5128Parser;
	}

	/**
	* @generated
	*/
	private IParser sVMId_5129Parser;

	/**
	* @generated
	*/
	private IParser getSVMId_5129Parser() {
		if (sVMId_5129Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sVMId_5129Parser = parser;
		}
		return sVMId_5129Parser;
	}

	/**
	* @generated
	*/
	private IParser kMeansId_5131Parser;

	/**
	* @generated
	*/
	private IParser getKMeansId_5131Parser() {
		if (kMeansId_5131Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			kMeansId_5131Parser = parser;
		}
		return kMeansId_5131Parser;
	}

	/**
	* @generated
	*/
	private IParser dBSCANId_5132Parser;

	/**
	* @generated
	*/
	private IParser getDBSCANId_5132Parser() {
		if (dBSCANId_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBSCANId_5132Parser = parser;
		}
		return dBSCANId_5132Parser;
	}

	/**
	* @generated
	*/
	private IParser jarvisPatrickId_5133Parser;

	/**
	* @generated
	*/
	private IParser getJarvisPatrickId_5133Parser() {
		if (jarvisPatrickId_5133Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			jarvisPatrickId_5133Parser = parser;
		}
		return jarvisPatrickId_5133Parser;
	}

	/**
	* @generated
	*/
	private IParser linearRegressionId_5134Parser;

	/**
	* @generated
	*/
	private IParser getLinearRegressionId_5134Parser() {
		if (linearRegressionId_5134Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linearRegressionId_5134Parser = parser;
		}
		return linearRegressionId_5134Parser;
	}

	/**
	* @generated
	*/
	private IParser meanId_5135Parser;

	/**
	* @generated
	*/
	private IParser getMeanId_5135Parser() {
		if (meanId_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			meanId_5135Parser = parser;
		}
		return meanId_5135Parser;
	}

	/**
	* @generated
	*/
	private IParser medianId_5136Parser;

	/**
	* @generated
	*/
	private IParser getMedianId_5136Parser() {
		if (medianId_5136Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			medianId_5136Parser = parser;
		}
		return medianId_5136Parser;
	}

	/**
	* @generated
	*/
	private IParser varianceId_5137Parser;

	/**
	* @generated
	*/
	private IParser getVarianceId_5137Parser() {
		if (varianceId_5137Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			varianceId_5137Parser = parser;
		}
		return varianceId_5137Parser;
	}

	/**
	* @generated
	*/
	private IParser logisticRegressionId_5182Parser;

	/**
	* @generated
	*/
	private IParser getLogisticRegressionId_5182Parser() {
		if (logisticRegressionId_5182Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logisticRegressionId_5182Parser = parser;
		}
		return logisticRegressionId_5182Parser;
	}

	/**
	* @generated
	*/
	private IParser skewnessId_5184Parser;

	/**
	* @generated
	*/
	private IParser getSkewnessId_5184Parser() {
		if (skewnessId_5184Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			skewnessId_5184Parser = parser;
		}
		return skewnessId_5184Parser;
	}

	/**
	* @generated
	*/
	private IParser labeledScatterPlotId_5186Parser;

	/**
	* @generated
	*/
	private IParser getLabeledScatterPlotId_5186Parser() {
		if (labeledScatterPlotId_5186Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labeledScatterPlotId_5186Parser = parser;
		}
		return labeledScatterPlotId_5186Parser;
	}

	/**
	* @generated
	*/
	private IParser nullValuesRemovalId_5140Parser;

	/**
	* @generated
	*/
	private IParser getNullValuesRemovalId_5140Parser() {
		if (nullValuesRemovalId_5140Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nullValuesRemovalId_5140Parser = parser;
		}
		return nullValuesRemovalId_5140Parser;
	}

	/**
	* @generated
	*/
	private IParser customCleaningId_5142Parser;

	/**
	* @generated
	*/
	private IParser getCustomCleaningId_5142Parser() {
		if (customCleaningId_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customCleaningId_5142Parser = parser;
		}
		return customCleaningId_5142Parser;
	}

	/**
	* @generated
	*/
	private IParser changeDataFormatId_5143Parser;

	/**
	* @generated
	*/
	private IParser getChangeDataFormatId_5143Parser() {
		if (changeDataFormatId_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			changeDataFormatId_5143Parser = parser;
		}
		return changeDataFormatId_5143Parser;
	}

	/**
	* @generated
	*/
	private IParser scatterPlotId_5187Parser;

	/**
	* @generated
	*/
	private IParser getScatterPlotId_5187Parser() {
		if (scatterPlotId_5187Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scatterPlotId_5187Parser = parser;
		}
		return scatterPlotId_5187Parser;
	}

	/**
	* @generated
	*/
	private IParser histogramId_5188Parser;

	/**
	* @generated
	*/
	private IParser getHistogramId_5188Parser() {
		if (histogramId_5188Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			histogramId_5188Parser = parser;
		}
		return histogramId_5188Parser;
	}

	/**
	* @generated
	*/
	private IParser piePlotId_5189Parser;

	/**
	* @generated
	*/
	private IParser getPiePlotId_5189Parser() {
		if (piePlotId_5189Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			piePlotId_5189Parser = parser;
		}
		return piePlotId_5189Parser;
	}

	/**
	* @generated
	*/
	private IParser projectOnAttributesId_5190Parser;

	/**
	* @generated
	*/
	private IParser getProjectOnAttributesId_5190Parser() {
		if (projectOnAttributesId_5190Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			projectOnAttributesId_5190Parser = parser;
		}
		return projectOnAttributesId_5190Parser;
	}

	/**
	* @generated
	*/
	private IParser dataCollectionId_5173Parser;

	/**
	* @generated
	*/
	private IParser getDataCollectionId_5173Parser() {
		if (dataCollectionId_5173Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataCollectionId_5173Parser = parser;
		}
		return dataCollectionId_5173Parser;
	}

	/**
	* @generated
	*/
	private IParser dataIntegrationId_5175Parser;

	/**
	* @generated
	*/
	private IParser getDataIntegrationId_5175Parser() {
		if (dataIntegrationId_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataIntegrationId_5175Parser = parser;
		}
		return dataIntegrationId_5175Parser;
	}

	/**
	* @generated
	*/
	private IParser exportId_5177Parser;

	/**
	* @generated
	*/
	private IParser getExportId_5177Parser() {
		if (exportId_5177Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getTask_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportId_5177Parser = parser;
		}
		return exportId_5177Parser;
	}

	/**
	* @generated
	*/
	private IParser schemaId_5180Parser;

	/**
	* @generated
	*/
	private IParser getSchemaId_5180Parser() {
		if (schemaId_5180Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getSchema_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			schemaId_5180Parser = parser;
		}
		return schemaId_5180Parser;
	}

	/**
	* @generated
	*/
	private IParser outputFileName_5181Parser;

	/**
	* @generated
	*/
	private IParser getOutputFileName_5181Parser() {
		if (outputFileName_5181Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getOutputFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputFileName_5181Parser = parser;
		}
		return outputFileName_5181Parser;
	}

	/**
	* @generated
	*/
	private IParser runtimeInfoExecutionId_5124Parser;

	/**
	* @generated
	*/
	private IParser getRuntimeInfoExecutionId_5124Parser() {
		if (runtimeInfoExecutionId_5124Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getRuntimeInfo_ExecutionId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			runtimeInfoExecutionId_5124Parser = parser;
		}
		return runtimeInfoExecutionId_5124Parser;
	}

	/**
	* @generated
	*/
	private IParser customParamName_5141Parser;

	/**
	* @generated
	*/
	private IParser getCustomParamName_5141Parser() {
		if (customParamName_5141Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getCustomParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customParamName_5141Parser = parser;
		}
		return customParamName_5141Parser;
	}

	/**
	* @generated
	*/
	private IParser inputSourceDeclarationSourceURI_5172Parser;

	/**
	* @generated
	*/
	private IParser getInputSourceDeclarationSourceURI_5172Parser() {
		if (inputSourceDeclarationSourceURI_5172Parser == null) {
			EAttribute[] features = new EAttribute[] {
					PipelineprojectPackage.eINSTANCE.getInputSourceDeclaration_SourceURI() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputSourceDeclarationSourceURI_5172Parser = parser;
		}
		return inputSourceDeclarationSourceURI_5172Parser;
	}

	/**
	* @generated
	*/
	private IParser andClauseId_5163Parser;

	/**
	* @generated
	*/
	private IParser getAndClauseId_5163Parser() {
		if (andClauseId_5163Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andClauseId_5163Parser = parser;
		}
		return andClauseId_5163Parser;
	}

	/**
	* @generated
	*/
	private IParser andClauseId_5162Parser;

	/**
	* @generated
	*/
	private IParser getAndClauseId_5162Parser() {
		if (andClauseId_5162Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andClauseId_5162Parser = parser;
		}
		return andClauseId_5162Parser;
	}

	/**
	* @generated
	*/
	private IParser orClauseId_5161Parser;

	/**
	* @generated
	*/
	private IParser getOrClauseId_5161Parser() {
		if (orClauseId_5161Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orClauseId_5161Parser = parser;
		}
		return orClauseId_5161Parser;
	}

	/**
	* @generated
	*/
	private IParser ltClauseId_5145Parser;

	/**
	* @generated
	*/
	private IParser getLtClauseId_5145Parser() {
		if (ltClauseId_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ltClauseId_5145Parser = parser;
		}
		return ltClauseId_5145Parser;
	}

	/**
	* @generated
	*/
	private IParser queryParamName_5191Parser;

	/**
	* @generated
	*/
	private IParser getQueryParamName_5191Parser() {
		if (queryParamName_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getQueryParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			queryParamName_5191Parser = parser;
		}
		return queryParamName_5191Parser;
	}

	/**
	* @generated
	*/
	private IParser gtClauseId_5146Parser;

	/**
	* @generated
	*/
	private IParser getGtClauseId_5146Parser() {
		if (gtClauseId_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gtClauseId_5146Parser = parser;
		}
		return gtClauseId_5146Parser;
	}

	/**
	* @generated
	*/
	private IParser eqClauseId_5147Parser;

	/**
	* @generated
	*/
	private IParser getEqClauseId_5147Parser() {
		if (eqClauseId_5147Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eqClauseId_5147Parser = parser;
		}
		return eqClauseId_5147Parser;
	}

	/**
	* @generated
	*/
	private IParser leClauseId_5148Parser;

	/**
	* @generated
	*/
	private IParser getLeClauseId_5148Parser() {
		if (leClauseId_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leClauseId_5148Parser = parser;
		}
		return leClauseId_5148Parser;
	}

	/**
	* @generated
	*/
	private IParser geClauseId_5149Parser;

	/**
	* @generated
	*/
	private IParser getGeClauseId_5149Parser() {
		if (geClauseId_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			geClauseId_5149Parser = parser;
		}
		return geClauseId_5149Parser;
	}

	/**
	* @generated
	*/
	private IParser containsClauseId_5150Parser;

	/**
	* @generated
	*/
	private IParser getContainsClauseId_5150Parser() {
		if (containsClauseId_5150Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containsClauseId_5150Parser = parser;
		}
		return containsClauseId_5150Parser;
	}

	/**
	* @generated
	*/
	private IParser notClauseId_5160Parser;

	/**
	* @generated
	*/
	private IParser getNotClauseId_5160Parser() {
		if (notClauseId_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notClauseId_5160Parser = parser;
		}
		return notClauseId_5160Parser;
	}

	/**
	* @generated
	*/
	private IParser andClauseId_5151Parser;

	/**
	* @generated
	*/
	private IParser getAndClauseId_5151Parser() {
		if (andClauseId_5151Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andClauseId_5151Parser = parser;
		}
		return andClauseId_5151Parser;
	}

	/**
	* @generated
	*/
	private IParser orClauseId_5152Parser;

	/**
	* @generated
	*/
	private IParser getOrClauseId_5152Parser() {
		if (orClauseId_5152Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orClauseId_5152Parser = parser;
		}
		return orClauseId_5152Parser;
	}

	/**
	* @generated
	*/
	private IParser ltClauseId_5153Parser;

	/**
	* @generated
	*/
	private IParser getLtClauseId_5153Parser() {
		if (ltClauseId_5153Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ltClauseId_5153Parser = parser;
		}
		return ltClauseId_5153Parser;
	}

	/**
	* @generated
	*/
	private IParser gtClauseId_5154Parser;

	/**
	* @generated
	*/
	private IParser getGtClauseId_5154Parser() {
		if (gtClauseId_5154Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gtClauseId_5154Parser = parser;
		}
		return gtClauseId_5154Parser;
	}

	/**
	* @generated
	*/
	private IParser eqClauseId_5155Parser;

	/**
	* @generated
	*/
	private IParser getEqClauseId_5155Parser() {
		if (eqClauseId_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eqClauseId_5155Parser = parser;
		}
		return eqClauseId_5155Parser;
	}

	/**
	* @generated
	*/
	private IParser leClauseId_5156Parser;

	/**
	* @generated
	*/
	private IParser getLeClauseId_5156Parser() {
		if (leClauseId_5156Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leClauseId_5156Parser = parser;
		}
		return leClauseId_5156Parser;
	}

	/**
	* @generated
	*/
	private IParser geClauseId_5157Parser;

	/**
	* @generated
	*/
	private IParser getGeClauseId_5157Parser() {
		if (geClauseId_5157Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			geClauseId_5157Parser = parser;
		}
		return geClauseId_5157Parser;
	}

	/**
	* @generated
	*/
	private IParser containsClauseId_5158Parser;

	/**
	* @generated
	*/
	private IParser getContainsClauseId_5158Parser() {
		if (containsClauseId_5158Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containsClauseId_5158Parser = parser;
		}
		return containsClauseId_5158Parser;
	}

	/**
	* @generated
	*/
	private IParser notClauseId_5159Parser;

	/**
	* @generated
	*/
	private IParser getNotClauseId_5159Parser() {
		if (notClauseId_5159Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notClauseId_5159Parser = parser;
		}
		return notClauseId_5159Parser;
	}

	/**
	* @generated
	*/
	private IParser orClauseId_5164Parser;

	/**
	* @generated
	*/
	private IParser getOrClauseId_5164Parser() {
		if (orClauseId_5164Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orClauseId_5164Parser = parser;
		}
		return orClauseId_5164Parser;
	}

	/**
	* @generated
	*/
	private IParser ltClauseId_5165Parser;

	/**
	* @generated
	*/
	private IParser getLtClauseId_5165Parser() {
		if (ltClauseId_5165Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ltClauseId_5165Parser = parser;
		}
		return ltClauseId_5165Parser;
	}

	/**
	* @generated
	*/
	private IParser gtClauseId_5166Parser;

	/**
	* @generated
	*/
	private IParser getGtClauseId_5166Parser() {
		if (gtClauseId_5166Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gtClauseId_5166Parser = parser;
		}
		return gtClauseId_5166Parser;
	}

	/**
	* @generated
	*/
	private IParser eqClauseId_5167Parser;

	/**
	* @generated
	*/
	private IParser getEqClauseId_5167Parser() {
		if (eqClauseId_5167Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eqClauseId_5167Parser = parser;
		}
		return eqClauseId_5167Parser;
	}

	/**
	* @generated
	*/
	private IParser leClauseId_5168Parser;

	/**
	* @generated
	*/
	private IParser getLeClauseId_5168Parser() {
		if (leClauseId_5168Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leClauseId_5168Parser = parser;
		}
		return leClauseId_5168Parser;
	}

	/**
	* @generated
	*/
	private IParser geClauseId_5169Parser;

	/**
	* @generated
	*/
	private IParser getGeClauseId_5169Parser() {
		if (geClauseId_5169Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			geClauseId_5169Parser = parser;
		}
		return geClauseId_5169Parser;
	}

	/**
	* @generated
	*/
	private IParser containsClauseId_5170Parser;

	/**
	* @generated
	*/
	private IParser getContainsClauseId_5170Parser() {
		if (containsClauseId_5170Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containsClauseId_5170Parser = parser;
		}
		return containsClauseId_5170Parser;
	}

	/**
	* @generated
	*/
	private IParser notClauseId_5171Parser;

	/**
	* @generated
	*/
	private IParser getNotClauseId_5171Parser() {
		if (notClauseId_5171Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getLogicProposition_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notClauseId_5171Parser = parser;
		}
		return notClauseId_5171Parser;
	}

	/**
	* @generated
	*/
	private IParser joinAttributesListId_5174Parser;

	/**
	* @generated
	*/
	private IParser getJoinAttributesListId_5174Parser() {
		if (joinAttributesListId_5174Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getJoinAttributesList_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			joinAttributesListId_5174Parser = parser;
		}
		return joinAttributesListId_5174Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5178Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5178Parser() {
		if (attributeName_5178Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5178Parser = parser;
		}
		return attributeName_5178Parser;
	}

	/**
	* @generated
	*/
	private IParser primaryKeyName_5183Parser;

	/**
	* @generated
	*/
	private IParser getPrimaryKeyName_5183Parser() {
		if (primaryKeyName_5183Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelineprojectPackage.eINSTANCE.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primaryKeyName_5183Parser = parser;
		}
		return primaryKeyName_5183Parser;
	}

	/**
	* @generated
	*/
	private IParser dataFlowFormat_6007Parser;

	/**
	* @generated
	*/
	private IParser getDataFlowFormat_6007Parser() {
		if (dataFlowFormat_6007Parser == null) {
			EAttribute editableFeature = PipelineprojectPackage.eINSTANCE.getDataFlow_Format();
			EnumParser parser = new EnumParser(editableFeature);
			dataFlowFormat_6007Parser = parser;
		}
		return dataFlowFormat_6007Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AgglomerativeIdEditPart.VISUAL_ID:
			return getAgglomerativeId_5125Parser();
		case RidgeIdEditPart.VISUAL_ID:
			return getRidgeId_5126Parser();
		case LassoIdEditPart.VISUAL_ID:
			return getLassoId_5127Parser();
		case KNNIdEditPart.VISUAL_ID:
			return getKNNId_5128Parser();
		case SVMIdEditPart.VISUAL_ID:
			return getSVMId_5129Parser();
		case KMeansIdEditPart.VISUAL_ID:
			return getKMeansId_5131Parser();
		case DBSCANIdEditPart.VISUAL_ID:
			return getDBSCANId_5132Parser();
		case JarvisPatrickIdEditPart.VISUAL_ID:
			return getJarvisPatrickId_5133Parser();
		case LinearRegressionIdEditPart.VISUAL_ID:
			return getLinearRegressionId_5134Parser();
		case MeanIdEditPart.VISUAL_ID:
			return getMeanId_5135Parser();
		case MedianIdEditPart.VISUAL_ID:
			return getMedianId_5136Parser();
		case VarianceIdEditPart.VISUAL_ID:
			return getVarianceId_5137Parser();
		case LogisticRegressionIdEditPart.VISUAL_ID:
			return getLogisticRegressionId_5182Parser();
		case SkewnessIdEditPart.VISUAL_ID:
			return getSkewnessId_5184Parser();
		case LabeledScatterPlotIdEditPart.VISUAL_ID:
			return getLabeledScatterPlotId_5186Parser();
		case NullValuesRemovalIdEditPart.VISUAL_ID:
			return getNullValuesRemovalId_5140Parser();
		case CustomCleaningIdEditPart.VISUAL_ID:
			return getCustomCleaningId_5142Parser();
		case ChangeDataFormatIdEditPart.VISUAL_ID:
			return getChangeDataFormatId_5143Parser();
		case ScatterPlotIdEditPart.VISUAL_ID:
			return getScatterPlotId_5187Parser();
		case HistogramIdEditPart.VISUAL_ID:
			return getHistogramId_5188Parser();
		case PiePlotIdEditPart.VISUAL_ID:
			return getPiePlotId_5189Parser();
		case ProjectOnAttributesIdEditPart.VISUAL_ID:
			return getProjectOnAttributesId_5190Parser();
		case DataCollectionIdEditPart.VISUAL_ID:
			return getDataCollectionId_5173Parser();
		case DataIntegrationIdEditPart.VISUAL_ID:
			return getDataIntegrationId_5175Parser();
		case ExportIdEditPart.VISUAL_ID:
			return getExportId_5177Parser();
		case SchemaIdEditPart.VISUAL_ID:
			return getSchemaId_5180Parser();
		case OutputFileNameEditPart.VISUAL_ID:
			return getOutputFileName_5181Parser();
		case RuntimeInfoExecutionIdEditPart.VISUAL_ID:
			return getRuntimeInfoExecutionId_5124Parser();
		case CustomParamNameEditPart.VISUAL_ID:
			return getCustomParamName_5141Parser();
		case InputSourceDeclarationSourceURIEditPart.VISUAL_ID:
			return getInputSourceDeclarationSourceURI_5172Parser();
		case AndClauseIdEditPart.VISUAL_ID:
			return getAndClauseId_5163Parser();
		case AndClauseId2EditPart.VISUAL_ID:
			return getAndClauseId_5162Parser();
		case OrClauseIdEditPart.VISUAL_ID:
			return getOrClauseId_5161Parser();
		case LtClauseIdEditPart.VISUAL_ID:
			return getLtClauseId_5145Parser();
		case QueryParamNameEditPart.VISUAL_ID:
			return getQueryParamName_5191Parser();
		case GtClauseIdEditPart.VISUAL_ID:
			return getGtClauseId_5146Parser();
		case EqClauseIdEditPart.VISUAL_ID:
			return getEqClauseId_5147Parser();
		case LeClauseIdEditPart.VISUAL_ID:
			return getLeClauseId_5148Parser();
		case GeClauseIdEditPart.VISUAL_ID:
			return getGeClauseId_5149Parser();
		case ContainsClauseIdEditPart.VISUAL_ID:
			return getContainsClauseId_5150Parser();
		case NotClauseIdEditPart.VISUAL_ID:
			return getNotClauseId_5160Parser();
		case AndClauseId3EditPart.VISUAL_ID:
			return getAndClauseId_5151Parser();
		case OrClauseId2EditPart.VISUAL_ID:
			return getOrClauseId_5152Parser();
		case LtClauseId2EditPart.VISUAL_ID:
			return getLtClauseId_5153Parser();
		case GtClauseId2EditPart.VISUAL_ID:
			return getGtClauseId_5154Parser();
		case EqClauseId2EditPart.VISUAL_ID:
			return getEqClauseId_5155Parser();
		case LeClauseId2EditPart.VISUAL_ID:
			return getLeClauseId_5156Parser();
		case GeClauseId2EditPart.VISUAL_ID:
			return getGeClauseId_5157Parser();
		case ContainsClauseId2EditPart.VISUAL_ID:
			return getContainsClauseId_5158Parser();
		case NotClauseId2EditPart.VISUAL_ID:
			return getNotClauseId_5159Parser();
		case OrClauseId3EditPart.VISUAL_ID:
			return getOrClauseId_5164Parser();
		case LtClauseId3EditPart.VISUAL_ID:
			return getLtClauseId_5165Parser();
		case GtClauseId3EditPart.VISUAL_ID:
			return getGtClauseId_5166Parser();
		case EqClauseId3EditPart.VISUAL_ID:
			return getEqClauseId_5167Parser();
		case LeClauseId3EditPart.VISUAL_ID:
			return getLeClauseId_5168Parser();
		case GeClauseId3EditPart.VISUAL_ID:
			return getGeClauseId_5169Parser();
		case ContainsClauseId3EditPart.VISUAL_ID:
			return getContainsClauseId_5170Parser();
		case NotClauseId3EditPart.VISUAL_ID:
			return getNotClauseId_5171Parser();
		case JoinAttributesListIdEditPart.VISUAL_ID:
			return getJoinAttributesListId_5174Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5178Parser();
		case PrimaryKeyNameEditPart.VISUAL_ID:
			return getPrimaryKeyName_5183Parser();

		case DataFlowFormatEditPart.VISUAL_ID:
			return getDataFlowFormat_6007Parser();
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
			return getParser(PipelineprojectVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PipelineprojectVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PipelineprojectElementTypes.getElement(hint) == null) {
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
