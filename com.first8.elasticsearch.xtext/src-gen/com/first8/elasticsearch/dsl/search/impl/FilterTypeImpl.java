/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.AndFilter;
import com.first8.elasticsearch.dsl.search.BoolFilter;
import com.first8.elasticsearch.dsl.search.FilterType;
import com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilter;
import com.first8.elasticsearch.dsl.search.GeoDistanceFilter;
import com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilter;
import com.first8.elasticsearch.dsl.search.GeoPolygonFilter;
import com.first8.elasticsearch.dsl.search.GeoShapeFilter;
import com.first8.elasticsearch.dsl.search.GeohashCellFilter;
import com.first8.elasticsearch.dsl.search.HasChildFilter;
import com.first8.elasticsearch.dsl.search.HasParentFilter;
import com.first8.elasticsearch.dsl.search.IndicesFilter;
import com.first8.elasticsearch.dsl.search.NestedFilter;
import com.first8.elasticsearch.dsl.search.NotFilter;
import com.first8.elasticsearch.dsl.search.OrFilter;
import com.first8.elasticsearch.dsl.search.PrefixFilter;
import com.first8.elasticsearch.dsl.search.QueryFilter;
import com.first8.elasticsearch.dsl.search.RegexpFilter;
import com.first8.elasticsearch.dsl.search.ScriptFilter;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.TermFilter;
import com.first8.elasticsearch.dsl.search.TermsFilter;
import com.first8.elasticsearch.dsl.search.TypeFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getAnd <em>And</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getExists <em>Exists</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getGeoBoundingBox <em>Geo Bounding Box</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getGeoDistance <em>Geo Distance</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getGeoDistanceRange <em>Geo Distance Range</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getGeoPolygon <em>Geo Polygon</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getGeoShape <em>Geo Shape</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getGeoHashCell <em>Geo Hash Cell</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getHasChild <em>Has Child</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getHasParent <em>Has Parent</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getMatchAll <em>Match All</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getMissing <em>Missing</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getNested <em>Nested</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getNot <em>Not</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getOr <em>Or</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterTypeImpl extends FilterObjectImpl implements FilterType
{
  /**
   * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd()
   * @generated
   * @ordered
   */
  protected AndFilter and;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected BoolFilter bool;

  /**
   * The default value of the '{@link #getExists() <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExists()
   * @generated
   * @ordered
   */
  protected static final String EXISTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExists() <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExists()
   * @generated
   * @ordered
   */
  protected String exists = EXISTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getGeoBoundingBox() <em>Geo Bounding Box</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoBoundingBox()
   * @generated
   * @ordered
   */
  protected GeoBoundingBoxFilter geoBoundingBox;

  /**
   * The cached value of the '{@link #getGeoDistance() <em>Geo Distance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoDistance()
   * @generated
   * @ordered
   */
  protected GeoDistanceFilter geoDistance;

  /**
   * The cached value of the '{@link #getGeoDistanceRange() <em>Geo Distance Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoDistanceRange()
   * @generated
   * @ordered
   */
  protected GeoDistanceRangeFilter geoDistanceRange;

  /**
   * The cached value of the '{@link #getGeoPolygon() <em>Geo Polygon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoPolygon()
   * @generated
   * @ordered
   */
  protected GeoPolygonFilter geoPolygon;

  /**
   * The cached value of the '{@link #getGeoShape() <em>Geo Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoShape()
   * @generated
   * @ordered
   */
  protected GeoShapeFilter geoShape;

  /**
   * The cached value of the '{@link #getGeoHashCell() <em>Geo Hash Cell</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeoHashCell()
   * @generated
   * @ordered
   */
  protected GeohashCellFilter geoHashCell;

  /**
   * The cached value of the '{@link #getHasChild() <em>Has Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasChild()
   * @generated
   * @ordered
   */
  protected HasChildFilter hasChild;

  /**
   * The cached value of the '{@link #getHasParent() <em>Has Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasParent()
   * @generated
   * @ordered
   */
  protected HasParentFilter hasParent;

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
  protected IndicesFilter indices;

  /**
   * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected static final String LIMIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected String limit = LIMIT_EDEFAULT;

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
   * The default value of the '{@link #getMissing() <em>Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissing()
   * @generated
   * @ordered
   */
  protected static final String MISSING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMissing() <em>Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMissing()
   * @generated
   * @ordered
   */
  protected String missing = MISSING_EDEFAULT;

  /**
   * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNested()
   * @generated
   * @ordered
   */
  protected NestedFilter nested;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected NotFilter not;

  /**
   * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected OrFilter or;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected PrefixFilter prefix;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected QueryFilter query;

  /**
   * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegexp()
   * @generated
   * @ordered
   */
  protected RegexpFilter regexp;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected ScriptFilter script;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected TermFilter term;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected TermsFilter terms;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeFilter type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterTypeImpl()
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
    return SearchPackage.eINSTANCE.getFilterType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndFilter getAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnd(AndFilter newAnd, NotificationChain msgs)
  {
    AndFilter oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__AND, oldAnd, newAnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd(AndFilter newAnd)
  {
    if (newAnd != and)
    {
      NotificationChain msgs = null;
      if (and != null)
        msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__AND, null, msgs);
      if (newAnd != null)
        msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__AND, null, msgs);
      msgs = basicSetAnd(newAnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__AND, newAnd, newAnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolFilter getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool(BoolFilter newBool, NotificationChain msgs)
  {
    BoolFilter oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__BOOL, oldBool, newBool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(BoolFilter newBool)
  {
    if (newBool != bool)
    {
      NotificationChain msgs = null;
      if (bool != null)
        msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__BOOL, null, msgs);
      if (newBool != null)
        msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__BOOL, null, msgs);
      msgs = basicSetBool(newBool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__BOOL, newBool, newBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExists()
  {
    return exists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExists(String newExists)
  {
    String oldExists = exists;
    exists = newExists;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__EXISTS, oldExists, exists));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoBoundingBoxFilter getGeoBoundingBox()
  {
    return geoBoundingBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoBoundingBox(GeoBoundingBoxFilter newGeoBoundingBox, NotificationChain msgs)
  {
    GeoBoundingBoxFilter oldGeoBoundingBox = geoBoundingBox;
    geoBoundingBox = newGeoBoundingBox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX, oldGeoBoundingBox, newGeoBoundingBox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoBoundingBox(GeoBoundingBoxFilter newGeoBoundingBox)
  {
    if (newGeoBoundingBox != geoBoundingBox)
    {
      NotificationChain msgs = null;
      if (geoBoundingBox != null)
        msgs = ((InternalEObject)geoBoundingBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX, null, msgs);
      if (newGeoBoundingBox != null)
        msgs = ((InternalEObject)newGeoBoundingBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX, null, msgs);
      msgs = basicSetGeoBoundingBox(newGeoBoundingBox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX, newGeoBoundingBox, newGeoBoundingBox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceFilter getGeoDistance()
  {
    return geoDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoDistance(GeoDistanceFilter newGeoDistance, NotificationChain msgs)
  {
    GeoDistanceFilter oldGeoDistance = geoDistance;
    geoDistance = newGeoDistance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_DISTANCE, oldGeoDistance, newGeoDistance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoDistance(GeoDistanceFilter newGeoDistance)
  {
    if (newGeoDistance != geoDistance)
    {
      NotificationChain msgs = null;
      if (geoDistance != null)
        msgs = ((InternalEObject)geoDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_DISTANCE, null, msgs);
      if (newGeoDistance != null)
        msgs = ((InternalEObject)newGeoDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_DISTANCE, null, msgs);
      msgs = basicSetGeoDistance(newGeoDistance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_DISTANCE, newGeoDistance, newGeoDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoDistanceRangeFilter getGeoDistanceRange()
  {
    return geoDistanceRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoDistanceRange(GeoDistanceRangeFilter newGeoDistanceRange, NotificationChain msgs)
  {
    GeoDistanceRangeFilter oldGeoDistanceRange = geoDistanceRange;
    geoDistanceRange = newGeoDistanceRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE, oldGeoDistanceRange, newGeoDistanceRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoDistanceRange(GeoDistanceRangeFilter newGeoDistanceRange)
  {
    if (newGeoDistanceRange != geoDistanceRange)
    {
      NotificationChain msgs = null;
      if (geoDistanceRange != null)
        msgs = ((InternalEObject)geoDistanceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE, null, msgs);
      if (newGeoDistanceRange != null)
        msgs = ((InternalEObject)newGeoDistanceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE, null, msgs);
      msgs = basicSetGeoDistanceRange(newGeoDistanceRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE, newGeoDistanceRange, newGeoDistanceRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoPolygonFilter getGeoPolygon()
  {
    return geoPolygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoPolygon(GeoPolygonFilter newGeoPolygon, NotificationChain msgs)
  {
    GeoPolygonFilter oldGeoPolygon = geoPolygon;
    geoPolygon = newGeoPolygon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_POLYGON, oldGeoPolygon, newGeoPolygon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoPolygon(GeoPolygonFilter newGeoPolygon)
  {
    if (newGeoPolygon != geoPolygon)
    {
      NotificationChain msgs = null;
      if (geoPolygon != null)
        msgs = ((InternalEObject)geoPolygon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_POLYGON, null, msgs);
      if (newGeoPolygon != null)
        msgs = ((InternalEObject)newGeoPolygon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_POLYGON, null, msgs);
      msgs = basicSetGeoPolygon(newGeoPolygon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_POLYGON, newGeoPolygon, newGeoPolygon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoShapeFilter getGeoShape()
  {
    return geoShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoShape(GeoShapeFilter newGeoShape, NotificationChain msgs)
  {
    GeoShapeFilter oldGeoShape = geoShape;
    geoShape = newGeoShape;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_SHAPE, oldGeoShape, newGeoShape);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoShape(GeoShapeFilter newGeoShape)
  {
    if (newGeoShape != geoShape)
    {
      NotificationChain msgs = null;
      if (geoShape != null)
        msgs = ((InternalEObject)geoShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_SHAPE, null, msgs);
      if (newGeoShape != null)
        msgs = ((InternalEObject)newGeoShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_SHAPE, null, msgs);
      msgs = basicSetGeoShape(newGeoShape, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_SHAPE, newGeoShape, newGeoShape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeohashCellFilter getGeoHashCell()
  {
    return geoHashCell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeoHashCell(GeohashCellFilter newGeoHashCell, NotificationChain msgs)
  {
    GeohashCellFilter oldGeoHashCell = geoHashCell;
    geoHashCell = newGeoHashCell;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_HASH_CELL, oldGeoHashCell, newGeoHashCell);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeoHashCell(GeohashCellFilter newGeoHashCell)
  {
    if (newGeoHashCell != geoHashCell)
    {
      NotificationChain msgs = null;
      if (geoHashCell != null)
        msgs = ((InternalEObject)geoHashCell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_HASH_CELL, null, msgs);
      if (newGeoHashCell != null)
        msgs = ((InternalEObject)newGeoHashCell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__GEO_HASH_CELL, null, msgs);
      msgs = basicSetGeoHashCell(newGeoHashCell, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__GEO_HASH_CELL, newGeoHashCell, newGeoHashCell));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasChildFilter getHasChild()
  {
    return hasChild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasChild(HasChildFilter newHasChild, NotificationChain msgs)
  {
    HasChildFilter oldHasChild = hasChild;
    hasChild = newHasChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__HAS_CHILD, oldHasChild, newHasChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasChild(HasChildFilter newHasChild)
  {
    if (newHasChild != hasChild)
    {
      NotificationChain msgs = null;
      if (hasChild != null)
        msgs = ((InternalEObject)hasChild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__HAS_CHILD, null, msgs);
      if (newHasChild != null)
        msgs = ((InternalEObject)newHasChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__HAS_CHILD, null, msgs);
      msgs = basicSetHasChild(newHasChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__HAS_CHILD, newHasChild, newHasChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasParentFilter getHasParent()
  {
    return hasParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasParent(HasParentFilter newHasParent, NotificationChain msgs)
  {
    HasParentFilter oldHasParent = hasParent;
    hasParent = newHasParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__HAS_PARENT, oldHasParent, newHasParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasParent(HasParentFilter newHasParent)
  {
    if (newHasParent != hasParent)
    {
      NotificationChain msgs = null;
      if (hasParent != null)
        msgs = ((InternalEObject)hasParent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__HAS_PARENT, null, msgs);
      if (newHasParent != null)
        msgs = ((InternalEObject)newHasParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__HAS_PARENT, null, msgs);
      msgs = basicSetHasParent(newHasParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__HAS_PARENT, newHasParent, newHasParent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__IDS, oldIds, ids));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndicesFilter getIndices()
  {
    return indices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndices(IndicesFilter newIndices, NotificationChain msgs)
  {
    IndicesFilter oldIndices = indices;
    indices = newIndices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__INDICES, oldIndices, newIndices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndices(IndicesFilter newIndices)
  {
    if (newIndices != indices)
    {
      NotificationChain msgs = null;
      if (indices != null)
        msgs = ((InternalEObject)indices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__INDICES, null, msgs);
      if (newIndices != null)
        msgs = ((InternalEObject)newIndices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__INDICES, null, msgs);
      msgs = basicSetIndices(newIndices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__INDICES, newIndices, newIndices));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(String newLimit)
  {
    String oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__LIMIT, oldLimit, limit));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__MATCH_ALL, oldMatchAll, matchAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMissing()
  {
    return missing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMissing(String newMissing)
  {
    String oldMissing = missing;
    missing = newMissing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__MISSING, oldMissing, missing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedFilter getNested()
  {
    return nested;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNested(NestedFilter newNested, NotificationChain msgs)
  {
    NestedFilter oldNested = nested;
    nested = newNested;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__NESTED, oldNested, newNested);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNested(NestedFilter newNested)
  {
    if (newNested != nested)
    {
      NotificationChain msgs = null;
      if (nested != null)
        msgs = ((InternalEObject)nested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__NESTED, null, msgs);
      if (newNested != null)
        msgs = ((InternalEObject)newNested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__NESTED, null, msgs);
      msgs = basicSetNested(newNested, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__NESTED, newNested, newNested));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotFilter getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNot(NotFilter newNot, NotificationChain msgs)
  {
    NotFilter oldNot = not;
    not = newNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__NOT, oldNot, newNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(NotFilter newNot)
  {
    if (newNot != not)
    {
      NotificationChain msgs = null;
      if (not != null)
        msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__NOT, null, msgs);
      if (newNot != null)
        msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__NOT, null, msgs);
      msgs = basicSetNot(newNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__NOT, newNot, newNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrFilter getOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOr(OrFilter newOr, NotificationChain msgs)
  {
    OrFilter oldOr = or;
    or = newOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__OR, oldOr, newOr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOr(OrFilter newOr)
  {
    if (newOr != or)
    {
      NotificationChain msgs = null;
      if (or != null)
        msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__OR, null, msgs);
      if (newOr != null)
        msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__OR, null, msgs);
      msgs = basicSetOr(newOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__OR, newOr, newOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixFilter getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(PrefixFilter newPrefix, NotificationChain msgs)
  {
    PrefixFilter oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__PREFIX, oldPrefix, newPrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(PrefixFilter newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__PREFIX, newPrefix, newPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFilter getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(QueryFilter newQuery, NotificationChain msgs)
  {
    QueryFilter oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(QueryFilter newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexpFilter getRegexp()
  {
    return regexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegexp(RegexpFilter newRegexp, NotificationChain msgs)
  {
    RegexpFilter oldRegexp = regexp;
    regexp = newRegexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__REGEXP, oldRegexp, newRegexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegexp(RegexpFilter newRegexp)
  {
    if (newRegexp != regexp)
    {
      NotificationChain msgs = null;
      if (regexp != null)
        msgs = ((InternalEObject)regexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__REGEXP, null, msgs);
      if (newRegexp != null)
        msgs = ((InternalEObject)newRegexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__REGEXP, null, msgs);
      msgs = basicSetRegexp(newRegexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__REGEXP, newRegexp, newRegexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptFilter getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScript(ScriptFilter newScript, NotificationChain msgs)
  {
    ScriptFilter oldScript = script;
    script = newScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__SCRIPT, oldScript, newScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(ScriptFilter newScript)
  {
    if (newScript != script)
    {
      NotificationChain msgs = null;
      if (script != null)
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__SCRIPT, newScript, newScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermFilter getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(TermFilter newTerm, NotificationChain msgs)
  {
    TermFilter oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(TermFilter newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFilter getTerms()
  {
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerms(TermsFilter newTerms, NotificationChain msgs)
  {
    TermsFilter oldTerms = terms;
    terms = newTerms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__TERMS, oldTerms, newTerms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerms(TermsFilter newTerms)
  {
    if (newTerms != terms)
    {
      NotificationChain msgs = null;
      if (terms != null)
        msgs = ((InternalEObject)terms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__TERMS, null, msgs);
      if (newTerms != null)
        msgs = ((InternalEObject)newTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__TERMS, null, msgs);
      msgs = basicSetTerms(newTerms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__TERMS, newTerms, newTerms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFilter getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeFilter newType, NotificationChain msgs)
  {
    TypeFilter oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeFilter newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FILTER_TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FILTER_TYPE__TYPE, newType, newType));
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
      case SearchPackage.FILTER_TYPE__AND:
        return basicSetAnd(null, msgs);
      case SearchPackage.FILTER_TYPE__BOOL:
        return basicSetBool(null, msgs);
      case SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX:
        return basicSetGeoBoundingBox(null, msgs);
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE:
        return basicSetGeoDistance(null, msgs);
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE:
        return basicSetGeoDistanceRange(null, msgs);
      case SearchPackage.FILTER_TYPE__GEO_POLYGON:
        return basicSetGeoPolygon(null, msgs);
      case SearchPackage.FILTER_TYPE__GEO_SHAPE:
        return basicSetGeoShape(null, msgs);
      case SearchPackage.FILTER_TYPE__GEO_HASH_CELL:
        return basicSetGeoHashCell(null, msgs);
      case SearchPackage.FILTER_TYPE__HAS_CHILD:
        return basicSetHasChild(null, msgs);
      case SearchPackage.FILTER_TYPE__HAS_PARENT:
        return basicSetHasParent(null, msgs);
      case SearchPackage.FILTER_TYPE__INDICES:
        return basicSetIndices(null, msgs);
      case SearchPackage.FILTER_TYPE__NESTED:
        return basicSetNested(null, msgs);
      case SearchPackage.FILTER_TYPE__NOT:
        return basicSetNot(null, msgs);
      case SearchPackage.FILTER_TYPE__OR:
        return basicSetOr(null, msgs);
      case SearchPackage.FILTER_TYPE__PREFIX:
        return basicSetPrefix(null, msgs);
      case SearchPackage.FILTER_TYPE__QUERY:
        return basicSetQuery(null, msgs);
      case SearchPackage.FILTER_TYPE__REGEXP:
        return basicSetRegexp(null, msgs);
      case SearchPackage.FILTER_TYPE__SCRIPT:
        return basicSetScript(null, msgs);
      case SearchPackage.FILTER_TYPE__TERM:
        return basicSetTerm(null, msgs);
      case SearchPackage.FILTER_TYPE__TERMS:
        return basicSetTerms(null, msgs);
      case SearchPackage.FILTER_TYPE__TYPE:
        return basicSetType(null, msgs);
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
      case SearchPackage.FILTER_TYPE__AND:
        return getAnd();
      case SearchPackage.FILTER_TYPE__BOOL:
        return getBool();
      case SearchPackage.FILTER_TYPE__EXISTS:
        return getExists();
      case SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX:
        return getGeoBoundingBox();
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE:
        return getGeoDistance();
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE:
        return getGeoDistanceRange();
      case SearchPackage.FILTER_TYPE__GEO_POLYGON:
        return getGeoPolygon();
      case SearchPackage.FILTER_TYPE__GEO_SHAPE:
        return getGeoShape();
      case SearchPackage.FILTER_TYPE__GEO_HASH_CELL:
        return getGeoHashCell();
      case SearchPackage.FILTER_TYPE__HAS_CHILD:
        return getHasChild();
      case SearchPackage.FILTER_TYPE__HAS_PARENT:
        return getHasParent();
      case SearchPackage.FILTER_TYPE__IDS:
        return getIds();
      case SearchPackage.FILTER_TYPE__INDICES:
        return getIndices();
      case SearchPackage.FILTER_TYPE__LIMIT:
        return getLimit();
      case SearchPackage.FILTER_TYPE__MATCH_ALL:
        return getMatchAll();
      case SearchPackage.FILTER_TYPE__MISSING:
        return getMissing();
      case SearchPackage.FILTER_TYPE__NESTED:
        return getNested();
      case SearchPackage.FILTER_TYPE__NOT:
        return getNot();
      case SearchPackage.FILTER_TYPE__OR:
        return getOr();
      case SearchPackage.FILTER_TYPE__PREFIX:
        return getPrefix();
      case SearchPackage.FILTER_TYPE__QUERY:
        return getQuery();
      case SearchPackage.FILTER_TYPE__REGEXP:
        return getRegexp();
      case SearchPackage.FILTER_TYPE__SCRIPT:
        return getScript();
      case SearchPackage.FILTER_TYPE__TERM:
        return getTerm();
      case SearchPackage.FILTER_TYPE__TERMS:
        return getTerms();
      case SearchPackage.FILTER_TYPE__TYPE:
        return getType();
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
      case SearchPackage.FILTER_TYPE__AND:
        setAnd((AndFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__BOOL:
        setBool((BoolFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__EXISTS:
        setExists((String)newValue);
        return;
      case SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX:
        setGeoBoundingBox((GeoBoundingBoxFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE:
        setGeoDistance((GeoDistanceFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE:
        setGeoDistanceRange((GeoDistanceRangeFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__GEO_POLYGON:
        setGeoPolygon((GeoPolygonFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__GEO_SHAPE:
        setGeoShape((GeoShapeFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__GEO_HASH_CELL:
        setGeoHashCell((GeohashCellFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__HAS_CHILD:
        setHasChild((HasChildFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__HAS_PARENT:
        setHasParent((HasParentFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__IDS:
        setIds((String)newValue);
        return;
      case SearchPackage.FILTER_TYPE__INDICES:
        setIndices((IndicesFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__LIMIT:
        setLimit((String)newValue);
        return;
      case SearchPackage.FILTER_TYPE__MATCH_ALL:
        setMatchAll((String)newValue);
        return;
      case SearchPackage.FILTER_TYPE__MISSING:
        setMissing((String)newValue);
        return;
      case SearchPackage.FILTER_TYPE__NESTED:
        setNested((NestedFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__NOT:
        setNot((NotFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__OR:
        setOr((OrFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__PREFIX:
        setPrefix((PrefixFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__QUERY:
        setQuery((QueryFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__REGEXP:
        setRegexp((RegexpFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__SCRIPT:
        setScript((ScriptFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__TERM:
        setTerm((TermFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__TERMS:
        setTerms((TermsFilter)newValue);
        return;
      case SearchPackage.FILTER_TYPE__TYPE:
        setType((TypeFilter)newValue);
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
      case SearchPackage.FILTER_TYPE__AND:
        setAnd((AndFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__BOOL:
        setBool((BoolFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__EXISTS:
        setExists(EXISTS_EDEFAULT);
        return;
      case SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX:
        setGeoBoundingBox((GeoBoundingBoxFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE:
        setGeoDistance((GeoDistanceFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE:
        setGeoDistanceRange((GeoDistanceRangeFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__GEO_POLYGON:
        setGeoPolygon((GeoPolygonFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__GEO_SHAPE:
        setGeoShape((GeoShapeFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__GEO_HASH_CELL:
        setGeoHashCell((GeohashCellFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__HAS_CHILD:
        setHasChild((HasChildFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__HAS_PARENT:
        setHasParent((HasParentFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__IDS:
        setIds(IDS_EDEFAULT);
        return;
      case SearchPackage.FILTER_TYPE__INDICES:
        setIndices((IndicesFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__LIMIT:
        setLimit(LIMIT_EDEFAULT);
        return;
      case SearchPackage.FILTER_TYPE__MATCH_ALL:
        setMatchAll(MATCH_ALL_EDEFAULT);
        return;
      case SearchPackage.FILTER_TYPE__MISSING:
        setMissing(MISSING_EDEFAULT);
        return;
      case SearchPackage.FILTER_TYPE__NESTED:
        setNested((NestedFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__NOT:
        setNot((NotFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__OR:
        setOr((OrFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__PREFIX:
        setPrefix((PrefixFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__QUERY:
        setQuery((QueryFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__REGEXP:
        setRegexp((RegexpFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__SCRIPT:
        setScript((ScriptFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__TERM:
        setTerm((TermFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__TERMS:
        setTerms((TermsFilter)null);
        return;
      case SearchPackage.FILTER_TYPE__TYPE:
        setType((TypeFilter)null);
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
      case SearchPackage.FILTER_TYPE__AND:
        return and != null;
      case SearchPackage.FILTER_TYPE__BOOL:
        return bool != null;
      case SearchPackage.FILTER_TYPE__EXISTS:
        return EXISTS_EDEFAULT == null ? exists != null : !EXISTS_EDEFAULT.equals(exists);
      case SearchPackage.FILTER_TYPE__GEO_BOUNDING_BOX:
        return geoBoundingBox != null;
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE:
        return geoDistance != null;
      case SearchPackage.FILTER_TYPE__GEO_DISTANCE_RANGE:
        return geoDistanceRange != null;
      case SearchPackage.FILTER_TYPE__GEO_POLYGON:
        return geoPolygon != null;
      case SearchPackage.FILTER_TYPE__GEO_SHAPE:
        return geoShape != null;
      case SearchPackage.FILTER_TYPE__GEO_HASH_CELL:
        return geoHashCell != null;
      case SearchPackage.FILTER_TYPE__HAS_CHILD:
        return hasChild != null;
      case SearchPackage.FILTER_TYPE__HAS_PARENT:
        return hasParent != null;
      case SearchPackage.FILTER_TYPE__IDS:
        return IDS_EDEFAULT == null ? ids != null : !IDS_EDEFAULT.equals(ids);
      case SearchPackage.FILTER_TYPE__INDICES:
        return indices != null;
      case SearchPackage.FILTER_TYPE__LIMIT:
        return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
      case SearchPackage.FILTER_TYPE__MATCH_ALL:
        return MATCH_ALL_EDEFAULT == null ? matchAll != null : !MATCH_ALL_EDEFAULT.equals(matchAll);
      case SearchPackage.FILTER_TYPE__MISSING:
        return MISSING_EDEFAULT == null ? missing != null : !MISSING_EDEFAULT.equals(missing);
      case SearchPackage.FILTER_TYPE__NESTED:
        return nested != null;
      case SearchPackage.FILTER_TYPE__NOT:
        return not != null;
      case SearchPackage.FILTER_TYPE__OR:
        return or != null;
      case SearchPackage.FILTER_TYPE__PREFIX:
        return prefix != null;
      case SearchPackage.FILTER_TYPE__QUERY:
        return query != null;
      case SearchPackage.FILTER_TYPE__REGEXP:
        return regexp != null;
      case SearchPackage.FILTER_TYPE__SCRIPT:
        return script != null;
      case SearchPackage.FILTER_TYPE__TERM:
        return term != null;
      case SearchPackage.FILTER_TYPE__TERMS:
        return terms != null;
      case SearchPackage.FILTER_TYPE__TYPE:
        return type != null;
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
    result.append(" (exists: ");
    result.append(exists);
    result.append(", ids: ");
    result.append(ids);
    result.append(", limit: ");
    result.append(limit);
    result.append(", matchAll: ");
    result.append(matchAll);
    result.append(", missing: ");
    result.append(missing);
    result.append(')');
    return result.toString();
  }

} //FilterTypeImpl
