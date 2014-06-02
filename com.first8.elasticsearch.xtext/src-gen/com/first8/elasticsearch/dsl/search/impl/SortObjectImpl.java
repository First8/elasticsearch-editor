/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.SortObject;
import com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortObjectImpl#getSortFieldName <em>Sort Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SortObjectImpl#getSortProperties <em>Sort Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortObjectImpl extends MinimalEObjectImpl.Container implements SortObject
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
   * The cached value of the '{@link #getSortProperties() <em>Sort Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortProperties()
   * @generated
   * @ordered
   */
  protected SortObjectPropertiesObject sortProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortObjectImpl()
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
    return SearchPackage.eINSTANCE.getSortObject();
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
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT__SORT_FIELD_NAME, oldSortFieldName, sortFieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortObjectPropertiesObject getSortProperties()
  {
    return sortProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSortProperties(SortObjectPropertiesObject newSortProperties, NotificationChain msgs)
  {
    SortObjectPropertiesObject oldSortProperties = sortProperties;
    sortProperties = newSortProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT__SORT_PROPERTIES, oldSortProperties, newSortProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortProperties(SortObjectPropertiesObject newSortProperties)
  {
    if (newSortProperties != sortProperties)
    {
      NotificationChain msgs = null;
      if (sortProperties != null)
        msgs = ((InternalEObject)sortProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_OBJECT__SORT_PROPERTIES, null, msgs);
      if (newSortProperties != null)
        msgs = ((InternalEObject)newSortProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SORT_OBJECT__SORT_PROPERTIES, null, msgs);
      msgs = basicSetSortProperties(newSortProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SORT_OBJECT__SORT_PROPERTIES, newSortProperties, newSortProperties));
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
      case SearchPackage.SORT_OBJECT__SORT_PROPERTIES:
        return basicSetSortProperties(null, msgs);
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
      case SearchPackage.SORT_OBJECT__SORT_FIELD_NAME:
        return getSortFieldName();
      case SearchPackage.SORT_OBJECT__SORT_PROPERTIES:
        return getSortProperties();
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
      case SearchPackage.SORT_OBJECT__SORT_FIELD_NAME:
        setSortFieldName((String)newValue);
        return;
      case SearchPackage.SORT_OBJECT__SORT_PROPERTIES:
        setSortProperties((SortObjectPropertiesObject)newValue);
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
      case SearchPackage.SORT_OBJECT__SORT_FIELD_NAME:
        setSortFieldName(SORT_FIELD_NAME_EDEFAULT);
        return;
      case SearchPackage.SORT_OBJECT__SORT_PROPERTIES:
        setSortProperties((SortObjectPropertiesObject)null);
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
      case SearchPackage.SORT_OBJECT__SORT_FIELD_NAME:
        return SORT_FIELD_NAME_EDEFAULT == null ? sortFieldName != null : !SORT_FIELD_NAME_EDEFAULT.equals(sortFieldName);
      case SearchPackage.SORT_OBJECT__SORT_PROPERTIES:
        return sortProperties != null;
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
    result.append(')');
    return result.toString();
  }

} //SortObjectImpl
