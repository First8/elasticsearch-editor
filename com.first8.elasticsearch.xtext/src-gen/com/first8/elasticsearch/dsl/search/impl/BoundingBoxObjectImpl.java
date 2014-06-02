/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.BoundingBoxObject;
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
 * An implementation of the model object '<em><b>Bounding Box Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.BoundingBoxObjectImpl#getTwoPointBoundingBox <em>Two Point Bounding Box</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.BoundingBoxObjectImpl#getVerticesBoundingBox <em>Vertices Bounding Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundingBoxObjectImpl extends MinimalEObjectImpl.Container implements BoundingBoxObject
{
  /**
   * The cached value of the '{@link #getTwoPointBoundingBox() <em>Two Point Bounding Box</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwoPointBoundingBox()
   * @generated
   * @ordered
   */
  protected TwoPointBoundingBox twoPointBoundingBox;

  /**
   * The default value of the '{@link #getVerticesBoundingBox() <em>Vertices Bounding Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticesBoundingBox()
   * @generated
   * @ordered
   */
  protected static final String VERTICES_BOUNDING_BOX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerticesBoundingBox() <em>Vertices Bounding Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticesBoundingBox()
   * @generated
   * @ordered
   */
  protected String verticesBoundingBox = VERTICES_BOUNDING_BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoundingBoxObjectImpl()
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
    return SearchPackage.eINSTANCE.getBoundingBoxObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoPointBoundingBox getTwoPointBoundingBox()
  {
    return twoPointBoundingBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwoPointBoundingBox(TwoPointBoundingBox newTwoPointBoundingBox, NotificationChain msgs)
  {
    TwoPointBoundingBox oldTwoPointBoundingBox = twoPointBoundingBox;
    twoPointBoundingBox = newTwoPointBoundingBox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX, oldTwoPointBoundingBox, newTwoPointBoundingBox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwoPointBoundingBox(TwoPointBoundingBox newTwoPointBoundingBox)
  {
    if (newTwoPointBoundingBox != twoPointBoundingBox)
    {
      NotificationChain msgs = null;
      if (twoPointBoundingBox != null)
        msgs = ((InternalEObject)twoPointBoundingBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX, null, msgs);
      if (newTwoPointBoundingBox != null)
        msgs = ((InternalEObject)newTwoPointBoundingBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX, null, msgs);
      msgs = basicSetTwoPointBoundingBox(newTwoPointBoundingBox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX, newTwoPointBoundingBox, newTwoPointBoundingBox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVerticesBoundingBox()
  {
    return verticesBoundingBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticesBoundingBox(String newVerticesBoundingBox)
  {
    String oldVerticesBoundingBox = verticesBoundingBox;
    verticesBoundingBox = newVerticesBoundingBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.BOUNDING_BOX_OBJECT__VERTICES_BOUNDING_BOX, oldVerticesBoundingBox, verticesBoundingBox));
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
      case SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX:
        return basicSetTwoPointBoundingBox(null, msgs);
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
      case SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX:
        return getTwoPointBoundingBox();
      case SearchPackage.BOUNDING_BOX_OBJECT__VERTICES_BOUNDING_BOX:
        return getVerticesBoundingBox();
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
      case SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX:
        setTwoPointBoundingBox((TwoPointBoundingBox)newValue);
        return;
      case SearchPackage.BOUNDING_BOX_OBJECT__VERTICES_BOUNDING_BOX:
        setVerticesBoundingBox((String)newValue);
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
      case SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX:
        setTwoPointBoundingBox((TwoPointBoundingBox)null);
        return;
      case SearchPackage.BOUNDING_BOX_OBJECT__VERTICES_BOUNDING_BOX:
        setVerticesBoundingBox(VERTICES_BOUNDING_BOX_EDEFAULT);
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
      case SearchPackage.BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX:
        return twoPointBoundingBox != null;
      case SearchPackage.BOUNDING_BOX_OBJECT__VERTICES_BOUNDING_BOX:
        return VERTICES_BOUNDING_BOX_EDEFAULT == null ? verticesBoundingBox != null : !VERTICES_BOUNDING_BOX_EDEFAULT.equals(verticesBoundingBox);
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
    result.append(" (verticesBoundingBox: ");
    result.append(verticesBoundingBox);
    result.append(')');
    return result.toString();
  }

} //BoundingBoxObjectImpl
