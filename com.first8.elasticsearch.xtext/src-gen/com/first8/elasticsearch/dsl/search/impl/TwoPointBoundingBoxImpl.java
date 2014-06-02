/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.LatLon;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.TwoPointBoundingBox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Point Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TwoPointBoundingBoxImpl#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TwoPointBoundingBoxImpl#getBottomRight <em>Bottom Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwoPointBoundingBoxImpl extends MinimalEObjectImpl.Container implements TwoPointBoundingBox
{
  /**
   * The cached value of the '{@link #getTopLeft() <em>Top Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopLeft()
   * @generated
   * @ordered
   */
  protected LatLon topLeft;

  /**
   * The cached value of the '{@link #getBottomRight() <em>Bottom Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottomRight()
   * @generated
   * @ordered
   */
  protected LatLon bottomRight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TwoPointBoundingBoxImpl()
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
    return SearchPackage.eINSTANCE.getTwoPointBoundingBox();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLon getTopLeft()
  {
    return topLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTopLeft(LatLon newTopLeft, NotificationChain msgs)
  {
    LatLon oldTopLeft = topLeft;
    topLeft = newTopLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT, oldTopLeft, newTopLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTopLeft(LatLon newTopLeft)
  {
    if (newTopLeft != topLeft)
    {
      NotificationChain msgs = null;
      if (topLeft != null)
        msgs = ((InternalEObject)topLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT, null, msgs);
      if (newTopLeft != null)
        msgs = ((InternalEObject)newTopLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT, null, msgs);
      msgs = basicSetTopLeft(newTopLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT, newTopLeft, newTopLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLon getBottomRight()
  {
    return bottomRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBottomRight(LatLon newBottomRight, NotificationChain msgs)
  {
    LatLon oldBottomRight = bottomRight;
    bottomRight = newBottomRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT, oldBottomRight, newBottomRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBottomRight(LatLon newBottomRight)
  {
    if (newBottomRight != bottomRight)
    {
      NotificationChain msgs = null;
      if (bottomRight != null)
        msgs = ((InternalEObject)bottomRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT, null, msgs);
      if (newBottomRight != null)
        msgs = ((InternalEObject)newBottomRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT, null, msgs);
      msgs = basicSetBottomRight(newBottomRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT, newBottomRight, newBottomRight));
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
      case SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT:
        return basicSetTopLeft(null, msgs);
      case SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT:
        return basicSetBottomRight(null, msgs);
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
      case SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT:
        return getTopLeft();
      case SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT:
        return getBottomRight();
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
      case SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT:
        setTopLeft((LatLon)newValue);
        return;
      case SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT:
        setBottomRight((LatLon)newValue);
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
      case SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT:
        setTopLeft((LatLon)null);
        return;
      case SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT:
        setBottomRight((LatLon)null);
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
      case SearchPackage.TWO_POINT_BOUNDING_BOX__TOP_LEFT:
        return topLeft != null;
      case SearchPackage.TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT:
        return bottomRight != null;
    }
    return super.eIsSet(featureID);
  }

} //TwoPointBoundingBoxImpl
