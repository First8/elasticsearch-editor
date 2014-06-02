/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Children Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getChildType <em>Child Type</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTopChildrenQueryObject()
 * @model
 * @generated
 */
public interface TopChildrenQueryObject extends TopChildrenQuery
{
  /**
   * Returns the value of the '<em><b>Child Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child Type</em>' attribute.
   * @see #setChildType(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTopChildrenQueryObject_ChildType()
   * @model
   * @generated
   */
  String getChildType();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getChildType <em>Child Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child Type</em>' attribute.
   * @see #getChildType()
   * @generated
   */
  void setChildType(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Query)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTopChildrenQueryObject_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTopChildrenQueryObject_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // TopChildrenQueryObject
