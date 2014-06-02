/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Filter Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.OrFilterArray#getSubQuery <em>Sub Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getOrFilterArray()
 * @model
 * @generated
 */
public interface OrFilterArray extends OrFilter
{
  /**
   * Returns the value of the '<em><b>Sub Query</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.QueryObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Query</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Query</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getOrFilterArray_SubQuery()
   * @model containment="true"
   * @generated
   */
  EList<QueryObject> getSubQuery();

} // OrFilterArray
