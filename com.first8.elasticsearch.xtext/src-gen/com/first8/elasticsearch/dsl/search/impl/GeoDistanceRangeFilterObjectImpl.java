/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject;
import com.first8.elasticsearch.dsl.search.LatLon;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Distance Range Filter Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterObjectImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterObjectImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterObjectImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterObjectImpl#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoDistanceRangeFilterObjectImpl extends GeoDistanceRangeFilterImpl implements GeoDistanceRangeFilterObject
{
  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final String TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected String to = TO_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeoDistanceRangeFilterObjectImpl()
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
    return SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(String newTo)
  {
    String oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__TO, oldTo, to));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FIELD_NAME, oldFieldName, fieldName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT, oldPoint, newPoint);
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
        msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT, null, msgs);
      if (newPoint != null)
        msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT, null, msgs);
      msgs = basicSetPoint(newPoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT, newPoint, newPoint));
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
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT:
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
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FROM:
        return getFrom();
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__TO:
        return getTo();
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FIELD_NAME:
        return getFieldName();
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT:
        return getPoint();
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
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FROM:
        setFrom((String)newValue);
        return;
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__TO:
        setTo((String)newValue);
        return;
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT:
        setPoint((LatLon)newValue);
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
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__TO:
        setTo(TO_EDEFAULT);
        return;
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT:
        setPoint((LatLon)null);
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
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__TO:
        return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT:
        return point != null;
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
    result.append(" (from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(", fieldName: ");
    result.append(fieldName);
    result.append(')');
    return result.toString();
  }

} //GeoDistanceRangeFilterObjectImpl
