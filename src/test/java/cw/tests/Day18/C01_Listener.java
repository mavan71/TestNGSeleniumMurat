package cw.tests.Day18;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class C01_Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("\t" + result.getName() + " isimli testimiz basladi");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("\t" + result.getName() + " isimli testimiz basariyla sonuclandi...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("\t" + result.getName() + " isimli testimiz basarisiz oldu...");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("\t" + result.getName() + " isimli testimiz skip edildi...");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("\t" + result.getTestName() + " isimli testimiz timeout ile fail oldu...");

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Test execution basladigi an...");
        System.out.println("Baslangic saati:" + context.getStartDate().toString());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution sona erdigi an...");
        System.out.println("Bitis saati:" + context.getEndDate().toString());
        System.out.println("-----------------------------------------------------------");
    }
}









