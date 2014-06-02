/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Distance Filter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getPoint <em>Point</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceFilterObject()
 * @model
 * @generated
 */
public interface GeoDistanceFilterObject extends GeoDistanceFilter
{
  /**
   * Returns the value of the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance</em>' attribute.
   * @see #setDistance(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceFilterObject_Distance()
   * @model
   * @generated
   */
  String getDistance();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getDistance <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance</em>' attribute.
   * @see #getDistance()
   * @generated
   */
  void setDistance(String value);

  /**
   * Returns the value of the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Name</em>' attribute.
   * @see #setFieldName(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceFilterObject_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

  /**
   * Returns the value of the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Point</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Point</em>' containment reference.
   * @see #setPoint(LatLon)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceFilterObject_Point()
   * @model containment="true"
   * @generated
   */
  LatLon getPoint();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getPoint <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Point</em>' containment reference.
   * @see #getPoint()
   * @generated
   */
  void setPoint(LatLon value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceFilterObject_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // GeoDistanceFilterObject
