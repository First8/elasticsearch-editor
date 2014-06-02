/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LatLonArray#getLon <em>Lon</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LatLonArray#getLat <em>Lat</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLonArray()
 * @model
 * @generated
 */
public interface LatLonArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Lon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lon</em>' attribute.
   * @see #setLon(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLonArray_Lon()
   * @model
   * @generated
   */
  String getLon();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LatLonArray#getLon <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lon</em>' attribute.
   * @see #getLon()
   * @generated
   */
  void setLon(String value);

  /**
   * Returns the value of the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat</em>' attribute.
   * @see #setLat(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLonArray_Lat()
   * @model
   * @generated
   */
  String getLat();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LatLonArray#getLat <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat</em>' attribute.
   * @see #getLat()
   * @generated
   */
  void setLat(String value);

} // LatLonArray
