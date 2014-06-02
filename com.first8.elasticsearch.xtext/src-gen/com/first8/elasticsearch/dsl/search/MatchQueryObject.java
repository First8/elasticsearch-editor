/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.MatchQueryObject#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getMatchQueryObject()
 * @model
 * @generated
 */
public interface MatchQueryObject extends MatchQuery
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(MatchQueryParametersObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getMatchQueryObject_Parameters()
   * @model containment="true"
   * @generated
   */
  MatchQueryParametersObject getParameters();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.MatchQueryObject#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(MatchQueryParametersObject value);

} // MatchQueryObject
