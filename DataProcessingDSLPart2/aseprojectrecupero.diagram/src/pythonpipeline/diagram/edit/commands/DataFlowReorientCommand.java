/*
 * 
 */
package pythonpipeline.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pythonpipeline.DataFlow;
import pythonpipeline.Pipeline;
import pythonpipeline.Task;
import pythonpipeline.diagram.edit.policies.PythonpipelineBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DataFlowReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public DataFlowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DataFlow) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Task && newEnd instanceof Task)) {
			return false;
		}
		Task target = getLink().getTo();
		if (!(getLink().eContainer() instanceof Pipeline)) {
			return false;
		}
		Pipeline container = (Pipeline) getLink().eContainer();
		return PythonpipelineBaseItemSemanticEditPolicy.getLinkConstraints().canExistDataFlow_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Task && newEnd instanceof Task)) {
			return false;
		}
		Task source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof Pipeline)) {
			return false;
		}
		Pipeline container = (Pipeline) getLink().eContainer();
		return PythonpipelineBaseItemSemanticEditPolicy.getLinkConstraints().canExistDataFlow_4001(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected DataFlow getLink() {
		return (DataFlow) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Task getOldSource() {
		return (Task) oldEnd;
	}

	/**
	* @generated
	*/
	protected Task getNewSource() {
		return (Task) newEnd;
	}

	/**
	* @generated
	*/
	protected Task getOldTarget() {
		return (Task) oldEnd;
	}

	/**
	* @generated
	*/
	protected Task getNewTarget() {
		return (Task) newEnd;
	}
}
