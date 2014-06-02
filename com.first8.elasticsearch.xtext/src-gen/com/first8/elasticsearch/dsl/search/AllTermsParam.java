/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Terms Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.AllTermsParam#getAllTerms <em>All Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getAllTermsParam()
 * @model
 * @generated
 */
public interface AllTermsParam extends EObject
{
  /**
   * Returns the value of the '<em><b>All Terms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Terms</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Terms</em>' attribute.
   * @see #setAllTerms(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getAllTermsParam_AllTerms()
   * @model
   * @generated
   */
  String getAllTerms();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.AllTermsParam#getAllTerms <em>All Terms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Terms</em>' attribute.
   * @see #getAllTerms()
   * @generated
   */
  void setAllTerms(String value);

} // AllTermsParam
