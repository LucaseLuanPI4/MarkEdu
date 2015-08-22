/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Markedu.Investimentos;

/**
 *
 * @author CCE
 */
public class investimentos {
    private String radio;
    private String pagamentoAvulso;
    private String patrocinio;
    private String panfletos;
    private String outros;

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getPagamentoAvulso() {
        return pagamentoAvulso;
    }

    public void setPagamentoAvulso(String pagamentoAvulso) {
        this.pagamentoAvulso = pagamentoAvulso;
    }

    public String getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }

    public String getPanfletos() {
        return panfletos;
    }

    public void setPanfletos(String panfletos) {
        this.panfletos = panfletos;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    @Override
    public String toString() {
        return "investimentos{" + "radio=" + radio + ", pagamentoAvulso=" + pagamentoAvulso + ", patrocinio=" + patrocinio + ", panfletos=" + panfletos + ", outros=" + outros + '}';
    }
    
    
    
}
