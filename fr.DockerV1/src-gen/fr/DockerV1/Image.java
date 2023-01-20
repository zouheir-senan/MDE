/**
 */
package fr.DockerV1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.Image#getContainer <em>Container</em>}</li>
 *   <li>{@link fr.DockerV1.Image#getRepository <em>Repository</em>}</li>
 *   <li>{@link fr.DockerV1.Image#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see fr.DockerV1.DockerV1Package#getImage()
 * @model
 * @generated
 */
public interface Image extends DockerObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link fr.DockerV1.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see fr.DockerV1.DockerV1Package#getImage_Container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see fr.DockerV1.DockerV1Package#getImage_Repository()
	 * @model required="true"
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Image#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see fr.DockerV1.DockerV1Package#getImage_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Image#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

} // Image
