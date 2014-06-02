/**
 */
package com.first8.elasticsearch.dsl.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getAnd <em>And</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getBool <em>Bool</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getExists <em>Exists</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoBoundingBox <em>Geo Bounding Box</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoDistance <em>Geo Distance</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoDistanceRange <em>Geo Distance Range</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoPolygon <em>Geo Polygon</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoShape <em>Geo Shape</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoHashCell <em>Geo Hash Cell</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getHasChild <em>Has Child</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getHasParent <em>Has Parent</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getIds <em>Ids</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getIndices <em>Indices</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getLimit <em>Limit</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getMatchAll <em>Match All</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getMissing <em>Missing</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getNested <em>Nested</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getNot <em>Not</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getOr <em>Or</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getScript <em>Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getTerm <em>Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getTerms <em>Terms</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.FilterType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType()
 * @model
 * @generated
 */
public interface FilterType extends FilterObject
{
  /**
   * Returns the value of the '<em><b>And</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' containment reference.
   * @see #setAnd(AndFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_And()
   * @model containment="true"
   * @generated
   */
  AndFilter getAnd();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getAnd <em>And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And</em>' containment reference.
   * @see #getAnd()
   * @generated
   */
  void setAnd(AndFilter value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' containment reference.
   * @see #setBool(BoolFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Bool()
   * @model containment="true"
   * @generated
   */
  BoolFilter getBool();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getBool <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' containment reference.
   * @see #getBool()
   * @generated
   */
  void setBool(BoolFilter value);

  /**
   * Returns the value of the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exists</em>' attribute.
   * @see #setExists(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Exists()
   * @model
   * @generated
   */
  String getExists();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exists</em>' attribute.
   * @see #getExists()
   * @generated
   */
  void setExists(String value);

  /**
   * Returns the value of the '<em><b>Geo Bounding Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geo Bounding Box</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Bounding Box</em>' containment reference.
   * @see #setGeoBoundingBox(GeoBoundingBoxFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_GeoBoundingBox()
   * @model containment="true"
   * @generated
   */
  GeoBoundingBoxFilter getGeoBoundingBox();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoBoundingBox <em>Geo Bounding Box</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Bounding Box</em>' containment reference.
   * @see #getGeoBoundingBox()
   * @generated
   */
  void setGeoBoundingBox(GeoBoundingBoxFilter value);

  /**
   * Returns the value of the '<em><b>Geo Distance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geo Distance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Distance</em>' containment reference.
   * @see #setGeoDistance(GeoDistanceFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_GeoDistance()
   * @model containment="true"
   * @generated
   */
  GeoDistanceFilter getGeoDistance();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoDistance <em>Geo Distance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Distance</em>' containment reference.
   * @see #getGeoDistance()
   * @generated
   */
  void setGeoDistance(GeoDistanceFilter value);

  /**
   * Returns the value of the '<em><b>Geo Distance Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geo Distance Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Distance Range</em>' containment reference.
   * @see #setGeoDistanceRange(GeoDistanceRangeFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_GeoDistanceRange()
   * @model containment="true"
   * @generated
   */
  GeoDistanceRangeFilter getGeoDistanceRange();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoDistanceRange <em>Geo Distance Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Distance Range</em>' containment reference.
   * @see #getGeoDistanceRange()
   * @generated
   */
  void setGeoDistanceRange(GeoDistanceRangeFilter value);

  /**
   * Returns the value of the '<em><b>Geo Polygon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geo Polygon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Polygon</em>' containment reference.
   * @see #setGeoPolygon(GeoPolygonFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_GeoPolygon()
   * @model containment="true"
   * @generated
   */
  GeoPolygonFilter getGeoPolygon();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoPolygon <em>Geo Polygon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Polygon</em>' containment reference.
   * @see #getGeoPolygon()
   * @generated
   */
  void setGeoPolygon(GeoPolygonFilter value);

  /**
   * Returns the value of the '<em><b>Geo Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geo Shape</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Shape</em>' containment reference.
   * @see #setGeoShape(GeoShapeFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_GeoShape()
   * @model containment="true"
   * @generated
   */
  GeoShapeFilter getGeoShape();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoShape <em>Geo Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Shape</em>' containment reference.
   * @see #getGeoShape()
   * @generated
   */
  void setGeoShape(GeoShapeFilter value);

  /**
   * Returns the value of the '<em><b>Geo Hash Cell</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geo Hash Cell</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Hash Cell</em>' containment reference.
   * @see #setGeoHashCell(GeohashCellFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_GeoHashCell()
   * @model containment="true"
   * @generated
   */
  GeohashCellFilter getGeoHashCell();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoHashCell <em>Geo Hash Cell</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Hash Cell</em>' containment reference.
   * @see #getGeoHashCell()
   * @generated
   */
  void setGeoHashCell(GeohashCellFilter value);

  /**
   * Returns the value of the '<em><b>Has Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Child</em>' containment reference.
   * @see #setHasChild(HasChildFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_HasChild()
   * @model containment="true"
   * @generated
   */
  HasChildFilter getHasChild();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getHasChild <em>Has Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Child</em>' containment reference.
   * @see #getHasChild()
   * @generated
   */
  void setHasChild(HasChildFilter value);

  /**
   * Returns the value of the '<em><b>Has Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Parent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Parent</em>' containment reference.
   * @see #setHasParent(HasParentFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_HasParent()
   * @model containment="true"
   * @generated
   */
  HasParentFilter getHasParent();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getHasParent <em>Has Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Parent</em>' containment reference.
   * @see #getHasParent()
   * @generated
   */
  void setHasParent(HasParentFilter value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Ids()
   * @model
   * @generated
   */
  String getIds();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getIds <em>Ids</em>}' attribute.
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
   * @see #setIndices(IndicesFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Indices()
   * @model containment="true"
   * @generated
   */
  IndicesFilter getIndices();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getIndices <em>Indices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indices</em>' containment reference.
   * @see #getIndices()
   * @generated
   */
  void setIndices(IndicesFilter value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' attribute.
   * @see #setLimit(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Limit()
   * @model
   * @generated
   */
  String getLimit();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getLimit <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' attribute.
   * @see #getLimit()
   * @generated
   */
  void setLimit(String value);

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
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_MatchAll()
   * @model
   * @generated
   */
  String getMatchAll();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getMatchAll <em>Match All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match All</em>' attribute.
   * @see #getMatchAll()
   * @generated
   */
  void setMatchAll(String value);

  /**
   * Returns the value of the '<em><b>Missing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Missing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Missing</em>' attribute.
   * @see #setMissing(String)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Missing()
   * @model
   * @generated
   */
  String getMissing();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getMissing <em>Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Missing</em>' attribute.
   * @see #getMissing()
   * @generated
   */
  void setMissing(String value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' containment reference.
   * @see #setNested(NestedFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Nested()
   * @model containment="true"
   * @generated
   */
  NestedFilter getNested();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getNested <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' containment reference.
   * @see #getNested()
   * @generated
   */
  void setNested(NestedFilter value);

  /**
   * Returns the value of the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' containment reference.
   * @see #setNot(NotFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Not()
   * @model containment="true"
   * @generated
   */
  NotFilter getNot();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getNot <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' containment reference.
   * @see #getNot()
   * @generated
   */
  void setNot(NotFilter value);

  /**
   * Returns the value of the '<em><b>Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' containment reference.
   * @see #setOr(OrFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Or()
   * @model containment="true"
   * @generated
   */
  OrFilter getOr();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getOr <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' containment reference.
   * @see #getOr()
   * @generated
   */
  void setOr(OrFilter value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(PrefixFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Prefix()
   * @model containment="true"
   * @generated
   */
  PrefixFilter getPrefix();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(PrefixFilter value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(QueryFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Query()
   * @model containment="true"
   * @generated
   */
  QueryFilter getQuery();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(QueryFilter value);

  /**
   * Returns the value of the '<em><b>Regexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regexp</em>' containment reference.
   * @see #setRegexp(RegexpFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Regexp()
   * @model containment="true"
   * @generated
   */
  RegexpFilter getRegexp();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getRegexp <em>Regexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regexp</em>' containment reference.
   * @see #getRegexp()
   * @generated
   */
  void setRegexp(RegexpFilter value);

  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference.
   * @see #setScript(ScriptFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Script()
   * @model containment="true"
   * @generated
   */
  ScriptFilter getScript();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(ScriptFilter value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(TermFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Term()
   * @model containment="true"
   * @generated
   */
  TermFilter getTerm();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(TermFilter value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(TermsFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Terms()
   * @model containment="true"
   * @generated
   */
  TermsFilter getTerms();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(TermsFilter value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeFilter)
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#getFilterType_Type()
   * @model containment="true"
   * @generated
   */
  TypeFilter getType();

  /**
   * Sets the value of the '{@link com.first8.elasticsearch.dsl.search.FilterType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeFilter value);

} // FilterType
