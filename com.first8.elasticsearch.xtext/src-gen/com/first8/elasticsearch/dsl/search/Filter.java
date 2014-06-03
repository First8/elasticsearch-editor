/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Filter#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends FilterFacet, ConstantScoreQueryObject
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilter_Filter()
   * @model containment="true"
   * @generated
   */
  FilterObject getFilter();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Filter#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(FilterObject value);

} // Filter
