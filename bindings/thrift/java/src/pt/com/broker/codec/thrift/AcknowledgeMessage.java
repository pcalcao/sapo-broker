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
import org.apache.thrift.transport.*;

public class AcknowledgeMessage implements TBase, java.io.Serializable, Cloneable
{
	private static final TStruct STRUCT_DESC = new TStruct("AcknowledgeMessage");
	private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", TType.STRING, (short) 1);
	private static final TField MESSAGE_ID_FIELD_DESC = new TField("message_id", TType.STRING, (short) 2);
	private static final TField DESTINATION_FIELD_DESC = new TField("destination", TType.STRING, (short) 3);

	public String action_id;
	public static final int ACTION_ID = 1;
	public String message_id;
	public static final int MESSAGE_ID = 2;
	public String destination;
	public static final int DESTINATION = 3;

	private final Isset __isset = new Isset();

	private static final class Isset implements java.io.Serializable
	{
	}

	public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>()
	{
		{
			put(ACTION_ID, new FieldMetaData("action_id", TFieldRequirementType.OPTIONAL, new FieldValueMetaData(TType.STRING)));
			put(MESSAGE_ID, new FieldMetaData("message_id", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
			put(DESTINATION, new FieldMetaData("destination", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
		}
	});

	static
	{
		FieldMetaData.addStructMetaDataMap(AcknowledgeMessage.class, metaDataMap);
	}

	public AcknowledgeMessage()
	{
	}

	public AcknowledgeMessage(String action_id, String message_id, String destination)
	{
		this();
		this.action_id = action_id;
		this.message_id = message_id;
		this.destination = destination;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public AcknowledgeMessage(AcknowledgeMessage other)
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

	@Override
	public AcknowledgeMessage clone()
	{
		return new AcknowledgeMessage(this);
	}

	public String getAction_id()
	{
		return this.action_id;
	}

	public void setAction_id(String action_id)
	{
		this.action_id = action_id;
	}

	public void unsetAction_id()
	{
		this.action_id = null;
	}

	// Returns true if field action_id is set (has been asigned a value) and
	// false otherwise
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

	public void setMessage_id(String message_id)
	{
		this.message_id = message_id;
	}

	public void unsetMessage_id()
	{
		this.message_id = null;
	}

	// Returns true if field message_id is set (has been asigned a value) and
	// false otherwise
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

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	public void unsetDestination()
	{
		this.destination = null;
	}

	// Returns true if field destination is set (has been asigned a value) and
	// false otherwise
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

	public void setFieldValue(int fieldID, Object value)
	{
		switch (fieldID)
		{
		case ACTION_ID:
			setAction_id((String) value);
			break;

		case MESSAGE_ID:
			setMessage_id((String) value);
			break;

		case DESTINATION:
			setDestination((String) value);
			break;

		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	public Object getFieldValue(int fieldID)
	{
		switch (fieldID)
		{
		case ACTION_ID:
			return getAction_id();

		case MESSAGE_ID:
			return getMessage_id();

		case DESTINATION:
			return getDestination();

		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	// Returns true if field corresponding to fieldID is set (has been asigned a
	// value) and false otherwise
	public boolean isSet(int fieldID)
	{
		switch (fieldID)
		{
		case ACTION_ID:
			return isSetAction_id();
		case MESSAGE_ID:
			return isSetMessage_id();
		case DESTINATION:
			return isSetDestination();
		default:
			throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
		}
	}

	@Override
	public boolean equals(Object that)
	{
		if (that == null)
			return false;
		if (that instanceof AcknowledgeMessage)
			return this.equals((AcknowledgeMessage) that);
		return false;
	}

	public boolean equals(AcknowledgeMessage that)
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

	public void read(TProtocol iprot) throws TException
	{
		TField field;
		iprot.readStructBegin();
		while (true)
		{
			field = iprot.readFieldBegin();
			if (field.type == TType.STOP)
			{
				break;
			}
			switch (field.id)
			{
			case ACTION_ID:
				if (field.type == TType.STRING)
				{
					this.action_id = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case MESSAGE_ID:
				if (field.type == TType.STRING)
				{
					this.message_id = iprot.readString();
				}
				else
				{
					TProtocolUtil.skip(iprot, field.type);
				}
				break;
			case DESTINATION:
				if (field.type == TType.STRING)
				{
					this.destination = iprot.readString();
				}
				else
				{
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

		// check for required fields of primitive type, which can't be checked
		// in the validate method
		validate();
	}

	public void write(TProtocol oprot) throws TException
	{
		validate();

		oprot.writeStructBegin(STRUCT_DESC);
		if (this.action_id != null)
		{
			oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
			oprot.writeString(this.action_id);
			oprot.writeFieldEnd();
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
		StringBuilder sb = new StringBuilder("AcknowledgeMessage(");
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

	public void validate() throws TException
	{
		// check for required fields
		// check that fields of type enum have valid values
	}

}