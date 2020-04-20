/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see pythonpipeline.PythonpipelinePackage#getChangeDataFormat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NumberOfOutputEqualsNumberOfInput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NumberOfOutputEqualsNumberOfInput='Tuple {\n\tmessage : String = \'ChangeDataFormat should produce one output for each input\',\n\tstatus : Boolean = \n\t\t\tself.output->size() = self.input->size() and self.inputSchema->forAll(s|self.outputSchema->includes(s))\n}.status'"
 * @generated
 */
public interface ChangeDataFormat extends DataCleaning {
} // ChangeDataFormat
