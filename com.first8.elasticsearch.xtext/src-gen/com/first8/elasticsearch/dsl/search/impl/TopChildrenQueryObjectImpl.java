/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.Query;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.TopChildrenQueryObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Children Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryObjectImpl#getChildType <em>Child Type</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryObjectImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryObjectImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopChildrenQueryObjectImpl extends TopChildrenQueryImpl implements TopChildrenQueryObject
{
  /**
   * The default value of the '{@link #getChildType() <em>Child Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildType()
   * @generated
   * @ordered
   */
  protected static final String CHILD_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChildType() <em>Child Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildType()
   * @generated
   * @ordered
   */
  protected String childType = CHILD_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopChildrenQueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getTopChildrenQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChildType()
  {
    return childType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildType(String newChildType)
  {
    String oldChildType = childType;
    childType = newChildType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TOP_CHILDREN_QUERY_OBJECT__CHILD_TYPE, oldChildType, childType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY, oldQuery, newQuery);
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
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, SearchPackage.TOP_CHILDREN_QUERY_OBJECT__PARAMS);
    }
    return params;
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
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY:
        return basicSetQuery(null, msgs);
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
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__CHILD_TYPE:
        return getChildType();
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY:
        return getQuery();
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__CHILD_TYPE:
        setChildType((String)newValue);
        return;
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY:
        setQuery((Query)newValue);
        return;
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
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
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__CHILD_TYPE:
        setChildType(CHILD_TYPE_EDEFAULT);
        return;
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY:
        setQuery((Query)null);
        return;
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__PARAMS:
        getParams().clear();
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
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__CHILD_TYPE:
        return CHILD_TYPE_EDEFAULT == null ? childType != null : !CHILD_TYPE_EDEFAULT.equals(childType);
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__QUERY:
        return query != null;
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (childType: ");
    result.append(childType);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //TopChildrenQueryObjectImpl
