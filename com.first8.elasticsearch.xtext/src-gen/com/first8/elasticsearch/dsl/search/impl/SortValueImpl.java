/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.ShortSortOject;
import com.first8.elasticsearch.dsl.search.SortObject;
import com.first8.elasticsearch.dsl.search.SortValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortValueImpl#getSortFieldName <em>Sort Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortValueImpl#getSortShortObject <em>Sort Short Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortValueImpl#getSortObject <em>Sort Object</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortValueImpl#getSortByScore <em>Sort By Score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortValueImpl extends MinimalEObjectImpl.Container implements SortValue
{
  /**
   * The default value of the '{@link #getSortFieldName() <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortFieldName()
   * @generated
   * @ordered
   */
  protected static final String SORT_FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSortFieldName() <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortFieldName()
   * @generated
   * @ordered
   */
  protected String sortFieldName = SORT_FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSortShortObject() <em>Sort Short Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortShortObject()
   * @generated
   * @ordered
   */
  protected ShortSortOject sortShortObject;

  /**
   * The cached value of the '{@link #getSortObject() <em>Sort Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortObject()
   * @generated
   * @ordered
   */
  protected SortObject sortObject;

  /**
   * The default value of the '{@link #getSortByScore() <em>Sort By Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortByScore()
   * @generated
   * @ordered
   */
  protected static final String SORT_BY_SCORE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSortByScore() <em>Sort By Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortByScore()
   * @generated
   * @ordered
   */
  protected String sortByScore = SORT_BY_SCORE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortValueImpl()
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
    return SearchPackage.eINSTANCE.getSortValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSortFieldName()
  {
    return sortFieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortFieldName(String newSortFieldName)
  {
    String oldSortFieldName = sortFieldName;
    sortFieldName = newSortFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_VALUE__SORT_FIELD_NAME, oldSortFieldName, sortFieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortSortOject getSortShortObject()
  {
    return sortShortObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSortShortObject(ShortSortOject newSortShortObject, NotificationChain msgs)
  {
    ShortSortOject oldSortShortObject = sortShortObject;
    sortShortObject = newSortShortObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT, oldSortShortObject, newSortShortObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortShortObject(ShortSortOject newSortShortObject)
  {
    if (newSortShortObject != sortShortObject)
    {
      NotificationChain msgs = null;
      if (sortShortObject != null)
        msgs = ((InternalEObject)sortShortObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT, null, msgs);
      if (newSortShortObject != null)
        msgs = ((InternalEObject)newSortShortObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT, null, msgs);
      msgs = basicSetSortShortObject(newSortShortObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT, newSortShortObject, newSortShortObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortObject getSortObject()
  {
    return sortObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSortObject(SortObject newSortObject, NotificationChain msgs)
  {
    SortObject oldSortObject = sortObject;
    sortObject = newSortObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_VALUE__SORT_OBJECT, oldSortObject, newSortObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortObject(SortObject newSortObject)
  {
    if (newSortObject != sortObject)
    {
      NotificationChain msgs = null;
      if (sortObject != null)
        msgs = ((InternalEObject)sortObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_VALUE__SORT_OBJECT, null, msgs);
      if (newSortObject != null)
        msgs = ((InternalEObject)newSortObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_VALUE__SORT_OBJECT, null, msgs);
      msgs = basicSetSortObject(newSortObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_VALUE__SORT_OBJECT, newSortObject, newSortObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSortByScore()
  {
    return sortByScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortByScore(String newSortByScore)
  {
    String oldSortByScore = sortByScore;
    sortByScore = newSortByScore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_VALUE__SORT_BY_SCORE, oldSortByScore, sortByScore));
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
      case SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT:
        return basicSetSortShortObject(null, msgs);
      case SearchPackage.SORT_VALUE__SORT_OBJECT:
        return basicSetSortObject(null, msgs);
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
      case SearchPackage.SORT_VALUE__SORT_FIELD_NAME:
        return getSortFieldName();
      case SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT:
        return getSortShortObject();
      case SearchPackage.SORT_VALUE__SORT_OBJECT:
        return getSortObject();
      case SearchPackage.SORT_VALUE__SORT_BY_SCORE:
        return getSortByScore();
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
      case SearchPackage.SORT_VALUE__SORT_FIELD_NAME:
        setSortFieldName((String)newValue);
        return;
      case SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT:
        setSortShortObject((ShortSortOject)newValue);
        return;
      case SearchPackage.SORT_VALUE__SORT_OBJECT:
        setSortObject((SortObject)newValue);
        return;
      case SearchPackage.SORT_VALUE__SORT_BY_SCORE:
        setSortByScore((String)newValue);
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
      case SearchPackage.SORT_VALUE__SORT_FIELD_NAME:
        setSortFieldName(SORT_FIELD_NAME_EDEFAULT);
        return;
      case SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT:
        setSortShortObject((ShortSortOject)null);
        return;
      case SearchPackage.SORT_VALUE__SORT_OBJECT:
        setSortObject((SortObject)null);
        return;
      case SearchPackage.SORT_VALUE__SORT_BY_SCORE:
        setSortByScore(SORT_BY_SCORE_EDEFAULT);
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
      case SearchPackage.SORT_VALUE__SORT_FIELD_NAME:
        return SORT_FIELD_NAME_EDEFAULT == null ? sortFieldName != null : !SORT_FIELD_NAME_EDEFAULT.equals(sortFieldName);
      case SearchPackage.SORT_VALUE__SORT_SHORT_OBJECT:
        return sortShortObject != null;
      case SearchPackage.SORT_VALUE__SORT_OBJECT:
        return sortObject != null;
      case SearchPackage.SORT_VALUE__SORT_BY_SCORE:
        return SORT_BY_SCORE_EDEFAULT == null ? sortByScore != null : !SORT_BY_SCORE_EDEFAULT.equals(sortByScore);
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
    result.append(" (sortFieldName: ");
    result.append(sortFieldName);
    result.append(", sortByScore: ");
    result.append(sortByScore);
    result.append(')');
    return result.toString();
  }

} //SortValueImpl
