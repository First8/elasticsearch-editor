/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dis Max Query Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.DisMaxQueryObject#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getDisMaxQueryObject()
 * @model
 * @generated
 */
public interface DisMaxQueryObject extends DisMaxQuery
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.QueryObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getDisMaxQueryObject_Query()
   * @model containment="true"
   * @generated
   */
  EList<QueryObject> getQuery();

} // DisMaxQueryObject
