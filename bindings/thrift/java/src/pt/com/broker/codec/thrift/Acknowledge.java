/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.broker.codec.thrift;

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

class Acknowledge implements org.apache.thrift.TBase<Acknowledge, Acknowledge._Fields>, java.io.Serializable, Cloneable
{
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Acknowledge");

	private static final org.apache.thrift.protocol.TField ACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("action_id", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("message_id", org.apache.thrift.protocol.TType.STRING, (short) 2);
	private static final org.apache.thrift.protocol.TField DESTINATION_FIELD_DESC = new org.apache.thrift.protocol.TField("destination", org.apache.thrift.protocol.TType.STRING, (short) 3);

	public String action_id;
	public String message_id;
	public String destination;

	/** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum
	{
		ACTION_ID((short) 1, "action_id"), MESSAGE_ID((short) 2, "message_id"), DESTINATION((short) 3, "destination");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static
		{
			for (_Fields field : EnumSet.allOf(_Fields.class))
			{
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not found.
		 */
		public static _Fields findByThriftId(int fieldId)
		{
			switch (fieldId)
			{
			case 1: // ACTION_ID
				return ACTION_ID;
			case 2: // MESSAGE_ID
				return MESSAGE_ID;
			case 3: // DESTINATION
				return DESTINATION;
			default:
				return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId)
		{
			_Fields fields = findByThriftId(fieldId);
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not found.
		 */
		public static _Fields findByName(String name)
		{
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName)
		{
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId()
		{
			return _thriftId;
		}

		public String getFieldName()
		{
			return _fieldName;
		}
	}

	// isset id assignments

	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static
	{
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
		tmpMap.put(_Fields.ACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("action_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("message_id", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.DESTINATION, new org.apache.thrift.meta_data.FieldMetaData("destination", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Acknowledge.class, metaDataMap);
	}

	public Acknowledge()
	{
	}

	public Acknowledge(String message_id, String destination)
	{
		this();
		this.message_id = message_id;
		this.destination = destination;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Acknowledge(Acknowledge other)
	{
		if (other.isSetAction_id())
		{
			this.action_id = other.action_id;
		}
		if (other.isSetMessage_id())
		{
			this.message_id = other.message_id;
		}
		if (other.isSetDestination())
		{
			this.destination = other.destination;
		}
	}

	public Acknowledge deepCopy()
	{
		return new Acknowledge(this);
	}

	@Override
	public void clear()
	{
		this.action_id = null;
		this.message_id = null;
		this.destination = null;
	}

	public String getAction_id()
	{
		return this.action_id;
	}

	public Acknowledge setAction_id(String action_id)
	{
		this.action_id = action_id;
		return this;
	}

	public void unsetAction_id()
	{
		this.action_id = null;
	}

	/** Returns true if field action_id is set (has been assigned a value) and false otherwise */
	public boolean isSetAction_id()
	{
		return this.action_id != null;
	}

	public void setAction_idIsSet(boolean value)
	{
		if (!value)
		{
			this.action_id = null;
		}
	}

	public String getMessage_id()
	{
		return this.message_id;
	}

	public Acknowledge setMessage_id(String message_id)
	{
		this.message_id = message_id;
		return this;
	}

	public void unsetMessage_id()
	{
		this.message_id = null;
	}

	/** Returns true if field message_id is set (has been assigned a value) and false otherwise */
	public boolean isSetMessage_id()
	{
		return this.message_id != null;
	}

	public void setMessage_idIsSet(boolean value)
	{
		if (!value)
		{
			this.message_id = null;
		}
	}

	public String getDestination()
	{
		return this.destination;
	}

	public Acknowledge setDestination(String destination)
	{
		this.destination = destination;
		return this;
	}

	public void unsetDestination()
	{
		this.destination = null;
	}

	/** Returns true if field destination is set (has been assigned a value) and false otherwise */
	public boolean isSetDestination()
	{
		return this.destination != null;
	}

	public void setDestinationIsSet(boolean value)
	{
		if (!value)
		{
			this.destination = null;
		}
	}

	public void setFieldValue(_Fields field, Object value)
	{
		switch (field)
		{
		case ACTION_ID:
			if (value == null)
			{
				unsetAction_id();
			}
			else
			{
				setAction_id((String) value);
			}
			break;

		case MESSAGE_ID:
			if (value == null)
			{
				unsetMessage_id();
			}
			else
			{
				setMessage_id((String) value);
			}
			break;

		case DESTINATION:
			if (value == null)
			{
				unsetDestination();
			}
			else
			{
				setDestination((String) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field)
	{
		switch (field)
		{
		case ACTION_ID:
			return getAction_id();

		case MESSAGE_ID:
			return getMessage_id();

		case DESTINATION:
			return getDestination();

		}
		throw new IllegalStateException();
	}

	/** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
	public boolean isSet(_Fields field)
	{
		if (field == null)
		{
			throw new IllegalArgumentException();
		}

		switch (field)
		{
		case ACTION_ID:
			return isSetAction_id();
		case MESSAGE_ID:
			return isSetMessage_id();
		case DESTINATION:
			return isSetDestination();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that)
	{
		if (that == null)
			return false;
		if (that instanceof Acknowledge)
			return this.equals((Acknowledge) that);
		return false;
	}

	public boolean equals(Acknowledge that)
	{
		if (that == null)
			return false;

		boolean this_present_action_id = true && this.isSetAction_id();
		boolean that_present_action_id = true && that.isSetAction_id();
		if (this_present_action_id || that_present_action_id)
		{
			if (!(this_present_action_id && that_present_action_id))
				return false;
			if (!this.action_id.equals(that.action_id))
				return false;
		}

		boolean this_present_message_id = true && this.isSetMessage_id();
		boolean that_present_message_id = true && that.isSetMessage_id();
		if (this_present_message_id || that_present_message_id)
		{
			if (!(this_present_message_id && that_present_message_id))
				return false;
			if (!this.message_id.equals(that.message_id))
				return false;
		}

		boolean this_present_destination = true && this.isSetDestination();
		boolean that_present_destination = true && that.isSetDestination();
		if (this_present_destination || that_present_destination)
		{
			if (!(this_present_destination && that_present_destination))
				return false;
			if (!this.destination.equals(that.destination))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		return 0;
	}

	public int compareTo(Acknowledge other)
	{
		if (!getClass().equals(other.getClass()))
		{
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;
		Acknowledge typedOther = (Acknowledge) other;

		lastComparison = Boolean.valueOf(isSetAction_id()).compareTo(typedOther.isSetAction_id());
		if (lastComparison != 0)
		{
			return lastComparison;
		}
		if (isSetAction_id())
		{
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_id, typedOther.action_id);
			if (lastComparison != 0)
			{
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetMessage_id()).compareTo(typedOther.isSetMessage_id());
		if (lastComparison != 0)
		{
			return lastComparison;
		}
		if (isSetMessage_id())
		{
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message_id, typedOther.message_id);
			if (lastComparison != 0)
			{
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetDestination()).compareTo(typedOther.isSetDestination());
		if (lastComparison != 0)
		{
			return lastComparison;
		}
		if (isSetDestination())
		{
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destination, typedOther.destination);
			if (lastComparison != 0)
			{
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId)
	{
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException
	{
		org.apache.thrift.protocol.TField field;
		iprot.readStructBegin();
		while (true)
		{
			field = iprot.readFieldBegin();
			if (field.type == org.apache.thrift.protocol.TType.STOP)
			{
				break;
			}
			switch (field.id)
			{
			case 1: // ACTION_ID
				if (field.type == org.apache.thrift.protocol.TType.STRING)
				{
					this.action_id = iprot.readString();
				}
				else
				{
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case 2: // MESSAGE_ID
				if (field.type == org.apache.thrift.protocol.TType.STRING)
				{
					this.message_id = iprot.readString();
				}
				else
				{
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case 3: // DESTINATION
				if (field.type == org.apache.thrift.protocol.TType.STRING)
				{
					this.destination = iprot.readString();
				}
				else
				{
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
				}
				break;
			default:
				org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
			}
			iprot.readFieldEnd();
		}
		iprot.readStructEnd();

		// check for required fields of primitive type, which can't be checked in the validate method
		validate();
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException
	{
		validate();

		oprot.writeStructBegin(STRUCT_DESC);
		if (this.action_id != null)
		{
			if (isSetAction_id())
			{
				oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
				oprot.writeString(this.action_id);
				oprot.writeFieldEnd();
			}
		}
		if (this.message_id != null)
		{
			oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
			oprot.writeString(this.message_id);
			oprot.writeFieldEnd();
		}
		if (this.destination != null)
		{
			oprot.writeFieldBegin(DESTINATION_FIELD_DESC);
			oprot.writeString(this.destination);
			oprot.writeFieldEnd();
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("Acknowledge(");
		boolean first = true;

		if (isSetAction_id())
		{
			sb.append("action_id:");
			if (this.action_id == null)
			{
				sb.append("null");
			}
			else
			{
				sb.append(this.action_id);
			}
			first = false;
		}
		if (!first)
			sb.append(", ");
		sb.append("message_id:");
		if (this.message_id == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.message_id);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("destination:");
		if (this.destination == null)
		{
			sb.append("null");
		}
		else
		{
			sb.append(this.destination);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException
	{
		// check for required fields
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
	{
		try
		{
			write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
		}
		catch (org.apache.thrift.TException te)
		{
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException
	{
		try
		{
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		}
		catch (org.apache.thrift.TException te)
		{
			throw new java.io.IOException(te);
		}
	}

}
