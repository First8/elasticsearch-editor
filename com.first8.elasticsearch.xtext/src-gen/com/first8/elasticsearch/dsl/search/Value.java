/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Value#getObject <em>Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Value#getString <em>String</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Value#getArray <em>Array</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Value#getBool <em>Bool</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Value#getNull <em>Null</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.Value#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(com.first8.elasticsearch.dsl.search.Object)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue_Object()
   * @model containment="true"
   * @generated
   */
  com.first8.elasticsearch.dsl.search.Object getObject();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Value#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(com.first8.elasticsearch.dsl.search.Object value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Value#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(Array)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue_Array()
   * @model containment="true"
   * @generated
   */
  Array getArray();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Value#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Array value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #setBool(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue_Bool()
   * @model
   * @generated
   */
  String getBool();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Value#getBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #getBool()
   * @generated
   */
  void setBool(String value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue_Null()
   * @model
   * @generated
   */
  String getNull();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Value#getNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #getNull()
   * @generated
   */
  void setNull(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getValue_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.Value#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

} // Value
