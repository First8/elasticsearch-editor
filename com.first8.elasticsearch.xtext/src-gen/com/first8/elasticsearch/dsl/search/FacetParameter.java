/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetParameter#getGlobal <em>Global</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetParameter#getFaceFilter <em>Face Filter</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetParameter#getNested <em>Nested</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetParameter()
 * @model
 * @generated
 */
public interface FacetParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Global</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Global</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global</em>' attribute.
   * @see #setGlobal(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetParameter_Global()
   * @model
   * @generated
   */
  String getGlobal();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FacetParameter#getGlobal <em>Global</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Global</em>' attribute.
   * @see #getGlobal()
   * @generated
   */
  void setGlobal(String value);

  /**
   * Returns the value of the '<em><b>Face Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Face Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Face Filter</em>' containment reference.
   * @see #setFaceFilter(FacetFilterParam)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetParameter_FaceFilter()
   * @model containment="true"
   * @generated
   */
  FacetFilterParam getFaceFilter();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FacetParameter#getFaceFilter <em>Face Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face Filter</em>' containment reference.
   * @see #getFaceFilter()
   * @generated
   */
  void setFaceFilter(FacetFilterParam value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' attribute.
   * @see #setNested(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetParameter_Nested()
   * @model
   * @generated
   */
  String getNested();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FacetParameter#getNested <em>Nested</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' attribute.
   * @see #getNested()
   * @generated
   */
  void setNested(String value);

} // FacetParameter
