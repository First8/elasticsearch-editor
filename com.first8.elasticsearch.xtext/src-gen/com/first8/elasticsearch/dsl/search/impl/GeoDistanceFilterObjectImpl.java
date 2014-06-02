/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject;
import com.first8.elasticsearch.dsl.search.LatLon;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Distance Filter Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterObjectImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterObjectImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterObjectImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterObjectImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoDistanceFilterObjectImpl extends GeoDistanceFilterImpl implements GeoDistanceFilterObject
{
  /**
   * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistance()
   * @generated
   * @ordered
   */
  protected static final String DISTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistance()
   * @generated
   * @ordered
   */
  protected String distance = DISTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected static final String FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected String fieldName = FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoint()
   * @generated
   * @ordered
   */
  protected LatLon point;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeoDistanceFilterObjectImpl()
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
    return SearchPackage.eINSTANCE.getGeoDistanceFilterObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDistance()
  {
    return distance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistance(String newDistance)
  {
    String oldDistance = distance;
    distance = newDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_FILTER_OBJECT__DISTANCE, oldDistance, distance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldName()
  {
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldName(String newFieldName)
  {
    String oldFieldName = fieldName;
    fieldName = newFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_FILTER_OBJECT__FIELD_NAME, oldFieldName, fieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLon getPoint()
  {
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPoint(LatLon newPoint, NotificationChain msgs)
  {
    LatLon oldPoint = point;
    point = newPoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT, oldPoint, newPoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoint(LatLon newPoint)
  {
    if (newPoint != point)
    {
      NotificationChain msgs = null;
      if (point != null)
        msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT, null, msgs);
      if (newPoint != null)
        msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT, null, msgs);
      msgs = basicSetPoint(newPoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT, newPoint, newPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, SearchPackage.GEO_DISTANCE_FILTER_OBJECT__PARAMS);
    }
    return params;
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
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT:
        return basicSetPoint(null, msgs);
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
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__DISTANCE:
        return getDistance();
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__FIELD_NAME:
        return getFieldName();
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT:
        return getPoint();
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__PARAMS:
        return getParams();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__DISTANCE:
        setDistance((String)newValue);
        return;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT:
        setPoint((LatLon)newValue);
        return;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
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
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__DISTANCE:
        setDistance(DISTANCE_EDEFAULT);
        return;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT:
        setPoint((LatLon)null);
        return;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__PARAMS:
        getParams().clear();
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
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__DISTANCE:
        return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__POINT:
        return point != null;
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (distance: ");
    result.append(distance);
    result.append(", fieldName: ");
    result.append(fieldName);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //GeoDistanceFilterObjectImpl
