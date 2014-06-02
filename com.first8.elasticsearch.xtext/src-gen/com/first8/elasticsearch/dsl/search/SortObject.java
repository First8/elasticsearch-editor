/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortObject#getSortFieldName <em>Sort Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SortObject#getSortProperties <em>Sort Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObject()
 * @model
 * @generated
 */
public interface SortObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Sort Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Field Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Field Name</em>' attribute.
   * @see #setSortFieldName(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObject_SortFieldName()
   * @model
   * @generated
   */
  String getSortFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortObject#getSortFieldName <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Field Name</em>' attribute.
   * @see #getSortFieldName()
   * @generated
   */
  void setSortFieldName(String value);

  /**
   * Returns the value of the '<em><b>Sort Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Properties</em>' containment reference.
   * @see #setSortProperties(SortObjectPropertiesObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSortObject_SortProperties()
   * @model containment="true"
   * @generated
   */
  SortObjectPropertiesObject getSortProperties();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SortObject#getSortProperties <em>Sort Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Properties</em>' containment reference.
   * @see #getSortProperties()
   * @generated
   */
  void setSortProperties(SortObjectPropertiesObject value);

} // SortObject
