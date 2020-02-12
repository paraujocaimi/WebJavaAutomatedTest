/**
 * 
 */
package page;

import com.gargoylesoftware.htmlunit.javascript.TimeoutError;
import elementPage.BibliotecaElementPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.OpenApplication;

import java.util.List;

public class BibliotecaPage extends BibliotecaElementPage {

	WebDriver driver;

	public void setClasse(String url) {
		OpenApplication.openApplication("chrome", url);
		PageFactory.initElements(OpenApplication.getDriver(), this);
		driver = OpenApplication.getDriver();
	}

	public void clicoNoMenu(String menu) {

		try {
			driver.findElement(By.xpath("//a[contains(@href, '" + menu + "')]")).click();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public void insiroDadosCadastro(String isbn, String autor, String titulo, String valor) {

		try {

			inputISBN.sendKeys(isbn.toUpperCase());
			inputAutor.sendKeys(autor.toUpperCase());
			inputTitulo.sendKeys(titulo.toUpperCase());
			inputValor.sendKeys(valor.toUpperCase());

		} catch (TimeoutError e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public boolean validoRegistro(String titulo) {

		boolean valida = false;

		try {
			String livro = titulo.toUpperCase();
			List<WebElement> listaRegistro = driver.findElements(By.xpath("//td[2]"));

			for (WebElement opcao : listaRegistro) {
				if (opcao.getAttribute("innerHTML").equals(titulo.toUpperCase())) {
					valida = true;
					break;
				}
			}
		} catch (TimeoutError e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

		return valida;
	}

	public boolean listarTodos() {
		boolean isLivros = true;

		try {
			if (driver.findElement(By.xpath("//html/body")).getAttribute("innerHTML")
					.contains("Nenhum livro cadastrado!")) {
				return false;
			}
		} catch (TimeoutError e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

		return isLivros;
	}

	public void selecionoTipoBusca(String tipo) {

		try {

			Select select = new Select(selectbusca);
			select.selectByVisibleText(tipo);

		} catch (TimeoutError e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public void buscoPeloFiltro(String dado) {

		try {
			inputSearch.sendKeys(dado.toUpperCase());
		} catch (TimeoutError e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public void realizarExecucaoCadastrar() {
		buttonRegistrar.click();
	}
	
	public void realizarExecucaoBusca() {
		buttonBusca.click();
	}
	
	public void realizarExecucaoExclusao() {
		buttonExcluir.click();
	}

	public void closeDriver() {
		OpenApplication.closeDriver();
	}
}
