/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.FacetFilterParam;
import com.first8.elasticsearch.dsl.search.FacetParameter;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetParameterImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FacetParameterImpl#getFaceFilter <em>Face Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetParameterImpl extends MinimalEObjectImpl.Container implements FacetParameter
{
  /**
   * The default value of the '{@link #getGlobal() <em>Global</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobal()
   * @generated
   * @ordered
   */
  protected static final String GLOBAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGlobal() <em>Global</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobal()
   * @generated
   * @ordered
   */
  protected String global = GLOBAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getFaceFilter() <em>Face Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFaceFilter()
   * @generated
   * @ordered
   */
  protected FacetFilterParam faceFilter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetParameterImpl()
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
    return SearchPackage.eINSTANCE.getFacetParameter();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGlobal()
  {
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGlobal(String newGlobal)
  {
    String oldGlobal = global;
    global = newGlobal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FACET_PARAMETER__GLOBAL, oldGlobal, global));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetFilterParam getFaceFilter()
  {
    return faceFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFaceFilter(FacetFilterParam newFaceFilter, NotificationChain msgs)
  {
    FacetFilterParam oldFaceFilter = faceFilter;
    faceFilter = newFaceFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FACET_PARAMETER__FACE_FILTER, oldFaceFilter, newFaceFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFaceFilter(FacetFilterParam newFaceFilter)
  {
    if (newFaceFilter != faceFilter)
    {
      NotificationChain msgs = null;
      if (faceFilter != null)
        msgs = ((InternalEObject)faceFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FACET_PARAMETER__FACE_FILTER, null, msgs);
      if (newFaceFilter != null)
        msgs = ((InternalEObject)newFaceFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FACET_PARAMETER__FACE_FILTER, null, msgs);
      msgs = basicSetFaceFilter(newFaceFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FACET_PARAMETER__FACE_FILTER, newFaceFilter, newFaceFilter));
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
      case SearchPackage.FACET_PARAMETER__FACE_FILTER:
        return basicSetFaceFilter(null, msgs);
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
      case SearchPackage.FACET_PARAMETER__GLOBAL:
        return getGlobal();
      case SearchPackage.FACET_PARAMETER__FACE_FILTER:
        return getFaceFilter();
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
      case SearchPackage.FACET_PARAMETER__GLOBAL:
        setGlobal((String)newValue);
        return;
      case SearchPackage.FACET_PARAMETER__FACE_FILTER:
        setFaceFilter((FacetFilterParam)newValue);
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
      case SearchPackage.FACET_PARAMETER__GLOBAL:
        setGlobal(GLOBAL_EDEFAULT);
        return;
      case SearchPackage.FACET_PARAMETER__FACE_FILTER:
        setFaceFilter((FacetFilterParam)null);
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
      case SearchPackage.FACET_PARAMETER__GLOBAL:
        return GLOBAL_EDEFAULT == null ? global != null : !GLOBAL_EDEFAULT.equals(global);
      case SearchPackage.FACET_PARAMETER__FACE_FILTER:
        return faceFilter != null;
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
    result.append(" (global: ");
    result.append(global);
    result.append(')');
    return result.toString();
  }

} //FacetParameterImpl
