package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportBestBuy {
	
public static ExtentReports getReport() {
		
		ExtentSparkReporter reporter= new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("BestBuy Reporter");
		reporter.config().setDocumentTitle("BestBuy Reporter title");
		
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
		
	}

}