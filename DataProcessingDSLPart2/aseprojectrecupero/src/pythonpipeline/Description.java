/**
 */
package pythonpipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see pythonpipeline.PythonpipelinePackage#getDescription()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentDataTypesForDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentDataTypesForDescription='Tuple {\n\tmessage : String = \'Mean/median/variance/skeweness compute mean/median/variance/skeweness by column, inputSchema and outputSchema should have only float attributes\',\n\tstatus : Boolean = \n\t\tself.inputSchema->size() = 1 and self.inputSchema->first().attributes->forAll(a|a.type = Type::Int or a.type = Type::Float) \n\t\t\tand\n\t\tself.outputSchema.attributes->forAll(a|a.type = Type::Int or a.type = Type::Float)\n}.status'"
 * @generated
 */
public interface Description extends DataAnalysis {
} // Description
