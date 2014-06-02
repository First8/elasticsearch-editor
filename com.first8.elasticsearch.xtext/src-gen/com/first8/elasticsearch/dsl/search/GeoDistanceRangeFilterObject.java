/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Distance Range Filter Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFrom <em>From</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getTo <em>To</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceRangeFilterObject()
 * @model
 * @generated
 */
public interface GeoDistanceRangeFilterObject extends GeoDistanceRangeFilter
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceRangeFilterObject_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceRangeFilterObject_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceRangeFilterObject_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFieldName <em>Field Name</em>}' attribute.
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoDistanceRangeFilterObject_Point()
   * @model containment="true"
   * @generated
   */
  LatLon getPoint();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getPoint <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Point</em>' containment reference.
   * @see #getPoint()
   * @generated
   */
  void setPoint(LatLon value);

} // GeoDistanceRangeFilterObject
