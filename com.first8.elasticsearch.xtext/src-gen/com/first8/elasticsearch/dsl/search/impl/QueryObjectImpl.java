/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.QueryObject;
import com.first8.elasticsearch.dsl.search.QueryType;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryObjectImpl#getQueryType <em>Query Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryObjectImpl extends FQueryImpl implements QueryObject
{
  /**
   * The cached value of the '{@link #getQueryType() <em>Query Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryType()
   * @generated
   * @ordered
   */
  protected QueryType queryType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryType getQueryType()
  {
    return queryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueryType(QueryType newQueryType, NotificationChain msgs)
  {
    QueryType oldQueryType = queryType;
    queryType = newQueryType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_OBJECT__QUERY_TYPE, oldQueryType, newQueryType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryType(QueryType newQueryType)
  {
    if (newQueryType != queryType)
    {
      NotificationChain msgs = null;
      if (queryType != null)
        msgs = ((InternalEObject)queryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_OBJECT__QUERY_TYPE, null, msgs);
      if (newQueryType != null)
        msgs = ((InternalEObject)newQueryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_OBJECT__QUERY_TYPE, null, msgs);
      msgs = basicSetQueryType(newQueryType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_OBJECT__QUERY_TYPE, newQueryType, newQueryType));
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
      case SearchPackage.QUERY_OBJECT__QUERY_TYPE:
        return basicSetQueryType(null, msgs);
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
      case SearchPackage.QUERY_OBJECT__QUERY_TYPE:
        return getQueryType();
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
      case SearchPackage.QUERY_OBJECT__QUERY_TYPE:
        setQueryType((QueryType)newValue);
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
      case SearchPackage.QUERY_OBJECT__QUERY_TYPE:
        setQueryType((QueryType)null);
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
      case SearchPackage.QUERY_OBJECT__QUERY_TYPE:
        return queryType != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryObjectImpl
