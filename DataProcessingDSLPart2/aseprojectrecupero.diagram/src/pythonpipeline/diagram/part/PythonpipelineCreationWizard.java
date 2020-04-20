/*
 * 
 */
package pythonpipeline.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class PythonpipelineCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected PythonpipelineCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected PythonpipelineCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.PythonpipelineCreationWizardTitle);
		setDefaultPageImageDescriptor(PythonpipelineDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPythonpipelineWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new PythonpipelineCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"pythonpipeline_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(Messages.PythonpipelineCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(Messages.PythonpipelineCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new PythonpipelineCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"pythonpipeline") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".pythonpipeline_diagram".length()); //$NON-NLS-1$
					setFileName(PythonpipelineDiagramEditorUtil.getUniqueFileName(getContainerFullPath(), fileName,
							"pythonpipeline")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(Messages.PythonpipelineCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(Messages.PythonpipelineCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = PythonpipelineDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						PythonpipelineDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.PythonpipelineCreationWizardOpenEditorError, null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(), Messages.PythonpipelineCreationWizardCreationError,
						null, ((CoreException) e.getTargetException()).getStatus());
			} else {
				PythonpipelineDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
