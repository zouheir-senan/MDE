/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.ConainerStatus;
import fr.DockerV1.DockerV1Package;
import fr.DockerV1.Image;
import fr.DockerV1.Network;
import fr.DockerV1.Volume;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.impl.ContainerImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link fr.DockerV1.impl.ContainerImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link fr.DockerV1.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.DockerV1.impl.ContainerImpl#getConainerstatus <em>Conainerstatus</em>}</li>
 *   <li>{@link fr.DockerV1.impl.ContainerImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends DockerObjectImpl implements fr.DockerV1.Container {
	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Volume volume;
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getConainerstatus() <em>Conainerstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConainerstatus()
	 * @generated
	 * @ordered
	 */
	protected ConainerStatus conainerstatus;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerV1Package.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume getVolume() {
		if (volume != null && volume.eIsProxy()) {
			InternalEObject oldVolume = (InternalEObject) volume;
			volume = (Volume) eResolveProxy(oldVolume);
			if (volume != oldVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerV1Package.CONTAINER__VOLUME,
							oldVolume, volume));
			}
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume basicGetVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(Volume newVolume) {
		Volume oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.CONTAINER__VOLUME, oldVolume,
					volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject) network;
			network = (Network) eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerV1Package.CONTAINER__NETWORK,
							oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.CONTAINER__NETWORK, oldNetwork,
					network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConainerStatus getConainerstatus() {
		return conainerstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConainerstatus(ConainerStatus newConainerstatus, NotificationChain msgs) {
		ConainerStatus oldConainerstatus = conainerstatus;
		conainerstatus = newConainerstatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerV1Package.CONTAINER__CONAINERSTATUS, oldConainerstatus, newConainerstatus);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConainerstatus(ConainerStatus newConainerstatus) {
		if (newConainerstatus != conainerstatus) {
			NotificationChain msgs = null;
			if (conainerstatus != null)
				msgs = ((InternalEObject) conainerstatus).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerV1Package.CONTAINER__CONAINERSTATUS, null, msgs);
			if (newConainerstatus != null)
				msgs = ((InternalEObject) newConainerstatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerV1Package.CONTAINER__CONAINERSTATUS, null, msgs);
			msgs = basicSetConainerstatus(newConainerstatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.CONTAINER__CONAINERSTATUS,
					newConainerstatus, newConainerstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.CONTAINER__COMMAND, oldCommand,
					command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ChangeStatus(ConainerStatus status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Container(Image image) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerV1Package.CONTAINER__CONAINERSTATUS:
			return basicSetConainerstatus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerV1Package.CONTAINER__VOLUME:
			if (resolve)
				return getVolume();
			return basicGetVolume();
		case DockerV1Package.CONTAINER__NETWORK:
			if (resolve)
				return getNetwork();
			return basicGetNetwork();
		case DockerV1Package.CONTAINER__NAME:
			return getName();
		case DockerV1Package.CONTAINER__CONAINERSTATUS:
			return getConainerstatus();
		case DockerV1Package.CONTAINER__COMMAND:
			return getCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerV1Package.CONTAINER__VOLUME:
			setVolume((Volume) newValue);
			return;
		case DockerV1Package.CONTAINER__NETWORK:
			setNetwork((Network) newValue);
			return;
		case DockerV1Package.CONTAINER__NAME:
			setName((String) newValue);
			return;
		case DockerV1Package.CONTAINER__CONAINERSTATUS:
			setConainerstatus((ConainerStatus) newValue);
			return;
		case DockerV1Package.CONTAINER__COMMAND:
			setCommand((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DockerV1Package.CONTAINER__VOLUME:
			setVolume((Volume) null);
			return;
		case DockerV1Package.CONTAINER__NETWORK:
			setNetwork((Network) null);
			return;
		case DockerV1Package.CONTAINER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DockerV1Package.CONTAINER__CONAINERSTATUS:
			setConainerstatus((ConainerStatus) null);
			return;
		case DockerV1Package.CONTAINER__COMMAND:
			setCommand(COMMAND_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DockerV1Package.CONTAINER__VOLUME:
			return volume != null;
		case DockerV1Package.CONTAINER__NETWORK:
			return network != null;
		case DockerV1Package.CONTAINER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DockerV1Package.CONTAINER__CONAINERSTATUS:
			return conainerstatus != null;
		case DockerV1Package.CONTAINER__COMMAND:
			return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DockerV1Package.CONTAINER___CHANGE_STATUS__CONAINERSTATUS:
			ChangeStatus((ConainerStatus) arguments.get(0));
			return null;
		case DockerV1Package.CONTAINER___CONTAINER__IMAGE:
			Container((Image) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
