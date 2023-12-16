package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportSpiceJet {
	public static ExtentReports getreport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Aravind\\eclipse-workspace\\Spicejet\\reports\\report.html");
		reporter.config().setReportName("SpiceJet test");
		reporter.config().setDocumentTitle("test reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
		
	}

}
