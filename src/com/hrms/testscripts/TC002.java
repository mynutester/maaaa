package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC002 {
   @Test
   public static void tc002() {
       //Test Steps
   BaseClass.openApplication();
   VerifyPage.verifyTitle("HRMS");
   BaseClass.closeApplication();
   }
}