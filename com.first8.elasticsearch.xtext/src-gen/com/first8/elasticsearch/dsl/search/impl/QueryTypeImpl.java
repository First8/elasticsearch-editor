/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.BoolQuery;
import com.first8.elasticsearch.dsl.search.CommonQuery;
import com.first8.elasticsearch.dsl.search.ConstantScoreQuery;
import com.first8.elasticsearch.dsl.search.DisMaxQuery;
import com.first8.elasticsearch.dsl.search.FilteredQuery;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQuery;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisQuery;
import com.first8.elasticsearch.dsl.search.FuzzyQuery;
import com.first8.elasticsearch.dsl.search.GeoshapeQuery;
import com.first8.elasticsearch.dsl.search.HasChildQuery;
import com.first8.elasticsearch.dsl.search.HasParentQuery;
import com.first8.elasticsearch.dsl.search.IndicesQuery;
import com.first8.elasticsearch.dsl.search.MatchQuery;
import com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQuery;
import com.first8.elasticsearch.dsl.search.MoreLikeThisQuery;
import com.first8.elasticsearch.dsl.search.MultiMatchQuery;
import com.first8.elasticsearch.dsl.search.NestedQuery;
import com.first8.elasticsearch.dsl.search.PrefixQuery;
import com.first8.elasticsearch.dsl.search.QueryStringQuery;
import com.first8.elasticsearch.dsl.search.QueryType;
import com.first8.elasticsearch.dsl.search.RangeQuery;
import com.first8.elasticsearch.dsl.search.RegexpQuery;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SimpleQueryStringQuery;
import com.first8.elasticsearch.dsl.search.SpanFirstQuery;
import com.first8.elasticsearch.dsl.search.SpanMultiQuery;
import com.first8.elasticsearch.dsl.search.SpanNearQuery;
import com.first8.elasticsearch.dsl.search.SpanNotQuery;
import com.first8.elasticsearch.dsl.search.SpanOrQuery;
import com.first8.elasticsearch.dsl.search.SpanTermQuery;
import com.first8.elasticsearch.dsl.search.TermQuery;
import com.first8.elasticsearch.dsl.search.TermsQuery;
import com.first8.elasticsearch.dsl.search.TopChildrenQuery;
import com.first8.elasticsearch.dsl.search.WildcardQuery;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getMultiMatch <em>Multi Match</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getCommon <em>Common</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getConstantScore <em>Constant Score</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getDisMax <em>Dis Max</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getFiltered <em>Filtered</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getFuzzyLikeThis <em>Fuzzy Like This</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getFuzzyLikeThisField <em>Fuzzy Like This Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getGeoshape <em>Geoshape</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getHasChild <em>Has Child</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getHasParent <em>Has Parent</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getMatchAll <em>Match All</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getMoreLikeThis <em>More Like This</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getMoreLikeThisField <em>More Like This Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getNested <em>Nested</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getQueryString <em>Query String</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSimpleQuery <em>Simple Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSpanFirst <em>Span First</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSpanMulti <em>Span Multi</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSpanNear <em>Span Near</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSpanNot <em>Span Not</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSpanOr <em>Span Or</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getSpanTerm <em>Span Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getFuzzy <em>Fuzzy</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getWildcard <em>Wildcard</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl#getTopChildren <em>Top Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryTypeImpl extends MinimalEObjectImpl.Container implements QueryType
{
  /**
   * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatch()
   * @generated
   * @ordered
   */
  protected MatchQuery match;

  /**
   * The cached value of the '{@link #getMultiMatch() <em>Multi Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiMatch()
   * @generated
   * @ordered
   */
  protected MultiMatchQuery multiMatch;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected BoolQuery bool;

  /**
   * The cached value of the '{@link #getCommon() <em>Common</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommon()
   * @generated
   * @ordered
   */
  protected CommonQuery common;

  /**
   * The cached value of the '{@link #getConstantScore() <em>Constant Score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantScore()
   * @generated
   * @ordered
   */
  protected ConstantScoreQuery constantScore;

  /**
   * The cached value of the '{@link #getDisMax() <em>Dis Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisMax()
   * @generated
   * @ordered
   */
  protected DisMaxQuery disMax;

  /**
   * The cached value of the '{@link #getFiltered() <em>Filtered</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiltered()
   * @generated
   * @ordered
   */
  protected FilteredQuery filtered;

  /**
   * The cached value of the '{@link #getFuzzyLikeThis() <em>Fuzzy Like This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuzzyLikeThis()
   * @generated
   * @ordered
   */
  protected FuzzyLikeThisQuery fuzzyLikeThis;

  /**
   * The cached value of the '{@link #getFuzzyLikeThisField() <em>Fuzzy Like This Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuzzyLikeThisField()
   * @generated
   * @ordered
   */
  protected FuzzyLikeThisFieldQuery fuzzyLikeThisField;

  /**
   * The cached value of the '{@link #getGeoshape() <em>Geoshape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoshape()
   * @generated
   * @ordered
   */
  protected GeoshapeQuery geoshape;

  /**
   * The cached value of the '{@link #getHasChild() <em>Has Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasChild()
   * @generated
   * @ordered
   */
  protected HasChildQuery hasChild;

  /**
   * The cached value of the '{@link #getHasParent() <em>Has Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasParent()
   * @generated
   * @ordered
   */
  protected HasParentQuery hasParent;

  /**
   * The default value of the '{@link #getIds() <em>Ids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected static final String IDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected String ids = IDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected IndicesQuery indices;

  /**
   * The default value of the '{@link #getMatchAll() <em>Match All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchAll()
   * @generated
   * @ordered
   */
  protected static final String MATCH_ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMatchAll() <em>Match All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchAll()
   * @generated
   * @ordered
   */
  protected String matchAll = MATCH_ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getMoreLikeThis() <em>More Like This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoreLikeThis()
   * @generated
   * @ordered
   */
  protected MoreLikeThisQuery moreLikeThis;

  /**
   * The cached value of the '{@link #getMoreLikeThisField() <em>More Like This Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoreLikeThisField()
   * @generated
   * @ordered
   */
  protected MoreLikeThisFieldQuery moreLikeThisField;

  /**
   * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNested()
   * @generated
   * @ordered
   */
  protected NestedQuery nested;

  /**
   * The cached value of the '{@link #getQueryString() <em>Query String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryString()
   * @generated
   * @ordered
   */
  protected QueryStringQuery queryString;

  /**
   * The cached value of the '{@link #getSimpleQuery() <em>Simple Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleQuery()
   * @generated
   * @ordered
   */
  protected SimpleQueryStringQuery simpleQuery;

  /**
   * The cached value of the '{@link #getSpanFirst() <em>Span First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanFirst()
   * @generated
   * @ordered
   */
  protected SpanFirstQuery spanFirst;

  /**
   * The cached value of the '{@link #getSpanMulti() <em>Span Multi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanMulti()
   * @generated
   * @ordered
   */
  protected SpanMultiQuery spanMulti;

  /**
   * The cached value of the '{@link #getSpanNear() <em>Span Near</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanNear()
   * @generated
   * @ordered
   */
  protected SpanNearQuery spanNear;

  /**
   * The cached value of the '{@link #getSpanNot() <em>Span Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanNot()
   * @generated
   * @ordered
   */
  protected SpanNotQuery spanNot;

  /**
   * The cached value of the '{@link #getSpanOr() <em>Span Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanOr()
   * @generated
   * @ordered
   */
  protected SpanOrQuery spanOr;

  /**
   * The cached value of the '{@link #getSpanTerm() <em>Span Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpanTerm()
   * @generated
   * @ordered
   */
  protected SpanTermQuery spanTerm;

  /**
   * The cached value of the '{@link #getFuzzy() <em>Fuzzy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuzzy()
   * @generated
   * @ordered
   */
  protected FuzzyQuery fuzzy;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected PrefixQuery prefix;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected TermQuery term;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RangeQuery range;

  /**
   * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegexp()
   * @generated
   * @ordered
   */
  protected RegexpQuery regexp;

  /**
   * The cached value of the '{@link #getWildcard() <em>Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWildcard()
   * @generated
   * @ordered
   */
  protected WildcardQuery wildcard;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected TermsQuery terms;

  /**
   * The cached value of the '{@link #getTopChildren() <em>Top Children</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopChildren()
   * @generated
   * @ordered
   */
  protected TopChildrenQuery topChildren;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SearchPackage.eINSTANCE.getQueryType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchQuery getMatch()
  {
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatch(MatchQuery newMatch, NotificationChain msgs)
  {
    MatchQuery oldMatch = match;
    match = newMatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MATCH, oldMatch, newMatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatch(MatchQuery newMatch)
  {
    if (newMatch != match)
    {
      NotificationChain msgs = null;
      if (match != null)
        msgs = ((InternalEObject)match).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MATCH, null, msgs);
      if (newMatch != null)
        msgs = ((InternalEObject)newMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MATCH, null, msgs);
      msgs = basicSetMatch(newMatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MATCH, newMatch, newMatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiMatchQuery getMultiMatch()
  {
    return multiMatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiMatch(MultiMatchQuery newMultiMatch, NotificationChain msgs)
  {
    MultiMatchQuery oldMultiMatch = multiMatch;
    multiMatch = newMultiMatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MULTI_MATCH, oldMultiMatch, newMultiMatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiMatch(MultiMatchQuery newMultiMatch)
  {
    if (newMultiMatch != multiMatch)
    {
      NotificationChain msgs = null;
      if (multiMatch != null)
        msgs = ((InternalEObject)multiMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MULTI_MATCH, null, msgs);
      if (newMultiMatch != null)
        msgs = ((InternalEObject)newMultiMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MULTI_MATCH, null, msgs);
      msgs = basicSetMultiMatch(newMultiMatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MULTI_MATCH, newMultiMatch, newMultiMatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolQuery getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool(BoolQuery newBool, NotificationChain msgs)
  {
    BoolQuery oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__BOOL, oldBool, newBool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(BoolQuery newBool)
  {
    if (newBool != bool)
    {
      NotificationChain msgs = null;
      if (bool != null)
        msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__BOOL, null, msgs);
      if (newBool != null)
        msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__BOOL, null, msgs);
      msgs = basicSetBool(newBool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__BOOL, newBool, newBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonQuery getCommon()
  {
    return common;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommon(CommonQuery newCommon, NotificationChain msgs)
  {
    CommonQuery oldCommon = common;
    common = newCommon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__COMMON, oldCommon, newCommon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommon(CommonQuery newCommon)
  {
    if (newCommon != common)
    {
      NotificationChain msgs = null;
      if (common != null)
        msgs = ((InternalEObject)common).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__COMMON, null, msgs);
      if (newCommon != null)
        msgs = ((InternalEObject)newCommon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__COMMON, null, msgs);
      msgs = basicSetCommon(newCommon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__COMMON, newCommon, newCommon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantScoreQuery getConstantScore()
  {
    return constantScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantScore(ConstantScoreQuery newConstantScore, NotificationChain msgs)
  {
    ConstantScoreQuery oldConstantScore = constantScore;
    constantScore = newConstantScore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__CONSTANT_SCORE, oldConstantScore, newConstantScore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantScore(ConstantScoreQuery newConstantScore)
  {
    if (newConstantScore != constantScore)
    {
      NotificationChain msgs = null;
      if (constantScore != null)
        msgs = ((InternalEObject)constantScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__CONSTANT_SCORE, null, msgs);
      if (newConstantScore != null)
        msgs = ((InternalEObject)newConstantScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__CONSTANT_SCORE, null, msgs);
      msgs = basicSetConstantScore(newConstantScore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__CONSTANT_SCORE, newConstantScore, newConstantScore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisMaxQuery getDisMax()
  {
    return disMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisMax(DisMaxQuery newDisMax, NotificationChain msgs)
  {
    DisMaxQuery oldDisMax = disMax;
    disMax = newDisMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__DIS_MAX, oldDisMax, newDisMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisMax(DisMaxQuery newDisMax)
  {
    if (newDisMax != disMax)
    {
      NotificationChain msgs = null;
      if (disMax != null)
        msgs = ((InternalEObject)disMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__DIS_MAX, null, msgs);
      if (newDisMax != null)
        msgs = ((InternalEObject)newDisMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__DIS_MAX, null, msgs);
      msgs = basicSetDisMax(newDisMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__DIS_MAX, newDisMax, newDisMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilteredQuery getFiltered()
  {
    return filtered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFiltered(FilteredQuery newFiltered, NotificationChain msgs)
  {
    FilteredQuery oldFiltered = filtered;
    filtered = newFiltered;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FILTERED, oldFiltered, newFiltered);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFiltered(FilteredQuery newFiltered)
  {
    if (newFiltered != filtered)
    {
      NotificationChain msgs = null;
      if (filtered != null)
        msgs = ((InternalEObject)filtered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FILTERED, null, msgs);
      if (newFiltered != null)
        msgs = ((InternalEObject)newFiltered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FILTERED, null, msgs);
      msgs = basicSetFiltered(newFiltered, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FILTERED, newFiltered, newFiltered));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyLikeThisQuery getFuzzyLikeThis()
  {
    return fuzzyLikeThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuzzyLikeThis(FuzzyLikeThisQuery newFuzzyLikeThis, NotificationChain msgs)
  {
    FuzzyLikeThisQuery oldFuzzyLikeThis = fuzzyLikeThis;
    fuzzyLikeThis = newFuzzyLikeThis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS, oldFuzzyLikeThis, newFuzzyLikeThis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuzzyLikeThis(FuzzyLikeThisQuery newFuzzyLikeThis)
  {
    if (newFuzzyLikeThis != fuzzyLikeThis)
    {
      NotificationChain msgs = null;
      if (fuzzyLikeThis != null)
        msgs = ((InternalEObject)fuzzyLikeThis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS, null, msgs);
      if (newFuzzyLikeThis != null)
        msgs = ((InternalEObject)newFuzzyLikeThis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS, null, msgs);
      msgs = basicSetFuzzyLikeThis(newFuzzyLikeThis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS, newFuzzyLikeThis, newFuzzyLikeThis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyLikeThisFieldQuery getFuzzyLikeThisField()
  {
    return fuzzyLikeThisField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuzzyLikeThisField(FuzzyLikeThisFieldQuery newFuzzyLikeThisField, NotificationChain msgs)
  {
    FuzzyLikeThisFieldQuery oldFuzzyLikeThisField = fuzzyLikeThisField;
    fuzzyLikeThisField = newFuzzyLikeThisField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD, oldFuzzyLikeThisField, newFuzzyLikeThisField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuzzyLikeThisField(FuzzyLikeThisFieldQuery newFuzzyLikeThisField)
  {
    if (newFuzzyLikeThisField != fuzzyLikeThisField)
    {
      NotificationChain msgs = null;
      if (fuzzyLikeThisField != null)
        msgs = ((InternalEObject)fuzzyLikeThisField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD, null, msgs);
      if (newFuzzyLikeThisField != null)
        msgs = ((InternalEObject)newFuzzyLikeThisField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD, null, msgs);
      msgs = basicSetFuzzyLikeThisField(newFuzzyLikeThisField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD, newFuzzyLikeThisField, newFuzzyLikeThisField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoshapeQuery getGeoshape()
  {
    return geoshape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoshape(GeoshapeQuery newGeoshape, NotificationChain msgs)
  {
    GeoshapeQuery oldGeoshape = geoshape;
    geoshape = newGeoshape;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__GEOSHAPE, oldGeoshape, newGeoshape);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoshape(GeoshapeQuery newGeoshape)
  {
    if (newGeoshape != geoshape)
    {
      NotificationChain msgs = null;
      if (geoshape != null)
        msgs = ((InternalEObject)geoshape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__GEOSHAPE, null, msgs);
      if (newGeoshape != null)
        msgs = ((InternalEObject)newGeoshape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__GEOSHAPE, null, msgs);
      msgs = basicSetGeoshape(newGeoshape, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__GEOSHAPE, newGeoshape, newGeoshape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasChildQuery getHasChild()
  {
    return hasChild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasChild(HasChildQuery newHasChild, NotificationChain msgs)
  {
    HasChildQuery oldHasChild = hasChild;
    hasChild = newHasChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__HAS_CHILD, oldHasChild, newHasChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasChild(HasChildQuery newHasChild)
  {
    if (newHasChild != hasChild)
    {
      NotificationChain msgs = null;
      if (hasChild != null)
        msgs = ((InternalEObject)hasChild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__HAS_CHILD, null, msgs);
      if (newHasChild != null)
        msgs = ((InternalEObject)newHasChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__HAS_CHILD, null, msgs);
      msgs = basicSetHasChild(newHasChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__HAS_CHILD, newHasChild, newHasChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasParentQuery getHasParent()
  {
    return hasParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasParent(HasParentQuery newHasParent, NotificationChain msgs)
  {
    HasParentQuery oldHasParent = hasParent;
    hasParent = newHasParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__HAS_PARENT, oldHasParent, newHasParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasParent(HasParentQuery newHasParent)
  {
    if (newHasParent != hasParent)
    {
      NotificationChain msgs = null;
      if (hasParent != null)
        msgs = ((InternalEObject)hasParent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__HAS_PARENT, null, msgs);
      if (newHasParent != null)
        msgs = ((InternalEObject)newHasParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__HAS_PARENT, null, msgs);
      msgs = basicSetHasParent(newHasParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__HAS_PARENT, newHasParent, newHasParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIds()
  {
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIds(String newIds)
  {
    String oldIds = ids;
    ids = newIds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__IDS, oldIds, ids));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicesQuery getIndices()
  {
    return indices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndices(IndicesQuery newIndices, NotificationChain msgs)
  {
    IndicesQuery oldIndices = indices;
    indices = newIndices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__INDICES, oldIndices, newIndices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndices(IndicesQuery newIndices)
  {
    if (newIndices != indices)
    {
      NotificationChain msgs = null;
      if (indices != null)
        msgs = ((InternalEObject)indices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__INDICES, null, msgs);
      if (newIndices != null)
        msgs = ((InternalEObject)newIndices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__INDICES, null, msgs);
      msgs = basicSetIndices(newIndices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__INDICES, newIndices, newIndices));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMatchAll()
  {
    return matchAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatchAll(String newMatchAll)
  {
    String oldMatchAll = matchAll;
    matchAll = newMatchAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MATCH_ALL, oldMatchAll, matchAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreLikeThisQuery getMoreLikeThis()
  {
    return moreLikeThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoreLikeThis(MoreLikeThisQuery newMoreLikeThis, NotificationChain msgs)
  {
    MoreLikeThisQuery oldMoreLikeThis = moreLikeThis;
    moreLikeThis = newMoreLikeThis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MORE_LIKE_THIS, oldMoreLikeThis, newMoreLikeThis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoreLikeThis(MoreLikeThisQuery newMoreLikeThis)
  {
    if (newMoreLikeThis != moreLikeThis)
    {
      NotificationChain msgs = null;
      if (moreLikeThis != null)
        msgs = ((InternalEObject)moreLikeThis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MORE_LIKE_THIS, null, msgs);
      if (newMoreLikeThis != null)
        msgs = ((InternalEObject)newMoreLikeThis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MORE_LIKE_THIS, null, msgs);
      msgs = basicSetMoreLikeThis(newMoreLikeThis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MORE_LIKE_THIS, newMoreLikeThis, newMoreLikeThis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreLikeThisFieldQuery getMoreLikeThisField()
  {
    return moreLikeThisField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoreLikeThisField(MoreLikeThisFieldQuery newMoreLikeThisField, NotificationChain msgs)
  {
    MoreLikeThisFieldQuery oldMoreLikeThisField = moreLikeThisField;
    moreLikeThisField = newMoreLikeThisField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD, oldMoreLikeThisField, newMoreLikeThisField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoreLikeThisField(MoreLikeThisFieldQuery newMoreLikeThisField)
  {
    if (newMoreLikeThisField != moreLikeThisField)
    {
      NotificationChain msgs = null;
      if (moreLikeThisField != null)
        msgs = ((InternalEObject)moreLikeThisField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD, null, msgs);
      if (newMoreLikeThisField != null)
        msgs = ((InternalEObject)newMoreLikeThisField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD, null, msgs);
      msgs = basicSetMoreLikeThisField(newMoreLikeThisField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD, newMoreLikeThisField, newMoreLikeThisField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQuery getNested()
  {
    return nested;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNested(NestedQuery newNested, NotificationChain msgs)
  {
    NestedQuery oldNested = nested;
    nested = newNested;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__NESTED, oldNested, newNested);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNested(NestedQuery newNested)
  {
    if (newNested != nested)
    {
      NotificationChain msgs = null;
      if (nested != null)
        msgs = ((InternalEObject)nested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__NESTED, null, msgs);
      if (newNested != null)
        msgs = ((InternalEObject)newNested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__NESTED, null, msgs);
      msgs = basicSetNested(newNested, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__NESTED, newNested, newNested));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryStringQuery getQueryString()
  {
    return queryString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueryString(QueryStringQuery newQueryString, NotificationChain msgs)
  {
    QueryStringQuery oldQueryString = queryString;
    queryString = newQueryString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__QUERY_STRING, oldQueryString, newQueryString);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryString(QueryStringQuery newQueryString)
  {
    if (newQueryString != queryString)
    {
      NotificationChain msgs = null;
      if (queryString != null)
        msgs = ((InternalEObject)queryString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__QUERY_STRING, null, msgs);
      if (newQueryString != null)
        msgs = ((InternalEObject)newQueryString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__QUERY_STRING, null, msgs);
      msgs = basicSetQueryString(newQueryString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__QUERY_STRING, newQueryString, newQueryString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleQueryStringQuery getSimpleQuery()
  {
    return simpleQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleQuery(SimpleQueryStringQuery newSimpleQuery, NotificationChain msgs)
  {
    SimpleQueryStringQuery oldSimpleQuery = simpleQuery;
    simpleQuery = newSimpleQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SIMPLE_QUERY, oldSimpleQuery, newSimpleQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleQuery(SimpleQueryStringQuery newSimpleQuery)
  {
    if (newSimpleQuery != simpleQuery)
    {
      NotificationChain msgs = null;
      if (simpleQuery != null)
        msgs = ((InternalEObject)simpleQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SIMPLE_QUERY, null, msgs);
      if (newSimpleQuery != null)
        msgs = ((InternalEObject)newSimpleQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SIMPLE_QUERY, null, msgs);
      msgs = basicSetSimpleQuery(newSimpleQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SIMPLE_QUERY, newSimpleQuery, newSimpleQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanFirstQuery getSpanFirst()
  {
    return spanFirst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanFirst(SpanFirstQuery newSpanFirst, NotificationChain msgs)
  {
    SpanFirstQuery oldSpanFirst = spanFirst;
    spanFirst = newSpanFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_FIRST, oldSpanFirst, newSpanFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanFirst(SpanFirstQuery newSpanFirst)
  {
    if (newSpanFirst != spanFirst)
    {
      NotificationChain msgs = null;
      if (spanFirst != null)
        msgs = ((InternalEObject)spanFirst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_FIRST, null, msgs);
      if (newSpanFirst != null)
        msgs = ((InternalEObject)newSpanFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_FIRST, null, msgs);
      msgs = basicSetSpanFirst(newSpanFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_FIRST, newSpanFirst, newSpanFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanMultiQuery getSpanMulti()
  {
    return spanMulti;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanMulti(SpanMultiQuery newSpanMulti, NotificationChain msgs)
  {
    SpanMultiQuery oldSpanMulti = spanMulti;
    spanMulti = newSpanMulti;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_MULTI, oldSpanMulti, newSpanMulti);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanMulti(SpanMultiQuery newSpanMulti)
  {
    if (newSpanMulti != spanMulti)
    {
      NotificationChain msgs = null;
      if (spanMulti != null)
        msgs = ((InternalEObject)spanMulti).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_MULTI, null, msgs);
      if (newSpanMulti != null)
        msgs = ((InternalEObject)newSpanMulti).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_MULTI, null, msgs);
      msgs = basicSetSpanMulti(newSpanMulti, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_MULTI, newSpanMulti, newSpanMulti));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanNearQuery getSpanNear()
  {
    return spanNear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanNear(SpanNearQuery newSpanNear, NotificationChain msgs)
  {
    SpanNearQuery oldSpanNear = spanNear;
    spanNear = newSpanNear;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_NEAR, oldSpanNear, newSpanNear);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanNear(SpanNearQuery newSpanNear)
  {
    if (newSpanNear != spanNear)
    {
      NotificationChain msgs = null;
      if (spanNear != null)
        msgs = ((InternalEObject)spanNear).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_NEAR, null, msgs);
      if (newSpanNear != null)
        msgs = ((InternalEObject)newSpanNear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_NEAR, null, msgs);
      msgs = basicSetSpanNear(newSpanNear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_NEAR, newSpanNear, newSpanNear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanNotQuery getSpanNot()
  {
    return spanNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanNot(SpanNotQuery newSpanNot, NotificationChain msgs)
  {
    SpanNotQuery oldSpanNot = spanNot;
    spanNot = newSpanNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_NOT, oldSpanNot, newSpanNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanNot(SpanNotQuery newSpanNot)
  {
    if (newSpanNot != spanNot)
    {
      NotificationChain msgs = null;
      if (spanNot != null)
        msgs = ((InternalEObject)spanNot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_NOT, null, msgs);
      if (newSpanNot != null)
        msgs = ((InternalEObject)newSpanNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_NOT, null, msgs);
      msgs = basicSetSpanNot(newSpanNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_NOT, newSpanNot, newSpanNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanOrQuery getSpanOr()
  {
    return spanOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanOr(SpanOrQuery newSpanOr, NotificationChain msgs)
  {
    SpanOrQuery oldSpanOr = spanOr;
    spanOr = newSpanOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_OR, oldSpanOr, newSpanOr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanOr(SpanOrQuery newSpanOr)
  {
    if (newSpanOr != spanOr)
    {
      NotificationChain msgs = null;
      if (spanOr != null)
        msgs = ((InternalEObject)spanOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_OR, null, msgs);
      if (newSpanOr != null)
        msgs = ((InternalEObject)newSpanOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_OR, null, msgs);
      msgs = basicSetSpanOr(newSpanOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_OR, newSpanOr, newSpanOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpanTermQuery getSpanTerm()
  {
    return spanTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpanTerm(SpanTermQuery newSpanTerm, NotificationChain msgs)
  {
    SpanTermQuery oldSpanTerm = spanTerm;
    spanTerm = newSpanTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_TERM, oldSpanTerm, newSpanTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpanTerm(SpanTermQuery newSpanTerm)
  {
    if (newSpanTerm != spanTerm)
    {
      NotificationChain msgs = null;
      if (spanTerm != null)
        msgs = ((InternalEObject)spanTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_TERM, null, msgs);
      if (newSpanTerm != null)
        msgs = ((InternalEObject)newSpanTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__SPAN_TERM, null, msgs);
      msgs = basicSetSpanTerm(newSpanTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__SPAN_TERM, newSpanTerm, newSpanTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyQuery getFuzzy()
  {
    return fuzzy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuzzy(FuzzyQuery newFuzzy, NotificationChain msgs)
  {
    FuzzyQuery oldFuzzy = fuzzy;
    fuzzy = newFuzzy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FUZZY, oldFuzzy, newFuzzy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuzzy(FuzzyQuery newFuzzy)
  {
    if (newFuzzy != fuzzy)
    {
      NotificationChain msgs = null;
      if (fuzzy != null)
        msgs = ((InternalEObject)fuzzy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FUZZY, null, msgs);
      if (newFuzzy != null)
        msgs = ((InternalEObject)newFuzzy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__FUZZY, null, msgs);
      msgs = basicSetFuzzy(newFuzzy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__FUZZY, newFuzzy, newFuzzy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixQuery getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(PrefixQuery newPrefix, NotificationChain msgs)
  {
    PrefixQuery oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__PREFIX, oldPrefix, newPrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(PrefixQuery newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__PREFIX, newPrefix, newPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermQuery getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(TermQuery newTerm, NotificationChain msgs)
  {
    TermQuery oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(TermQuery newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeQuery getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RangeQuery newRange, NotificationChain msgs)
  {
    RangeQuery oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(RangeQuery newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpQuery getRegexp()
  {
    return regexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegexp(RegexpQuery newRegexp, NotificationChain msgs)
  {
    RegexpQuery oldRegexp = regexp;
    regexp = newRegexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__REGEXP, oldRegexp, newRegexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegexp(RegexpQuery newRegexp)
  {
    if (newRegexp != regexp)
    {
      NotificationChain msgs = null;
      if (regexp != null)
        msgs = ((InternalEObject)regexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__REGEXP, null, msgs);
      if (newRegexp != null)
        msgs = ((InternalEObject)newRegexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__REGEXP, null, msgs);
      msgs = basicSetRegexp(newRegexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__REGEXP, newRegexp, newRegexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WildcardQuery getWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWildcard(WildcardQuery newWildcard, NotificationChain msgs)
  {
    WildcardQuery oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__WILDCARD, oldWildcard, newWildcard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWildcard(WildcardQuery newWildcard)
  {
    if (newWildcard != wildcard)
    {
      NotificationChain msgs = null;
      if (wildcard != null)
        msgs = ((InternalEObject)wildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__WILDCARD, null, msgs);
      if (newWildcard != null)
        msgs = ((InternalEObject)newWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__WILDCARD, null, msgs);
      msgs = basicSetWildcard(newWildcard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__WILDCARD, newWildcard, newWildcard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsQuery getTerms()
  {
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerms(TermsQuery newTerms, NotificationChain msgs)
  {
    TermsQuery oldTerms = terms;
    terms = newTerms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__TERMS, oldTerms, newTerms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerms(TermsQuery newTerms)
  {
    if (newTerms != terms)
    {
      NotificationChain msgs = null;
      if (terms != null)
        msgs = ((InternalEObject)terms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__TERMS, null, msgs);
      if (newTerms != null)
        msgs = ((InternalEObject)newTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__TERMS, null, msgs);
      msgs = basicSetTerms(newTerms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__TERMS, newTerms, newTerms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopChildrenQuery getTopChildren()
  {
    return topChildren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTopChildren(TopChildrenQuery newTopChildren, NotificationChain msgs)
  {
    TopChildrenQuery oldTopChildren = topChildren;
    topChildren = newTopChildren;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__TOP_CHILDREN, oldTopChildren, newTopChildren);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTopChildren(TopChildrenQuery newTopChildren)
  {
    if (newTopChildren != topChildren)
    {
      NotificationChain msgs = null;
      if (topChildren != null)
        msgs = ((InternalEObject)topChildren).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__TOP_CHILDREN, null, msgs);
      if (newTopChildren != null)
        msgs = ((InternalEObject)newTopChildren).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.QUERY_TYPE__TOP_CHILDREN, null, msgs);
      msgs = basicSetTopChildren(newTopChildren, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.QUERY_TYPE__TOP_CHILDREN, newTopChildren, newTopChildren));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SearchPackage.QUERY_TYPE__MATCH:
        return basicSetMatch(null, msgs);
      case SearchPackage.QUERY_TYPE__MULTI_MATCH:
        return basicSetMultiMatch(null, msgs);
      case SearchPackage.QUERY_TYPE__BOOL:
        return basicSetBool(null, msgs);
      case SearchPackage.QUERY_TYPE__COMMON:
        return basicSetCommon(null, msgs);
      case SearchPackage.QUERY_TYPE__CONSTANT_SCORE:
        return basicSetConstantScore(null, msgs);
      case SearchPackage.QUERY_TYPE__DIS_MAX:
        return basicSetDisMax(null, msgs);
      case SearchPackage.QUERY_TYPE__FILTERED:
        return basicSetFiltered(null, msgs);
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS:
        return basicSetFuzzyLikeThis(null, msgs);
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD:
        return basicSetFuzzyLikeThisField(null, msgs);
      case SearchPackage.QUERY_TYPE__GEOSHAPE:
        return basicSetGeoshape(null, msgs);
      case SearchPackage.QUERY_TYPE__HAS_CHILD:
        return basicSetHasChild(null, msgs);
      case SearchPackage.QUERY_TYPE__HAS_PARENT:
        return basicSetHasParent(null, msgs);
      case SearchPackage.QUERY_TYPE__INDICES:
        return basicSetIndices(null, msgs);
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS:
        return basicSetMoreLikeThis(null, msgs);
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD:
        return basicSetMoreLikeThisField(null, msgs);
      case SearchPackage.QUERY_TYPE__NESTED:
        return basicSetNested(null, msgs);
      case SearchPackage.QUERY_TYPE__QUERY_STRING:
        return basicSetQueryString(null, msgs);
      case SearchPackage.QUERY_TYPE__SIMPLE_QUERY:
        return basicSetSimpleQuery(null, msgs);
      case SearchPackage.QUERY_TYPE__SPAN_FIRST:
        return basicSetSpanFirst(null, msgs);
      case SearchPackage.QUERY_TYPE__SPAN_MULTI:
        return basicSetSpanMulti(null, msgs);
      case SearchPackage.QUERY_TYPE__SPAN_NEAR:
        return basicSetSpanNear(null, msgs);
      case SearchPackage.QUERY_TYPE__SPAN_NOT:
        return basicSetSpanNot(null, msgs);
      case SearchPackage.QUERY_TYPE__SPAN_OR:
        return basicSetSpanOr(null, msgs);
      case SearchPackage.QUERY_TYPE__SPAN_TERM:
        return basicSetSpanTerm(null, msgs);
      case SearchPackage.QUERY_TYPE__FUZZY:
        return basicSetFuzzy(null, msgs);
      case SearchPackage.QUERY_TYPE__PREFIX:
        return basicSetPrefix(null, msgs);
      case SearchPackage.QUERY_TYPE__TERM:
        return basicSetTerm(null, msgs);
      case SearchPackage.QUERY_TYPE__RANGE:
        return basicSetRange(null, msgs);
      case SearchPackage.QUERY_TYPE__REGEXP:
        return basicSetRegexp(null, msgs);
      case SearchPackage.QUERY_TYPE__WILDCARD:
        return basicSetWildcard(null, msgs);
      case SearchPackage.QUERY_TYPE__TERMS:
        return basicSetTerms(null, msgs);
      case SearchPackage.QUERY_TYPE__TOP_CHILDREN:
        return basicSetTopChildren(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SearchPackage.QUERY_TYPE__MATCH:
        return getMatch();
      case SearchPackage.QUERY_TYPE__MULTI_MATCH:
        return getMultiMatch();
      case SearchPackage.QUERY_TYPE__BOOL:
        return getBool();
      case SearchPackage.QUERY_TYPE__COMMON:
        return getCommon();
      case SearchPackage.QUERY_TYPE__CONSTANT_SCORE:
        return getConstantScore();
      case SearchPackage.QUERY_TYPE__DIS_MAX:
        return getDisMax();
      case SearchPackage.QUERY_TYPE__FILTERED:
        return getFiltered();
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS:
        return getFuzzyLikeThis();
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD:
        return getFuzzyLikeThisField();
      case SearchPackage.QUERY_TYPE__GEOSHAPE:
        return getGeoshape();
      case SearchPackage.QUERY_TYPE__HAS_CHILD:
        return getHasChild();
      case SearchPackage.QUERY_TYPE__HAS_PARENT:
        return getHasParent();
      case SearchPackage.QUERY_TYPE__IDS:
        return getIds();
      case SearchPackage.QUERY_TYPE__INDICES:
        return getIndices();
      case SearchPackage.QUERY_TYPE__MATCH_ALL:
        return getMatchAll();
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS:
        return getMoreLikeThis();
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD:
        return getMoreLikeThisField();
      case SearchPackage.QUERY_TYPE__NESTED:
        return getNested();
      case SearchPackage.QUERY_TYPE__QUERY_STRING:
        return getQueryString();
      case SearchPackage.QUERY_TYPE__SIMPLE_QUERY:
        return getSimpleQuery();
      case SearchPackage.QUERY_TYPE__SPAN_FIRST:
        return getSpanFirst();
      case SearchPackage.QUERY_TYPE__SPAN_MULTI:
        return getSpanMulti();
      case SearchPackage.QUERY_TYPE__SPAN_NEAR:
        return getSpanNear();
      case SearchPackage.QUERY_TYPE__SPAN_NOT:
        return getSpanNot();
      case SearchPackage.QUERY_TYPE__SPAN_OR:
        return getSpanOr();
      case SearchPackage.QUERY_TYPE__SPAN_TERM:
        return getSpanTerm();
      case SearchPackage.QUERY_TYPE__FUZZY:
        return getFuzzy();
      case SearchPackage.QUERY_TYPE__PREFIX:
        return getPrefix();
      case SearchPackage.QUERY_TYPE__TERM:
        return getTerm();
      case SearchPackage.QUERY_TYPE__RANGE:
        return getRange();
      case SearchPackage.QUERY_TYPE__REGEXP:
        return getRegexp();
      case SearchPackage.QUERY_TYPE__WILDCARD:
        return getWildcard();
      case SearchPackage.QUERY_TYPE__TERMS:
        return getTerms();
      case SearchPackage.QUERY_TYPE__TOP_CHILDREN:
        return getTopChildren();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SearchPackage.QUERY_TYPE__MATCH:
        setMatch((MatchQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__MULTI_MATCH:
        setMultiMatch((MultiMatchQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__BOOL:
        setBool((BoolQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__COMMON:
        setCommon((CommonQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__CONSTANT_SCORE:
        setConstantScore((ConstantScoreQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__DIS_MAX:
        setDisMax((DisMaxQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__FILTERED:
        setFiltered((FilteredQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS:
        setFuzzyLikeThis((FuzzyLikeThisQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD:
        setFuzzyLikeThisField((FuzzyLikeThisFieldQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__GEOSHAPE:
        setGeoshape((GeoshapeQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__HAS_CHILD:
        setHasChild((HasChildQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__HAS_PARENT:
        setHasParent((HasParentQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__IDS:
        setIds((String)newValue);
        return;
      case SearchPackage.QUERY_TYPE__INDICES:
        setIndices((IndicesQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__MATCH_ALL:
        setMatchAll((String)newValue);
        return;
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS:
        setMoreLikeThis((MoreLikeThisQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD:
        setMoreLikeThisField((MoreLikeThisFieldQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__NESTED:
        setNested((NestedQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__QUERY_STRING:
        setQueryString((QueryStringQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SIMPLE_QUERY:
        setSimpleQuery((SimpleQueryStringQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_FIRST:
        setSpanFirst((SpanFirstQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_MULTI:
        setSpanMulti((SpanMultiQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_NEAR:
        setSpanNear((SpanNearQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_NOT:
        setSpanNot((SpanNotQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_OR:
        setSpanOr((SpanOrQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_TERM:
        setSpanTerm((SpanTermQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__FUZZY:
        setFuzzy((FuzzyQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__PREFIX:
        setPrefix((PrefixQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__TERM:
        setTerm((TermQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__RANGE:
        setRange((RangeQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__REGEXP:
        setRegexp((RegexpQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__WILDCARD:
        setWildcard((WildcardQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__TERMS:
        setTerms((TermsQuery)newValue);
        return;
      case SearchPackage.QUERY_TYPE__TOP_CHILDREN:
        setTopChildren((TopChildrenQuery)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SearchPackage.QUERY_TYPE__MATCH:
        setMatch((MatchQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__MULTI_MATCH:
        setMultiMatch((MultiMatchQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__BOOL:
        setBool((BoolQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__COMMON:
        setCommon((CommonQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__CONSTANT_SCORE:
        setConstantScore((ConstantScoreQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__DIS_MAX:
        setDisMax((DisMaxQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__FILTERED:
        setFiltered((FilteredQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS:
        setFuzzyLikeThis((FuzzyLikeThisQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD:
        setFuzzyLikeThisField((FuzzyLikeThisFieldQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__GEOSHAPE:
        setGeoshape((GeoshapeQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__HAS_CHILD:
        setHasChild((HasChildQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__HAS_PARENT:
        setHasParent((HasParentQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__IDS:
        setIds(IDS_EDEFAULT);
        return;
      case SearchPackage.QUERY_TYPE__INDICES:
        setIndices((IndicesQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__MATCH_ALL:
        setMatchAll(MATCH_ALL_EDEFAULT);
        return;
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS:
        setMoreLikeThis((MoreLikeThisQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD:
        setMoreLikeThisField((MoreLikeThisFieldQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__NESTED:
        setNested((NestedQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__QUERY_STRING:
        setQueryString((QueryStringQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SIMPLE_QUERY:
        setSimpleQuery((SimpleQueryStringQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_FIRST:
        setSpanFirst((SpanFirstQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_MULTI:
        setSpanMulti((SpanMultiQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_NEAR:
        setSpanNear((SpanNearQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_NOT:
        setSpanNot((SpanNotQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_OR:
        setSpanOr((SpanOrQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__SPAN_TERM:
        setSpanTerm((SpanTermQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__FUZZY:
        setFuzzy((FuzzyQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__PREFIX:
        setPrefix((PrefixQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__TERM:
        setTerm((TermQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__RANGE:
        setRange((RangeQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__REGEXP:
        setRegexp((RegexpQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__WILDCARD:
        setWildcard((WildcardQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__TERMS:
        setTerms((TermsQuery)null);
        return;
      case SearchPackage.QUERY_TYPE__TOP_CHILDREN:
        setTopChildren((TopChildrenQuery)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SearchPackage.QUERY_TYPE__MATCH:
        return match != null;
      case SearchPackage.QUERY_TYPE__MULTI_MATCH:
        return multiMatch != null;
      case SearchPackage.QUERY_TYPE__BOOL:
        return bool != null;
      case SearchPackage.QUERY_TYPE__COMMON:
        return common != null;
      case SearchPackage.QUERY_TYPE__CONSTANT_SCORE:
        return constantScore != null;
      case SearchPackage.QUERY_TYPE__DIS_MAX:
        return disMax != null;
      case SearchPackage.QUERY_TYPE__FILTERED:
        return filtered != null;
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS:
        return fuzzyLikeThis != null;
      case SearchPackage.QUERY_TYPE__FUZZY_LIKE_THIS_FIELD:
        return fuzzyLikeThisField != null;
      case SearchPackage.QUERY_TYPE__GEOSHAPE:
        return geoshape != null;
      case SearchPackage.QUERY_TYPE__HAS_CHILD:
        return hasChild != null;
      case SearchPackage.QUERY_TYPE__HAS_PARENT:
        return hasParent != null;
      case SearchPackage.QUERY_TYPE__IDS:
        return IDS_EDEFAULT == null ? ids != null : !IDS_EDEFAULT.equals(ids);
      case SearchPackage.QUERY_TYPE__INDICES:
        return indices != null;
      case SearchPackage.QUERY_TYPE__MATCH_ALL:
        return MATCH_ALL_EDEFAULT == null ? matchAll != null : !MATCH_ALL_EDEFAULT.equals(matchAll);
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS:
        return moreLikeThis != null;
      case SearchPackage.QUERY_TYPE__MORE_LIKE_THIS_FIELD:
        return moreLikeThisField != null;
      case SearchPackage.QUERY_TYPE__NESTED:
        return nested != null;
      case SearchPackage.QUERY_TYPE__QUERY_STRING:
        return queryString != null;
      case SearchPackage.QUERY_TYPE__SIMPLE_QUERY:
        return simpleQuery != null;
      case SearchPackage.QUERY_TYPE__SPAN_FIRST:
        return spanFirst != null;
      case SearchPackage.QUERY_TYPE__SPAN_MULTI:
        return spanMulti != null;
      case SearchPackage.QUERY_TYPE__SPAN_NEAR:
        return spanNear != null;
      case SearchPackage.QUERY_TYPE__SPAN_NOT:
        return spanNot != null;
      case SearchPackage.QUERY_TYPE__SPAN_OR:
        return spanOr != null;
      case SearchPackage.QUERY_TYPE__SPAN_TERM:
        return spanTerm != null;
      case SearchPackage.QUERY_TYPE__FUZZY:
        return fuzzy != null;
      case SearchPackage.QUERY_TYPE__PREFIX:
        return prefix != null;
      case SearchPackage.QUERY_TYPE__TERM:
        return term != null;
      case SearchPackage.QUERY_TYPE__RANGE:
        return range != null;
      case SearchPackage.QUERY_TYPE__REGEXP:
        return regexp != null;
      case SearchPackage.QUERY_TYPE__WILDCARD:
        return wildcard != null;
      case SearchPackage.QUERY_TYPE__TERMS:
        return terms != null;
      case SearchPackage.QUERY_TYPE__TOP_CHILDREN:
        return topChildren != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ids: ");
    result.append(ids);
    result.append(", matchAll: ");
    result.append(matchAll);
    result.append(')');
    return result.toString();
  }

} //QueryTypeImpl
