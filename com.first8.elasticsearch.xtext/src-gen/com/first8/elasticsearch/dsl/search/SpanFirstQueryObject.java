/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span First Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanFirstQueryObject#getSubquery <em>Subquery</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanFirstQueryObject()
 * @model
 * @generated
 */
public interface SpanFirstQueryObject extends SpanFirstQuery
{
  /**
   * Returns the value of the '<em><b>Subquery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subquery</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subquery</em>' containment reference.
   * @see #setSubquery(SpanQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanFirstQueryObject_Subquery()
   * @model containment="true"
   * @generated
   */
  SpanQuery getSubquery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanFirstQueryObject#getSubquery <em>Subquery</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subquery</em>' containment reference.
   * @see #getSubquery()
   * @generated
   */
  void setSubquery(SpanQuery value);

} // SpanFirstQueryObject
