/**
 */
package pipelineproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.OutputFile#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link pipelineproject.OutputFile#getStoragePath <em>Storage Path</em>}</li>
 *   <li>{@link pipelineproject.OutputFile#getName <em>Name</em>}</li>
 *   <li>{@link pipelineproject.OutputFile#getExport <em>Export</em>}</li>
 * </ul>
 *
 * @see pipelineproject.PipelineprojectPackage#getOutputFile()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutputFileNotEmptyName OutputFile_NotEmptyPath OutputFile_ConsistentFileFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OutputFileNotEmptyName='Tuple {\n\tmessage : String = \'File Name should not be empty\',\n\tstatus : Boolean = self.name.size()> 0 or self.name <> null\n}.status' OutputFile_NotEmptyPath='Tuple {\n\tmessage : String = \'File Path should not be empty\',\n\tstatus : Boolean = self.storagePath.size()> 0 or self.storagePath <> null\n}.status' OutputFile_ConsistentFileFormat='Tuple {\n\tmessage : String = \'File format should be the same as the one of the input dataflow. To perform format conversion, use a ChangeDataFormat Task\',\n\tstatus : Boolean = \n\t \tself.fileFormat = self.export.input->first().format\n}.status'"
 * @generated
 */
public interface OutputFile extends EObject {
	/**
	 * Returns the value of the '<em><b>File Format</b></em>' attribute.
	 * The literals are from the enumeration {@link pipelineproject.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #setFileFormat(Format)
	 * @see pipelineproject.PipelineprojectPackage#getOutputFile_FileFormat()
	 * @model required="true"
	 * @generated
	 */
	Format getFileFormat();

	/**
	 * Sets the value of the '{@link pipelineproject.OutputFile#getFileFormat <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Format</em>' attribute.
	 * @see pipelineproject.Format
	 * @see #getFileFormat()
	 * @generated
	 */
	void setFileFormat(Format value);

	/**
	 * Returns the value of the '<em><b>Storage Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Path</em>' attribute.
	 * @see #setStoragePath(String)
	 * @see pipelineproject.PipelineprojectPackage#getOutputFile_StoragePath()
	 * @model required="true"
	 * @generated
	 */
	String getStoragePath();

	/**
	 * Sets the value of the '{@link pipelineproject.OutputFile#getStoragePath <em>Storage Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Path</em>' attribute.
	 * @see #getStoragePath()
	 * @generated
	 */
	void setStoragePath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pipelineproject.PipelineprojectPackage#getOutputFile_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pipelineproject.OutputFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Export</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipelineproject.Export#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' reference.
	 * @see #setExport(Export)
	 * @see pipelineproject.PipelineprojectPackage#getOutputFile_Export()
	 * @see pipelineproject.Export#getWrites
	 * @model opposite="writes" required="true"
	 * @generated
	 */
	Export getExport();

	/**
	 * Sets the value of the '{@link pipelineproject.OutputFile#getExport <em>Export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' reference.
	 * @see #getExport()
	 * @generated
	 */
	void setExport(Export value);

} // OutputFile
