package br.com.tama.ifood_api.pedido.models.dto;

import java.math.BigDecimal;

public class PratoPedidoDTO {

    public String nome;

    public String descricao;

    public BigDecimal preco;

    public PratoPedidoDTO() {
        super();
    }

    public PratoPedidoDTO(String nome, String descricao, BigDecimal preco) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "PratoPedidoDTO{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
