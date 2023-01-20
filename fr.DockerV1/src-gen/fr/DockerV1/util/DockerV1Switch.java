/**
 */
package fr.DockerV1.util;

import fr.DockerV1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.DockerV1.DockerV1Package
 * @generated
 */
public class DockerV1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerV1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerV1Switch() {
		if (modelPackage == null) {
			modelPackage = DockerV1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DockerV1Package.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseDockerObject(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.DOCKER_ENGINE: {
			DockerEngine dockerEngine = (DockerEngine) theEObject;
			T result = caseDockerEngine(dockerEngine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseDockerObject(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.VOLUME: {
			Volume volume = (Volume) theEObject;
			T result = caseVolume(volume);
			if (result == null)
				result = caseService(volume);
			if (result == null)
				result = caseDockerObject(volume);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.NETWORK: {
			Network network = (Network) theEObject;
			T result = caseNetwork(network);
			if (result == null)
				result = caseService(network);
			if (result == null)
				result = caseDockerObject(network);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.DOCKER_OBJECT: {
			DockerObject dockerObject = (DockerObject) theEObject;
			T result = caseDockerObject(dockerObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseDockerObject(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.CONAINER_STATUS: {
			ConainerStatus conainerStatus = (ConainerStatus) theEObject;
			T result = caseConainerStatus(conainerStatus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.CONTAINER_RUNNING: {
			ContainerRunning containerRunning = (ContainerRunning) theEObject;
			T result = caseContainerRunning(containerRunning);
			if (result == null)
				result = caseConainerStatus(containerRunning);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.CONTAINER_STOPPED: {
			ContainerStopped containerStopped = (ContainerStopped) theEObject;
			T result = caseContainerStopped(containerStopped);
			if (result == null)
				result = caseConainerStatus(containerStopped);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerV1Package.CONTAINER_PAUSED: {
			ContainerPaused containerPaused = (ContainerPaused) theEObject;
			T result = caseContainerPaused(containerPaused);
			if (result == null)
				result = caseConainerStatus(containerPaused);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerEngine(DockerEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerObject(DockerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conainer Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conainer Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConainerStatus(ConainerStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Running</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Running</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRunning(ContainerRunning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Stopped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Stopped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerStopped(ContainerStopped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Paused</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Paused</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerPaused(ContainerPaused object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DockerV1Switch
