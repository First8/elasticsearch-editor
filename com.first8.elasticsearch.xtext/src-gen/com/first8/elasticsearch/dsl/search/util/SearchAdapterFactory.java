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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.first8.elasticsearch.dsl.search.SearchPackage
 * @generated
 */
public class SearchAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SearchPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SearchPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SearchSwitch<Adapter> modelSwitch =
    new SearchSwitch<Adapter>()
    {
      @Override
      public Adapter caseSearchDSL(SearchDSL object)
      {
        return createSearchDSLAdapter();
      }
      @Override
      public Adapter caseSearchField(SearchField object)
      {
        return createSearchFieldAdapter();
      }
      @Override
      public Adapter caseStats(Stats object)
      {
        return createStatsAdapter();
      }
      @Override
      public Adapter caseSort(Sort object)
      {
        return createSortAdapter();
      }
      @Override
      public Adapter caseSortValue(SortValue object)
      {
        return createSortValueAdapter();
      }
      @Override
      public Adapter caseShortSortOject(ShortSortOject object)
      {
        return createShortSortOjectAdapter();
      }
      @Override
      public Adapter caseSortObject(SortObject object)
      {
        return createSortObjectAdapter();
      }
      @Override
      public Adapter caseSortObjectPropertiesObject(SortObjectPropertiesObject object)
      {
        return createSortObjectPropertiesObjectAdapter();
      }
      @Override
      public Adapter caseSortObjectProperty(SortObjectProperty object)
      {
        return createSortObjectPropertyAdapter();
      }
      @Override
      public Adapter caseSORT_MODE(SORT_MODE object)
      {
        return createSORT_MODEAdapter();
      }
      @Override
      public Adapter caseASC_DESC(ASC_DESC object)
      {
        return createASC_DESCAdapter();
      }
      @Override
      public Adapter caseFields(Fields object)
      {
        return createFieldsAdapter();
      }
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseFilter(Filter object)
      {
        return createFilterAdapter();
      }
      @Override
      public Adapter caseFilterObject(FilterObject object)
      {
        return createFilterObjectAdapter();
      }
      @Override
      public Adapter caseFilterType(FilterType object)
      {
        return createFilterTypeAdapter();
      }
      @Override
      public Adapter caseQueryObject(QueryObject object)
      {
        return createQueryObjectAdapter();
      }
      @Override
      public Adapter caseQueryType(QueryType object)
      {
        return createQueryTypeAdapter();
      }
      @Override
      public Adapter caseSpanQuery(SpanQuery object)
      {
        return createSpanQueryAdapter();
      }
      @Override
      public Adapter caseMultiTermQuery(MultiTermQuery object)
      {
        return createMultiTermQueryAdapter();
      }
      @Override
      public Adapter caseFacets(Facets object)
      {
        return createFacetsAdapter();
      }
      @Override
      public Adapter caseFacetsObject(FacetsObject object)
      {
        return createFacetsObjectAdapter();
      }
      @Override
      public Adapter caseFacetTypeObject(FacetTypeObject object)
      {
        return createFacetTypeObjectAdapter();
      }
      @Override
      public Adapter caseFacetType(FacetType object)
      {
        return createFacetTypeAdapter();
      }
      @Override
      public Adapter caseGeoDistanceFacet(GeoDistanceFacet object)
      {
        return createGeoDistanceFacetAdapter();
      }
      @Override
      public Adapter caseGeoDistanceFacetObject(GeoDistanceFacetObject object)
      {
        return createGeoDistanceFacetObjectAdapter();
      }
      @Override
      public Adapter caseTermsStatsFacet(TermsStatsFacet object)
      {
        return createTermsStatsFacetAdapter();
      }
      @Override
      public Adapter caseStatisticalFacet(StatisticalFacet object)
      {
        return createStatisticalFacetAdapter();
      }
      @Override
      public Adapter caseStatisticalFacetObject(StatisticalFacetObject object)
      {
        return createStatisticalFacetObjectAdapter();
      }
      @Override
      public Adapter caseQueryFacet(QueryFacet object)
      {
        return createQueryFacetAdapter();
      }
      @Override
      public Adapter caseFilterFacet(FilterFacet object)
      {
        return createFilterFacetAdapter();
      }
      @Override
      public Adapter caseDateHistogramFacet(DateHistogramFacet object)
      {
        return createDateHistogramFacetAdapter();
      }
      @Override
      public Adapter caseDateHistogramFacetObject(DateHistogramFacetObject object)
      {
        return createDateHistogramFacetObjectAdapter();
      }
      @Override
      public Adapter caseHistogramFacet(HistogramFacet object)
      {
        return createHistogramFacetAdapter();
      }
      @Override
      public Adapter caseHistogramFacetObject(HistogramFacetObject object)
      {
        return createHistogramFacetObjectAdapter();
      }
      @Override
      public Adapter caseRangeFacet(RangeFacet object)
      {
        return createRangeFacetAdapter();
      }
      @Override
      public Adapter caseRangeFacetObject(RangeFacetObject object)
      {
        return createRangeFacetObjectAdapter();
      }
      @Override
      public Adapter caseKeyValueField(KeyValueField object)
      {
        return createKeyValueFieldAdapter();
      }
      @Override
      public Adapter caseKeyValueScript(KeyValueScript object)
      {
        return createKeyValueScriptAdapter();
      }
      @Override
      public Adapter caseTermsFacet(TermsFacet object)
      {
        return createTermsFacetAdapter();
      }
      @Override
      public Adapter caseTermsFacetObject(TermsFacetObject object)
      {
        return createTermsFacetObjectAdapter();
      }
      @Override
      public Adapter caseTermsFacetParameter(TermsFacetParameter object)
      {
        return createTermsFacetParameterAdapter();
      }
      @Override
      public Adapter caseFacetParameter(FacetParameter object)
      {
        return createFacetParameterAdapter();
      }
      @Override
      public Adapter caseFacetFilterParam(FacetFilterParam object)
      {
        return createFacetFilterParamAdapter();
      }
      @Override
      public Adapter caseAllTermsParam(AllTermsParam object)
      {
        return createAllTermsParamAdapter();
      }
      @Override
      public Adapter caseExcludeParam(ExcludeParam object)
      {
        return createExcludeParamAdapter();
      }
      @Override
      public Adapter caseScriptParam(ScriptParam object)
      {
        return createScriptParamAdapter();
      }
      @Override
      public Adapter caseScriptFieldParam(ScriptFieldParam object)
      {
        return createScriptFieldParamAdapter();
      }
      @Override
      public Adapter caseLikeTextParam(LikeTextParam object)
      {
        return createLikeTextParamAdapter();
      }
      @Override
      public Adapter caseMatchQuery(MatchQuery object)
      {
        return createMatchQueryAdapter();
      }
      @Override
      public Adapter caseShortMatchQueryObject(ShortMatchQueryObject object)
      {
        return createShortMatchQueryObjectAdapter();
      }
      @Override
      public Adapter caseMatchQueryObject(MatchQueryObject object)
      {
        return createMatchQueryObjectAdapter();
      }
      @Override
      public Adapter caseMatchQueryParametersObject(MatchQueryParametersObject object)
      {
        return createMatchQueryParametersObjectAdapter();
      }
      @Override
      public Adapter caseMultiMatchQuery(MultiMatchQuery object)
      {
        return createMultiMatchQueryAdapter();
      }
      @Override
      public Adapter caseMultiMatchQueryObject(MultiMatchQueryObject object)
      {
        return createMultiMatchQueryObjectAdapter();
      }
      @Override
      public Adapter caseBoolQuery(BoolQuery object)
      {
        return createBoolQueryAdapter();
      }
      @Override
      public Adapter caseBoolQueryObject(BoolQueryObject object)
      {
        return createBoolQueryObjectAdapter();
      }
      @Override
      public Adapter caseBoolClause(BoolClause object)
      {
        return createBoolClauseAdapter();
      }
      @Override
      public Adapter caseCommonQuery(CommonQuery object)
      {
        return createCommonQueryAdapter();
      }
      @Override
      public Adapter caseCommonQueryObject(CommonQueryObject object)
      {
        return createCommonQueryObjectAdapter();
      }
      @Override
      public Adapter caseCommonQueryParametersObject(CommonQueryParametersObject object)
      {
        return createCommonQueryParametersObjectAdapter();
      }
      @Override
      public Adapter caseConstantScoreQuery(ConstantScoreQuery object)
      {
        return createConstantScoreQueryAdapter();
      }
      @Override
      public Adapter caseConstantScoreQueryObject(ConstantScoreQueryObject object)
      {
        return createConstantScoreQueryObjectAdapter();
      }
      @Override
      public Adapter caseDisMaxQuery(DisMaxQuery object)
      {
        return createDisMaxQueryAdapter();
      }
      @Override
      public Adapter caseDisMaxQueryObject(DisMaxQueryObject object)
      {
        return createDisMaxQueryObjectAdapter();
      }
      @Override
      public Adapter caseFilteredQuery(FilteredQuery object)
      {
        return createFilteredQueryAdapter();
      }
      @Override
      public Adapter caseFilteredQueryObject(FilteredQueryObject object)
      {
        return createFilteredQueryObjectAdapter();
      }
      @Override
      public Adapter caseFuzzyLikeThisQuery(FuzzyLikeThisQuery object)
      {
        return createFuzzyLikeThisQueryAdapter();
      }
      @Override
      public Adapter caseFuzzyLikeThisQueryObject(FuzzyLikeThisQueryObject object)
      {
        return createFuzzyLikeThisQueryObjectAdapter();
      }
      @Override
      public Adapter caseFuzzyLikeThisFieldQuery(FuzzyLikeThisFieldQuery object)
      {
        return createFuzzyLikeThisFieldQueryAdapter();
      }
      @Override
      public Adapter caseFuzzyLikeThisFieldQueryObject(FuzzyLikeThisFieldQueryObject object)
      {
        return createFuzzyLikeThisFieldQueryObjectAdapter();
      }
      @Override
      public Adapter caseFuzzyQuery(FuzzyQuery object)
      {
        return createFuzzyQueryAdapter();
      }
      @Override
      public Adapter caseSimpleFuzzyQueryObject(SimpleFuzzyQueryObject object)
      {
        return createSimpleFuzzyQueryObjectAdapter();
      }
      @Override
      public Adapter caseFuzzyQueryObject(FuzzyQueryObject object)
      {
        return createFuzzyQueryObjectAdapter();
      }
      @Override
      public Adapter caseFuzzyQueryObjectParameters(FuzzyQueryObjectParameters object)
      {
        return createFuzzyQueryObjectParametersAdapter();
      }
      @Override
      public Adapter caseGeoshapeQuery(GeoshapeQuery object)
      {
        return createGeoshapeQueryAdapter();
      }
      @Override
      public Adapter caseGeoshapeQueryObject(GeoshapeQueryObject object)
      {
        return createGeoshapeQueryObjectAdapter();
      }
      @Override
      public Adapter caseHasChildQuery(HasChildQuery object)
      {
        return createHasChildQueryAdapter();
      }
      @Override
      public Adapter caseHasChildQueryObject(HasChildQueryObject object)
      {
        return createHasChildQueryObjectAdapter();
      }
      @Override
      public Adapter caseHasParentQuery(HasParentQuery object)
      {
        return createHasParentQueryAdapter();
      }
      @Override
      public Adapter caseHasParentQueryObject(HasParentQueryObject object)
      {
        return createHasParentQueryObjectAdapter();
      }
      @Override
      public Adapter caseIndicesQuery(IndicesQuery object)
      {
        return createIndicesQueryAdapter();
      }
      @Override
      public Adapter caseIndicesQueryObject(IndicesQueryObject object)
      {
        return createIndicesQueryObjectAdapter();
      }
      @Override
      public Adapter caseMoreLikeThisQuery(MoreLikeThisQuery object)
      {
        return createMoreLikeThisQueryAdapter();
      }
      @Override
      public Adapter caseMoreLikeThisQueryObject(MoreLikeThisQueryObject object)
      {
        return createMoreLikeThisQueryObjectAdapter();
      }
      @Override
      public Adapter caseMoreLikeThisFieldQuery(MoreLikeThisFieldQuery object)
      {
        return createMoreLikeThisFieldQueryAdapter();
      }
      @Override
      public Adapter caseMoreLikeThisFieldQueryObject(MoreLikeThisFieldQueryObject object)
      {
        return createMoreLikeThisFieldQueryObjectAdapter();
      }
      @Override
      public Adapter caseNestedQuery(NestedQuery object)
      {
        return createNestedQueryAdapter();
      }
      @Override
      public Adapter caseNestedQueryObject(NestedQueryObject object)
      {
        return createNestedQueryObjectAdapter();
      }
      @Override
      public Adapter casePrefixQuery(PrefixQuery object)
      {
        return createPrefixQueryAdapter();
      }
      @Override
      public Adapter caseSimplePrefixQueryObject(SimplePrefixQueryObject object)
      {
        return createSimplePrefixQueryObjectAdapter();
      }
      @Override
      public Adapter casePrefixQueryObject(PrefixQueryObject object)
      {
        return createPrefixQueryObjectAdapter();
      }
      @Override
      public Adapter casePrefixQueryParameterObject(PrefixQueryParameterObject object)
      {
        return createPrefixQueryParameterObjectAdapter();
      }
      @Override
      public Adapter caseQueryStringQuery(QueryStringQuery object)
      {
        return createQueryStringQueryAdapter();
      }
      @Override
      public Adapter caseQueryStringQueryObject(QueryStringQueryObject object)
      {
        return createQueryStringQueryObjectAdapter();
      }
      @Override
      public Adapter caseSimpleQueryStringQuery(SimpleQueryStringQuery object)
      {
        return createSimpleQueryStringQueryAdapter();
      }
      @Override
      public Adapter caseSimpleQueryStringQueryObject(SimpleQueryStringQueryObject object)
      {
        return createSimpleQueryStringQueryObjectAdapter();
      }
      @Override
      public Adapter caseRangeQuery(RangeQuery object)
      {
        return createRangeQueryAdapter();
      }
      @Override
      public Adapter caseRangeQueryObject(RangeQueryObject object)
      {
        return createRangeQueryObjectAdapter();
      }
      @Override
      public Adapter caseRangeQueryParametersObject(RangeQueryParametersObject object)
      {
        return createRangeQueryParametersObjectAdapter();
      }
      @Override
      public Adapter caseRegexpQuery(RegexpQuery object)
      {
        return createRegexpQueryAdapter();
      }
      @Override
      public Adapter caseRegexpQueryObject(RegexpQueryObject object)
      {
        return createRegexpQueryObjectAdapter();
      }
      @Override
      public Adapter caseRegexpQueryParameterObject(RegexpQueryParameterObject object)
      {
        return createRegexpQueryParameterObjectAdapter();
      }
      @Override
      public Adapter caseSpanFirstQuery(SpanFirstQuery object)
      {
        return createSpanFirstQueryAdapter();
      }
      @Override
      public Adapter caseSpanFirstQueryObject(SpanFirstQueryObject object)
      {
        return createSpanFirstQueryObjectAdapter();
      }
      @Override
      public Adapter caseSpanMultiQuery(SpanMultiQuery object)
      {
        return createSpanMultiQueryAdapter();
      }
      @Override
      public Adapter caseSpanMultiQueryObject(SpanMultiQueryObject object)
      {
        return createSpanMultiQueryObjectAdapter();
      }
      @Override
      public Adapter caseSpanNearQuery(SpanNearQuery object)
      {
        return createSpanNearQueryAdapter();
      }
      @Override
      public Adapter caseSpanNearQueryObject(SpanNearQueryObject object)
      {
        return createSpanNearQueryObjectAdapter();
      }
      @Override
      public Adapter caseSpanNotQuery(SpanNotQuery object)
      {
        return createSpanNotQueryAdapter();
      }
      @Override
      public Adapter caseSpanNotQueryObject(SpanNotQueryObject object)
      {
        return createSpanNotQueryObjectAdapter();
      }
      @Override
      public Adapter caseSpanOrQuery(SpanOrQuery object)
      {
        return createSpanOrQueryAdapter();
      }
      @Override
      public Adapter caseSpanOrQueryObject(SpanOrQueryObject object)
      {
        return createSpanOrQueryObjectAdapter();
      }
      @Override
      public Adapter caseSpanTermQuery(SpanTermQuery object)
      {
        return createSpanTermQueryAdapter();
      }
      @Override
      public Adapter caseSpanTermQueryObject(SpanTermQueryObject object)
      {
        return createSpanTermQueryObjectAdapter();
      }
      @Override
      public Adapter caseTermQuery(TermQuery object)
      {
        return createTermQueryAdapter();
      }
      @Override
      public Adapter caseTermQueryObject(TermQueryObject object)
      {
        return createTermQueryObjectAdapter();
      }
      @Override
      public Adapter caseTermQueryParametersObject(TermQueryParametersObject object)
      {
        return createTermQueryParametersObjectAdapter();
      }
      @Override
      public Adapter caseTermsQuery(TermsQuery object)
      {
        return createTermsQueryAdapter();
      }
      @Override
      public Adapter caseTermsQueryObject(TermsQueryObject object)
      {
        return createTermsQueryObjectAdapter();
      }
      @Override
      public Adapter caseTopChildrenQuery(TopChildrenQuery object)
      {
        return createTopChildrenQueryAdapter();
      }
      @Override
      public Adapter caseTopChildrenQueryObject(TopChildrenQueryObject object)
      {
        return createTopChildrenQueryObjectAdapter();
      }
      @Override
      public Adapter caseWildcardQuery(WildcardQuery object)
      {
        return createWildcardQueryAdapter();
      }
      @Override
      public Adapter caseAndFilter(AndFilter object)
      {
        return createAndFilterAdapter();
      }
      @Override
      public Adapter caseSimpleAndFilterArray(SimpleAndFilterArray object)
      {
        return createSimpleAndFilterArrayAdapter();
      }
      @Override
      public Adapter caseAndFilterObject(AndFilterObject object)
      {
        return createAndFilterObjectAdapter();
      }
      @Override
      public Adapter caseBoolFilter(BoolFilter object)
      {
        return createBoolFilterAdapter();
      }
      @Override
      public Adapter caseBoolFilterObject(BoolFilterObject object)
      {
        return createBoolFilterObjectAdapter();
      }
      @Override
      public Adapter caseBoolFilterClause(BoolFilterClause object)
      {
        return createBoolFilterClauseAdapter();
      }
      @Override
      public Adapter caseGeoBoundingBoxFilter(GeoBoundingBoxFilter object)
      {
        return createGeoBoundingBoxFilterAdapter();
      }
      @Override
      public Adapter caseGeoBoundingBoxFilterObject(GeoBoundingBoxFilterObject object)
      {
        return createGeoBoundingBoxFilterObjectAdapter();
      }
      @Override
      public Adapter caseGeoDistanceFilter(GeoDistanceFilter object)
      {
        return createGeoDistanceFilterAdapter();
      }
      @Override
      public Adapter caseGeoDistanceFilterObject(GeoDistanceFilterObject object)
      {
        return createGeoDistanceFilterObjectAdapter();
      }
      @Override
      public Adapter caseGeoDistanceRangeFilter(GeoDistanceRangeFilter object)
      {
        return createGeoDistanceRangeFilterAdapter();
      }
      @Override
      public Adapter caseGeoDistanceRangeFilterObject(GeoDistanceRangeFilterObject object)
      {
        return createGeoDistanceRangeFilterObjectAdapter();
      }
      @Override
      public Adapter caseGeoPolygonFilter(GeoPolygonFilter object)
      {
        return createGeoPolygonFilterAdapter();
      }
      @Override
      public Adapter caseGeoPolygonFilterObject(GeoPolygonFilterObject object)
      {
        return createGeoPolygonFilterObjectAdapter();
      }
      @Override
      public Adapter caseGeoShapeFilter(GeoShapeFilter object)
      {
        return createGeoShapeFilterAdapter();
      }
      @Override
      public Adapter caseGeoShapeFilterObject(GeoShapeFilterObject object)
      {
        return createGeoShapeFilterObjectAdapter();
      }
      @Override
      public Adapter caseGeohashCellFilter(GeohashCellFilter object)
      {
        return createGeohashCellFilterAdapter();
      }
      @Override
      public Adapter caseGeohashCellFilterObject(GeohashCellFilterObject object)
      {
        return createGeohashCellFilterObjectAdapter();
      }
      @Override
      public Adapter caseHasChildFilter(HasChildFilter object)
      {
        return createHasChildFilterAdapter();
      }
      @Override
      public Adapter caseHasChildFilterObject(HasChildFilterObject object)
      {
        return createHasChildFilterObjectAdapter();
      }
      @Override
      public Adapter caseHasParentFilter(HasParentFilter object)
      {
        return createHasParentFilterAdapter();
      }
      @Override
      public Adapter caseHasParentFilterObject(HasParentFilterObject object)
      {
        return createHasParentFilterObjectAdapter();
      }
      @Override
      public Adapter caseIndicesFilter(IndicesFilter object)
      {
        return createIndicesFilterAdapter();
      }
      @Override
      public Adapter caseIndicesFilterObject(IndicesFilterObject object)
      {
        return createIndicesFilterObjectAdapter();
      }
      @Override
      public Adapter caseNestedFilter(NestedFilter object)
      {
        return createNestedFilterAdapter();
      }
      @Override
      public Adapter caseNestedFilterObject(NestedFilterObject object)
      {
        return createNestedFilterObjectAdapter();
      }
      @Override
      public Adapter caseNotFilter(NotFilter object)
      {
        return createNotFilterAdapter();
      }
      @Override
      public Adapter caseNotFilterObject(NotFilterObject object)
      {
        return createNotFilterObjectAdapter();
      }
      @Override
      public Adapter caseOrFilter(OrFilter object)
      {
        return createOrFilterAdapter();
      }
      @Override
      public Adapter caseOrFilterArray(OrFilterArray object)
      {
        return createOrFilterArrayAdapter();
      }
      @Override
      public Adapter casePrefixFilter(PrefixFilter object)
      {
        return createPrefixFilterAdapter();
      }
      @Override
      public Adapter casePrefixFilterObject(PrefixFilterObject object)
      {
        return createPrefixFilterObjectAdapter();
      }
      @Override
      public Adapter caseQueryFilter(QueryFilter object)
      {
        return createQueryFilterAdapter();
      }
      @Override
      public Adapter caseFQuery(FQuery object)
      {
        return createFQueryAdapter();
      }
      @Override
      public Adapter caseRangeFilter(RangeFilter object)
      {
        return createRangeFilterAdapter();
      }
      @Override
      public Adapter caseRangeFilterObject(RangeFilterObject object)
      {
        return createRangeFilterObjectAdapter();
      }
      @Override
      public Adapter caseRangeFilterParametersObject(RangeFilterParametersObject object)
      {
        return createRangeFilterParametersObjectAdapter();
      }
      @Override
      public Adapter caseRegexpFilter(RegexpFilter object)
      {
        return createRegexpFilterAdapter();
      }
      @Override
      public Adapter caseRegexpFilterObject(RegexpFilterObject object)
      {
        return createRegexpFilterObjectAdapter();
      }
      @Override
      public Adapter caseRegexpFilterParameterObject(RegexpFilterParameterObject object)
      {
        return createRegexpFilterParameterObjectAdapter();
      }
      @Override
      public Adapter caseScriptFilter(ScriptFilter object)
      {
        return createScriptFilterAdapter();
      }
      @Override
      public Adapter caseScriptFilterObject(ScriptFilterObject object)
      {
        return createScriptFilterObjectAdapter();
      }
      @Override
      public Adapter caseTermFilter(TermFilter object)
      {
        return createTermFilterAdapter();
      }
      @Override
      public Adapter caseTermFilterObject(TermFilterObject object)
      {
        return createTermFilterObjectAdapter();
      }
      @Override
      public Adapter caseTermsFilter(TermsFilter object)
      {
        return createTermsFilterAdapter();
      }
      @Override
      public Adapter caseTermsFilterObject(TermsFilterObject object)
      {
        return createTermsFilterObjectAdapter();
      }
      @Override
      public Adapter caseTypeFilter(TypeFilter object)
      {
        return createTypeFilterAdapter();
      }
      @Override
      public Adapter caseTypeFilterObject(TypeFilterObject object)
      {
        return createTypeFilterObjectAdapter();
      }
      @Override
      public Adapter caseGeoShapeObject(GeoShapeObject object)
      {
        return createGeoShapeObjectAdapter();
      }
      @Override
      public Adapter caseGeoShape(GeoShape object)
      {
        return createGeoShapeAdapter();
      }
      @Override
      public Adapter casePolygon(Polygon object)
      {
        return createPolygonAdapter();
      }
      @Override
      public Adapter caseBoundingBoxObject(BoundingBoxObject object)
      {
        return createBoundingBoxObjectAdapter();
      }
      @Override
      public Adapter caseTwoPointBoundingBox(TwoPointBoundingBox object)
      {
        return createTwoPointBoundingBoxAdapter();
      }
      @Override
      public Adapter caseLatLon(LatLon object)
      {
        return createLatLonAdapter();
      }
      @Override
      public Adapter caseLatLonArray(LatLonArray object)
      {
        return createLatLonArrayAdapter();
      }
      @Override
      public Adapter caseLatLonString(LatLonString object)
      {
        return createLatLonStringAdapter();
      }
      @Override
      public Adapter caseShapeObject(ShapeObject object)
      {
        return createShapeObjectAdapter();
      }
      @Override
      public Adapter caseShape(Shape object)
      {
        return createShapeAdapter();
      }
      @Override
      public Adapter caseShapeType(ShapeType object)
      {
        return createShapeTypeAdapter();
      }
      @Override
      public Adapter caseShapeTypeEnvelope(ShapeTypeEnvelope object)
      {
        return createShapeTypeEnvelopeAdapter();
      }
      @Override
      public Adapter caseObject(com.first8.elasticsearch.dsl.search.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseArray(Array object)
      {
        return createArrayAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SearchDSL <em>DSL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL
   * @generated
   */
  public Adapter createSearchDSLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SearchField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SearchField
   * @generated
   */
  public Adapter createSearchFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Stats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Stats
   * @generated
   */
  public Adapter createStatsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Sort
   * @generated
   */
  public Adapter createSortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SortValue <em>Sort Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SortValue
   * @generated
   */
  public Adapter createSortValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ShortSortOject <em>Short Sort Oject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ShortSortOject
   * @generated
   */
  public Adapter createShortSortOjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SortObject <em>Sort Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SortObject
   * @generated
   */
  public Adapter createSortObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject <em>Sort Object Properties Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject
   * @generated
   */
  public Adapter createSortObjectPropertiesObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty <em>Sort Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SortObjectProperty
   * @generated
   */
  public Adapter createSortObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SORT_MODE <em>SORT MODE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SORT_MODE
   * @generated
   */
  public Adapter createSORT_MODEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ASC_DESC <em>ASC DESC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ASC_DESC
   * @generated
   */
  public Adapter createASC_DESCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Fields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Fields
   * @generated
   */
  public Adapter createFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Filter
   * @generated
   */
  public Adapter createFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FilterObject <em>Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FilterObject
   * @generated
   */
  public Adapter createFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FilterType <em>Filter Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FilterType
   * @generated
   */
  public Adapter createFilterTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.QueryObject <em>Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.QueryObject
   * @generated
   */
  public Adapter createQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.QueryType <em>Query Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.QueryType
   * @generated
   */
  public Adapter createQueryTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanQuery <em>Span Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanQuery
   * @generated
   */
  public Adapter createSpanQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MultiTermQuery <em>Multi Term Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MultiTermQuery
   * @generated
   */
  public Adapter createMultiTermQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Facets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Facets
   * @generated
   */
  public Adapter createFacetsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FacetsObject <em>Facets Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FacetsObject
   * @generated
   */
  public Adapter createFacetsObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FacetTypeObject <em>Facet Type Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FacetTypeObject
   * @generated
   */
  public Adapter createFacetTypeObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FacetType <em>Facet Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FacetType
   * @generated
   */
  public Adapter createFacetTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFacet <em>Geo Distance Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFacet
   * @generated
   */
  public Adapter createGeoDistanceFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject <em>Geo Distance Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject
   * @generated
   */
  public Adapter createGeoDistanceFacetObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsStatsFacet <em>Terms Stats Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsStatsFacet
   * @generated
   */
  public Adapter createTermsStatsFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.StatisticalFacet <em>Statistical Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacet
   * @generated
   */
  public Adapter createStatisticalFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject <em>Statistical Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacetObject
   * @generated
   */
  public Adapter createStatisticalFacetObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.QueryFacet <em>Query Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.QueryFacet
   * @generated
   */
  public Adapter createQueryFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FilterFacet <em>Filter Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FilterFacet
   * @generated
   */
  public Adapter createFilterFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacet <em>Date Histogram Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacet
   * @generated
   */
  public Adapter createDateHistogramFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacetObject <em>Date Histogram Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacetObject
   * @generated
   */
  public Adapter createDateHistogramFacetObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HistogramFacet <em>Histogram Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacet
   * @generated
   */
  public Adapter createHistogramFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject <em>Histogram Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacetObject
   * @generated
   */
  public Adapter createHistogramFacetObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeFacet <em>Range Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeFacet
   * @generated
   */
  public Adapter createRangeFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeFacetObject <em>Range Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeFacetObject
   * @generated
   */
  public Adapter createRangeFacetObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.KeyValueField <em>Key Value Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.KeyValueField
   * @generated
   */
  public Adapter createKeyValueFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.KeyValueScript <em>Key Value Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.KeyValueScript
   * @generated
   */
  public Adapter createKeyValueScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsFacet <em>Terms Facet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsFacet
   * @generated
   */
  public Adapter createTermsFacetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsFacetObject <em>Terms Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetObject
   * @generated
   */
  public Adapter createTermsFacetObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter <em>Terms Facet Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter
   * @generated
   */
  public Adapter createTermsFacetParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FacetParameter <em>Facet Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FacetParameter
   * @generated
   */
  public Adapter createFacetParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FacetFilterParam <em>Facet Filter Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FacetFilterParam
   * @generated
   */
  public Adapter createFacetFilterParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.AllTermsParam <em>All Terms Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.AllTermsParam
   * @generated
   */
  public Adapter createAllTermsParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ExcludeParam <em>Exclude Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ExcludeParam
   * @generated
   */
  public Adapter createExcludeParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ScriptParam <em>Script Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ScriptParam
   * @generated
   */
  public Adapter createScriptParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ScriptFieldParam <em>Script Field Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ScriptFieldParam
   * @generated
   */
  public Adapter createScriptFieldParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.LikeTextParam <em>Like Text Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.LikeTextParam
   * @generated
   */
  public Adapter createLikeTextParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MatchQuery <em>Match Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MatchQuery
   * @generated
   */
  public Adapter createMatchQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ShortMatchQueryObject <em>Short Match Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ShortMatchQueryObject
   * @generated
   */
  public Adapter createShortMatchQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MatchQueryObject <em>Match Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryObject
   * @generated
   */
  public Adapter createMatchQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MatchQueryParametersObject <em>Match Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryParametersObject
   * @generated
   */
  public Adapter createMatchQueryParametersObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MultiMatchQuery <em>Multi Match Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MultiMatchQuery
   * @generated
   */
  public Adapter createMultiMatchQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MultiMatchQueryObject <em>Multi Match Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MultiMatchQueryObject
   * @generated
   */
  public Adapter createMultiMatchQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoolQuery <em>Bool Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoolQuery
   * @generated
   */
  public Adapter createBoolQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoolQueryObject <em>Bool Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoolQueryObject
   * @generated
   */
  public Adapter createBoolQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoolClause <em>Bool Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoolClause
   * @generated
   */
  public Adapter createBoolClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.CommonQuery <em>Common Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.CommonQuery
   * @generated
   */
  public Adapter createCommonQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.CommonQueryObject <em>Common Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryObject
   * @generated
   */
  public Adapter createCommonQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.CommonQueryParametersObject <em>Common Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryParametersObject
   * @generated
   */
  public Adapter createCommonQueryParametersObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ConstantScoreQuery <em>Constant Score Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ConstantScoreQuery
   * @generated
   */
  public Adapter createConstantScoreQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ConstantScoreQueryObject <em>Constant Score Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ConstantScoreQueryObject
   * @generated
   */
  public Adapter createConstantScoreQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.DisMaxQuery <em>Dis Max Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.DisMaxQuery
   * @generated
   */
  public Adapter createDisMaxQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.DisMaxQueryObject <em>Dis Max Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.DisMaxQueryObject
   * @generated
   */
  public Adapter createDisMaxQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FilteredQuery <em>Filtered Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FilteredQuery
   * @generated
   */
  public Adapter createFilteredQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FilteredQueryObject <em>Filtered Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FilteredQueryObject
   * @generated
   */
  public Adapter createFilteredQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisQuery <em>Fuzzy Like This Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisQuery
   * @generated
   */
  public Adapter createFuzzyLikeThisQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisQueryObject <em>Fuzzy Like This Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisQueryObject
   * @generated
   */
  public Adapter createFuzzyLikeThisQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQuery <em>Fuzzy Like This Field Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQuery
   * @generated
   */
  public Adapter createFuzzyLikeThisFieldQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject <em>Fuzzy Like This Field Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject
   * @generated
   */
  public Adapter createFuzzyLikeThisFieldQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyQuery <em>Fuzzy Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQuery
   * @generated
   */
  public Adapter createFuzzyQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject <em>Simple Fuzzy Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject
   * @generated
   */
  public Adapter createSimpleFuzzyQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObject <em>Fuzzy Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObject
   * @generated
   */
  public Adapter createFuzzyQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters <em>Fuzzy Query Object Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters
   * @generated
   */
  public Adapter createFuzzyQueryObjectParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoshapeQuery <em>Geoshape Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoshapeQuery
   * @generated
   */
  public Adapter createGeoshapeQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoshapeQueryObject <em>Geoshape Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoshapeQueryObject
   * @generated
   */
  public Adapter createGeoshapeQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasChildQuery <em>Has Child Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasChildQuery
   * @generated
   */
  public Adapter createHasChildQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasChildQueryObject <em>Has Child Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasChildQueryObject
   * @generated
   */
  public Adapter createHasChildQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasParentQuery <em>Has Parent Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasParentQuery
   * @generated
   */
  public Adapter createHasParentQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject <em>Has Parent Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasParentQueryObject
   * @generated
   */
  public Adapter createHasParentQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.IndicesQuery <em>Indices Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.IndicesQuery
   * @generated
   */
  public Adapter createIndicesQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject <em>Indices Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.IndicesQueryObject
   * @generated
   */
  public Adapter createIndicesQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisQuery <em>More Like This Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisQuery
   * @generated
   */
  public Adapter createMoreLikeThisQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisQueryObject <em>More Like This Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisQueryObject
   * @generated
   */
  public Adapter createMoreLikeThisQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQuery <em>More Like This Field Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQuery
   * @generated
   */
  public Adapter createMoreLikeThisFieldQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject <em>More Like This Field Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject
   * @generated
   */
  public Adapter createMoreLikeThisFieldQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.NestedQuery <em>Nested Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.NestedQuery
   * @generated
   */
  public Adapter createNestedQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.NestedQueryObject <em>Nested Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.NestedQueryObject
   * @generated
   */
  public Adapter createNestedQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.PrefixQuery <em>Prefix Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.PrefixQuery
   * @generated
   */
  public Adapter createPrefixQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject <em>Simple Prefix Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject
   * @generated
   */
  public Adapter createSimplePrefixQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.PrefixQueryObject <em>Prefix Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.PrefixQueryObject
   * @generated
   */
  public Adapter createPrefixQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject <em>Prefix Query Parameter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject
   * @generated
   */
  public Adapter createPrefixQueryParameterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.QueryStringQuery <em>Query String Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.QueryStringQuery
   * @generated
   */
  public Adapter createQueryStringQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.QueryStringQueryObject <em>Query String Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.QueryStringQueryObject
   * @generated
   */
  public Adapter createQueryStringQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQuery <em>Simple Query String Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SimpleQueryStringQuery
   * @generated
   */
  public Adapter createSimpleQueryStringQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject <em>Simple Query String Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject
   * @generated
   */
  public Adapter createSimpleQueryStringQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeQuery <em>Range Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeQuery
   * @generated
   */
  public Adapter createRangeQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeQueryObject <em>Range Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryObject
   * @generated
   */
  public Adapter createRangeQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeQueryParametersObject <em>Range Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryParametersObject
   * @generated
   */
  public Adapter createRangeQueryParametersObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RegexpQuery <em>Regexp Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RegexpQuery
   * @generated
   */
  public Adapter createRegexpQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject <em>Regexp Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryObject
   * @generated
   */
  public Adapter createRegexpQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject <em>Regexp Query Parameter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject
   * @generated
   */
  public Adapter createRegexpQueryParameterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanFirstQuery <em>Span First Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanFirstQuery
   * @generated
   */
  public Adapter createSpanFirstQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanFirstQueryObject <em>Span First Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanFirstQueryObject
   * @generated
   */
  public Adapter createSpanFirstQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanMultiQuery <em>Span Multi Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanMultiQuery
   * @generated
   */
  public Adapter createSpanMultiQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanMultiQueryObject <em>Span Multi Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanMultiQueryObject
   * @generated
   */
  public Adapter createSpanMultiQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanNearQuery <em>Span Near Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQuery
   * @generated
   */
  public Adapter createSpanNearQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject <em>Span Near Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQueryObject
   * @generated
   */
  public Adapter createSpanNearQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanNotQuery <em>Span Not Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanNotQuery
   * @generated
   */
  public Adapter createSpanNotQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject <em>Span Not Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanNotQueryObject
   * @generated
   */
  public Adapter createSpanNotQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanOrQuery <em>Span Or Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanOrQuery
   * @generated
   */
  public Adapter createSpanOrQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanOrQueryObject <em>Span Or Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanOrQueryObject
   * @generated
   */
  public Adapter createSpanOrQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanTermQuery <em>Span Term Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanTermQuery
   * @generated
   */
  public Adapter createSpanTermQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SpanTermQueryObject <em>Span Term Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SpanTermQueryObject
   * @generated
   */
  public Adapter createSpanTermQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermQuery <em>Term Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermQuery
   * @generated
   */
  public Adapter createTermQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermQueryObject <em>Term Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermQueryObject
   * @generated
   */
  public Adapter createTermQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject <em>Term Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermQueryParametersObject
   * @generated
   */
  public Adapter createTermQueryParametersObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsQuery <em>Terms Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsQuery
   * @generated
   */
  public Adapter createTermsQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsQueryObject <em>Terms Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsQueryObject
   * @generated
   */
  public Adapter createTermsQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TopChildrenQuery <em>Top Children Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQuery
   * @generated
   */
  public Adapter createTopChildrenQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject <em>Top Children Query Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQueryObject
   * @generated
   */
  public Adapter createTopChildrenQueryObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.WildcardQuery <em>Wildcard Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.WildcardQuery
   * @generated
   */
  public Adapter createWildcardQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.AndFilter <em>And Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.AndFilter
   * @generated
   */
  public Adapter createAndFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.SimpleAndFilterArray <em>Simple And Filter Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.SimpleAndFilterArray
   * @generated
   */
  public Adapter createSimpleAndFilterArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.AndFilterObject <em>And Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.AndFilterObject
   * @generated
   */
  public Adapter createAndFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoolFilter <em>Bool Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoolFilter
   * @generated
   */
  public Adapter createBoolFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoolFilterObject <em>Bool Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoolFilterObject
   * @generated
   */
  public Adapter createBoolFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoolFilterClause <em>Bool Filter Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoolFilterClause
   * @generated
   */
  public Adapter createBoolFilterClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilter <em>Geo Bounding Box Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilter
   * @generated
   */
  public Adapter createGeoBoundingBoxFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject <em>Geo Bounding Box Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject
   * @generated
   */
  public Adapter createGeoBoundingBoxFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilter <em>Geo Distance Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilter
   * @generated
   */
  public Adapter createGeoDistanceFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject <em>Geo Distance Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject
   * @generated
   */
  public Adapter createGeoDistanceFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilter <em>Geo Distance Range Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilter
   * @generated
   */
  public Adapter createGeoDistanceRangeFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject <em>Geo Distance Range Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject
   * @generated
   */
  public Adapter createGeoDistanceRangeFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoPolygonFilter <em>Geo Polygon Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoPolygonFilter
   * @generated
   */
  public Adapter createGeoPolygonFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject <em>Geo Polygon Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject
   * @generated
   */
  public Adapter createGeoPolygonFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoShapeFilter <em>Geo Shape Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeFilter
   * @generated
   */
  public Adapter createGeoShapeFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoShapeFilterObject <em>Geo Shape Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeFilterObject
   * @generated
   */
  public Adapter createGeoShapeFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeohashCellFilter <em>Geohash Cell Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeohashCellFilter
   * @generated
   */
  public Adapter createGeohashCellFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeohashCellFilterObject <em>Geohash Cell Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeohashCellFilterObject
   * @generated
   */
  public Adapter createGeohashCellFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasChildFilter <em>Has Child Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilter
   * @generated
   */
  public Adapter createHasChildFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasChildFilterObject <em>Has Child Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilterObject
   * @generated
   */
  public Adapter createHasChildFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasParentFilter <em>Has Parent Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilter
   * @generated
   */
  public Adapter createHasParentFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.HasParentFilterObject <em>Has Parent Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilterObject
   * @generated
   */
  public Adapter createHasParentFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.IndicesFilter <em>Indices Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.IndicesFilter
   * @generated
   */
  public Adapter createIndicesFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject <em>Indices Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.IndicesFilterObject
   * @generated
   */
  public Adapter createIndicesFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.NestedFilter <em>Nested Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.NestedFilter
   * @generated
   */
  public Adapter createNestedFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.NestedFilterObject <em>Nested Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.NestedFilterObject
   * @generated
   */
  public Adapter createNestedFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.NotFilter <em>Not Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.NotFilter
   * @generated
   */
  public Adapter createNotFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.NotFilterObject <em>Not Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.NotFilterObject
   * @generated
   */
  public Adapter createNotFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.OrFilter <em>Or Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.OrFilter
   * @generated
   */
  public Adapter createOrFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.OrFilterArray <em>Or Filter Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.OrFilterArray
   * @generated
   */
  public Adapter createOrFilterArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.PrefixFilter <em>Prefix Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.PrefixFilter
   * @generated
   */
  public Adapter createPrefixFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.PrefixFilterObject <em>Prefix Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.PrefixFilterObject
   * @generated
   */
  public Adapter createPrefixFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.QueryFilter <em>Query Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.QueryFilter
   * @generated
   */
  public Adapter createQueryFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.FQuery <em>FQuery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.FQuery
   * @generated
   */
  public Adapter createFQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeFilter <em>Range Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeFilter
   * @generated
   */
  public Adapter createRangeFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeFilterObject <em>Range Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterObject
   * @generated
   */
  public Adapter createRangeFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RangeFilterParametersObject <em>Range Filter Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterParametersObject
   * @generated
   */
  public Adapter createRangeFilterParametersObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RegexpFilter <em>Regexp Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilter
   * @generated
   */
  public Adapter createRegexpFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RegexpFilterObject <em>Regexp Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterObject
   * @generated
   */
  public Adapter createRegexpFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject <em>Regexp Filter Parameter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject
   * @generated
   */
  public Adapter createRegexpFilterParameterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ScriptFilter <em>Script Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ScriptFilter
   * @generated
   */
  public Adapter createScriptFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject <em>Script Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ScriptFilterObject
   * @generated
   */
  public Adapter createScriptFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermFilter <em>Term Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermFilter
   * @generated
   */
  public Adapter createTermFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermFilterObject <em>Term Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermFilterObject
   * @generated
   */
  public Adapter createTermFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsFilter <em>Terms Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsFilter
   * @generated
   */
  public Adapter createTermsFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TermsFilterObject <em>Terms Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TermsFilterObject
   * @generated
   */
  public Adapter createTermsFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TypeFilter <em>Type Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TypeFilter
   * @generated
   */
  public Adapter createTypeFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TypeFilterObject <em>Type Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TypeFilterObject
   * @generated
   */
  public Adapter createTypeFilterObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoShapeObject <em>Geo Shape Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeObject
   * @generated
   */
  public Adapter createGeoShapeObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.GeoShape <em>Geo Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.GeoShape
   * @generated
   */
  public Adapter createGeoShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Polygon
   * @generated
   */
  public Adapter createPolygonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject <em>Bounding Box Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.BoundingBoxObject
   * @generated
   */
  public Adapter createBoundingBoxObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox <em>Two Point Bounding Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.TwoPointBoundingBox
   * @generated
   */
  public Adapter createTwoPointBoundingBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.LatLon <em>Lat Lon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.LatLon
   * @generated
   */
  public Adapter createLatLonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.LatLonArray <em>Lat Lon Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.LatLonArray
   * @generated
   */
  public Adapter createLatLonArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.LatLonString <em>Lat Lon String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.LatLonString
   * @generated
   */
  public Adapter createLatLonStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ShapeObject <em>Shape Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ShapeObject
   * @generated
   */
  public Adapter createShapeObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Shape
   * @generated
   */
  public Adapter createShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ShapeType <em>Shape Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ShapeType
   * @generated
   */
  public Adapter createShapeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope <em>Shape Type Envelope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope
   * @generated
   */
  public Adapter createShapeTypeEnvelopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.first8.elasticsearch.dsl.search.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.first8.elasticsearch.dsl.search.Array
   * @generated
   */
  public Adapter createArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SearchAdapterFactory
