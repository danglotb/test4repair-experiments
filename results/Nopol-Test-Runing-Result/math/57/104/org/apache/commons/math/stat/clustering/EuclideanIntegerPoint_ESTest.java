package org.apache.commons.math.stat.clustering;


public class EuclideanIntegerPoint_ESTest extends org.apache.commons.math.stat.clustering.EuclideanIntegerPoint_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 19;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        euclideanIntegerPoint0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        int[] intArray0 = new int[10];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        euclideanIntegerPoint0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[5];
        intArray0[0] = -2147483619;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(euclideanIntegerPoint1.equals(((java.lang.Object)(euclideanIntegerPoint0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[5];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = -3105;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        java.util.LinkedList<org.apache.commons.math.stat.clustering.EuclideanIntegerPoint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.stat.clustering.EuclideanIntegerPoint>();
        linkedList0.add(euclideanIntegerPoint0);
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = euclideanIntegerPoint0.centroidOf(linkedList0);
        org.junit.Assert.assertTrue(euclideanIntegerPoint1.equals(((java.lang.Object)(euclideanIntegerPoint0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = euclideanIntegerPoint0.getPoint();
        org.junit.Assert.assertSame(intArray0, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = euclideanIntegerPoint0.getPoint();
        org.junit.Assert.assertSame(intArray0, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = -635;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[4];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        double double0 = euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint1);
        org.junit.Assert.assertEquals(635.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(((int[])(null)));
        int[] intArray0 = euclideanIntegerPoint0.getPoint();
        org.junit.Assert.assertNull(intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        java.lang.String string0 = euclideanIntegerPoint0.toString();
        org.junit.Assert.assertEquals("(0,0,0,0,0,0,0,0,0)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[5];
        intArray1[4] = -2147483619;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(euclideanIntegerPoint1.equals(((java.lang.Object)(euclideanIntegerPoint0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[5];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(euclideanIntegerPoint1.equals(((java.lang.Object)(euclideanIntegerPoint0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(((int[])(null)));
        boolean boolean0 = euclideanIntegerPoint0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint0);
    }
}

