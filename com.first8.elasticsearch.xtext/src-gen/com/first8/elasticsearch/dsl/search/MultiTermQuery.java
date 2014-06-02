/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Term Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.MultiTermQuery#getMultiTermQuery <em>Multi Term Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getMultiTermQuery()
 * @model
 * @generated
 */
public interface MultiTermQuery extends SpanMultiQueryObject
{
  /**
   * Returns the value of the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Term Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi Term Query</em>' containment reference.
   * @see #setMultiTermQuery(FuzzyQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getMultiTermQuery_MultiTermQuery()
   * @model containment="true"
   * @generated
   */
  FuzzyQuery getMultiTermQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.MultiTermQuery#getMultiTermQuery <em>Multi Term Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi Term Query</em>' containment reference.
   * @see #getMultiTermQuery()
   * @generated
   */
  void setMultiTermQuery(FuzzyQuery value);

} // MultiTermQuery
