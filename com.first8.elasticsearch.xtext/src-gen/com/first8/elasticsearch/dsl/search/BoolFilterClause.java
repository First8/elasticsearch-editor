/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Filter Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.BoolFilterClause#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolFilterClause()
 * @model
 * @generated
 */
public interface BoolFilterClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(FilterObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoolFilterClause_Filter()
   * @model containment="true"
   * @generated
   */
  FilterObject getFilter();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.BoolFilterClause#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(FilterObject value);

} // BoolFilterClause
