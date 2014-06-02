/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObject#getQ <em>Q</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFuzzyQueryObject()
 * @model
 * @generated
 */
public interface FuzzyQueryObject extends FuzzyQuery
{
  /**
   * Returns the value of the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Q</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' containment reference.
   * @see #setQ(FuzzyQueryObjectParameters)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFuzzyQueryObject_Q()
   * @model containment="true"
   * @generated
   */
  FuzzyQueryObjectParameters getQ();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObject#getQ <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' containment reference.
   * @see #getQ()
   * @generated
   */
  void setQ(FuzzyQueryObjectParameters value);

} // FuzzyQueryObject
