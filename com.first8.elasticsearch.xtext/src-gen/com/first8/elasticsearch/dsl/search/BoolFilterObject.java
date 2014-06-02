/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Filter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.BoolFilterObject#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolFilterObject()
 * @model
 * @generated
 */
public interface BoolFilterObject extends BoolFilter
{
  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.BoolFilterClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolFilterObject_Clause()
   * @model containment="true"
   * @generated
   */
  EList<BoolFilterClause> getClause();

} // BoolFilterObject
