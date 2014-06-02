/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Histogram Facet Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getField <em>Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValueScript <em>Key Value Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHistogramFacetObject()
 * @model
 * @generated
 */
public interface HistogramFacetObject extends HistogramFacet
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHistogramFacetObject_Field()
   * @model
   * @generated
   */
  String getField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getField <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' attribute.
   * @see #getField()
   * @generated
   */
  void setField(String value);

  /**
   * Returns the value of the '<em><b>Key Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value</em>' containment reference.
   * @see #setKeyValue(KeyValueField)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHistogramFacetObject_KeyValue()
   * @model containment="true"
   * @generated
   */
  KeyValueField getKeyValue();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValue <em>Key Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Value</em>' containment reference.
   * @see #getKeyValue()
   * @generated
   */
  void setKeyValue(KeyValueField value);

  /**
   * Returns the value of the '<em><b>Key Value Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value Script</em>' containment reference.
   * @see #setKeyValueScript(KeyValueScript)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getHistogramFacetObject_KeyValueScript()
   * @model containment="true"
   * @generated
   */
  KeyValueScript getKeyValueScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValueScript <em>Key Value Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Value Script</em>' containment reference.
   * @see #getKeyValueScript()
   * @generated
   */
  void setKeyValueScript(KeyValueScript value);

} // HistogramFacetObject
