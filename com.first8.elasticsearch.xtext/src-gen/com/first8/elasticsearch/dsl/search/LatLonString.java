/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LatLonString#getLatLonOrHash <em>Lat Lon Or Hash</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLonString()
 * @model
 * @generated
 */
public interface LatLonString extends EObject
{
  /**
   * Returns the value of the '<em><b>Lat Lon Or Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat Lon Or Hash</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat Lon Or Hash</em>' attribute.
   * @see #setLatLonOrHash(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLonString_LatLonOrHash()
   * @model
   * @generated
   */
  String getLatLonOrHash();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LatLonString#getLatLonOrHash <em>Lat Lon Or Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat Lon Or Hash</em>' attribute.
   * @see #getLatLonOrHash()
   * @generated
   */
  void setLatLonOrHash(String value);

} // LatLonString
