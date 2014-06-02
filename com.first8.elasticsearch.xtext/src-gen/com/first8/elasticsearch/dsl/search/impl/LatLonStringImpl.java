/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.LatLonString;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LatLonStringImpl#getLatLonOrHash <em>Lat Lon Or Hash</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonStringImpl extends MinimalEObjectImpl.Container implements LatLonString
{
  /**
   * The default value of the '{@link #getLatLonOrHash() <em>Lat Lon Or Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatLonOrHash()
   * @generated
   * @ordered
   */
  protected static final String LAT_LON_OR_HASH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLatLonOrHash() <em>Lat Lon Or Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatLonOrHash()
   * @generated
   * @ordered
   */
  protected String latLonOrHash = LAT_LON_OR_HASH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LatLonStringImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SearchPackage.eINSTANCE.getLatLonString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLatLonOrHash()
  {
    return latLonOrHash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatLonOrHash(String newLatLonOrHash)
  {
    String oldLatLonOrHash = latLonOrHash;
    latLonOrHash = newLatLonOrHash;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON_STRING__LAT_LON_OR_HASH, oldLatLonOrHash, latLonOrHash));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SearchPackage.LAT_LON_STRING__LAT_LON_OR_HASH:
        return getLatLonOrHash();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SearchPackage.LAT_LON_STRING__LAT_LON_OR_HASH:
        setLatLonOrHash((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SearchPackage.LAT_LON_STRING__LAT_LON_OR_HASH:
        setLatLonOrHash(LAT_LON_OR_HASH_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SearchPackage.LAT_LON_STRING__LAT_LON_OR_HASH:
        return LAT_LON_OR_HASH_EDEFAULT == null ? latLonOrHash != null : !LAT_LON_OR_HASH_EDEFAULT.equals(latLonOrHash);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (latLonOrHash: ");
    result.append(latLonOrHash);
    result.append(')');
    return result.toString();
  }

} //LatLonStringImpl
