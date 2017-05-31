

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 472.599191860016;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 680.2908978992251;
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = -0.1425465430742778;
        doubleArray1[5] = 1079.4081520085;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = 680.2908978992251;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = 1677914.5187408475;
        doubleArray1[3] = -523.9841879442563;
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray0[8] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-5364186.757196282));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 1256.4470787300502;
        doubleArray0[8] = 1677914.5187408475;
        doubleArray0[3] = 680.2908978992251;
        doubleArray0[4] = 1256.4470787300502;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals(680.2908978992251, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = -0.1425465430742778;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(8);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-0.1425465430742778), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        eigenDecompositionImpl0.getImagEigenvalue(8);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-5364186.757196282));
        eigenDecompositionImpl0.getEigenvector(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 0.5;
        doubleArray0[7] = -523.9841879442563;
        doubleArray0[8] = 1079.4081520085;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1677914.5187408475;
        doubleArray1[2] = -0.1425465430742778;
        doubleArray1[5] = 1079.4081520085;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(1.8849433830596924E22, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[8] = 1677914.5187408475;
        doubleArray0[3] = 680.2908978992251;
        doubleArray0[6] = -5364186.757196282;
        doubleArray0[7] = -523.9841879442563;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 680.2908978992251;
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[4] = -523.9841879442563;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-8.826814684435613E26), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), (-2795.3743895389466));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = 943.5189984;
        doubleArray0[8] = 943.5189984;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = -0.1425465430742778;
        doubleArray1[3] = 943.5189984;
        doubleArray1[4] = 943.5189984;
        doubleArray1[5] = 1079.4081520085;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 680.2908978992251;
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = 943.5189984;
        doubleArray1[3] = 943.5189984;
        doubleArray1[4] = 943.5189984;
        doubleArray1[5] = 1079.4081520085;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 680.2908978992251;
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -2384.6532;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 0.5;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -2384.6532;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 1256.4470787300502;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = -522.865280149614;
        doubleArray1[5] = 1256.4470787300502;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1677914.5187408475;
        doubleArray0[7] = -523.9841879442563;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -0.1425465430742778;
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1079.4081520085;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[3] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1677914.5187408475;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 680.2908978992251;
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = -0.1425465430742778;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1.5;
        doubleArray1[7] = -5364187.028951365;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6931471805599453);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 2.220446049250313E-16;
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1.5;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = Double.NEGATIVE_INFINITY;
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = 1079.1550074273136;
        doubleArray1[6] = 1677914.5187408475;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.1550074273136);
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1677914.5187408475;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -0.1425465430742778;
        doubleArray1[3] = -523.9841879442563;
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1079.4081520085;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1677914.5187408475;
        doubleArray0[7] = -523.9841879442563;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -0.1425465430742778;
        doubleArray1[3] = -523.9841879442563;
        doubleArray1[4] = -523.9841879442563;
        doubleArray1[5] = 1079.4081520085;
        doubleArray1[6] = 1677914.5187408475;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = Double.NEGATIVE_INFINITY;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.1550074273136);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 1256.4470787300502;
        doubleArray0[1] = 1.5;
        doubleArray0[2] = 1677914.5187408475;
        doubleArray0[3] = 680.2908978992251;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-5364196.68317262));
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
        Assert.assertNotSame(decompositionSolver1, decompositionSolver0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-5364186.757196282));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-5364186.757196282));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 3733.9291);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1079.4081520085);
        eigenDecompositionImpl0.getRealEigenvalue(8);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3160.4609326);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = 1677914.5187408475;
        doubleArray0[6] = -5364186.757196282;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 680.2908978992251;
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = 1677914.5187408475;
        doubleArray1[3] = 1677914.5187408475;
        doubleArray1[4] = 1256.4470787300502;
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-5364186.757196282));
        Assert.assertEquals(-5.825277806195838E47, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 680.2908978992251;
        doubleArray1[1] = 1677914.5187408475;
        doubleArray1[2] = 1677914.5187408475;
        doubleArray1[3] = 1677914.5187408475;
        doubleArray1[4] = 1256.4470787300502;
        doubleArray1[5] = 1.5;
        doubleArray1[6] = 1677914.5187408475;
        doubleArray1[7] = -5364186.757196282;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-5364186.757196282));
        Assert.assertEquals(-8.980102096571047E23, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

