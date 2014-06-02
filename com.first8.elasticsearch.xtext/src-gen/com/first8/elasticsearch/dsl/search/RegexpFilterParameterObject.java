/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regexp Filter Parameter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpFilterParameterObject()
 * @model
 * @generated
 */
public interface RegexpFilterParameterObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Regexp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regexp</em>' attribute.
   * @see #setRegexp(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpFilterParameterObject_Regexp()
   * @model
   * @generated
   */
  String getRegexp();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getRegexp <em>Regexp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regexp</em>' attribute.
   * @see #getRegexp()
   * @generated
   */
  void setRegexp(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpFilterParameterObject_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // RegexpFilterParameterObject
