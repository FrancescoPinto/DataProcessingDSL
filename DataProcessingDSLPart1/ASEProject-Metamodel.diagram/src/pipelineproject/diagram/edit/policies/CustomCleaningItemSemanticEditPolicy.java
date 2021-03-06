/*
* 
*/
package pipelineproject.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import pipelineproject.diagram.edit.commands.DataFlowCreateCommand;
import pipelineproject.diagram.edit.commands.DataFlowReorientCommand;
import pipelineproject.diagram.edit.commands.TaskInputSchemaCreateCommand;
import pipelineproject.diagram.edit.commands.TaskInputSchemaReorientCommand;
import pipelineproject.diagram.edit.commands.TaskOutputSchemaCreateCommand;
import pipelineproject.diagram.edit.commands.TaskOutputSchemaReorientCommand;
import pipelineproject.diagram.edit.parts.CustomCleaningCustomCleaningCustomParamsCompartmentEditPart;
import pipelineproject.diagram.edit.parts.CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart;
import pipelineproject.diagram.edit.parts.CustomParamEditPart;
import pipelineproject.diagram.edit.parts.DataFlowEditPart;
import pipelineproject.diagram.edit.parts.RuntimeInfoEditPart;
import pipelineproject.diagram.edit.parts.TaskInputSchemaEditPart;
import pipelineproject.diagram.edit.parts.TaskOutputSchemaEditPart;
import pipelineproject.diagram.part.PipelineprojectVisualIDRegistry;
import pipelineproject.diagram.providers.PipelineprojectElementTypes;

/**
 * @generated
 */
public class CustomCleaningItemSemanticEditPolicy extends PipelineprojectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CustomCleaningItemSemanticEditPolicy() {
		super(PipelineprojectElementTypes.CustomCleaning_2051);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (PipelineprojectVisualIDRegistry.getVisualID(incomingLink) == DataFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (PipelineprojectVisualIDRegistry.getVisualID(outgoingLink) == DataFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (PipelineprojectVisualIDRegistry.getVisualID(outgoingLink) == TaskInputSchemaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (PipelineprojectVisualIDRegistry.getVisualID(outgoingLink) == TaskOutputSchemaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (PipelineprojectVisualIDRegistry.getVisualID(node)) {
			case CustomCleaningCustomCleaningRuntimeInfoCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (PipelineprojectVisualIDRegistry.getVisualID(cnode)) {
					case RuntimeInfoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case CustomCleaningCustomCleaningCustomParamsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (PipelineprojectVisualIDRegistry.getVisualID(cnode)) {
					case CustomParamEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PipelineprojectElementTypes.DataFlow_4007 == req.getElementType()) {
			return getGEFWrapper(new DataFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PipelineprojectElementTypes.TaskInputSchema_4015 == req.getElementType()) {
			return getGEFWrapper(new TaskInputSchemaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PipelineprojectElementTypes.TaskOutputSchema_4016 == req.getElementType()) {
			return getGEFWrapper(new TaskOutputSchemaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PipelineprojectElementTypes.DataFlow_4007 == req.getElementType()) {
			return getGEFWrapper(new DataFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PipelineprojectElementTypes.TaskInputSchema_4015 == req.getElementType()) {
			return null;
		}
		if (PipelineprojectElementTypes.TaskOutputSchema_4016 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DataFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new DataFlowReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case TaskInputSchemaEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskInputSchemaReorientCommand(req));
		case TaskOutputSchemaEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskOutputSchemaReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
