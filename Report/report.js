$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ABC.feature");
formatter.feature({
  "line": 1,
  "name": "Test scope",
  "description": "",
  "id": "test-scope",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "test-scope;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.precondition()"
});
formatter.result({
  "duration": 4174438000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.username()"
});
formatter.result({
  "duration": 125588400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.password()"
});
formatter.result({
  "duration": 122145100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.click()"
});
formatter.result({
  "duration": 1852638900,
  "status": "passed"
});
});