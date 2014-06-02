/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.AllTermsParam;
import com.first8.elasticsearch.dsl.search.ExcludeParam;
import com.first8.elasticsearch.dsl.search.ScriptFieldParam;
import com.first8.elasticsearch.dsl.search.ScriptParam;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.TermsFacetParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terms Facet Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getField <em>Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getAllTerms <em>All Terms</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getRegexFlags <em>Regex Flags</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl#getScriptField <em>Script Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermsFacetParameterImpl extends MinimalEObjectImpl.Container implements TermsFacetParameter
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
   * The default value of the '{@link #getFields() <em>Fields</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected static final String FIELDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected String fields = FIELDS_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final String ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected String order = ORDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getAllTerms() <em>All Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllTerms()
   * @generated
   * @ordered
   */
  protected AllTermsParam allTerms;

  /**
   * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclude()
   * @generated
   * @ordered
   */
  protected ExcludeParam exclude;

  /**
   * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegex()
   * @generated
   * @ordered
   */
  protected static final String REGEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegex()
   * @generated
   * @ordered
   */
  protected String regex = REGEX_EDEFAULT;

  /**
   * The default value of the '{@link #getRegexFlags() <em>Regex Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegexFlags()
   * @generated
   * @ordered
   */
  protected static final String REGEX_FLAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegexFlags() <em>Regex Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegexFlags()
   * @generated
   * @ordered
   */
  protected String regexFlags = REGEX_FLAGS_EDEFAULT;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected ScriptParam script;

  /**
   * The cached value of the '{@link #getScriptField() <em>Script Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptField()
   * @generated
   * @ordered
   */
  protected ScriptFieldParam scriptField;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermsFacetParameterImpl()
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
    return SearchPackage.eINSTANCE.getTermsFacetParameter();
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
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFields()
  {
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(String newFields)
  {
    String oldFields = fields;
    fields = newFields;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__FIELDS, oldFields, fields));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(String newOrder)
  {
    String oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__ORDER, oldOrder, order));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllTermsParam getAllTerms()
  {
    return allTerms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAllTerms(AllTermsParam newAllTerms, NotificationChain msgs)
  {
    AllTermsParam oldAllTerms = allTerms;
    allTerms = newAllTerms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS, oldAllTerms, newAllTerms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllTerms(AllTermsParam newAllTerms)
  {
    if (newAllTerms != allTerms)
    {
      NotificationChain msgs = null;
      if (allTerms != null)
        msgs = ((InternalEObject)allTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS, null, msgs);
      if (newAllTerms != null)
        msgs = ((InternalEObject)newAllTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS, null, msgs);
      msgs = basicSetAllTerms(newAllTerms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS, newAllTerms, newAllTerms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcludeParam getExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExclude(ExcludeParam newExclude, NotificationChain msgs)
  {
    ExcludeParam oldExclude = exclude;
    exclude = newExclude;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE, oldExclude, newExclude);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclude(ExcludeParam newExclude)
  {
    if (newExclude != exclude)
    {
      NotificationChain msgs = null;
      if (exclude != null)
        msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE, null, msgs);
      if (newExclude != null)
        msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE, null, msgs);
      msgs = basicSetExclude(newExclude, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE, newExclude, newExclude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegex()
  {
    return regex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegex(String newRegex)
  {
    String oldRegex = regex;
    regex = newRegex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__REGEX, oldRegex, regex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegexFlags()
  {
    return regexFlags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegexFlags(String newRegexFlags)
  {
    String oldRegexFlags = regexFlags;
    regexFlags = newRegexFlags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__REGEX_FLAGS, oldRegexFlags, regexFlags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptParam getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScript(ScriptParam newScript, NotificationChain msgs)
  {
    ScriptParam oldScript = script;
    script = newScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__SCRIPT, oldScript, newScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(ScriptParam newScript)
  {
    if (newScript != script)
    {
      NotificationChain msgs = null;
      if (script != null)
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__SCRIPT, newScript, newScript));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptFieldParam getScriptField()
  {
    return scriptField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScriptField(ScriptFieldParam newScriptField, NotificationChain msgs)
  {
    ScriptFieldParam oldScriptField = scriptField;
    scriptField = newScriptField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD, oldScriptField, newScriptField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptField(ScriptFieldParam newScriptField)
  {
    if (newScriptField != scriptField)
    {
      NotificationChain msgs = null;
      if (scriptField != null)
        msgs = ((InternalEObject)scriptField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD, null, msgs);
      if (newScriptField != null)
        msgs = ((InternalEObject)newScriptField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD, null, msgs);
      msgs = basicSetScriptField(newScriptField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD, newScriptField, newScriptField));
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
      case SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS:
        return basicSetAllTerms(null, msgs);
      case SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE:
        return basicSetExclude(null, msgs);
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT:
        return basicSetScript(null, msgs);
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD:
        return basicSetScriptField(null, msgs);
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
      case SearchPackage.TERMS_FACET_PARAMETER__FIELD:
        return getField();
      case SearchPackage.TERMS_FACET_PARAMETER__FIELDS:
        return getFields();
      case SearchPackage.TERMS_FACET_PARAMETER__SIZE:
        return getSize();
      case SearchPackage.TERMS_FACET_PARAMETER__ORDER:
        return getOrder();
      case SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS:
        return getAllTerms();
      case SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE:
        return getExclude();
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX:
        return getRegex();
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX_FLAGS:
        return getRegexFlags();
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT:
        return getScript();
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD:
        return getScriptField();
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
      case SearchPackage.TERMS_FACET_PARAMETER__FIELD:
        setField((String)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__FIELDS:
        setFields((String)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__SIZE:
        setSize((String)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__ORDER:
        setOrder((String)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS:
        setAllTerms((AllTermsParam)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE:
        setExclude((ExcludeParam)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX:
        setRegex((String)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX_FLAGS:
        setRegexFlags((String)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT:
        setScript((ScriptParam)newValue);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD:
        setScriptField((ScriptFieldParam)newValue);
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
      case SearchPackage.TERMS_FACET_PARAMETER__FIELD:
        setField(FIELD_EDEFAULT);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__FIELDS:
        setFields(FIELDS_EDEFAULT);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__ORDER:
        setOrder(ORDER_EDEFAULT);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS:
        setAllTerms((AllTermsParam)null);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE:
        setExclude((ExcludeParam)null);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX:
        setRegex(REGEX_EDEFAULT);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX_FLAGS:
        setRegexFlags(REGEX_FLAGS_EDEFAULT);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT:
        setScript((ScriptParam)null);
        return;
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD:
        setScriptField((ScriptFieldParam)null);
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
      case SearchPackage.TERMS_FACET_PARAMETER__FIELD:
        return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
      case SearchPackage.TERMS_FACET_PARAMETER__FIELDS:
        return FIELDS_EDEFAULT == null ? fields != null : !FIELDS_EDEFAULT.equals(fields);
      case SearchPackage.TERMS_FACET_PARAMETER__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case SearchPackage.TERMS_FACET_PARAMETER__ORDER:
        return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
      case SearchPackage.TERMS_FACET_PARAMETER__ALL_TERMS:
        return allTerms != null;
      case SearchPackage.TERMS_FACET_PARAMETER__EXCLUDE:
        return exclude != null;
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX:
        return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
      case SearchPackage.TERMS_FACET_PARAMETER__REGEX_FLAGS:
        return REGEX_FLAGS_EDEFAULT == null ? regexFlags != null : !REGEX_FLAGS_EDEFAULT.equals(regexFlags);
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT:
        return script != null;
      case SearchPackage.TERMS_FACET_PARAMETER__SCRIPT_FIELD:
        return scriptField != null;
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
    result.append(", fields: ");
    result.append(fields);
    result.append(", size: ");
    result.append(size);
    result.append(", order: ");
    result.append(order);
    result.append(", regex: ");
    result.append(regex);
    result.append(", regexFlags: ");
    result.append(regexFlags);
    result.append(')');
    return result.toString();
  }

} //TermsFacetParameterImpl
