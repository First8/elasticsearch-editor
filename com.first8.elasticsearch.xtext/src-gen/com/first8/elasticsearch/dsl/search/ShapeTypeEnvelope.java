/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Type Envelope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShapeTypeEnvelope()
 * @model
 * @generated
 */
public interface ShapeTypeEnvelope extends ShapeType
{
  /**
   * Returns the value of the '<em><b>Points</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.LatLonArray}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShapeTypeEnvelope_Points()
   * @model containment="true"
   * @generated
   */
  EList<LatLonArray> getPoints();

} // ShapeTypeEnvelope
