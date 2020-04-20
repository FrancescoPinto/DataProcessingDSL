/*
 * 
 */
package pythonpipeline.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import pythonpipeline.diagram.edit.policies.ExportWritesItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExportWritesEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4004;

	/**
	* @generated
	*/
	public ExportWritesEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ExportWritesItemSemanticEditPolicy());
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
		return new ExportWritesFigure();
	}

	/**
	* @generated
	*/
	public ExportWritesFigure getPrimaryShape() {
		return (ExportWritesFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ExportWritesFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ExportWritesFigure() {
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
