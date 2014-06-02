/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Sort Oject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ShortSortOject#getSortFieldName <em>Sort Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ShortSortOject#getAscDesc <em>Asc Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShortSortOject()
 * @model
 * @generated
 */
public interface ShortSortOject extends EObject
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShortSortOject_SortFieldName()
   * @model
   * @generated
   */
  String getSortFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.ShortSortOject#getSortFieldName <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Field Name</em>' attribute.
   * @see #getSortFieldName()
   * @generated
   */
  void setSortFieldName(String value);

  /**
   * Returns the value of the '<em><b>Asc Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asc Desc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asc Desc</em>' containment reference.
   * @see #setAscDesc(ASC_DESC)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShortSortOject_AscDesc()
   * @model containment="true"
   * @generated
   */
  ASC_DESC getAscDesc();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.ShortSortOject#getAscDesc <em>Asc Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asc Desc</em>' containment reference.
   * @see #getAscDesc()
   * @generated
   */
  void setAscDesc(ASC_DESC value);

} // ShortSortOject
