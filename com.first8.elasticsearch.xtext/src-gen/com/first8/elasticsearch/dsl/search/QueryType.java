/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getMatch <em>Match</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getMultiMatch <em>Multi Match</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getBool <em>Bool</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getCommon <em>Common</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getConstantScore <em>Constant Score</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getDisMax <em>Dis Max</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getFiltered <em>Filtered</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThis <em>Fuzzy Like This</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThisField <em>Fuzzy Like This Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getGeoshape <em>Geoshape</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getHasChild <em>Has Child</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getHasParent <em>Has Parent</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getIds <em>Ids</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getIndices <em>Indices</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getMatchAll <em>Match All</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThis <em>More Like This</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThisField <em>More Like This Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getNested <em>Nested</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getQueryString <em>Query String</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSimpleQuery <em>Simple Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanFirst <em>Span First</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanMulti <em>Span Multi</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanNear <em>Span Near</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanNot <em>Span Not</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanOr <em>Span Or</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanTerm <em>Span Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzy <em>Fuzzy</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getTerm <em>Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getRange <em>Range</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getWildcard <em>Wildcard</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getTerms <em>Terms</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.QueryType#getTopChildren <em>Top Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType()
 * @model
 * @generated
 */
public interface QueryType extends EObject
{
  /**
   * Returns the value of the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match</em>' containment reference.
   * @see #setMatch(MatchQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Match()
   * @model containment="true"
   * @generated
   */
  MatchQuery getMatch();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getMatch <em>Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match</em>' containment reference.
   * @see #getMatch()
   * @generated
   */
  void setMatch(MatchQuery value);

  /**
   * Returns the value of the '<em><b>Multi Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Match</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi Match</em>' containment reference.
   * @see #setMultiMatch(MultiMatchQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_MultiMatch()
   * @model containment="true"
   * @generated
   */
  MultiMatchQuery getMultiMatch();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getMultiMatch <em>Multi Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi Match</em>' containment reference.
   * @see #getMultiMatch()
   * @generated
   */
  void setMultiMatch(MultiMatchQuery value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' containment reference.
   * @see #setBool(BoolQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Bool()
   * @model containment="true"
   * @generated
   */
  BoolQuery getBool();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getBool <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' containment reference.
   * @see #getBool()
   * @generated
   */
  void setBool(BoolQuery value);

  /**
   * Returns the value of the '<em><b>Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Common</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Common</em>' containment reference.
   * @see #setCommon(CommonQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Common()
   * @model containment="true"
   * @generated
   */
  CommonQuery getCommon();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getCommon <em>Common</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Common</em>' containment reference.
   * @see #getCommon()
   * @generated
   */
  void setCommon(CommonQuery value);

  /**
   * Returns the value of the '<em><b>Constant Score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Score</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Score</em>' containment reference.
   * @see #setConstantScore(ConstantScoreQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_ConstantScore()
   * @model containment="true"
   * @generated
   */
  ConstantScoreQuery getConstantScore();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getConstantScore <em>Constant Score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Score</em>' containment reference.
   * @see #getConstantScore()
   * @generated
   */
  void setConstantScore(ConstantScoreQuery value);

  /**
   * Returns the value of the '<em><b>Dis Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dis Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dis Max</em>' containment reference.
   * @see #setDisMax(DisMaxQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_DisMax()
   * @model containment="true"
   * @generated
   */
  DisMaxQuery getDisMax();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getDisMax <em>Dis Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dis Max</em>' containment reference.
   * @see #getDisMax()
   * @generated
   */
  void setDisMax(DisMaxQuery value);

  /**
   * Returns the value of the '<em><b>Filtered</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filtered</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filtered</em>' containment reference.
   * @see #setFiltered(FilteredQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Filtered()
   * @model containment="true"
   * @generated
   */
  FilteredQuery getFiltered();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getFiltered <em>Filtered</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filtered</em>' containment reference.
   * @see #getFiltered()
   * @generated
   */
  void setFiltered(FilteredQuery value);

  /**
   * Returns the value of the '<em><b>Fuzzy Like This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fuzzy Like This</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fuzzy Like This</em>' containment reference.
   * @see #setFuzzyLikeThis(FuzzyLikeThisQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_FuzzyLikeThis()
   * @model containment="true"
   * @generated
   */
  FuzzyLikeThisQuery getFuzzyLikeThis();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThis <em>Fuzzy Like This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fuzzy Like This</em>' containment reference.
   * @see #getFuzzyLikeThis()
   * @generated
   */
  void setFuzzyLikeThis(FuzzyLikeThisQuery value);

  /**
   * Returns the value of the '<em><b>Fuzzy Like This Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fuzzy Like This Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fuzzy Like This Field</em>' containment reference.
   * @see #setFuzzyLikeThisField(FuzzyLikeThisFieldQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_FuzzyLikeThisField()
   * @model containment="true"
   * @generated
   */
  FuzzyLikeThisFieldQuery getFuzzyLikeThisField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThisField <em>Fuzzy Like This Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fuzzy Like This Field</em>' containment reference.
   * @see #getFuzzyLikeThisField()
   * @generated
   */
  void setFuzzyLikeThisField(FuzzyLikeThisFieldQuery value);

  /**
   * Returns the value of the '<em><b>Geoshape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geoshape</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geoshape</em>' containment reference.
   * @see #setGeoshape(GeoshapeQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Geoshape()
   * @model containment="true"
   * @generated
   */
  GeoshapeQuery getGeoshape();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getGeoshape <em>Geoshape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geoshape</em>' containment reference.
   * @see #getGeoshape()
   * @generated
   */
  void setGeoshape(GeoshapeQuery value);

  /**
   * Returns the value of the '<em><b>Has Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Child</em>' containment reference.
   * @see #setHasChild(HasChildQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_HasChild()
   * @model containment="true"
   * @generated
   */
  HasChildQuery getHasChild();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getHasChild <em>Has Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Child</em>' containment reference.
   * @see #getHasChild()
   * @generated
   */
  void setHasChild(HasChildQuery value);

  /**
   * Returns the value of the '<em><b>Has Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Parent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Parent</em>' containment reference.
   * @see #setHasParent(HasParentQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_HasParent()
   * @model containment="true"
   * @generated
   */
  HasParentQuery getHasParent();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getHasParent <em>Has Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Parent</em>' containment reference.
   * @see #getHasParent()
   * @generated
   */
  void setHasParent(HasParentQuery value);

  /**
   * Returns the value of the '<em><b>Ids</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' attribute.
   * @see #setIds(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Ids()
   * @model
   * @generated
   */
  String getIds();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getIds <em>Ids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ids</em>' attribute.
   * @see #getIds()
   * @generated
   */
  void setIds(String value);

  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference.
   * @see #setIndices(IndicesQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Indices()
   * @model containment="true"
   * @generated
   */
  IndicesQuery getIndices();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getIndices <em>Indices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indices</em>' containment reference.
   * @see #getIndices()
   * @generated
   */
  void setIndices(IndicesQuery value);

  /**
   * Returns the value of the '<em><b>Match All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match All</em>' attribute.
   * @see #setMatchAll(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_MatchAll()
   * @model
   * @generated
   */
  String getMatchAll();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getMatchAll <em>Match All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match All</em>' attribute.
   * @see #getMatchAll()
   * @generated
   */
  void setMatchAll(String value);

  /**
   * Returns the value of the '<em><b>More Like This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>More Like This</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>More Like This</em>' containment reference.
   * @see #setMoreLikeThis(MoreLikeThisQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_MoreLikeThis()
   * @model containment="true"
   * @generated
   */
  MoreLikeThisQuery getMoreLikeThis();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThis <em>More Like This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>More Like This</em>' containment reference.
   * @see #getMoreLikeThis()
   * @generated
   */
  void setMoreLikeThis(MoreLikeThisQuery value);

  /**
   * Returns the value of the '<em><b>More Like This Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>More Like This Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>More Like This Field</em>' containment reference.
   * @see #setMoreLikeThisField(MoreLikeThisFieldQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_MoreLikeThisField()
   * @model containment="true"
   * @generated
   */
  MoreLikeThisFieldQuery getMoreLikeThisField();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThisField <em>More Like This Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>More Like This Field</em>' containment reference.
   * @see #getMoreLikeThisField()
   * @generated
   */
  void setMoreLikeThisField(MoreLikeThisFieldQuery value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' containment reference.
   * @see #setNested(NestedQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Nested()
   * @model containment="true"
   * @generated
   */
  NestedQuery getNested();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getNested <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' containment reference.
   * @see #getNested()
   * @generated
   */
  void setNested(NestedQuery value);

  /**
   * Returns the value of the '<em><b>Query String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query String</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query String</em>' containment reference.
   * @see #setQueryString(QueryStringQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_QueryString()
   * @model containment="true"
   * @generated
   */
  QueryStringQuery getQueryString();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getQueryString <em>Query String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query String</em>' containment reference.
   * @see #getQueryString()
   * @generated
   */
  void setQueryString(QueryStringQuery value);

  /**
   * Returns the value of the '<em><b>Simple Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Query</em>' containment reference.
   * @see #setSimpleQuery(SimpleQueryStringQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SimpleQuery()
   * @model containment="true"
   * @generated
   */
  SimpleQueryStringQuery getSimpleQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSimpleQuery <em>Simple Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Query</em>' containment reference.
   * @see #getSimpleQuery()
   * @generated
   */
  void setSimpleQuery(SimpleQueryStringQuery value);

  /**
   * Returns the value of the '<em><b>Span First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span First</em>' containment reference.
   * @see #setSpanFirst(SpanFirstQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SpanFirst()
   * @model containment="true"
   * @generated
   */
  SpanFirstQuery getSpanFirst();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanFirst <em>Span First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span First</em>' containment reference.
   * @see #getSpanFirst()
   * @generated
   */
  void setSpanFirst(SpanFirstQuery value);

  /**
   * Returns the value of the '<em><b>Span Multi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Multi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Multi</em>' containment reference.
   * @see #setSpanMulti(SpanMultiQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SpanMulti()
   * @model containment="true"
   * @generated
   */
  SpanMultiQuery getSpanMulti();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanMulti <em>Span Multi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Multi</em>' containment reference.
   * @see #getSpanMulti()
   * @generated
   */
  void setSpanMulti(SpanMultiQuery value);

  /**
   * Returns the value of the '<em><b>Span Near</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Near</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Near</em>' containment reference.
   * @see #setSpanNear(SpanNearQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SpanNear()
   * @model containment="true"
   * @generated
   */
  SpanNearQuery getSpanNear();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanNear <em>Span Near</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Near</em>' containment reference.
   * @see #getSpanNear()
   * @generated
   */
  void setSpanNear(SpanNearQuery value);

  /**
   * Returns the value of the '<em><b>Span Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Not</em>' containment reference.
   * @see #setSpanNot(SpanNotQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SpanNot()
   * @model containment="true"
   * @generated
   */
  SpanNotQuery getSpanNot();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanNot <em>Span Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Not</em>' containment reference.
   * @see #getSpanNot()
   * @generated
   */
  void setSpanNot(SpanNotQuery value);

  /**
   * Returns the value of the '<em><b>Span Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Or</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Or</em>' containment reference.
   * @see #setSpanOr(SpanOrQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SpanOr()
   * @model containment="true"
   * @generated
   */
  SpanOrQuery getSpanOr();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanOr <em>Span Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Or</em>' containment reference.
   * @see #getSpanOr()
   * @generated
   */
  void setSpanOr(SpanOrQuery value);

  /**
   * Returns the value of the '<em><b>Span Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Span Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Span Term</em>' containment reference.
   * @see #setSpanTerm(SpanTermQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_SpanTerm()
   * @model containment="true"
   * @generated
   */
  SpanTermQuery getSpanTerm();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanTerm <em>Span Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Span Term</em>' containment reference.
   * @see #getSpanTerm()
   * @generated
   */
  void setSpanTerm(SpanTermQuery value);

  /**
   * Returns the value of the '<em><b>Fuzzy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fuzzy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fuzzy</em>' containment reference.
   * @see #setFuzzy(FuzzyQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Fuzzy()
   * @model containment="true"
   * @generated
   */
  FuzzyQuery getFuzzy();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzy <em>Fuzzy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fuzzy</em>' containment reference.
   * @see #getFuzzy()
   * @generated
   */
  void setFuzzy(FuzzyQuery value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(PrefixQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Prefix()
   * @model containment="true"
   * @generated
   */
  PrefixQuery getPrefix();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(PrefixQuery value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(TermQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Term()
   * @model containment="true"
   * @generated
   */
  TermQuery getTerm();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(TermQuery value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RangeQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Range()
   * @model containment="true"
   * @generated
   */
  RangeQuery getRange();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RangeQuery value);

  /**
   * Returns the value of the '<em><b>Regexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regexp</em>' containment reference.
   * @see #setRegexp(RegexpQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Regexp()
   * @model containment="true"
   * @generated
   */
  RegexpQuery getRegexp();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getRegexp <em>Regexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regexp</em>' containment reference.
   * @see #getRegexp()
   * @generated
   */
  void setRegexp(RegexpQuery value);

  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wildcard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' containment reference.
   * @see #setWildcard(WildcardQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Wildcard()
   * @model containment="true"
   * @generated
   */
  WildcardQuery getWildcard();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getWildcard <em>Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' containment reference.
   * @see #getWildcard()
   * @generated
   */
  void setWildcard(WildcardQuery value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(TermsQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_Terms()
   * @model containment="true"
   * @generated
   */
  TermsQuery getTerms();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(TermsQuery value);

  /**
   * Returns the value of the '<em><b>Top Children</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top Children</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top Children</em>' containment reference.
   * @see #setTopChildren(TopChildrenQuery)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getQueryType_TopChildren()
   * @model containment="true"
   * @generated
   */
  TopChildrenQuery getTopChildren();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.QueryType#getTopChildren <em>Top Children</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top Children</em>' containment reference.
   * @see #getTopChildren()
   * @generated
   */
  void setTopChildren(TopChildrenQuery value);

} // QueryType
