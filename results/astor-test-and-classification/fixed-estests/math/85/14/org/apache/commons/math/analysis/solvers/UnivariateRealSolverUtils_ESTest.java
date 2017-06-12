/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 12:28:27 GMT 2017
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

public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), Double.NaN, 0.25, 1.5);
        Assert.assertArrayEquals(new double[]{ Double.NaN , Double.NaN }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), 0.0, 0.0, 0.0, 0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // bad value for maximum iterations number: 0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (expm1Function0)));
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (monitoredFunction0)), 0.0, 2416.923166278, 3900.7187582908);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (monitoredFunction0)), 0.0, 4628.817102396907, 4628.817102396907);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals(4628.817102396907, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (quinticFunction0)), (-1.0), 0.0, (-1.0));
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 1455.14);
        Assert.assertEquals(1396.4379345034567, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, (-1969.682612986), 0.0);
        Assert.assertEquals((-1969.682612986), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double double0 = UnivariateRealSolverUtils.midpoint(2436.25, 2758.4778);
        Assert.assertEquals(2597.3639000000003, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double double0 = UnivariateRealSolverUtils.midpoint((-2091), (-2091));
        Assert.assertEquals((-2091.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, (-716.1564));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, -716.156]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), (-8.474660028692373), (-8.474660028692373), (-8.474660028692373));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=-8.475,  initial=-8.475, upper bound=-8.475
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (null)));
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (monitoredFunction0)), 1884.745348901, (-1028.0), 1884.745348901);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), (-17.340000000000146), (-17.340000000000146), 0.5, 1692);
        Assert.assertArrayEquals(new double[]{ -17.340000000000146 , 0.5 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (monitoredFunction0)), (-1.0), (-313.6), 0.0, 3138);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // number of iterations=313, maximum iterations=3,138, initial=-1, lower bound=-313.6, upper bound=0, final a value=-313.6, final b value=0, f(a)=48,358,286,993.658, f(b)=0.25
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), 1390.5842151531294, 0.0, 1390.5842151531294, 723);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // number of iterations=723, maximum iterations=723, initial=1,390.584, lower bound=0, upper bound=1,390.584, final a value=667.584, final b value=1,390.584, f(a)=132,595,589,564,144.62, f(b)=5,199,794,684,951,787
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), Double.NaN, 0.5, 1.0E-15, 8);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=0.5,  initial=\uFFFD, upper bound=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), 1.0, 1.0, 0.0, 2347);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=1,  initial=1, upper bound=0
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (expm1Function0)), (-1.0), 0.0, 977.72429, 1096);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // invalid bracketing parameters:  lower bound=0,  initial=-1, upper bound=977.724
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), (-1502.555045), 3.942602279953979E13, 1.0E-15, (-333));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // bad value for maximum iterations number: -333
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (null)), (-521.48982707), (-521.48982707), (-521.48982707), 0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function is null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        // Undeclared exception!
        try {
            UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (null)), 0.0, 0.0, 1967.7);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function is null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = UnivariateRealSolverUtils.solve(((UnivariateRealFunction) (expm1Function0)), (-1969.682612986), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        {
            UnivariateRealSolverUtils.bracket(((UnivariateRealFunction) (quinticFunction0)), ((double) (9)), (-1963.776), ((double) (9)));
        }
    }
}

