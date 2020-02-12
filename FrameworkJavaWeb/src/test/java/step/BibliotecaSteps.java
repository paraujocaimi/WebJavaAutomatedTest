package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.BibliotecaPage;

public class BibliotecaSteps {

	private static WebDriver driver;
	BibliotecaPage biblioteca = new BibliotecaPage();

	@Given("^acesso a pagina \"(.*)\"$")
	public void given(String url) {
		biblioteca.setClasse(url);
	}
	
	@When("^clico no \"(.*)\"$")
	public void clicoNoMenu(String menu) {
		biblioteca.clicoNoMenu(menu);
	}
	
	@And("^insiro o \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
	public void insiroDadosCadastro(String isbn, String autor, String titulo, String valor) {
		biblioteca.insiroDadosCadastro(isbn, autor, titulo, valor);
	}
	
	@And("^seleciono a busca por \"(.*)\"$")
	public void buscoTipo(String tipo) {
		biblioteca.selecionoTipoBusca(tipo);
	}

	@Then("^insiro o \"(.*)\" para busca$")
	public void buscoPeloFiltro(String dado) {
		biblioteca.buscoPeloFiltro(dado);
	}
	
	@Then("^valido se salvou o registro do \"(.*)\"$")
	public void validoRegistro(String livro) {
		Assert.assertTrue("Nao salvou o registro no banco",biblioteca.validoRegistro(livro));
	}
	
	@Then("^verifico se existe livros na base$")
	public void listarTodos() {
		Assert.assertTrue("Nao encontrou nenhum livro na base de dados",biblioteca.listarTodos());
	}
	
	@And("^clico em cadastrar$")
	public void realizarExecucaoCadastrar() {
		biblioteca.realizarExecucaoCadastrar();

	}
	
	@And("^clico em buscar$")
	public void realizarExecucaoBusca() {
		biblioteca.realizarExecucaoBusca();

	}
	
	@And("^clico em excluir$")
	public void realizarExecucaoExclusao() {
		biblioteca.realizarExecucaoExclusao();

	}
	
	@And("^fecho o navegador$")
	public void closeDriver() {
		biblioteca.closeDriver();

	}

}
