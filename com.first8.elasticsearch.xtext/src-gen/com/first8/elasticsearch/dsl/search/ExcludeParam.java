/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ExcludeParam#getExcludeFieldNames <em>Exclude Field Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getExcludeParam()
 * @model
 * @generated
 */
public interface ExcludeParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Exclude Field Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Field Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Field Names</em>' attribute list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getExcludeParam_ExcludeFieldNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getExcludeFieldNames();

} // ExcludeParam
