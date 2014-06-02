/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indices Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject#getNoMatchQuery <em>No Match Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getIndicesQueryObject()
 * @model
 * @generated
 */
public interface IndicesQueryObject extends IndicesQuery
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
   * @see #setQuery(Query)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getIndicesQueryObject_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>No Match Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Match Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Match Query</em>' containment reference.
   * @see #setNoMatchQuery(QueryObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getIndicesQueryObject_NoMatchQuery()
   * @model containment="true"
   * @generated
   */
  QueryObject getNoMatchQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject#getNoMatchQuery <em>No Match Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Match Query</em>' containment reference.
   * @see #getNoMatchQuery()
   * @generated
   */
  void setNoMatchQuery(QueryObject value);

} // IndicesQueryObject
