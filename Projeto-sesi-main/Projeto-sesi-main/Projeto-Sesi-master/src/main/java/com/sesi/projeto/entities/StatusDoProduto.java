package com.sesi.projeto.entities;

public enum StatusDoProduto {
    AGUARDANDO_PAGAMENTO(0),
    PAGO(1),
    ENVIADO(2),
    ENTREGUE(3),
    CANCELADO(4);

    private final int codigo;

    StatusDoProduto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static StatusDoProduto fromCodigo(int codigo) {
        for (StatusDoProduto status : StatusDoProduto.values()) {
            if (status.getCodigo() == codigo) {
                return status;
            }
        }
        throw new IllegalArgumentException("Erro"+ ": " + codigo);
    }
}

