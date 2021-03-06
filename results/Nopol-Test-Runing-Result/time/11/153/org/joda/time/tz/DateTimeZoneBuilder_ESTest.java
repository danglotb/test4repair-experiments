package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("fze15zzO!>:)^S", 101);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(119);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder2.toDateTimeZone("=V#6pF?>XZE+RcY", false)));
        org.junit.Assert.assertEquals("=V#6pF?>XZE+RcY", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(((byte)(111)));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(((byte)(111)), 'u', ((byte)(111)), ((byte)(76)), ((byte)(-70)), false, ((byte)(76)));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", ((byte)(111)));
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder3);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-333));
        dateTimeZoneBuilder1.addCutover(((byte)(111)), 'u', ((byte)(111)), (-333), ((byte)(76)), false, ((byte)(76)));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(85, 'u', (-2822), ((byte)(76)), 1959, false, (-2653));
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        try {
            dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$DSTZone", ((java.io.OutputStream)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "~{N(~");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        long long0 = cachedDateTimeZone0.previousTransition(35088L);
        org.junit.Assert.assertEquals((-766623600001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forID(((java.lang.String)(null)))));
        long long0 = cachedDateTimeZone0.previousTransition(-9223372036854775808L);
        org.junit.Assert.assertEquals(-9223372036854775808L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream(88);
        java.io.FilterOutputStream filterOutputStream0 = new java.io.FilterOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(filterOutputStream0)));
        dateTimeZoneBuilder0.writeTo("aO", ((java.io.OutputStream)(dataOutputStream0)));
        org.junit.Assert.assertEquals("F UTC  ", byteArrayOutputStream0.toString());
        org.junit.Assert.assertEquals(8, byteArrayOutputStream0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("/:4SE(];'*L[Jg", 7, (-3599), (-292269054), '2', 366, 71, 3183, true, 91);
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(pipedOutputStream0)) , 87);
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(objectOutputStream0, 62035200000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("e", 1689);
        java.io.PipedInputStream pipedInputStream0 = new java.io.PipedInputStream();
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream(pipedInputStream0);
        dateTimeZoneBuilder0.writeTo("%0|<~kE)tRv", ((java.io.OutputStream)(pipedOutputStream0)));
        org.junit.Assert.assertEquals(14, pipedInputStream0.available());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.PipedInputStream pipedInputStream0 = new java.io.PipedInputStream();
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream(pipedInputStream0);
        dateTimeZoneBuilder0.writeTo("%0|<~kE)tRv", ((java.io.OutputStream)(pipedOutputStream0)));
        org.junit.Assert.assertEquals(8, pipedInputStream0.available());
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(pipedInputStream0)), "%0|<~kE)tRv")));
        org.junit.Assert.assertEquals("%0|<~kE)tRv", fixedDateTimeZone0.getID());
    }
}

