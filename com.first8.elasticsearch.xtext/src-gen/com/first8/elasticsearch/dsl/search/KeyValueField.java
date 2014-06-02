/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.KeyValueField#getKeyField <em>Key Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.KeyValueField#getValueField <em>Value Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getKeyValueField()
 * @model
 * @generated
 */
public interface KeyValueField extends EObject
{
  /**
   * Returns the value of the '<em><b>Key Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Field</em>' attribute.
   * @see #setKeyField(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getKeyValueField_KeyField()
   * @model
   * @generated
   */
  String getKeyField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.KeyValueField#getKeyField <em>Key Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Field</em>' attribute.
   * @see #getKeyField()
   * @generated
   */
  void setKeyField(String value);

  /**
   * Returns the value of the '<em><b>Value Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Field</em>' attribute.
   * @see #setValueField(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getKeyValueField_ValueField()
   * @model
   * @generated
   */
  String getValueField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.KeyValueField#getValueField <em>Value Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Field</em>' attribute.
   * @see #getValueField()
   * @generated
   */
  void setValueField(String value);

} // KeyValueField
