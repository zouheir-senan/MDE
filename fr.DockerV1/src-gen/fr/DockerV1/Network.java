/**
 */
package fr.DockerV1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.Network#getName <em>Name</em>}</li>
 *   <li>{@link fr.DockerV1.Network#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @see fr.DockerV1.DockerV1Package#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Service {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.DockerV1.DockerV1Package#getNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see fr.DockerV1.DockerV1Package#getNetwork_Driver()
	 * @model required="true"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Network#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

} // Network
