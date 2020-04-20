/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Export#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getExport()
 * @model
 * @generated
 */
public interface Export extends Task {
	/**
	 * Returns the value of the '<em><b>Writes</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.OutputFile}.
	 * It is bidirectional and its opposite is '{@link pythonpipeline.OutputFile#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writes</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getExport_Writes()
	 * @see pythonpipeline.OutputFile#getExport
	 * @model opposite="export" required="true"
	 *        annotation="gmf.link label='writes' target='writes' style='dot'"
	 * @generated
	 */
	EList<OutputFile> getWrites();

} // Export
