/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SpanFirstQueryObject;
import com.first8.elasticsearch.dsl.search.SpanQuery;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span First Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanFirstQueryObjectImpl#getSubquery <em>Subquery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanFirstQueryObjectImpl extends SpanFirstQueryImpl implements SpanFirstQueryObject
{
  /**
   * The cached value of the '{@link #getSubquery() <em>Subquery</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubquery()
   * @generated
   * @ordered
   */
  protected SpanQuery subquery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpanFirstQueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getSpanFirstQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanQuery getSubquery()
  {
    return subquery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubquery(SpanQuery newSubquery, NotificationChain msgs)
  {
    SpanQuery oldSubquery = subquery;
    subquery = newSubquery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY, oldSubquery, newSubquery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubquery(SpanQuery newSubquery)
  {
    if (newSubquery != subquery)
    {
      NotificationChain msgs = null;
      if (subquery != null)
        msgs = ((InternalEObject)subquery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY, null, msgs);
      if (newSubquery != null)
        msgs = ((InternalEObject)newSubquery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY, null, msgs);
      msgs = basicSetSubquery(newSubquery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY, newSubquery, newSubquery));
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
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY:
        return basicSetSubquery(null, msgs);
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
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY:
        return getSubquery();
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
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY:
        setSubquery((SpanQuery)newValue);
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
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY:
        setSubquery((SpanQuery)null);
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
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT__SUBQUERY:
        return subquery != null;
    }
    return super.eIsSet(featureID);
  }

} //SpanFirstQueryObjectImpl
