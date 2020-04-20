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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pythonpipeline.Export;
import pythonpipeline.OutputFile;
import pythonpipeline.diagram.edit.policies.PythonpipelineBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExportWritesReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

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
	public ExportWritesReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof Export) {
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
		if (!(oldEnd instanceof OutputFile && newEnd instanceof Export)) {
			return false;
		}
		return PythonpipelineBaseItemSemanticEditPolicy.getLinkConstraints().canExistExportWrites_4004(getNewSource(),
				getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OutputFile && newEnd instanceof OutputFile)) {
			return false;
		}
		return PythonpipelineBaseItemSemanticEditPolicy.getLinkConstraints().canExistExportWrites_4004(getOldSource(),
				getNewTarget());
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
		getOldSource().getWrites().remove(getOldTarget());
		getNewSource().getWrites().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getWrites().remove(getOldTarget());
		getOldSource().getWrites().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected Export getOldSource() {
		return (Export) referenceOwner;
	}

	/**
	* @generated
	*/
	protected Export getNewSource() {
		return (Export) newEnd;
	}

	/**
	* @generated
	*/
	protected OutputFile getOldTarget() {
		return (OutputFile) oldEnd;
	}

	/**
	* @generated
	*/
	protected OutputFile getNewTarget() {
		return (OutputFile) newEnd;
	}
}
