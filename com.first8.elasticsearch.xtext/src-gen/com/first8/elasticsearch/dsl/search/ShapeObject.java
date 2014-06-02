/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.ShapeObject#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShapeObject()
 * @model
 * @generated
 */
public interface ShapeObject extends EObject
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getShapeObject_Shape()
   * @model containment="true"
   * @generated
   */
  Shape getShape();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.ShapeObject#getShape <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' containment reference.
   * @see #getShape()
   * @generated
   */
  void setShape(Shape value);

} // ShapeObject
