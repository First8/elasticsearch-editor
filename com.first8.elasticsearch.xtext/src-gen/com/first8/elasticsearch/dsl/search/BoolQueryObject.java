/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.BoolQueryObject#getClause <em>Clause</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.BoolQueryObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolQueryObject()
 * @model
 * @generated
 */
public interface BoolQueryObject extends BoolQuery
{
  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.BoolClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolQueryObject_Clause()
   * @model containment="true"
   * @generated
   */
  EList<BoolClause> getClause();

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolQueryObject_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // BoolQueryObject
