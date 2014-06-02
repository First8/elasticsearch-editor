/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Not Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getIncludeQuery <em>Include Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getExcludeQuery <em>Exclude Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNotQueryObject()
 * @model
 * @generated
 */
public interface SpanNotQueryObject extends SpanNotQuery
{
  /**
   * Returns the value of the '<em><b>Include Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Query</em>' containment reference.
   * @see #setIncludeQuery(SpanQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNotQueryObject_IncludeQuery()
   * @model containment="true"
   * @generated
   */
  SpanQuery getIncludeQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getIncludeQuery <em>Include Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Query</em>' containment reference.
   * @see #getIncludeQuery()
   * @generated
   */
  void setIncludeQuery(SpanQuery value);

  /**
   * Returns the value of the '<em><b>Exclude Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Query</em>' containment reference.
   * @see #setExcludeQuery(SpanQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNotQueryObject_ExcludeQuery()
   * @model containment="true"
   * @generated
   */
  SpanQuery getExcludeQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getExcludeQuery <em>Exclude Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Query</em>' containment reference.
   * @see #getExcludeQuery()
   * @generated
   */
  void setExcludeQuery(SpanQuery value);

} // SpanNotQueryObject
