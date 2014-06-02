/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.AllTermsParam;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Terms Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.AllTermsParamImpl#getAllTerms <em>All Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllTermsParamImpl extends MinimalEObjectImpl.Container implements AllTermsParam
{
  /**
   * The default value of the '{@link #getAllTerms() <em>All Terms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllTerms()
   * @generated
   * @ordered
   */
  protected static final String ALL_TERMS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllTerms() <em>All Terms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllTerms()
   * @generated
   * @ordered
   */
  protected String allTerms = ALL_TERMS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllTermsParamImpl()
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
    return SearchPackage.eINSTANCE.getAllTermsParam();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAllTerms()
  {
    return allTerms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllTerms(String newAllTerms)
  {
    String oldAllTerms = allTerms;
    allTerms = newAllTerms;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.ALL_TERMS_PARAM__ALL_TERMS, oldAllTerms, allTerms));
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
      case SearchPackage.ALL_TERMS_PARAM__ALL_TERMS:
        return getAllTerms();
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
      case SearchPackage.ALL_TERMS_PARAM__ALL_TERMS:
        setAllTerms((String)newValue);
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
      case SearchPackage.ALL_TERMS_PARAM__ALL_TERMS:
        setAllTerms(ALL_TERMS_EDEFAULT);
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
      case SearchPackage.ALL_TERMS_PARAM__ALL_TERMS:
        return ALL_TERMS_EDEFAULT == null ? allTerms != null : !ALL_TERMS_EDEFAULT.equals(allTerms);
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
    result.append(" (allTerms: ");
    result.append(allTerms);
    result.append(')');
    return result.toString();
  }

} //AllTermsParamImpl
