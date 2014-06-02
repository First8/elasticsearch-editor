/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.LatLon;
import com.first8.elasticsearch.dsl.search.LatLonArray;
import com.first8.elasticsearch.dsl.search.LatLonString;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LatLonImpl#getLatLonObject <em>Lat Lon Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LatLonImpl#getLatLonArray <em>Lat Lon Array</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LatLonImpl#getLatLonString <em>Lat Lon String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonImpl extends GeohashCellFilterObjectImpl implements LatLon
{
  /**
   * The default value of the '{@link #getLatLonObject() <em>Lat Lon Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatLonObject()
   * @generated
   * @ordered
   */
  protected static final String LAT_LON_OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLatLonObject() <em>Lat Lon Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatLonObject()
   * @generated
   * @ordered
   */
  protected String latLonObject = LAT_LON_OBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLatLonArray() <em>Lat Lon Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatLonArray()
   * @generated
   * @ordered
   */
  protected LatLonArray latLonArray;

  /**
   * The cached value of the '{@link #getLatLonString() <em>Lat Lon String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatLonString()
   * @generated
   * @ordered
   */
  protected LatLonString latLonString;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LatLonImpl()
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
    return SearchPackage.eINSTANCE.getLatLon();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLatLonObject()
  {
    return latLonObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatLonObject(String newLatLonObject)
  {
    String oldLatLonObject = latLonObject;
    latLonObject = newLatLonObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON__LAT_LON_OBJECT, oldLatLonObject, latLonObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLonArray getLatLonArray()
  {
    return latLonArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatLonArray(LatLonArray newLatLonArray, NotificationChain msgs)
  {
    LatLonArray oldLatLonArray = latLonArray;
    latLonArray = newLatLonArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON__LAT_LON_ARRAY, oldLatLonArray, newLatLonArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatLonArray(LatLonArray newLatLonArray)
  {
    if (newLatLonArray != latLonArray)
    {
      NotificationChain msgs = null;
      if (latLonArray != null)
        msgs = ((InternalEObject)latLonArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.LAT_LON__LAT_LON_ARRAY, null, msgs);
      if (newLatLonArray != null)
        msgs = ((InternalEObject)newLatLonArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.LAT_LON__LAT_LON_ARRAY, null, msgs);
      msgs = basicSetLatLonArray(newLatLonArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON__LAT_LON_ARRAY, newLatLonArray, newLatLonArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLonString getLatLonString()
  {
    return latLonString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatLonString(LatLonString newLatLonString, NotificationChain msgs)
  {
    LatLonString oldLatLonString = latLonString;
    latLonString = newLatLonString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON__LAT_LON_STRING, oldLatLonString, newLatLonString);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatLonString(LatLonString newLatLonString)
  {
    if (newLatLonString != latLonString)
    {
      NotificationChain msgs = null;
      if (latLonString != null)
        msgs = ((InternalEObject)latLonString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.LAT_LON__LAT_LON_STRING, null, msgs);
      if (newLatLonString != null)
        msgs = ((InternalEObject)newLatLonString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.LAT_LON__LAT_LON_STRING, null, msgs);
      msgs = basicSetLatLonString(newLatLonString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LAT_LON__LAT_LON_STRING, newLatLonString, newLatLonString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SearchPackage.LAT_LON__LAT_LON_ARRAY:
        return basicSetLatLonArray(null, msgs);
      case SearchPackage.LAT_LON__LAT_LON_STRING:
        return basicSetLatLonString(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SearchPackage.LAT_LON__LAT_LON_OBJECT:
        return getLatLonObject();
      case SearchPackage.LAT_LON__LAT_LON_ARRAY:
        return getLatLonArray();
      case SearchPackage.LAT_LON__LAT_LON_STRING:
        return getLatLonString();
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
      case SearchPackage.LAT_LON__LAT_LON_OBJECT:
        setLatLonObject((String)newValue);
        return;
      case SearchPackage.LAT_LON__LAT_LON_ARRAY:
        setLatLonArray((LatLonArray)newValue);
        return;
      case SearchPackage.LAT_LON__LAT_LON_STRING:
        setLatLonString((LatLonString)newValue);
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
      case SearchPackage.LAT_LON__LAT_LON_OBJECT:
        setLatLonObject(LAT_LON_OBJECT_EDEFAULT);
        return;
      case SearchPackage.LAT_LON__LAT_LON_ARRAY:
        setLatLonArray((LatLonArray)null);
        return;
      case SearchPackage.LAT_LON__LAT_LON_STRING:
        setLatLonString((LatLonString)null);
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
      case SearchPackage.LAT_LON__LAT_LON_OBJECT:
        return LAT_LON_OBJECT_EDEFAULT == null ? latLonObject != null : !LAT_LON_OBJECT_EDEFAULT.equals(latLonObject);
      case SearchPackage.LAT_LON__LAT_LON_ARRAY:
        return latLonArray != null;
      case SearchPackage.LAT_LON__LAT_LON_STRING:
        return latLonString != null;
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
    result.append(" (latLonObject: ");
    result.append(latLonObject);
    result.append(')');
    return result.toString();
  }

} //LatLonImpl
