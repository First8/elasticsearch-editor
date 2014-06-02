/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SpanFirstQuery;
import com.first8.elasticsearch.dsl.search.SpanQuery;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanQueryImpl#getSpanQuery <em>Span Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanQueryImpl extends MinimalEObjectImpl.Container implements SpanQuery
{
  /**
   * The cached value of the '{@link #getSpanQuery() <em>Span Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanQuery()
   * @generated
   * @ordered
   */
  protected SpanFirstQuery spanQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpanQueryImpl()
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
    return SearchPackage.eINSTANCE.getSpanQuery();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanFirstQuery getSpanQuery()
  {
    return spanQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanQuery(SpanFirstQuery newSpanQuery, NotificationChain msgs)
  {
    SpanFirstQuery oldSpanQuery = spanQuery;
    spanQuery = newSpanQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_QUERY__SPAN_QUERY, oldSpanQuery, newSpanQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanQuery(SpanFirstQuery newSpanQuery)
  {
    if (newSpanQuery != spanQuery)
    {
      NotificationChain msgs = null;
      if (spanQuery != null)
        msgs = ((InternalEObject)spanQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_QUERY__SPAN_QUERY, null, msgs);
      if (newSpanQuery != null)
        msgs = ((InternalEObject)newSpanQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_QUERY__SPAN_QUERY, null, msgs);
      msgs = basicSetSpanQuery(newSpanQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_QUERY__SPAN_QUERY, newSpanQuery, newSpanQuery));
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
      case SearchPackage.SPAN_QUERY__SPAN_QUERY:
        return basicSetSpanQuery(null, msgs);
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
      case SearchPackage.SPAN_QUERY__SPAN_QUERY:
        return getSpanQuery();
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
      case SearchPackage.SPAN_QUERY__SPAN_QUERY:
        setSpanQuery((SpanFirstQuery)newValue);
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
      case SearchPackage.SPAN_QUERY__SPAN_QUERY:
        setSpanQuery((SpanFirstQuery)null);
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
      case SearchPackage.SPAN_QUERY__SPAN_QUERY:
        return spanQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //SpanQueryImpl
