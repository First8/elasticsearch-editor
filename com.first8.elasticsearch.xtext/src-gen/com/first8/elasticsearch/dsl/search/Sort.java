/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Sort#getSortvalues <em>Sortvalues</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends EObject
{
  /**
   * Returns the value of the '<em><b>Sortvalues</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.SortValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sortvalues</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sortvalues</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSort_Sortvalues()
   * @model containment="true"
   * @generated
   */
  EList<SortValue> getSortvalues();

} // Sort
