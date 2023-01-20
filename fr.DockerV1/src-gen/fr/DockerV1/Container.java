/**
 */
package fr.DockerV1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.Container#getVolume <em>Volume</em>}</li>
 *   <li>{@link fr.DockerV1.Container#getNetwork <em>Network</em>}</li>
 *   <li>{@link fr.DockerV1.Container#getName <em>Name</em>}</li>
 *   <li>{@link fr.DockerV1.Container#getConainerstatus <em>Conainerstatus</em>}</li>
 *   <li>{@link fr.DockerV1.Container#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see fr.DockerV1.DockerV1Package#getContainer()
 * @model
 * @generated
 */
public interface Container extends DockerObject {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' reference.
	 * @see #setVolume(Volume)
	 * @see fr.DockerV1.DockerV1Package#getContainer_Volume()
	 * @model
	 * @generated
	 */
	Volume getVolume();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Container#getVolume <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(Volume value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see fr.DockerV1.DockerV1Package#getContainer_Network()
	 * @model
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Container#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.DockerV1.DockerV1Package#getContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conainerstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conainerstatus</em>' containment reference.
	 * @see #setConainerstatus(ConainerStatus)
	 * @see fr.DockerV1.DockerV1Package#getContainer_Conainerstatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConainerStatus getConainerstatus();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Container#getConainerstatus <em>Conainerstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conainerstatus</em>' containment reference.
	 * @see #getConainerstatus()
	 * @generated
	 */
	void setConainerstatus(ConainerStatus value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see fr.DockerV1.DockerV1Package#getContainer_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Container#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ChangeStatus(ConainerStatus status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Container(Image image);

} // Container
