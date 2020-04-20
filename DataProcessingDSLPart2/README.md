#Part 2
This part of the project contains an updated `default.ecore` file containing the metamodel (conforming to the corrections), the `default.ecore_diagram` containing the relative diagram, the `default.emf` file that contains the Concrete Graphical Syntax defined using Eugenia annotations. OCLInEcore constraints are contained in the `.ecore` file.

To execute the generated editors, right click on `ASEProject-Metamodel.editor` and `Run As Eclipse Application`. The `ASEProject-Metamodel.validation` contains the `constraints.evl` file under the constraints folder.

This part of the project contains a code generator producing Python scripts that can be actually executed. To launch the code generator, run the editor as explained before, then import `it.ase.project.acceleo` in the editor. Look in the `src` folder of the project, Right Click on `generate.mtl` and Run as Launch Acceleo Application. If needed, configuration of the run should be performed (in Acceleo perspective, in the dropdown list, click Run Configurations ...)
