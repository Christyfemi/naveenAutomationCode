$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/LoginDemo.feature");
formatter.feature({
  "name": "Test Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeScenario"
    }
  ]
});
formatter.step({
  "name": "browser is open there",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page site",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e details",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to the home page site",
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
        "olufemi",
        "12345"
      ]
    },
    {
      "cells": [
        "Eze",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeScenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is open there",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.browser_is_open_there()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page site",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.user_is_on_login_page_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters olufemi and 12345 details",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.user_enters_username_and_password_details(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.userClicksOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page site",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.user_is_navigated_to_the_home_page_site()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeScenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is open there",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.browser_is_open_there()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page site",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.user_is_on_login_page_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Eze and 12345 details",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.user_enters_username_and_password_details(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.userClicksOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page site",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginDemoStepsPOM.user_is_navigated_to_the_home_page_site()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});