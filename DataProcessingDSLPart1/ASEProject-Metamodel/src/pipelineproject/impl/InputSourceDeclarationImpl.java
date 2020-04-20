/**
 */
package pipelineproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipelineproject.Format;
import pipelineproject.InputSourceDeclaration;
import pipelineproject.LogicProposition;
import pipelineproject.PipelineprojectPackage;
import pipelineproject.Schema;
import pipelineproject.SourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Source Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipelineproject.impl.InputSourceDeclarationImpl#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link pipelineproject.impl.InputSourceDeclarationImpl#getQueryEndpoint <em>Query Endpoint</em>}</li>
 *   <li>{@link pipelineproject.impl.InputSourceDeclarationImpl#getExchangeFormat <em>Exchange Format</em>}</li>
 *   <li>{@link pipelineproject.impl.InputSourceDeclarationImpl#getSourceSchema <em>Source Schema</em>}</li>
 *   <li>{@link pipelineproject.impl.InputSourceDeclarationImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link pipelineproject.impl.InputSourceDeclarationImpl#getQueryConditions <em>Query Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputSourceDeclarationImpl extends EObjectImpl implements InputSourceDeclaration {
	/**
	 * The default value of the '{@link #getSourceURI() <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceURI() <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceURI()
	 * @generated
	 * @ordered
	 */
	protected String sourceURI = SOURCE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryEndpoint() <em>Query Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryEndpoint() <em>Query Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String queryEndpoint = QUERY_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangeFormat() <em>Exchange Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Format EXCHANGE_FORMAT_EDEFAULT = Format.JSON;

	/**
	 * The cached value of the '{@link #getExchangeFormat() <em>Exchange Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeFormat()
	 * @generated
	 * @ordered
	 */
	protected Format exchangeFormat = EXCHANGE_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceSchema() <em>Source Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema sourceSchema;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final SourceType SOURCE_TYPE_EDEFAULT = SourceType.IO_T;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected SourceType sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueryConditions() <em>Query Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryConditions()
	 * @generated
	 * @ordered
	 */
	protected LogicProposition queryConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSourceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelineprojectPackage.Literals.INPUT_SOURCE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceURI() {
		return sourceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceURI(String newSourceURI) {
		String oldSourceURI = sourceURI;
		sourceURI = newSourceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_URI, oldSourceURI, sourceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryEndpoint() {
		return queryEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryEndpoint(String newQueryEndpoint) {
		String oldQueryEndpoint = queryEndpoint;
		queryEndpoint = newQueryEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT, oldQueryEndpoint, queryEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format getExchangeFormat() {
		return exchangeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeFormat(Format newExchangeFormat) {
		Format oldExchangeFormat = exchangeFormat;
		exchangeFormat = newExchangeFormat == null ? EXCHANGE_FORMAT_EDEFAULT : newExchangeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT, oldExchangeFormat, exchangeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSourceSchema() {
		if (sourceSchema != null && sourceSchema.eIsProxy()) {
			InternalEObject oldSourceSchema = (InternalEObject)sourceSchema;
			sourceSchema = (Schema)eResolveProxy(oldSourceSchema);
			if (sourceSchema != oldSourceSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA, oldSourceSchema, sourceSchema));
			}
		}
		return sourceSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSourceSchema() {
		return sourceSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSchema(Schema newSourceSchema) {
		Schema oldSourceSchema = sourceSchema;
		sourceSchema = newSourceSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA, oldSourceSchema, sourceSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(SourceType newSourceType) {
		SourceType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProposition getQueryConditions() {
		return queryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryConditions(LogicProposition newQueryConditions, NotificationChain msgs) {
		LogicProposition oldQueryConditions = queryConditions;
		queryConditions = newQueryConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS, oldQueryConditions, newQueryConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryConditions(LogicProposition newQueryConditions) {
		if (newQueryConditions != queryConditions) {
			NotificationChain msgs = null;
			if (queryConditions != null)
				msgs = ((InternalEObject)queryConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS, null, msgs);
			if (newQueryConditions != null)
				msgs = ((InternalEObject)newQueryConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS, null, msgs);
			msgs = basicSetQueryConditions(newQueryConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS, newQueryConditions, newQueryConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS:
				return basicSetQueryConditions(null, msgs);
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
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_URI:
				return getSourceURI();
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT:
				return getQueryEndpoint();
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT:
				return getExchangeFormat();
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA:
				if (resolve) return getSourceSchema();
				return basicGetSourceSchema();
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_TYPE:
				return getSourceType();
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS:
				return getQueryConditions();
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
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_URI:
				setSourceURI((String)newValue);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT:
				setQueryEndpoint((String)newValue);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT:
				setExchangeFormat((Format)newValue);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA:
				setSourceSchema((Schema)newValue);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_TYPE:
				setSourceType((SourceType)newValue);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS:
				setQueryConditions((LogicProposition)newValue);
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
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_URI:
				setSourceURI(SOURCE_URI_EDEFAULT);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT:
				setQueryEndpoint(QUERY_ENDPOINT_EDEFAULT);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT:
				setExchangeFormat(EXCHANGE_FORMAT_EDEFAULT);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA:
				setSourceSchema((Schema)null);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS:
				setQueryConditions((LogicProposition)null);
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
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_URI:
				return SOURCE_URI_EDEFAULT == null ? sourceURI != null : !SOURCE_URI_EDEFAULT.equals(sourceURI);
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_ENDPOINT:
				return QUERY_ENDPOINT_EDEFAULT == null ? queryEndpoint != null : !QUERY_ENDPOINT_EDEFAULT.equals(queryEndpoint);
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__EXCHANGE_FORMAT:
				return exchangeFormat != EXCHANGE_FORMAT_EDEFAULT;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_SCHEMA:
				return sourceSchema != null;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case PipelineprojectPackage.INPUT_SOURCE_DECLARATION__QUERY_CONDITIONS:
				return queryConditions != null;
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
		result.append(" (sourceURI: ");
		result.append(sourceURI);
		result.append(", queryEndpoint: ");
		result.append(queryEndpoint);
		result.append(", exchangeFormat: ");
		result.append(exchangeFormat);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(')');
		return result.toString();
	}

} //InputSourceDeclarationImpl
