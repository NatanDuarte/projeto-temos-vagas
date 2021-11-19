
package com.natanduarte.temosvagas.model;

public class Company {

    private String login;
    private String password;
    private String cnpj;
    private int id;

    public Company() {}
    public Company(String login, String password, String cnpj) {
        this.login = login;
        this.password = password;
        this.cnpj = cnpj;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean validate(String login, String password) {
        boolean loginMatches = login.equals(this.getLogin());
        boolean passwordMatches = password.equals(this.getPassword());
        return (loginMatches && passwordMatches);
    }
}
