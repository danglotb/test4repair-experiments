/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 00:20:39 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.8072814856895896);
      doubleArray0[1] = (-1.8072814856895896);
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-20.494417166492923));
      eigenDecompositionImpl0.getVT();
      assertEquals(3.26626636851637, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[3] = 27.0;
      doubleArray0[6] = (-2260.0);
      doubleArray0[7] = (-2260.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2260.0);
      doubleArray1[1] = (-2260.0);
      doubleArray1[3] = 27.0;
      doubleArray1[4] = (-2260.0);
      doubleArray1[5] = 27.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals((-1.6455266024363932E27), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.2599210498948732);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[2] = 1621.31973;
      doubleArray0[3] = 27.0;
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1621.31973);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
      assertEquals(0.4636476090008061, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2260.0);
      doubleArray0[6] = (-1711.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0E-13);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
      assertEquals((-0.4636476090008061), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(7);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(4);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2259.521039645514);
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[2] = (-2259.521039645514);
      doubleArray0[4] = (-2259.521039645514);
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[6] = (-1711.0);
      doubleArray0[7] = 3051.1801669;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.1801669;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(2.3407112968702122E27, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[2] = 1621.31973;
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[0] = (-1711.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1621.31973);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-3.321278244662596E15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2113);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2113
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 0.0);
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
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, (-942.2794797265291));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 13.0;
      doubleArray0[1] = 13.0;
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.4161468365471424));
      eigenDecompositionImpl0.getVT();
      assertEquals(169.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[6] = (-1711.0);
      doubleArray0[7] = 3035.7029122021518;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3035.7029122021518;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 1621.31973;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(2.704837678798648E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[7] = 3051.2703160492742;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.2703160492742;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 27.0;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(3.553930668535127E11, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[3] = 27.0;
      doubleArray0[5] = (-2260.0);
      doubleArray0[6] = (-2260.0);
      doubleArray0[7] = 3051.18;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.18;
      doubleArray1[1] = (-2260.0);
      doubleArray1[2] = (-2260.0);
      doubleArray1[3] = 27.0;
      doubleArray1[4] = (-2260.0);
      doubleArray1[5] = 27.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(1.694502282491524E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[6] = (-1711.0);
      doubleArray0[7] = 2223.0457078396;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2223.0457078396;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 0.4636476090008061;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(1.1933472356925147E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[3] = 27.0;
      doubleArray0[5] = (-2260.0);
      doubleArray0[6] = (-2260.0);
      doubleArray0[7] = 3051.18;
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-2260.0);
      doubleArray1[3] = 27.0;
      doubleArray1[4] = (-2260.0);
      doubleArray1[5] = 27.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[4] = 0.4636476090008061;
      doubleArray0[5] = 2290.204006019856;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.1801669;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 1621.31973;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[3] = 27.0;
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[6] = (-1711.0);
      doubleArray0[7] = 3051.1801669;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2260.0);
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 0.4636476090008061;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(1.6928028551981367E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[3] = 27.0;
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[6] = (-1711.0);
      doubleArray0[7] = 3051.2703160492742;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.2703160492742;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 27.0;
      doubleArray1[5] = 2290.204006019856;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(3.0857731839431583E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = (-1711.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3035.7029122021518;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      doubleArray1[4] = 1621.31973;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(1.119458427164896E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2259.521039645514);
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[2] = (-2259.521039645514);
      doubleArray0[4] = (-2259.521039645514);
      doubleArray0[5] = 2290.204006019856;
      doubleArray0[7] = 3051.1801669;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.1801669;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      assertEquals(6.265928836359872E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2259.521039645514);
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[2] = (-2259.521039645514);
      doubleArray0[4] = (-2259.521039645514);
      doubleArray0[7] = 3051.1801669;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.1801669;
      doubleArray1[4] = 0.4636476090008061;
      doubleArray1[5] = 2290.204006019856;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      assertEquals(8.165985036956185E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4636476090008061);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 3550.632782800667);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2259.521039645514);
      doubleArray0[3] = 27.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[0] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2260.0);
      doubleArray0[3] = 27.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2260.0);
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[3] = 2290.204006019856;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 2271.1470707588037;
      doubleArray1[4] = 1621.31973;
      doubleArray1[5] = 2271.1470707588037;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[7] = 3051.1801669;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 3051.1801669;
      doubleArray1[1] = 0.4636476090008061;
      doubleArray1[2] = 0.4636476090008061;
      doubleArray1[3] = 0.4636476090008061;
      doubleArray1[4] = 1621.31973;
      doubleArray1[5] = 0.4636476090008061;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(1.1309024409479346E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2259.521039645514);
      doubleArray0[1] = 0.4636476090008061;
      doubleArray0[2] = (-2259.521039645514);
      doubleArray0[4] = (-2259.521039645514);
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[5] = 9.0;
      doubleArray1[6] = 0.4636476090008061;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(932);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 932
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-20.494417166492923));
      eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 551
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0E-13);
      eigenDecompositionImpl0.getD();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2259.521039645514));
      eigenDecompositionImpl0.getSolver();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 3550.632782800667);
      try { 
        eigenDecompositionImpl1.getEigenvector(932);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 932
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 9.0;
      doubleArray0[4] = 9.0;
      doubleArray0[6] = (-1711.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 9.0;
      doubleArray1[2] = 9.0;
      doubleArray1[3] = 9.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 3550.632782800667);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0E-13);
      eigenDecompositionImpl0.getRealEigenvalue(4);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2260.0));
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
