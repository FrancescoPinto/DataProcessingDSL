/**
 */
package pythonpipeline.provider;


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

import pythonpipeline.InputSourceDeclaration;
import pythonpipeline.PythonpipelineFactory;
import pythonpipeline.PythonpipelinePackage;

/**
 * This is the item provider adapter for a {@link pythonpipeline.InputSourceDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InputSourceDeclarationItemProvider 
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
	public InputSourceDeclarationItemProvider(AdapterFactory adapterFactory) {
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

			addSourceURIPropertyDescriptor(object);
			addQueryEndpointPropertyDescriptor(object);
			addExchangeFormatPropertyDescriptor(object);
			addSourceSchemaPropertyDescriptor(object);
			addSourceTypePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InputSourceDeclaration_sourceURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InputSourceDeclaration_sourceURI_feature", "_UI_InputSourceDeclaration_type"),
				 PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__SOURCE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Query Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryEndpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InputSourceDeclaration_queryEndpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InputSourceDeclaration_queryEndpoint_feature", "_UI_InputSourceDeclaration_type"),
				 PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exchange Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExchangeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InputSourceDeclaration_exchangeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InputSourceDeclaration_exchangeFormat_feature", "_UI_InputSourceDeclaration_type"),
				 PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InputSourceDeclaration_sourceSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InputSourceDeclaration_sourceSchema_feature", "_UI_InputSourceDeclaration_type"),
				 PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InputSourceDeclaration_sourceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InputSourceDeclaration_sourceType_feature", "_UI_InputSourceDeclaration_type"),
				 PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__SOURCE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InputSourceDeclaration_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InputSourceDeclaration_id_feature", "_UI_InputSourceDeclaration_type"),
				 PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__ID,
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
			childrenFeatures.add(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS);
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
	 * This returns InputSourceDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InputSourceDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InputSourceDeclaration)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_InputSourceDeclaration_type") :
			getString("_UI_InputSourceDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(InputSourceDeclaration.class)) {
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION__SOURCE_URI:
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT:
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT:
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION__SOURCE_TYPE:
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PythonpipelinePackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS:
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
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createNotClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createAndClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createOrClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createLtClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createGtClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createEqClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createLeClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createGeClause()));

		newChildDescriptors.add
			(createChildParameter
				(PythonpipelinePackage.Literals.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS,
				 PythonpipelineFactory.eINSTANCE.createContainsClause()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PythonpipelineEditPlugin.INSTANCE;
	}

}
