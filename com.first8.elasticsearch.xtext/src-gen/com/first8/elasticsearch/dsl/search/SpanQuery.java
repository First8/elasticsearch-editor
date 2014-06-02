/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanQuery#getSpanQuery <em>Span Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanQuery()
 * @model
 * @generated
 */
public interface SpanQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Query</em>' containment reference.
   * @see #setSpanQuery(SpanFirstQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanQuery_SpanQuery()
   * @model containment="true"
   * @generated
   */
  SpanFirstQuery getSpanQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanQuery#getSpanQuery <em>Span Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Query</em>' containment reference.
   * @see #getSpanQuery()
   * @generated
   */
  void setSpanQuery(SpanFirstQuery value);

} // SpanQuery
