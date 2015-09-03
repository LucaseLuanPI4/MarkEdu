/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Markedu.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author luan
 */
@Entity
public class Evento {

    @Id
    @GeneratedValue
    private int codig;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date data;
    private String responsavel;
    private String valorPatrocinios;
    private String atividadesOferecidas;
    private String situacao;

    public Evento() {
    }

    public Evento(int codig, String nome, Date data, String responsavel, String valorPatrocinios, String atividadesOferecidas, String situacao) {
        this.codig = codig;
        this.nome = nome;
        this.data = data;
        this.responsavel = responsavel;
        this.valorPatrocinios = valorPatrocinios;
        this.atividadesOferecidas = atividadesOferecidas;
        this.situacao = situacao;
    }

    public int getCodig() {
        return codig;
    }

    public void setCodig(int codig) {
        this.codig = codig;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getValorPatrocinios() {
        return valorPatrocinios;
    }

    public void setValorPatrocinios(String valorPatrocinios) {
        this.valorPatrocinios = valorPatrocinios;
    }

    public String getAtividadesOferecidas() {
        return atividadesOferecidas;
    }

    public void setAtividadesOferecidas(String atividadesOferecidas) {
        this.atividadesOferecidas = atividadesOferecidas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "MarkeduEvento{" + "codig=" + codig + ", nome=" + nome + ", data=" + data + ", responsavel=" + responsavel + ", valorPatrocinios=" + valorPatrocinios + ", atividadesOferecidas=" + atividadesOferecidas + ", situacao=" + situacao + '}';
    }
}
