package org.selenium.pom.utils.testrail.listeners;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;

import java.util.HashMap;
import java.util.HashSet;

public class LogSuiteListener implements ISuiteListener {

    public static Multimap<String, String> set = ArrayListMultimap.create();
    @Override
    public void onStart(ISuite suite) {
        for (ITestNGMethod m : suite.getAllMethods()) {
            set.put(m.getTestClass().getName(),m.getMethodName());
        }
    }
}
