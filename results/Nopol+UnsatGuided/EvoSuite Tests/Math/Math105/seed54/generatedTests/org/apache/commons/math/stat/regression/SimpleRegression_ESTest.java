/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 03:51:09 GMT 2017
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
        simpleRegression0.getSlopeConfidenceInterval((-2550.232493529));
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
        simpleRegression0.getSlopeConfidenceInterval(259.307163);
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
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1025.09675;
      doubleArray1[1] = (-3554.624862620441);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[1] = (-3554.624862620441);
      doubleArray0[1] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getR();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[2][5];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getRSquare();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(0.0, 0.0);
      simpleRegression0.addData(1.0, 1.0);
      double double0 = simpleRegression0.predict(0.0);
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-1.0), 0.0);
      simpleRegression0.addData(1.0, 1.0);
      double double0 = simpleRegression0.predict((-81.333443969));
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-40.1667219845), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(0.0, 0.0);
      simpleRegression0.addData(1.0, 1.0);
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(0.0, simpleRegression0.getIntercept(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(1.0E-8, 1.0E-8);
      simpleRegression0.addData(1.0E-8, 1.0E-8);
      simpleRegression0.addData((-1854.757081), (-1854.757081));
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-1.0), (-1.0));
      simpleRegression0.addData(1.0592496418124475, 1.0592496418124475);
      simpleRegression0.addData(1.0, 1.0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval(0.05);
      assertEquals(2.748006535786532, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData(4.9E-323, 4.9E-323);
      simpleRegression0.addData((-1.0), (-1.0));
      simpleRegression0.addData(311.28, 218.8585587171022);
      double double0 = simpleRegression0.getSlopeConfidenceInterval(0.7035706966141225);
      assertEquals(0.7035706966141225, simpleRegression0.getSlope(), 0.01);
      assertEquals(4.137354635422072E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[4][8];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(2600.867578281, 0.0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][2];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 5185.673;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = 2195.52040991;
      doubleArray0[1] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals((-1.1809667030634832), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-1.0), (-1.0));
      simpleRegression0.addData(1.0592496418124475, 1.0592496418124475);
      simpleRegression0.addData(1.0, 1.0);
      double double0 = simpleRegression0.getSignificance();
      assertEquals(1.0, simpleRegression0.getSlope(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[4][8];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.getSignificance();
      assertEquals(4L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[4][8];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData(2600.867578281, 0.0);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(5L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.addData((-1242.07135313), (-1242.07135313));
      long long0 = simpleRegression0.getN();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 6.283185307179586;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      simpleRegression0.addData((-181.1), 5197.067882258404);
      doubleArray0[2] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(4L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][2];
      simpleRegression0.addData(0.0, 0.0);
      simpleRegression0.addData(1.0, 1.0);
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(5L, simpleRegression0.getN());
      assertEquals((-3.700743415417188E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 6.283185307179586;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      simpleRegression0.addData((-181.1), 5197.067882258404);
      doubleArray0[2] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getInterceptStdErr();
      assertEquals(2.025713592960139E7, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1025.09675;
      doubleArray1[1] = (-3554.624862620441);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(2L, simpleRegression0.getN());
      assertEquals((-2.2737367544323206E-13), double0, 0.01);
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
      double[][] doubleArray0 = new double[1][0];
      // Undeclared exception!
      try { 
        simpleRegression0.addData(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[4][8];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 6.283185307179586;
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
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
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 5185.673;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = 2195.52040991;
      doubleArray0[1] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getR();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals((-0.49999999999999994), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getR();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 6.283185307179586;
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[3][8];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getInterceptStdErr();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      long long0 = simpleRegression0.getN();
      assertEquals(0L, long0);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
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
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.predict(0.0);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
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
}