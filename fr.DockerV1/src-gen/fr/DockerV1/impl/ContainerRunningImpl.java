/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.ConainerStatus;
import fr.DockerV1.ContainerRunning;
import fr.DockerV1.DockerV1Package;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Running</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContainerRunningImpl extends ConainerStatusImpl implements ContainerRunning {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRunningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerV1Package.Literals.CONTAINER_RUNNING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Stope(ConainerStatus status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Pause(ConainerStatus status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DockerV1Package.CONTAINER_RUNNING___STOPE__CONAINERSTATUS:
			Stope((ConainerStatus) arguments.get(0));
			return null;
		case DockerV1Package.CONTAINER_RUNNING___PAUSE__CONAINERSTATUS:
			Pause((ConainerStatus) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerRunningImpl
