$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Open Google, search for “J. P. Morgan”, click the first result returned by Google, verify that the J.P. Morgan logo is shown",
  "description": "",
  "id": "open-google,-search-for-“j.-p.-morgan”,-click-the-first-result-returned-by-google,-verify-that-the-j.p.-morgan-logo-is-shown",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Google Search given text and verify logo displayed as expected",
  "description": "",
  "id": "open-google,-search-for-“j.-p.-morgan”,-click-the-first-result-returned-by-google,-verify-that-the-j.p.-morgan-logo-is-shown;google-search-given-text-and-verify-logo-displayed-as-expected",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he search for \"\u003cSearchText\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "choose the first item from list",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the logo is displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "open-google,-search-for-“j.-p.-morgan”,-click-the-first-result-returned-by-google,-verify-that-the-j.p.-morgan-logo-is-shown;google-search-given-text-and-verify-logo-displayed-as-expected;",
  "rows": [
    {
      "cells": [
        "SearchText"
      ],
      "line": 10,
      "id": "open-google,-search-for-“j.-p.-morgan”,-click-the-first-result-returned-by-google,-verify-that-the-j.p.-morgan-logo-is-shown;google-search-given-text-and-verify-logo-displayed-as-expected;;1"
    },
    {
      "cells": [
        "J. P. Morgan"
      ],
      "line": 11,
      "id": "open-google,-search-for-“j.-p.-morgan”,-click-the-first-result-returned-by-google,-verify-that-the-j.p.-morgan-logo-is-shown;google-search-given-text-and-verify-logo-displayed-as-expected;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Google Search given text and verify logo displayed as expected",
  "description": "",
  "id": "open-google,-search-for-“j.-p.-morgan”,-click-the-first-result-returned-by-google,-verify-that-the-j.p.-morgan-logo-is-shown;google-search-given-text-and-verify-logo-displayed-as-expected;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he search for \"J. P. Morgan\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "choose the first item from list",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the logo is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 5980613900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J. P. Morgan",
      "offset": 15
    }
  ],
  "location": "Steps.heSearchFor(String)"
});
formatter.result({
  "duration": 2538055400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.choose_the_first_item_from_list()"
});
formatter.result({
  "duration": 11345194400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_the_logo_is_displayed()"
});
formatter.result({
  "duration": 700754400,
  "status": "passed"
});
});