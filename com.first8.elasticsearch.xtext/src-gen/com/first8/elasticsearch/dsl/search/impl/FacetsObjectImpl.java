/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.FacetParameter;
import com.first8.elasticsearch.dsl.search.FacetTypeObject;
import com.first8.elasticsearch.dsl.search.FacetsObject;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facets Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetsObjectImpl#getFacetName <em>Facet Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetsObjectImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetsObjectImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetsObjectImpl extends FacetsImpl implements FacetsObject
{
  /**
   * The default value of the '{@link #getFacetName() <em>Facet Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetName()
   * @generated
   * @ordered
   */
  protected static final String FACET_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFacetName() <em>Facet Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetName()
   * @generated
   * @ordered
   */
  protected String facetName = FACET_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected FacetTypeObject config;

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
  protected FacetsObjectImpl()
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
    return SearchPackage.eINSTANCE.getFacetsObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFacetName()
  {
    return facetName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacetName(String newFacetName)
  {
    String oldFacetName = facetName;
    facetName = newFacetName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FACETS_OBJECT__FACET_NAME, oldFacetName, facetName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetTypeObject getConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfig(FacetTypeObject newConfig, NotificationChain msgs)
  {
    FacetTypeObject oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FACETS_OBJECT__CONFIG, oldConfig, newConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(FacetTypeObject newConfig)
  {
    if (newConfig != config)
    {
      NotificationChain msgs = null;
      if (config != null)
        msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FACETS_OBJECT__CONFIG, null, msgs);
      if (newConfig != null)
        msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FACETS_OBJECT__CONFIG, null, msgs);
      msgs = basicSetConfig(newConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FACETS_OBJECT__CONFIG, newConfig, newConfig));
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
      params = new EObjectContainmentEList<FacetParameter>(FacetParameter.class, this, SearchPackage.FACETS_OBJECT__PARAMS);
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
      case SearchPackage.FACETS_OBJECT__CONFIG:
        return basicSetConfig(null, msgs);
      case SearchPackage.FACETS_OBJECT__PARAMS:
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
      case SearchPackage.FACETS_OBJECT__FACET_NAME:
        return getFacetName();
      case SearchPackage.FACETS_OBJECT__CONFIG:
        return getConfig();
      case SearchPackage.FACETS_OBJECT__PARAMS:
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
      case SearchPackage.FACETS_OBJECT__FACET_NAME:
        setFacetName((String)newValue);
        return;
      case SearchPackage.FACETS_OBJECT__CONFIG:
        setConfig((FacetTypeObject)newValue);
        return;
      case SearchPackage.FACETS_OBJECT__PARAMS:
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
      case SearchPackage.FACETS_OBJECT__FACET_NAME:
        setFacetName(FACET_NAME_EDEFAULT);
        return;
      case SearchPackage.FACETS_OBJECT__CONFIG:
        setConfig((FacetTypeObject)null);
        return;
      case SearchPackage.FACETS_OBJECT__PARAMS:
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
      case SearchPackage.FACETS_OBJECT__FACET_NAME:
        return FACET_NAME_EDEFAULT == null ? facetName != null : !FACET_NAME_EDEFAULT.equals(facetName);
      case SearchPackage.FACETS_OBJECT__CONFIG:
        return config != null;
      case SearchPackage.FACETS_OBJECT__PARAMS:
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
    result.append(" (facetName: ");
    result.append(facetName);
    result.append(')');
    return result.toString();
  }

} //FacetsObjectImpl
