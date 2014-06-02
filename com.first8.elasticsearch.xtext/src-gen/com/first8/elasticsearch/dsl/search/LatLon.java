/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonObject <em>Lat Lon Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonArray <em>Lat Lon Array</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonString <em>Lat Lon String</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLon()
 * @model
 * @generated
 */
public interface LatLon extends GeohashCellFilterObject
{
  /**
   * Returns the value of the '<em><b>Lat Lon Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat Lon Object</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat Lon Object</em>' attribute.
   * @see #setLatLonObject(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLon_LatLonObject()
   * @model
   * @generated
   */
  String getLatLonObject();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonObject <em>Lat Lon Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat Lon Object</em>' attribute.
   * @see #getLatLonObject()
   * @generated
   */
  void setLatLonObject(String value);

  /**
   * Returns the value of the '<em><b>Lat Lon Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat Lon Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat Lon Array</em>' containment reference.
   * @see #setLatLonArray(LatLonArray)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLon_LatLonArray()
   * @model containment="true"
   * @generated
   */
  LatLonArray getLatLonArray();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonArray <em>Lat Lon Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat Lon Array</em>' containment reference.
   * @see #getLatLonArray()
   * @generated
   */
  void setLatLonArray(LatLonArray value);

  /**
   * Returns the value of the '<em><b>Lat Lon String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat Lon String</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat Lon String</em>' containment reference.
   * @see #setLatLonString(LatLonString)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getLatLon_LatLonString()
   * @model containment="true"
   * @generated
   */
  LatLonString getLatLonString();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonString <em>Lat Lon String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat Lon String</em>' containment reference.
   * @see #getLatLonString()
   * @generated
   */
  void setLatLonString(LatLonString value);

} // LatLon
