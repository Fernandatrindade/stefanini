package uimaps;

import core.Element;

public class LoginMap {

    public Element txtUser = new Element("xpath", "//input[@id='name']");
    public Element txtEmail = new Element("xpath", "//input[@id='email']");
    public Element txtSenha = new Element("xpath", "//input[@id='password']");
    public Element btnCadastrar = new Element("xpath", "//button[@id='register']");

}
