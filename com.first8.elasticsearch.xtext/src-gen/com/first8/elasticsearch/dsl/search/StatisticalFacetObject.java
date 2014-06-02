/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistical Facet Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getField <em>Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getScript <em>Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getStatisticalFacetObject()
 * @model
 * @generated
 */
public interface StatisticalFacetObject extends StatisticalFacet
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' attribute.
   * @see #setField(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getStatisticalFacetObject_Field()
   * @model
   * @generated
   */
  String getField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getField <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' attribute.
   * @see #getField()
   * @generated
   */
  void setField(String value);

  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference.
   * @see #setScript(ScriptParam)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getStatisticalFacetObject_Script()
   * @model containment="true"
   * @generated
   */
  ScriptParam getScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(ScriptParam value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' attribute.
   * @see #setFields(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getStatisticalFacetObject_Fields()
   * @model
   * @generated
   */
  String getFields();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getFields <em>Fields</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' attribute.
   * @see #getFields()
   * @generated
   */
  void setFields(String value);

} // StatisticalFacetObject
