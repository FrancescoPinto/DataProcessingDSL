/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.Task#getInput <em>Input</em>}</li>
 *   <li>{@link pythonpipeline.Task#getOutput <em>Output</em>}</li>
 *   <li>{@link pythonpipeline.Task#getRuntimeInfo <em>Runtime Info</em>}</li>
 *   <li>{@link pythonpipeline.Task#getInputSchema <em>Input Schema</em>}</li>
 *   <li>{@link pythonpipeline.Task#getOutputSchema <em>Output Schema</em>}</li>
 *   <li>{@link pythonpipeline.Task#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getTask()
 * @model abstract="true"
 *        annotation="gmf.node label='id'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TasksWithOneAndOnlyOneInputAndInputSchema TasksWithNoInputAndNoInputSchema TasksWithOneOrMoreInputAndInputSchema1 TasksWithOneOrMoreInputAndInputSchema2 TasksWithInputShouldHaveConsistentSchemas TasksWithNoOutputAndNoOutputSchema TasksWithOneOutput DataCollectionMultipleOutput ExportNoOutput TasksWithOutputShouldHaveConsistentOutputSchemas ConsistentInputOutputFormat ConsistentFormatConversion1 StartTimeAfterPreviousTasksEndTime OrderedRuntimeIDsInTaskSequence DataVisualizationOutputMustContainAtLeastOneImage DataVisualizationNotFollowedByExportCannotProduceIMage NotDataVisualizationOrExportShouldNotProcessImages JoinShouldHaveDataWithSameFormatInInput TasksWithSameInputAndOutputSchema TasksWithIDCopyShouldHaveSchemaWithCopiedID TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TasksWithOneAndOnlyOneInputAndInputSchema='Tuple {\n\tmessage : String = \'The task should have one and only one input dataflow and one and only one input schema\',\n\tstatus : Boolean = \n\t\t\t(self.oclIsKindOf(DataAnalysis) or (self.oclIsKindOf(DataCleaning) and not self.oclIsTypeOf(ChangeDataFormat)) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export) or self.oclIsTypeOf(ProjectOnAttributes))\n \t\t\t\timplies (self.input <> null and self.input->size() = 1 and self.inputSchema <> null and self.inputSchema->size() = 1)\n}.status' TasksWithNoInputAndNoInputSchema='Tuple {\n\tmessage : String = \'The task should have no input dataflow and no input schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(DataCollection) implies (self.input->size() = 0 and self.inputSchema->size() = 0)\n}.status' TasksWithOneOrMoreInputAndInputSchema1='Tuple {\n\tmessage : String = \'The task should have two or more input dataflow and input schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(DataIntegration) implies (self.input->size() > 1 and self.inputSchema->size() > 1)\n}.status' TasksWithOneOrMoreInputAndInputSchema2='Tuple {\n\tmessage : String = \'The task should have two or more input dataflow and input schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(ChangeDataFormat) implies (self.input->size() >= 1 and self.inputSchema->size() >= 1)\n}.status' TasksWithInputShouldHaveConsistentSchemas='Tuple {\n\tmessage : String = \'The inputSchema should be consistent with the input dataflow schema\',\n\tstatus : Boolean = \n\t\t--self.input <>null and self.input->size() > 0 implied by other rule\n\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export) or self.oclIsTypeOf(DataIntegration))\n\t\t\t implies (self.input.typeOfData->forAll(s| self.inputSchema->includes(s)) and self.input.typeOfData->size() = self.inputSchema->size())\n}.status' TasksWithNoOutputAndNoOutputSchema='Tuple {\n\tmessage : String = \'The task should have no output dataflow and no output schema\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Export) implies (self.output->size() = 0 and self.outputSchema->size() = 0)\n}.status' TasksWithOneOutput='Tuple {\n\tmessage : String = \'The task should have output dataflow and output schema\',\n\tstatus : Boolean = \n\t\t\t not (self.oclIsTypeOf(Export) or self.oclIsTypeOf(DataCollection) or self.oclIsTypeOf(ChangeDataFormat)) implies (self.output->size() = 1)\n}.status' DataCollectionMultipleOutput='Tuple {\n\tmessage : String = \'DataCollection has one ouput for each source\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(DataCollection) implies (self.output->size() = self.oclAsType(DataCollection).sourceDeclaration->size() and self.output->size() >= 1)\n}.status' ExportNoOutput='Tuple {\n\tmessage : String = \'export should have no output dataflow\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(Export) implies (self.output->size() = 0)\n}.status' TasksWithOutputShouldHaveConsistentOutputSchemas='Tuple {\n\tmessage : String = \'The outputSchema should be consistent with the output dataflow schema\',\n\tstatus : Boolean = \n\t\t\t--self.output <> null and self.output->size() > 0 \n\t\t\t(self.oclIsKindOf(DataAnalysis) or self.oclIsTypeOf(DataCollection) or self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(DataIntegration))\n\t\t\timplies (self.output.typeOfData->forAll(s| self.outputSchema->includes(s)))\n}.status' ConsistentInputOutputFormat='Tuple {\n\tmessage : String = \'The input/output format of dataflows to/from the task should be the same\',\n\tstatus : Boolean = \n\t\t\t(not self.oclIsTypeOf(ChangeDataFormat)) implies \n\t\t\t\t(self.output->forAll(o| self.input->forAll(i| i.format = o.format)))\n}.status' ConsistentFormatConversion1='Tuple {\n\tmessage : String = \'The format conversion should make sense (i.e. input != output format )\',\n\tstatus : Boolean = \n\t\t\tself.oclIsTypeOf(ChangeDataFormat) implies \n\t\t\t\t(self.oclAsType(ChangeDataFormat)).input->exists(is|(self.oclAsType(ChangeDataFormat)).output->exists(os| os.typeOfData= is.typeOfData and os.format <> is.format ))\n}.status' StartTimeAfterPreviousTasksEndTime='Tuple {\n\tmessage : String = \'Start time of the task should come after the End time of previous tasks\',\n\tstatus : Boolean = \n\t\t\t self.input.from.runtimeInfo->select(r| self.runtimeInfo.startTime < r.endTime)->size() = 0\n}.status' OrderedRuntimeIDsInTaskSequence='Tuple {\n\tmessage : String = \'The IDs of Runtime elements define the execution order of the task in the sequence, hence should be properly ordered\',\n\tstatus : Boolean = \n\t\t\tif self.oclIsKindOf(DataCollection) then\n\t\t\t self.runtimeInfo.executionId = 1  \n\t\t\telse \n\t\t\t\tself.input->size()>0 implies self.input.from.runtimeInfo->forAll(r|self.runtimeInfo.executionId = r.executionId +1)\n\t\t\tendif\n}.status' DataVisualizationOutputMustContainAtLeastOneImage='Tuple {\n\tmessage : String = \'Datavisualization tasks should either output a image or copy the input schema\',\n\tstatus : Boolean = \n\t\t \tself.oclIsKindOf(DataVisualization) implies ((self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 1) xor (self.outputSchema->first() = self.inputSchema->first()))\n}.status' DataVisualizationNotFollowedByExportCannotProduceIMage='Tuple {\n\tmessage : String = \'DataVisualization tasks should not produce output image if they are not follwed by an export\',\n\tstatus : Boolean = \n\t\t\t(self.oclIsKindOf(DataVisualization) and self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() > 0) implies (self.output->first().to.oclIsKindOf(Export))\n}.status' NotDataVisualizationOrExportShouldNotProcessImages='Tuple {\n\tmessage : String = \'Tasks other than data visualization and export are not supposed to process images\',\n\tstatus : Boolean = \n \t\t\tnot (self.oclIsKindOf(DataVisualization) or self.oclIsTypeOf(Export)) implies \n \t\t\t(self.outputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 0) \n \t\t\t\tand (not (self.inputSchema->size() <> 0) implies self.inputSchema.attributes.type->select(t|t = Type::Bitmap)->size() = 0)\n}.status' JoinShouldHaveDataWithSameFormatInInput='Tuple {\n\tmessage : String = \'DataIntegration tasks should have inputs with same format (use ChangeDataFormat nodes if needed)\',\n\tstatus : Boolean = \n\t\tself.oclIsTypeOf(DataIntegration) implies self.input.format->asSet()->size() = 1\n}.status' TasksWithSameInputAndOutputSchema='Tuple {\n\tmessage : String = \'ChangeData/NullValuesRemoval/Descriptions tasks should have same input and output schema\',\n\tstatus : Boolean = \n\t\tself.oclIsTypeOf(ChangeDataFormat) or self.oclIsTypeOf(NullValuesRemoval) or self.oclIsKindOf(Description) implies self.inputSchema->forAll(is| self.outputSchema->includes(is))\n}.status' TasksWithIDCopyShouldHaveSchemaWithCopiedID='Tuple {\n\tmessage : String = \'Tasks that can mantain the row identity from input to output should mark the fact that the ID value is copied from the input schema\',\n\tstatus : Boolean = \n\t\tself.oclIsKindOf(DataCleaning) or self.oclIsKindOf(Prediction) or self.oclIsKindOf(Classification) or self.oclIsKindOf(Clustering) implies \n\t\t  ((self.outputSchema->first().idColumn.copies = self.inputSchema->first().idColumn) or (self.outputSchema->first() = self.inputSchema->first()))\n}.status' TasksThatDontAllowIDCopyShouldntHaveSchemaWithCopiedID='Tuple {\n\tmessage : String = \'Tasks that can not mantain the row identity from input to output shouldn\\\'t mark the fact that the ID value is copied from the input schema\',\n\tstatus : Boolean = \n\t\tnot(self.oclIsKindOf(DataCleaning) or self.oclIsKindOf(Prediction) or self.oclIsKindOf(Classification) or self.oclIsKindOf(Clustering) or self.oclIsKindOf(Export)) implies\n\t\t(self.outputSchema->forAll(s|s.idColumn.copies = null) or (self.outputSchema->first() = self.inputSchema->first()))\n}.status'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.DataFlow}.
	 * It is bidirectional and its opposite is '{@link pythonpipeline.DataFlow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getTask_Input()
	 * @see pythonpipeline.DataFlow#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<DataFlow> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.DataFlow}.
	 * It is bidirectional and its opposite is '{@link pythonpipeline.DataFlow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getTask_Output()
	 * @see pythonpipeline.DataFlow#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<DataFlow> getOutput();

	/**
	 * Returns the value of the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Info</em>' containment reference.
	 * @see #setRuntimeInfo(RuntimeInfo)
	 * @see pythonpipeline.PythonpipelinePackage#getTask_RuntimeInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuntimeInfo getRuntimeInfo();

	/**
	 * Sets the value of the '{@link pythonpipeline.Task#getRuntimeInfo <em>Runtime Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Info</em>' containment reference.
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	void setRuntimeInfo(RuntimeInfo value);

	/**
	 * Returns the value of the '<em><b>Input Schema</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Schema</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Schema</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getTask_InputSchema()
	 * @model annotation="gmf.link target='inputSchema' style='dash' color='0,255,0'"
	 * @generated
	 */
	EList<Schema> getInputSchema();

	/**
	 * Returns the value of the '<em><b>Output Schema</b></em>' reference list.
	 * The list contents are of type {@link pythonpipeline.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Schema</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Schema</em>' reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getTask_OutputSchema()
	 * @model annotation="gmf.link target='outputSchema' style='dash' color='255,0,0'"
	 * @generated
	 */
	EList<Schema> getOutputSchema();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pythonpipeline.PythonpipelinePackage#getTask_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pythonpipeline.Task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Task
