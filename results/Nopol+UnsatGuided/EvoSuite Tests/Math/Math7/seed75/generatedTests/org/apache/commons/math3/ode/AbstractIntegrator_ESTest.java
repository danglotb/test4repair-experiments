/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 04:15:44 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(3, 1892.5489835678952, 1892.5489835678952, 1892.5489835678952, 1892.5489835678952);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      expandableStatefulODE0.setTime(62.5);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (-1112.73));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-1.0));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[8];
      testProblem5_0.setInitialConditions(0.0, doubleArray0);
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 4.94E-321, doubleArray0, (-1.0), testProblem5_0.errorScale);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 8
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(5.746280211439194);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[7];
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 5.746280211439194, doubleArray0, 1429.35, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-3140.66448107));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[8];
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 0.2222222222222222, doubleArray0, 0.2222222222222222, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3851.778304115624, 3851.778304115624, 3851.778304115624, 3851.778304115624);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      expandableStatefulODE0.setTime(3863.3118489225803);
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3851.778304115624);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.2728353993743053, 62.5);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 62.5, doubleArray0, 0.0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-1.0));
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      TestProblem5 testProblem5_0 = new TestProblem5();
      double double0 = classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 4.94E-321, testProblem5_0.errorScale, (-2.708333333333333), testProblem5_0.errorScale);
      assertEquals((-2.708333333333333), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 3285.03866357006, 3855.9, 0.0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((double) 0, (double) 0, (double) 0, 3850.045251306083);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 3852.2831);
      dormandPrince853Integrator0.addEventHandler((EventHandler) stepProblem0, 0.0, 3852.2831, (-107));
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      expandableStatefulODE0.setTime(3852.2831);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-107) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1664.804, (-577.69055322417), 1664.804, (double) 8);
      StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
      graggBulirschStoerIntegrator0.setMaxEvaluations(5);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepNormalizerOutputTest0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1.0));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(3, 912.2798491756705, 7.105427357601002E-12, doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem(7.105427357601002E-12, (double) 3, 7.105427357601002E-12);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) stepProblem0);
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-451.2658466));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(357.6391179106141, 357.6391179106141, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, (-2894.0763065785595));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      double[] doubleArray0 = new double[4];
      testProblem5_0.setInitialConditions(0.0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.35745590925216675, 2.220446049250313E-13, 2.220446049250313E-13, 3852.2831);
      double[] doubleArray0 = new double[3];
      highamHall54Integrator0.setMaxEvaluations(0);
      try { 
        highamHall54Integrator0.computeDerivatives((-45.5039060898), doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      midpointIntegrator0.setMaxEvaluations((-908));
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(3855.9);
      StepProblem stepProblem0 = new StepProblem(0.008273789163814023, 0.0, 0.0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), (-1333.9354263737), 0.0);
      gillIntegrator0.addEventHandler((EventHandler) stepProblem0, (-389.1), 0.0, 1, (UnivariateSolver) illinoisSolver0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-0.022459085953066622));
      classicalRungeKuttaIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1777.0), (-577.69055322417), (-577.69055322417), 1.0E-7);
      dormandPrince853Integrator0.clearStepHandlers();
      assertEquals(577.69055322417, dormandPrince853Integrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.2728353993743053, 62.5);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.computeDerivatives(0.2728353993743053, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.2728353993743053, 62.5);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 62.5, doubleArray0, 62.5, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.0, 62.5);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 62.5;
      StepProblem stepProblem0 = new StepProblem((-2320.2482564278), 0.0, 1.0);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizer stepNormalizer0 = new StepNormalizer(Double.NaN, (FixedStepHandler) stepNormalizerOutputOverlapTest0, stepNormalizerMode0);
      dormandPrince853Integrator0.addStepHandler(stepNormalizer0);
      dormandPrince853Integrator0.addEventHandler((EventHandler) stepProblem0, 62.5, Double.NaN, 726);
      doubleArray0[1] = 62.5;
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 0.0, doubleArray0, 62.5, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-1.0));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      testProblem5_0.setInitialConditions(0.0, doubleArray0);
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, 4.94E-321, doubleArray0, (-1.0), testProblem5_0.errorScale);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 1
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2.0), (-2.0), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setMaxEvaluations(184);
      StepNormalizerOutputOverlapTest stepNormalizerOutputOverlapTest0 = new StepNormalizerOutputOverlapTest();
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) stepNormalizerOutputOverlapTest0, (double) 184, doubleArray0, (-2.8964095485948707E176), doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (184) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      gillIntegrator0.addEventHandler((EventHandler) stepProblem0, 0.0, 0.0, 2515);
      gillIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.0, 62.5);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      StepProblem stepProblem0 = new StepProblem((-2320.2482564278), 0.0, 1.0);
      dormandPrince853Integrator0.addEventHandler((EventHandler) stepProblem0, 62.5, Double.NaN, 726);
      doubleArray0[1] = 62.5;
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) testProblem5_0, (-1.0), doubleArray0, 1.4092936587687559E13, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,624, \uFFFD], values: [1,623, \uFFFD]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.2728353993743053, 62.5);
      String string0 = dormandPrince853Integrator0.getName();
      assertEquals("Dormand-Prince 8 (5, 3)", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2.0), (-2.0), doubleArray0, doubleArray0);
      Collection<StepHandler> collection0 = dormandPrince54Integrator0.getStepHandlers();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 3847.0454201886696);
      dormandPrince853Integrator0.addEventHandler((EventHandler) stepProblem0, 0.0, 3847.0454201886696, 977);
      TestProblem5 testProblem5_0 = new TestProblem5();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) testProblem5_0);
      expandableStatefulODE0.setTime(3847.310644121083);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, 3,847.311], values: [\uFFFD, 0.265]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-0.022459085953066622));
      double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-1.0));
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(62.5, 62.5, 0.2728353993743053, 62.5);
      int int0 = dormandPrince853Integrator0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(3855.9);
      double double0 = gillIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
