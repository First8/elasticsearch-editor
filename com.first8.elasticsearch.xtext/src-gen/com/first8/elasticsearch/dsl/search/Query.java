/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Query#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends QueryFacet, ConstantScoreQueryObject, NestedQueryObject, NotFilterObject, QueryFilter
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(QueryObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQuery_Query()
   * @model containment="true"
   * @generated
   */
  QueryObject getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Query#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(QueryObject value);

} // Query
