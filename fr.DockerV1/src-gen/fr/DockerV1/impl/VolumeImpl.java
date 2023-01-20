/**
 */
package fr.DockerV1.impl;

import fr.DockerV1.DockerV1Package;
import fr.DockerV1.Volume;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.DockerV1.impl.VolumeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.DockerV1.impl.VolumeImpl#getMountpointOUT <em>Mountpoint OUT</em>}</li>
 *   <li>{@link fr.DockerV1.impl.VolumeImpl#getMountpointIN <em>Mountpoint IN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends ServiceImpl implements Volume {
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
	 * The default value of the '{@link #getMountpointOUT() <em>Mountpoint OUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountpointOUT()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNTPOINT_OUT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMountpointOUT() <em>Mountpoint OUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountpointOUT()
	 * @generated
	 * @ordered
	 */
	protected String mountpointOUT = MOUNTPOINT_OUT_EDEFAULT;
	/**
	 * The default value of the '{@link #getMountpointIN() <em>Mountpoint IN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountpointIN()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNTPOINT_IN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMountpointIN() <em>Mountpoint IN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountpointIN()
	 * @generated
	 * @ordered
	 */
	protected String mountpointIN = MOUNTPOINT_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerV1Package.Literals.VOLUME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.VOLUME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountpointOUT() {
		return mountpointOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountpointOUT(String newMountpointOUT) {
		String oldMountpointOUT = mountpointOUT;
		mountpointOUT = newMountpointOUT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.VOLUME__MOUNTPOINT_OUT,
					oldMountpointOUT, mountpointOUT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountpointIN() {
		return mountpointIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountpointIN(String newMountpointIN) {
		String oldMountpointIN = mountpointIN;
		mountpointIN = newMountpointIN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerV1Package.VOLUME__MOUNTPOINT_IN,
					oldMountpointIN, mountpointIN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerV1Package.VOLUME__NAME:
			return getName();
		case DockerV1Package.VOLUME__MOUNTPOINT_OUT:
			return getMountpointOUT();
		case DockerV1Package.VOLUME__MOUNTPOINT_IN:
			return getMountpointIN();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerV1Package.VOLUME__NAME:
			setName((String) newValue);
			return;
		case DockerV1Package.VOLUME__MOUNTPOINT_OUT:
			setMountpointOUT((String) newValue);
			return;
		case DockerV1Package.VOLUME__MOUNTPOINT_IN:
			setMountpointIN((String) newValue);
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
		case DockerV1Package.VOLUME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DockerV1Package.VOLUME__MOUNTPOINT_OUT:
			setMountpointOUT(MOUNTPOINT_OUT_EDEFAULT);
			return;
		case DockerV1Package.VOLUME__MOUNTPOINT_IN:
			setMountpointIN(MOUNTPOINT_IN_EDEFAULT);
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
		case DockerV1Package.VOLUME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DockerV1Package.VOLUME__MOUNTPOINT_OUT:
			return MOUNTPOINT_OUT_EDEFAULT == null ? mountpointOUT != null
					: !MOUNTPOINT_OUT_EDEFAULT.equals(mountpointOUT);
		case DockerV1Package.VOLUME__MOUNTPOINT_IN:
			return MOUNTPOINT_IN_EDEFAULT == null ? mountpointIN != null : !MOUNTPOINT_IN_EDEFAULT.equals(mountpointIN);
		}
		return super.eIsSet(featureID);
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
		result.append(", MountpointOUT: ");
		result.append(mountpointOUT);
		result.append(", MountpointIN: ");
		result.append(mountpointIN);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
