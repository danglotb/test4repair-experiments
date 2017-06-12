/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 22:03:53 GMT 2017
 */


package org.apache.commons.math.linear;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -1.0;
        doubleArray0[4] = -1.0;
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -1.0;
        doubleArray0[4] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.5);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 5
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.0);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -1
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 0.7222573898643173;
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1.05);
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // 
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(1.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals((-1.5), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        eigenDecompositionImpl0.getImagEigenvalue(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        eigenDecompositionImpl0.getEigenvector(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -1.0;
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(2.9809292904745725E-12, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[2] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-3.104902590627261E10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        try {
            eigenDecompositionImpl0.getRealEigenvalue((-2011));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -2011
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 1888.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((RealMatrix) (null)), 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        double[][] doubleArray2 = new double[0][7];
        array2DRowRealMatrix0.data = doubleArray2;
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1.05);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Double double0 = new Double(1995.666210179);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), ((double) (double0)));
        eigenDecompositionImpl1.getV();
        Assert.assertEquals(1.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        doubleArray0[4] = Double.NEGATIVE_INFINITY;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 0.5067193731119429;
        doubleArray0[1] = 1.5;
        doubleArray0[2] = 2.0;
        doubleArray0[3] = -1.0;
        doubleArray0[4] = 1.5;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -1.0;
        doubleArray1[3] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(36.760079059667945, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 2.0;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -25.02422498938798;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[1] = -2398.585223426996;
        doubleArray1[2] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 0.14279734508725175;
        doubleArray0[1] = 0.14279734508725175;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 0.14279734508725175;
        doubleArray1[1] = 0.14279734508725175;
        doubleArray1[2] = -2398.585223426996;
        doubleArray1[3] = 0.14279734508725175;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(5.93745950664252E-5, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        doubleArray0[2] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -2.280640316949235;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -2398.585223426996;
        doubleArray1[3] = -2.280640316949235;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-64890.682768210805), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        doubleArray0[2] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -2398.585223426996;
        doubleArray1[3] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-3.1049025906270344E10), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -2438.357749517213;
        doubleArray1[3] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 2.0;
        doubleArray0[3] = 2.0;
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[1] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        Assert.assertEquals(21587.248044727494, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 2.0;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        doubleArray0[2] = 1.1102230246251565E-16;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[2] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        doubleArray0[2] = 1.5;
        doubleArray0[3] = -1.0;
        doubleArray0[4] = -1.0;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-5396.8167527107325), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(4.2466030691912214E-15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -0.9549169796874187;
        doubleArray0[1] = -0.9549169796874187;
        doubleArray0[2] = 2.0;
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        doubleArray0[2] = 2.0;
        double[] doubleArray1 = new double[4];
        doubleArray0[0] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // cannot solve degree 3 equation
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.5;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.NEGATIVE_INFINITY);
        try {
            eigenDecompositionImpl0.getEigenvector((-359));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -359
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        try {
            eigenDecompositionImpl0.getEigenvector((-1527));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // -1527
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertTrue(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
        Assert.assertNotNull(array2DRowRealMatrix1);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2398.585223426996));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Double double0 = new Double(1995.666210179);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), ((double) (double0)));
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        Assert.assertTrue(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = -2398.585223426996;
        double[] doubleArray1 = new double[4];
        doubleArray1[2] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1.05);
            Assert.fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            // 
            // eigen decomposition of assymetric matrices not supported yet
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertNotSame(doubleArray1, doubleArray2);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1995.666210179);
        try {
            eigenDecompositionImpl0.getImagEigenvalue(3665);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 
            // 3665
            // 
            EvoAssertions.verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = -2398.585223426996;
        doubleArray1[2] = -2398.585223426996;
        doubleArray1[3] = -2398.585223426996;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        // AssertFixer: old assertion Assert.assertEquals((-8.5681582293038192E16), eigenDecompositionImpl0.getDeterminant(), 0.01)
        Assert.assertEquals(9.7963993064326336E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

