/**
 * This file was automatically generated by EvoSuite
 * Thu Jan 19 22:23:59 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setAbsoluteAccuracy(0.0);
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 5.798414349555969E-6, 241.95);
        Assert.assertEquals(53, bisectionSolver0.getIterationCount());
        Assert.assertEquals(241.95, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-1.0), 645.430432, (-1.0));
        Assert.assertEquals(29, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-0.999999698982373), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve((-1063.69), 1616.123939708114, (-1063.69));
        Assert.assertEquals(31, bisectionSolver0.getIterationCount());
        Assert.assertEquals(1.3182474408642164E-7, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = bisectionSolver0.solve((-1091.9), (-1.0), (-1.0));
        Assert.assertEquals(30, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-1.000000253994949), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.solve(0.0, 1.0E-15);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = bisectionSolver0.solve((-218.88335864530038), 0.0);
        Assert.assertEquals(27, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-4.077020262280486E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (monitoredFunction0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (monitoredFunction0)), (-4.077020262280486E-7), (-218.88335864530038), (-218.88335864530038));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-0, -218.883]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.setAbsoluteAccuracy((-1.0));
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-1546.927), (-1.0), (-1546.927));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 3139.2882, 1426.2850656429);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [3,139.288, 1,426.285]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), 426.307, 4204.106002788);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (monitoredFunction0)));
        bisectionSolver0.setMaximalIterationCount((-3));
        try {
            bisectionSolver0.solve((-1091.9), (-1.0), (-1.0));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-3) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 272.81202869, 272.81202869);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(573.906544, 573.906544);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [573.907, 573.907]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount((-1366));
        try {
            bisectionSolver0.solve((-1630.209487701199), ((double) (-1366)));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-1,366) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BisectionSolver bisectionSolver0 = null;
        try {
            bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function to solve cannot be null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-379.87193090581), 0.0);
        Assert.assertEquals(28, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-56.54866788172306), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        bisectionSolver0.setMaximalIterationCount((-1311));
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 0.0, 4329.7063139);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-1,311) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 1.0E-15, 1.0E-14);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 0.0, (-240.33183787820218));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 5.798414349555969E-6);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 1.0E-6, 1094.3440404217, 1094.3440404217);
        }
    }
}

