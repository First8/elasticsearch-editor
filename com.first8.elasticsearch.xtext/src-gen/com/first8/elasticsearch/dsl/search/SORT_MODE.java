/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SORT MODE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SORT_MODE#getSortMode <em>Sort Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSORT_MODE()
 * @model
 * @generated
 */
public interface SORT_MODE extends EObject
{
  /**
   * Returns the value of the '<em><b>Sort Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Mode</em>' attribute.
   * @see #setSortMode(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSORT_MODE_SortMode()
   * @model
   * @generated
   */
  String getSortMode();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SORT_MODE#getSortMode <em>Sort Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Mode</em>' attribute.
   * @see #getSortMode()
   * @generated
   */
  void setSortMode(String value);

} // SORT_MODE
