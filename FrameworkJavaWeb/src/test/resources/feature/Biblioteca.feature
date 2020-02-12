@tag
Feature: Test discipline - IFRS

  # http://www.isbn.bn.br/website/consulta/cadastro/filtrar
  Background: 
    Given acesso a pagina "http://localhost/LivrariaWeb/"

  @SmokeTest
  Scenario Outline: LivrariaWeb - <MENU>
    When clico no <MENU>
    Then insiro o <ISBN> <Autor> <Titulo> <Valor>
    And clico em cadastrar
    Then valido se salvou o registro do <Titulo>
    And fecho o navegador

    Examples: 
      | ID | MENU       | ISBN                | Autor            | Titulo                             | Valor   |
      |  1 | "Register" | "85-325-1101-5"     | "ROWLING, J. K." | "HARRY POTTER E A PEDRA FILOSOFAL" | "30.00" |
      |  2 | "Register" | "978-85-5579-146-8" | "ROWLING, J. K." | "20 anos de Harry Potter"          | "10.00" |
      |  3 | "Register" | "978-85-88948-25-9" | "ROWLING, J. K." | "ALMANAQUE DE HARRY POTTER"        | "5.00"  |
      |  4 | "Register" | "978-85-7479-892-9" | "ROWLING, J. K." | "HARRY POTTER FIGURAS DE COLECAO"  | "40.00" |
      |  5 | "Register" | "978-85-16-06684-0" | "ROWLING, J. K." | "Harry Potter : Um Livro Pop-Up"   | "30.00" |

  @SmokeTest
  Scenario Outline: LivrariaWeb - Busca <MENU>
    When clico no <MENU>
    Then verifico se existe livros na base
    And fecho o navegador

    Examples: 
      | ID | MENU  |
      |  1 | "All" |
      
  @SmokeTest
  Scenario Outline: LivrariaWeb - <MENU>/<PESQUISA>
    When clico no <MENU>
    And seleciono a busca por <PESQUISA>
    Then insiro o <DADO> para busca
    And clico em buscar
    And verifico se existe livros na base
    And fecho o navegador

    Examples: 
      | ID | MENU     | PESQUISA | DADO                             |
      |  1 | "Search" | "Autor"  | "ROWLING, J. K."                 |
      |  2 | "Search" | "ISBN"   | "978-85-7479-892-9"              |
      |  3 | "Search" | "Titulo" | "Harry Potter : Um Livro Pop-Up" |
      |  4 | "Search" | "Codigo" | "1"                              |

  @SmokeTest
  Scenario Outline: LivrariaWeb - <MENU>/<PESQUISA>
    When clico no <MENU>
    And seleciono a busca por <PESQUISA>
    Then insiro o <DADO> para busca
    And clico em excluir
    And verifico se existe livros na base
    And fecho o navegador

    Examples: 
      | ID | MENU     | PESQUISA | DADO                             |
      |  1 | "Delete" | "ISBN"   | "978-85-7479-892-9"              |
      |  2 | "Delete" | "Titulo" | "Harry Potter : Um Livro Pop-Up" |
      |  3 | "Delete" | "Codigo" | "1"                              |
      |  4 | "Delete" | "Autor"  | "ROWLING, J. K."                 |
      