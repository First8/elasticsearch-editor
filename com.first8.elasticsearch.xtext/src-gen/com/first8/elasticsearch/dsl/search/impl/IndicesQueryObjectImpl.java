/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.IndicesQueryObject;
import com.first8.elasticsearch.dsl.search.Query;
import com.first8.elasticsearch.dsl.search.QueryObject;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indices Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.IndicesQueryObjectImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.IndicesQueryObjectImpl#getNoMatchQuery <em>No Match Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicesQueryObjectImpl extends IndicesQueryImpl implements IndicesQueryObject
{
  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected Query query;

  /**
   * The cached value of the '{@link #getNoMatchQuery() <em>No Match Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoMatchQuery()
   * @generated
   * @ordered
   */
  protected QueryObject noMatchQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndicesQueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getIndicesQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs)
  {
    Query oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_QUERY_OBJECT__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(Query newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_QUERY_OBJECT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_QUERY_OBJECT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_QUERY_OBJECT__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryObject getNoMatchQuery()
  {
    return noMatchQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNoMatchQuery(QueryObject newNoMatchQuery, NotificationChain msgs)
  {
    QueryObject oldNoMatchQuery = noMatchQuery;
    noMatchQuery = newNoMatchQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY, oldNoMatchQuery, newNoMatchQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoMatchQuery(QueryObject newNoMatchQuery)
  {
    if (newNoMatchQuery != noMatchQuery)
    {
      NotificationChain msgs = null;
      if (noMatchQuery != null)
        msgs = ((InternalEObject)noMatchQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY, null, msgs);
      if (newNoMatchQuery != null)
        msgs = ((InternalEObject)newNoMatchQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY, null, msgs);
      msgs = basicSetNoMatchQuery(newNoMatchQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY, newNoMatchQuery, newNoMatchQuery));
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
      case SearchPackage.INDICES_QUERY_OBJECT__QUERY:
        return basicSetQuery(null, msgs);
      case SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY:
        return basicSetNoMatchQuery(null, msgs);
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
      case SearchPackage.INDICES_QUERY_OBJECT__QUERY:
        return getQuery();
      case SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY:
        return getNoMatchQuery();
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
      case SearchPackage.INDICES_QUERY_OBJECT__QUERY:
        setQuery((Query)newValue);
        return;
      case SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY:
        setNoMatchQuery((QueryObject)newValue);
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
      case SearchPackage.INDICES_QUERY_OBJECT__QUERY:
        setQuery((Query)null);
        return;
      case SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY:
        setNoMatchQuery((QueryObject)null);
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
      case SearchPackage.INDICES_QUERY_OBJECT__QUERY:
        return query != null;
      case SearchPackage.INDICES_QUERY_OBJECT__NO_MATCH_QUERY:
        return noMatchQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //IndicesQueryObjectImpl
