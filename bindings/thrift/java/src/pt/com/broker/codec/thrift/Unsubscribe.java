/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.broker.codec.thrift;

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

public class Unsubscribe implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Unsubscribe");
  private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", TType.STRING, (short)1);
  private static final TField DESTINATION_FIELD_DESC = new TField("destination", TType.STRING, (short)2);
  private static final TField DESTINATION_TYPE_FIELD_DESC = new TField("destination_type", TType.I32, (short)3);

  public String action_id;
  public static final int ACTION_ID = 1;
  public String destination;
  public static final int DESTINATION = 2;
  public int destination_type;
  public static final int DESTINATION_TYPE = 3;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean destination_type = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(ACTION_ID, new FieldMetaData("action_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(DESTINATION, new FieldMetaData("destination", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(DESTINATION_TYPE, new FieldMetaData("destination_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Unsubscribe.class, metaDataMap);
  }

  public Unsubscribe() {
  }

  public Unsubscribe(
    String action_id,
    String destination,
    int destination_type)
  {
    this();
    this.action_id = action_id;
    this.destination = destination;
    this.destination_type = destination_type;
    this.__isset.destination_type = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Unsubscribe(Unsubscribe other) {
    if (other.isSetAction_id()) {
      this.action_id = other.action_id;
    }
    if (other.isSetDestination()) {
      this.destination = other.destination;
    }
    __isset.destination_type = other.__isset.destination_type;
    this.destination_type = other.destination_type;
  }

  @Override
  public Unsubscribe clone() {
    return new Unsubscribe(this);
  }

  public String getAction_id() {
    return this.action_id;
  }

  public void setAction_id(String action_id) {
    this.action_id = action_id;
  }

  public void unsetAction_id() {
    this.action_id = null;
  }

  // Returns true if field action_id is set (has been asigned a value) and false otherwise
  public boolean isSetAction_id() {
    return this.action_id != null;
  }

  public void setAction_idIsSet(boolean value) {
    if (!value) {
      this.action_id = null;
    }
  }

  public String getDestination() {
    return this.destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void unsetDestination() {
    this.destination = null;
  }

  // Returns true if field destination is set (has been asigned a value) and false otherwise
  public boolean isSetDestination() {
    return this.destination != null;
  }

  public void setDestinationIsSet(boolean value) {
    if (!value) {
      this.destination = null;
    }
  }

  public int getDestination_type() {
    return this.destination_type;
  }

  public void setDestination_type(int destination_type) {
    this.destination_type = destination_type;
    this.__isset.destination_type = true;
  }

  public void unsetDestination_type() {
    this.__isset.destination_type = false;
  }

  // Returns true if field destination_type is set (has been asigned a value) and false otherwise
  public boolean isSetDestination_type() {
    return this.__isset.destination_type;
  }

  public void setDestination_typeIsSet(boolean value) {
    this.__isset.destination_type = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ACTION_ID:
      if (value == null) {
        unsetAction_id();
      } else {
        setAction_id((String)value);
      }
      break;

    case DESTINATION:
      if (value == null) {
        unsetDestination();
      } else {
        setDestination((String)value);
      }
      break;

    case DESTINATION_TYPE:
      if (value == null) {
        unsetDestination_type();
      } else {
        setDestination_type((Integer)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ACTION_ID:
      return getAction_id();

    case DESTINATION:
      return getDestination();

    case DESTINATION_TYPE:
      return getDestination_type();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ACTION_ID:
      return isSetAction_id();
    case DESTINATION:
      return isSetDestination();
    case DESTINATION_TYPE:
      return isSetDestination_type();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Unsubscribe)
      return this.equals((Unsubscribe)that);
    return false;
  }

  public boolean equals(Unsubscribe that) {
    if (that == null)
      return false;

    boolean this_present_action_id = true && this.isSetAction_id();
    boolean that_present_action_id = true && that.isSetAction_id();
    if (this_present_action_id || that_present_action_id) {
      if (!(this_present_action_id && that_present_action_id))
        return false;
      if (!this.action_id.equals(that.action_id))
        return false;
    }

    boolean this_present_destination = true && this.isSetDestination();
    boolean that_present_destination = true && that.isSetDestination();
    if (this_present_destination || that_present_destination) {
      if (!(this_present_destination && that_present_destination))
        return false;
      if (!this.destination.equals(that.destination))
        return false;
    }

    boolean this_present_destination_type = true;
    boolean that_present_destination_type = true;
    if (this_present_destination_type || that_present_destination_type) {
      if (!(this_present_destination_type && that_present_destination_type))
        return false;
      if (this.destination_type != that.destination_type)
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
        case ACTION_ID:
          if (field.type == TType.STRING) {
            this.action_id = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DESTINATION:
          if (field.type == TType.STRING) {
            this.destination = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DESTINATION_TYPE:
          if (field.type == TType.I32) {
            this.destination_type = iprot.readI32();
            this.__isset.destination_type = true;
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
    if (this.action_id != null) {
      oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
      oprot.writeString(this.action_id);
      oprot.writeFieldEnd();
    }
    if (this.destination != null) {
      oprot.writeFieldBegin(DESTINATION_FIELD_DESC);
      oprot.writeString(this.destination);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(DESTINATION_TYPE_FIELD_DESC);
    oprot.writeI32(this.destination_type);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Unsubscribe(");
    boolean first = true;

    if (isSetAction_id()) {
      sb.append("action_id:");
      if (this.action_id == null) {
        sb.append("null");
      } else {
        sb.append(this.action_id);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("destination:");
    if (this.destination == null) {
      sb.append("null");
    } else {
      sb.append(this.destination);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("destination_type:");
    String destination_type_name = DestinationType.VALUES_TO_NAMES.get(this.destination_type);
    if (destination_type_name != null) {
      sb.append(destination_type_name);
      sb.append(" (");
    }
    sb.append(this.destination_type);
    if (destination_type_name != null) {
      sb.append(")");
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetDestination_type() && !DestinationType.VALID_VALUES.contains(destination_type)){
      throw new TProtocolException("The field 'destination_type' has been assigned the invalid value " + destination_type);
    }
  }

}

