/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 15:25:44 GMT 2017
 */

package org.apache.commons.math.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.regression.SimpleRegression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleRegression_ESTest extends SimpleRegression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(240.360952);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3332.0);
      doubleArray0[1] = (-3332.0);
      double[][] doubleArray1 = new double[5][2];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      simpleRegression0.addData(doubleArray1);
      simpleRegression0.addData(0.0, (-3332.0));
      double double0 = simpleRegression0.getR();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][4];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 57.15623566586292;
      doubleArray1[1] = (-722.37701338);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.predict(965.6990317);
      assertEquals(6L, simpleRegression0.getN());
      assertEquals((-12205.121177356525), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1408.6289376959817, 1.627687708827525E7);
      simpleRegression0.addData(1.627687708827525E7, 1.627687708827525E7);
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(0.0, simpleRegression0.getSlope(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1408.6289376959817, 1.627687708827525E7);
      simpleRegression0.addData(1.627687708827525E7, 1.627687708827525E7);
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-952.355), (-952.355));
      simpleRegression0.addData((-1768.193410332683), 2845.7047);
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-9.313225746154785E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0E-14, 1.0E-14);
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1808.0475, 1808.0475);
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(1808.0475, 1808.0475);
      double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
      assertEquals(2179357.1748375, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[4][2];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
      assertEquals(4L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0E-14, 1.0E-14);
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(6.666666666666667E-29, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-3442.7), 272.876860463);
      simpleRegression0.addData(272.876860463, 272.876860463);
      simpleRegression0.addData((-747.538865531), (-542.963));
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(443729.7852801915, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(3.0172137315571144, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][4];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 57.15623566586292;
      doubleArray1[1] = (-722.37701338);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals((-12.63863872356881), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][4];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.getSignificance();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[5][6];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1487.4527353684;
      doubleArray1[1] = 1487.4527353684;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[1] = 1487.4527353684;
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray1;
      doubleArray0[4] = doubleArray0[0];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      long long0 = simpleRegression0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3332.0);
      double[][] doubleArray1 = new double[5][2];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      simpleRegression0.addData(doubleArray1);
      simpleRegression0.addData(0.0, (-3332.0));
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getInterceptStdErr();
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1808.0475, 1808.0475);
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-952.355), (-952.355));
      simpleRegression0.addData(1.0, (-952.355));
      double double0 = simpleRegression0.getIntercept();
      assertEquals(0.0, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals((-952.355), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][7];
      simpleRegression0.addData(doubleArray0);
      // Undeclared exception!
      simpleRegression0.getSlopeConfidenceInterval(3.399464998481189E-5);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.addData((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[9][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[1] = doubleArray1;
      // Undeclared exception!
      try { 
        simpleRegression0.addData(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[2][9];
      simpleRegression0.addData((-3580.4040758571787), 298.49);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals((-7.275957614183426E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][4];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 57.15623566586292;
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][4];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlope();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval((-709.3023));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][4];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 57.15623566586292;
      doubleArray1[1] = (-722.37701338);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getR();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals((-0.9999999999999999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getR();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0E-14, 1.0E-14);
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSignificance();
      assertEquals(6.666666666666667E-29, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][7];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getRSquare();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      long long0 = simpleRegression0.getN();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.clear();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.predict(1116.2371764);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0E-14, 1.0E-14);
      double[][] doubleArray0 = new double[1][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getInterceptStdErr();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSignificance();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getIntercept();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
  }
}