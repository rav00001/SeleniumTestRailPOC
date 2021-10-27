package org.selenium.pom.utils.testrail.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;

import java.util.HashMap;
import java.util.HashSet;

public class LogSuiteListener implements ISuiteListener {

    public static HashMap<String,String> set= new HashMap<String,String>();
    @Override
    public void onStart(ISuite suite) {
        for (ITestNGMethod m : suite.getAllMethods()) {
            set.put(m.getTestClass().getName(),m.getMethodName());
        }
    }
}
