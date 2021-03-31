package pages;

import config.PropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uimaps.LoginMap;
import utils.GerarEvidenciasUtils;

public class LoginPage extends BasePage {

    LoginMap loginMap = new LoginMap();
    PropertiesFile propertiesFile = new PropertiesFile();

    /**
     * Acessa uma url
     *
     * @param url Url
     */
    @Given("^Acessar \"(.*)\"$")
    public void acessarUrl(String url) throws Exception{
        System.out.println("Acessando " + url);
        if (PropertiesFile.readPropertiesFile(url) != null) {
            url = PropertiesFile.readPropertiesFile(url);
        }
        acessar(url);
        esperarPagina();
        esperarImplicita();
    }

    /**
     * Preenche um usuario especifico para o login
     *
     * @param usuario Usuario para realizar login no sistema
     * @throws Exception Se nao conseguir achar um elemento
     */

    @When("^Preencher o Nome \"(.*)\"$")
    public void preencherUsuario(String usuario) throws Exception {
        esperarPagina();
        esperarElemento(loginMap.txtUser);
        if (PropertiesFile.readPropertiesFile(usuario) != null) {
            usuario = PropertiesFile.readPropertiesFile(usuario);
        }
        preencher(loginMap.txtUser, usuario);
        esperarPagina();
        GerarEvidenciasUtils.takeScreenshot("Preencher o Nome");
    }

    /**
     * Preenche um usuario especifico para o login
     *
     * @param email Usuario para realizar login no sistema
     * @throws Exception Se nao conseguir achar um elemento
     */

    @When("^Preencher o E-mail \"(.*)\"$")
    public void preencherEmail (String email) throws Exception {
        esperarPagina();
        esperarElemento(loginMap.txtUser);
        if (PropertiesFile.readPropertiesFile(email) != null) {
            email = PropertiesFile.readPropertiesFile(email);
        }
        preencher(loginMap.txtEmail, email);
        esperarPagina();
        GerarEvidenciasUtils.takeScreenshot("Preencher o Nome");
    }

    /**
     * Preenche uma senha especifica de acordo com o usuario preenchido
     *
     * @param senha Senha a ser inserida
     * @throws Exception Se nao conseguir achar um elemento
     */

    @And("^Preencher a Senha \"(.*)\"$")
    public void preencherSenha(String senha) throws Exception {
        esperarPagina();
        esperarElemento(loginMap.txtSenha);
        if (PropertiesFile.readPropertiesFile(senha) != null) {

            String propriedade = PropertiesFile.readPropertiesFile(senha);
            preencher(loginMap.txtSenha, propriedade);

        } else {
            preencher(loginMap.txtSenha, senha);
        }
        esperarPagina();
        GerarEvidenciasUtils.takeScreenshot("Preencher a Senha");
    }

    /**
     * Clicar no botao cadastrar
     *
     * @throws Exception Se nao conseguir achar um elemento
     */
    @And("^Clicar em Cadastrar")
    public void clicarEmCadastrar() throws Exception {
        esperarPagina();
        esperarImplicita();
        clicar(loginMap.btnCadastrar);
        GerarEvidenciasUtils.takeScreenshot("Clicar em Cadastrar");
    }

}
