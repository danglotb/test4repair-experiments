import unittest
from pprint import pprint

from src.bet.ParserBugExposingJSON import *

from src.bet.AstorPatchOverfitClassifier import *

pathToTest4Repair = "/Users/matias/develop/results/test4Repair/jsontest4repair/test4repair-experiments/"
JSONASTORFolder = "/results/jGenProg+MinImpact/Patches and Analysis/"
JSONBETFolder = "/results/astor-test-and-classification/"

class ClassificationTest(unittest.TestCase):

    def testParseBetJSON(self):
        jsonParentFolder =  "results/astor-test-and-classification"
        fbug = os.path.join(pathToTest4Repair, jsonParentFolder)
        result = parseTBetJSONFile(fbug)

        self.assertNotEquals(result["time4"],None)

        self.assertTrue(len(result.keys())> 0 )

    def testPatchOverfitClassifMath_50_Seed1_AOverfitting(self):


        jsonbet = parseTBetJSONFile("../../data/datajsonbet/")

        bugfolder = "../../data/datajsonbet/Math50/jGenProg/seed_1"
        bugidentified = "Math50"
        aoverseed, boverseed = classifyPatchesFromTrial(bugfolder, bugid= bugidentified, jsonBetData=jsonbet)
        print("Patches a-over: ")
        print(*aoverseed,sep="\n")
        self.assertTrue(len(aoverseed)>0)
        self.assertTrue("org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_ReplaceOp" in aoverseed)

        print("\nPatches b-over: ")
        print(*boverseed, sep="\n")

    def testPatchOverfitClassifMath_50_Seed_10_BOverfitting(self):

            jsonbet = parseTBetJSONFile("../../data/datajsonbet/")

            bugfolder = "../../data/datajsonbet/Math50/jGenProg/seed_10"

            bugidentified = "Math50"

            aoverseed, boverseed = classifyPatchesFromTrial(bugfolder, bugid=bugidentified, jsonBetData=jsonbet)
            print("Patches a-over: ")
            print(*aoverseed, sep="\n")

            print("\nPatches b-over: ")
            print(*boverseed, sep="\n")

            self.assertTrue("org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp" in boverseed)
            self.assertTrue(len(boverseed) > 0)

    def testOverfiting_Math_50_b_overfitting_allSeed(self):

            jsonbet = parseTBetJSONFile("../../data/datajsonbet/")

            result_a_overfit,result_b_overfit =  classifyAstorPatchesFromBugId("../../data/datajsonbet/","Math50",jsonbet)
            print("\nSummary a-over:")
            print(result_a_overfit)
            pprint(result_a_overfit)


            patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

            found = False
            for result in result_a_overfit:
                if result["patch"] == patchTest:
                    found = True
                    self.assertEqual(10, result["count_overfit"])
            self.assertTrue(found)

            # now, let's evaluate each trial: a-overfitting is seed 11,15,17,18,20,23,28,29,3,32
            bugidentified = "Math50"
            seedWithPatchOverfitted = [11,15,17,18,20,23,28,29,3,32]
            for seed in range(1, 13):
                bugfolder = "../../data/datajsonbet/Math50/jGenProg/seed_" + str(seed)
                a_over_seed, b_over_seed = classifyPatchesFromTrial(bugfolder, bugid=bugidentified, jsonBetData=jsonbet)
                isOverfit = any((patchTest in s for s in a_over_seed))
                if seed in seedWithPatchOverfitted:
                    self.assertTrue(isOverfit)
                else:
                    self.assertFalse(isOverfit)

    def testOverfiting_Math_50_b_overfitting_allSeed(self):

            jsonbet = parseTBetJSONFile("../../data/datajsonbet/")

            result_a_overfit,result_b_overfit =  classifyAstorPatchesFromBugId("../../data/datajsonbet/","Math50",jsonbet)

            print("\nSummary b-over:")
            pprint(result_b_overfit)

            patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

            found = False
            for result in result_b_overfit:
                if result["patch"] == patchTest:
                    found = True
                    self.assertEqual(4, result["count_overfit"])
            self.assertTrue(found)

            #now, let's evaluate each trial: b-overfitting is seed 10, 17, 6 ,2.
            bugidentified = "Math50"
            seedWithPatchOverfitted = [2,6,10,17]
            for seed in range(1,13):
                bugfolder = "../../data/datajsonbet//Math50/jGenProg/seed_"+str(seed)
                aoverseed,boverseed = classifyPatchesFromTrial(bugfolder, bugid=bugidentified, jsonBetData=jsonbet)
                isOverfit = any((patchTest in s for s in boverseed))
                if seed in seedWithPatchOverfitted:
                    self.assertTrue(isOverfit)
                else:
                    self.assertFalse(isOverfit)

    def testOverfiting_MultipleBugsAllSeed(self):

        jsonbet = parseTBetJSONFile("../../data/datajsonbet/")
        result = classifyAstorPatchesFromProject("../../data/datajsonbet/",jsonbet)
        print("Results: ")
        print(result)
        patchTest = "org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.commons.math.analysis.solvers.BaseSecantSolver.this.allowed = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE_ReplaceOp"

        patchFound = False
        for bugs in result:
            bugid = bugs["bugid"]
            if bugid == "Math50":
                #isOverfit = any((patchTest in s for s in bugs['a_overfit']))
                for overfitted in  bugs['a_overfit']:
                    if overfitted["patch"] == patchTest:
                        patchFound = True
                        self.assertTrue(overfitted["count_overfit"]>0)

        self.assertTrue(patchFound)


    def testRunCompleteExperiment(self):
        jsonbet = parseTBetJSONFile(pathToTest4Repair + JSONBETFolder)
        path = (pathToTest4Repair + JSONASTORFolder)
        runExperiment( path ,jsonbet)