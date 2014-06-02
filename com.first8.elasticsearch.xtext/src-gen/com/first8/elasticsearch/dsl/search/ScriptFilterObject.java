/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Filter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject#getScript <em>Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getScriptFilterObject()
 * @model
 * @generated
 */
public interface ScriptFilterObject extends ScriptFilter
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getScriptFilterObject_Script()
   * @model
   * @generated
   */
  String getScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject#getScript <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' attribute.
   * @see #getScript()
   * @generated
   */
  void setScript(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(com.first8.elasticsearch.dsl.search.Object)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getScriptFilterObject_Params()
   * @model containment="true"
   * @generated
   */
  com.first8.elasticsearch.dsl.search.Object getParams();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(com.first8.elasticsearch.dsl.search.Object value);

} // ScriptFilterObject
