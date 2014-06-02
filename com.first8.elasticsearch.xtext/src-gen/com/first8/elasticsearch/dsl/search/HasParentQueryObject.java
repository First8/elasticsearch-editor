/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Parent Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHasParentQueryObject()
 * @model
 * @generated
 */
public interface HasParentQueryObject extends HasParentQuery
{
  /**
   * Returns the value of the '<em><b>Parent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Type</em>' attribute.
   * @see #setParentType(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHasParentQueryObject_ParentType()
   * @model
   * @generated
   */
  String getParentType();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getParentType <em>Parent Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Type</em>' attribute.
   * @see #getParentType()
   * @generated
   */
  void setParentType(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHasParentQueryObject_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(Filter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHasParentQueryObject_Filter()
   * @model containment="true"
   * @generated
   */
  Filter getFilter();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Filter value);

} // HasParentQueryObject
