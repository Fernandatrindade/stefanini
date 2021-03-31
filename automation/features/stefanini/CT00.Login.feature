@login
Feature: Login Stefanini

  Background:
    Given Acessar "urlStefanini"

  @login
  Scenario Outline: Fazer Login - Login valido
    When Preencher o Nome "<nome>"
    When Preencher o E-mail "<email>"
    And Preencher a Senha "<senha>"
    And Clicar em Cadastrar

    Examples:
      | nome              | senha    | email            |
      | Fernanda Trindade | 12345678 | testes@gmail.com |