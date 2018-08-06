c:
cd C:\Automation\Katalon_Studio_Windows_64-5.5
katalon -noSplash  -runMode=console -consoleLog -projectPath="D:\Jenkins\KatalonAutomationTest\workspace\KL1.prj" -retry=0 -testSuitePath="Test Suites/TestSuiteKL" -executionProfile="default" -browserType="Chrome"
