/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.ASC_DESC;
import com.first8.elasticsearch.dsl.search.SORT_MODE;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SortObjectProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortObjectPropertyImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortObjectPropertyImpl#getSortMode <em>Sort Mode</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortObjectPropertyImpl#getMissing <em>Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortObjectPropertyImpl extends MinimalEObjectImpl.Container implements SortObjectProperty
{
  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected ASC_DESC order;

  /**
   * The cached value of the '{@link #getSortMode() <em>Sort Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortMode()
   * @generated
   * @ordered
   */
  protected SORT_MODE sortMode;

  /**
   * The default value of the '{@link #getMissing() <em>Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissing()
   * @generated
   * @ordered
   */
  protected static final String MISSING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMissing() <em>Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissing()
   * @generated
   * @ordered
   */
  protected String missing = MISSING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortObjectPropertyImpl()
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
    return SearchPackage.eINSTANCE.getSortObjectProperty();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASC_DESC getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(ASC_DESC newOrder, NotificationChain msgs)
  {
    ASC_DESC oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT_PROPERTY__ORDER, oldOrder, newOrder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(ASC_DESC newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_OBJECT_PROPERTY__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_OBJECT_PROPERTY__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT_PROPERTY__ORDER, newOrder, newOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SORT_MODE getSortMode()
  {
    return sortMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSortMode(SORT_MODE newSortMode, NotificationChain msgs)
  {
    SORT_MODE oldSortMode = sortMode;
    sortMode = newSortMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE, oldSortMode, newSortMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortMode(SORT_MODE newSortMode)
  {
    if (newSortMode != sortMode)
    {
      NotificationChain msgs = null;
      if (sortMode != null)
        msgs = ((InternalEObject)sortMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE, null, msgs);
      if (newSortMode != null)
        msgs = ((InternalEObject)newSortMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE, null, msgs);
      msgs = basicSetSortMode(newSortMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE, newSortMode, newSortMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMissing()
  {
    return missing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMissing(String newMissing)
  {
    String oldMissing = missing;
    missing = newMissing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT_PROPERTY__MISSING, oldMissing, missing));
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
      case SearchPackage.SORT_OBJECT_PROPERTY__ORDER:
        return basicSetOrder(null, msgs);
      case SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE:
        return basicSetSortMode(null, msgs);
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
      case SearchPackage.SORT_OBJECT_PROPERTY__ORDER:
        return getOrder();
      case SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE:
        return getSortMode();
      case SearchPackage.SORT_OBJECT_PROPERTY__MISSING:
        return getMissing();
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
      case SearchPackage.SORT_OBJECT_PROPERTY__ORDER:
        setOrder((ASC_DESC)newValue);
        return;
      case SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE:
        setSortMode((SORT_MODE)newValue);
        return;
      case SearchPackage.SORT_OBJECT_PROPERTY__MISSING:
        setMissing((String)newValue);
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
      case SearchPackage.SORT_OBJECT_PROPERTY__ORDER:
        setOrder((ASC_DESC)null);
        return;
      case SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE:
        setSortMode((SORT_MODE)null);
        return;
      case SearchPackage.SORT_OBJECT_PROPERTY__MISSING:
        setMissing(MISSING_EDEFAULT);
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
      case SearchPackage.SORT_OBJECT_PROPERTY__ORDER:
        return order != null;
      case SearchPackage.SORT_OBJECT_PROPERTY__SORT_MODE:
        return sortMode != null;
      case SearchPackage.SORT_OBJECT_PROPERTY__MISSING:
        return MISSING_EDEFAULT == null ? missing != null : !MISSING_EDEFAULT.equals(missing);
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
    result.append(" (missing: ");
    result.append(missing);
    result.append(')');
    return result.toString();
  }

} //SortObjectPropertyImpl
