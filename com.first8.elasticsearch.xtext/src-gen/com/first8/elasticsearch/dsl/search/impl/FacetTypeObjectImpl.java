/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.FacetParameter;
import com.first8.elasticsearch.dsl.search.FacetType;
import com.first8.elasticsearch.dsl.search.FacetTypeObject;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetTypeObjectImpl#getFacetType <em>Facet Type</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetTypeObjectImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetTypeObjectImpl extends MinimalEObjectImpl.Container implements FacetTypeObject
{
  /**
   * The cached value of the '{@link #getFacetType() <em>Facet Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetType()
   * @generated
   * @ordered
   */
  protected FacetType facetType;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<FacetParameter> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetTypeObjectImpl()
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
    return SearchPackage.eINSTANCE.getFacetTypeObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetType getFacetType()
  {
    return facetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetType(FacetType newFacetType, NotificationChain msgs)
  {
    FacetType oldFacetType = facetType;
    facetType = newFacetType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE, oldFacetType, newFacetType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacetType(FacetType newFacetType)
  {
    if (newFacetType != facetType)
    {
      NotificationChain msgs = null;
      if (facetType != null)
        msgs = ((InternalEObject)facetType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE, null, msgs);
      if (newFacetType != null)
        msgs = ((InternalEObject)newFacetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE, null, msgs);
      msgs = basicSetFacetType(newFacetType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE, newFacetType, newFacetType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FacetParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<FacetParameter>(FacetParameter.class, this, SearchPackage.FACET_TYPE_OBJECT__PARAMS);
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
      case SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE:
        return basicSetFacetType(null, msgs);
      case SearchPackage.FACET_TYPE_OBJECT__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE:
        return getFacetType();
      case SearchPackage.FACET_TYPE_OBJECT__PARAMS:
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
      case SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE:
        setFacetType((FacetType)newValue);
        return;
      case SearchPackage.FACET_TYPE_OBJECT__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends FacetParameter>)newValue);
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
      case SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE:
        setFacetType((FacetType)null);
        return;
      case SearchPackage.FACET_TYPE_OBJECT__PARAMS:
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
      case SearchPackage.FACET_TYPE_OBJECT__FACET_TYPE:
        return facetType != null;
      case SearchPackage.FACET_TYPE_OBJECT__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FacetTypeObjectImpl
