package org.selenium.pom.utils.testrail.client;

import org.json.simple.JSONObject;
import org.selenium.pom.base.BasePage;
import org.testng.ITestContext;

import java.util.HashMap;
import java.util.Map;

public class TestRailsConfig {
    public static APIClient client =null;
    private static String PROJECT_ID = "1";

    public static void createSuite(ITestContext ctx) throws Exception {
        client = new APIClient("https://ravi001.testrail.io/");
        client.setUser("ravi.kr.gupta1994@gmail.com");
        client.setPassword("Apple@123");
        Map data = new HashMap();
        data.put("include_all",true);
        data.put("name","Test Run "+System.currentTimeMillis());
        data.put("suite_id",1);
        JSONObject c = null;
        c = (JSONObject)client.sendPost("add_run/"+ PROJECT_ID,data);
        Long suite_id = (Long)c.get("id");
        ctx.setAttribute("suiteId",suite_id);
    }

}
