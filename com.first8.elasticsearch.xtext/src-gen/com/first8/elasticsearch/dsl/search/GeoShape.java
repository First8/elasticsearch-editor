/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoShape#getShape <em>Shape</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.GeoShape#getIndexedShape <em>Indexed Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoShape()
 * @model
 * @generated
 */
public interface GeoShape extends GeoShapeObject
{
  /**
   * Returns the value of the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' containment reference.
   * @see #setShape(Shape)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoShape_Shape()
   * @model containment="true"
   * @generated
   */
  Shape getShape();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoShape#getShape <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' containment reference.
   * @see #getShape()
   * @generated
   */
  void setShape(Shape value);

  /**
   * Returns the value of the '<em><b>Indexed Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indexed Shape</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indexed Shape</em>' attribute.
   * @see #setIndexedShape(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getGeoShape_IndexedShape()
   * @model
   * @generated
   */
  String getIndexedShape();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.GeoShape#getIndexedShape <em>Indexed Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indexed Shape</em>' attribute.
   * @see #getIndexedShape()
   * @generated
   */
  void setIndexedShape(String value);

} // GeoShape
