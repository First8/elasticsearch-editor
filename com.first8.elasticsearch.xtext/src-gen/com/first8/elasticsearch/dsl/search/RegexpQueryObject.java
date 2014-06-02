/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regexp Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpQueryObject()
 * @model
 * @generated
 */
public interface RegexpQueryObject extends RegexpQuery
{
  /**
   * Returns the value of the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Name</em>' attribute.
   * @see #setFieldName(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpQueryObject_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpQueryObject_Regexp()
   * @model
   * @generated
   */
  String getRegexp();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getRegexp <em>Regexp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regexp</em>' attribute.
   * @see #getRegexp()
   * @generated
   */
  void setRegexp(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(RegexpQueryParameterObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getRegexpQueryObject_Params()
   * @model containment="true"
   * @generated
   */
  RegexpQueryParameterObject getParams();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(RegexpQueryParameterObject value);

} // RegexpQueryObject
