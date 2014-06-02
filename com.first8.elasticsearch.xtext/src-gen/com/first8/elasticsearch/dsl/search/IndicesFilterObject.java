/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indices Filter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject#getNoMatchFilter <em>No Match Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getIndicesFilterObject()
 * @model
 * @generated
 */
public interface IndicesFilterObject extends IndicesFilter
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
   * @see #setFilter(Filter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getIndicesFilterObject_Filter()
   * @model containment="true"
   * @generated
   */
  Filter getFilter();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Filter value);

  /**
   * Returns the value of the '<em><b>No Match Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Match Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Match Filter</em>' containment reference.
   * @see #setNoMatchFilter(FilterObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getIndicesFilterObject_NoMatchFilter()
   * @model containment="true"
   * @generated
   */
  FilterObject getNoMatchFilter();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject#getNoMatchFilter <em>No Match Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Match Filter</em>' containment reference.
   * @see #getNoMatchFilter()
   * @generated
   */
  void setNoMatchFilter(FilterObject value);

} // IndicesFilterObject
