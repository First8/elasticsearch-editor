/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SpanNotQueryObject;
import com.first8.elasticsearch.dsl.search.SpanQuery;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Not Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanNotQueryObjectImpl#getIncludeQuery <em>Include Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanNotQueryObjectImpl#getExcludeQuery <em>Exclude Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanNotQueryObjectImpl extends SpanNotQueryImpl implements SpanNotQueryObject
{
  /**
   * The cached value of the '{@link #getIncludeQuery() <em>Include Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeQuery()
   * @generated
   * @ordered
   */
  protected SpanQuery includeQuery;

  /**
   * The cached value of the '{@link #getExcludeQuery() <em>Exclude Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeQuery()
   * @generated
   * @ordered
   */
  protected SpanQuery excludeQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpanNotQueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getSpanNotQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanQuery getIncludeQuery()
  {
    return includeQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludeQuery(SpanQuery newIncludeQuery, NotificationChain msgs)
  {
    SpanQuery oldIncludeQuery = includeQuery;
    includeQuery = newIncludeQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY, oldIncludeQuery, newIncludeQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeQuery(SpanQuery newIncludeQuery)
  {
    if (newIncludeQuery != includeQuery)
    {
      NotificationChain msgs = null;
      if (includeQuery != null)
        msgs = ((InternalEObject)includeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY, null, msgs);
      if (newIncludeQuery != null)
        msgs = ((InternalEObject)newIncludeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY, null, msgs);
      msgs = basicSetIncludeQuery(newIncludeQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY, newIncludeQuery, newIncludeQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanQuery getExcludeQuery()
  {
    return excludeQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExcludeQuery(SpanQuery newExcludeQuery, NotificationChain msgs)
  {
    SpanQuery oldExcludeQuery = excludeQuery;
    excludeQuery = newExcludeQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY, oldExcludeQuery, newExcludeQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcludeQuery(SpanQuery newExcludeQuery)
  {
    if (newExcludeQuery != excludeQuery)
    {
      NotificationChain msgs = null;
      if (excludeQuery != null)
        msgs = ((InternalEObject)excludeQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY, null, msgs);
      if (newExcludeQuery != null)
        msgs = ((InternalEObject)newExcludeQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY, null, msgs);
      msgs = basicSetExcludeQuery(newExcludeQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY, newExcludeQuery, newExcludeQuery));
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
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY:
        return basicSetIncludeQuery(null, msgs);
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY:
        return basicSetExcludeQuery(null, msgs);
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
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY:
        return getIncludeQuery();
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY:
        return getExcludeQuery();
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
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY:
        setIncludeQuery((SpanQuery)newValue);
        return;
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY:
        setExcludeQuery((SpanQuery)newValue);
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
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY:
        setIncludeQuery((SpanQuery)null);
        return;
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY:
        setExcludeQuery((SpanQuery)null);
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
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY:
        return includeQuery != null;
      case SearchPackage.SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY:
        return excludeQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //SpanNotQueryObjectImpl
