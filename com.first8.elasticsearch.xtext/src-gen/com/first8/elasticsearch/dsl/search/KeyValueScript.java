/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.KeyValueScript#getKeyScript <em>Key Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.KeyValueScript#getValueScript <em>Value Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getKeyValueScript()
 * @model
 * @generated
 */
public interface KeyValueScript extends EObject
{
  /**
   * Returns the value of the '<em><b>Key Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Script</em>' attribute.
   * @see #setKeyScript(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getKeyValueScript_KeyScript()
   * @model
   * @generated
   */
  String getKeyScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.KeyValueScript#getKeyScript <em>Key Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Script</em>' attribute.
   * @see #getKeyScript()
   * @generated
   */
  void setKeyScript(String value);

  /**
   * Returns the value of the '<em><b>Value Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Script</em>' attribute.
   * @see #setValueScript(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getKeyValueScript_ValueScript()
   * @model
   * @generated
   */
  String getValueScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.KeyValueScript#getValueScript <em>Value Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Script</em>' attribute.
   * @see #getValueScript()
   * @generated
   */
  void setValueScript(String value);

} // KeyValueScript
