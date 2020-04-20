/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipelineproject.Export;
import pipelineproject.Format;
import pipelineproject.OutputFile;
import pipelineproject.PipelineprojectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.OutputFileImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link pipelineproject.impl.OutputFileImpl#getStoragePath <em>Storage Path</em>}</li>
 *   <li>{@link pipelineproject.impl.OutputFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link pipelineproject.impl.OutputFileImpl#getExport <em>Export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputFileImpl extends EObjectImpl implements OutputFile {
	/**
	 * The default value of the '{@link #getFileFormat() <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format FILE_FORMAT_EDEFAULT = Format.JSON;

	/**
	 * The cached value of the '{@link #getFileFormat() <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFormat()
	 * @generated
	 * @ordered
	 */
	protected Format fileFormat = FILE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoragePath() <em>Storage Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePath()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoragePath() <em>Storage Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePath()
	 * @generated
	 * @ordered
	 */
	protected String storagePath = STORAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExport() <em>Export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport()
	 * @generated
	 * @ordered
	 */
	protected Export export;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.OUTPUT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format getFileFormat() {
		return fileFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileFormat(Format newFileFormat) {
		Format oldFileFormat = fileFormat;
		fileFormat = newFileFormat == null ? FILE_FORMAT_EDEFAULT : newFileFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.OUTPUT_FILE__FILE_FORMAT, oldFileFormat, fileFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoragePath() {
		return storagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoragePath(String newStoragePath) {
		String oldStoragePath = storagePath;
		storagePath = newStoragePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.OUTPUT_FILE__STORAGE_PATH, oldStoragePath, storagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.OUTPUT_FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Export getExport() {
		if (export != null && export.eIsProxy()) {
			InternalEObject oldExport = (InternalEObject)export;
			export = (Export)eResolveProxy(oldExport);
			if (export != oldExport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.OUTPUT_FILE__EXPORT, oldExport, export));
			}
		}
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Export basicGetExport() {
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport(Export newExport, NotificationChain msgs) {
		Export oldExport = export;
		export = newExport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.OUTPUT_FILE__EXPORT, oldExport, newExport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport(Export newExport) {
		if (newExport != export) {
			NotificationChain msgs = null;
			if (export != null)
				msgs = ((InternalEObject)export).eInverseRemove(this, PipelineprojectPackage.EXPORT__WRITES, Export.class, msgs);
			if (newExport != null)
				msgs = ((InternalEObject)newExport).eInverseAdd(this, PipelineprojectPackage.EXPORT__WRITES, Export.class, msgs);
			msgs = basicSetExport(newExport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.OUTPUT_FILE__EXPORT, newExport, newExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.OUTPUT_FILE__EXPORT:
				if (export != null)
					msgs = ((InternalEObject)export).eInverseRemove(this, PipelineprojectPackage.EXPORT__WRITES, Export.class, msgs);
				return basicSetExport((Export)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.OUTPUT_FILE__EXPORT:
				return basicSetExport(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelineprojectPackage.OUTPUT_FILE__FILE_FORMAT:
				return getFileFormat();
			case PipelineprojectPackage.OUTPUT_FILE__STORAGE_PATH:
				return getStoragePath();
			case PipelineprojectPackage.OUTPUT_FILE__NAME:
				return getName();
			case PipelineprojectPackage.OUTPUT_FILE__EXPORT:
				if (resolve) return getExport();
				return basicGetExport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelineprojectPackage.OUTPUT_FILE__FILE_FORMAT:
				setFileFormat((Format)newValue);
				return;
			case PipelineprojectPackage.OUTPUT_FILE__STORAGE_PATH:
				setStoragePath((String)newValue);
				return;
			case PipelineprojectPackage.OUTPUT_FILE__NAME:
				setName((String)newValue);
				return;
			case PipelineprojectPackage.OUTPUT_FILE__EXPORT:
				setExport((Export)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PipelineprojectPackage.OUTPUT_FILE__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case PipelineprojectPackage.OUTPUT_FILE__STORAGE_PATH:
				setStoragePath(STORAGE_PATH_EDEFAULT);
				return;
			case PipelineprojectPackage.OUTPUT_FILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipelineprojectPackage.OUTPUT_FILE__EXPORT:
				setExport((Export)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PipelineprojectPackage.OUTPUT_FILE__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case PipelineprojectPackage.OUTPUT_FILE__STORAGE_PATH:
				return STORAGE_PATH_EDEFAULT == null ? storagePath != null : !STORAGE_PATH_EDEFAULT.equals(storagePath);
			case PipelineprojectPackage.OUTPUT_FILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PipelineprojectPackage.OUTPUT_FILE__EXPORT:
				return export != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileFormat: ");
		result.append(fileFormat);
		result.append(", storagePath: ");
		result.append(storagePath);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OutputFileImpl
