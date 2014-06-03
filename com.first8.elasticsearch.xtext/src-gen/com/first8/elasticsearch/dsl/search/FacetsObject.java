/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facets Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetsObject#getFacetName <em>Facet Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetsObject#getConfig <em>Config</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FacetsObject#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetsObject()
 * @model
 * @generated
 */
public interface FacetsObject extends Facets
{
  /**
   * Returns the value of the '<em><b>Facet Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet Name</em>' attribute.
   * @see #setFacetName(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetsObject_FacetName()
   * @model
   * @generated
   */
  String getFacetName();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FacetsObject#getFacetName <em>Facet Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facet Name</em>' attribute.
   * @see #getFacetName()
   * @generated
   */
  void setFacetName(String value);

  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference.
   * @see #setConfig(FacetTypeObject)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetsObject_Config()
   * @model containment="true"
   * @generated
   */
  FacetTypeObject getConfig();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FacetsObject#getConfig <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' containment reference.
   * @see #getConfig()
   * @generated
   */
  void setConfig(FacetTypeObject value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.first8.elasticsearch.dsl.search.FacetParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFacetsObject_Params()
   * @model containment="true"
   * @generated
   */
  EList<FacetParameter> getParams();

} // FacetsObject
