/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.hypertable.thriftgen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Specifies a serialized result object for asynchronous requests.
 * TODO: add support for update results
 * 
 * <dl>
 *   <dt>is_empty</dt>
 *   <dd>Indicates whether this object contains a result or not</dd>
 * 
 *   <dt>id</dt>
 *   <dd>Scanner/mutator id for which these results pertain to</dd>
 *   
 *   <dt>is_scan</dt>
 *   <dd>Indicates whether these are scan results or update results</dd>
 *   
 *   <dt>is_error</dt>
 *   <dd>Indicates whether the async request was successful or not</dd>
 *   
 *   <dt>error</dt>
 *   <dd>Error code</dd>
 * 
 *   <dt>error_msg</dt>
 *   <dd>Error message</dd>
 * 
 *   <dt>cells</dt>
 *   <dd>Cells returned by asynchronous scanner</dd>
 * </dl>
 */
public class ResultSerialized implements org.apache.thrift.TBase<ResultSerialized, ResultSerialized._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResultSerialized");

  private static final org.apache.thrift.protocol.TField IS_EMPTY_FIELD_DESC = new org.apache.thrift.protocol.TField("is_empty", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField IS_SCAN_FIELD_DESC = new org.apache.thrift.protocol.TField("is_scan", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField IS_ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("is_error", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField ERROR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("error_msg", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField CELLS_FIELD_DESC = new org.apache.thrift.protocol.TField("cells", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultSerializedStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultSerializedTupleSchemeFactory());
  }

  public boolean is_empty; // required
  public long id; // required
  public boolean is_scan; // required
  public boolean is_error; // required
  public int error; // optional
  public String error_msg; // optional
  public ByteBuffer cells; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_EMPTY((short)1, "is_empty"),
    ID((short)2, "id"),
    IS_SCAN((short)3, "is_scan"),
    IS_ERROR((short)4, "is_error"),
    ERROR((short)5, "error"),
    ERROR_MSG((short)6, "error_msg"),
    CELLS((short)7, "cells");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IS_EMPTY
          return IS_EMPTY;
        case 2: // ID
          return ID;
        case 3: // IS_SCAN
          return IS_SCAN;
        case 4: // IS_ERROR
          return IS_ERROR;
        case 5: // ERROR
          return ERROR;
        case 6: // ERROR_MSG
          return ERROR_MSG;
        case 7: // CELLS
          return CELLS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IS_EMPTY_ISSET_ID = 0;
  private static final int __ID_ISSET_ID = 1;
  private static final int __IS_SCAN_ISSET_ID = 2;
  private static final int __IS_ERROR_ISSET_ID = 3;
  private static final int __ERROR_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);
  private _Fields optionals[] = {_Fields.ERROR,_Fields.ERROR_MSG,_Fields.CELLS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_EMPTY, new org.apache.thrift.meta_data.FieldMetaData("is_empty", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_SCAN, new org.apache.thrift.meta_data.FieldMetaData("is_scan", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_ERROR, new org.apache.thrift.meta_data.FieldMetaData("is_error", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERROR_MSG, new org.apache.thrift.meta_data.FieldMetaData("error_msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CELLS, new org.apache.thrift.meta_data.FieldMetaData("cells", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "CellsSerialized")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultSerialized.class, metaDataMap);
  }

  public ResultSerialized() {
  }

  public ResultSerialized(
    boolean is_empty,
    long id,
    boolean is_scan,
    boolean is_error)
  {
    this();
    this.is_empty = is_empty;
    setIs_emptyIsSet(true);
    this.id = id;
    setIdIsSet(true);
    this.is_scan = is_scan;
    setIs_scanIsSet(true);
    this.is_error = is_error;
    setIs_errorIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResultSerialized(ResultSerialized other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.is_empty = other.is_empty;
    this.id = other.id;
    this.is_scan = other.is_scan;
    this.is_error = other.is_error;
    this.error = other.error;
    if (other.isSetError_msg()) {
      this.error_msg = other.error_msg;
    }
    if (other.isSetCells()) {
      this.cells = other.cells;
    }
  }

  public ResultSerialized deepCopy() {
    return new ResultSerialized(this);
  }

  @Override
  public void clear() {
    setIs_emptyIsSet(false);
    this.is_empty = false;
    setIdIsSet(false);
    this.id = 0;
    setIs_scanIsSet(false);
    this.is_scan = false;
    setIs_errorIsSet(false);
    this.is_error = false;
    setErrorIsSet(false);
    this.error = 0;
    this.error_msg = null;
    this.cells = null;
  }

  public boolean isIs_empty() {
    return this.is_empty;
  }

  public ResultSerialized setIs_empty(boolean is_empty) {
    this.is_empty = is_empty;
    setIs_emptyIsSet(true);
    return this;
  }

  public void unsetIs_empty() {
    __isset_bit_vector.clear(__IS_EMPTY_ISSET_ID);
  }

  /** Returns true if field is_empty is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_empty() {
    return __isset_bit_vector.get(__IS_EMPTY_ISSET_ID);
  }

  public void setIs_emptyIsSet(boolean value) {
    __isset_bit_vector.set(__IS_EMPTY_ISSET_ID, value);
  }

  public long getId() {
    return this.id;
  }

  public ResultSerialized setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public boolean isIs_scan() {
    return this.is_scan;
  }

  public ResultSerialized setIs_scan(boolean is_scan) {
    this.is_scan = is_scan;
    setIs_scanIsSet(true);
    return this;
  }

  public void unsetIs_scan() {
    __isset_bit_vector.clear(__IS_SCAN_ISSET_ID);
  }

  /** Returns true if field is_scan is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_scan() {
    return __isset_bit_vector.get(__IS_SCAN_ISSET_ID);
  }

  public void setIs_scanIsSet(boolean value) {
    __isset_bit_vector.set(__IS_SCAN_ISSET_ID, value);
  }

  public boolean isIs_error() {
    return this.is_error;
  }

  public ResultSerialized setIs_error(boolean is_error) {
    this.is_error = is_error;
    setIs_errorIsSet(true);
    return this;
  }

  public void unsetIs_error() {
    __isset_bit_vector.clear(__IS_ERROR_ISSET_ID);
  }

  /** Returns true if field is_error is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_error() {
    return __isset_bit_vector.get(__IS_ERROR_ISSET_ID);
  }

  public void setIs_errorIsSet(boolean value) {
    __isset_bit_vector.set(__IS_ERROR_ISSET_ID, value);
  }

  public int getError() {
    return this.error;
  }

  public ResultSerialized setError(int error) {
    this.error = error;
    setErrorIsSet(true);
    return this;
  }

  public void unsetError() {
    __isset_bit_vector.clear(__ERROR_ISSET_ID);
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return __isset_bit_vector.get(__ERROR_ISSET_ID);
  }

  public void setErrorIsSet(boolean value) {
    __isset_bit_vector.set(__ERROR_ISSET_ID, value);
  }

  public String getError_msg() {
    return this.error_msg;
  }

  public ResultSerialized setError_msg(String error_msg) {
    this.error_msg = error_msg;
    return this;
  }

  public void unsetError_msg() {
    this.error_msg = null;
  }

  /** Returns true if field error_msg is set (has been assigned a value) and false otherwise */
  public boolean isSetError_msg() {
    return this.error_msg != null;
  }

  public void setError_msgIsSet(boolean value) {
    if (!value) {
      this.error_msg = null;
    }
  }

  public byte[] getCells() {
    setCells(org.apache.thrift.TBaseHelper.rightSize(cells));
    return cells == null ? null : cells.array();
  }

  public ByteBuffer bufferForCells() {
    return cells;
  }

  public ResultSerialized setCells(byte[] cells) {
    setCells(cells == null ? (ByteBuffer)null : ByteBuffer.wrap(cells));
    return this;
  }

  public ResultSerialized setCells(ByteBuffer cells) {
    this.cells = cells;
    return this;
  }

  public void unsetCells() {
    this.cells = null;
  }

  /** Returns true if field cells is set (has been assigned a value) and false otherwise */
  public boolean isSetCells() {
    return this.cells != null;
  }

  public void setCellsIsSet(boolean value) {
    if (!value) {
      this.cells = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_EMPTY:
      if (value == null) {
        unsetIs_empty();
      } else {
        setIs_empty((Boolean)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case IS_SCAN:
      if (value == null) {
        unsetIs_scan();
      } else {
        setIs_scan((Boolean)value);
      }
      break;

    case IS_ERROR:
      if (value == null) {
        unsetIs_error();
      } else {
        setIs_error((Boolean)value);
      }
      break;

    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((Integer)value);
      }
      break;

    case ERROR_MSG:
      if (value == null) {
        unsetError_msg();
      } else {
        setError_msg((String)value);
      }
      break;

    case CELLS:
      if (value == null) {
        unsetCells();
      } else {
        setCells((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_EMPTY:
      return Boolean.valueOf(isIs_empty());

    case ID:
      return Long.valueOf(getId());

    case IS_SCAN:
      return Boolean.valueOf(isIs_scan());

    case IS_ERROR:
      return Boolean.valueOf(isIs_error());

    case ERROR:
      return Integer.valueOf(getError());

    case ERROR_MSG:
      return getError_msg();

    case CELLS:
      return getCells();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_EMPTY:
      return isSetIs_empty();
    case ID:
      return isSetId();
    case IS_SCAN:
      return isSetIs_scan();
    case IS_ERROR:
      return isSetIs_error();
    case ERROR:
      return isSetError();
    case ERROR_MSG:
      return isSetError_msg();
    case CELLS:
      return isSetCells();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResultSerialized)
      return this.equals((ResultSerialized)that);
    return false;
  }

  public boolean equals(ResultSerialized that) {
    if (that == null)
      return false;

    boolean this_present_is_empty = true;
    boolean that_present_is_empty = true;
    if (this_present_is_empty || that_present_is_empty) {
      if (!(this_present_is_empty && that_present_is_empty))
        return false;
      if (this.is_empty != that.is_empty)
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_is_scan = true;
    boolean that_present_is_scan = true;
    if (this_present_is_scan || that_present_is_scan) {
      if (!(this_present_is_scan && that_present_is_scan))
        return false;
      if (this.is_scan != that.is_scan)
        return false;
    }

    boolean this_present_is_error = true;
    boolean that_present_is_error = true;
    if (this_present_is_error || that_present_is_error) {
      if (!(this_present_is_error && that_present_is_error))
        return false;
      if (this.is_error != that.is_error)
        return false;
    }

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (this.error != that.error)
        return false;
    }

    boolean this_present_error_msg = true && this.isSetError_msg();
    boolean that_present_error_msg = true && that.isSetError_msg();
    if (this_present_error_msg || that_present_error_msg) {
      if (!(this_present_error_msg && that_present_error_msg))
        return false;
      if (!this.error_msg.equals(that.error_msg))
        return false;
    }

    boolean this_present_cells = true && this.isSetCells();
    boolean that_present_cells = true && that.isSetCells();
    if (this_present_cells || that_present_cells) {
      if (!(this_present_cells && that_present_cells))
        return false;
      if (!this.cells.equals(that.cells))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ResultSerialized other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ResultSerialized typedOther = (ResultSerialized)other;

    lastComparison = Boolean.valueOf(isSetIs_empty()).compareTo(typedOther.isSetIs_empty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_empty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_empty, typedOther.is_empty);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_scan()).compareTo(typedOther.isSetIs_scan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_scan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_scan, typedOther.is_scan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_error()).compareTo(typedOther.isSetIs_error());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_error()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_error, typedOther.is_error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError()).compareTo(typedOther.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, typedOther.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError_msg()).compareTo(typedOther.isSetError_msg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_msg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_msg, typedOther.error_msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCells()).compareTo(typedOther.isSetCells());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCells()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cells, typedOther.cells);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ResultSerialized(");
    boolean first = true;

    sb.append("is_empty:");
    sb.append(this.is_empty);
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_scan:");
    sb.append(this.is_scan);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_error:");
    sb.append(this.is_error);
    first = false;
    if (isSetError()) {
      if (!first) sb.append(", ");
      sb.append("error:");
      sb.append(this.error);
      first = false;
    }
    if (isSetError_msg()) {
      if (!first) sb.append(", ");
      sb.append("error_msg:");
      if (this.error_msg == null) {
        sb.append("null");
      } else {
        sb.append(this.error_msg);
      }
      first = false;
    }
    if (isSetCells()) {
      if (!first) sb.append(", ");
      sb.append("cells:");
      if (this.cells == null) {
        sb.append("null");
      } else {
        sb.append(this.cells);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_empty' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'is_scan' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'is_error' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResultSerializedStandardSchemeFactory implements SchemeFactory {
    public ResultSerializedStandardScheme getScheme() {
      return new ResultSerializedStandardScheme();
    }
  }

  private static class ResultSerializedStandardScheme extends StandardScheme<ResultSerialized> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResultSerialized struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_EMPTY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_empty = iprot.readBool();
              struct.setIs_emptyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_SCAN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_scan = iprot.readBool();
              struct.setIs_scanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_error = iprot.readBool();
              struct.setIs_errorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.error = iprot.readI32();
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ERROR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error_msg = iprot.readString();
              struct.setError_msgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CELLS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cells = iprot.readBinary();
              struct.setCellsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIs_empty()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_empty' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetIs_scan()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_scan' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetIs_error()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_error' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResultSerialized struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_EMPTY_FIELD_DESC);
      oprot.writeBool(struct.is_empty);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_SCAN_FIELD_DESC);
      oprot.writeBool(struct.is_scan);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_ERROR_FIELD_DESC);
      oprot.writeBool(struct.is_error);
      oprot.writeFieldEnd();
      if (struct.isSetError()) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        oprot.writeI32(struct.error);
        oprot.writeFieldEnd();
      }
      if (struct.error_msg != null) {
        if (struct.isSetError_msg()) {
          oprot.writeFieldBegin(ERROR_MSG_FIELD_DESC);
          oprot.writeString(struct.error_msg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cells != null) {
        if (struct.isSetCells()) {
          oprot.writeFieldBegin(CELLS_FIELD_DESC);
          oprot.writeBinary(struct.cells);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultSerializedTupleSchemeFactory implements SchemeFactory {
    public ResultSerializedTupleScheme getScheme() {
      return new ResultSerializedTupleScheme();
    }
  }

  private static class ResultSerializedTupleScheme extends TupleScheme<ResultSerialized> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResultSerialized struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_empty);
      oprot.writeI64(struct.id);
      oprot.writeBool(struct.is_scan);
      oprot.writeBool(struct.is_error);
      BitSet optionals = new BitSet();
      if (struct.isSetError()) {
        optionals.set(0);
      }
      if (struct.isSetError_msg()) {
        optionals.set(1);
      }
      if (struct.isSetCells()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetError()) {
        oprot.writeI32(struct.error);
      }
      if (struct.isSetError_msg()) {
        oprot.writeString(struct.error_msg);
      }
      if (struct.isSetCells()) {
        oprot.writeBinary(struct.cells);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResultSerialized struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_empty = iprot.readBool();
      struct.setIs_emptyIsSet(true);
      struct.id = iprot.readI64();
      struct.setIdIsSet(true);
      struct.is_scan = iprot.readBool();
      struct.setIs_scanIsSet(true);
      struct.is_error = iprot.readBool();
      struct.setIs_errorIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.error = iprot.readI32();
        struct.setErrorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_msg = iprot.readString();
        struct.setError_msgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cells = iprot.readBinary();
        struct.setCellsIsSet(true);
      }
    }
  }

}

