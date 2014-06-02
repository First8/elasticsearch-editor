/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terms Facet Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getField <em>Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getFields <em>Fields</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getSize <em>Size</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getOrder <em>Order</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getAllTerms <em>All Terms</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getExclude <em>Exclude</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegex <em>Regex</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegexFlags <em>Regex Flags</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScript <em>Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScriptField <em>Script Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter()
 * @model
 * @generated
 */
public interface TermsFacetParameter extends EObject
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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Field()
   * @model
   * @generated
   */
  String getField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getField <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' attribute.
   * @see #getField()
   * @generated
   */
  void setField(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Fields()
   * @model
   * @generated
   */
  String getFields();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getFields <em>Fields</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' attribute.
   * @see #getFields()
   * @generated
   */
  void setFields(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' attribute.
   * @see #setOrder(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Order()
   * @model
   * @generated
   */
  String getOrder();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getOrder <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' attribute.
   * @see #getOrder()
   * @generated
   */
  void setOrder(String value);

  /**
   * Returns the value of the '<em><b>All Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Terms</em>' containment reference.
   * @see #setAllTerms(AllTermsParam)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_AllTerms()
   * @model containment="true"
   * @generated
   */
  AllTermsParam getAllTerms();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getAllTerms <em>All Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Terms</em>' containment reference.
   * @see #getAllTerms()
   * @generated
   */
  void setAllTerms(AllTermsParam value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude</em>' containment reference.
   * @see #setExclude(ExcludeParam)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Exclude()
   * @model containment="true"
   * @generated
   */
  ExcludeParam getExclude();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getExclude <em>Exclude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' containment reference.
   * @see #getExclude()
   * @generated
   */
  void setExclude(ExcludeParam value);

  /**
   * Returns the value of the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regex</em>' attribute.
   * @see #setRegex(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Regex()
   * @model
   * @generated
   */
  String getRegex();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegex <em>Regex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regex</em>' attribute.
   * @see #getRegex()
   * @generated
   */
  void setRegex(String value);

  /**
   * Returns the value of the '<em><b>Regex Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regex Flags</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regex Flags</em>' attribute.
   * @see #setRegexFlags(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_RegexFlags()
   * @model
   * @generated
   */
  String getRegexFlags();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegexFlags <em>Regex Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regex Flags</em>' attribute.
   * @see #getRegexFlags()
   * @generated
   */
  void setRegexFlags(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_Script()
   * @model containment="true"
   * @generated
   */
  ScriptParam getScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(ScriptParam value);

  /**
   * Returns the value of the '<em><b>Script Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script Field</em>' containment reference.
   * @see #setScriptField(ScriptFieldParam)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getTermsFacetParameter_ScriptField()
   * @model containment="true"
   * @generated
   */
  ScriptFieldParam getScriptField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScriptField <em>Script Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script Field</em>' containment reference.
   * @see #getScriptField()
   * @generated
   */
  void setScriptField(ScriptFieldParam value);

} // TermsFacetParameter
