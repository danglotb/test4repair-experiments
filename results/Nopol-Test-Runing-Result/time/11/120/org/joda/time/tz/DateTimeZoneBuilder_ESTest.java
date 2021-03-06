package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("org.joda.time.field.LenientDateTimeField", 96);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1746, 'w', 0, 0, 1746, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("!Z*?Xb$ ;R&fN^ l[", 0, 1746, 1746, 'w', 1462, 1746, 1315, true, 1746);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 2592000000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "|Id4\'O2\"qR|");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        long long0 = cachedDateTimeZone0.previousTransition(0L);
        org.junit.Assert.assertEquals((-766623600001L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(0L);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        java.lang.String string0 = cachedDateTimeZone0.getNameKey((-766623600001L));
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("WEMT", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = localDateTime0.plusDays(102);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings(((java.lang.String)(null)), (-1088), (-2147422418), 76, 's', 76, 80, (-791), false, (-1088));
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(29, '-', (-3164), (-3164), 29, false, (-3164));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("jAw", true)));
        org.junit.Assert.assertEquals("jAw", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("q_", 77, 77, (-380), 'a', 77, (-979), 1478, false, 999999);
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.PipedInputStream pipedInputStream0 = new java.io.PipedInputStream(352831696);
        dateTimeZoneBuilder0.setFixedSavings("UTC", 128);
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream(pipedInputStream0);
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(pipedOutputStream0)));
        dateTimeZoneBuilder0.writeTo("UTC", ((java.io.DataOutput)(dataOutputStream0)));
        org.junit.Assert.assertEquals(16, pipedInputStream0.available());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("", 1024);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder0.toDateTimeZone("UTC", false)));
        org.junit.Assert.assertEquals("UTC", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        dateTimeZoneBuilder0.writeTo("UTC", ((java.io.DataOutput)(dataOutputStream0)));
        org.junit.Assert.assertEquals("F UTC  ", byteArrayOutputStream0.toString());
        org.junit.Assert.assertEquals(8, byteArrayOutputStream0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, 8000L);
        org.junit.Assert.assertEquals(5, byteArrayOutputStream0.size());
        org.junit.Assert.assertEquals("\ufffd   \b", byteArrayOutputStream0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.PipedInputStream pipedInputStream0 = new java.io.PipedInputStream(352831696);
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream(pipedInputStream0);
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(pipedOutputStream0)));
        dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$DSTZone", ((java.io.DataOutput)(dataOutputStream0)));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(pipedInputStream0)), ";2wta)b6Ii#/")));
        org.junit.Assert.assertEquals(";2wta)b6Ii#/", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(1454671509321L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(((java.lang.String)(null)), java.lang.Integer.MIN_VALUE);
        dateTimeZoneBuilder1.addCutover(75, 'u', (-380), 75, 75, false, java.lang.Integer.MIN_VALUE);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(2, 'u', 75, 2, 2, false, 75);
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)(null)))));
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
        org.junit.Assert.assertFalse(boolean0);
    }
}

