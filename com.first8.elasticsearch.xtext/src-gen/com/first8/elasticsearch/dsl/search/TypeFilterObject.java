/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Filter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TypeFilterObject#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTypeFilterObject()
 * @model
 * @generated
 */
public interface TypeFilterObject extends TypeFilter
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTypeFilterObject_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TypeFilterObject#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // TypeFilterObject
