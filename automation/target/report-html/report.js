$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/stefanini/CT00.Login.feature");
formatter.feature({
  "name": "Login Stefanini",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Fazer Login - Login valido",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "Preencher o Nome \"\u003cnome\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Preencher o E-mail \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Preencher a Senha \"\u003csenha\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Clicar em Cadastrar",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "nome",
        "senha",
        "email"
      ]
    },
    {
      "cells": [
        "Fernanda Trindade",
        "12345678",
        "testes@gmail.com"
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
  "name": "Acessar \"urlStefanini\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.acessarUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fazer Login - Login valido",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "Preencher o Nome \"Fernanda Trindade\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.preencherUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher o E-mail \"testes@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.preencherEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencher a Senha \"12345678\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.preencherSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicar em Cadastrar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.clicarEmCadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});