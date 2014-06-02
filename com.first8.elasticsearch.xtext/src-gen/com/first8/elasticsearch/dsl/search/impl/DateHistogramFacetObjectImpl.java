/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.DateHistogramFacetObject;
import com.first8.elasticsearch.dsl.search.KeyValueField;
import com.first8.elasticsearch.dsl.search.KeyValueScript;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Histogram Facet Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetObjectImpl#getField <em>Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetObjectImpl#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetObjectImpl#getKeyValueScript <em>Key Value Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateHistogramFacetObjectImpl extends DateHistogramFacetImpl implements DateHistogramFacetObject
{
  /**
   * The default value of the '{@link #getField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected static final String FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected String field = FIELD_EDEFAULT;

  /**
   * The cached value of the '{@link #getKeyValue() <em>Key Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyValue()
   * @generated
   * @ordered
   */
  protected KeyValueField keyValue;

  /**
   * The cached value of the '{@link #getKeyValueScript() <em>Key Value Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyValueScript()
   * @generated
   * @ordered
   */
  protected KeyValueScript keyValueScript;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateHistogramFacetObjectImpl()
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
    return SearchPackage.eINSTANCE.getDateHistogramFacetObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(String newField)
  {
    String oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueField getKeyValue()
  {
    return keyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyValue(KeyValueField newKeyValue, NotificationChain msgs)
  {
    KeyValueField oldKeyValue = keyValue;
    keyValue = newKeyValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE, oldKeyValue, newKeyValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyValue(KeyValueField newKeyValue)
  {
    if (newKeyValue != keyValue)
    {
      NotificationChain msgs = null;
      if (keyValue != null)
        msgs = ((InternalEObject)keyValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE, null, msgs);
      if (newKeyValue != null)
        msgs = ((InternalEObject)newKeyValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE, null, msgs);
      msgs = basicSetKeyValue(newKeyValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE, newKeyValue, newKeyValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValueScript getKeyValueScript()
  {
    return keyValueScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyValueScript(KeyValueScript newKeyValueScript, NotificationChain msgs)
  {
    KeyValueScript oldKeyValueScript = keyValueScript;
    keyValueScript = newKeyValueScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT, oldKeyValueScript, newKeyValueScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyValueScript(KeyValueScript newKeyValueScript)
  {
    if (newKeyValueScript != keyValueScript)
    {
      NotificationChain msgs = null;
      if (keyValueScript != null)
        msgs = ((InternalEObject)keyValueScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT, null, msgs);
      if (newKeyValueScript != null)
        msgs = ((InternalEObject)newKeyValueScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT, null, msgs);
      msgs = basicSetKeyValueScript(newKeyValueScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT, newKeyValueScript, newKeyValueScript));
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
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE:
        return basicSetKeyValue(null, msgs);
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT:
        return basicSetKeyValueScript(null, msgs);
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
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__FIELD:
        return getField();
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE:
        return getKeyValue();
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT:
        return getKeyValueScript();
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
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__FIELD:
        setField((String)newValue);
        return;
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE:
        setKeyValue((KeyValueField)newValue);
        return;
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT:
        setKeyValueScript((KeyValueScript)newValue);
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
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__FIELD:
        setField(FIELD_EDEFAULT);
        return;
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE:
        setKeyValue((KeyValueField)null);
        return;
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT:
        setKeyValueScript((KeyValueScript)null);
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
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__FIELD:
        return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE:
        return keyValue != null;
      case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT:
        return keyValueScript != null;
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
    result.append(" (field: ");
    result.append(field);
    result.append(')');
    return result.toString();
  }

} //DateHistogramFacetObjectImpl
