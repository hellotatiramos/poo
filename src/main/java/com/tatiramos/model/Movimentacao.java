package com.tatiramos.model;

import com.tatiramos.enums.ETipoMovimentacao;
import com.tatiramos.utils.DataUtil;

import java.util.Date;

public class Movimentacao {

    private Date data;

    private Double valor;

    private ETipoMovimentacao tipo;

    public Movimentacao(Double valor, ETipoMovimentacao tipo) {
        this.data = new Date();
        this.valor = valor;
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ETipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(ETipoMovimentacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        String dataEHora = DataUtil.converterDateparaDataEHora(this.data);
        return String.format("%s - (%s) - R$%s", dataEHora, this.tipo, this.valor);
    }
}
