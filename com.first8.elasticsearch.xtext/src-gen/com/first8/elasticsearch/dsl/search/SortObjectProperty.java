/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getOrder <em>Order</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getSortMode <em>Sort Mode</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getMissing <em>Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObjectProperty()
 * @model
 * @generated
 */
public interface SortObjectProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(ASC_DESC)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObjectProperty_Order()
   * @model containment="true"
   * @generated
   */
  ASC_DESC getOrder();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(ASC_DESC value);

  /**
   * Returns the value of the '<em><b>Sort Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Mode</em>' containment reference.
   * @see #setSortMode(SORT_MODE)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObjectProperty_SortMode()
   * @model containment="true"
   * @generated
   */
  SORT_MODE getSortMode();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getSortMode <em>Sort Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Mode</em>' containment reference.
   * @see #getSortMode()
   * @generated
   */
  void setSortMode(SORT_MODE value);

  /**
   * Returns the value of the '<em><b>Missing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Missing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missing</em>' attribute.
   * @see #setMissing(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObjectProperty_Missing()
   * @model
   * @generated
   */
  String getMissing();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getMissing <em>Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Missing</em>' attribute.
   * @see #getMissing()
   * @generated
   */
  void setMissing(String value);

} // SortObjectProperty
