package listeners;

import base.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object testClass = result.getInstance();
        BaseTest base = (BaseTest) testClass;

        ScreenshotUtil.takeScreenshot(
                base.getDriver(),
                result.getName()
        );
    }
}