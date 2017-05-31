

package org.joda.time.tz;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import java.util.Properties;

public class DateTimeZoneBuilder_ESTest_scaffolding {
    private static final Properties defaultProperties = ((Properties) (System.getProperties().clone()));

    public static void setSystemProperties() {
        System.setProperties(((Properties) (DateTimeZoneBuilder_ESTest_scaffolding.defaultProperties.clone())));
        System.setProperty("user.timezone", "Europe/Paris");
        System.setProperty("user.dir", "/tmp/time_11_Nopol");
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(DateTimeZoneBuilder_ESTest_scaffolding.class.getClassLoader(), "org.joda.time.DateTimeZone", "org.joda.time.tz.DateTimeZoneBuilder$RuleSet", "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "org.joda.time.DateTimeUtils$MillisProvider", "org.joda.time.chrono.GJYearOfEraDateTimeField", "org.joda.time.tz.DateTimeZoneBuilder$Transition", "org.joda.time.field.RemainderDateTimeField", "org.joda.time.JodaTimePermission", "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "org.joda.time.DateTimeFieldType", "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "org.joda.time.ReadableInterval", "org.joda.time.chrono.BasicChronology$HalfdayField", "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", "org.joda.time.LocalDate$Property", "org.joda.time.chrono.BasicChronology$YearInfo", "org.joda.time.field.UnsupportedDurationField", "org.joda.time.ReadWritableInterval", "org.joda.time.base.AbstractDateTime", "org.joda.time.base.BaseLocal", "org.joda.time.chrono.ISOChronology", "org.joda.time.chrono.BasicChronology", "org.joda.time.chrono.BasicYearDateTimeField", "org.joda.time.field.DividedDateTimeField", "org.joda.time.chrono.ZonedChronology", "org.joda.time.field.BaseDateTimeField", "org.joda.time.field.ZeroIsMaxDateTimeField", "org.joda.time.tz.CachedDateTimeZone$Info", "org.joda.time.base.BaseInterval", "org.joda.time.format.FormatUtils", "org.joda.time.field.MillisDurationField", "org.joda.time.Interval", "org.joda.time.base.AbstractInstant", "org.joda.time.tz.DateTimeZoneBuilder", "org.joda.time.field.UnsupportedDateTimeField", "org.joda.time.field.ScaledDurationField", "org.joda.time.chrono.ISOYearOfEraDateTimeField", "org.joda.time.field.PreciseDurationDateTimeField", "org.joda.time.LocalDateTime", "org.joda.time.tz.FixedDateTimeZone", "org.joda.time.MutableDateTime", "org.joda.time.tz.CachedDateTimeZone", "org.joda.time.field.PreciseDateTimeField", "org.joda.time.ReadableDateTime", "org.joda.time.DateMidnight", "org.joda.time.field.DecoratedDateTimeField", "org.joda.time.YearMonthDay", "org.joda.time.DateTime$Property", "org.joda.time.field.OffsetDateTimeField", "org.joda.time.chrono.GJMonthOfYearDateTimeField", "org.joda.time.chrono.BasicWeekyearDateTimeField", "org.joda.time.tz.DateTimeZoneBuilder$Rule", "org.joda.time.DateTimeField", "org.joda.time.field.FieldUtils", "org.joda.time.ReadableInstant", "org.joda.time.chrono.GJDayOfWeekDateTimeField", "org.joda.time.DateTimeUtils$SystemMillisProvider", "org.joda.time.IllegalInstantException", "org.joda.time.IllegalFieldValueException", "org.joda.time.tz.DefaultNameProvider", "org.joda.time.tz.Provider", "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "org.joda.time.ReadablePeriod", "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", "org.joda.time.chrono.GregorianChronology", "org.joda.time.chrono.AssembledChronology$Fields", "org.joda.time.DurationFieldType", "org.joda.time.ReadWritableInstant", "org.joda.time.tz.NameProvider", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.base.AbstractPartial", "org.joda.time.base.BasePartial", "org.joda.time.base.BaseDateTime", "org.joda.time.DateTimeUtils", "org.joda.time.LocalTime", "org.joda.time.base.AbstractInterval", "org.joda.time.field.DecoratedDurationField", "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "org.joda.time.chrono.AssembledChronology", "org.joda.time.TimeOfDay", "org.joda.time.tz.ZoneInfoProvider", "org.joda.time.chrono.GJEraDateTimeField", "org.joda.time.DateTimeZone$1", "org.joda.time.chrono.BaseChronology", "org.joda.time.field.ImpreciseDateTimeField", "org.joda.time.field.PreciseDurationField", "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "org.joda.time.ReadableDuration", "org.joda.time.chrono.BasicGJChronology", "org.joda.time.format.DateTimeFormatter", "org.joda.time.DurationField", "org.joda.time.Chronology", "org.joda.time.DateTime", "org.joda.time.field.AbstractReadableInstantFieldProperty", "org.joda.time.LocalDate", "org.joda.time.ReadWritableDateTime", "org.joda.time.chrono.BasicDayOfMonthDateTimeField", "org.joda.time.chrono.ZonedChronology$ZonedDurationField", "org.joda.time.Instant", "org.joda.time.ReadablePartial", "org.joda.time.chrono.BasicDayOfYearDateTimeField", "org.joda.time.DurationFieldType$StandardDurationFieldType", "org.joda.time.field.BaseDurationField");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(DateTimeZoneBuilder_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.joda.time.tz.FixedDateTimeZone", "org.joda.time.DateTimeZone", "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "org.joda.time.tz.CachedDateTimeZone", "org.joda.time.DateTimeUtils", "org.joda.time.chrono.BaseChronology", "org.joda.time.chrono.AssembledChronology", "org.joda.time.field.MillisDurationField", "org.joda.time.field.BaseDurationField", "org.joda.time.field.PreciseDurationField", "org.joda.time.DurationFieldType$StandardDurationFieldType", "org.joda.time.DurationFieldType", "org.joda.time.field.PreciseDurationDateTimeField", "org.joda.time.field.PreciseDateTimeField", "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "org.joda.time.DateTimeFieldType", "org.joda.time.field.DecoratedDateTimeField", "org.joda.time.field.ZeroIsMaxDateTimeField", "org.joda.time.chrono.BasicChronology$HalfdayField", "org.joda.time.chrono.BasicChronology", "org.joda.time.chrono.BasicGJChronology", "org.joda.time.field.ImpreciseDateTimeField", "org.joda.time.chrono.BasicYearDateTimeField", "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", "org.joda.time.chrono.GJYearOfEraDateTimeField", "org.joda.time.field.OffsetDateTimeField", "org.joda.time.field.DividedDateTimeField", "org.joda.time.field.DecoratedDurationField", "org.joda.time.field.ScaledDurationField", "org.joda.time.field.RemainderDateTimeField", "org.joda.time.chrono.GJEraDateTimeField", "org.joda.time.chrono.GJDayOfWeekDateTimeField", "org.joda.time.chrono.BasicDayOfMonthDateTimeField", "org.joda.time.chrono.BasicDayOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.GJMonthOfYearDateTimeField", "org.joda.time.chrono.BasicWeekyearDateTimeField", "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "org.joda.time.field.UnsupportedDurationField", "org.joda.time.chrono.GregorianChronology", "org.joda.time.chrono.ISOYearOfEraDateTimeField", "org.joda.time.chrono.ISOChronology", "org.joda.time.tz.DateTimeZoneBuilder$RuleSet", "org.joda.time.format.FormatUtils", "org.joda.time.PeriodType", "org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.MockZone", "org.joda.time.chrono.BasicSingleEraDateTimeField", "org.joda.time.Instant", "org.joda.time.chrono.GJChronology", "org.joda.time.field.DelegatedDateTimeField", "org.joda.time.field.SkipDateTimeField", "org.joda.time.chrono.JulianChronology", "org.joda.time.chrono.GJChronology$CutoverField", "org.joda.time.chrono.GJChronology$ImpreciseCutoverField", "org.joda.time.chrono.GJChronology$LinkedDurationField", "org.joda.time.field.SkipUndoDateTimeField", "org.joda.time.base.BaseDateTime", "org.joda.time.DateTime", "org.joda.time.chrono.LimitChronology", "org.joda.time.chrono.LimitChronology$LimitDurationField", "org.joda.time.chrono.LimitChronology$LimitDateTimeField", "org.joda.time.chrono.BuddhistChronology", "org.joda.time.chrono.ZonedChronology", "org.joda.time.chrono.ZonedChronology$ZonedDurationField", "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", "org.joda.time.base.BaseLocal", "org.joda.time.LocalDate", "org.joda.time.LocalDateTime", "org.joda.time.IllegalFieldValueException", "org.joda.time.base.BasePeriod", "org.joda.time.MutablePeriod", "org.joda.time.field.AbstractReadableInstantFieldProperty", "org.joda.time.LocalDate$Property", "org.joda.time.MockPartial", "org.joda.time.format.ISODateTimeFormat", "org.joda.time.DateMidnight", "org.joda.time.convert.ConverterManager", "org.joda.time.convert.ReadableInstantConverter", "org.joda.time.convert.StringConverter", "org.joda.time.convert.CalendarConverter", "org.joda.time.convert.DateConverter", "org.joda.time.convert.LongConverter", "org.joda.time.convert.NullConverter", "org.joda.time.convert.ReadablePartialConverter", "org.joda.time.convert.ReadableDurationConverter", "org.joda.time.convert.ReadableIntervalConverter", "org.joda.time.convert.ReadablePeriodConverter", "org.joda.time.DateTime$Property", "org.joda.time.Period", "org.joda.time.base.BaseSingleFieldPeriod", "org.joda.time.format.ISOPeriodFormat", "org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder$Literal", "org.joda.time.Days", "org.joda.time.base.BaseDuration", "org.joda.time.Duration", "org.joda.time.format.DateTimeFormat", "org.joda.time.LocalTime", "org.joda.time.base.BasePartial", "org.joda.time.MonthDay", "org.joda.time.chrono.LenientChronology", "org.joda.time.base.BaseInterval", "org.joda.time.Interval", "org.joda.time.chrono.LimitChronology$LimitException", "org.joda.time.MutableDateTime", "org.joda.time.Minutes", "org.joda.time.Seconds", "org.joda.time.Hours");
    }
}

