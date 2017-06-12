/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Thu Jan 12 19:21:31 GMT 2017
 */


package org.apache.commons.math.distribution;

import org.evosuite.runtime.GuiSupport;
import org.junit.BeforeClass;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import org.junit.Rule;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;
import org.evosuite.runtime.thread.ThreadStopper;

@EvoSuiteClassExclude
public class FDistributionImpl_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math.distribution.FDistributionImpl";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        FDistributionImpl_ESTest_scaffolding.setSystemProperties();
        FDistributionImpl_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(FDistributionImpl_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math.FunctionEvaluationException", "org.apache.commons.math.analysis.UnivariateRealSolver", "org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.special.Beta$1", "org.apache.commons.math.MathException", "org.apache.commons.math.analysis.UnivariateRealSolverUtils", "org.apache.commons.math.special.Beta", "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "org.apache.commons.math.distribution.ContinuousDistribution", "org.apache.commons.math.ConvergenceException", "org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.distribution.AbstractContinuousDistribution", "org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.special.Gamma$1", "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl", "org.apache.commons.math.MaxIterationsExceededException", "org.apache.commons.math.distribution.FDistribution", "org.apache.commons.math.util.ContinuedFraction", "org.apache.commons.math.special.Gamma", "org.apache.commons.math.analysis.UnivariateRealSolverFactory", "org.apache.commons.math.distribution.Distribution", "org.apache.commons.math.distribution.AbstractDistribution", "org.apache.commons.math.distribution.AbstractContinuousDistribution$1");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(FDistributionImpl_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math.distribution.AbstractDistribution", "org.apache.commons.math.distribution.AbstractContinuousDistribution", "org.apache.commons.math.distribution.FDistributionImpl", "org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Beta", "org.apache.commons.math.util.ContinuedFraction", "org.apache.commons.math.special.Beta$1", "org.apache.commons.math.analysis.UnivariateRealSolverUtils", "org.apache.commons.math.analysis.UnivariateRealSolverImpl", "org.apache.commons.math.analysis.BrentSolver");
    }
}

