import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

class ConversionsTest {

  @Test
  void shouldBeAbleToSerializeNotNullInbuiltLogicalType_whenPopulated() throws IOException {
    InbuiltLogicalTypeNotNullFieldRecord record = new InbuiltLogicalTypeNotNullFieldRecord(Instant.now().truncatedTo(ChronoUnit.MILLIS));

    InbuiltLogicalTypeNotNullFieldRecord decoded = InbuiltLogicalTypeNotNullFieldRecord.getDecoder().decode(record.toByteBuffer());

    assertThat(decoded.getTimestamp()).isEqualTo(record.getTimestamp());
  }
  @Test
  void shouldBeAbleToSerializeNullableInbuiltLogicalType_whenPopulated() throws IOException {
    InbuiltLogicalTypeNullableFieldRecord record = new InbuiltLogicalTypeNullableFieldRecord(Instant.now().truncatedTo(ChronoUnit.MILLIS));

    InbuiltLogicalTypeNullableFieldRecord decoded = InbuiltLogicalTypeNullableFieldRecord.getDecoder().decode(record.toByteBuffer());

    assertThat(decoded.getNullableTimestamp()).isEqualTo(record.getNullableTimestamp());
  }

  @Test
  void shouldBeAbleToSerializeNullableInbuiltLogicalType_whenNull() throws IOException {
    InbuiltLogicalTypeNullableFieldRecord record = new InbuiltLogicalTypeNullableFieldRecord(null);

    InbuiltLogicalTypeNullableFieldRecord decoded = InbuiltLogicalTypeNullableFieldRecord.getDecoder().decode(record.toByteBuffer());

    assertThat(decoded.getNullableTimestamp()).isEqualTo(record.getNullableTimestamp());
  }

  @Test
  void shouldBeAbleToSerializeNotNullCustomLogicalType_whenPopulated() throws IOException {
    CustomLogicalTypeNotNullFieldRecord record = new CustomLogicalTypeNotNullFieldRecord(ZonedDateTime.now().truncatedTo(ChronoUnit.MILLIS));

    CustomLogicalTypeNotNullFieldRecord decoded = CustomLogicalTypeNotNullFieldRecord.getDecoder().decode(record.toByteBuffer());

    assertThat(decoded.getZdt()).isEqualTo(record.getZdt());
  }
  @Test
  void shouldBeAbleToSerializeNullableCustomLogicalType_whenPopulated() throws IOException {
    CustomLogicalTypeNullableFieldRecord record = new CustomLogicalTypeNullableFieldRecord(ZonedDateTime.now().truncatedTo(ChronoUnit.MILLIS));

    CustomLogicalTypeNullableFieldRecord decoded = CustomLogicalTypeNullableFieldRecord.getDecoder().decode(record.toByteBuffer());

    assertThat(decoded.getNullableZdt()).isEqualTo(record.getNullableZdt());
  }

  @Test
  void shouldBeAbleToSerializeNullableCustomLogicalType_whenNull() throws IOException {
    CustomLogicalTypeNullableFieldRecord record = new CustomLogicalTypeNullableFieldRecord(null);

    CustomLogicalTypeNullableFieldRecord decoded = CustomLogicalTypeNullableFieldRecord.getDecoder().decode(record.toByteBuffer());

    assertThat(decoded.getNullableZdt()).isEqualTo(record.getNullableZdt());
  }

  @Test
  void conversionDefinitelyWorks() {
    ZonedDateTimeConversion conversion = new ZonedDateTimeConversion();

    ZonedDateTime input = ZonedDateTime.now().truncatedTo(ChronoUnit.MILLIS);

    CharSequence serialised = conversion.toCharSequence(input, null, null);

    assertThat(conversion.fromCharSequence(serialised, null, null)).isEqualTo(input);
  }
}