/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.CommonQueryObject#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.CommonQueryObject#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getCommonQueryObject()
 * @model
 * @generated
 */
public interface CommonQueryObject extends CommonQuery
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getCommonQueryObject_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.CommonQueryObject#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(CommonQueryParametersObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getCommonQueryObject_Parameters()
   * @model containment="true"
   * @generated
   */
  CommonQueryParametersObject getParameters();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.CommonQueryObject#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(CommonQueryParametersObject value);

} // CommonQueryObject
