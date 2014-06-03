/**
 */
package com.first8.elasticsearch.dsl.search.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.first8.elasticsearch.dsl.search.SearchPackage
 * @generated
 */
public class SearchSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SearchPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SearchPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SearchPackage.SEARCH_DSL:
      {
        SearchDSL searchDSL = (SearchDSL)theEObject;
        T result = caseSearchDSL(searchDSL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SEARCH_FIELD:
      {
        SearchField searchField = (SearchField)theEObject;
        T result = caseSearchField(searchField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.STATS:
      {
        Stats stats = (Stats)theEObject;
        T result = caseStats(stats);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SORT:
      {
        Sort sort = (Sort)theEObject;
        T result = caseSort(sort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SORT_VALUE:
      {
        SortValue sortValue = (SortValue)theEObject;
        T result = caseSortValue(sortValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SHORT_SORT_OJECT:
      {
        ShortSortOject shortSortOject = (ShortSortOject)theEObject;
        T result = caseShortSortOject(shortSortOject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SORT_OBJECT:
      {
        SortObject sortObject = (SortObject)theEObject;
        T result = caseSortObject(sortObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SORT_OBJECT_PROPERTIES_OBJECT:
      {
        SortObjectPropertiesObject sortObjectPropertiesObject = (SortObjectPropertiesObject)theEObject;
        T result = caseSortObjectPropertiesObject(sortObjectPropertiesObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SORT_OBJECT_PROPERTY:
      {
        SortObjectProperty sortObjectProperty = (SortObjectProperty)theEObject;
        T result = caseSortObjectProperty(sortObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SORT_MODE:
      {
        SORT_MODE sorT_MODE = (SORT_MODE)theEObject;
        T result = caseSORT_MODE(sorT_MODE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.ASC_DESC:
      {
        ASC_DESC asC_DESC = (ASC_DESC)theEObject;
        T result = caseASC_DESC(asC_DESC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FIELDS:
      {
        Fields fields = (Fields)theEObject;
        T result = caseFields(fields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = caseQueryFacet(query);
        if (result == null) result = caseConstantScoreQueryObject(query);
        if (result == null) result = caseNestedQueryObject(query);
        if (result == null) result = caseNotFilterObject(query);
        if (result == null) result = caseQueryFilter(query);
        if (result == null) result = caseFacetType(query);
        if (result == null) result = caseConstantScoreQuery(query);
        if (result == null) result = caseNestedQuery(query);
        if (result == null) result = caseNotFilter(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FILTER:
      {
        Filter filter = (Filter)theEObject;
        T result = caseFilter(filter);
        if (result == null) result = caseFilterFacet(filter);
        if (result == null) result = caseConstantScoreQueryObject(filter);
        if (result == null) result = caseFacetType(filter);
        if (result == null) result = caseConstantScoreQuery(filter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FILTER_OBJECT:
      {
        FilterObject filterObject = (FilterObject)theEObject;
        T result = caseFilterObject(filterObject);
        if (result == null) result = caseFacetFilterParam(filterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FILTER_TYPE:
      {
        FilterType filterType = (FilterType)theEObject;
        T result = caseFilterType(filterType);
        if (result == null) result = caseFilterObject(filterType);
        if (result == null) result = caseFacetFilterParam(filterType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY_OBJECT:
      {
        QueryObject queryObject = (QueryObject)theEObject;
        T result = caseQueryObject(queryObject);
        if (result == null) result = caseFQuery(queryObject);
        if (result == null) result = caseQueryFilter(queryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY_TYPE:
      {
        QueryType queryType = (QueryType)theEObject;
        T result = caseQueryType(queryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_QUERY:
      {
        SpanQuery spanQuery = (SpanQuery)theEObject;
        T result = caseSpanQuery(spanQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MULTI_TERM_QUERY:
      {
        MultiTermQuery multiTermQuery = (MultiTermQuery)theEObject;
        T result = caseMultiTermQuery(multiTermQuery);
        if (result == null) result = caseSpanMultiQueryObject(multiTermQuery);
        if (result == null) result = caseSpanMultiQuery(multiTermQuery);
        if (result == null) result = caseSpanQuery(multiTermQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FACETS:
      {
        Facets facets = (Facets)theEObject;
        T result = caseFacets(facets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FACETS_OBJECT:
      {
        FacetsObject facetsObject = (FacetsObject)theEObject;
        T result = caseFacetsObject(facetsObject);
        if (result == null) result = caseFacets(facetsObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FACET_TYPE_OBJECT:
      {
        FacetTypeObject facetTypeObject = (FacetTypeObject)theEObject;
        T result = caseFacetTypeObject(facetTypeObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FACET_TYPE:
      {
        FacetType facetType = (FacetType)theEObject;
        T result = caseFacetType(facetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_DISTANCE_FACET:
      {
        GeoDistanceFacet geoDistanceFacet = (GeoDistanceFacet)theEObject;
        T result = caseGeoDistanceFacet(geoDistanceFacet);
        if (result == null) result = caseFacetType(geoDistanceFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_DISTANCE_FACET_OBJECT:
      {
        GeoDistanceFacetObject geoDistanceFacetObject = (GeoDistanceFacetObject)theEObject;
        T result = caseGeoDistanceFacetObject(geoDistanceFacetObject);
        if (result == null) result = caseGeoDistanceFacet(geoDistanceFacetObject);
        if (result == null) result = caseFacetType(geoDistanceFacetObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_STATS_FACET:
      {
        TermsStatsFacet termsStatsFacet = (TermsStatsFacet)theEObject;
        T result = caseTermsStatsFacet(termsStatsFacet);
        if (result == null) result = caseFacetType(termsStatsFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.STATISTICAL_FACET:
      {
        StatisticalFacet statisticalFacet = (StatisticalFacet)theEObject;
        T result = caseStatisticalFacet(statisticalFacet);
        if (result == null) result = caseFacetType(statisticalFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.STATISTICAL_FACET_OBJECT:
      {
        StatisticalFacetObject statisticalFacetObject = (StatisticalFacetObject)theEObject;
        T result = caseStatisticalFacetObject(statisticalFacetObject);
        if (result == null) result = caseStatisticalFacet(statisticalFacetObject);
        if (result == null) result = caseFacetType(statisticalFacetObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY_FACET:
      {
        QueryFacet queryFacet = (QueryFacet)theEObject;
        T result = caseQueryFacet(queryFacet);
        if (result == null) result = caseFacetType(queryFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FILTER_FACET:
      {
        FilterFacet filterFacet = (FilterFacet)theEObject;
        T result = caseFilterFacet(filterFacet);
        if (result == null) result = caseFacetType(filterFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.DATE_HISTOGRAM_FACET:
      {
        DateHistogramFacet dateHistogramFacet = (DateHistogramFacet)theEObject;
        T result = caseDateHistogramFacet(dateHistogramFacet);
        if (result == null) result = caseFacetType(dateHistogramFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT:
      {
        DateHistogramFacetObject dateHistogramFacetObject = (DateHistogramFacetObject)theEObject;
        T result = caseDateHistogramFacetObject(dateHistogramFacetObject);
        if (result == null) result = caseDateHistogramFacet(dateHistogramFacetObject);
        if (result == null) result = caseFacetType(dateHistogramFacetObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HISTOGRAM_FACET:
      {
        HistogramFacet histogramFacet = (HistogramFacet)theEObject;
        T result = caseHistogramFacet(histogramFacet);
        if (result == null) result = caseFacetType(histogramFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HISTOGRAM_FACET_OBJECT:
      {
        HistogramFacetObject histogramFacetObject = (HistogramFacetObject)theEObject;
        T result = caseHistogramFacetObject(histogramFacetObject);
        if (result == null) result = caseHistogramFacet(histogramFacetObject);
        if (result == null) result = caseFacetType(histogramFacetObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_FACET:
      {
        RangeFacet rangeFacet = (RangeFacet)theEObject;
        T result = caseRangeFacet(rangeFacet);
        if (result == null) result = caseFacetType(rangeFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_FACET_OBJECT:
      {
        RangeFacetObject rangeFacetObject = (RangeFacetObject)theEObject;
        T result = caseRangeFacetObject(rangeFacetObject);
        if (result == null) result = caseRangeFacet(rangeFacetObject);
        if (result == null) result = caseFacetType(rangeFacetObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.KEY_VALUE_FIELD:
      {
        KeyValueField keyValueField = (KeyValueField)theEObject;
        T result = caseKeyValueField(keyValueField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.KEY_VALUE_SCRIPT:
      {
        KeyValueScript keyValueScript = (KeyValueScript)theEObject;
        T result = caseKeyValueScript(keyValueScript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_FACET:
      {
        TermsFacet termsFacet = (TermsFacet)theEObject;
        T result = caseTermsFacet(termsFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_FACET_OBJECT:
      {
        TermsFacetObject termsFacetObject = (TermsFacetObject)theEObject;
        T result = caseTermsFacetObject(termsFacetObject);
        if (result == null) result = caseTermsFacet(termsFacetObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_FACET_PARAMETER:
      {
        TermsFacetParameter termsFacetParameter = (TermsFacetParameter)theEObject;
        T result = caseTermsFacetParameter(termsFacetParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FACET_PARAMETER:
      {
        FacetParameter facetParameter = (FacetParameter)theEObject;
        T result = caseFacetParameter(facetParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FACET_FILTER_PARAM:
      {
        FacetFilterParam facetFilterParam = (FacetFilterParam)theEObject;
        T result = caseFacetFilterParam(facetFilterParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.ALL_TERMS_PARAM:
      {
        AllTermsParam allTermsParam = (AllTermsParam)theEObject;
        T result = caseAllTermsParam(allTermsParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.EXCLUDE_PARAM:
      {
        ExcludeParam excludeParam = (ExcludeParam)theEObject;
        T result = caseExcludeParam(excludeParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SCRIPT_PARAM:
      {
        ScriptParam scriptParam = (ScriptParam)theEObject;
        T result = caseScriptParam(scriptParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SCRIPT_FIELD_PARAM:
      {
        ScriptFieldParam scriptFieldParam = (ScriptFieldParam)theEObject;
        T result = caseScriptFieldParam(scriptFieldParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.LIKE_TEXT_PARAM:
      {
        LikeTextParam likeTextParam = (LikeTextParam)theEObject;
        T result = caseLikeTextParam(likeTextParam);
        if (result == null) result = caseFuzzyLikeThisQueryObject(likeTextParam);
        if (result == null) result = caseMoreLikeThisQueryObject(likeTextParam);
        if (result == null) result = caseFuzzyLikeThisQuery(likeTextParam);
        if (result == null) result = caseMoreLikeThisQuery(likeTextParam);
        if (result == null) result = caseMoreLikeThisFieldQuery(likeTextParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MATCH_QUERY:
      {
        MatchQuery matchQuery = (MatchQuery)theEObject;
        T result = caseMatchQuery(matchQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SHORT_MATCH_QUERY_OBJECT:
      {
        ShortMatchQueryObject shortMatchQueryObject = (ShortMatchQueryObject)theEObject;
        T result = caseShortMatchQueryObject(shortMatchQueryObject);
        if (result == null) result = caseMatchQuery(shortMatchQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MATCH_QUERY_OBJECT:
      {
        MatchQueryObject matchQueryObject = (MatchQueryObject)theEObject;
        T result = caseMatchQueryObject(matchQueryObject);
        if (result == null) result = caseMatchQuery(matchQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MATCH_QUERY_PARAMETERS_OBJECT:
      {
        MatchQueryParametersObject matchQueryParametersObject = (MatchQueryParametersObject)theEObject;
        T result = caseMatchQueryParametersObject(matchQueryParametersObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MULTI_MATCH_QUERY:
      {
        MultiMatchQuery multiMatchQuery = (MultiMatchQuery)theEObject;
        T result = caseMultiMatchQuery(multiMatchQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MULTI_MATCH_QUERY_OBJECT:
      {
        MultiMatchQueryObject multiMatchQueryObject = (MultiMatchQueryObject)theEObject;
        T result = caseMultiMatchQueryObject(multiMatchQueryObject);
        if (result == null) result = caseMultiMatchQuery(multiMatchQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOOL_QUERY:
      {
        BoolQuery boolQuery = (BoolQuery)theEObject;
        T result = caseBoolQuery(boolQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOOL_QUERY_OBJECT:
      {
        BoolQueryObject boolQueryObject = (BoolQueryObject)theEObject;
        T result = caseBoolQueryObject(boolQueryObject);
        if (result == null) result = caseBoolQuery(boolQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOOL_CLAUSE:
      {
        BoolClause boolClause = (BoolClause)theEObject;
        T result = caseBoolClause(boolClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.COMMON_QUERY:
      {
        CommonQuery commonQuery = (CommonQuery)theEObject;
        T result = caseCommonQuery(commonQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.COMMON_QUERY_OBJECT:
      {
        CommonQueryObject commonQueryObject = (CommonQueryObject)theEObject;
        T result = caseCommonQueryObject(commonQueryObject);
        if (result == null) result = caseCommonQuery(commonQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.COMMON_QUERY_PARAMETERS_OBJECT:
      {
        CommonQueryParametersObject commonQueryParametersObject = (CommonQueryParametersObject)theEObject;
        T result = caseCommonQueryParametersObject(commonQueryParametersObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.CONSTANT_SCORE_QUERY:
      {
        ConstantScoreQuery constantScoreQuery = (ConstantScoreQuery)theEObject;
        T result = caseConstantScoreQuery(constantScoreQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.CONSTANT_SCORE_QUERY_OBJECT:
      {
        ConstantScoreQueryObject constantScoreQueryObject = (ConstantScoreQueryObject)theEObject;
        T result = caseConstantScoreQueryObject(constantScoreQueryObject);
        if (result == null) result = caseConstantScoreQuery(constantScoreQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.DIS_MAX_QUERY:
      {
        DisMaxQuery disMaxQuery = (DisMaxQuery)theEObject;
        T result = caseDisMaxQuery(disMaxQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.DIS_MAX_QUERY_OBJECT:
      {
        DisMaxQueryObject disMaxQueryObject = (DisMaxQueryObject)theEObject;
        T result = caseDisMaxQueryObject(disMaxQueryObject);
        if (result == null) result = caseDisMaxQuery(disMaxQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FILTERED_QUERY:
      {
        FilteredQuery filteredQuery = (FilteredQuery)theEObject;
        T result = caseFilteredQuery(filteredQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FILTERED_QUERY_OBJECT:
      {
        FilteredQueryObject filteredQueryObject = (FilteredQueryObject)theEObject;
        T result = caseFilteredQueryObject(filteredQueryObject);
        if (result == null) result = caseFilteredQuery(filteredQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_LIKE_THIS_QUERY:
      {
        FuzzyLikeThisQuery fuzzyLikeThisQuery = (FuzzyLikeThisQuery)theEObject;
        T result = caseFuzzyLikeThisQuery(fuzzyLikeThisQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_LIKE_THIS_QUERY_OBJECT:
      {
        FuzzyLikeThisQueryObject fuzzyLikeThisQueryObject = (FuzzyLikeThisQueryObject)theEObject;
        T result = caseFuzzyLikeThisQueryObject(fuzzyLikeThisQueryObject);
        if (result == null) result = caseFuzzyLikeThisQuery(fuzzyLikeThisQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_LIKE_THIS_FIELD_QUERY:
      {
        FuzzyLikeThisFieldQuery fuzzyLikeThisFieldQuery = (FuzzyLikeThisFieldQuery)theEObject;
        T result = caseFuzzyLikeThisFieldQuery(fuzzyLikeThisFieldQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT:
      {
        FuzzyLikeThisFieldQueryObject fuzzyLikeThisFieldQueryObject = (FuzzyLikeThisFieldQueryObject)theEObject;
        T result = caseFuzzyLikeThisFieldQueryObject(fuzzyLikeThisFieldQueryObject);
        if (result == null) result = caseFuzzyLikeThisFieldQuery(fuzzyLikeThisFieldQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_QUERY:
      {
        FuzzyQuery fuzzyQuery = (FuzzyQuery)theEObject;
        T result = caseFuzzyQuery(fuzzyQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SIMPLE_FUZZY_QUERY_OBJECT:
      {
        SimpleFuzzyQueryObject simpleFuzzyQueryObject = (SimpleFuzzyQueryObject)theEObject;
        T result = caseSimpleFuzzyQueryObject(simpleFuzzyQueryObject);
        if (result == null) result = caseFuzzyQuery(simpleFuzzyQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_QUERY_OBJECT:
      {
        FuzzyQueryObject fuzzyQueryObject = (FuzzyQueryObject)theEObject;
        T result = caseFuzzyQueryObject(fuzzyQueryObject);
        if (result == null) result = caseFuzzyQuery(fuzzyQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FUZZY_QUERY_OBJECT_PARAMETERS:
      {
        FuzzyQueryObjectParameters fuzzyQueryObjectParameters = (FuzzyQueryObjectParameters)theEObject;
        T result = caseFuzzyQueryObjectParameters(fuzzyQueryObjectParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEOSHAPE_QUERY:
      {
        GeoshapeQuery geoshapeQuery = (GeoshapeQuery)theEObject;
        T result = caseGeoshapeQuery(geoshapeQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEOSHAPE_QUERY_OBJECT:
      {
        GeoshapeQueryObject geoshapeQueryObject = (GeoshapeQueryObject)theEObject;
        T result = caseGeoshapeQueryObject(geoshapeQueryObject);
        if (result == null) result = caseGeoshapeQuery(geoshapeQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_CHILD_QUERY:
      {
        HasChildQuery hasChildQuery = (HasChildQuery)theEObject;
        T result = caseHasChildQuery(hasChildQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_CHILD_QUERY_OBJECT:
      {
        HasChildQueryObject hasChildQueryObject = (HasChildQueryObject)theEObject;
        T result = caseHasChildQueryObject(hasChildQueryObject);
        if (result == null) result = caseHasChildQuery(hasChildQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_PARENT_QUERY:
      {
        HasParentQuery hasParentQuery = (HasParentQuery)theEObject;
        T result = caseHasParentQuery(hasParentQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_PARENT_QUERY_OBJECT:
      {
        HasParentQueryObject hasParentQueryObject = (HasParentQueryObject)theEObject;
        T result = caseHasParentQueryObject(hasParentQueryObject);
        if (result == null) result = caseHasParentQuery(hasParentQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.INDICES_QUERY:
      {
        IndicesQuery indicesQuery = (IndicesQuery)theEObject;
        T result = caseIndicesQuery(indicesQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.INDICES_QUERY_OBJECT:
      {
        IndicesQueryObject indicesQueryObject = (IndicesQueryObject)theEObject;
        T result = caseIndicesQueryObject(indicesQueryObject);
        if (result == null) result = caseIndicesQuery(indicesQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MORE_LIKE_THIS_QUERY:
      {
        MoreLikeThisQuery moreLikeThisQuery = (MoreLikeThisQuery)theEObject;
        T result = caseMoreLikeThisQuery(moreLikeThisQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MORE_LIKE_THIS_QUERY_OBJECT:
      {
        MoreLikeThisQueryObject moreLikeThisQueryObject = (MoreLikeThisQueryObject)theEObject;
        T result = caseMoreLikeThisQueryObject(moreLikeThisQueryObject);
        if (result == null) result = caseMoreLikeThisQuery(moreLikeThisQueryObject);
        if (result == null) result = caseMoreLikeThisFieldQuery(moreLikeThisQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MORE_LIKE_THIS_FIELD_QUERY:
      {
        MoreLikeThisFieldQuery moreLikeThisFieldQuery = (MoreLikeThisFieldQuery)theEObject;
        T result = caseMoreLikeThisFieldQuery(moreLikeThisFieldQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MORE_LIKE_THIS_FIELD_QUERY_OBJECT:
      {
        MoreLikeThisFieldQueryObject moreLikeThisFieldQueryObject = (MoreLikeThisFieldQueryObject)theEObject;
        T result = caseMoreLikeThisFieldQueryObject(moreLikeThisFieldQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.NESTED_QUERY:
      {
        NestedQuery nestedQuery = (NestedQuery)theEObject;
        T result = caseNestedQuery(nestedQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.NESTED_QUERY_OBJECT:
      {
        NestedQueryObject nestedQueryObject = (NestedQueryObject)theEObject;
        T result = caseNestedQueryObject(nestedQueryObject);
        if (result == null) result = caseNestedQuery(nestedQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.PREFIX_QUERY:
      {
        PrefixQuery prefixQuery = (PrefixQuery)theEObject;
        T result = casePrefixQuery(prefixQuery);
        if (result == null) result = caseMultiTermQuery(prefixQuery);
        if (result == null) result = caseSpanMultiQueryObject(prefixQuery);
        if (result == null) result = caseSpanMultiQuery(prefixQuery);
        if (result == null) result = caseSpanQuery(prefixQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SIMPLE_PREFIX_QUERY_OBJECT:
      {
        SimplePrefixQueryObject simplePrefixQueryObject = (SimplePrefixQueryObject)theEObject;
        T result = caseSimplePrefixQueryObject(simplePrefixQueryObject);
        if (result == null) result = casePrefixQuery(simplePrefixQueryObject);
        if (result == null) result = caseMultiTermQuery(simplePrefixQueryObject);
        if (result == null) result = caseSpanMultiQueryObject(simplePrefixQueryObject);
        if (result == null) result = caseSpanMultiQuery(simplePrefixQueryObject);
        if (result == null) result = caseSpanQuery(simplePrefixQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.PREFIX_QUERY_OBJECT:
      {
        PrefixQueryObject prefixQueryObject = (PrefixQueryObject)theEObject;
        T result = casePrefixQueryObject(prefixQueryObject);
        if (result == null) result = casePrefixQuery(prefixQueryObject);
        if (result == null) result = caseMultiTermQuery(prefixQueryObject);
        if (result == null) result = caseSpanMultiQueryObject(prefixQueryObject);
        if (result == null) result = caseSpanMultiQuery(prefixQueryObject);
        if (result == null) result = caseSpanQuery(prefixQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.PREFIX_QUERY_PARAMETER_OBJECT:
      {
        PrefixQueryParameterObject prefixQueryParameterObject = (PrefixQueryParameterObject)theEObject;
        T result = casePrefixQueryParameterObject(prefixQueryParameterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY_STRING_QUERY:
      {
        QueryStringQuery queryStringQuery = (QueryStringQuery)theEObject;
        T result = caseQueryStringQuery(queryStringQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY_STRING_QUERY_OBJECT:
      {
        QueryStringQueryObject queryStringQueryObject = (QueryStringQueryObject)theEObject;
        T result = caseQueryStringQueryObject(queryStringQueryObject);
        if (result == null) result = caseQueryStringQuery(queryStringQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SIMPLE_QUERY_STRING_QUERY:
      {
        SimpleQueryStringQuery simpleQueryStringQuery = (SimpleQueryStringQuery)theEObject;
        T result = caseSimpleQueryStringQuery(simpleQueryStringQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SIMPLE_QUERY_STRING_QUERY_OBJECT:
      {
        SimpleQueryStringQueryObject simpleQueryStringQueryObject = (SimpleQueryStringQueryObject)theEObject;
        T result = caseSimpleQueryStringQueryObject(simpleQueryStringQueryObject);
        if (result == null) result = caseSimpleQueryStringQuery(simpleQueryStringQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_QUERY:
      {
        RangeQuery rangeQuery = (RangeQuery)theEObject;
        T result = caseRangeQuery(rangeQuery);
        if (result == null) result = caseMultiTermQuery(rangeQuery);
        if (result == null) result = caseSpanMultiQueryObject(rangeQuery);
        if (result == null) result = caseSpanMultiQuery(rangeQuery);
        if (result == null) result = caseSpanQuery(rangeQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_QUERY_OBJECT:
      {
        RangeQueryObject rangeQueryObject = (RangeQueryObject)theEObject;
        T result = caseRangeQueryObject(rangeQueryObject);
        if (result == null) result = caseRangeQuery(rangeQueryObject);
        if (result == null) result = caseMultiTermQuery(rangeQueryObject);
        if (result == null) result = caseSpanMultiQueryObject(rangeQueryObject);
        if (result == null) result = caseSpanMultiQuery(rangeQueryObject);
        if (result == null) result = caseSpanQuery(rangeQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_QUERY_PARAMETERS_OBJECT:
      {
        RangeQueryParametersObject rangeQueryParametersObject = (RangeQueryParametersObject)theEObject;
        T result = caseRangeQueryParametersObject(rangeQueryParametersObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.REGEXP_QUERY:
      {
        RegexpQuery regexpQuery = (RegexpQuery)theEObject;
        T result = caseRegexpQuery(regexpQuery);
        if (result == null) result = caseMultiTermQuery(regexpQuery);
        if (result == null) result = caseSpanMultiQueryObject(regexpQuery);
        if (result == null) result = caseSpanMultiQuery(regexpQuery);
        if (result == null) result = caseSpanQuery(regexpQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.REGEXP_QUERY_OBJECT:
      {
        RegexpQueryObject regexpQueryObject = (RegexpQueryObject)theEObject;
        T result = caseRegexpQueryObject(regexpQueryObject);
        if (result == null) result = caseRegexpQuery(regexpQueryObject);
        if (result == null) result = caseMultiTermQuery(regexpQueryObject);
        if (result == null) result = caseSpanMultiQueryObject(regexpQueryObject);
        if (result == null) result = caseSpanMultiQuery(regexpQueryObject);
        if (result == null) result = caseSpanQuery(regexpQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.REGEXP_QUERY_PARAMETER_OBJECT:
      {
        RegexpQueryParameterObject regexpQueryParameterObject = (RegexpQueryParameterObject)theEObject;
        T result = caseRegexpQueryParameterObject(regexpQueryParameterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_FIRST_QUERY:
      {
        SpanFirstQuery spanFirstQuery = (SpanFirstQuery)theEObject;
        T result = caseSpanFirstQuery(spanFirstQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_FIRST_QUERY_OBJECT:
      {
        SpanFirstQueryObject spanFirstQueryObject = (SpanFirstQueryObject)theEObject;
        T result = caseSpanFirstQueryObject(spanFirstQueryObject);
        if (result == null) result = caseSpanFirstQuery(spanFirstQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_MULTI_QUERY:
      {
        SpanMultiQuery spanMultiQuery = (SpanMultiQuery)theEObject;
        T result = caseSpanMultiQuery(spanMultiQuery);
        if (result == null) result = caseSpanQuery(spanMultiQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_MULTI_QUERY_OBJECT:
      {
        SpanMultiQueryObject spanMultiQueryObject = (SpanMultiQueryObject)theEObject;
        T result = caseSpanMultiQueryObject(spanMultiQueryObject);
        if (result == null) result = caseSpanMultiQuery(spanMultiQueryObject);
        if (result == null) result = caseSpanQuery(spanMultiQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_NEAR_QUERY:
      {
        SpanNearQuery spanNearQuery = (SpanNearQuery)theEObject;
        T result = caseSpanNearQuery(spanNearQuery);
        if (result == null) result = caseSpanQuery(spanNearQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT:
      {
        SpanNearQueryObject spanNearQueryObject = (SpanNearQueryObject)theEObject;
        T result = caseSpanNearQueryObject(spanNearQueryObject);
        if (result == null) result = caseSpanNearQuery(spanNearQueryObject);
        if (result == null) result = caseSpanQuery(spanNearQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_NOT_QUERY:
      {
        SpanNotQuery spanNotQuery = (SpanNotQuery)theEObject;
        T result = caseSpanNotQuery(spanNotQuery);
        if (result == null) result = caseSpanQuery(spanNotQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_NOT_QUERY_OBJECT:
      {
        SpanNotQueryObject spanNotQueryObject = (SpanNotQueryObject)theEObject;
        T result = caseSpanNotQueryObject(spanNotQueryObject);
        if (result == null) result = caseSpanNotQuery(spanNotQueryObject);
        if (result == null) result = caseSpanQuery(spanNotQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_OR_QUERY:
      {
        SpanOrQuery spanOrQuery = (SpanOrQuery)theEObject;
        T result = caseSpanOrQuery(spanOrQuery);
        if (result == null) result = caseSpanQuery(spanOrQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_OR_QUERY_OBJECT:
      {
        SpanOrQueryObject spanOrQueryObject = (SpanOrQueryObject)theEObject;
        T result = caseSpanOrQueryObject(spanOrQueryObject);
        if (result == null) result = caseSpanOrQuery(spanOrQueryObject);
        if (result == null) result = caseSpanQuery(spanOrQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_TERM_QUERY:
      {
        SpanTermQuery spanTermQuery = (SpanTermQuery)theEObject;
        T result = caseSpanTermQuery(spanTermQuery);
        if (result == null) result = caseSpanQuery(spanTermQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SPAN_TERM_QUERY_OBJECT:
      {
        SpanTermQueryObject spanTermQueryObject = (SpanTermQueryObject)theEObject;
        T result = caseSpanTermQueryObject(spanTermQueryObject);
        if (result == null) result = caseSpanTermQuery(spanTermQueryObject);
        if (result == null) result = caseSpanQuery(spanTermQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERM_QUERY:
      {
        TermQuery termQuery = (TermQuery)theEObject;
        T result = caseTermQuery(termQuery);
        if (result == null) result = caseMultiTermQuery(termQuery);
        if (result == null) result = caseSpanMultiQueryObject(termQuery);
        if (result == null) result = caseSpanMultiQuery(termQuery);
        if (result == null) result = caseSpanQuery(termQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERM_QUERY_OBJECT:
      {
        TermQueryObject termQueryObject = (TermQueryObject)theEObject;
        T result = caseTermQueryObject(termQueryObject);
        if (result == null) result = caseTermQuery(termQueryObject);
        if (result == null) result = caseWildcardQuery(termQueryObject);
        if (result == null) result = caseMultiTermQuery(termQueryObject);
        if (result == null) result = caseSpanMultiQueryObject(termQueryObject);
        if (result == null) result = caseSpanMultiQuery(termQueryObject);
        if (result == null) result = caseSpanQuery(termQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT:
      {
        TermQueryParametersObject termQueryParametersObject = (TermQueryParametersObject)theEObject;
        T result = caseTermQueryParametersObject(termQueryParametersObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_QUERY:
      {
        TermsQuery termsQuery = (TermsQuery)theEObject;
        T result = caseTermsQuery(termsQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_QUERY_OBJECT:
      {
        TermsQueryObject termsQueryObject = (TermsQueryObject)theEObject;
        T result = caseTermsQueryObject(termsQueryObject);
        if (result == null) result = caseTermsQuery(termsQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TOP_CHILDREN_QUERY:
      {
        TopChildrenQuery topChildrenQuery = (TopChildrenQuery)theEObject;
        T result = caseTopChildrenQuery(topChildrenQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TOP_CHILDREN_QUERY_OBJECT:
      {
        TopChildrenQueryObject topChildrenQueryObject = (TopChildrenQueryObject)theEObject;
        T result = caseTopChildrenQueryObject(topChildrenQueryObject);
        if (result == null) result = caseTopChildrenQuery(topChildrenQueryObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.WILDCARD_QUERY:
      {
        WildcardQuery wildcardQuery = (WildcardQuery)theEObject;
        T result = caseWildcardQuery(wildcardQuery);
        if (result == null) result = caseMultiTermQuery(wildcardQuery);
        if (result == null) result = caseSpanMultiQueryObject(wildcardQuery);
        if (result == null) result = caseSpanMultiQuery(wildcardQuery);
        if (result == null) result = caseSpanQuery(wildcardQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.AND_FILTER:
      {
        AndFilter andFilter = (AndFilter)theEObject;
        T result = caseAndFilter(andFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SIMPLE_AND_FILTER_ARRAY:
      {
        SimpleAndFilterArray simpleAndFilterArray = (SimpleAndFilterArray)theEObject;
        T result = caseSimpleAndFilterArray(simpleAndFilterArray);
        if (result == null) result = caseAndFilterObject(simpleAndFilterArray);
        if (result == null) result = caseAndFilter(simpleAndFilterArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.AND_FILTER_OBJECT:
      {
        AndFilterObject andFilterObject = (AndFilterObject)theEObject;
        T result = caseAndFilterObject(andFilterObject);
        if (result == null) result = caseAndFilter(andFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOOL_FILTER:
      {
        BoolFilter boolFilter = (BoolFilter)theEObject;
        T result = caseBoolFilter(boolFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOOL_FILTER_OBJECT:
      {
        BoolFilterObject boolFilterObject = (BoolFilterObject)theEObject;
        T result = caseBoolFilterObject(boolFilterObject);
        if (result == null) result = caseBoolFilter(boolFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOOL_FILTER_CLAUSE:
      {
        BoolFilterClause boolFilterClause = (BoolFilterClause)theEObject;
        T result = caseBoolFilterClause(boolFilterClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_BOUNDING_BOX_FILTER:
      {
        GeoBoundingBoxFilter geoBoundingBoxFilter = (GeoBoundingBoxFilter)theEObject;
        T result = caseGeoBoundingBoxFilter(geoBoundingBoxFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT:
      {
        GeoBoundingBoxFilterObject geoBoundingBoxFilterObject = (GeoBoundingBoxFilterObject)theEObject;
        T result = caseGeoBoundingBoxFilterObject(geoBoundingBoxFilterObject);
        if (result == null) result = caseGeoBoundingBoxFilter(geoBoundingBoxFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_DISTANCE_FILTER:
      {
        GeoDistanceFilter geoDistanceFilter = (GeoDistanceFilter)theEObject;
        T result = caseGeoDistanceFilter(geoDistanceFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_DISTANCE_FILTER_OBJECT:
      {
        GeoDistanceFilterObject geoDistanceFilterObject = (GeoDistanceFilterObject)theEObject;
        T result = caseGeoDistanceFilterObject(geoDistanceFilterObject);
        if (result == null) result = caseGeoDistanceFilter(geoDistanceFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER:
      {
        GeoDistanceRangeFilter geoDistanceRangeFilter = (GeoDistanceRangeFilter)theEObject;
        T result = caseGeoDistanceRangeFilter(geoDistanceRangeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT:
      {
        GeoDistanceRangeFilterObject geoDistanceRangeFilterObject = (GeoDistanceRangeFilterObject)theEObject;
        T result = caseGeoDistanceRangeFilterObject(geoDistanceRangeFilterObject);
        if (result == null) result = caseGeoDistanceRangeFilter(geoDistanceRangeFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_POLYGON_FILTER:
      {
        GeoPolygonFilter geoPolygonFilter = (GeoPolygonFilter)theEObject;
        T result = caseGeoPolygonFilter(geoPolygonFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_POLYGON_FILTER_OBJECT:
      {
        GeoPolygonFilterObject geoPolygonFilterObject = (GeoPolygonFilterObject)theEObject;
        T result = caseGeoPolygonFilterObject(geoPolygonFilterObject);
        if (result == null) result = caseGeoPolygonFilter(geoPolygonFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_SHAPE_FILTER:
      {
        GeoShapeFilter geoShapeFilter = (GeoShapeFilter)theEObject;
        T result = caseGeoShapeFilter(geoShapeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_SHAPE_FILTER_OBJECT:
      {
        GeoShapeFilterObject geoShapeFilterObject = (GeoShapeFilterObject)theEObject;
        T result = caseGeoShapeFilterObject(geoShapeFilterObject);
        if (result == null) result = caseGeoShapeFilter(geoShapeFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEOHASH_CELL_FILTER:
      {
        GeohashCellFilter geohashCellFilter = (GeohashCellFilter)theEObject;
        T result = caseGeohashCellFilter(geohashCellFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEOHASH_CELL_FILTER_OBJECT:
      {
        GeohashCellFilterObject geohashCellFilterObject = (GeohashCellFilterObject)theEObject;
        T result = caseGeohashCellFilterObject(geohashCellFilterObject);
        if (result == null) result = caseGeohashCellFilter(geohashCellFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_CHILD_FILTER:
      {
        HasChildFilter hasChildFilter = (HasChildFilter)theEObject;
        T result = caseHasChildFilter(hasChildFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_CHILD_FILTER_OBJECT:
      {
        HasChildFilterObject hasChildFilterObject = (HasChildFilterObject)theEObject;
        T result = caseHasChildFilterObject(hasChildFilterObject);
        if (result == null) result = caseHasChildFilter(hasChildFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_PARENT_FILTER:
      {
        HasParentFilter hasParentFilter = (HasParentFilter)theEObject;
        T result = caseHasParentFilter(hasParentFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.HAS_PARENT_FILTER_OBJECT:
      {
        HasParentFilterObject hasParentFilterObject = (HasParentFilterObject)theEObject;
        T result = caseHasParentFilterObject(hasParentFilterObject);
        if (result == null) result = caseHasParentFilter(hasParentFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.INDICES_FILTER:
      {
        IndicesFilter indicesFilter = (IndicesFilter)theEObject;
        T result = caseIndicesFilter(indicesFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.INDICES_FILTER_OBJECT:
      {
        IndicesFilterObject indicesFilterObject = (IndicesFilterObject)theEObject;
        T result = caseIndicesFilterObject(indicesFilterObject);
        if (result == null) result = caseIndicesFilter(indicesFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.NESTED_FILTER:
      {
        NestedFilter nestedFilter = (NestedFilter)theEObject;
        T result = caseNestedFilter(nestedFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.NESTED_FILTER_OBJECT:
      {
        NestedFilterObject nestedFilterObject = (NestedFilterObject)theEObject;
        T result = caseNestedFilterObject(nestedFilterObject);
        if (result == null) result = caseNestedFilter(nestedFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.NOT_FILTER:
      {
        NotFilter notFilter = (NotFilter)theEObject;
        T result = caseNotFilter(notFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.NOT_FILTER_OBJECT:
      {
        NotFilterObject notFilterObject = (NotFilterObject)theEObject;
        T result = caseNotFilterObject(notFilterObject);
        if (result == null) result = caseNotFilter(notFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.OR_FILTER:
      {
        OrFilter orFilter = (OrFilter)theEObject;
        T result = caseOrFilter(orFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.OR_FILTER_ARRAY:
      {
        OrFilterArray orFilterArray = (OrFilterArray)theEObject;
        T result = caseOrFilterArray(orFilterArray);
        if (result == null) result = caseOrFilter(orFilterArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.PREFIX_FILTER:
      {
        PrefixFilter prefixFilter = (PrefixFilter)theEObject;
        T result = casePrefixFilter(prefixFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.PREFIX_FILTER_OBJECT:
      {
        PrefixFilterObject prefixFilterObject = (PrefixFilterObject)theEObject;
        T result = casePrefixFilterObject(prefixFilterObject);
        if (result == null) result = casePrefixFilter(prefixFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.QUERY_FILTER:
      {
        QueryFilter queryFilter = (QueryFilter)theEObject;
        T result = caseQueryFilter(queryFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.FQUERY:
      {
        FQuery fQuery = (FQuery)theEObject;
        T result = caseFQuery(fQuery);
        if (result == null) result = caseQueryFilter(fQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_FILTER:
      {
        RangeFilter rangeFilter = (RangeFilter)theEObject;
        T result = caseRangeFilter(rangeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_FILTER_OBJECT:
      {
        RangeFilterObject rangeFilterObject = (RangeFilterObject)theEObject;
        T result = caseRangeFilterObject(rangeFilterObject);
        if (result == null) result = caseRangeFilter(rangeFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.RANGE_FILTER_PARAMETERS_OBJECT:
      {
        RangeFilterParametersObject rangeFilterParametersObject = (RangeFilterParametersObject)theEObject;
        T result = caseRangeFilterParametersObject(rangeFilterParametersObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.REGEXP_FILTER:
      {
        RegexpFilter regexpFilter = (RegexpFilter)theEObject;
        T result = caseRegexpFilter(regexpFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.REGEXP_FILTER_OBJECT:
      {
        RegexpFilterObject regexpFilterObject = (RegexpFilterObject)theEObject;
        T result = caseRegexpFilterObject(regexpFilterObject);
        if (result == null) result = caseRegexpFilter(regexpFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.REGEXP_FILTER_PARAMETER_OBJECT:
      {
        RegexpFilterParameterObject regexpFilterParameterObject = (RegexpFilterParameterObject)theEObject;
        T result = caseRegexpFilterParameterObject(regexpFilterParameterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SCRIPT_FILTER:
      {
        ScriptFilter scriptFilter = (ScriptFilter)theEObject;
        T result = caseScriptFilter(scriptFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SCRIPT_FILTER_OBJECT:
      {
        ScriptFilterObject scriptFilterObject = (ScriptFilterObject)theEObject;
        T result = caseScriptFilterObject(scriptFilterObject);
        if (result == null) result = caseScriptFilter(scriptFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERM_FILTER:
      {
        TermFilter termFilter = (TermFilter)theEObject;
        T result = caseTermFilter(termFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERM_FILTER_OBJECT:
      {
        TermFilterObject termFilterObject = (TermFilterObject)theEObject;
        T result = caseTermFilterObject(termFilterObject);
        if (result == null) result = caseTermFilter(termFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_FILTER:
      {
        TermsFilter termsFilter = (TermsFilter)theEObject;
        T result = caseTermsFilter(termsFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TERMS_FILTER_OBJECT:
      {
        TermsFilterObject termsFilterObject = (TermsFilterObject)theEObject;
        T result = caseTermsFilterObject(termsFilterObject);
        if (result == null) result = caseTermsFilter(termsFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TYPE_FILTER:
      {
        TypeFilter typeFilter = (TypeFilter)theEObject;
        T result = caseTypeFilter(typeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TYPE_FILTER_OBJECT:
      {
        TypeFilterObject typeFilterObject = (TypeFilterObject)theEObject;
        T result = caseTypeFilterObject(typeFilterObject);
        if (result == null) result = caseTypeFilter(typeFilterObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_SHAPE_OBJECT:
      {
        GeoShapeObject geoShapeObject = (GeoShapeObject)theEObject;
        T result = caseGeoShapeObject(geoShapeObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.GEO_SHAPE:
      {
        GeoShape geoShape = (GeoShape)theEObject;
        T result = caseGeoShape(geoShape);
        if (result == null) result = caseGeoShapeObject(geoShape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.POLYGON:
      {
        Polygon polygon = (Polygon)theEObject;
        T result = casePolygon(polygon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.BOUNDING_BOX_OBJECT:
      {
        BoundingBoxObject boundingBoxObject = (BoundingBoxObject)theEObject;
        T result = caseBoundingBoxObject(boundingBoxObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.TWO_POINT_BOUNDING_BOX:
      {
        TwoPointBoundingBox twoPointBoundingBox = (TwoPointBoundingBox)theEObject;
        T result = caseTwoPointBoundingBox(twoPointBoundingBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.LAT_LON:
      {
        LatLon latLon = (LatLon)theEObject;
        T result = caseLatLon(latLon);
        if (result == null) result = caseGeohashCellFilterObject(latLon);
        if (result == null) result = caseGeohashCellFilter(latLon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.LAT_LON_ARRAY:
      {
        LatLonArray latLonArray = (LatLonArray)theEObject;
        T result = caseLatLonArray(latLonArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.LAT_LON_STRING:
      {
        LatLonString latLonString = (LatLonString)theEObject;
        T result = caseLatLonString(latLonString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SHAPE_OBJECT:
      {
        ShapeObject shapeObject = (ShapeObject)theEObject;
        T result = caseShapeObject(shapeObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SHAPE:
      {
        Shape shape = (Shape)theEObject;
        T result = caseShape(shape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SHAPE_TYPE:
      {
        ShapeType shapeType = (ShapeType)theEObject;
        T result = caseShapeType(shapeType);
        if (result == null) result = caseShape(shapeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.SHAPE_TYPE_ENVELOPE:
      {
        ShapeTypeEnvelope shapeTypeEnvelope = (ShapeTypeEnvelope)theEObject;
        T result = caseShapeTypeEnvelope(shapeTypeEnvelope);
        if (result == null) result = caseShapeType(shapeTypeEnvelope);
        if (result == null) result = caseShape(shapeTypeEnvelope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.OBJECT:
      {
        com.first8.elasticsearch.dsl.search.Object object = (com.first8.elasticsearch.dsl.search.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = caseTermsStatsFacet(object);
        if (result == null) result = caseFacetType(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SearchPackage.ARRAY:
      {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearchDSL(SearchDSL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSearchField(SearchField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stats</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stats</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStats(Stats object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSort(Sort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortValue(SortValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Short Sort Oject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Short Sort Oject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShortSortOject(ShortSortOject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortObject(SortObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Object Properties Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Object Properties Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortObjectPropertiesObject(SortObjectPropertiesObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortObjectProperty(SortObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SORT MODE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SORT MODE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSORT_MODE(SORT_MODE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASC DESC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASC DESC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASC_DESC(ASC_DESC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fields</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fields</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFields(Fields object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterObject(FilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterType(FilterType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryObject(QueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryType(QueryType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanQuery(SpanQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Term Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Term Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiTermQuery(MultiTermQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacets(Facets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facets Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facets Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetsObject(FacetsObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Type Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Type Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetTypeObject(FacetTypeObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetType(FacetType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Distance Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Distance Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoDistanceFacet(GeoDistanceFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Distance Facet Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Distance Facet Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoDistanceFacetObject(GeoDistanceFacetObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Stats Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Stats Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsStatsFacet(TermsStatsFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statistical Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statistical Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatisticalFacet(StatisticalFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statistical Facet Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statistical Facet Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatisticalFacetObject(StatisticalFacetObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryFacet(QueryFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterFacet(FilterFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Histogram Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Histogram Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateHistogramFacet(DateHistogramFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Histogram Facet Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Histogram Facet Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateHistogramFacetObject(DateHistogramFacetObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Histogram Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Histogram Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHistogramFacet(HistogramFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Histogram Facet Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Histogram Facet Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHistogramFacetObject(HistogramFacetObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFacet(RangeFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Facet Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Facet Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFacetObject(RangeFacetObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValueField(KeyValueField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValueScript(KeyValueScript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsFacet(TermsFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Facet Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Facet Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsFacetObject(TermsFacetObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Facet Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Facet Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsFacetParameter(TermsFacetParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetParameter(FacetParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Filter Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Filter Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetFilterParam(FacetFilterParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Terms Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Terms Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllTermsParam(AllTermsParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exclude Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exclude Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExcludeParam(ExcludeParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScriptParam(ScriptParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script Field Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script Field Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScriptFieldParam(ScriptFieldParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Like Text Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Like Text Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLikeTextParam(LikeTextParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchQuery(MatchQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Short Match Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Short Match Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShortMatchQueryObject(ShortMatchQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchQueryObject(MatchQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Query Parameters Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchQueryParametersObject(MatchQueryParametersObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Match Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Match Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiMatchQuery(MultiMatchQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Match Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Match Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiMatchQueryObject(MultiMatchQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolQuery(BoolQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolQueryObject(BoolQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolClause(BoolClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonQuery(CommonQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonQueryObject(CommonQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Query Parameters Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonQueryParametersObject(CommonQueryParametersObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Score Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Score Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantScoreQuery(ConstantScoreQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Score Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Score Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantScoreQueryObject(ConstantScoreQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dis Max Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dis Max Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisMaxQuery(DisMaxQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dis Max Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dis Max Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisMaxQueryObject(DisMaxQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filtered Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filtered Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilteredQuery(FilteredQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filtered Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filtered Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilteredQueryObject(FilteredQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Like This Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Like This Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyLikeThisQuery(FuzzyLikeThisQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Like This Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Like This Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyLikeThisQueryObject(FuzzyLikeThisQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Like This Field Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Like This Field Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyLikeThisFieldQuery(FuzzyLikeThisFieldQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Like This Field Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Like This Field Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyLikeThisFieldQueryObject(FuzzyLikeThisFieldQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyQuery(FuzzyQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Fuzzy Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Fuzzy Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleFuzzyQueryObject(SimpleFuzzyQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyQueryObject(FuzzyQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Query Object Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Query Object Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyQueryObjectParameters(FuzzyQueryObjectParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geoshape Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geoshape Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoshapeQuery(GeoshapeQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geoshape Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geoshape Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoshapeQueryObject(GeoshapeQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Child Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Child Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasChildQuery(HasChildQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Child Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Child Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasChildQueryObject(HasChildQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Parent Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Parent Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasParentQuery(HasParentQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Parent Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Parent Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasParentQueryObject(HasParentQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indices Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indices Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicesQuery(IndicesQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indices Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indices Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicesQueryObject(IndicesQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More Like This Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Like This Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoreLikeThisQuery(MoreLikeThisQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More Like This Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Like This Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoreLikeThisQueryObject(MoreLikeThisQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More Like This Field Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Like This Field Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoreLikeThisFieldQuery(MoreLikeThisFieldQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More Like This Field Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Like This Field Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoreLikeThisFieldQueryObject(MoreLikeThisFieldQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedQuery(NestedQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedQueryObject(NestedQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixQuery(PrefixQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Prefix Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Prefix Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimplePrefixQueryObject(SimplePrefixQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixQueryObject(PrefixQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Query Parameter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Query Parameter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixQueryParameterObject(PrefixQueryParameterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query String Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query String Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryStringQuery(QueryStringQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query String Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query String Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryStringQueryObject(QueryStringQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Query String Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Query String Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleQueryStringQuery(SimpleQueryStringQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Query String Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Query String Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleQueryStringQueryObject(SimpleQueryStringQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeQuery(RangeQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeQueryObject(RangeQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Query Parameters Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeQueryParametersObject(RangeQueryParametersObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regexp Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regexp Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexpQuery(RegexpQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regexp Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regexp Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexpQueryObject(RegexpQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regexp Query Parameter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regexp Query Parameter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexpQueryParameterObject(RegexpQueryParameterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span First Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span First Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanFirstQuery(SpanFirstQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span First Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span First Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanFirstQueryObject(SpanFirstQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Multi Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Multi Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanMultiQuery(SpanMultiQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Multi Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Multi Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanMultiQueryObject(SpanMultiQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Near Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Near Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanNearQuery(SpanNearQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Near Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Near Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanNearQueryObject(SpanNearQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Not Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Not Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanNotQuery(SpanNotQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Not Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Not Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanNotQueryObject(SpanNotQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Or Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Or Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanOrQuery(SpanOrQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Or Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Or Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanOrQueryObject(SpanOrQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Term Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Term Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanTermQuery(SpanTermQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Span Term Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Span Term Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpanTermQueryObject(SpanTermQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermQuery(TermQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermQueryObject(TermQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Query Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Query Parameters Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermQueryParametersObject(TermQueryParametersObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsQuery(TermsQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsQueryObject(TermsQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Children Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Children Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopChildrenQuery(TopChildrenQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Children Query Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Children Query Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopChildrenQueryObject(TopChildrenQueryObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardQuery(WildcardQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndFilter(AndFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple And Filter Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple And Filter Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleAndFilterArray(SimpleAndFilterArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndFilterObject(AndFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolFilter(BoolFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolFilterObject(BoolFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Filter Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Filter Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolFilterClause(BoolFilterClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Bounding Box Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Bounding Box Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoBoundingBoxFilter(GeoBoundingBoxFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Bounding Box Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Bounding Box Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoBoundingBoxFilterObject(GeoBoundingBoxFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Distance Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Distance Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoDistanceFilter(GeoDistanceFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Distance Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Distance Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoDistanceFilterObject(GeoDistanceFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Distance Range Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Distance Range Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoDistanceRangeFilter(GeoDistanceRangeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Distance Range Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Distance Range Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoDistanceRangeFilterObject(GeoDistanceRangeFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Polygon Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Polygon Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoPolygonFilter(GeoPolygonFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Polygon Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Polygon Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoPolygonFilterObject(GeoPolygonFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Shape Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Shape Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoShapeFilter(GeoShapeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Shape Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Shape Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoShapeFilterObject(GeoShapeFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geohash Cell Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geohash Cell Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeohashCellFilter(GeohashCellFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geohash Cell Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geohash Cell Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeohashCellFilterObject(GeohashCellFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Child Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Child Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasChildFilter(HasChildFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Child Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Child Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasChildFilterObject(HasChildFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Parent Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Parent Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasParentFilter(HasParentFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Parent Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Parent Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasParentFilterObject(HasParentFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indices Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indices Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicesFilter(IndicesFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indices Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indices Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicesFilterObject(IndicesFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedFilter(NestedFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedFilterObject(NestedFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotFilter(NotFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotFilterObject(NotFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrFilter(OrFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Filter Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Filter Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrFilterArray(OrFilterArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixFilter(PrefixFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixFilterObject(PrefixFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryFilter(QueryFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FQuery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FQuery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFQuery(FQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFilter(RangeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFilterObject(RangeFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Filter Parameters Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Filter Parameters Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeFilterParametersObject(RangeFilterParametersObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regexp Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regexp Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexpFilter(RegexpFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regexp Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regexp Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexpFilterObject(RegexpFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regexp Filter Parameter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regexp Filter Parameter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegexpFilterParameterObject(RegexpFilterParameterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScriptFilter(ScriptFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScriptFilterObject(ScriptFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermFilter(TermFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermFilterObject(TermFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsFilter(TermsFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermsFilterObject(TermsFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFilter(TypeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Filter Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Filter Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFilterObject(TypeFilterObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Shape Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Shape Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoShapeObject(GeoShapeObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoShape(GeoShape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolygon(Polygon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bounding Box Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bounding Box Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoundingBoxObject(BoundingBoxObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Two Point Bounding Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Two Point Bounding Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTwoPointBoundingBox(TwoPointBoundingBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lat Lon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lat Lon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatLon(LatLon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lat Lon Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lat Lon Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatLonArray(LatLonArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lat Lon String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lat Lon String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatLonString(LatLonString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeObject(ShapeObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShape(Shape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeType(ShapeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Type Envelope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Type Envelope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeTypeEnvelope(ShapeTypeEnvelope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(com.first8.elasticsearch.dsl.search.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray(Array object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SearchSwitch
