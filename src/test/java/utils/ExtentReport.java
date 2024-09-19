package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    public static ExtentReports configExtentReport(String browser){
        ExtentSparkReporter reporter=new ExtentSparkReporter("src/test/reports/test report_"+browser+" browser.html");
        reporter.config().setDocumentTitle("Test Report");
        reporter.config().setReportName("The-internetWebsite Test Report on "+browser+" browser");
        ExtentReports report=new ExtentReports();
        report.attachReporter(reporter);
        report.setSystemInfo("Tester","Mahmoud Yehia");
        report.setSystemInfo("Browser",browser);
        report.setSystemInfo("Website Link","https://the-internet.herokuapp.com");
        return report;
    }
}
