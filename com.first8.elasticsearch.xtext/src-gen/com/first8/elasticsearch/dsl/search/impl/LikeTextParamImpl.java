/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.LikeTextParam;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Like Text Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LikeTextParamImpl#getLikeQuery <em>Like Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.LikeTextParamImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LikeTextParamImpl extends FuzzyLikeThisQueryObjectImpl implements LikeTextParam
{
  /**
   * The default value of the '{@link #getLikeQuery() <em>Like Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikeQuery()
   * @generated
   * @ordered
   */
  protected static final String LIKE_QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLikeQuery() <em>Like Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikeQuery()
   * @generated
   * @ordered
   */
  protected String likeQuery = LIKE_QUERY_EDEFAULT;

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
  protected LikeTextParamImpl()
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
    return SearchPackage.eINSTANCE.getLikeTextParam();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLikeQuery()
  {
    return likeQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLikeQuery(String newLikeQuery)
  {
    String oldLikeQuery = likeQuery;
    likeQuery = newLikeQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.LIKE_TEXT_PARAM__LIKE_QUERY, oldLikeQuery, likeQuery));
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
      params = new EDataTypeEList<String>(String.class, this, SearchPackage.LIKE_TEXT_PARAM__PARAMS);
    }
    return params;
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
      case SearchPackage.LIKE_TEXT_PARAM__LIKE_QUERY:
        return getLikeQuery();
      case SearchPackage.LIKE_TEXT_PARAM__PARAMS:
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
      case SearchPackage.LIKE_TEXT_PARAM__LIKE_QUERY:
        setLikeQuery((String)newValue);
        return;
      case SearchPackage.LIKE_TEXT_PARAM__PARAMS:
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
      case SearchPackage.LIKE_TEXT_PARAM__LIKE_QUERY:
        setLikeQuery(LIKE_QUERY_EDEFAULT);
        return;
      case SearchPackage.LIKE_TEXT_PARAM__PARAMS:
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
      case SearchPackage.LIKE_TEXT_PARAM__LIKE_QUERY:
        return LIKE_QUERY_EDEFAULT == null ? likeQuery != null : !LIKE_QUERY_EDEFAULT.equals(likeQuery);
      case SearchPackage.LIKE_TEXT_PARAM__PARAMS:
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
    result.append(" (likeQuery: ");
    result.append(likeQuery);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //LikeTextParamImpl
