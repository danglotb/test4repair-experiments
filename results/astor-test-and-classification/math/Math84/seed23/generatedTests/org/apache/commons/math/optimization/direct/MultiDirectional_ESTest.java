/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 06:16:18 GMT 2017
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiDirectional_ESTest extends MultiDirectional_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1017.678;
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 1017.678);
      realPointValuePairArray0[0] = realPointValuePair0;
      double[] doubleArray1 = new double[2];
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray1, 0.0, true);
      realPointValuePairArray0[1] = realPointValuePair1;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1017.678;
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 1017.678);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[2];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.0);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray0, 0.0, true);
      realPointValuePairArray0[2] = realPointValuePair1;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-2076.274161858918), (-2076.274161858918));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[2];
      double[] doubleArray0 = new double[0];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-2076.274161858918), true);
      realPointValuePairArray0[0] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray0 = new double[1];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.0);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.setMaxEvaluations(0);
      multiDirectional0.simplex = realPointValuePairArray0;
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of evaluations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-3397.421857891395), 1524.860582265);
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[0];
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-391.0), Double.NaN);
      multiDirectional0.setMaxIterations((-43));
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-43) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
