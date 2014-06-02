/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.LatLonArray;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LatLonArrayImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LatLonArrayImpl#getLat <em>Lat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonArrayImpl extends MinimalEObjectImpl.Container implements LatLonArray
{
  /**
   * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLon()
   * @generated
   * @ordered
   */
  protected static final String LON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLon()
   * @generated
   * @ordered
   */
  protected String lon = LON_EDEFAULT;

  /**
   * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLat()
   * @generated
   * @ordered
   */
  protected static final String LAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLat()
   * @generated
   * @ordered
   */
  protected String lat = LAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LatLonArrayImpl()
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
    return SearchPackage.eINSTANCE.getLatLonArray();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLon()
  {
    return lon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLon(String newLon)
  {
    String oldLon = lon;
    lon = newLon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON_ARRAY__LON, oldLon, lon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLat()
  {
    return lat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLat(String newLat)
  {
    String oldLat = lat;
    lat = newLat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON_ARRAY__LAT, oldLat, lat));
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
      case SearchPackage.LAT_LON_ARRAY__LON:
        return getLon();
      case SearchPackage.LAT_LON_ARRAY__LAT:
        return getLat();
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
      case SearchPackage.LAT_LON_ARRAY__LON:
        setLon((String)newValue);
        return;
      case SearchPackage.LAT_LON_ARRAY__LAT:
        setLat((String)newValue);
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
      case SearchPackage.LAT_LON_ARRAY__LON:
        setLon(LON_EDEFAULT);
        return;
      case SearchPackage.LAT_LON_ARRAY__LAT:
        setLat(LAT_EDEFAULT);
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
      case SearchPackage.LAT_LON_ARRAY__LON:
        return LON_EDEFAULT == null ? lon != null : !LON_EDEFAULT.equals(lon);
      case SearchPackage.LAT_LON_ARRAY__LAT:
        return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
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
    result.append(" (lon: ");
    result.append(lon);
    result.append(", lat: ");
    result.append(lat);
    result.append(')');
    return result.toString();
  }

} //LatLonArrayImpl
