/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.ExcludeParam;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclude Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.ExcludeParamImpl#getExcludeFieldNames <em>Exclude Field Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExcludeParamImpl extends MinimalEObjectImpl.Container implements ExcludeParam
{
  /**
   * The cached value of the '{@link #getExcludeFieldNames() <em>Exclude Field Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeFieldNames()
   * @generated
   * @ordered
   */
  protected EList<String> excludeFieldNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExcludeParamImpl()
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
    return SearchPackage.eINSTANCE.getExcludeParam();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExcludeFieldNames()
  {
    if (excludeFieldNames == null)
    {
      excludeFieldNames = new EDataTypeEList<String>(String.class, this, SearchPackage.EXCLUDE_PARAM__EXCLUDE_FIELD_NAMES);
    }
    return excludeFieldNames;
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
      case SearchPackage.EXCLUDE_PARAM__EXCLUDE_FIELD_NAMES:
        return getExcludeFieldNames();
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
      case SearchPackage.EXCLUDE_PARAM__EXCLUDE_FIELD_NAMES:
        getExcludeFieldNames().clear();
        getExcludeFieldNames().addAll((Collection<? extends String>)newValue);
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
      case SearchPackage.EXCLUDE_PARAM__EXCLUDE_FIELD_NAMES:
        getExcludeFieldNames().clear();
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
      case SearchPackage.EXCLUDE_PARAM__EXCLUDE_FIELD_NAMES:
        return excludeFieldNames != null && !excludeFieldNames.isEmpty();
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
    result.append(" (excludeFieldNames: ");
    result.append(excludeFieldNames);
    result.append(')');
    return result.toString();
  }

} //ExcludeParamImpl
