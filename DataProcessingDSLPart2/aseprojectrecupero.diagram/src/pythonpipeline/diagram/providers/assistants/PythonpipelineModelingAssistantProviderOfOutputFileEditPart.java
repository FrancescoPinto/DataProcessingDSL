/*
 * 
 */
package pythonpipeline.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pythonpipeline.diagram.edit.parts.OutputFileEditPart;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;
import pythonpipeline.diagram.providers.PythonpipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PythonpipelineModelingAssistantProviderOfOutputFileEditPart
		extends PythonpipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((OutputFileEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(OutputFileEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PythonpipelineElementTypes.ExportWrites_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((OutputFileEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(OutputFileEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PythonpipelineElementTypes.ExportWrites_4004) {
			types.add(PythonpipelineElementTypes.Export_2023);
		}
		return types;
	}

}
