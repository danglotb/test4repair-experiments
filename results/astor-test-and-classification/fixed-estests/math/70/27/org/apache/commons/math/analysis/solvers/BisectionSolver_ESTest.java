/**
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 12:50:11 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 1.0E-15, (-2295.253655695094));
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), (-4469.0), (-622.1103372737), (-4469.0));
        Assert.assertEquals(31, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-622.1103377215369), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        bisectionSolver0.setMaximalIterationCount(1073741824);
        bisectionSolver0.setAbsoluteAccuracy(0.0);
        double double0 = bisectionSolver0.solve(univariateRealFunction0, (-240.201), 0.0);
        Assert.assertEquals(1082, bisectionSolver0.getIterationCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 0.0, 1171.988137302);
        Assert.assertEquals(30, bisectionSolver0.getIterationCount());
        Assert.assertEquals(2.728747523627244E-7, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.solve(7.57453255414339E-18, 2.5E-16, 0.0);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.setAbsoluteAccuracy(1.0E-15);
        double double0 = bisectionSolver0.solve((-3415.77281), 1.0E-14);
        Assert.assertEquals(61, bisectionSolver0.getIterationCount());
        Assert.assertEquals(8.515864389257422E-19, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve((-999.035108245), 4542.0);
        Assert.assertEquals(32, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-2.874656307713965E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.setAbsoluteAccuracy(0.0);
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 0.5, 0.0);
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
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 1.0E-15, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), (-1540.4673884252793), (-161.5));
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
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, (-1070.85824378272), (-1198.4997905));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, -1,070.858]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 362.99, 362.99);
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
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(1.0E-15, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.setAbsoluteAccuracy(1.0E-15);
        try {
            bisectionSolver0.solve((-3415.77281), (-36.1896767956));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (100) exceeded
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
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-4838.87491662392), 1.0E-15);
        Assert.assertEquals(32, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-2280.7962665931536), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        bisectionSolver0.setMaximalIterationCount((-222));
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), (-1496.807206), 388.9625744853968);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-222) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve((-1810.0), 3909.4);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        bisectionSolver0.setMaximalIterationCount(4);
        try {
            bisectionSolver0.solve((-4469.0), 0.0, (-622.1103377215369));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (4) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = bisectionSolver0.solve((-4469.0), 0.0, (-622.1103377215369));
        Assert.assertEquals(32, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-0.9999999508145265), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 1.986896103158498E-22, 1.986896103158498E-22, (-240.201));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        SinFunction sinFunction0 = new SinFunction();
        {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-2068.0), (-818.640299514154), 1.0E-15);
        }
    }
}

