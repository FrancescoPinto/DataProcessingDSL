/*
 * 
 */
package pythonpipeline.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import pythonpipeline.DataFlow;
import pythonpipeline.Export;
import pythonpipeline.InputSourceDeclaration;
import pythonpipeline.OutputFile;
import pythonpipeline.Pipeline;
import pythonpipeline.PrimaryKey;
import pythonpipeline.Schema;
import pythonpipeline.Task;
import pythonpipeline.diagram.part.PythonpipelineDiagramEditorPlugin;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class PythonpipelineBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected PythonpipelineBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(PythonpipelineVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = PythonpipelineElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = PythonpipelineDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			PythonpipelineDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateDataFlow_4001(Pipeline container, Task source, Task target) {
			return canExistDataFlow_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTaskInputSchema_4002(Task source, Schema target) {
			if (source != null) {
				if (source.getInputSchema().contains(target)) {
					return false;
				}
			}

			return canExistTaskInputSchema_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTaskOutputSchema_4003(Task source, Schema target) {
			if (source != null) {
				if (source.getOutputSchema().contains(target)) {
					return false;
				}
			}

			return canExistTaskOutputSchema_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExportWrites_4004(Export source, OutputFile target) {
			if (source != null) {
				if (source.getWrites().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getExport() != null)) {
				return false;
			}

			return canExistExportWrites_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInputSourceDeclarationSourceSchema_4005(InputSourceDeclaration source, Schema target) {
			if (source != null) {
				if (source.getSourceSchema() != null) {
					return false;
				}
			}

			return canExistInputSourceDeclarationSourceSchema_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePrimaryKeyCopies_4006(PrimaryKey source, PrimaryKey target) {
			if (source != null) {
				if (source.getCopies() != null) {
					return false;
				}
			}

			return canExistPrimaryKeyCopies_4006(source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistDataFlow_4001(Pipeline container, DataFlow linkInstance, Task source, Task target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistTaskInputSchema_4002(Task source, Schema target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistTaskOutputSchema_4003(Task source, Schema target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistExportWrites_4004(Export source, OutputFile target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInputSourceDeclarationSourceSchema_4005(InputSourceDeclaration source, Schema target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistPrimaryKeyCopies_4006(PrimaryKey source, PrimaryKey target) {
			return true;
		}
	}

}
