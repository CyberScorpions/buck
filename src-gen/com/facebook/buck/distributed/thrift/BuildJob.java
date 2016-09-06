/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-05")
public class BuildJob implements org.apache.thrift.TBase<BuildJob, BuildJob._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJob> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJob");

  private static final org.apache.thrift.protocol.TField BUILD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buildId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DEBUG_FIELD_DESC = new org.apache.thrift.protocol.TField("debug", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BUCK_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("buckVersion", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildJobStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildJobTupleSchemeFactory());
  }

  public BuildId buildId; // optional
  public DebugInfo debug; // optional
  /**
   * 
   * @see BuildStatus
   */
  public BuildStatus status; // optional
  public BuckVersion buckVersion; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUILD_ID((short)1, "buildId"),
    DEBUG((short)2, "debug"),
    /**
     * 
     * @see BuildStatus
     */
    STATUS((short)3, "status"),
    BUCK_VERSION((short)4, "buckVersion");

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
        case 1: // BUILD_ID
          return BUILD_ID;
        case 2: // DEBUG
          return DEBUG;
        case 3: // STATUS
          return STATUS;
        case 4: // BUCK_VERSION
          return BUCK_VERSION;
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
  private static final _Fields optionals[] = {_Fields.BUILD_ID,_Fields.DEBUG,_Fields.STATUS,_Fields.BUCK_VERSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUILD_ID, new org.apache.thrift.meta_data.FieldMetaData("buildId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildId.class)));
    tmpMap.put(_Fields.DEBUG, new org.apache.thrift.meta_data.FieldMetaData("debug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DebugInfo.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildStatus.class)));
    tmpMap.put(_Fields.BUCK_VERSION, new org.apache.thrift.meta_data.FieldMetaData("buckVersion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuckVersion.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJob.class, metaDataMap);
  }

  public BuildJob() {
    this.status = com.facebook.buck.distributed.thrift.BuildStatus.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJob(BuildJob other) {
    if (other.isSetBuildId()) {
      this.buildId = new BuildId(other.buildId);
    }
    if (other.isSetDebug()) {
      this.debug = new DebugInfo(other.debug);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetBuckVersion()) {
      this.buckVersion = new BuckVersion(other.buckVersion);
    }
  }

  public BuildJob deepCopy() {
    return new BuildJob(this);
  }

  @Override
  public void clear() {
    this.buildId = null;
    this.debug = null;
    this.status = com.facebook.buck.distributed.thrift.BuildStatus.UNKNOWN;

    this.buckVersion = null;
  }

  public BuildId getBuildId() {
    return this.buildId;
  }

  public BuildJob setBuildId(BuildId buildId) {
    this.buildId = buildId;
    return this;
  }

  public void unsetBuildId() {
    this.buildId = null;
  }

  /** Returns true if field buildId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildId() {
    return this.buildId != null;
  }

  public void setBuildIdIsSet(boolean value) {
    if (!value) {
      this.buildId = null;
    }
  }

  public DebugInfo getDebug() {
    return this.debug;
  }

  public BuildJob setDebug(DebugInfo debug) {
    this.debug = debug;
    return this;
  }

  public void unsetDebug() {
    this.debug = null;
  }

  /** Returns true if field debug is set (has been assigned a value) and false otherwise */
  public boolean isSetDebug() {
    return this.debug != null;
  }

  public void setDebugIsSet(boolean value) {
    if (!value) {
      this.debug = null;
    }
  }

  /**
   * 
   * @see BuildStatus
   */
  public BuildStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see BuildStatus
   */
  public BuildJob setStatus(BuildStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public BuckVersion getBuckVersion() {
    return this.buckVersion;
  }

  public BuildJob setBuckVersion(BuckVersion buckVersion) {
    this.buckVersion = buckVersion;
    return this;
  }

  public void unsetBuckVersion() {
    this.buckVersion = null;
  }

  /** Returns true if field buckVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetBuckVersion() {
    return this.buckVersion != null;
  }

  public void setBuckVersionIsSet(boolean value) {
    if (!value) {
      this.buckVersion = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUILD_ID:
      if (value == null) {
        unsetBuildId();
      } else {
        setBuildId((BuildId)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unsetDebug();
      } else {
        setDebug((DebugInfo)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((BuildStatus)value);
      }
      break;

    case BUCK_VERSION:
      if (value == null) {
        unsetBuckVersion();
      } else {
        setBuckVersion((BuckVersion)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUILD_ID:
      return getBuildId();

    case DEBUG:
      return getDebug();

    case STATUS:
      return getStatus();

    case BUCK_VERSION:
      return getBuckVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUILD_ID:
      return isSetBuildId();
    case DEBUG:
      return isSetDebug();
    case STATUS:
      return isSetStatus();
    case BUCK_VERSION:
      return isSetBuckVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJob)
      return this.equals((BuildJob)that);
    return false;
  }

  public boolean equals(BuildJob that) {
    if (that == null)
      return false;

    boolean this_present_buildId = true && this.isSetBuildId();
    boolean that_present_buildId = true && that.isSetBuildId();
    if (this_present_buildId || that_present_buildId) {
      if (!(this_present_buildId && that_present_buildId))
        return false;
      if (!this.buildId.equals(that.buildId))
        return false;
    }

    boolean this_present_debug = true && this.isSetDebug();
    boolean that_present_debug = true && that.isSetDebug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (!this.debug.equals(that.debug))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_buckVersion = true && this.isSetBuckVersion();
    boolean that_present_buckVersion = true && that.isSetBuckVersion();
    if (this_present_buckVersion || that_present_buckVersion) {
      if (!(this_present_buckVersion && that_present_buckVersion))
        return false;
      if (!this.buckVersion.equals(that.buckVersion))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_buildId = true && (isSetBuildId());
    list.add(present_buildId);
    if (present_buildId)
      list.add(buildId);

    boolean present_debug = true && (isSetDebug());
    list.add(present_debug);
    if (present_debug)
      list.add(debug);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_buckVersion = true && (isSetBuckVersion());
    list.add(present_buckVersion);
    if (present_buckVersion)
      list.add(buckVersion);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildJob other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBuildId()).compareTo(other.isSetBuildId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildId, other.buildId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDebug()).compareTo(other.isSetDebug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debug, other.debug);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuckVersion()).compareTo(other.isSetBuckVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuckVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buckVersion, other.buckVersion);
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
    StringBuilder sb = new StringBuilder("BuildJob(");
    boolean first = true;

    if (isSetBuildId()) {
      sb.append("buildId:");
      if (this.buildId == null) {
        sb.append("null");
      } else {
        sb.append(this.buildId);
      }
      first = false;
    }
    if (isSetDebug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      if (this.debug == null) {
        sb.append("null");
      } else {
        sb.append(this.debug);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetBuckVersion()) {
      if (!first) sb.append(", ");
      sb.append("buckVersion:");
      if (this.buckVersion == null) {
        sb.append("null");
      } else {
        sb.append(this.buckVersion);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buildId != null) {
      buildId.validate();
    }
    if (debug != null) {
      debug.validate();
    }
    if (buckVersion != null) {
      buckVersion.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildJobStandardSchemeFactory implements SchemeFactory {
    public BuildJobStandardScheme getScheme() {
      return new BuildJobStandardScheme();
    }
  }

  private static class BuildJobStandardScheme extends StandardScheme<BuildJob> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJob struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUILD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildId = new BuildId();
              struct.buildId.read(iprot);
              struct.setBuildIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEBUG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.debug = new DebugInfo();
              struct.debug.read(iprot);
              struct.setDebugIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.facebook.buck.distributed.thrift.BuildStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BUCK_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buckVersion = new BuckVersion();
              struct.buckVersion.read(iprot);
              struct.setBuckVersionIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJob struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buildId != null) {
        if (struct.isSetBuildId()) {
          oprot.writeFieldBegin(BUILD_ID_FIELD_DESC);
          struct.buildId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.debug != null) {
        if (struct.isSetDebug()) {
          oprot.writeFieldBegin(DEBUG_FIELD_DESC);
          struct.debug.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          oprot.writeI32(struct.status.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.buckVersion != null) {
        if (struct.isSetBuckVersion()) {
          oprot.writeFieldBegin(BUCK_VERSION_FIELD_DESC);
          struct.buckVersion.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobTupleSchemeFactory implements SchemeFactory {
    public BuildJobTupleScheme getScheme() {
      return new BuildJobTupleScheme();
    }
  }

  private static class BuildJobTupleScheme extends TupleScheme<BuildJob> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJob struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBuildId()) {
        optionals.set(0);
      }
      if (struct.isSetDebug()) {
        optionals.set(1);
      }
      if (struct.isSetStatus()) {
        optionals.set(2);
      }
      if (struct.isSetBuckVersion()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBuildId()) {
        struct.buildId.write(oprot);
      }
      if (struct.isSetDebug()) {
        struct.debug.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetBuckVersion()) {
        struct.buckVersion.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJob struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.buildId = new BuildId();
        struct.buildId.read(iprot);
        struct.setBuildIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.debug = new DebugInfo();
        struct.debug.read(iprot);
        struct.setDebugIsSet(true);
      }
      if (incoming.get(2)) {
        struct.status = com.facebook.buck.distributed.thrift.BuildStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.buckVersion = new BuckVersion();
        struct.buckVersion.read(iprot);
        struct.setBuckVersionIsSet(true);
      }
    }
  }

}

