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
import org.eclipse.swt.graphics.Color;

import pipelineproject.diagram.edit.policies.TaskInputSchemaItemSemanticEditPolicy;

/**
 * @generated
 */
public class TaskInputSchemaEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4015;

	/**
	* @generated
	*/
	public TaskInputSchemaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TaskInputSchemaItemSemanticEditPolicy());
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
		return new TaskInputSchemaFigure();
	}

	/**
	* @generated
	*/
	public TaskInputSchemaFigure getPrimaryShape() {
		return (TaskInputSchemaFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TaskInputSchemaFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public TaskInputSchemaFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 255, 0);

}
