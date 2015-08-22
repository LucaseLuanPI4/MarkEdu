/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markedu.Atividade;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @Lucas Vinicius CCE
 */
public class Atividade {
    private String nome;
    private String local;
    private Date data;
    private String curso;
    private String responsavel;
    private String situacao;
    private String itensUsados;
    private double valorTotal;
    private double gastosAtividdes;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the itensUsados
     */
    public String getItensUsados() {
        return itensUsados;
    }

    /**
     * @param itensUsados the itensUsados to set
     */
    public void setItensUsados(String itensUsados) {
        this.itensUsados = itensUsados;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the gastosAtividdes
     */
    public double getGastosAtividdes() {
        return gastosAtividdes;
    }

    /**
     * @param gastosAtividdes the gastosAtividdes to set
     */
    public void setGastosAtividdes(double gastosAtividdes) {
        this.gastosAtividdes = gastosAtividdes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.local);
        hash = 31 * hash + Objects.hashCode(this.data);
        hash = 31 * hash + Objects.hashCode(this.curso);
        hash = 31 * hash + Objects.hashCode(this.responsavel);
        hash = 31 * hash + Objects.hashCode(this.situacao);
        hash = 31 * hash + Objects.hashCode(this.itensUsados);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.valorTotal) ^ (Double.doubleToLongBits(this.valorTotal) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.gastosAtividdes) ^ (Double.doubleToLongBits(this.gastosAtividdes) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atividade other = (Atividade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.responsavel, other.responsavel)) {
            return false;
        }
        if (!Objects.equals(this.situacao, other.situacao)) {
            return false;
        }
        if (!Objects.equals(this.itensUsados, other.itensUsados)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gastosAtividdes) != Double.doubleToLongBits(other.gastosAtividdes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atividade{" + "nome=" + nome + ", local=" + local + ", data=" + data + ", curso=" + curso + ", responsavel=" + responsavel + ", situacao=" + situacao + ", itensUsados=" + itensUsados + ", valorTotal=" + valorTotal + ", gastosAtividdes=" + gastosAtividdes + '}';
    }
    
    
    
}
