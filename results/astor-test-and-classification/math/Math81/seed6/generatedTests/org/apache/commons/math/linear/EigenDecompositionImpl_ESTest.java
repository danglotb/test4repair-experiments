/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 00:15:58 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-25.070090054423353);
      doubleArray0[1] = (-25.070090054423353);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(1684);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1684
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-25.070090054423353);
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (-25.070090054423353);
      doubleArray1[3] = 0.08325;
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-25.070090054423353);
      doubleArray0[3] = (-25.070090054423353);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-25.070090054423353);
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = 0.08325;
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals((-7.849670849974606E-4), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 546.984190372);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-22.955289779026444);
      doubleArray0[3] = (-22.955289779026444);
      doubleArray0[7] = (-2637.9854767651113);
      double[] doubleArray1 = new double[8];
      doubleArray1[4] = (-22.955289779026444);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
      assertEquals((-22.955289779026444), double0, 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getImagEigenvalue(5);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.7295738714474347));
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(1);
      assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = 251.8865931;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 5811.7274;
      doubleArray1[3] = 251.8865931;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(5.3979098609671725E14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-7.827773875398356);
      doubleArray0[1] = (-7.827773875398356);
      doubleArray0[2] = 251.8865931;
      double[] doubleArray1 = new double[4];
      doubleArray1[3] = 251.8865931;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-9.792457607971712E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      double[][] doubleArray2 = new double[2][2];
      doubleArray2[0] = doubleArray0;
      array2DRowRealMatrix0.data = doubleArray2;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-4062.009897));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (2, 0) in a 2x9 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-555.4));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 7.277353536218399;
      doubleArray0[1] = 4187.536437400189;
      doubleArray0[2] = 251.8865931;
      doubleArray0[3] = 5811.7274;
      doubleArray0[4] = 5811.7274;
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      eigenDecompositionImpl0.getVT();
      assertEquals(2.592672110116028E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 17.590155005020062;
      doubleArray0[7] = (-2637.9854767651113);
      doubleArray0[8] = (-2637.9854767651113);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = (-2637.9854767651113);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = 0.08325;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-0.7295738714474347);
      doubleArray0[5] = 2042.49228;
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-0.7295738714474347);
      doubleArray1[2] = 2042.49228;
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = 2042.49228;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.7295738714474347));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = 0.08325;
      doubleArray0[1] = 0.08325;
      doubleArray0[6] = 17.590155005020062;
      doubleArray0[7] = (-2637.9854767651113);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = 0.08325;
      doubleArray1[3] = (-2637.9854767651113);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (-25.070090054423353);
      doubleArray0[4] = (-25.070090054423353);
      doubleArray0[7] = (-2637.9854767651113);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-25.070090054423353));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-25.070090054423353);
      doubleArray0[3] = (-25.070090054423353);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-25.070090054423353);
      doubleArray1[1] = (-0.23003795493873064);
      doubleArray1[2] = (-0.23003795493873064);
      doubleArray1[3] = (-0.23003795493873064);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = 0.08325;
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-22.955289779026444);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-22.955289779026444);
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = (-790.1827908921);
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = (-22.955289779026444);
      doubleArray1[5] = (-22.955289779026444);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = (-2637.9854767651113);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = 0.08325;
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = (-2637.9854767651113);
      doubleArray0[8] = (-790.1827908921);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = 0.08325;
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = 0.08325;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-4062.009897));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-25.070090054423353);
      doubleArray0[3] = (-25.070090054423353);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-25.070090054423353);
      doubleArray1[1] = (-25.070090054423353);
      doubleArray1[3] = (-790.1827908921);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-25.070090054423353));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-25.070090054423353);
      doubleArray0[2] = (-25.070090054423353);
      doubleArray0[3] = (-25.070090054423353);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-25.070090054423353);
      doubleArray1[3] = (-790.1827908921);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-25.070090054423353));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = (-790.1827908921);
      doubleArray1[4] = 2042.49228;
      doubleArray1[5] = 1.656563775043196E-12;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = (-2637.9854767651113);
      doubleArray0[8] = (-2637.9854767651113);
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = (-2637.9854767651113);
      doubleArray1[4] = (-25.070090054423353);
      doubleArray1[5] = (-25.070090054423353);
      doubleArray1[6] = (-25.070090054423353);
      doubleArray1[7] = 0.08325;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-7.827773875398356);
      doubleArray0[1] = (-7.827773875398356);
      doubleArray0[2] = 251.8865931;
      doubleArray0[3] = (-7.827773875398356);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 5811.7274;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-7.827773875398356));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 0.08325;
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 0.08325;
      doubleArray1[2] = 0.08325;
      doubleArray1[3] = (-2637.9854767651113);
      doubleArray1[4] = (-25.070090054423353);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2042.49228;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.08325;
      doubleArray1[1] = 0.08325;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector(853413529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 853413529
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(9, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(9, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 5995.745618094018);
      assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = 0.08325;
      doubleArray0[3] = (-0.7295738714474347);
      doubleArray0[5] = 2042.49228;
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = (-0.7295738714474347);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.7295738714474347));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(853413529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 853413529
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5811.7274);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
