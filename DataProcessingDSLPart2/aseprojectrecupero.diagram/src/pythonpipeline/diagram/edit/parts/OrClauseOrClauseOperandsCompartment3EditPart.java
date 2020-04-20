/*
 * 
 */
package pythonpipeline.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import pythonpipeline.diagram.edit.policies.OrClauseOrClauseOperandsCompartment3CanonicalEditPolicy;
import pythonpipeline.diagram.edit.policies.OrClauseOrClauseOperandsCompartment3ItemSemanticEditPolicy;
import pythonpipeline.diagram.part.Messages;
import pythonpipeline.diagram.part.PythonpipelineVisualIDRegistry;
import pythonpipeline.diagram.providers.PythonpipelineElementTypes;

/**
 * @generated
 */
public class OrClauseOrClauseOperandsCompartment3EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7044;

	/**
	* @generated
	*/
	public OrClauseOrClauseOperandsCompartment3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.OrClauseOrClauseOperandsCompartment3EditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OrClauseOrClauseOperandsCompartment3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(PythonpipelineVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OrClauseOrClauseOperandsCompartment3CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == PythonpipelineElementTypes.AndClause_3005) {
				return this;
			}
			if (type == PythonpipelineElementTypes.OrClause_3006) {
				return this;
			}
			if (type == PythonpipelineElementTypes.LtClause_3007) {
				return this;
			}
			if (type == PythonpipelineElementTypes.GtClause_3009) {
				return this;
			}
			if (type == PythonpipelineElementTypes.EqClause_3010) {
				return this;
			}
			if (type == PythonpipelineElementTypes.LeClause_3011) {
				return this;
			}
			if (type == PythonpipelineElementTypes.GeClause_3012) {
				return this;
			}
			if (type == PythonpipelineElementTypes.ContainsClause_3013) {
				return this;
			}
			if (type == PythonpipelineElementTypes.NotClause_3014) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
