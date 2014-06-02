/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Object Properties Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObjectPropertiesObject()
 * @model
 * @generated
 */
public interface SortObjectPropertiesObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.SortObjectProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObjectPropertiesObject_Sort()
   * @model containment="true"
   * @generated
   */
  EList<SortObjectProperty> getSort();

} // SortObjectPropertiesObject
