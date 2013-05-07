/* -------------------------------------
 * Timestamp: 06.05.2013 13:59:41
 * Encoding: UTF-8 
 * Author: Max Krutskikh <maximkrut@yahoo.com>
 */
package com.wakedocuments;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Max Krutskikh <maximkrut@yahoo.com>
 */
public class TestRequestDemoForm extends SeleneseTestBase {
    
    @Before
    public void beforeClass() {
        selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://localhost:8080");
        selenium.start();
    }
    
    @Test
    public void testSimple() throws Exception {
        selenium.open("http://www.wakedocuments.com/");
    }
}
