/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.TermQueryParametersObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Query Parameters Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermQueryParametersObjectImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermQueryParametersObjectImpl#getBoost <em>Boost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermQueryParametersObjectImpl extends MinimalEObjectImpl.Container implements TermQueryParametersObject
{
  /**
   * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected static final String TERM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected String term = TERM_EDEFAULT;

  /**
   * The default value of the '{@link #getBoost() <em>Boost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoost()
   * @generated
   * @ordered
   */
  protected static final String BOOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoost() <em>Boost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoost()
   * @generated
   * @ordered
   */
  protected String boost = BOOST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermQueryParametersObjectImpl()
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
    return SearchPackage.eINSTANCE.getTermQueryParametersObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(String newTerm)
  {
    String oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__TERM, oldTerm, term));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoost()
  {
    return boost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoost(String newBoost)
  {
    String oldBoost = boost;
    boost = newBoost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__BOOST, oldBoost, boost));
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
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__TERM:
        return getTerm();
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__BOOST:
        return getBoost();
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
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__TERM:
        setTerm((String)newValue);
        return;
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__BOOST:
        setBoost((String)newValue);
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
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__TERM:
        setTerm(TERM_EDEFAULT);
        return;
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__BOOST:
        setBoost(BOOST_EDEFAULT);
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
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__TERM:
        return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT__BOOST:
        return BOOST_EDEFAULT == null ? boost != null : !BOOST_EDEFAULT.equals(boost);
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
    result.append(" (term: ");
    result.append(term);
    result.append(", boost: ");
    result.append(boost);
    result.append(')');
    return result.toString();
  }

} //TermQueryParametersObjectImpl
