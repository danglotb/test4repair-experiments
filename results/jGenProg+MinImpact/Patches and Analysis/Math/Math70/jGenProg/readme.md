
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
index 180caef..3f66927 100644
--- a/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
+++ b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java
@@ -69,7 +69,7 @@ public class BisectionSolver extends UnivariateRealSolverImpl {
     /** {@inheritDoc} */
     public double solve(final UnivariateRealFunction f, double min, double max, double initial)
         throws MaxIterationsExceededException, FunctionEvaluationException {
+        return solve(f, min, max);
-        return solve(min, max);
     }
 
     /** {@inheritDoc} */
```


## Patch Original jGenProg 

[org.apache.commons.math.analysis.solvers.BisectionSolver:72](https://github.com/apache/commons-math/blob/58f8b21d3587e1419f0a421731280f84a8c0afe4/src/main/java//org/apache/commons/math/analysis/solvers/BisectionSolver.java#L72) (Suspicious rank: ample 1, jaccard 1, ochiai 1, naish1 16589, gp13 1, naish2 1, tarantula 1, )

Patch type: REPLACE 
 
```Java
return solve(f, min, max)
```

Execution time: 0:01:38.100000

Grid5000 node: graphene-42.nancy.grid5000.fr

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 2 #  jGenProg+MinImpact With Seed 1

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 2

## Patch 3 #  jGenProg+MinImpact With Seed 2

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 3

## Patch 4 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact With Seed 3

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 4

## Patch 6 #  jGenProg+MinImpact With Seed 4

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 7 #  jGenProg+MinImpact With Seed 4

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 5

## Patch 8 #  jGenProg+MinImpact With Seed 5

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 5


--- 
#Seed: 6

## Patch 9 #  jGenProg+MinImpact With Seed 6

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2



## Patch 10 #  jGenProg+MinImpact With Seed 6

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 7

## Patch 11 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 12 #  jGenProg+MinImpact With Seed 7

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 8

## Patch 13 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact With Seed 8

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 9

## Patch 15 #  jGenProg+MinImpact With Seed 9

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 16 #  jGenProg+MinImpact With Seed 9

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 10

## Patch 17 #  jGenProg+MinImpact With Seed 10

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 18 #  jGenProg+MinImpact With Seed 10

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 11

## Patch 19 #  jGenProg+MinImpact With Seed 11

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 0



## Patch 20 #  jGenProg+MinImpact With Seed 11

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 12

## Patch 21 #  jGenProg+MinImpact With Seed 12

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 13

## Patch 22 #  jGenProg+MinImpact With Seed 13

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 23 #  jGenProg+MinImpact With Seed 13

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 14

## Patch 24 #  jGenProg+MinImpact With Seed 14

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 25 #  jGenProg+MinImpact With Seed 14

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 15

## Patch 26 #  jGenProg+MinImpact With Seed 15

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact With Seed 15

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 16

## Patch 28 #  jGenProg+MinImpact With Seed 16

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 29 #  jGenProg+MinImpact With Seed 16

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 17

## Patch 30 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 31 #  jGenProg+MinImpact With Seed 17

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 18

## Patch 32 #  jGenProg+MinImpact With Seed 18

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 1:57 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 19

## Patch 33 #  jGenProg+MinImpact With Seed 19

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 2:01 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 34 #  jGenProg+MinImpact With Seed 19

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 20

## Patch 35 #  jGenProg+MinImpact With Seed 20

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 36 #  jGenProg+MinImpact With Seed 20

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 21

## Patch 37 #  jGenProg+MinImpact With Seed 21

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 2



## Patch 38 #  jGenProg+MinImpact With Seed 21

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 6


--- 
#Seed: 22

## Patch 39 #  jGenProg+MinImpact With Seed 22

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact With Seed 22

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 4


--- 
#Seed: 23

## Patch 41 #  jGenProg+MinImpact With Seed 23

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 42 #  jGenProg+MinImpact With Seed 23

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 24

## Patch 43 #  jGenProg+MinImpact With Seed 24

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 44 #  jGenProg+MinImpact With Seed 24

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 25

## Patch 45 #  jGenProg+MinImpact With Seed 25

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 46 #  jGenProg+MinImpact With Seed 25

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 26

## Patch 47 #  jGenProg+MinImpact With Seed 26

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact With Seed 26

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 27

## Patch 49 #  jGenProg+MinImpact With Seed 27

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact With Seed 27

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 22

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 28

## Patch 51 #  jGenProg+MinImpact With Seed 28

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 52 #  jGenProg+MinImpact With Seed 28

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 2


--- 
#Seed: 29

## Patch 53 #  jGenProg+MinImpact With Seed 29

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 1



## Patch 54 #  jGenProg+MinImpact With Seed 29

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 21

Nb of Failing EvoSuite Tests: 3


--- 
#Seed: 30

## Patch 55 #  jGenProg+MinImpact With Seed 30

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, min, max)

```


Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 1



## Patch 56 #  jGenProg+MinImpact With Seed 30

org.apache.commons.math.analysis.solvers.BisectionSolver : 72

Patch type: ReplaceOp

```Java

return solve(f, initial, max)

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 23

Nb of Failing EvoSuite Tests: 4


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 21.32

Average Nb of Failing EvoSuite Tests: 2.09

Average Nb of Test-adequate patches: 1.87

---