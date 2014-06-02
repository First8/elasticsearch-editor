/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Near Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getClauses <em>Clauses</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getSlop <em>Slop</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getInOrder <em>In Order</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getCollectPayloads <em>Collect Payloads</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNearQueryObject()
 * @model
 * @generated
 */
public interface SpanNearQueryObject extends SpanNearQuery
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNearQueryObject_Clauses()
   * @model containment="true"
   * @generated
   */
  EList<SpanQuery> getClauses();

  /**
   * Returns the value of the '<em><b>Slop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slop</em>' attribute.
   * @see #setSlop(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNearQueryObject_Slop()
   * @model
   * @generated
   */
  String getSlop();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getSlop <em>Slop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slop</em>' attribute.
   * @see #getSlop()
   * @generated
   */
  void setSlop(String value);

  /**
   * Returns the value of the '<em><b>In Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Order</em>' attribute.
   * @see #setInOrder(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNearQueryObject_InOrder()
   * @model
   * @generated
   */
  String getInOrder();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getInOrder <em>In Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Order</em>' attribute.
   * @see #getInOrder()
   * @generated
   */
  void setInOrder(String value);

  /**
   * Returns the value of the '<em><b>Collect Payloads</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collect Payloads</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collect Payloads</em>' attribute.
   * @see #setCollectPayloads(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSpanNearQueryObject_CollectPayloads()
   * @model
   * @generated
   */
  String getCollectPayloads();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getCollectPayloads <em>Collect Payloads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collect Payloads</em>' attribute.
   * @see #getCollectPayloads()
   * @generated
   */
  void setCollectPayloads(String value);

} // SpanNearQueryObject
