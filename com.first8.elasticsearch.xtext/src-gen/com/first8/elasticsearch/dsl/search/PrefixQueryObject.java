/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.PrefixQueryObject#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getPrefixQueryObject()
 * @model
 * @generated
 */
public interface PrefixQueryObject extends PrefixQuery
{
  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(PrefixQueryParameterObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getPrefixQueryObject_Prefix()
   * @model containment="true"
   * @generated
   */
  PrefixQueryParameterObject getPrefix();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.PrefixQueryObject#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(PrefixQueryParameterObject value);

} // PrefixQueryObject
