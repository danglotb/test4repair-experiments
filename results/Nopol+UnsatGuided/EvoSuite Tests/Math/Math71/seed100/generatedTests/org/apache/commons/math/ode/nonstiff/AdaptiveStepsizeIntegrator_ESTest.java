/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 00:09:12 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdaptiveStepsizeIntegrator_ESTest extends AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setInitialStepSize(0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 1062, doubleArray0, 393.55, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TestProblem5 testProblem5_0 = new TestProblem5();
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, 1139.92, 0.8414709848078965, 0.8414709848078965, (double) 5);
      try { 
        adamsMoultonIntegrator0.integrate(testProblem5_0, 505.268194, doubleArray0, 69.7468984627, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.14E03) reached, integration needs 9.45E-01
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.6433927460157636, 0.0012395378837894884, 12.0, 0.0012395378837894884);
      dormandPrince853Integrator0.setInitialStepSize(7.0);
      assertEquals(0.028240213930526222, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-911.0356184414), Double.NaN, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.sanityChecks(testProblem5_0, 0.0, doubleArray0, (-911.0356184414), doubleArray0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-911.0356184414), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3601.7796054, 3601.7796054, 134.2580061679969, 1.9754376857807379);
      highamHall54Integrator0.resetInternalState();
      assertEquals(3601.7796054, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1167.6387409311), (-2284.96), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals((-1167.6387409311), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1633.4037521317032, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1451.4221052817377), (-1103.6013373811704), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1103.6013373811704), double0, 0.01);
      assertEquals(1265.6189697114687, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.filterStep(0.0, true, true);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-695.041), 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        highamHall54Integrator0.sanityChecks(testProblem5_0, (-695.041), doubleArray0, 0.001, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 6
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, (double) 5, (double) 5, 0.0, (double) 5);
      StepProblem stepProblem0 = new StepProblem((double) 5, 0.0, (double) 5);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.sanityChecks(stepProblem0, 0.0, (double[]) null, 1.0E-10, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2142.057684243292), 1.662337662337662, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        highamHall54Integrator0.integrate(testProblem5_0, 1.662337662337662, doubleArray0, 1693.59790493333, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2939.713965069, 1570.8501207259412, 2939.713965069, 761.8212006117491);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) null, 968.1375456467069, doubleArray0, 8.0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-863.4273367448908), (-863.4273367448908), (-863.4273367448908), 49.70653971901085);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[3];
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 463, doubleArray0, 1902.7963282, doubleArray0, doubleArray0, doubleArray0, (double[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0, 1677.66970665734, 1.0, 1677.66970665734);
      StepProblem stepProblem0 = new StepProblem(1677.66970665734, 1677.66970665734, 1.0);
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(stepProblem0, false, 445, doubleArray0, 2.146190261E9, doubleArray0, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3534.918675, 3534.918675, 3534.918675, 3534.918675);
      try { 
        graggBulirschStoerIntegrator0.filterStep((-18), true, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (3.53E03) reached, integration needs 1.80E01
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1461.192303497909);
      doubleArray0[1] = (-1461.192303497909);
      doubleArray0[2] = (-1461.192303497909);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1461.192303497909), (-1461.192303497909), doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, (-5.0), doubleArray1, doubleArray1, doubleArray1, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1406.27964, 0.0, (-1343.95078052737), 2.0);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(1406.27964, double0, 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.1), 1992.8067022956, 0.0, 1992.8067022956);
      double double0 = dormandPrince54Integrator0.getMaxStep();
      assertEquals(46.81973272590479, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1992.8067022956, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3601.7796054, 3601.7796054, 134.2580061679969, 1.9754376857807379);
      double double0 = highamHall54Integrator0.filterStep(134.2580061679969, false, true);
      assertEquals(3601.7796054, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-3601.7796054), double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(660.091323, 0.01, 45.0, 0.01);
      double double0 = graggBulirschStoerIntegrator0.filterStep(100.0, true, true);
      assertEquals(0.01, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2.569224246732854, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-911.0356184414), (-911.0356184414), (-911.0356184414), (-911.0356184414));
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.integrate(testProblem5_0, (-1461.192303497909), doubleArray0, 627.4538379016227, doubleArray0);
      assertEquals(26, testProblem5_0.getCalls());
      assertEquals(911.0356184414, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1139.92, 1139.92, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(1139.92);
      assertEquals(1139.92, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      TestProblem5 testProblem5_0 = new TestProblem5();
      graggBulirschStoerIntegrator0.integrate(testProblem5_0, 5, doubleArray0, 505.268194, doubleArray0);
      assertEquals(1139.92, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3601.7796054, 3601.7796054, 134.2580061679969, 1.9754376857807379);
      highamHall54Integrator0.setInitialStepSize(134.2580061679969);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(3601.7796054, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-911.0356184414), (-911.0356184414), (-911.0356184414), (-911.0356184414));
      dormandPrince54Integrator0.setInitialStepSize(Double.NaN);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(911.0356184414, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }
}