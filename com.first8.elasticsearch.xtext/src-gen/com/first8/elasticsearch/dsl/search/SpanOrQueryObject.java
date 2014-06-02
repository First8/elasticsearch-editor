/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Or Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanOrQueryObject#getClauses <em>Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanOrQueryObject()
 * @model
 * @generated
 */
public interface SpanOrQueryObject extends SpanOrQuery
{
  /**
   * Returns the value of the '<em><b>Clauses</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.SpanQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clauses</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanOrQueryObject_Clauses()
   * @model containment="true"
   * @generated
   */
  EList<SpanQuery> getClauses();

} // SpanOrQueryObject
