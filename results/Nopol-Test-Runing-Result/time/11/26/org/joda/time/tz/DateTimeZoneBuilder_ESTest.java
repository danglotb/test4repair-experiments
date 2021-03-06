package org.joda.time.tz;


public class DateTimeZoneBuilder_ESTest extends org.joda.time.tz.DateTimeZoneBuilder_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        java.lang.String string0 = cachedDateTimeZone0.getShortName(-9223372036854775808L, ((java.util.Locale)(null)));
        org.junit.Assert.assertEquals("+00:09:21", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(0);
        dateTimeZoneBuilder1.addCutover(0, 'w', (-2918), (-2918), 0, true, (-1794));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(76, 'w', 604800, (-1013), 0, true, 2745);
        org.junit.Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(pipedOutputStream0)));
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(objectOutputStream0, 60000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(22));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        java.io.DataInputStream dataInputStream0 = new java.io.DataInputStream(((java.io.InputStream)(byteArrayInputStream0)));
        long long0 = org.joda.time.tz.DateTimeZoneBuilder.readMillis(dataInputStream0);
        org.junit.Assert.assertEquals(39600000L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readMillis(((java.io.DataInput)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        try {
            org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(null)), "");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 3392);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("", false)));
        org.junit.Assert.assertEquals("", fixedDateTimeZone0.getID());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-1253), 'Y', (-1253), (-1253), 34, false, 34);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(dateTimeZoneBuilder1.toDateTimeZone("", false)));
        org.junit.Assert.assertEquals("", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition((-9223372036854775765L));
        org.junit.Assert.assertEquals((-9223372036854775765L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(572L);
        org.junit.Assert.assertEquals(3600000, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(-9223372036854775808L);
        org.junit.Assert.assertEquals(-9223372036854775808L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(572L);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(9223372036854775807L);
        org.junit.Assert.assertEquals(846377999999L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addCutover((-1253), 'Y', (-1253), (-1253), 34, false, 34);
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        dateTimeZoneBuilder0.writeTo("]l-qq89$Mx+WZkti", ((java.io.OutputStream)(byteArrayOutputStream0)));
        org.junit.Assert.assertEquals("F UTC  ", byteArrayOutputStream0.toString());
        org.junit.Assert.assertEquals(8, byteArrayOutputStream0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("British Summer Time", 408, 408, 24, 'M', 354, 24, 24, false, 408);
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream0 = new java.io.DataOutputStream(((java.io.OutputStream)(byteArrayOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-2328));
        org.junit.Assert.assertEquals("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd", byteArrayOutputStream0.toString());
        org.junit.Assert.assertEquals(9, byteArrayOutputStream0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        java.io.PipedOutputStream pipedOutputStream0 = new java.io.PipedOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream0 = new java.io.BufferedOutputStream(((java.io.OutputStream)(pipedOutputStream0)));
        java.io.ObjectOutputStream objectOutputStream0 = new java.io.ObjectOutputStream(((java.io.OutputStream)(bufferedOutputStream0)));
        org.joda.time.tz.DateTimeZoneBuilder.writeMillis(objectOutputStream0, 6000L);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = ((byte)(70));
        java.io.ByteArrayInputStream byteArrayInputStream0 = new java.io.ByteArrayInputStream(byteArray0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone0 = ((org.joda.time.tz.FixedDateTimeZone)(org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.InputStream)(byteArrayInputStream0)), "+02:00")));
        org.junit.Assert.assertEquals("+02:00", fixedDateTimeZone0.toString());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(1382835600000L);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-31), 3955, 604800, 's', 3392, (-30), 54, true, 3955);
        org.junit.Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 's', (-2918), (-2918), 0, true, 's');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("", (-31), 3955, 604800, 's', 3392, (-30), 54, true, 3955);
        org.junit.Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone0 = ((org.joda.time.tz.CachedDateTimeZone)(org.joda.time.DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(9223372036854775801L);
        org.junit.Assert.assertEquals(9223372024736399999L, long0);
    }
}

