/**
 */
package fr.DockerV1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.Volume#getName <em>Name</em>}</li>
 *   <li>{@link fr.DockerV1.Volume#getMountpointOUT <em>Mountpoint OUT</em>}</li>
 *   <li>{@link fr.DockerV1.Volume#getMountpointIN <em>Mountpoint IN</em>}</li>
 * </ul>
 *
 * @see fr.DockerV1.DockerV1Package#getVolume()
 * @model
 * @generated
 */
public interface Volume extends Service {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.DockerV1.DockerV1Package#getVolume_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Volume#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mountpoint OUT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mountpoint OUT</em>' attribute.
	 * @see #setMountpointOUT(String)
	 * @see fr.DockerV1.DockerV1Package#getVolume_MountpointOUT()
	 * @model required="true"
	 * @generated
	 */
	String getMountpointOUT();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Volume#getMountpointOUT <em>Mountpoint OUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mountpoint OUT</em>' attribute.
	 * @see #getMountpointOUT()
	 * @generated
	 */
	void setMountpointOUT(String value);

	/**
	 * Returns the value of the '<em><b>Mountpoint IN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mountpoint IN</em>' attribute.
	 * @see #setMountpointIN(String)
	 * @see fr.DockerV1.DockerV1Package#getVolume_MountpointIN()
	 * @model required="true"
	 * @generated
	 */
	String getMountpointIN();

	/**
	 * Sets the value of the '{@link fr.DockerV1.Volume#getMountpointIN <em>Mountpoint IN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mountpoint IN</em>' attribute.
	 * @see #getMountpointIN()
	 * @generated
	 */
	void setMountpointIN(String value);
} // Volume
