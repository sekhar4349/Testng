@echo 

set projectLocation=F:\swp\Hybrid_TestNG

cd /d %projectLocation%

java -cp "%projectLocation%\bin;%projectLocation%\lib\*" org.testng.TestNG "%projectLocation%\testng.xml"
pause
