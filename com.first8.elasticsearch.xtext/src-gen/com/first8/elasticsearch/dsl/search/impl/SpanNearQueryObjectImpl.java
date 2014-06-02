/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SpanNearQueryObject;
import com.first8.elasticsearch.dsl.search.SpanQuery;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Near Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanNearQueryObjectImpl#getClauses <em>Clauses</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanNearQueryObjectImpl#getSlop <em>Slop</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanNearQueryObjectImpl#getInOrder <em>In Order</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SpanNearQueryObjectImpl#getCollectPayloads <em>Collect Payloads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanNearQueryObjectImpl extends SpanNearQueryImpl implements SpanNearQueryObject
{
  /**
   * The cached value of the '{@link #getClauses() <em>Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClauses()
   * @generated
   * @ordered
   */
  protected EList<SpanQuery> clauses;

  /**
   * The default value of the '{@link #getSlop() <em>Slop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlop()
   * @generated
   * @ordered
   */
  protected static final String SLOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSlop() <em>Slop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlop()
   * @generated
   * @ordered
   */
  protected String slop = SLOP_EDEFAULT;

  /**
   * The default value of the '{@link #getInOrder() <em>In Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInOrder()
   * @generated
   * @ordered
   */
  protected static final String IN_ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInOrder() <em>In Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInOrder()
   * @generated
   * @ordered
   */
  protected String inOrder = IN_ORDER_EDEFAULT;

  /**
   * The default value of the '{@link #getCollectPayloads() <em>Collect Payloads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectPayloads()
   * @generated
   * @ordered
   */
  protected static final String COLLECT_PAYLOADS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollectPayloads() <em>Collect Payloads</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectPayloads()
   * @generated
   * @ordered
   */
  protected String collectPayloads = COLLECT_PAYLOADS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpanNearQueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getSpanNearQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpanQuery> getClauses()
  {
    if (clauses == null)
    {
      clauses = new EObjectContainmentEList<SpanQuery>(SpanQuery.class, this, SearchPackage.SPAN_NEAR_QUERY_OBJECT__CLAUSES);
    }
    return clauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSlop()
  {
    return slop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlop(String newSlop)
  {
    String oldSlop = slop;
    slop = newSlop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NEAR_QUERY_OBJECT__SLOP, oldSlop, slop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInOrder()
  {
    return inOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInOrder(String newInOrder)
  {
    String oldInOrder = inOrder;
    inOrder = newInOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NEAR_QUERY_OBJECT__IN_ORDER, oldInOrder, inOrder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCollectPayloads()
  {
    return collectPayloads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollectPayloads(String newCollectPayloads)
  {
    String oldCollectPayloads = collectPayloads;
    collectPayloads = newCollectPayloads;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SPAN_NEAR_QUERY_OBJECT__COLLECT_PAYLOADS, oldCollectPayloads, collectPayloads));
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
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__CLAUSES:
        return ((InternalEList<?>)getClauses()).basicRemove(otherEnd, msgs);
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
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__CLAUSES:
        return getClauses();
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__SLOP:
        return getSlop();
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__IN_ORDER:
        return getInOrder();
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__COLLECT_PAYLOADS:
        return getCollectPayloads();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__CLAUSES:
        getClauses().clear();
        getClauses().addAll((Collection<? extends SpanQuery>)newValue);
        return;
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__SLOP:
        setSlop((String)newValue);
        return;
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__IN_ORDER:
        setInOrder((String)newValue);
        return;
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__COLLECT_PAYLOADS:
        setCollectPayloads((String)newValue);
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
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__CLAUSES:
        getClauses().clear();
        return;
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__SLOP:
        setSlop(SLOP_EDEFAULT);
        return;
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__IN_ORDER:
        setInOrder(IN_ORDER_EDEFAULT);
        return;
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__COLLECT_PAYLOADS:
        setCollectPayloads(COLLECT_PAYLOADS_EDEFAULT);
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
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__CLAUSES:
        return clauses != null && !clauses.isEmpty();
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__SLOP:
        return SLOP_EDEFAULT == null ? slop != null : !SLOP_EDEFAULT.equals(slop);
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__IN_ORDER:
        return IN_ORDER_EDEFAULT == null ? inOrder != null : !IN_ORDER_EDEFAULT.equals(inOrder);
      case SearchPackage.SPAN_NEAR_QUERY_OBJECT__COLLECT_PAYLOADS:
        return COLLECT_PAYLOADS_EDEFAULT == null ? collectPayloads != null : !COLLECT_PAYLOADS_EDEFAULT.equals(collectPayloads);
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
    result.append(" (slop: ");
    result.append(slop);
    result.append(", inOrder: ");
    result.append(inOrder);
    result.append(", collectPayloads: ");
    result.append(collectPayloads);
    result.append(')');
    return result.toString();
  }

} //SpanNearQueryObjectImpl
