package elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BibliotecaElementPage {
	
	@FindBy(xpath="//a[1]")
	protected WebElement listarLivros; 
	
	@FindBy(xpath="//a[2]")
	protected WebElement pesquisarLivros;
	
	@FindBy(xpath="//input[contains(@value, 'Busca')]")
	protected WebElement buttonBusca;
	
	@FindBy(xpath="//a[3]")
	protected WebElement cadastrarLivros; 
	
	@FindBy(xpath="//input[contains(@name, 'ISBN')]")
	protected WebElement inputISBN;
	
	@FindBy(xpath="//input[contains(@name, 'autor')]")
	protected WebElement inputAutor;
	
	@FindBy(xpath="//input[contains(@name, 'titulo')]")
	protected WebElement inputTitulo;
	
	@FindBy(xpath="//input[contains(@name, 'valor')]")
	protected WebElement inputValor;

	@FindBy(xpath="//input[contains(@value, 'Registrar')]")
	protected WebElement buttonRegistrar;
	
	@FindBy(xpath="//a[4]")
	protected WebElement excluirLivros; 
	
	@FindBy(xpath="//input[contains(@name, 'searchterm')]")
	protected WebElement inputSearch;
	
	@FindBy(xpath="//input[contains(@value, 'Excluir')]")
	protected WebElement buttonExcluir;
	
	@FindBy(id="searchtype")
	protected WebElement selectbusca;

}
