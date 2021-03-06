/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class InbuiltLogicalTypeNotNullFieldRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3144196933217806859L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InbuiltLogicalTypeNotNullFieldRecord\",\"fields\":[{\"name\":\"timestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<InbuiltLogicalTypeNotNullFieldRecord> ENCODER =
      new BinaryMessageEncoder<InbuiltLogicalTypeNotNullFieldRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InbuiltLogicalTypeNotNullFieldRecord> DECODER =
      new BinaryMessageDecoder<InbuiltLogicalTypeNotNullFieldRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<InbuiltLogicalTypeNotNullFieldRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<InbuiltLogicalTypeNotNullFieldRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<InbuiltLogicalTypeNotNullFieldRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<InbuiltLogicalTypeNotNullFieldRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this InbuiltLogicalTypeNotNullFieldRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a InbuiltLogicalTypeNotNullFieldRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a InbuiltLogicalTypeNotNullFieldRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static InbuiltLogicalTypeNotNullFieldRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.time.Instant timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InbuiltLogicalTypeNotNullFieldRecord() {}

  /**
   * All-args constructor.
   * @param timestamp The new value for timestamp
   */
  public InbuiltLogicalTypeNotNullFieldRecord(java.time.Instant timestamp) {
    this.timestamp = timestamp.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.time.Instant getTimestamp() {
    return timestamp;
  }



  /**
   * Creates a new InbuiltLogicalTypeNotNullFieldRecord RecordBuilder.
   * @return A new InbuiltLogicalTypeNotNullFieldRecord RecordBuilder
   */
  public static InbuiltLogicalTypeNotNullFieldRecord.Builder newBuilder() {
    return new InbuiltLogicalTypeNotNullFieldRecord.Builder();
  }

  /**
   * Creates a new InbuiltLogicalTypeNotNullFieldRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InbuiltLogicalTypeNotNullFieldRecord RecordBuilder
   */
  public static InbuiltLogicalTypeNotNullFieldRecord.Builder newBuilder(InbuiltLogicalTypeNotNullFieldRecord.Builder other) {
    if (other == null) {
      return new InbuiltLogicalTypeNotNullFieldRecord.Builder();
    } else {
      return new InbuiltLogicalTypeNotNullFieldRecord.Builder(other);
    }
  }

  /**
   * Creates a new InbuiltLogicalTypeNotNullFieldRecord RecordBuilder by copying an existing InbuiltLogicalTypeNotNullFieldRecord instance.
   * @param other The existing instance to copy.
   * @return A new InbuiltLogicalTypeNotNullFieldRecord RecordBuilder
   */
  public static InbuiltLogicalTypeNotNullFieldRecord.Builder newBuilder(InbuiltLogicalTypeNotNullFieldRecord other) {
    if (other == null) {
      return new InbuiltLogicalTypeNotNullFieldRecord.Builder();
    } else {
      return new InbuiltLogicalTypeNotNullFieldRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for InbuiltLogicalTypeNotNullFieldRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InbuiltLogicalTypeNotNullFieldRecord>
    implements org.apache.avro.data.RecordBuilder<InbuiltLogicalTypeNotNullFieldRecord> {

    private java.time.Instant timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(InbuiltLogicalTypeNotNullFieldRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing InbuiltLogicalTypeNotNullFieldRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(InbuiltLogicalTypeNotNullFieldRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.time.Instant getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public InbuiltLogicalTypeNotNullFieldRecord.Builder setTimestamp(java.time.Instant value) {
      validate(fields()[0], value);
      this.timestamp = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public InbuiltLogicalTypeNotNullFieldRecord.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InbuiltLogicalTypeNotNullFieldRecord build() {
      try {
        InbuiltLogicalTypeNotNullFieldRecord record = new InbuiltLogicalTypeNotNullFieldRecord();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.time.Instant) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InbuiltLogicalTypeNotNullFieldRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<InbuiltLogicalTypeNotNullFieldRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InbuiltLogicalTypeNotNullFieldRecord>
    READER$ = (org.apache.avro.io.DatumReader<InbuiltLogicalTypeNotNullFieldRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










