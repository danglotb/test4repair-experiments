package org.apache.commons.math.stat.descriptive.moment;


public class Mean_ESTest extends org.apache.commons.math.stat.descriptive.moment.Mean_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 399.203615952;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0, 1, 1);
        org.junit.Assert.assertEquals(399.203615952, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2186.453;
        double double0 = mean0.evaluate(doubleArray0);
        org.junit.Assert.assertEquals((-364.4088333333333), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean.copy(mean1, mean0);
        org.junit.Assert.assertTrue(mean1.equals(((java.lang.Object)(mean0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment(0.0);
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((-1.0));
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(1L, mean0.getN());
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment(1.0);
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(1.0, mean0.getResult(), 0.01);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.009615384615384616;
        double double0 = mean0.evaluate(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1135.0;
        double double0 = mean0.evaluate(doubleArray0, 1, 1);
        org.junit.Assert.assertEquals((-1135.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((-17.42));
        mean0.copy();
        org.junit.Assert.assertEquals(1L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[10];
        mean0.incrementAll(doubleArray0);
        mean0.copy();
        org.junit.Assert.assertEquals(10L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[2];
        double double0 = mean0.evaluate(doubleArray0, 0, 1);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.increment(1.557800918896888);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 0.07692307692307693;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.07692307692307693, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[8];
        double double0 = mean0.evaluate(doubleArray0, 0, 0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.clear();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, mean0.getResult(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.clear();
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean(mean0);
        org.junit.Assert.assertEquals(0L, mean1.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = mean0.copy();
        org.junit.Assert.assertNotSame(mean1, mean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

