import org.apache.avro.Conversion;
import org.apache.avro.LogicalType;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeConversion extends Conversion<ZonedDateTime> {

  public static final LogicalType ZONED_DATE_TIME_TYPE = new LogicalType("zoned-date-time");

  @Override
  public Class<ZonedDateTime> getConvertedType() {
    return ZonedDateTime.class;
  }

  @Override
  public Schema getRecommendedSchema() {
    return ZONED_DATE_TIME_TYPE.addToSchema(Schema.create(Schema.Type.STRING));
  }

  @Override
  public String getLogicalTypeName() {
    return ZONED_DATE_TIME_TYPE.getName();
  }

  @Override
  public ZonedDateTime fromCharSequence(CharSequence value, Schema schema, LogicalType type) {
    return ZonedDateTime.parse(value, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  }

  @Override
  public CharSequence toCharSequence(ZonedDateTime value, Schema schema, LogicalType type) {
    return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(value);
  }

  public static class TypeFactory implements LogicalTypes.LogicalTypeFactory {
    @Override
    public String getTypeName() {
      return ZONED_DATE_TIME_TYPE.getName();
    }

    @Override
    public LogicalType fromSchema(Schema schema) {
      return ZONED_DATE_TIME_TYPE;
    }
  }
}