package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int counter =0;
    int retry =2;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if(counter<retry){
            counter++;
            return true;
        }
        return false;
    }
}
