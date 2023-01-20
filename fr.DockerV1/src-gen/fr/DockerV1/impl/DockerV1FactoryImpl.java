/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerV1FactoryImpl extends EFactoryImpl implements DockerV1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerV1Factory init() {
		try {
			DockerV1Factory theDockerV1Factory = (DockerV1Factory) EPackage.Registry.INSTANCE
					.getEFactory(DockerV1Package.eNS_URI);
			if (theDockerV1Factory != null) {
				return theDockerV1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerV1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerV1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DockerV1Package.IMAGE:
			return createImage();
		case DockerV1Package.DOCKER_ENGINE:
			return createDockerEngine();
		case DockerV1Package.CONTAINER:
			return createContainer();
		case DockerV1Package.VOLUME:
			return createVolume();
		case DockerV1Package.NETWORK:
			return createNetwork();
		case DockerV1Package.CONTAINER_RUNNING:
			return createContainerRunning();
		case DockerV1Package.CONTAINER_STOPPED:
			return createContainerStopped();
		case DockerV1Package.CONTAINER_PAUSED:
			return createContainerPaused();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DockerV1Package.TYPE_NETWORK:
			return createTypeNetworkFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DockerV1Package.TYPE_NETWORK:
			return convertTypeNetworkToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerEngine createDockerEngine() {
		DockerEngineImpl dockerEngine = new DockerEngineImpl();
		return dockerEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.DockerV1.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRunning createContainerRunning() {
		ContainerRunningImpl containerRunning = new ContainerRunningImpl();
		return containerRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerStopped createContainerStopped() {
		ContainerStoppedImpl containerStopped = new ContainerStoppedImpl();
		return containerStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerPaused createContainerPaused() {
		ContainerPausedImpl containerPaused = new ContainerPausedImpl();
		return containerPaused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNetwork createTypeNetworkFromString(EDataType eDataType, String initialValue) {
		TypeNetwork result = TypeNetwork.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNetworkToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerV1Package getDockerV1Package() {
		return (DockerV1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerV1Package getPackage() {
		return DockerV1Package.eINSTANCE;
	}

} //DockerV1FactoryImpl
