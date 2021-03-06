/*
 * 
 */
package pipelineproject.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import pipelineproject.diagram.edit.policies.InputSourceDeclarationSourceSchemaItemSemanticEditPolicy;

/**
 * @generated
 */
public class InputSourceDeclarationSourceSchemaEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4011;

	/**
	* @generated
	*/
	public InputSourceDeclarationSourceSchemaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InputSourceDeclarationSourceSchemaItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new InputSourceDeclarationSourceSchemaFigure();
	}

	/**
	* @generated
	*/
	public InputSourceDeclarationSourceSchemaFigure getPrimaryShape() {
		return (InputSourceDeclarationSourceSchemaFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InputSourceDeclarationSourceSchemaFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InputSourceDeclarationSourceSchemaFigure() {
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
