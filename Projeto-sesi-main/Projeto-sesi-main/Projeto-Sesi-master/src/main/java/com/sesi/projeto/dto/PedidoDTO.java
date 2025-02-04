package com.sesi.projeto.dto;

import java.time.Instant;

public record PedidoDTO(Long id, Instant momento, String status) {

}
