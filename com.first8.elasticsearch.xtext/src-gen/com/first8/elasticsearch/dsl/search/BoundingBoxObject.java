/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Box Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject#getTwoPointBoundingBox <em>Two Point Bounding Box</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject#getVerticesBoundingBox <em>Vertices Bounding Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoundingBoxObject()
 * @model
 * @generated
 */
public interface BoundingBoxObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Two Point Bounding Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Two Point Bounding Box</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Two Point Bounding Box</em>' containment reference.
   * @see #setTwoPointBoundingBox(TwoPointBoundingBox)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoundingBoxObject_TwoPointBoundingBox()
   * @model containment="true"
   * @generated
   */
  TwoPointBoundingBox getTwoPointBoundingBox();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject#getTwoPointBoundingBox <em>Two Point Bounding Box</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Two Point Bounding Box</em>' containment reference.
   * @see #getTwoPointBoundingBox()
   * @generated
   */
  void setTwoPointBoundingBox(TwoPointBoundingBox value);

  /**
   * Returns the value of the '<em><b>Vertices Bounding Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertices Bounding Box</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertices Bounding Box</em>' attribute.
   * @see #setVerticesBoundingBox(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getBoundingBoxObject_VerticesBoundingBox()
   * @model
   * @generated
   */
  String getVerticesBoundingBox();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject#getVerticesBoundingBox <em>Vertices Bounding Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vertices Bounding Box</em>' attribute.
   * @see #getVerticesBoundingBox()
   * @generated
   */
  void setVerticesBoundingBox(String value);

} // BoundingBoxObject
