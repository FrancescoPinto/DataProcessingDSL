/**
 */
package pipelineproject.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pipelineproject.Pipeline;
import pipelineproject.PipelineprojectFactory;
import pipelineproject.PipelineprojectPackage;

/**
 * This is the item provider adapter for a {@link pipelineproject.Pipeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPipelineNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pipeline Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPipelineNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pipeline_pipelineName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pipeline_pipelineName_feature", "_UI_Pipeline_type"),
				 PipelineprojectPackage.Literals.PIPELINE__PIPELINE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PipelineprojectPackage.Literals.PIPELINE__TASKS);
			childrenFeatures.add(PipelineprojectPackage.Literals.PIPELINE__DATA_FLOWS);
			childrenFeatures.add(PipelineprojectPackage.Literals.PIPELINE__SCHEMA);
			childrenFeatures.add(PipelineprojectPackage.Literals.PIPELINE__OUTPUT_FILE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Pipeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pipeline"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pipeline)object).getPipelineName();
		return label == null || label.length() == 0 ?
			getString("_UI_Pipeline_type") :
			getString("_UI_Pipeline_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Pipeline.class)) {
			case PipelineprojectPackage.PIPELINE__PIPELINE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PipelineprojectPackage.PIPELINE__TASKS:
			case PipelineprojectPackage.PIPELINE__DATA_FLOWS:
			case PipelineprojectPackage.PIPELINE__SCHEMA:
			case PipelineprojectPackage.PIPELINE__OUTPUT_FILE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createDataCollection()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createDataIntegration()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createExport()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createNullValuesRemoval()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createCustomCleaning()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createChangeDataFormat()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createKNN()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createSVM()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createKMeans()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createAgglomerative()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createDBSCAN()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createJarvisPatrick()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createLinearRegression()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createRidge()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createLasso()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createMedian()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createVariance()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createLogisticRegression()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createSkewness()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createScatterPlot()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createLabeledScatterPlot()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createPiePlot()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__TASKS,
				 PipelineprojectFactory.eINSTANCE.createProjectOnAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__DATA_FLOWS,
				 PipelineprojectFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__SCHEMA,
				 PipelineprojectFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(PipelineprojectPackage.Literals.PIPELINE__OUTPUT_FILE,
				 PipelineprojectFactory.eINSTANCE.createOutputFile()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PipelineprojectEditPlugin.INSTANCE;
	}

}
