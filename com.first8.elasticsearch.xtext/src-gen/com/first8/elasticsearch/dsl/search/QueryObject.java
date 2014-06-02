/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryObject#getQueryType <em>Query Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryObject()
 * @model
 * @generated
 */
public interface QueryObject extends FQuery
{
  /**
   * Returns the value of the '<em><b>Query Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Type</em>' containment reference.
   * @see #setQueryType(QueryType)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryObject_QueryType()
   * @model containment="true"
   * @generated
   */
  QueryType getQueryType();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryObject#getQueryType <em>Query Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Type</em>' containment reference.
   * @see #getQueryType()
   * @generated
   */
  void setQueryType(QueryType value);

} // QueryObject
