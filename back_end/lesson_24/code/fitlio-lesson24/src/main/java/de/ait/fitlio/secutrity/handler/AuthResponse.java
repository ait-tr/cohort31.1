package de.ait.fitlio.secutrity.handler;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "AuthResponse",description = "response details")
public record AuthResponse(String message) {

}
