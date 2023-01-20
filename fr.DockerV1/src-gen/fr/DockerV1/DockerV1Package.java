/**
 */
package fr.DockerV1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.DockerV1.DockerV1Factory
 * @model kind="package"
 * @generated
 */
public interface DockerV1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DockerV1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/DockerV1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DockerV1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerV1Package eINSTANCE = fr.DockerV1.impl.DockerV1PackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.DockerObjectImpl <em>Docker Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.DockerObjectImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getDockerObject()
	 * @generated
	 */
	int DOCKER_OBJECT = 5;

	/**
	 * The number of structural features of the '<em>Docker Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Docker Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ImageImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTAINER = DOCKER_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REPOSITORY = DOCKER_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TAG = DOCKER_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = DOCKER_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = DOCKER_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.DockerEngineImpl <em>Docker Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.DockerEngineImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getDockerEngine()
	 * @generated
	 */
	int DOCKER_ENGINE = 1;

	/**
	 * The feature id for the '<em><b>Dockerobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ENGINE__DOCKEROBJECT = 0;

	/**
	 * The feature id for the '<em><b>Base url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ENGINE__BASE_URL = 1;

	/**
	 * The number of structural features of the '<em>Docker Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ENGINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Docker Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ENGINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ContainerImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUME = DOCKER_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NETWORK = DOCKER_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = DOCKER_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conainerstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONAINERSTATUS = DOCKER_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMMAND = DOCKER_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = DOCKER_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CHANGE_STATUS__CONAINERSTATUS = DOCKER_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CONTAINER__IMAGE = DOCKER_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = DOCKER_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ServiceImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = DOCKER_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = DOCKER_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.VolumeImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mountpoint OUT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MOUNTPOINT_OUT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mountpoint IN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MOUNTPOINT_IN = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.NetworkImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DRIVER = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ConainerStatusImpl <em>Conainer Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ConainerStatusImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getConainerStatus()
	 * @generated
	 */
	int CONAINER_STATUS = 7;

	/**
	 * The number of structural features of the '<em>Conainer Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONAINER_STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conainer Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONAINER_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ContainerRunningImpl <em>Container Running</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ContainerRunningImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainerRunning()
	 * @generated
	 */
	int CONTAINER_RUNNING = 8;

	/**
	 * The number of structural features of the '<em>Container Running</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RUNNING_FEATURE_COUNT = CONAINER_STATUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Stope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RUNNING___STOPE__CONAINERSTATUS = CONAINER_STATUS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RUNNING___PAUSE__CONAINERSTATUS = CONAINER_STATUS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Running</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RUNNING_OPERATION_COUNT = CONAINER_STATUS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ContainerStoppedImpl <em>Container Stopped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ContainerStoppedImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainerStopped()
	 * @generated
	 */
	int CONTAINER_STOPPED = 9;

	/**
	 * The number of structural features of the '<em>Container Stopped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STOPPED_FEATURE_COUNT = CONAINER_STATUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STOPPED___RUN__CONAINERSTATUS = CONAINER_STATUS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Stopped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STOPPED_OPERATION_COUNT = CONAINER_STATUS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.DockerV1.impl.ContainerPausedImpl <em>Container Paused</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.impl.ContainerPausedImpl
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainerPaused()
	 * @generated
	 */
	int CONTAINER_PAUSED = 10;

	/**
	 * The number of structural features of the '<em>Container Paused</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PAUSED_FEATURE_COUNT = CONAINER_STATUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PAUSED___RUN__CONAINERSTATUS = CONAINER_STATUS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Paused</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PAUSED_OPERATION_COUNT = CONAINER_STATUS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.DockerV1.TypeNetwork <em>Type Network</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.DockerV1.TypeNetwork
	 * @see fr.DockerV1.impl.DockerV1PackageImpl#getTypeNetwork()
	 * @generated
	 */
	int TYPE_NETWORK = 11;

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see fr.DockerV1.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.DockerV1.Image#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see fr.DockerV1.Image#getContainer()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Container();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Image#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see fr.DockerV1.Image#getRepository()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Repository();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Image#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see fr.DockerV1.Image#getTag()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Tag();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.DockerEngine <em>Docker Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Engine</em>'.
	 * @see fr.DockerV1.DockerEngine
	 * @generated
	 */
	EClass getDockerEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.DockerV1.DockerEngine#getDockerobject <em>Dockerobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dockerobject</em>'.
	 * @see fr.DockerV1.DockerEngine#getDockerobject()
	 * @see #getDockerEngine()
	 * @generated
	 */
	EReference getDockerEngine_Dockerobject();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.DockerEngine#getBase_url <em>Base url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base url</em>'.
	 * @see fr.DockerV1.DockerEngine#getBase_url()
	 * @see #getDockerEngine()
	 * @generated
	 */
	EAttribute getDockerEngine_Base_url();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see fr.DockerV1.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference '{@link fr.DockerV1.Container#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volume</em>'.
	 * @see fr.DockerV1.Container#getVolume()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Volume();

	/**
	 * Returns the meta object for the reference '{@link fr.DockerV1.Container#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see fr.DockerV1.Container#getNetwork()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Network();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.DockerV1.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.DockerV1.Container#getConainerstatus <em>Conainerstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conainerstatus</em>'.
	 * @see fr.DockerV1.Container#getConainerstatus()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Conainerstatus();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Container#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see fr.DockerV1.Container#getCommand()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Command();

	/**
	 * Returns the meta object for the '{@link fr.DockerV1.Container#ChangeStatus(fr.DockerV1.ConainerStatus) <em>Change Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Status</em>' operation.
	 * @see fr.DockerV1.Container#ChangeStatus(fr.DockerV1.ConainerStatus)
	 * @generated
	 */
	EOperation getContainer__ChangeStatus__ConainerStatus();

	/**
	 * Returns the meta object for the '{@link fr.DockerV1.Container#Container(fr.DockerV1.Image) <em>Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container</em>' operation.
	 * @see fr.DockerV1.Container#Container(fr.DockerV1.Image)
	 * @generated
	 */
	EOperation getContainer__Container__Image();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see fr.DockerV1.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Volume#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.DockerV1.Volume#getName()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Volume#getMountpointOUT <em>Mountpoint OUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mountpoint OUT</em>'.
	 * @see fr.DockerV1.Volume#getMountpointOUT()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_MountpointOUT();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Volume#getMountpointIN <em>Mountpoint IN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mountpoint IN</em>'.
	 * @see fr.DockerV1.Volume#getMountpointIN()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_MountpointIN();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see fr.DockerV1.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.DockerV1.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.DockerV1.Network#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see fr.DockerV1.Network#getDriver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Driver();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.DockerObject <em>Docker Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Object</em>'.
	 * @see fr.DockerV1.DockerObject
	 * @generated
	 */
	EClass getDockerObject();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see fr.DockerV1.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.ConainerStatus <em>Conainer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conainer Status</em>'.
	 * @see fr.DockerV1.ConainerStatus
	 * @generated
	 */
	EClass getConainerStatus();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.ContainerRunning <em>Container Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Running</em>'.
	 * @see fr.DockerV1.ContainerRunning
	 * @generated
	 */
	EClass getContainerRunning();

	/**
	 * Returns the meta object for the '{@link fr.DockerV1.ContainerRunning#Stope(fr.DockerV1.ConainerStatus) <em>Stope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stope</em>' operation.
	 * @see fr.DockerV1.ContainerRunning#Stope(fr.DockerV1.ConainerStatus)
	 * @generated
	 */
	EOperation getContainerRunning__Stope__ConainerStatus();

	/**
	 * Returns the meta object for the '{@link fr.DockerV1.ContainerRunning#Pause(fr.DockerV1.ConainerStatus) <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see fr.DockerV1.ContainerRunning#Pause(fr.DockerV1.ConainerStatus)
	 * @generated
	 */
	EOperation getContainerRunning__Pause__ConainerStatus();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.ContainerStopped <em>Container Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Stopped</em>'.
	 * @see fr.DockerV1.ContainerStopped
	 * @generated
	 */
	EClass getContainerStopped();

	/**
	 * Returns the meta object for the '{@link fr.DockerV1.ContainerStopped#Run(fr.DockerV1.ConainerStatus) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.DockerV1.ContainerStopped#Run(fr.DockerV1.ConainerStatus)
	 * @generated
	 */
	EOperation getContainerStopped__Run__ConainerStatus();

	/**
	 * Returns the meta object for class '{@link fr.DockerV1.ContainerPaused <em>Container Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Paused</em>'.
	 * @see fr.DockerV1.ContainerPaused
	 * @generated
	 */
	EClass getContainerPaused();

	/**
	 * Returns the meta object for the '{@link fr.DockerV1.ContainerPaused#Run(fr.DockerV1.ConainerStatus) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.DockerV1.ContainerPaused#Run(fr.DockerV1.ConainerStatus)
	 * @generated
	 */
	EOperation getContainerPaused__Run__ConainerStatus();

	/**
	 * Returns the meta object for enum '{@link fr.DockerV1.TypeNetwork <em>Type Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Network</em>'.
	 * @see fr.DockerV1.TypeNetwork
	 * @generated
	 */
	EEnum getTypeNetwork();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerV1Factory getDockerV1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ImageImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__CONTAINER = eINSTANCE.getImage_Container();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__REPOSITORY = eINSTANCE.getImage_Repository();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TAG = eINSTANCE.getImage_Tag();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.DockerEngineImpl <em>Docker Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.DockerEngineImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getDockerEngine()
		 * @generated
		 */
		EClass DOCKER_ENGINE = eINSTANCE.getDockerEngine();

		/**
		 * The meta object literal for the '<em><b>Dockerobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_ENGINE__DOCKEROBJECT = eINSTANCE.getDockerEngine_Dockerobject();

		/**
		 * The meta object literal for the '<em><b>Base url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_ENGINE__BASE_URL = eINSTANCE.getDockerEngine_Base_url();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ContainerImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__VOLUME = eINSTANCE.getContainer_Volume();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__NETWORK = eINSTANCE.getContainer_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Conainerstatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONAINERSTATUS = eINSTANCE.getContainer_Conainerstatus();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__COMMAND = eINSTANCE.getContainer_Command();

		/**
		 * The meta object literal for the '<em><b>Change Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CHANGE_STATUS__CONAINERSTATUS = eINSTANCE.getContainer__ChangeStatus__ConainerStatus();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CONTAINER__IMAGE = eINSTANCE.getContainer__Container__Image();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.VolumeImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__NAME = eINSTANCE.getVolume_Name();

		/**
		 * The meta object literal for the '<em><b>Mountpoint OUT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__MOUNTPOINT_OUT = eINSTANCE.getVolume_MountpointOUT();

		/**
		 * The meta object literal for the '<em><b>Mountpoint IN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__MOUNTPOINT_IN = eINSTANCE.getVolume_MountpointIN();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.NetworkImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__DRIVER = eINSTANCE.getNetwork_Driver();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.DockerObjectImpl <em>Docker Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.DockerObjectImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getDockerObject()
		 * @generated
		 */
		EClass DOCKER_OBJECT = eINSTANCE.getDockerObject();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ServiceImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ConainerStatusImpl <em>Conainer Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ConainerStatusImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getConainerStatus()
		 * @generated
		 */
		EClass CONAINER_STATUS = eINSTANCE.getConainerStatus();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ContainerRunningImpl <em>Container Running</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ContainerRunningImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainerRunning()
		 * @generated
		 */
		EClass CONTAINER_RUNNING = eINSTANCE.getContainerRunning();

		/**
		 * The meta object literal for the '<em><b>Stope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER_RUNNING___STOPE__CONAINERSTATUS = eINSTANCE.getContainerRunning__Stope__ConainerStatus();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER_RUNNING___PAUSE__CONAINERSTATUS = eINSTANCE.getContainerRunning__Pause__ConainerStatus();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ContainerStoppedImpl <em>Container Stopped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ContainerStoppedImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainerStopped()
		 * @generated
		 */
		EClass CONTAINER_STOPPED = eINSTANCE.getContainerStopped();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER_STOPPED___RUN__CONAINERSTATUS = eINSTANCE.getContainerStopped__Run__ConainerStatus();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.impl.ContainerPausedImpl <em>Container Paused</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.impl.ContainerPausedImpl
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getContainerPaused()
		 * @generated
		 */
		EClass CONTAINER_PAUSED = eINSTANCE.getContainerPaused();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER_PAUSED___RUN__CONAINERSTATUS = eINSTANCE.getContainerPaused__Run__ConainerStatus();

		/**
		 * The meta object literal for the '{@link fr.DockerV1.TypeNetwork <em>Type Network</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.DockerV1.TypeNetwork
		 * @see fr.DockerV1.impl.DockerV1PackageImpl#getTypeNetwork()
		 * @generated
		 */
		EEnum TYPE_NETWORK = eINSTANCE.getTypeNetwork();

	}

} //DockerV1Package
