package utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Projectspecification;

public class ListenerSpiceJet extends Projectspecification implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtendReportSpiceJet.getreport();
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");
		System.out.println("test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	test.fail(result.getThrowable());
	String filepath = null;
	try {
		 filepath = takescreenshot(result.getMethod().getMethodName());
	} catch (IOException e) {
		e.printStackTrace();
	}
	test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("test skipped");
	}


	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}


}
