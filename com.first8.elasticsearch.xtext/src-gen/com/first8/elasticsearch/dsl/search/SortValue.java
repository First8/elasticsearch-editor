/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortValue#getSortFieldName <em>Sort Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortValue#getSortShortObject <em>Sort Short Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortValue#getSortObject <em>Sort Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortValue#getSortByScore <em>Sort By Score</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortValue()
 * @model
 * @generated
 */
public interface SortValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Sort Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Field Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Field Name</em>' attribute.
   * @see #setSortFieldName(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortValue_SortFieldName()
   * @model
   * @generated
   */
  String getSortFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortFieldName <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Field Name</em>' attribute.
   * @see #getSortFieldName()
   * @generated
   */
  void setSortFieldName(String value);

  /**
   * Returns the value of the '<em><b>Sort Short Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Short Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Short Object</em>' containment reference.
   * @see #setSortShortObject(ShortSortOject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortValue_SortShortObject()
   * @model containment="true"
   * @generated
   */
  ShortSortOject getSortShortObject();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortShortObject <em>Sort Short Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Short Object</em>' containment reference.
   * @see #getSortShortObject()
   * @generated
   */
  void setSortShortObject(ShortSortOject value);

  /**
   * Returns the value of the '<em><b>Sort Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Object</em>' containment reference.
   * @see #setSortObject(SortObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortValue_SortObject()
   * @model containment="true"
   * @generated
   */
  SortObject getSortObject();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortObject <em>Sort Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Object</em>' containment reference.
   * @see #getSortObject()
   * @generated
   */
  void setSortObject(SortObject value);

  /**
   * Returns the value of the '<em><b>Sort By Score</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort By Score</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort By Score</em>' attribute.
   * @see #setSortByScore(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortValue_SortByScore()
   * @model
   * @generated
   */
  String getSortByScore();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortByScore <em>Sort By Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort By Score</em>' attribute.
   * @see #getSortByScore()
   * @generated
   */
  void setSortByScore(String value);

} // SortValue
