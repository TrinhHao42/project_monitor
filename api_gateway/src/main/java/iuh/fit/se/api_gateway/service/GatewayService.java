package iuh.fit.se.api_gateway.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FallbackService {
    public Mono<String> fallback() {
        return Mono.just("Service is unavailable. Please wait some minute!");
    }
}
