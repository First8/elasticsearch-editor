/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.first8.elasticsearch.dsl.search.SearchPackage
 * @generated
 */
public interface SearchFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SearchFactory eINSTANCE = com.first8.elasticsearch.dsl.search.impl.SearchFactoryImpl.init();

  /**
   * Returns a new object of class '<em>DSL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL</em>'.
   * @generated
   */
  SearchDSL createSearchDSL();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  SearchField createSearchField();

  /**
   * Returns a new object of class '<em>Stats</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stats</em>'.
   * @generated
   */
  Stats createStats();

  /**
   * Returns a new object of class '<em>Sort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort</em>'.
   * @generated
   */
  Sort createSort();

  /**
   * Returns a new object of class '<em>Sort Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Value</em>'.
   * @generated
   */
  SortValue createSortValue();

  /**
   * Returns a new object of class '<em>Short Sort Oject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Short Sort Oject</em>'.
   * @generated
   */
  ShortSortOject createShortSortOject();

  /**
   * Returns a new object of class '<em>Sort Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Object</em>'.
   * @generated
   */
  SortObject createSortObject();

  /**
   * Returns a new object of class '<em>Sort Object Properties Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Object Properties Object</em>'.
   * @generated
   */
  SortObjectPropertiesObject createSortObjectPropertiesObject();

  /**
   * Returns a new object of class '<em>Sort Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Object Property</em>'.
   * @generated
   */
  SortObjectProperty createSortObjectProperty();

  /**
   * Returns a new object of class '<em>SORT MODE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SORT MODE</em>'.
   * @generated
   */
  SORT_MODE createSORT_MODE();

  /**
   * Returns a new object of class '<em>ASC DESC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASC DESC</em>'.
   * @generated
   */
  ASC_DESC createASC_DESC();

  /**
   * Returns a new object of class '<em>Fields</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fields</em>'.
   * @generated
   */
  Fields createFields();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Object</em>'.
   * @generated
   */
  FilterObject createFilterObject();

  /**
   * Returns a new object of class '<em>Filter Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Type</em>'.
   * @generated
   */
  FilterType createFilterType();

  /**
   * Returns a new object of class '<em>Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Object</em>'.
   * @generated
   */
  QueryObject createQueryObject();

  /**
   * Returns a new object of class '<em>Query Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Type</em>'.
   * @generated
   */
  QueryType createQueryType();

  /**
   * Returns a new object of class '<em>Span Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Query</em>'.
   * @generated
   */
  SpanQuery createSpanQuery();

  /**
   * Returns a new object of class '<em>Multi Term Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Term Query</em>'.
   * @generated
   */
  MultiTermQuery createMultiTermQuery();

  /**
   * Returns a new object of class '<em>Facets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facets</em>'.
   * @generated
   */
  Facets createFacets();

  /**
   * Returns a new object of class '<em>Facets Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facets Object</em>'.
   * @generated
   */
  FacetsObject createFacetsObject();

  /**
   * Returns a new object of class '<em>Facet Type Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Type Object</em>'.
   * @generated
   */
  FacetTypeObject createFacetTypeObject();

  /**
   * Returns a new object of class '<em>Facet Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Type</em>'.
   * @generated
   */
  FacetType createFacetType();

  /**
   * Returns a new object of class '<em>Geo Distance Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Distance Facet</em>'.
   * @generated
   */
  GeoDistanceFacet createGeoDistanceFacet();

  /**
   * Returns a new object of class '<em>Geo Distance Facet Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Distance Facet Object</em>'.
   * @generated
   */
  GeoDistanceFacetObject createGeoDistanceFacetObject();

  /**
   * Returns a new object of class '<em>Terms Stats Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Stats Facet</em>'.
   * @generated
   */
  TermsStatsFacet createTermsStatsFacet();

  /**
   * Returns a new object of class '<em>Statistical Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statistical Facet</em>'.
   * @generated
   */
  StatisticalFacet createStatisticalFacet();

  /**
   * Returns a new object of class '<em>Statistical Facet Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statistical Facet Object</em>'.
   * @generated
   */
  StatisticalFacetObject createStatisticalFacetObject();

  /**
   * Returns a new object of class '<em>Query Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Facet</em>'.
   * @generated
   */
  QueryFacet createQueryFacet();

  /**
   * Returns a new object of class '<em>Filter Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Facet</em>'.
   * @generated
   */
  FilterFacet createFilterFacet();

  /**
   * Returns a new object of class '<em>Date Histogram Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Histogram Facet</em>'.
   * @generated
   */
  DateHistogramFacet createDateHistogramFacet();

  /**
   * Returns a new object of class '<em>Date Histogram Facet Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Histogram Facet Object</em>'.
   * @generated
   */
  DateHistogramFacetObject createDateHistogramFacetObject();

  /**
   * Returns a new object of class '<em>Histogram Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Histogram Facet</em>'.
   * @generated
   */
  HistogramFacet createHistogramFacet();

  /**
   * Returns a new object of class '<em>Histogram Facet Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Histogram Facet Object</em>'.
   * @generated
   */
  HistogramFacetObject createHistogramFacetObject();

  /**
   * Returns a new object of class '<em>Range Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Facet</em>'.
   * @generated
   */
  RangeFacet createRangeFacet();

  /**
   * Returns a new object of class '<em>Range Facet Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Facet Object</em>'.
   * @generated
   */
  RangeFacetObject createRangeFacetObject();

  /**
   * Returns a new object of class '<em>Key Value Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value Field</em>'.
   * @generated
   */
  KeyValueField createKeyValueField();

  /**
   * Returns a new object of class '<em>Key Value Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value Script</em>'.
   * @generated
   */
  KeyValueScript createKeyValueScript();

  /**
   * Returns a new object of class '<em>Terms Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Facet</em>'.
   * @generated
   */
  TermsFacet createTermsFacet();

  /**
   * Returns a new object of class '<em>Terms Facet Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Facet Object</em>'.
   * @generated
   */
  TermsFacetObject createTermsFacetObject();

  /**
   * Returns a new object of class '<em>Terms Facet Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Facet Parameter</em>'.
   * @generated
   */
  TermsFacetParameter createTermsFacetParameter();

  /**
   * Returns a new object of class '<em>Facet Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Parameter</em>'.
   * @generated
   */
  FacetParameter createFacetParameter();

  /**
   * Returns a new object of class '<em>Facet Filter Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Filter Param</em>'.
   * @generated
   */
  FacetFilterParam createFacetFilterParam();

  /**
   * Returns a new object of class '<em>All Terms Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Terms Param</em>'.
   * @generated
   */
  AllTermsParam createAllTermsParam();

  /**
   * Returns a new object of class '<em>Exclude Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exclude Param</em>'.
   * @generated
   */
  ExcludeParam createExcludeParam();

  /**
   * Returns a new object of class '<em>Script Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Param</em>'.
   * @generated
   */
  ScriptParam createScriptParam();

  /**
   * Returns a new object of class '<em>Script Field Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Field Param</em>'.
   * @generated
   */
  ScriptFieldParam createScriptFieldParam();

  /**
   * Returns a new object of class '<em>Like Text Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Like Text Param</em>'.
   * @generated
   */
  LikeTextParam createLikeTextParam();

  /**
   * Returns a new object of class '<em>Match Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Query</em>'.
   * @generated
   */
  MatchQuery createMatchQuery();

  /**
   * Returns a new object of class '<em>Short Match Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Short Match Query Object</em>'.
   * @generated
   */
  ShortMatchQueryObject createShortMatchQueryObject();

  /**
   * Returns a new object of class '<em>Match Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Query Object</em>'.
   * @generated
   */
  MatchQueryObject createMatchQueryObject();

  /**
   * Returns a new object of class '<em>Match Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Query Parameters Object</em>'.
   * @generated
   */
  MatchQueryParametersObject createMatchQueryParametersObject();

  /**
   * Returns a new object of class '<em>Multi Match Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Match Query</em>'.
   * @generated
   */
  MultiMatchQuery createMultiMatchQuery();

  /**
   * Returns a new object of class '<em>Multi Match Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Match Query Object</em>'.
   * @generated
   */
  MultiMatchQueryObject createMultiMatchQueryObject();

  /**
   * Returns a new object of class '<em>Bool Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Query</em>'.
   * @generated
   */
  BoolQuery createBoolQuery();

  /**
   * Returns a new object of class '<em>Bool Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Query Object</em>'.
   * @generated
   */
  BoolQueryObject createBoolQueryObject();

  /**
   * Returns a new object of class '<em>Bool Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Clause</em>'.
   * @generated
   */
  BoolClause createBoolClause();

  /**
   * Returns a new object of class '<em>Common Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Query</em>'.
   * @generated
   */
  CommonQuery createCommonQuery();

  /**
   * Returns a new object of class '<em>Common Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Query Object</em>'.
   * @generated
   */
  CommonQueryObject createCommonQueryObject();

  /**
   * Returns a new object of class '<em>Common Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Query Parameters Object</em>'.
   * @generated
   */
  CommonQueryParametersObject createCommonQueryParametersObject();

  /**
   * Returns a new object of class '<em>Constant Score Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Score Query</em>'.
   * @generated
   */
  ConstantScoreQuery createConstantScoreQuery();

  /**
   * Returns a new object of class '<em>Constant Score Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Score Query Object</em>'.
   * @generated
   */
  ConstantScoreQueryObject createConstantScoreQueryObject();

  /**
   * Returns a new object of class '<em>Dis Max Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dis Max Query</em>'.
   * @generated
   */
  DisMaxQuery createDisMaxQuery();

  /**
   * Returns a new object of class '<em>Dis Max Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dis Max Query Object</em>'.
   * @generated
   */
  DisMaxQueryObject createDisMaxQueryObject();

  /**
   * Returns a new object of class '<em>Filtered Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filtered Query</em>'.
   * @generated
   */
  FilteredQuery createFilteredQuery();

  /**
   * Returns a new object of class '<em>Filtered Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filtered Query Object</em>'.
   * @generated
   */
  FilteredQueryObject createFilteredQueryObject();

  /**
   * Returns a new object of class '<em>Fuzzy Like This Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Like This Query</em>'.
   * @generated
   */
  FuzzyLikeThisQuery createFuzzyLikeThisQuery();

  /**
   * Returns a new object of class '<em>Fuzzy Like This Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Like This Query Object</em>'.
   * @generated
   */
  FuzzyLikeThisQueryObject createFuzzyLikeThisQueryObject();

  /**
   * Returns a new object of class '<em>Fuzzy Like This Field Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Like This Field Query</em>'.
   * @generated
   */
  FuzzyLikeThisFieldQuery createFuzzyLikeThisFieldQuery();

  /**
   * Returns a new object of class '<em>Fuzzy Like This Field Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Like This Field Query Object</em>'.
   * @generated
   */
  FuzzyLikeThisFieldQueryObject createFuzzyLikeThisFieldQueryObject();

  /**
   * Returns a new object of class '<em>Fuzzy Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Query</em>'.
   * @generated
   */
  FuzzyQuery createFuzzyQuery();

  /**
   * Returns a new object of class '<em>Simple Fuzzy Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Fuzzy Query Object</em>'.
   * @generated
   */
  SimpleFuzzyQueryObject createSimpleFuzzyQueryObject();

  /**
   * Returns a new object of class '<em>Fuzzy Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Query Object</em>'.
   * @generated
   */
  FuzzyQueryObject createFuzzyQueryObject();

  /**
   * Returns a new object of class '<em>Fuzzy Query Object Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuzzy Query Object Parameters</em>'.
   * @generated
   */
  FuzzyQueryObjectParameters createFuzzyQueryObjectParameters();

  /**
   * Returns a new object of class '<em>Geoshape Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geoshape Query</em>'.
   * @generated
   */
  GeoshapeQuery createGeoshapeQuery();

  /**
   * Returns a new object of class '<em>Geoshape Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geoshape Query Object</em>'.
   * @generated
   */
  GeoshapeQueryObject createGeoshapeQueryObject();

  /**
   * Returns a new object of class '<em>Has Child Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Child Query</em>'.
   * @generated
   */
  HasChildQuery createHasChildQuery();

  /**
   * Returns a new object of class '<em>Has Child Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Child Query Object</em>'.
   * @generated
   */
  HasChildQueryObject createHasChildQueryObject();

  /**
   * Returns a new object of class '<em>Has Parent Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Parent Query</em>'.
   * @generated
   */
  HasParentQuery createHasParentQuery();

  /**
   * Returns a new object of class '<em>Has Parent Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Parent Query Object</em>'.
   * @generated
   */
  HasParentQueryObject createHasParentQueryObject();

  /**
   * Returns a new object of class '<em>Indices Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indices Query</em>'.
   * @generated
   */
  IndicesQuery createIndicesQuery();

  /**
   * Returns a new object of class '<em>Indices Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indices Query Object</em>'.
   * @generated
   */
  IndicesQueryObject createIndicesQueryObject();

  /**
   * Returns a new object of class '<em>More Like This Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Like This Query</em>'.
   * @generated
   */
  MoreLikeThisQuery createMoreLikeThisQuery();

  /**
   * Returns a new object of class '<em>More Like This Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Like This Query Object</em>'.
   * @generated
   */
  MoreLikeThisQueryObject createMoreLikeThisQueryObject();

  /**
   * Returns a new object of class '<em>More Like This Field Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Like This Field Query</em>'.
   * @generated
   */
  MoreLikeThisFieldQuery createMoreLikeThisFieldQuery();

  /**
   * Returns a new object of class '<em>More Like This Field Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Like This Field Query Object</em>'.
   * @generated
   */
  MoreLikeThisFieldQueryObject createMoreLikeThisFieldQueryObject();

  /**
   * Returns a new object of class '<em>Nested Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Query</em>'.
   * @generated
   */
  NestedQuery createNestedQuery();

  /**
   * Returns a new object of class '<em>Nested Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Query Object</em>'.
   * @generated
   */
  NestedQueryObject createNestedQueryObject();

  /**
   * Returns a new object of class '<em>Prefix Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Query</em>'.
   * @generated
   */
  PrefixQuery createPrefixQuery();

  /**
   * Returns a new object of class '<em>Simple Prefix Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Prefix Query Object</em>'.
   * @generated
   */
  SimplePrefixQueryObject createSimplePrefixQueryObject();

  /**
   * Returns a new object of class '<em>Prefix Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Query Object</em>'.
   * @generated
   */
  PrefixQueryObject createPrefixQueryObject();

  /**
   * Returns a new object of class '<em>Prefix Query Parameter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Query Parameter Object</em>'.
   * @generated
   */
  PrefixQueryParameterObject createPrefixQueryParameterObject();

  /**
   * Returns a new object of class '<em>Query String Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query String Query</em>'.
   * @generated
   */
  QueryStringQuery createQueryStringQuery();

  /**
   * Returns a new object of class '<em>Query String Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query String Query Object</em>'.
   * @generated
   */
  QueryStringQueryObject createQueryStringQueryObject();

  /**
   * Returns a new object of class '<em>Simple Query String Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Query String Query</em>'.
   * @generated
   */
  SimpleQueryStringQuery createSimpleQueryStringQuery();

  /**
   * Returns a new object of class '<em>Simple Query String Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Query String Query Object</em>'.
   * @generated
   */
  SimpleQueryStringQueryObject createSimpleQueryStringQueryObject();

  /**
   * Returns a new object of class '<em>Range Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Query</em>'.
   * @generated
   */
  RangeQuery createRangeQuery();

  /**
   * Returns a new object of class '<em>Range Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Query Object</em>'.
   * @generated
   */
  RangeQueryObject createRangeQueryObject();

  /**
   * Returns a new object of class '<em>Range Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Query Parameters Object</em>'.
   * @generated
   */
  RangeQueryParametersObject createRangeQueryParametersObject();

  /**
   * Returns a new object of class '<em>Regexp Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Query</em>'.
   * @generated
   */
  RegexpQuery createRegexpQuery();

  /**
   * Returns a new object of class '<em>Regexp Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Query Object</em>'.
   * @generated
   */
  RegexpQueryObject createRegexpQueryObject();

  /**
   * Returns a new object of class '<em>Regexp Query Parameter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Query Parameter Object</em>'.
   * @generated
   */
  RegexpQueryParameterObject createRegexpQueryParameterObject();

  /**
   * Returns a new object of class '<em>Span First Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span First Query</em>'.
   * @generated
   */
  SpanFirstQuery createSpanFirstQuery();

  /**
   * Returns a new object of class '<em>Span First Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span First Query Object</em>'.
   * @generated
   */
  SpanFirstQueryObject createSpanFirstQueryObject();

  /**
   * Returns a new object of class '<em>Span Multi Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Multi Query</em>'.
   * @generated
   */
  SpanMultiQuery createSpanMultiQuery();

  /**
   * Returns a new object of class '<em>Span Multi Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Multi Query Object</em>'.
   * @generated
   */
  SpanMultiQueryObject createSpanMultiQueryObject();

  /**
   * Returns a new object of class '<em>Span Near Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Near Query</em>'.
   * @generated
   */
  SpanNearQuery createSpanNearQuery();

  /**
   * Returns a new object of class '<em>Span Near Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Near Query Object</em>'.
   * @generated
   */
  SpanNearQueryObject createSpanNearQueryObject();

  /**
   * Returns a new object of class '<em>Span Not Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Not Query</em>'.
   * @generated
   */
  SpanNotQuery createSpanNotQuery();

  /**
   * Returns a new object of class '<em>Span Not Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Not Query Object</em>'.
   * @generated
   */
  SpanNotQueryObject createSpanNotQueryObject();

  /**
   * Returns a new object of class '<em>Span Or Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Or Query</em>'.
   * @generated
   */
  SpanOrQuery createSpanOrQuery();

  /**
   * Returns a new object of class '<em>Span Or Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Or Query Object</em>'.
   * @generated
   */
  SpanOrQueryObject createSpanOrQueryObject();

  /**
   * Returns a new object of class '<em>Span Term Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Term Query</em>'.
   * @generated
   */
  SpanTermQuery createSpanTermQuery();

  /**
   * Returns a new object of class '<em>Span Term Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Span Term Query Object</em>'.
   * @generated
   */
  SpanTermQueryObject createSpanTermQueryObject();

  /**
   * Returns a new object of class '<em>Term Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Query</em>'.
   * @generated
   */
  TermQuery createTermQuery();

  /**
   * Returns a new object of class '<em>Term Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Query Object</em>'.
   * @generated
   */
  TermQueryObject createTermQueryObject();

  /**
   * Returns a new object of class '<em>Term Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Query Parameters Object</em>'.
   * @generated
   */
  TermQueryParametersObject createTermQueryParametersObject();

  /**
   * Returns a new object of class '<em>Terms Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Query</em>'.
   * @generated
   */
  TermsQuery createTermsQuery();

  /**
   * Returns a new object of class '<em>Terms Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Query Object</em>'.
   * @generated
   */
  TermsQueryObject createTermsQueryObject();

  /**
   * Returns a new object of class '<em>Top Children Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Children Query</em>'.
   * @generated
   */
  TopChildrenQuery createTopChildrenQuery();

  /**
   * Returns a new object of class '<em>Top Children Query Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Children Query Object</em>'.
   * @generated
   */
  TopChildrenQueryObject createTopChildrenQueryObject();

  /**
   * Returns a new object of class '<em>Wildcard Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Query</em>'.
   * @generated
   */
  WildcardQuery createWildcardQuery();

  /**
   * Returns a new object of class '<em>And Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Filter</em>'.
   * @generated
   */
  AndFilter createAndFilter();

  /**
   * Returns a new object of class '<em>Simple And Filter Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple And Filter Array</em>'.
   * @generated
   */
  SimpleAndFilterArray createSimpleAndFilterArray();

  /**
   * Returns a new object of class '<em>And Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Filter Object</em>'.
   * @generated
   */
  AndFilterObject createAndFilterObject();

  /**
   * Returns a new object of class '<em>Bool Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Filter</em>'.
   * @generated
   */
  BoolFilter createBoolFilter();

  /**
   * Returns a new object of class '<em>Bool Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Filter Object</em>'.
   * @generated
   */
  BoolFilterObject createBoolFilterObject();

  /**
   * Returns a new object of class '<em>Bool Filter Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Filter Clause</em>'.
   * @generated
   */
  BoolFilterClause createBoolFilterClause();

  /**
   * Returns a new object of class '<em>Geo Bounding Box Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Bounding Box Filter</em>'.
   * @generated
   */
  GeoBoundingBoxFilter createGeoBoundingBoxFilter();

  /**
   * Returns a new object of class '<em>Geo Bounding Box Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Bounding Box Filter Object</em>'.
   * @generated
   */
  GeoBoundingBoxFilterObject createGeoBoundingBoxFilterObject();

  /**
   * Returns a new object of class '<em>Geo Distance Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Distance Filter</em>'.
   * @generated
   */
  GeoDistanceFilter createGeoDistanceFilter();

  /**
   * Returns a new object of class '<em>Geo Distance Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Distance Filter Object</em>'.
   * @generated
   */
  GeoDistanceFilterObject createGeoDistanceFilterObject();

  /**
   * Returns a new object of class '<em>Geo Distance Range Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Distance Range Filter</em>'.
   * @generated
   */
  GeoDistanceRangeFilter createGeoDistanceRangeFilter();

  /**
   * Returns a new object of class '<em>Geo Distance Range Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Distance Range Filter Object</em>'.
   * @generated
   */
  GeoDistanceRangeFilterObject createGeoDistanceRangeFilterObject();

  /**
   * Returns a new object of class '<em>Geo Polygon Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Polygon Filter</em>'.
   * @generated
   */
  GeoPolygonFilter createGeoPolygonFilter();

  /**
   * Returns a new object of class '<em>Geo Polygon Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Polygon Filter Object</em>'.
   * @generated
   */
  GeoPolygonFilterObject createGeoPolygonFilterObject();

  /**
   * Returns a new object of class '<em>Geo Shape Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Shape Filter</em>'.
   * @generated
   */
  GeoShapeFilter createGeoShapeFilter();

  /**
   * Returns a new object of class '<em>Geo Shape Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Shape Filter Object</em>'.
   * @generated
   */
  GeoShapeFilterObject createGeoShapeFilterObject();

  /**
   * Returns a new object of class '<em>Geohash Cell Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geohash Cell Filter</em>'.
   * @generated
   */
  GeohashCellFilter createGeohashCellFilter();

  /**
   * Returns a new object of class '<em>Geohash Cell Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geohash Cell Filter Object</em>'.
   * @generated
   */
  GeohashCellFilterObject createGeohashCellFilterObject();

  /**
   * Returns a new object of class '<em>Has Child Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Child Filter</em>'.
   * @generated
   */
  HasChildFilter createHasChildFilter();

  /**
   * Returns a new object of class '<em>Has Child Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Child Filter Object</em>'.
   * @generated
   */
  HasChildFilterObject createHasChildFilterObject();

  /**
   * Returns a new object of class '<em>Has Parent Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Parent Filter</em>'.
   * @generated
   */
  HasParentFilter createHasParentFilter();

  /**
   * Returns a new object of class '<em>Has Parent Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Parent Filter Object</em>'.
   * @generated
   */
  HasParentFilterObject createHasParentFilterObject();

  /**
   * Returns a new object of class '<em>Indices Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indices Filter</em>'.
   * @generated
   */
  IndicesFilter createIndicesFilter();

  /**
   * Returns a new object of class '<em>Indices Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indices Filter Object</em>'.
   * @generated
   */
  IndicesFilterObject createIndicesFilterObject();

  /**
   * Returns a new object of class '<em>Nested Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Filter</em>'.
   * @generated
   */
  NestedFilter createNestedFilter();

  /**
   * Returns a new object of class '<em>Nested Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Filter Object</em>'.
   * @generated
   */
  NestedFilterObject createNestedFilterObject();

  /**
   * Returns a new object of class '<em>Not Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Filter</em>'.
   * @generated
   */
  NotFilter createNotFilter();

  /**
   * Returns a new object of class '<em>Not Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Filter Object</em>'.
   * @generated
   */
  NotFilterObject createNotFilterObject();

  /**
   * Returns a new object of class '<em>Or Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Filter</em>'.
   * @generated
   */
  OrFilter createOrFilter();

  /**
   * Returns a new object of class '<em>Or Filter Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Filter Array</em>'.
   * @generated
   */
  OrFilterArray createOrFilterArray();

  /**
   * Returns a new object of class '<em>Prefix Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Filter</em>'.
   * @generated
   */
  PrefixFilter createPrefixFilter();

  /**
   * Returns a new object of class '<em>Prefix Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Filter Object</em>'.
   * @generated
   */
  PrefixFilterObject createPrefixFilterObject();

  /**
   * Returns a new object of class '<em>Query Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Filter</em>'.
   * @generated
   */
  QueryFilter createQueryFilter();

  /**
   * Returns a new object of class '<em>FQuery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FQuery</em>'.
   * @generated
   */
  FQuery createFQuery();

  /**
   * Returns a new object of class '<em>Range Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Filter</em>'.
   * @generated
   */
  RangeFilter createRangeFilter();

  /**
   * Returns a new object of class '<em>Range Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Filter Object</em>'.
   * @generated
   */
  RangeFilterObject createRangeFilterObject();

  /**
   * Returns a new object of class '<em>Range Filter Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Filter Parameters Object</em>'.
   * @generated
   */
  RangeFilterParametersObject createRangeFilterParametersObject();

  /**
   * Returns a new object of class '<em>Regexp Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Filter</em>'.
   * @generated
   */
  RegexpFilter createRegexpFilter();

  /**
   * Returns a new object of class '<em>Regexp Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Filter Object</em>'.
   * @generated
   */
  RegexpFilterObject createRegexpFilterObject();

  /**
   * Returns a new object of class '<em>Regexp Filter Parameter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regexp Filter Parameter Object</em>'.
   * @generated
   */
  RegexpFilterParameterObject createRegexpFilterParameterObject();

  /**
   * Returns a new object of class '<em>Script Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Filter</em>'.
   * @generated
   */
  ScriptFilter createScriptFilter();

  /**
   * Returns a new object of class '<em>Script Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Filter Object</em>'.
   * @generated
   */
  ScriptFilterObject createScriptFilterObject();

  /**
   * Returns a new object of class '<em>Term Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Filter</em>'.
   * @generated
   */
  TermFilter createTermFilter();

  /**
   * Returns a new object of class '<em>Term Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Filter Object</em>'.
   * @generated
   */
  TermFilterObject createTermFilterObject();

  /**
   * Returns a new object of class '<em>Terms Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Filter</em>'.
   * @generated
   */
  TermsFilter createTermsFilter();

  /**
   * Returns a new object of class '<em>Terms Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms Filter Object</em>'.
   * @generated
   */
  TermsFilterObject createTermsFilterObject();

  /**
   * Returns a new object of class '<em>Type Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Filter</em>'.
   * @generated
   */
  TypeFilter createTypeFilter();

  /**
   * Returns a new object of class '<em>Type Filter Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Filter Object</em>'.
   * @generated
   */
  TypeFilterObject createTypeFilterObject();

  /**
   * Returns a new object of class '<em>Geo Shape Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Shape Object</em>'.
   * @generated
   */
  GeoShapeObject createGeoShapeObject();

  /**
   * Returns a new object of class '<em>Geo Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Shape</em>'.
   * @generated
   */
  GeoShape createGeoShape();

  /**
   * Returns a new object of class '<em>Polygon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polygon</em>'.
   * @generated
   */
  Polygon createPolygon();

  /**
   * Returns a new object of class '<em>Bounding Box Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bounding Box Object</em>'.
   * @generated
   */
  BoundingBoxObject createBoundingBoxObject();

  /**
   * Returns a new object of class '<em>Two Point Bounding Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Two Point Bounding Box</em>'.
   * @generated
   */
  TwoPointBoundingBox createTwoPointBoundingBox();

  /**
   * Returns a new object of class '<em>Lat Lon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lat Lon</em>'.
   * @generated
   */
  LatLon createLatLon();

  /**
   * Returns a new object of class '<em>Lat Lon Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lat Lon Array</em>'.
   * @generated
   */
  LatLonArray createLatLonArray();

  /**
   * Returns a new object of class '<em>Lat Lon String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lat Lon String</em>'.
   * @generated
   */
  LatLonString createLatLonString();

  /**
   * Returns a new object of class '<em>Shape Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Object</em>'.
   * @generated
   */
  ShapeObject createShapeObject();

  /**
   * Returns a new object of class '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape</em>'.
   * @generated
   */
  Shape createShape();

  /**
   * Returns a new object of class '<em>Shape Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Type</em>'.
   * @generated
   */
  ShapeType createShapeType();

  /**
   * Returns a new object of class '<em>Shape Type Envelope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Type Envelope</em>'.
   * @generated
   */
  ShapeTypeEnvelope createShapeTypeEnvelope();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array</em>'.
   * @generated
   */
  Array createArray();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SearchPackage getSearchPackage();

} //SearchFactory
