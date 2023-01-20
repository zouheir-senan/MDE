/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.DockerEngine;
import fr.DockerV1.DockerObject;
import fr.DockerV1.DockerV1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.impl.DockerEngineImpl#getDockerobject <em>Dockerobject</em>}</li>
 *   <li>{@link fr.DockerV1.impl.DockerEngineImpl#getBase_url <em>Base url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerEngineImpl extends MinimalEObjectImpl.Container implements DockerEngine {
	/**
	 * The cached value of the '{@link #getDockerobject() <em>Dockerobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerobject()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerObject> dockerobject;

	/**
	 * The default value of the '{@link #getBase_url() <em>Base url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_url()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBase_url() <em>Base url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_url()
	 * @generated
	 * @ordered
	 */
	protected String base_url = BASE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerV1Package.Literals.DOCKER_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerObject> getDockerobject() {
		if (dockerobject == null) {
			dockerobject = new EObjectContainmentEList<DockerObject>(DockerObject.class, this,
					DockerV1Package.DOCKER_ENGINE__DOCKEROBJECT);
		}
		return dockerobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase_url() {
		return base_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_url(String newBase_url) {
		String oldBase_url = base_url;
		base_url = newBase_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.DOCKER_ENGINE__BASE_URL, oldBase_url,
					base_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerV1Package.DOCKER_ENGINE__DOCKEROBJECT:
			return ((InternalEList<?>) getDockerobject()).basicRemove(otherEnd, msgs);
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
		case DockerV1Package.DOCKER_ENGINE__DOCKEROBJECT:
			return getDockerobject();
		case DockerV1Package.DOCKER_ENGINE__BASE_URL:
			return getBase_url();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerV1Package.DOCKER_ENGINE__DOCKEROBJECT:
			getDockerobject().clear();
			getDockerobject().addAll((Collection<? extends DockerObject>) newValue);
			return;
		case DockerV1Package.DOCKER_ENGINE__BASE_URL:
			setBase_url((String) newValue);
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
		case DockerV1Package.DOCKER_ENGINE__DOCKEROBJECT:
			getDockerobject().clear();
			return;
		case DockerV1Package.DOCKER_ENGINE__BASE_URL:
			setBase_url(BASE_URL_EDEFAULT);
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
		case DockerV1Package.DOCKER_ENGINE__DOCKEROBJECT:
			return dockerobject != null && !dockerobject.isEmpty();
		case DockerV1Package.DOCKER_ENGINE__BASE_URL:
			return BASE_URL_EDEFAULT == null ? base_url != null : !BASE_URL_EDEFAULT.equals(base_url);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (base_url: ");
		result.append(base_url);
		result.append(')');
		return result.toString();
	}

} //DockerEngineImpl
