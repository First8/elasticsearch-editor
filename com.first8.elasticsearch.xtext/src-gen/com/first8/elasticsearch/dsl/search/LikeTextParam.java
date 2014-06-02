/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Like Text Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LikeTextParam#getLikeQuery <em>Like Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LikeTextParam#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLikeTextParam()
 * @model
 * @generated
 */
public interface LikeTextParam extends FuzzyLikeThisQueryObject, MoreLikeThisQueryObject
{
  /**
   * Returns the value of the '<em><b>Like Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Like Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Like Query</em>' attribute.
   * @see #setLikeQuery(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLikeTextParam_LikeQuery()
   * @model
   * @generated
   */
  String getLikeQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LikeTextParam#getLikeQuery <em>Like Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Like Query</em>' attribute.
   * @see #getLikeQuery()
   * @generated
   */
  void setLikeQuery(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLikeTextParam_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // LikeTextParam
