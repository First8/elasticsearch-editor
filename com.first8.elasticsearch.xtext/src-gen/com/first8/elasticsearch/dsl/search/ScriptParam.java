/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ScriptParam#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getScriptParam()
 * @model
 * @generated
 */
public interface ScriptParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' attribute.
   * @see #setScript(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getScriptParam_Script()
   * @model
   * @generated
   */
  String getScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.ScriptParam#getScript <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' attribute.
   * @see #getScript()
   * @generated
   */
  void setScript(String value);

} // ScriptParam
