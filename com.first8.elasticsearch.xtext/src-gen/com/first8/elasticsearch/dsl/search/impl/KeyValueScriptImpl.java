/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.KeyValueScript;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.KeyValueScriptImpl#getKeyScript <em>Key Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.KeyValueScriptImpl#getValueScript <em>Value Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyValueScriptImpl extends MinimalEObjectImpl.Container implements KeyValueScript
{
  /**
   * The default value of the '{@link #getKeyScript() <em>Key Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyScript()
   * @generated
   * @ordered
   */
  protected static final String KEY_SCRIPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyScript() <em>Key Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyScript()
   * @generated
   * @ordered
   */
  protected String keyScript = KEY_SCRIPT_EDEFAULT;

  /**
   * The default value of the '{@link #getValueScript() <em>Value Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueScript()
   * @generated
   * @ordered
   */
  protected static final String VALUE_SCRIPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueScript() <em>Value Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueScript()
   * @generated
   * @ordered
   */
  protected String valueScript = VALUE_SCRIPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyValueScriptImpl()
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
    return SearchPackage.eINSTANCE.getKeyValueScript();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyScript()
  {
    return keyScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyScript(String newKeyScript)
  {
    String oldKeyScript = keyScript;
    keyScript = newKeyScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.KEY_VALUE_SCRIPT__KEY_SCRIPT, oldKeyScript, keyScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueScript()
  {
    return valueScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueScript(String newValueScript)
  {
    String oldValueScript = valueScript;
    valueScript = newValueScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.KEY_VALUE_SCRIPT__VALUE_SCRIPT, oldValueScript, valueScript));
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
      case SearchPackage.KEY_VALUE_SCRIPT__KEY_SCRIPT:
        return getKeyScript();
      case SearchPackage.KEY_VALUE_SCRIPT__VALUE_SCRIPT:
        return getValueScript();
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
      case SearchPackage.KEY_VALUE_SCRIPT__KEY_SCRIPT:
        setKeyScript((String)newValue);
        return;
      case SearchPackage.KEY_VALUE_SCRIPT__VALUE_SCRIPT:
        setValueScript((String)newValue);
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
      case SearchPackage.KEY_VALUE_SCRIPT__KEY_SCRIPT:
        setKeyScript(KEY_SCRIPT_EDEFAULT);
        return;
      case SearchPackage.KEY_VALUE_SCRIPT__VALUE_SCRIPT:
        setValueScript(VALUE_SCRIPT_EDEFAULT);
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
      case SearchPackage.KEY_VALUE_SCRIPT__KEY_SCRIPT:
        return KEY_SCRIPT_EDEFAULT == null ? keyScript != null : !KEY_SCRIPT_EDEFAULT.equals(keyScript);
      case SearchPackage.KEY_VALUE_SCRIPT__VALUE_SCRIPT:
        return VALUE_SCRIPT_EDEFAULT == null ? valueScript != null : !VALUE_SCRIPT_EDEFAULT.equals(valueScript);
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
    result.append(" (keyScript: ");
    result.append(keyScript);
    result.append(", valueScript: ");
    result.append(valueScript);
    result.append(')');
    return result.toString();
  }

} //KeyValueScriptImpl
