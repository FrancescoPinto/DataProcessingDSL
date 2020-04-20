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
import pipelineproject.diagram.edit.parts.PrimaryKeyEditPart;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;
import pipelineproject.diagram.providers.PipelineprojectModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineprojectModelingAssistantProviderOfPrimaryKeyEditPart
		extends PipelineprojectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PrimaryKeyEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PrimaryKeyEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineprojectElementTypes.PrimaryKeyCopies_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PrimaryKeyEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PrimaryKeyEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PrimaryKeyEditPart) {
			types.add(PipelineprojectElementTypes.PrimaryKeyCopies_4017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PrimaryKeyEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PrimaryKeyEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineprojectElementTypes.PrimaryKeyCopies_4017) {
			types.add(PipelineprojectElementTypes.PrimaryKey_3069);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PrimaryKeyEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PrimaryKeyEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineprojectElementTypes.PrimaryKeyCopies_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PrimaryKeyEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PrimaryKeyEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineprojectElementTypes.PrimaryKeyCopies_4017) {
			types.add(PipelineprojectElementTypes.PrimaryKey_3069);
		}
		return types;
	}

}
