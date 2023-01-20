/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.ConainerStatus;
import fr.DockerV1.ContainerPaused;
import fr.DockerV1.ContainerRunning;
import fr.DockerV1.ContainerStopped;
import fr.DockerV1.DockerEngine;
import fr.DockerV1.DockerObject;
import fr.DockerV1.DockerV1Factory;
import fr.DockerV1.DockerV1Package;
import fr.DockerV1.Image;
import fr.DockerV1.Network;
import fr.DockerV1.Service;
import fr.DockerV1.TypeNetwork;
import fr.DockerV1.Volume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerV1PackageImpl extends EPackageImpl implements DockerV1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conainerStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerRunningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerStoppedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPausedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeNetworkEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.DockerV1.DockerV1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerV1PackageImpl() {
		super(eNS_URI, DockerV1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DockerV1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerV1Package init() {
		if (isInited)
			return (DockerV1Package) EPackage.Registry.INSTANCE.getEPackage(DockerV1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDockerV1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		DockerV1PackageImpl theDockerV1Package = registeredDockerV1Package instanceof DockerV1PackageImpl
				? (DockerV1PackageImpl) registeredDockerV1Package
				: new DockerV1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDockerV1Package.createPackageContents();

		// Initialize created meta-data
		theDockerV1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerV1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerV1Package.eNS_URI, theDockerV1Package);
		return theDockerV1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Container() {
		return (EReference) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Repository() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Tag() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerEngine() {
		return dockerEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerEngine_Dockerobject() {
		return (EReference) dockerEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEngine_Base_url() {
		return (EAttribute) dockerEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Volume() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Network() {
		return (EReference) containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Name() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Conainerstatus() {
		return (EReference) containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Command() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__ChangeStatus__ConainerStatus() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Container__Image() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Name() {
		return (EAttribute) volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_MountpointOUT() {
		return (EAttribute) volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_MountpointIN() {
		return (EAttribute) volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
		return (EAttribute) networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Driver() {
		return (EAttribute) networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerObject() {
		return dockerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConainerStatus() {
		return conainerStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerRunning() {
		return containerRunningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainerRunning__Stope__ConainerStatus() {
		return containerRunningEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainerRunning__Pause__ConainerStatus() {
		return containerRunningEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerStopped() {
		return containerStoppedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainerStopped__Run__ConainerStatus() {
		return containerStoppedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerPaused() {
		return containerPausedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainerPaused__Run__ConainerStatus() {
		return containerPausedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeNetwork() {
		return typeNetworkEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerV1Factory getDockerV1Factory() {
		return (DockerV1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		imageEClass = createEClass(IMAGE);
		createEReference(imageEClass, IMAGE__CONTAINER);
		createEAttribute(imageEClass, IMAGE__REPOSITORY);
		createEAttribute(imageEClass, IMAGE__TAG);

		dockerEngineEClass = createEClass(DOCKER_ENGINE);
		createEReference(dockerEngineEClass, DOCKER_ENGINE__DOCKEROBJECT);
		createEAttribute(dockerEngineEClass, DOCKER_ENGINE__BASE_URL);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__VOLUME);
		createEReference(containerEClass, CONTAINER__NETWORK);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEReference(containerEClass, CONTAINER__CONAINERSTATUS);
		createEAttribute(containerEClass, CONTAINER__COMMAND);
		createEOperation(containerEClass, CONTAINER___CHANGE_STATUS__CONAINERSTATUS);
		createEOperation(containerEClass, CONTAINER___CONTAINER__IMAGE);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__NAME);
		createEAttribute(volumeEClass, VOLUME__MOUNTPOINT_OUT);
		createEAttribute(volumeEClass, VOLUME__MOUNTPOINT_IN);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__DRIVER);

		dockerObjectEClass = createEClass(DOCKER_OBJECT);

		serviceEClass = createEClass(SERVICE);

		conainerStatusEClass = createEClass(CONAINER_STATUS);

		containerRunningEClass = createEClass(CONTAINER_RUNNING);
		createEOperation(containerRunningEClass, CONTAINER_RUNNING___STOPE__CONAINERSTATUS);
		createEOperation(containerRunningEClass, CONTAINER_RUNNING___PAUSE__CONAINERSTATUS);

		containerStoppedEClass = createEClass(CONTAINER_STOPPED);
		createEOperation(containerStoppedEClass, CONTAINER_STOPPED___RUN__CONAINERSTATUS);

		containerPausedEClass = createEClass(CONTAINER_PAUSED);
		createEOperation(containerPausedEClass, CONTAINER_PAUSED___RUN__CONAINERSTATUS);

		// Create enums
		typeNetworkEEnum = createEEnum(TYPE_NETWORK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		imageEClass.getESuperTypes().add(this.getDockerObject());
		containerEClass.getESuperTypes().add(this.getDockerObject());
		volumeEClass.getESuperTypes().add(this.getService());
		networkEClass.getESuperTypes().add(this.getService());
		serviceEClass.getESuperTypes().add(this.getDockerObject());
		containerRunningEClass.getESuperTypes().add(this.getConainerStatus());
		containerStoppedEClass.getESuperTypes().add(this.getConainerStatus());
		containerPausedEClass.getESuperTypes().add(this.getConainerStatus());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImage_Container(), this.getContainer(), null, "container", null, 1, -1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Repository(), ecorePackage.getEString(), "repository", null, 1, 1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerEngineEClass, DockerEngine.class, "DockerEngine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerEngine_Dockerobject(), this.getDockerObject(), null, "dockerobject", null, 0, -1,
				DockerEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerEngine_Base_url(), ecorePackage.getEString(), "base_url", null, 0, 1,
				DockerEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, fr.DockerV1.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Volume(), this.getVolume(), null, "volume", null, 0, 1, fr.DockerV1.Container.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Network(), this.getNetwork(), null, "network", null, 0, 1,
				fr.DockerV1.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, fr.DockerV1.Container.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Conainerstatus(), this.getConainerStatus(), null, "conainerstatus", null, 1, 1,
				fr.DockerV1.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Command(), ecorePackage.getEString(), "command", null, 0, 1,
				fr.DockerV1.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getContainer__ChangeStatus__ConainerStatus(), null, "ChangeStatus", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConainerStatus(), "status", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContainer__Container__Image(), null, "Container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImage(), "image", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Name(), ecorePackage.getEString(), "name", null, 1, 1, Volume.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_MountpointOUT(), ecorePackage.getEString(), "MountpointOUT", null, 1, 1, Volume.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_MountpointIN(), ecorePackage.getEString(), "MountpointIN", null, 1, 1, Volume.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Name(), ecorePackage.getEString(), "name", null, 1, 1, Network.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Driver(), ecorePackage.getEString(), "driver", null, 1, 1, Network.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerObjectEClass, DockerObject.class, "DockerObject", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conainerStatusEClass, ConainerStatus.class, "ConainerStatus", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerRunningEClass, ContainerRunning.class, "ContainerRunning", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getContainerRunning__Stope__ConainerStatus(), null, "Stope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConainerStatus(), "status", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContainerRunning__Pause__ConainerStatus(), null, "Pause", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConainerStatus(), "status", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerStoppedEClass, ContainerStopped.class, "ContainerStopped", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getContainerStopped__Run__ConainerStatus(), null, "Run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConainerStatus(), "status", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerPausedEClass, ContainerPaused.class, "ContainerPaused", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getContainerPaused__Run__ConainerStatus(), null, "Run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConainerStatus(), "status", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeNetworkEEnum, TypeNetwork.class, "TypeNetwork");
		addEEnumLiteral(typeNetworkEEnum, TypeNetwork.BRIDGE);
		addEEnumLiteral(typeNetworkEEnum, TypeNetwork.HOST);
		addEEnumLiteral(typeNetworkEEnum, TypeNetwork.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //DockerV1PackageImpl
