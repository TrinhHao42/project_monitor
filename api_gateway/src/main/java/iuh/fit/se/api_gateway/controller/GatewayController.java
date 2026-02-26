package iuh.fit.se.api_gateway.controller;

import iuh.fit.se.api_gateway.service.GatewayService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class GatewayController {
    GatewayService gatewayService;

    @RequestMapping("/fallback/auth")
    public Mono<String> authFallback() {
        return gatewayService.authFallback();
    }
}
