$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Example.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Open Google",
  "description": "",
  "id": "open-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "A scenario",
  "description": "",
  "id": "open-google;a-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@ExampleTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "acesso a pagina \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 17
    }
  ],
  "location": "ExampleSteps.given(String)"
});
formatter.result({
  "duration": 4286928600,
  "status": "passed"
});
});