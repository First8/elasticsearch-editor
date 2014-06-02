/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getFields <em>Fields</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getFrom <em>From</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getSize <em>Size</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getSort <em>Sort</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getFacets <em>Facets</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.SearchField#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField()
 * @model
 * @generated
 */
public interface SearchField extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference.
   * @see #setFields(Fields)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_Fields()
   * @model containment="true"
   * @generated
   */
  Fields getFields();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getFields <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' containment reference.
   * @see #getFields()
   * @generated
   */
  void setFields(Fields value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' containment reference.
   * @see #setSort(Sort)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_Sort()
   * @model containment="true"
   * @generated
   */
  Sort getSort();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getSort <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' containment reference.
   * @see #getSort()
   * @generated
   */
  void setSort(Sort value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Query)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Facets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facets</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facets</em>' containment reference.
   * @see #setFacets(Facets)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_Facets()
   * @model containment="true"
   * @generated
   */
  Facets getFacets();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getFacets <em>Facets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facets</em>' containment reference.
   * @see #getFacets()
   * @generated
   */
  void setFacets(Facets value);

  /**
   * Returns the value of the '<em><b>Stats</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stats</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stats</em>' containment reference.
   * @see #setStats(Stats)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getSearchField_Stats()
   * @model containment="true"
   * @generated
   */
  Stats getStats();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.SearchField#getStats <em>Stats</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stats</em>' containment reference.
   * @see #getStats()
   * @generated
   */
  void setStats(Stats value);

} // SearchField
