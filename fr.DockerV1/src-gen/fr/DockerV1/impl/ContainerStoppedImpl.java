/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.ConainerStatus;
import fr.DockerV1.ContainerStopped;
import fr.DockerV1.DockerV1Package;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Stopped</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContainerStoppedImpl extends ConainerStatusImpl implements ContainerStopped {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerStoppedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerV1Package.Literals.CONTAINER_STOPPED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Run(ConainerStatus status) {
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
		case DockerV1Package.CONTAINER_STOPPED___RUN__CONAINERSTATUS:
			Run((ConainerStatus) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerStoppedImpl
