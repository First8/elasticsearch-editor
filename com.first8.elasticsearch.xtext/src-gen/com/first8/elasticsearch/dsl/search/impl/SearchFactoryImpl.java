/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.ASC_DESC;
import com.first8.elasticsearch.dsl.search.AllTermsParam;
import com.first8.elasticsearch.dsl.search.AndFilter;
import com.first8.elasticsearch.dsl.search.AndFilterObject;
import com.first8.elasticsearch.dsl.search.Array;
import com.first8.elasticsearch.dsl.search.BoolClause;
import com.first8.elasticsearch.dsl.search.BoolFilter;
import com.first8.elasticsearch.dsl.search.BoolFilterClause;
import com.first8.elasticsearch.dsl.search.BoolFilterObject;
import com.first8.elasticsearch.dsl.search.BoolQuery;
import com.first8.elasticsearch.dsl.search.BoolQueryObject;
import com.first8.elasticsearch.dsl.search.BoundingBoxObject;
import com.first8.elasticsearch.dsl.search.CommonQuery;
import com.first8.elasticsearch.dsl.search.CommonQueryObject;
import com.first8.elasticsearch.dsl.search.CommonQueryParametersObject;
import com.first8.elasticsearch.dsl.search.ConstantScoreQuery;
import com.first8.elasticsearch.dsl.search.ConstantScoreQueryObject;
import com.first8.elasticsearch.dsl.search.DateHistogramFacet;
import com.first8.elasticsearch.dsl.search.DateHistogramFacetObject;
import com.first8.elasticsearch.dsl.search.DisMaxQuery;
import com.first8.elasticsearch.dsl.search.DisMaxQueryObject;
import com.first8.elasticsearch.dsl.search.ExcludeParam;
import com.first8.elasticsearch.dsl.search.FQuery;
import com.first8.elasticsearch.dsl.search.FacetFilterParam;
import com.first8.elasticsearch.dsl.search.FacetParameter;
import com.first8.elasticsearch.dsl.search.FacetType;
import com.first8.elasticsearch.dsl.search.FacetTypeObject;
import com.first8.elasticsearch.dsl.search.Facets;
import com.first8.elasticsearch.dsl.search.FacetsObject;
import com.first8.elasticsearch.dsl.search.Fields;
import com.first8.elasticsearch.dsl.search.Filter;
import com.first8.elasticsearch.dsl.search.FilterFacet;
import com.first8.elasticsearch.dsl.search.FilterObject;
import com.first8.elasticsearch.dsl.search.FilterType;
import com.first8.elasticsearch.dsl.search.FilteredQuery;
import com.first8.elasticsearch.dsl.search.FilteredQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQuery;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisQuery;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyQuery;
import com.first8.elasticsearch.dsl.search.FuzzyQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters;
import com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilter;
import com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject;
import com.first8.elasticsearch.dsl.search.GeoDistanceFacet;
import com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject;
import com.first8.elasticsearch.dsl.search.GeoDistanceFilter;
import com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject;
import com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilter;
import com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject;
import com.first8.elasticsearch.dsl.search.GeoPolygonFilter;
import com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject;
import com.first8.elasticsearch.dsl.search.GeoShape;
import com.first8.elasticsearch.dsl.search.GeoShapeFilter;
import com.first8.elasticsearch.dsl.search.GeoShapeFilterObject;
import com.first8.elasticsearch.dsl.search.GeoShapeObject;
import com.first8.elasticsearch.dsl.search.GeohashCellFilter;
import com.first8.elasticsearch.dsl.search.GeohashCellFilterObject;
import com.first8.elasticsearch.dsl.search.GeoshapeQuery;
import com.first8.elasticsearch.dsl.search.GeoshapeQueryObject;
import com.first8.elasticsearch.dsl.search.HasChildFilter;
import com.first8.elasticsearch.dsl.search.HasChildFilterObject;
import com.first8.elasticsearch.dsl.search.HasChildQuery;
import com.first8.elasticsearch.dsl.search.HasChildQueryObject;
import com.first8.elasticsearch.dsl.search.HasParentFilter;
import com.first8.elasticsearch.dsl.search.HasParentFilterObject;
import com.first8.elasticsearch.dsl.search.HasParentQuery;
import com.first8.elasticsearch.dsl.search.HasParentQueryObject;
import com.first8.elasticsearch.dsl.search.HistogramFacet;
import com.first8.elasticsearch.dsl.search.HistogramFacetObject;
import com.first8.elasticsearch.dsl.search.IndicesFilter;
import com.first8.elasticsearch.dsl.search.IndicesFilterObject;
import com.first8.elasticsearch.dsl.search.IndicesQuery;
import com.first8.elasticsearch.dsl.search.IndicesQueryObject;
import com.first8.elasticsearch.dsl.search.KeyValueField;
import com.first8.elasticsearch.dsl.search.KeyValueScript;
import com.first8.elasticsearch.dsl.search.LatLon;
import com.first8.elasticsearch.dsl.search.LatLonArray;
import com.first8.elasticsearch.dsl.search.LatLonString;
import com.first8.elasticsearch.dsl.search.LikeTextParam;
import com.first8.elasticsearch.dsl.search.MatchQuery;
import com.first8.elasticsearch.dsl.search.MatchQueryObject;
import com.first8.elasticsearch.dsl.search.MatchQueryParametersObject;
import com.first8.elasticsearch.dsl.search.Member;
import com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQuery;
import com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject;
import com.first8.elasticsearch.dsl.search.MoreLikeThisQuery;
import com.first8.elasticsearch.dsl.search.MoreLikeThisQueryObject;
import com.first8.elasticsearch.dsl.search.MultiMatchQuery;
import com.first8.elasticsearch.dsl.search.MultiMatchQueryObject;
import com.first8.elasticsearch.dsl.search.MultiTermQuery;
import com.first8.elasticsearch.dsl.search.NestedFilter;
import com.first8.elasticsearch.dsl.search.NestedFilterObject;
import com.first8.elasticsearch.dsl.search.NestedQuery;
import com.first8.elasticsearch.dsl.search.NestedQueryObject;
import com.first8.elasticsearch.dsl.search.NotFilter;
import com.first8.elasticsearch.dsl.search.NotFilterObject;
import com.first8.elasticsearch.dsl.search.OrFilter;
import com.first8.elasticsearch.dsl.search.OrFilterArray;
import com.first8.elasticsearch.dsl.search.Polygon;
import com.first8.elasticsearch.dsl.search.PrefixFilter;
import com.first8.elasticsearch.dsl.search.PrefixFilterObject;
import com.first8.elasticsearch.dsl.search.PrefixQuery;
import com.first8.elasticsearch.dsl.search.PrefixQueryObject;
import com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject;
import com.first8.elasticsearch.dsl.search.Query;
import com.first8.elasticsearch.dsl.search.QueryFacet;
import com.first8.elasticsearch.dsl.search.QueryFilter;
import com.first8.elasticsearch.dsl.search.QueryObject;
import com.first8.elasticsearch.dsl.search.QueryStringQuery;
import com.first8.elasticsearch.dsl.search.QueryStringQueryObject;
import com.first8.elasticsearch.dsl.search.QueryType;
import com.first8.elasticsearch.dsl.search.RangeFacet;
import com.first8.elasticsearch.dsl.search.RangeFacetObject;
import com.first8.elasticsearch.dsl.search.RangeFilter;
import com.first8.elasticsearch.dsl.search.RangeFilterObject;
import com.first8.elasticsearch.dsl.search.RangeFilterParametersObject;
import com.first8.elasticsearch.dsl.search.RangeQuery;
import com.first8.elasticsearch.dsl.search.RangeQueryObject;
import com.first8.elasticsearch.dsl.search.RangeQueryParametersObject;
import com.first8.elasticsearch.dsl.search.RegexpFilter;
import com.first8.elasticsearch.dsl.search.RegexpFilterObject;
import com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject;
import com.first8.elasticsearch.dsl.search.RegexpQuery;
import com.first8.elasticsearch.dsl.search.RegexpQueryObject;
import com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject;
import com.first8.elasticsearch.dsl.search.SORT_MODE;
import com.first8.elasticsearch.dsl.search.ScriptFieldParam;
import com.first8.elasticsearch.dsl.search.ScriptFilter;
import com.first8.elasticsearch.dsl.search.ScriptFilterObject;
import com.first8.elasticsearch.dsl.search.ScriptParam;
import com.first8.elasticsearch.dsl.search.SearchDSL;
import com.first8.elasticsearch.dsl.search.SearchFactory;
import com.first8.elasticsearch.dsl.search.SearchField;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.Shape;
import com.first8.elasticsearch.dsl.search.ShapeObject;
import com.first8.elasticsearch.dsl.search.ShapeType;
import com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope;
import com.first8.elasticsearch.dsl.search.ShortMatchQueryObject;
import com.first8.elasticsearch.dsl.search.ShortSortOject;
import com.first8.elasticsearch.dsl.search.SimpleAndFilterArray;
import com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject;
import com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject;
import com.first8.elasticsearch.dsl.search.SimpleQueryStringQuery;
import com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject;
import com.first8.elasticsearch.dsl.search.Sort;
import com.first8.elasticsearch.dsl.search.SortObject;
import com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject;
import com.first8.elasticsearch.dsl.search.SortObjectProperty;
import com.first8.elasticsearch.dsl.search.SortValue;
import com.first8.elasticsearch.dsl.search.SpanFirstQuery;
import com.first8.elasticsearch.dsl.search.SpanFirstQueryObject;
import com.first8.elasticsearch.dsl.search.SpanMultiQuery;
import com.first8.elasticsearch.dsl.search.SpanMultiQueryObject;
import com.first8.elasticsearch.dsl.search.SpanNearQuery;
import com.first8.elasticsearch.dsl.search.SpanNearQueryObject;
import com.first8.elasticsearch.dsl.search.SpanNotQuery;
import com.first8.elasticsearch.dsl.search.SpanNotQueryObject;
import com.first8.elasticsearch.dsl.search.SpanOrQuery;
import com.first8.elasticsearch.dsl.search.SpanOrQueryObject;
import com.first8.elasticsearch.dsl.search.SpanQuery;
import com.first8.elasticsearch.dsl.search.SpanTermQuery;
import com.first8.elasticsearch.dsl.search.SpanTermQueryObject;
import com.first8.elasticsearch.dsl.search.StatisticalFacet;
import com.first8.elasticsearch.dsl.search.StatisticalFacetObject;
import com.first8.elasticsearch.dsl.search.Stats;
import com.first8.elasticsearch.dsl.search.TermFilter;
import com.first8.elasticsearch.dsl.search.TermFilterObject;
import com.first8.elasticsearch.dsl.search.TermQuery;
import com.first8.elasticsearch.dsl.search.TermQueryObject;
import com.first8.elasticsearch.dsl.search.TermQueryParametersObject;
import com.first8.elasticsearch.dsl.search.TermsFacet;
import com.first8.elasticsearch.dsl.search.TermsFacetObject;
import com.first8.elasticsearch.dsl.search.TermsFacetParameter;
import com.first8.elasticsearch.dsl.search.TermsFilter;
import com.first8.elasticsearch.dsl.search.TermsFilterObject;
import com.first8.elasticsearch.dsl.search.TermsQuery;
import com.first8.elasticsearch.dsl.search.TermsQueryObject;
import com.first8.elasticsearch.dsl.search.TermsStatsFacet;
import com.first8.elasticsearch.dsl.search.TopChildrenQuery;
import com.first8.elasticsearch.dsl.search.TopChildrenQueryObject;
import com.first8.elasticsearch.dsl.search.TwoPointBoundingBox;
import com.first8.elasticsearch.dsl.search.TypeFilter;
import com.first8.elasticsearch.dsl.search.TypeFilterObject;
import com.first8.elasticsearch.dsl.search.Value;
import com.first8.elasticsearch.dsl.search.WildcardQuery;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchFactoryImpl extends EFactoryImpl implements SearchFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SearchFactory init()
  {
    try
    {
      SearchFactory theSearchFactory = (SearchFactory)EPackage.Registry.INSTANCE.getEFactory(SearchPackage.eNS_URI);
      if (theSearchFactory != null)
      {
        return theSearchFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SearchFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SearchPackage.SEARCH_DSL: return createSearchDSL();
      case SearchPackage.SEARCH_FIELD: return createSearchField();
      case SearchPackage.STATS: return createStats();
      case SearchPackage.SORT: return createSort();
      case SearchPackage.SORT_VALUE: return createSortValue();
      case SearchPackage.SHORT_SORT_OJECT: return createShortSortOject();
      case SearchPackage.SORT_OBJECT: return createSortObject();
      case SearchPackage.SORT_OBJECT_PROPERTIES_OBJECT: return createSortObjectPropertiesObject();
      case SearchPackage.SORT_OBJECT_PROPERTY: return createSortObjectProperty();
      case SearchPackage.SORT_MODE: return createSORT_MODE();
      case SearchPackage.ASC_DESC: return createASC_DESC();
      case SearchPackage.FIELDS: return createFields();
      case SearchPackage.QUERY: return createQuery();
      case SearchPackage.FILTER: return createFilter();
      case SearchPackage.FILTER_OBJECT: return createFilterObject();
      case SearchPackage.FILTER_TYPE: return createFilterType();
      case SearchPackage.QUERY_OBJECT: return createQueryObject();
      case SearchPackage.QUERY_TYPE: return createQueryType();
      case SearchPackage.SPAN_QUERY: return createSpanQuery();
      case SearchPackage.MULTI_TERM_QUERY: return createMultiTermQuery();
      case SearchPackage.FACETS: return createFacets();
      case SearchPackage.FACETS_OBJECT: return createFacetsObject();
      case SearchPackage.FACET_TYPE_OBJECT: return createFacetTypeObject();
      case SearchPackage.FACET_TYPE: return createFacetType();
      case SearchPackage.GEO_DISTANCE_FACET: return createGeoDistanceFacet();
      case SearchPackage.GEO_DISTANCE_FACET_OBJECT: return createGeoDistanceFacetObject();
      case SearchPackage.TERMS_STATS_FACET: return createTermsStatsFacet();
      case SearchPackage.STATISTICAL_FACET: return createStatisticalFacet();
      case SearchPackage.STATISTICAL_FACET_OBJECT: return createStatisticalFacetObject();
      case SearchPackage.QUERY_FACET: return createQueryFacet();
      case SearchPackage.FILTER_FACET: return createFilterFacet();
      case SearchPackage.DATE_HISTOGRAM_FACET: return createDateHistogramFacet();
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT: return createDateHistogramFacetObject();
      case SearchPackage.HISTOGRAM_FACET: return createHistogramFacet();
      case SearchPackage.HISTOGRAM_FACET_OBJECT: return createHistogramFacetObject();
      case SearchPackage.RANGE_FACET: return createRangeFacet();
      case SearchPackage.RANGE_FACET_OBJECT: return createRangeFacetObject();
      case SearchPackage.KEY_VALUE_FIELD: return createKeyValueField();
      case SearchPackage.KEY_VALUE_SCRIPT: return createKeyValueScript();
      case SearchPackage.TERMS_FACET: return createTermsFacet();
      case SearchPackage.TERMS_FACET_OBJECT: return createTermsFacetObject();
      case SearchPackage.TERMS_FACET_PARAMETER: return createTermsFacetParameter();
      case SearchPackage.FACET_PARAMETER: return createFacetParameter();
      case SearchPackage.FACET_FILTER_PARAM: return createFacetFilterParam();
      case SearchPackage.ALL_TERMS_PARAM: return createAllTermsParam();
      case SearchPackage.EXCLUDE_PARAM: return createExcludeParam();
      case SearchPackage.SCRIPT_PARAM: return createScriptParam();
      case SearchPackage.SCRIPT_FIELD_PARAM: return createScriptFieldParam();
      case SearchPackage.LIKE_TEXT_PARAM: return createLikeTextParam();
      case SearchPackage.MATCH_QUERY: return createMatchQuery();
      case SearchPackage.SHORT_MATCH_QUERY_OBJECT: return createShortMatchQueryObject();
      case SearchPackage.MATCH_QUERY_OBJECT: return createMatchQueryObject();
      case SearchPackage.MATCH_QUERY_PARAMETERS_OBJECT: return createMatchQueryParametersObject();
      case SearchPackage.MULTI_MATCH_QUERY: return createMultiMatchQuery();
      case SearchPackage.MULTI_MATCH_QUERY_OBJECT: return createMultiMatchQueryObject();
      case SearchPackage.BOOL_QUERY: return createBoolQuery();
      case SearchPackage.BOOL_QUERY_OBJECT: return createBoolQueryObject();
      case SearchPackage.BOOL_CLAUSE: return createBoolClause();
      case SearchPackage.COMMON_QUERY: return createCommonQuery();
      case SearchPackage.COMMON_QUERY_OBJECT: return createCommonQueryObject();
      case SearchPackage.COMMON_QUERY_PARAMETERS_OBJECT: return createCommonQueryParametersObject();
      case SearchPackage.CONSTANT_SCORE_QUERY: return createConstantScoreQuery();
      case SearchPackage.CONSTANT_SCORE_QUERY_OBJECT: return createConstantScoreQueryObject();
      case SearchPackage.DIS_MAX_QUERY: return createDisMaxQuery();
      case SearchPackage.DIS_MAX_QUERY_OBJECT: return createDisMaxQueryObject();
      case SearchPackage.FILTERED_QUERY: return createFilteredQuery();
      case SearchPackage.FILTERED_QUERY_OBJECT: return createFilteredQueryObject();
      case SearchPackage.FUZZY_LIKE_THIS_QUERY: return createFuzzyLikeThisQuery();
      case SearchPackage.FUZZY_LIKE_THIS_QUERY_OBJECT: return createFuzzyLikeThisQueryObject();
      case SearchPackage.FUZZY_LIKE_THIS_FIELD_QUERY: return createFuzzyLikeThisFieldQuery();
      case SearchPackage.FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT: return createFuzzyLikeThisFieldQueryObject();
      case SearchPackage.FUZZY_QUERY: return createFuzzyQuery();
      case SearchPackage.SIMPLE_FUZZY_QUERY_OBJECT: return createSimpleFuzzyQueryObject();
      case SearchPackage.FUZZY_QUERY_OBJECT: return createFuzzyQueryObject();
      case SearchPackage.FUZZY_QUERY_OBJECT_PARAMETERS: return createFuzzyQueryObjectParameters();
      case SearchPackage.GEOSHAPE_QUERY: return createGeoshapeQuery();
      case SearchPackage.GEOSHAPE_QUERY_OBJECT: return createGeoshapeQueryObject();
      case SearchPackage.HAS_CHILD_QUERY: return createHasChildQuery();
      case SearchPackage.HAS_CHILD_QUERY_OBJECT: return createHasChildQueryObject();
      case SearchPackage.HAS_PARENT_QUERY: return createHasParentQuery();
      case SearchPackage.HAS_PARENT_QUERY_OBJECT: return createHasParentQueryObject();
      case SearchPackage.INDICES_QUERY: return createIndicesQuery();
      case SearchPackage.INDICES_QUERY_OBJECT: return createIndicesQueryObject();
      case SearchPackage.MORE_LIKE_THIS_QUERY: return createMoreLikeThisQuery();
      case SearchPackage.MORE_LIKE_THIS_QUERY_OBJECT: return createMoreLikeThisQueryObject();
      case SearchPackage.MORE_LIKE_THIS_FIELD_QUERY: return createMoreLikeThisFieldQuery();
      case SearchPackage.MORE_LIKE_THIS_FIELD_QUERY_OBJECT: return createMoreLikeThisFieldQueryObject();
      case SearchPackage.NESTED_QUERY: return createNestedQuery();
      case SearchPackage.NESTED_QUERY_OBJECT: return createNestedQueryObject();
      case SearchPackage.PREFIX_QUERY: return createPrefixQuery();
      case SearchPackage.SIMPLE_PREFIX_QUERY_OBJECT: return createSimplePrefixQueryObject();
      case SearchPackage.PREFIX_QUERY_OBJECT: return createPrefixQueryObject();
      case SearchPackage.PREFIX_QUERY_PARAMETER_OBJECT: return createPrefixQueryParameterObject();
      case SearchPackage.QUERY_STRING_QUERY: return createQueryStringQuery();
      case SearchPackage.QUERY_STRING_QUERY_OBJECT: return createQueryStringQueryObject();
      case SearchPackage.SIMPLE_QUERY_STRING_QUERY: return createSimpleQueryStringQuery();
      case SearchPackage.SIMPLE_QUERY_STRING_QUERY_OBJECT: return createSimpleQueryStringQueryObject();
      case SearchPackage.RANGE_QUERY: return createRangeQuery();
      case SearchPackage.RANGE_QUERY_OBJECT: return createRangeQueryObject();
      case SearchPackage.RANGE_QUERY_PARAMETERS_OBJECT: return createRangeQueryParametersObject();
      case SearchPackage.REGEXP_QUERY: return createRegexpQuery();
      case SearchPackage.REGEXP_QUERY_OBJECT: return createRegexpQueryObject();
      case SearchPackage.REGEXP_QUERY_PARAMETER_OBJECT: return createRegexpQueryParameterObject();
      case SearchPackage.SPAN_FIRST_QUERY: return createSpanFirstQuery();
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT: return createSpanFirstQueryObject();
      case SearchPackage.SPAN_MULTI_QUERY: return createSpanMultiQuery();
      case SearchPackage.SPAN_MULTI_QUERY_OBJECT: return createSpanMultiQueryObject();
      case SearchPackage.SPAN_NEAR_QUERY: return createSpanNearQuery();
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT: return createSpanNearQueryObject();
      case SearchPackage.SPAN_NOT_QUERY: return createSpanNotQuery();
      case SearchPackage.SPAN_NOT_QUERY_OBJECT: return createSpanNotQueryObject();
      case SearchPackage.SPAN_OR_QUERY: return createSpanOrQuery();
      case SearchPackage.SPAN_OR_QUERY_OBJECT: return createSpanOrQueryObject();
      case SearchPackage.SPAN_TERM_QUERY: return createSpanTermQuery();
      case SearchPackage.SPAN_TERM_QUERY_OBJECT: return createSpanTermQueryObject();
      case SearchPackage.TERM_QUERY: return createTermQuery();
      case SearchPackage.TERM_QUERY_OBJECT: return createTermQueryObject();
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT: return createTermQueryParametersObject();
      case SearchPackage.TERMS_QUERY: return createTermsQuery();
      case SearchPackage.TERMS_QUERY_OBJECT: return createTermsQueryObject();
      case SearchPackage.TOP_CHILDREN_QUERY: return createTopChildrenQuery();
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT: return createTopChildrenQueryObject();
      case SearchPackage.WILDCARD_QUERY: return createWildcardQuery();
      case SearchPackage.AND_FILTER: return createAndFilter();
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY: return createSimpleAndFilterArray();
      case SearchPackage.AND_FILTER_OBJECT: return createAndFilterObject();
      case SearchPackage.BOOL_FILTER: return createBoolFilter();
      case SearchPackage.BOOL_FILTER_OBJECT: return createBoolFilterObject();
      case SearchPackage.BOOL_FILTER_CLAUSE: return createBoolFilterClause();
      case SearchPackage.GEO_BOUNDING_BOX_FILTER: return createGeoBoundingBoxFilter();
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT: return createGeoBoundingBoxFilterObject();
      case SearchPackage.GEO_DISTANCE_FILTER: return createGeoDistanceFilter();
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT: return createGeoDistanceFilterObject();
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER: return createGeoDistanceRangeFilter();
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT: return createGeoDistanceRangeFilterObject();
      case SearchPackage.GEO_POLYGON_FILTER: return createGeoPolygonFilter();
      case SearchPackage.GEO_POLYGON_FILTER_OBJECT: return createGeoPolygonFilterObject();
      case SearchPackage.GEO_SHAPE_FILTER: return createGeoShapeFilter();
      case SearchPackage.GEO_SHAPE_FILTER_OBJECT: return createGeoShapeFilterObject();
      case SearchPackage.GEOHASH_CELL_FILTER: return createGeohashCellFilter();
      case SearchPackage.GEOHASH_CELL_FILTER_OBJECT: return createGeohashCellFilterObject();
      case SearchPackage.HAS_CHILD_FILTER: return createHasChildFilter();
      case SearchPackage.HAS_CHILD_FILTER_OBJECT: return createHasChildFilterObject();
      case SearchPackage.HAS_PARENT_FILTER: return createHasParentFilter();
      case SearchPackage.HAS_PARENT_FILTER_OBJECT: return createHasParentFilterObject();
      case SearchPackage.INDICES_FILTER: return createIndicesFilter();
      case SearchPackage.INDICES_FILTER_OBJECT: return createIndicesFilterObject();
      case SearchPackage.NESTED_FILTER: return createNestedFilter();
      case SearchPackage.NESTED_FILTER_OBJECT: return createNestedFilterObject();
      case SearchPackage.NOT_FILTER: return createNotFilter();
      case SearchPackage.NOT_FILTER_OBJECT: return createNotFilterObject();
      case SearchPackage.OR_FILTER: return createOrFilter();
      case SearchPackage.OR_FILTER_ARRAY: return createOrFilterArray();
      case SearchPackage.PREFIX_FILTER: return createPrefixFilter();
      case SearchPackage.PREFIX_FILTER_OBJECT: return createPrefixFilterObject();
      case SearchPackage.QUERY_FILTER: return createQueryFilter();
      case SearchPackage.FQUERY: return createFQuery();
      case SearchPackage.RANGE_FILTER: return createRangeFilter();
      case SearchPackage.RANGE_FILTER_OBJECT: return createRangeFilterObject();
      case SearchPackage.RANGE_FILTER_PARAMETERS_OBJECT: return createRangeFilterParametersObject();
      case SearchPackage.REGEXP_FILTER: return createRegexpFilter();
      case SearchPackage.REGEXP_FILTER_OBJECT: return createRegexpFilterObject();
      case SearchPackage.REGEXP_FILTER_PARAMETER_OBJECT: return createRegexpFilterParameterObject();
      case SearchPackage.SCRIPT_FILTER: return createScriptFilter();
      case SearchPackage.SCRIPT_FILTER_OBJECT: return createScriptFilterObject();
      case SearchPackage.TERM_FILTER: return createTermFilter();
      case SearchPackage.TERM_FILTER_OBJECT: return createTermFilterObject();
      case SearchPackage.TERMS_FILTER: return createTermsFilter();
      case SearchPackage.TERMS_FILTER_OBJECT: return createTermsFilterObject();
      case SearchPackage.TYPE_FILTER: return createTypeFilter();
      case SearchPackage.TYPE_FILTER_OBJECT: return createTypeFilterObject();
      case SearchPackage.GEO_SHAPE_OBJECT: return createGeoShapeObject();
      case SearchPackage.GEO_SHAPE: return createGeoShape();
      case SearchPackage.POLYGON: return createPolygon();
      case SearchPackage.BOUNDING_BOX_OBJECT: return createBoundingBoxObject();
      case SearchPackage.TWO_POINT_BOUNDING_BOX: return createTwoPointBoundingBox();
      case SearchPackage.LAT_LON: return createLatLon();
      case SearchPackage.LAT_LON_ARRAY: return createLatLonArray();
      case SearchPackage.LAT_LON_STRING: return createLatLonString();
      case SearchPackage.SHAPE_OBJECT: return createShapeObject();
      case SearchPackage.SHAPE: return createShape();
      case SearchPackage.SHAPE_TYPE: return createShapeType();
      case SearchPackage.SHAPE_TYPE_ENVELOPE: return createShapeTypeEnvelope();
      case SearchPackage.OBJECT: return createObject();
      case SearchPackage.MEMBER: return createMember();
      case SearchPackage.VALUE: return createValue();
      case SearchPackage.ARRAY: return createArray();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDSL createSearchDSL()
  {
    SearchDSLImpl searchDSL = new SearchDSLImpl();
    return searchDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchField createSearchField()
  {
    SearchFieldImpl searchField = new SearchFieldImpl();
    return searchField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stats createStats()
  {
    StatsImpl stats = new StatsImpl();
    return stats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sort createSort()
  {
    SortImpl sort = new SortImpl();
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortValue createSortValue()
  {
    SortValueImpl sortValue = new SortValueImpl();
    return sortValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortSortOject createShortSortOject()
  {
    ShortSortOjectImpl shortSortOject = new ShortSortOjectImpl();
    return shortSortOject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortObject createSortObject()
  {
    SortObjectImpl sortObject = new SortObjectImpl();
    return sortObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortObjectPropertiesObject createSortObjectPropertiesObject()
  {
    SortObjectPropertiesObjectImpl sortObjectPropertiesObject = new SortObjectPropertiesObjectImpl();
    return sortObjectPropertiesObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortObjectProperty createSortObjectProperty()
  {
    SortObjectPropertyImpl sortObjectProperty = new SortObjectPropertyImpl();
    return sortObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SORT_MODE createSORT_MODE()
  {
    SORT_MODEImpl sorT_MODE = new SORT_MODEImpl();
    return sorT_MODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASC_DESC createASC_DESC()
  {
    ASC_DESCImpl asC_DESC = new ASC_DESCImpl();
    return asC_DESC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fields createFields()
  {
    FieldsImpl fields = new FieldsImpl();
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterObject createFilterObject()
  {
    FilterObjectImpl filterObject = new FilterObjectImpl();
    return filterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterType createFilterType()
  {
    FilterTypeImpl filterType = new FilterTypeImpl();
    return filterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryObject createQueryObject()
  {
    QueryObjectImpl queryObject = new QueryObjectImpl();
    return queryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryType createQueryType()
  {
    QueryTypeImpl queryType = new QueryTypeImpl();
    return queryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanQuery createSpanQuery()
  {
    SpanQueryImpl spanQuery = new SpanQueryImpl();
    return spanQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiTermQuery createMultiTermQuery()
  {
    MultiTermQueryImpl multiTermQuery = new MultiTermQueryImpl();
    return multiTermQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facets createFacets()
  {
    FacetsImpl facets = new FacetsImpl();
    return facets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetsObject createFacetsObject()
  {
    FacetsObjectImpl facetsObject = new FacetsObjectImpl();
    return facetsObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetTypeObject createFacetTypeObject()
  {
    FacetTypeObjectImpl facetTypeObject = new FacetTypeObjectImpl();
    return facetTypeObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetType createFacetType()
  {
    FacetTypeImpl facetType = new FacetTypeImpl();
    return facetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceFacet createGeoDistanceFacet()
  {
    GeoDistanceFacetImpl geoDistanceFacet = new GeoDistanceFacetImpl();
    return geoDistanceFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceFacetObject createGeoDistanceFacetObject()
  {
    GeoDistanceFacetObjectImpl geoDistanceFacetObject = new GeoDistanceFacetObjectImpl();
    return geoDistanceFacetObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsStatsFacet createTermsStatsFacet()
  {
    TermsStatsFacetImpl termsStatsFacet = new TermsStatsFacetImpl();
    return termsStatsFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatisticalFacet createStatisticalFacet()
  {
    StatisticalFacetImpl statisticalFacet = new StatisticalFacetImpl();
    return statisticalFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatisticalFacetObject createStatisticalFacetObject()
  {
    StatisticalFacetObjectImpl statisticalFacetObject = new StatisticalFacetObjectImpl();
    return statisticalFacetObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFacet createQueryFacet()
  {
    QueryFacetImpl queryFacet = new QueryFacetImpl();
    return queryFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterFacet createFilterFacet()
  {
    FilterFacetImpl filterFacet = new FilterFacetImpl();
    return filterFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateHistogramFacet createDateHistogramFacet()
  {
    DateHistogramFacetImpl dateHistogramFacet = new DateHistogramFacetImpl();
    return dateHistogramFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateHistogramFacetObject createDateHistogramFacetObject()
  {
    DateHistogramFacetObjectImpl dateHistogramFacetObject = new DateHistogramFacetObjectImpl();
    return dateHistogramFacetObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HistogramFacet createHistogramFacet()
  {
    HistogramFacetImpl histogramFacet = new HistogramFacetImpl();
    return histogramFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HistogramFacetObject createHistogramFacetObject()
  {
    HistogramFacetObjectImpl histogramFacetObject = new HistogramFacetObjectImpl();
    return histogramFacetObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeFacet createRangeFacet()
  {
    RangeFacetImpl rangeFacet = new RangeFacetImpl();
    return rangeFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeFacetObject createRangeFacetObject()
  {
    RangeFacetObjectImpl rangeFacetObject = new RangeFacetObjectImpl();
    return rangeFacetObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueField createKeyValueField()
  {
    KeyValueFieldImpl keyValueField = new KeyValueFieldImpl();
    return keyValueField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueScript createKeyValueScript()
  {
    KeyValueScriptImpl keyValueScript = new KeyValueScriptImpl();
    return keyValueScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFacet createTermsFacet()
  {
    TermsFacetImpl termsFacet = new TermsFacetImpl();
    return termsFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFacetObject createTermsFacetObject()
  {
    TermsFacetObjectImpl termsFacetObject = new TermsFacetObjectImpl();
    return termsFacetObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFacetParameter createTermsFacetParameter()
  {
    TermsFacetParameterImpl termsFacetParameter = new TermsFacetParameterImpl();
    return termsFacetParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetParameter createFacetParameter()
  {
    FacetParameterImpl facetParameter = new FacetParameterImpl();
    return facetParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetFilterParam createFacetFilterParam()
  {
    FacetFilterParamImpl facetFilterParam = new FacetFilterParamImpl();
    return facetFilterParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllTermsParam createAllTermsParam()
  {
    AllTermsParamImpl allTermsParam = new AllTermsParamImpl();
    return allTermsParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcludeParam createExcludeParam()
  {
    ExcludeParamImpl excludeParam = new ExcludeParamImpl();
    return excludeParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptParam createScriptParam()
  {
    ScriptParamImpl scriptParam = new ScriptParamImpl();
    return scriptParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptFieldParam createScriptFieldParam()
  {
    ScriptFieldParamImpl scriptFieldParam = new ScriptFieldParamImpl();
    return scriptFieldParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikeTextParam createLikeTextParam()
  {
    LikeTextParamImpl likeTextParam = new LikeTextParamImpl();
    return likeTextParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchQuery createMatchQuery()
  {
    MatchQueryImpl matchQuery = new MatchQueryImpl();
    return matchQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortMatchQueryObject createShortMatchQueryObject()
  {
    ShortMatchQueryObjectImpl shortMatchQueryObject = new ShortMatchQueryObjectImpl();
    return shortMatchQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchQueryObject createMatchQueryObject()
  {
    MatchQueryObjectImpl matchQueryObject = new MatchQueryObjectImpl();
    return matchQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchQueryParametersObject createMatchQueryParametersObject()
  {
    MatchQueryParametersObjectImpl matchQueryParametersObject = new MatchQueryParametersObjectImpl();
    return matchQueryParametersObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiMatchQuery createMultiMatchQuery()
  {
    MultiMatchQueryImpl multiMatchQuery = new MultiMatchQueryImpl();
    return multiMatchQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiMatchQueryObject createMultiMatchQueryObject()
  {
    MultiMatchQueryObjectImpl multiMatchQueryObject = new MultiMatchQueryObjectImpl();
    return multiMatchQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolQuery createBoolQuery()
  {
    BoolQueryImpl boolQuery = new BoolQueryImpl();
    return boolQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolQueryObject createBoolQueryObject()
  {
    BoolQueryObjectImpl boolQueryObject = new BoolQueryObjectImpl();
    return boolQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolClause createBoolClause()
  {
    BoolClauseImpl boolClause = new BoolClauseImpl();
    return boolClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonQuery createCommonQuery()
  {
    CommonQueryImpl commonQuery = new CommonQueryImpl();
    return commonQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonQueryObject createCommonQueryObject()
  {
    CommonQueryObjectImpl commonQueryObject = new CommonQueryObjectImpl();
    return commonQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonQueryParametersObject createCommonQueryParametersObject()
  {
    CommonQueryParametersObjectImpl commonQueryParametersObject = new CommonQueryParametersObjectImpl();
    return commonQueryParametersObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantScoreQuery createConstantScoreQuery()
  {
    ConstantScoreQueryImpl constantScoreQuery = new ConstantScoreQueryImpl();
    return constantScoreQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantScoreQueryObject createConstantScoreQueryObject()
  {
    ConstantScoreQueryObjectImpl constantScoreQueryObject = new ConstantScoreQueryObjectImpl();
    return constantScoreQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisMaxQuery createDisMaxQuery()
  {
    DisMaxQueryImpl disMaxQuery = new DisMaxQueryImpl();
    return disMaxQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisMaxQueryObject createDisMaxQueryObject()
  {
    DisMaxQueryObjectImpl disMaxQueryObject = new DisMaxQueryObjectImpl();
    return disMaxQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilteredQuery createFilteredQuery()
  {
    FilteredQueryImpl filteredQuery = new FilteredQueryImpl();
    return filteredQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilteredQueryObject createFilteredQueryObject()
  {
    FilteredQueryObjectImpl filteredQueryObject = new FilteredQueryObjectImpl();
    return filteredQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyLikeThisQuery createFuzzyLikeThisQuery()
  {
    FuzzyLikeThisQueryImpl fuzzyLikeThisQuery = new FuzzyLikeThisQueryImpl();
    return fuzzyLikeThisQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyLikeThisQueryObject createFuzzyLikeThisQueryObject()
  {
    FuzzyLikeThisQueryObjectImpl fuzzyLikeThisQueryObject = new FuzzyLikeThisQueryObjectImpl();
    return fuzzyLikeThisQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyLikeThisFieldQuery createFuzzyLikeThisFieldQuery()
  {
    FuzzyLikeThisFieldQueryImpl fuzzyLikeThisFieldQuery = new FuzzyLikeThisFieldQueryImpl();
    return fuzzyLikeThisFieldQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyLikeThisFieldQueryObject createFuzzyLikeThisFieldQueryObject()
  {
    FuzzyLikeThisFieldQueryObjectImpl fuzzyLikeThisFieldQueryObject = new FuzzyLikeThisFieldQueryObjectImpl();
    return fuzzyLikeThisFieldQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyQuery createFuzzyQuery()
  {
    FuzzyQueryImpl fuzzyQuery = new FuzzyQueryImpl();
    return fuzzyQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleFuzzyQueryObject createSimpleFuzzyQueryObject()
  {
    SimpleFuzzyQueryObjectImpl simpleFuzzyQueryObject = new SimpleFuzzyQueryObjectImpl();
    return simpleFuzzyQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyQueryObject createFuzzyQueryObject()
  {
    FuzzyQueryObjectImpl fuzzyQueryObject = new FuzzyQueryObjectImpl();
    return fuzzyQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyQueryObjectParameters createFuzzyQueryObjectParameters()
  {
    FuzzyQueryObjectParametersImpl fuzzyQueryObjectParameters = new FuzzyQueryObjectParametersImpl();
    return fuzzyQueryObjectParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoshapeQuery createGeoshapeQuery()
  {
    GeoshapeQueryImpl geoshapeQuery = new GeoshapeQueryImpl();
    return geoshapeQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoshapeQueryObject createGeoshapeQueryObject()
  {
    GeoshapeQueryObjectImpl geoshapeQueryObject = new GeoshapeQueryObjectImpl();
    return geoshapeQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasChildQuery createHasChildQuery()
  {
    HasChildQueryImpl hasChildQuery = new HasChildQueryImpl();
    return hasChildQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasChildQueryObject createHasChildQueryObject()
  {
    HasChildQueryObjectImpl hasChildQueryObject = new HasChildQueryObjectImpl();
    return hasChildQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasParentQuery createHasParentQuery()
  {
    HasParentQueryImpl hasParentQuery = new HasParentQueryImpl();
    return hasParentQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasParentQueryObject createHasParentQueryObject()
  {
    HasParentQueryObjectImpl hasParentQueryObject = new HasParentQueryObjectImpl();
    return hasParentQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicesQuery createIndicesQuery()
  {
    IndicesQueryImpl indicesQuery = new IndicesQueryImpl();
    return indicesQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicesQueryObject createIndicesQueryObject()
  {
    IndicesQueryObjectImpl indicesQueryObject = new IndicesQueryObjectImpl();
    return indicesQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreLikeThisQuery createMoreLikeThisQuery()
  {
    MoreLikeThisQueryImpl moreLikeThisQuery = new MoreLikeThisQueryImpl();
    return moreLikeThisQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreLikeThisQueryObject createMoreLikeThisQueryObject()
  {
    MoreLikeThisQueryObjectImpl moreLikeThisQueryObject = new MoreLikeThisQueryObjectImpl();
    return moreLikeThisQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreLikeThisFieldQuery createMoreLikeThisFieldQuery()
  {
    MoreLikeThisFieldQueryImpl moreLikeThisFieldQuery = new MoreLikeThisFieldQueryImpl();
    return moreLikeThisFieldQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreLikeThisFieldQueryObject createMoreLikeThisFieldQueryObject()
  {
    MoreLikeThisFieldQueryObjectImpl moreLikeThisFieldQueryObject = new MoreLikeThisFieldQueryObjectImpl();
    return moreLikeThisFieldQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQuery createNestedQuery()
  {
    NestedQueryImpl nestedQuery = new NestedQueryImpl();
    return nestedQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQueryObject createNestedQueryObject()
  {
    NestedQueryObjectImpl nestedQueryObject = new NestedQueryObjectImpl();
    return nestedQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixQuery createPrefixQuery()
  {
    PrefixQueryImpl prefixQuery = new PrefixQueryImpl();
    return prefixQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplePrefixQueryObject createSimplePrefixQueryObject()
  {
    SimplePrefixQueryObjectImpl simplePrefixQueryObject = new SimplePrefixQueryObjectImpl();
    return simplePrefixQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixQueryObject createPrefixQueryObject()
  {
    PrefixQueryObjectImpl prefixQueryObject = new PrefixQueryObjectImpl();
    return prefixQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixQueryParameterObject createPrefixQueryParameterObject()
  {
    PrefixQueryParameterObjectImpl prefixQueryParameterObject = new PrefixQueryParameterObjectImpl();
    return prefixQueryParameterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryStringQuery createQueryStringQuery()
  {
    QueryStringQueryImpl queryStringQuery = new QueryStringQueryImpl();
    return queryStringQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryStringQueryObject createQueryStringQueryObject()
  {
    QueryStringQueryObjectImpl queryStringQueryObject = new QueryStringQueryObjectImpl();
    return queryStringQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleQueryStringQuery createSimpleQueryStringQuery()
  {
    SimpleQueryStringQueryImpl simpleQueryStringQuery = new SimpleQueryStringQueryImpl();
    return simpleQueryStringQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleQueryStringQueryObject createSimpleQueryStringQueryObject()
  {
    SimpleQueryStringQueryObjectImpl simpleQueryStringQueryObject = new SimpleQueryStringQueryObjectImpl();
    return simpleQueryStringQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeQuery createRangeQuery()
  {
    RangeQueryImpl rangeQuery = new RangeQueryImpl();
    return rangeQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeQueryObject createRangeQueryObject()
  {
    RangeQueryObjectImpl rangeQueryObject = new RangeQueryObjectImpl();
    return rangeQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeQueryParametersObject createRangeQueryParametersObject()
  {
    RangeQueryParametersObjectImpl rangeQueryParametersObject = new RangeQueryParametersObjectImpl();
    return rangeQueryParametersObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpQuery createRegexpQuery()
  {
    RegexpQueryImpl regexpQuery = new RegexpQueryImpl();
    return regexpQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpQueryObject createRegexpQueryObject()
  {
    RegexpQueryObjectImpl regexpQueryObject = new RegexpQueryObjectImpl();
    return regexpQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpQueryParameterObject createRegexpQueryParameterObject()
  {
    RegexpQueryParameterObjectImpl regexpQueryParameterObject = new RegexpQueryParameterObjectImpl();
    return regexpQueryParameterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanFirstQuery createSpanFirstQuery()
  {
    SpanFirstQueryImpl spanFirstQuery = new SpanFirstQueryImpl();
    return spanFirstQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanFirstQueryObject createSpanFirstQueryObject()
  {
    SpanFirstQueryObjectImpl spanFirstQueryObject = new SpanFirstQueryObjectImpl();
    return spanFirstQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanMultiQuery createSpanMultiQuery()
  {
    SpanMultiQueryImpl spanMultiQuery = new SpanMultiQueryImpl();
    return spanMultiQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanMultiQueryObject createSpanMultiQueryObject()
  {
    SpanMultiQueryObjectImpl spanMultiQueryObject = new SpanMultiQueryObjectImpl();
    return spanMultiQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanNearQuery createSpanNearQuery()
  {
    SpanNearQueryImpl spanNearQuery = new SpanNearQueryImpl();
    return spanNearQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanNearQueryObject createSpanNearQueryObject()
  {
    SpanNearQueryObjectImpl spanNearQueryObject = new SpanNearQueryObjectImpl();
    return spanNearQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanNotQuery createSpanNotQuery()
  {
    SpanNotQueryImpl spanNotQuery = new SpanNotQueryImpl();
    return spanNotQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanNotQueryObject createSpanNotQueryObject()
  {
    SpanNotQueryObjectImpl spanNotQueryObject = new SpanNotQueryObjectImpl();
    return spanNotQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanOrQuery createSpanOrQuery()
  {
    SpanOrQueryImpl spanOrQuery = new SpanOrQueryImpl();
    return spanOrQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanOrQueryObject createSpanOrQueryObject()
  {
    SpanOrQueryObjectImpl spanOrQueryObject = new SpanOrQueryObjectImpl();
    return spanOrQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanTermQuery createSpanTermQuery()
  {
    SpanTermQueryImpl spanTermQuery = new SpanTermQueryImpl();
    return spanTermQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanTermQueryObject createSpanTermQueryObject()
  {
    SpanTermQueryObjectImpl spanTermQueryObject = new SpanTermQueryObjectImpl();
    return spanTermQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermQuery createTermQuery()
  {
    TermQueryImpl termQuery = new TermQueryImpl();
    return termQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermQueryObject createTermQueryObject()
  {
    TermQueryObjectImpl termQueryObject = new TermQueryObjectImpl();
    return termQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermQueryParametersObject createTermQueryParametersObject()
  {
    TermQueryParametersObjectImpl termQueryParametersObject = new TermQueryParametersObjectImpl();
    return termQueryParametersObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsQuery createTermsQuery()
  {
    TermsQueryImpl termsQuery = new TermsQueryImpl();
    return termsQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsQueryObject createTermsQueryObject()
  {
    TermsQueryObjectImpl termsQueryObject = new TermsQueryObjectImpl();
    return termsQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopChildrenQuery createTopChildrenQuery()
  {
    TopChildrenQueryImpl topChildrenQuery = new TopChildrenQueryImpl();
    return topChildrenQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopChildrenQueryObject createTopChildrenQueryObject()
  {
    TopChildrenQueryObjectImpl topChildrenQueryObject = new TopChildrenQueryObjectImpl();
    return topChildrenQueryObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WildcardQuery createWildcardQuery()
  {
    WildcardQueryImpl wildcardQuery = new WildcardQueryImpl();
    return wildcardQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndFilter createAndFilter()
  {
    AndFilterImpl andFilter = new AndFilterImpl();
    return andFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleAndFilterArray createSimpleAndFilterArray()
  {
    SimpleAndFilterArrayImpl simpleAndFilterArray = new SimpleAndFilterArrayImpl();
    return simpleAndFilterArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndFilterObject createAndFilterObject()
  {
    AndFilterObjectImpl andFilterObject = new AndFilterObjectImpl();
    return andFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolFilter createBoolFilter()
  {
    BoolFilterImpl boolFilter = new BoolFilterImpl();
    return boolFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolFilterObject createBoolFilterObject()
  {
    BoolFilterObjectImpl boolFilterObject = new BoolFilterObjectImpl();
    return boolFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolFilterClause createBoolFilterClause()
  {
    BoolFilterClauseImpl boolFilterClause = new BoolFilterClauseImpl();
    return boolFilterClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoBoundingBoxFilter createGeoBoundingBoxFilter()
  {
    GeoBoundingBoxFilterImpl geoBoundingBoxFilter = new GeoBoundingBoxFilterImpl();
    return geoBoundingBoxFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoBoundingBoxFilterObject createGeoBoundingBoxFilterObject()
  {
    GeoBoundingBoxFilterObjectImpl geoBoundingBoxFilterObject = new GeoBoundingBoxFilterObjectImpl();
    return geoBoundingBoxFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceFilter createGeoDistanceFilter()
  {
    GeoDistanceFilterImpl geoDistanceFilter = new GeoDistanceFilterImpl();
    return geoDistanceFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceFilterObject createGeoDistanceFilterObject()
  {
    GeoDistanceFilterObjectImpl geoDistanceFilterObject = new GeoDistanceFilterObjectImpl();
    return geoDistanceFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceRangeFilter createGeoDistanceRangeFilter()
  {
    GeoDistanceRangeFilterImpl geoDistanceRangeFilter = new GeoDistanceRangeFilterImpl();
    return geoDistanceRangeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceRangeFilterObject createGeoDistanceRangeFilterObject()
  {
    GeoDistanceRangeFilterObjectImpl geoDistanceRangeFilterObject = new GeoDistanceRangeFilterObjectImpl();
    return geoDistanceRangeFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoPolygonFilter createGeoPolygonFilter()
  {
    GeoPolygonFilterImpl geoPolygonFilter = new GeoPolygonFilterImpl();
    return geoPolygonFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoPolygonFilterObject createGeoPolygonFilterObject()
  {
    GeoPolygonFilterObjectImpl geoPolygonFilterObject = new GeoPolygonFilterObjectImpl();
    return geoPolygonFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoShapeFilter createGeoShapeFilter()
  {
    GeoShapeFilterImpl geoShapeFilter = new GeoShapeFilterImpl();
    return geoShapeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoShapeFilterObject createGeoShapeFilterObject()
  {
    GeoShapeFilterObjectImpl geoShapeFilterObject = new GeoShapeFilterObjectImpl();
    return geoShapeFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeohashCellFilter createGeohashCellFilter()
  {
    GeohashCellFilterImpl geohashCellFilter = new GeohashCellFilterImpl();
    return geohashCellFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeohashCellFilterObject createGeohashCellFilterObject()
  {
    GeohashCellFilterObjectImpl geohashCellFilterObject = new GeohashCellFilterObjectImpl();
    return geohashCellFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasChildFilter createHasChildFilter()
  {
    HasChildFilterImpl hasChildFilter = new HasChildFilterImpl();
    return hasChildFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasChildFilterObject createHasChildFilterObject()
  {
    HasChildFilterObjectImpl hasChildFilterObject = new HasChildFilterObjectImpl();
    return hasChildFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasParentFilter createHasParentFilter()
  {
    HasParentFilterImpl hasParentFilter = new HasParentFilterImpl();
    return hasParentFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasParentFilterObject createHasParentFilterObject()
  {
    HasParentFilterObjectImpl hasParentFilterObject = new HasParentFilterObjectImpl();
    return hasParentFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicesFilter createIndicesFilter()
  {
    IndicesFilterImpl indicesFilter = new IndicesFilterImpl();
    return indicesFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicesFilterObject createIndicesFilterObject()
  {
    IndicesFilterObjectImpl indicesFilterObject = new IndicesFilterObjectImpl();
    return indicesFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedFilter createNestedFilter()
  {
    NestedFilterImpl nestedFilter = new NestedFilterImpl();
    return nestedFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedFilterObject createNestedFilterObject()
  {
    NestedFilterObjectImpl nestedFilterObject = new NestedFilterObjectImpl();
    return nestedFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotFilter createNotFilter()
  {
    NotFilterImpl notFilter = new NotFilterImpl();
    return notFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotFilterObject createNotFilterObject()
  {
    NotFilterObjectImpl notFilterObject = new NotFilterObjectImpl();
    return notFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrFilter createOrFilter()
  {
    OrFilterImpl orFilter = new OrFilterImpl();
    return orFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrFilterArray createOrFilterArray()
  {
    OrFilterArrayImpl orFilterArray = new OrFilterArrayImpl();
    return orFilterArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixFilter createPrefixFilter()
  {
    PrefixFilterImpl prefixFilter = new PrefixFilterImpl();
    return prefixFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixFilterObject createPrefixFilterObject()
  {
    PrefixFilterObjectImpl prefixFilterObject = new PrefixFilterObjectImpl();
    return prefixFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFilter createQueryFilter()
  {
    QueryFilterImpl queryFilter = new QueryFilterImpl();
    return queryFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FQuery createFQuery()
  {
    FQueryImpl fQuery = new FQueryImpl();
    return fQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeFilter createRangeFilter()
  {
    RangeFilterImpl rangeFilter = new RangeFilterImpl();
    return rangeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeFilterObject createRangeFilterObject()
  {
    RangeFilterObjectImpl rangeFilterObject = new RangeFilterObjectImpl();
    return rangeFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeFilterParametersObject createRangeFilterParametersObject()
  {
    RangeFilterParametersObjectImpl rangeFilterParametersObject = new RangeFilterParametersObjectImpl();
    return rangeFilterParametersObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpFilter createRegexpFilter()
  {
    RegexpFilterImpl regexpFilter = new RegexpFilterImpl();
    return regexpFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpFilterObject createRegexpFilterObject()
  {
    RegexpFilterObjectImpl regexpFilterObject = new RegexpFilterObjectImpl();
    return regexpFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpFilterParameterObject createRegexpFilterParameterObject()
  {
    RegexpFilterParameterObjectImpl regexpFilterParameterObject = new RegexpFilterParameterObjectImpl();
    return regexpFilterParameterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptFilter createScriptFilter()
  {
    ScriptFilterImpl scriptFilter = new ScriptFilterImpl();
    return scriptFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptFilterObject createScriptFilterObject()
  {
    ScriptFilterObjectImpl scriptFilterObject = new ScriptFilterObjectImpl();
    return scriptFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermFilter createTermFilter()
  {
    TermFilterImpl termFilter = new TermFilterImpl();
    return termFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermFilterObject createTermFilterObject()
  {
    TermFilterObjectImpl termFilterObject = new TermFilterObjectImpl();
    return termFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFilter createTermsFilter()
  {
    TermsFilterImpl termsFilter = new TermsFilterImpl();
    return termsFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFilterObject createTermsFilterObject()
  {
    TermsFilterObjectImpl termsFilterObject = new TermsFilterObjectImpl();
    return termsFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFilter createTypeFilter()
  {
    TypeFilterImpl typeFilter = new TypeFilterImpl();
    return typeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFilterObject createTypeFilterObject()
  {
    TypeFilterObjectImpl typeFilterObject = new TypeFilterObjectImpl();
    return typeFilterObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoShapeObject createGeoShapeObject()
  {
    GeoShapeObjectImpl geoShapeObject = new GeoShapeObjectImpl();
    return geoShapeObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoShape createGeoShape()
  {
    GeoShapeImpl geoShape = new GeoShapeImpl();
    return geoShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polygon createPolygon()
  {
    PolygonImpl polygon = new PolygonImpl();
    return polygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundingBoxObject createBoundingBoxObject()
  {
    BoundingBoxObjectImpl boundingBoxObject = new BoundingBoxObjectImpl();
    return boundingBoxObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoPointBoundingBox createTwoPointBoundingBox()
  {
    TwoPointBoundingBoxImpl twoPointBoundingBox = new TwoPointBoundingBoxImpl();
    return twoPointBoundingBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLon createLatLon()
  {
    LatLonImpl latLon = new LatLonImpl();
    return latLon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLonArray createLatLonArray()
  {
    LatLonArrayImpl latLonArray = new LatLonArrayImpl();
    return latLonArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatLonString createLatLonString()
  {
    LatLonStringImpl latLonString = new LatLonStringImpl();
    return latLonString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeObject createShapeObject()
  {
    ShapeObjectImpl shapeObject = new ShapeObjectImpl();
    return shapeObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape createShape()
  {
    ShapeImpl shape = new ShapeImpl();
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeType createShapeType()
  {
    ShapeTypeImpl shapeType = new ShapeTypeImpl();
    return shapeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeTypeEnvelope createShapeTypeEnvelope()
  {
    ShapeTypeEnvelopeImpl shapeTypeEnvelope = new ShapeTypeEnvelopeImpl();
    return shapeTypeEnvelope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.first8.elasticsearch.dsl.search.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchPackage getSearchPackage()
  {
    return (SearchPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SearchPackage getPackage()
  {
    return SearchPackage.eINSTANCE;
  }

} //SearchFactoryImpl
