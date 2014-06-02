/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.Filter;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SimpleAndFilterArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple And Filter Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SimpleAndFilterArrayImpl#getSubFilter <em>Sub Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleAndFilterArrayImpl extends AndFilterImpl implements SimpleAndFilterArray
{
  /**
   * The cached value of the '{@link #getSubFilter() <em>Sub Filter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubFilter()
   * @generated
   * @ordered
   */
  protected EList<Filter> subFilter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleAndFilterArrayImpl()
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
    return SearchPackage.eINSTANCE.getSimpleAndFilterArray();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Filter> getSubFilter()
  {
    if (subFilter == null)
    {
      subFilter = new EObjectContainmentEList<Filter>(Filter.class, this, SearchPackage.SIMPLE_AND_FILTER_ARRAY__SUB_FILTER);
    }
    return subFilter;
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
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY__SUB_FILTER:
        return ((InternalEList<?>)getSubFilter()).basicRemove(otherEnd, msgs);
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
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY__SUB_FILTER:
        return getSubFilter();
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
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY__SUB_FILTER:
        getSubFilter().clear();
        getSubFilter().addAll((Collection<? extends Filter>)newValue);
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
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY__SUB_FILTER:
        getSubFilter().clear();
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
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY__SUB_FILTER:
        return subFilter != null && !subFilter.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleAndFilterArrayImpl
