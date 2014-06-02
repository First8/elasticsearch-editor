/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Query String Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleQueryStringQueryObject()
 * @model
 * @generated
 */
public interface SimpleQueryStringQueryObject extends SimpleQueryStringQuery
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleQueryStringQueryObject_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleQueryStringQueryObject_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // SimpleQueryStringQueryObject
