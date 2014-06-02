/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Query Parameters Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getTerm <em>Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getBoost <em>Boost</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermQueryParametersObject()
 * @model
 * @generated
 */
public interface TermQueryParametersObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' attribute.
   * @see #setTerm(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermQueryParametersObject_Term()
   * @model
   * @generated
   */
  String getTerm();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getTerm <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' attribute.
   * @see #getTerm()
   * @generated
   */
  void setTerm(String value);

  /**
   * Returns the value of the '<em><b>Boost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boost</em>' attribute.
   * @see #setBoost(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermQueryParametersObject_Boost()
   * @model
   * @generated
   */
  String getBoost();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getBoost <em>Boost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boost</em>' attribute.
   * @see #getBoost()
   * @generated
   */
  void setBoost(String value);

} // TermQueryParametersObject
