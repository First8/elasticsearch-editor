/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Fields#getSelectfields <em>Selectfields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFields()
 * @model
 * @generated
 */
public interface Fields extends EObject
{
  /**
   * Returns the value of the '<em><b>Selectfields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectfields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectfields</em>' containment reference.
   * @see #setSelectfields(Array)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFields_Selectfields()
   * @model containment="true"
   * @generated
   */
  Array getSelectfields();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Fields#getSelectfields <em>Selectfields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selectfields</em>' containment reference.
   * @see #getSelectfields()
   * @generated
   */
  void setSelectfields(Array value);

} // Fields
