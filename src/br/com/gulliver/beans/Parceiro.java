package br.com.gulliver.beans;

public class Parceiro {

    private Integer codigo;
    private String nomeFantasia;
    private String cnpj;
    private String logomarca;
    private String email;
    private String descricao;
    private Endereco endereco;

    public Parceiro() {
    }

    public Parceiro(Integer codigo, String nomeFantasia, String cnpj, String logomarca, String email, String descricao, Endereco endereco) {
        this.codigo = codigo;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.logomarca = logomarca;
        this.email = email;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLogomarca() {
        return logomarca;
    }

    public void setLogomarca(String logomarca) {
        this.logomarca = logomarca;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
