$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MyAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Verify multiple scenarios on MyAccount Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify user is able to navigate to account settings after logging with valid credentials",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@MyAccount2"
    },
    {
      "line": 6,
      "name": "@P1BD"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on My Information",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "it navigates to my account page",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 16,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;;1"
    },
    {
      "cells": [
        "bigDee@gmail.com",
        "automation@123"
      ],
      "line": 17,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2808318405,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I open the given website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "verify the Url",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 27916492816,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 23910244,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify user is able to navigate to account settings after logging with valid credentials",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@MyAccount2"
    },
    {
      "line": 6,
      "name": "@P1BD"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter username as \"bigDee@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on My Information",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "it navigates to my account page",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 134224980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bigDee@gmail.com",
      "offset": 21
    },
    {
      "val": "automation@123",
      "offset": 56
    }
  ],
  "location": "homePage.i_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 810382223,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7075561983,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 2150019282,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_My_Information()"
});
formatter.result({
  "duration": 10611405113,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_navigates_to_my_account_page()"
});
formatter.result({
  "duration": 4014687752,
  "status": "passed"
});
formatter.after({
  "duration": 592050755,
  "status": "passed"
});
});