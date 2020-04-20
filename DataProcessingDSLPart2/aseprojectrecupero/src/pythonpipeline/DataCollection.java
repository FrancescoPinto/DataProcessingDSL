/**
 */
package pythonpipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pythonpipeline.DataCollection#getSourceDeclaration <em>Source Declaration</em>}</li>
 * </ul>
 *
 * @see pythonpipeline.PythonpipelinePackage#getDataCollection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentDataCollectionFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConsistentDataCollectionFormat='Tuple {\n\tmessage : String = \'output of dataCollection should have consistent format with inputDataSource\',\n\tstatus : Boolean = \n\t\tself.sourceDeclaration->forAll(is|self.output->exists(o|o.format = is.exchangeFormat and o.typeOfData = is.sourceSchema))\n}.status'"
 * @generated
 */
public interface DataCollection extends Task {
	/**
	 * Returns the value of the '<em><b>Source Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link pythonpipeline.InputSourceDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Declaration</em>' containment reference list.
	 * @see pythonpipeline.PythonpipelinePackage#getDataCollection_SourceDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputSourceDeclaration> getSourceDeclaration();

} // DataCollection
