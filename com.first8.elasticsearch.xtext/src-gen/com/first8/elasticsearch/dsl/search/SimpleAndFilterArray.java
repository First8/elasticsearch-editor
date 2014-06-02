/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple And Filter Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SimpleAndFilterArray#getSubFilter <em>Sub Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleAndFilterArray()
 * @model
 * @generated
 */
public interface SimpleAndFilterArray extends AndFilter, AndFilterObject
{
  /**
   * Returns the value of the '<em><b>Sub Filter</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.Filter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Filter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Filter</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSimpleAndFilterArray_SubFilter()
   * @model containment="true"
   * @generated
   */
  EList<Filter> getSubFilter();

} // SimpleAndFilterArray
