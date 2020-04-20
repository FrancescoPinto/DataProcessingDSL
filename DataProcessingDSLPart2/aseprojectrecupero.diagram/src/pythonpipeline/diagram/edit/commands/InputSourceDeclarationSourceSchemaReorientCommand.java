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

import pythonpipeline.InputSourceDeclaration;
import pythonpipeline.Schema;
import pythonpipeline.diagram.edit.policies.PythonpipelineBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InputSourceDeclarationSourceSchemaReorientCommand extends EditElementCommand {

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
	public InputSourceDeclarationSourceSchemaReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof InputSourceDeclaration) {
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
		if (!(oldEnd instanceof Schema && newEnd instanceof InputSourceDeclaration)) {
			return false;
		}
		return PythonpipelineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInputSourceDeclarationSourceSchema_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Schema && newEnd instanceof Schema)) {
			return false;
		}
		return PythonpipelineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInputSourceDeclarationSourceSchema_4005(getOldSource(), getNewTarget());
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
		getOldSource().setSourceSchema(null);
		getNewSource().setSourceSchema(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setSourceSchema(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected InputSourceDeclaration getOldSource() {
		return (InputSourceDeclaration) referenceOwner;
	}

	/**
	* @generated
	*/
	protected InputSourceDeclaration getNewSource() {
		return (InputSourceDeclaration) newEnd;
	}

	/**
	* @generated
	*/
	protected Schema getOldTarget() {
		return (Schema) oldEnd;
	}

	/**
	* @generated
	*/
	protected Schema getNewTarget() {
		return (Schema) newEnd;
	}
}
