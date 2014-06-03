/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetTypeObject#getFacetType <em>Facet Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetTypeObject()
 * @model
 * @generated
 */
public interface FacetTypeObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet Type</em>' containment reference.
   * @see #setFacetType(FacetType)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetTypeObject_FacetType()
   * @model containment="true"
   * @generated
   */
  FacetType getFacetType();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FacetTypeObject#getFacetType <em>Facet Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facet Type</em>' containment reference.
   * @see #getFacetType()
   * @generated
   */
  void setFacetType(FacetType value);

} // FacetTypeObject
