/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Fuzzy Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleFuzzyQueryObject()
 * @model
 * @generated
 */
public interface SimpleFuzzyQueryObject extends FuzzyQuery
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleFuzzyQueryObject_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

} // SimpleFuzzyQueryObject
