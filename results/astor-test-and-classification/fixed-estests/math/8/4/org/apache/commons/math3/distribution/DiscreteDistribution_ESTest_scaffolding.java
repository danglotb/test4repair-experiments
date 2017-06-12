/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Tue Jan 10 21:22:28 GMT 2017
 */


package org.apache.commons.math3.distribution;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.evosuite.runtime.thread.ThreadStopper;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.GuiSupport;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import org.junit.Rule;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;

@EvoSuiteClassExclude
public class DiscreteDistribution_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math3.distribution.DiscreteDistribution";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        DiscreteDistribution_ESTest_scaffolding.setSystemProperties();
        DiscreteDistribution_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(DiscreteDistribution_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math3.exception.util.ExceptionContextProvider", "org.apache.commons.math3.random.Well44497a", "org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.random.AbstractWell", "org.apache.commons.math3.exception.util.ArgUtils", "org.apache.commons.math3.exception.MathArithmeticException", "org.apache.commons.math3.exception.NumberIsTooSmallException", "org.apache.commons.math3.exception.NotPositiveException", "org.apache.commons.math3.exception.MathInternalError", "org.apache.commons.math3.exception.MathIllegalStateException", "org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.exception.NonMonotonicSequenceException", "org.apache.commons.math3.exception.MathIllegalArgumentException", "org.apache.commons.math3.util.Pair", "org.apache.commons.math3.exception.MathIllegalNumberException", "org.apache.commons.math3.exception.util.LocalizedFormats", "org.apache.commons.math3.distribution.DiscreteDistribution", "org.apache.commons.math3.exception.DimensionMismatchException", "org.apache.commons.math3.exception.util.Localizable", "org.apache.commons.math3.random.Well19937c", "org.apache.commons.math3.exception.NotStrictlyPositiveException", "org.apache.commons.math3.random.RandomGenerator", "org.apache.commons.math3.exception.util.ExceptionContext", "org.apache.commons.math3.random.TestRandomGenerator", "org.apache.commons.math3.exception.NullArgumentException", "org.apache.commons.math3.random.AbstractRandomGenerator", "org.apache.commons.math3.random.Well19937a", "org.apache.commons.math3.random.Well512a");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(DiscreteDistribution_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math3.exception.util.LocalizedFormats", "org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.AbstractWell", "org.apache.commons.math3.random.Well19937c", "org.apache.commons.math3.util.MathArrays", "org.apache.commons.math3.exception.MathArithmeticException", "org.apache.commons.math3.exception.util.ExceptionContext", "org.apache.commons.math3.random.Well19937a", "org.apache.commons.math3.random.Well512a", "org.apache.commons.math3.random.Well1024a", "org.apache.commons.math3.random.Well44497a", "org.apache.commons.math3.random.Well44497b", "org.apache.commons.math3.random.MersenneTwister", "org.apache.commons.math3.random.ISAACRandom", "org.apache.commons.math3.util.FastMath", "org.apache.commons.math3.random.JDKRandomGenerator", "org.apache.commons.math3.random.RandomAdaptor", "org.apache.commons.math3.exception.MathIllegalArgumentException", "org.apache.commons.math3.exception.MathIllegalNumberException", "org.apache.commons.math3.exception.NumberIsTooSmallException", "org.apache.commons.math3.exception.NotPositiveException", "org.apache.commons.math3.util.FastMathLiteralArrays", "org.apache.commons.math3.util.FastMath$lnMant", "org.apache.commons.math3.exception.NotStrictlyPositiveException");
    }
}

