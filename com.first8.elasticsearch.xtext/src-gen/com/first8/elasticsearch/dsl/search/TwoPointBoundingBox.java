/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Point Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getBottomRight <em>Bottom Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTwoPointBoundingBox()
 * @model
 * @generated
 */
public interface TwoPointBoundingBox extends EObject
{
  /**
   * Returns the value of the '<em><b>Top Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top Left</em>' containment reference.
   * @see #setTopLeft(LatLon)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTwoPointBoundingBox_TopLeft()
   * @model containment="true"
   * @generated
   */
  LatLon getTopLeft();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getTopLeft <em>Top Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top Left</em>' containment reference.
   * @see #getTopLeft()
   * @generated
   */
  void setTopLeft(LatLon value);

  /**
   * Returns the value of the '<em><b>Bottom Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bottom Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bottom Right</em>' containment reference.
   * @see #setBottomRight(LatLon)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTwoPointBoundingBox_BottomRight()
   * @model containment="true"
   * @generated
   */
  LatLon getBottomRight();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getBottomRight <em>Bottom Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bottom Right</em>' containment reference.
   * @see #getBottomRight()
   * @generated
   */
  void setBottomRight(LatLon value);

} // TwoPointBoundingBox
