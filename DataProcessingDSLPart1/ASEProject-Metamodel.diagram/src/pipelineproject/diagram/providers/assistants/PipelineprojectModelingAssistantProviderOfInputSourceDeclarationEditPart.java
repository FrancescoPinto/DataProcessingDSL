/*
 * 
 */
package pipelineproject.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipelineproject.diagram.edit.parts.InputSourceDeclarationEditPart;
import pipelineproject.diagram.edit.parts.SchemaEditPart;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;
import pipelineproject.diagram.providers.PipelineprojectModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineprojectModelingAssistantProviderOfInputSourceDeclarationEditPart
		extends PipelineprojectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((InputSourceDeclarationEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(InputSourceDeclarationEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((InputSourceDeclarationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(InputSourceDeclarationEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SchemaEditPart) {
			types.add(PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((InputSourceDeclarationEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(InputSourceDeclarationEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineprojectElementTypes.InputSourceDeclarationSourceSchema_4011) {
			types.add(PipelineprojectElementTypes.Schema_2057);
		}
		return types;
	}

}
