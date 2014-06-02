/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.BoundingBoxObject;
import com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Bounding Box Filter Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoBoundingBoxFilterObjectImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoBoundingBoxFilterObjectImpl#getBoundingBox <em>Bounding Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoBoundingBoxFilterObjectImpl extends GeoBoundingBoxFilterImpl implements GeoBoundingBoxFilterObject
{
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
   * The cached value of the '{@link #getBoundingBox() <em>Bounding Box</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoundingBox()
   * @generated
   * @ordered
   */
  protected BoundingBoxObject boundingBox;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeoBoundingBoxFilterObjectImpl()
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
    return SearchPackage.eINSTANCE.getGeoBoundingBoxFilterObject();
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
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__FIELD_NAME, oldFieldName, fieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundingBoxObject getBoundingBox()
  {
    return boundingBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoundingBox(BoundingBoxObject newBoundingBox, NotificationChain msgs)
  {
    BoundingBoxObject oldBoundingBox = boundingBox;
    boundingBox = newBoundingBox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX, oldBoundingBox, newBoundingBox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoundingBox(BoundingBoxObject newBoundingBox)
  {
    if (newBoundingBox != boundingBox)
    {
      NotificationChain msgs = null;
      if (boundingBox != null)
        msgs = ((InternalEObject)boundingBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX, null, msgs);
      if (newBoundingBox != null)
        msgs = ((InternalEObject)newBoundingBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX, null, msgs);
      msgs = basicSetBoundingBox(newBoundingBox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX, newBoundingBox, newBoundingBox));
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
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX:
        return basicSetBoundingBox(null, msgs);
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
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__FIELD_NAME:
        return getFieldName();
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX:
        return getBoundingBox();
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
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX:
        setBoundingBox((BoundingBoxObject)newValue);
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
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX:
        setBoundingBox((BoundingBoxObject)null);
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
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX:
        return boundingBox != null;
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
    result.append(" (fieldName: ");
    result.append(fieldName);
    result.append(')');
    return result.toString();
  }

} //GeoBoundingBoxFilterObjectImpl
