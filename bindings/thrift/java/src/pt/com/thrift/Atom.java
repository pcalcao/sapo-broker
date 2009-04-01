/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class Atom implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Atom");
  private static final TField HEADER_FIELD_DESC = new TField("header", TType.STRUCT, (short)1);
  private static final TField ACTION_FIELD_DESC = new TField("action", TType.STRUCT, (short)2);

  public Header header;
  public static final int HEADER = 1;
  public Action action;
  public static final int ACTION = 2;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(HEADER, new FieldMetaData("header", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Header.class)));
    put(ACTION, new FieldMetaData("action", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Action.class)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Atom.class, metaDataMap);
  }

  public Atom() {
  }

  public Atom(
    Header header,
    Action action)
  {
    this();
    this.header = header;
    this.action = action;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Atom(Atom other) {
    if (other.isSetHeader()) {
      this.header = new Header(other.header);
    }
    if (other.isSetAction()) {
      this.action = new Action(other.action);
    }
  }

  @Override
  public Atom clone() {
    return new Atom(this);
  }

  public Header getHeader() {
    return this.header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public void unsetHeader() {
    this.header = null;
  }

  // Returns true if field header is set (has been asigned a value) and false otherwise
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public Action getAction() {
    return this.action;
  }

  public void setAction(Action action) {
    this.action = action;
  }

  public void unsetAction() {
    this.action = null;
  }

  // Returns true if field action is set (has been asigned a value) and false otherwise
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case HEADER:
      setHeader((Header)value);
      break;

    case ACTION:
      setAction((Action)value);
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HEADER:
      return getHeader();

    case ACTION:
      return getAction();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case HEADER:
      return isSetHeader();
    case ACTION:
      return isSetAction();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Atom)
      return this.equals((Atom)that);
    return false;
  }

  public boolean equals(Atom that) {
    if (that == null)
      return false;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case HEADER:
          if (field.type == TType.STRUCT) {
            this.header = new Header();
            this.header.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ACTION:
          if (field.type == TType.STRUCT) {
            this.action = new Action();
            this.action.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.header != null) {
      oprot.writeFieldBegin(HEADER_FIELD_DESC);
      this.header.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.action != null) {
      oprot.writeFieldBegin(ACTION_FIELD_DESC);
      this.action.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Atom(");
    boolean first = true;

    if (isSetHeader()) {
      sb.append("header:");
      if (this.header == null) {
        sb.append("null");
      } else {
        sb.append(this.header);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

