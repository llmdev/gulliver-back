package br.com.gulliver.beans;

import java.time.LocalDate;

public class Avaliacao {

    private Integer codigo;
    private String mensagem;
    private LocalDate data;
    private Integer rate;
    private Usuario usuario;
    private Parceiro parceiro;

    public Avaliacao() {}

    public Avaliacao(Integer codigo, String mensagem, LocalDate data, Integer rate, Usuario usuario, Parceiro parceiro) {
        this.codigo = codigo;
        this.mensagem = mensagem;
        this.data = data;
        this.rate = rate;
        this.usuario = usuario;
        this.parceiro = parceiro;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

    public String toString() {
        return "Nome do Avaliado: " + this.parceiro.getNomeFantasia() + "\n" + "Nota avaliacao: " + this.rate + "\n" + "Quem Avaliou: " + this.usuario.getNome() + "\n" + "Mensagem Avaliacao: " + this.mensagem;
    }
}
