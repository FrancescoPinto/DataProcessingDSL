/**
 */
package pipelineproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see pipelineproject.PipelineprojectPackage#getDescription()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentNumberOfInputOutputColumns ConsistentOperationsOverTypeOfData'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentNumberOfInputOutputColumns='Tuple {\n\tmessage : String = \'Mean/median/variance/skeweness compute mean/median/variance/skeweness by column, inputSchema and outputSchema should have the same number of attirbutes\',\n\tstatus : Boolean = \n\t \tself.oclIsTypeOf(Mean) or self.oclIsTypeOf(Median) or self.oclIsTypeOf(Variance) or self.oclIsTypeOf(Skewness)\n\t\timplies self.inputSchema->size() = 1 and self.inputSchema->first().attributes->size() = self.outputSchema.attributes->size()\n}.status' ConsistentOperationsOverTypeOfData='Tuple {\n\tmessage : String = \'Mean/variance/skeweness only make sense over numerical data\',\n\tstatus : Boolean = \n\t\tself.oclIsTypeOf(Mean) or self.oclIsTypeOf(Variance) or self.oclIsTypeOf(Skewness) implies\n\t\tself.outputSchema.attributes->forAll(a|a.type = Type::Float or a.type = Type::Int)\n}.status'"
 * @generated
 */
public interface Description extends DataAnalysis {
} // Description
