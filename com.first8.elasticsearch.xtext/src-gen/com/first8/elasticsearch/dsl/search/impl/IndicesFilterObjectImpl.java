/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.Filter;
import com.first8.elasticsearch.dsl.search.FilterObject;
import com.first8.elasticsearch.dsl.search.IndicesFilterObject;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indices Filter Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.IndicesFilterObjectImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.IndicesFilterObjectImpl#getNoMatchFilter <em>No Match Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicesFilterObjectImpl extends IndicesFilterImpl implements IndicesFilterObject
{
  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Filter filter;

  /**
   * The cached value of the '{@link #getNoMatchFilter() <em>No Match Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoMatchFilter()
   * @generated
   * @ordered
   */
  protected FilterObject noMatchFilter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndicesFilterObjectImpl()
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
    return SearchPackage.eINSTANCE.getIndicesFilterObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(Filter newFilter, NotificationChain msgs)
  {
    Filter oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_FILTER_OBJECT__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(Filter newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_FILTER_OBJECT__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_FILTER_OBJECT__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_FILTER_OBJECT__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterObject getNoMatchFilter()
  {
    return noMatchFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNoMatchFilter(FilterObject newNoMatchFilter, NotificationChain msgs)
  {
    FilterObject oldNoMatchFilter = noMatchFilter;
    noMatchFilter = newNoMatchFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER, oldNoMatchFilter, newNoMatchFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoMatchFilter(FilterObject newNoMatchFilter)
  {
    if (newNoMatchFilter != noMatchFilter)
    {
      NotificationChain msgs = null;
      if (noMatchFilter != null)
        msgs = ((InternalEObject)noMatchFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER, null, msgs);
      if (newNoMatchFilter != null)
        msgs = ((InternalEObject)newNoMatchFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER, null, msgs);
      msgs = basicSetNoMatchFilter(newNoMatchFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER, newNoMatchFilter, newNoMatchFilter));
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
      case SearchPackage.INDICES_FILTER_OBJECT__FILTER:
        return basicSetFilter(null, msgs);
      case SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER:
        return basicSetNoMatchFilter(null, msgs);
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
      case SearchPackage.INDICES_FILTER_OBJECT__FILTER:
        return getFilter();
      case SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER:
        return getNoMatchFilter();
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
      case SearchPackage.INDICES_FILTER_OBJECT__FILTER:
        setFilter((Filter)newValue);
        return;
      case SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER:
        setNoMatchFilter((FilterObject)newValue);
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
      case SearchPackage.INDICES_FILTER_OBJECT__FILTER:
        setFilter((Filter)null);
        return;
      case SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER:
        setNoMatchFilter((FilterObject)null);
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
      case SearchPackage.INDICES_FILTER_OBJECT__FILTER:
        return filter != null;
      case SearchPackage.INDICES_FILTER_OBJECT__NO_MATCH_FILTER:
        return noMatchFilter != null;
    }
    return super.eIsSet(featureID);
  }

} //IndicesFilterObjectImpl
