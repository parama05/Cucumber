$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FacebookLogin.feature");
formatter.feature({
  "name": "Validation of Login page in facebook web application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01_Validation of login page with valid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_enters_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Home Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_Home_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC02_Validation of login page with multiple invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify error message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "greens",
        "12234"
      ]
    },
    {
      "cells": [
        "vinothraj",
        "735438"
      ]
    },
    {
      "cells": [
        "grace",
        "745490"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of login page with multiple invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"greens\" and invalid \"12234\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_enters_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of login page with multiple invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"vinothraj\" and invalid \"735438\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_enters_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of login page with multiple invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"grace\" and invalid \"745490\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_enters_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_clicks_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.user_verify_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});