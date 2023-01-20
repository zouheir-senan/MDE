/**
 */
package fr.DockerV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.DockerEngine#getDockerobject <em>Dockerobject</em>}</li>
 *   <li>{@link fr.DockerV1.DockerEngine#getBase_url <em>Base url</em>}</li>
 * </ul>
 *
 * @see fr.DockerV1.DockerV1Package#getDockerEngine()
 * @model
 * @generated
 */
public interface DockerEngine extends EObject {
	/**
	 * Returns the value of the '<em><b>Dockerobject</b></em>' containment reference list.
	 * The list contents are of type {@link fr.DockerV1.DockerObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dockerobject</em>' containment reference list.
	 * @see fr.DockerV1.DockerV1Package#getDockerEngine_Dockerobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerObject> getDockerobject();

	/**
	 * Returns the value of the '<em><b>Base url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base url</em>' attribute.
	 * @see #setBase_url(String)
	 * @see fr.DockerV1.DockerV1Package#getDockerEngine_Base_url()
	 * @model
	 * @generated
	 */
	String getBase_url();

	/**
	 * Sets the value of the '{@link fr.DockerV1.DockerEngine#getBase_url <em>Base url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base url</em>' attribute.
	 * @see #getBase_url()
	 * @generated
	 */
	void setBase_url(String value);

} // DockerEngine
