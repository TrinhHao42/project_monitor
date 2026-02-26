package iuh.fit.se.authenticate_service.controller;

import iuh.fit.se.authenticate_service.dto.request.LoginRequest;
import iuh.fit.se.authenticate_service.service.AuthService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class AuthController {
    AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginRequest request) {
        return authService.loginWithPassword(request);
    }
}
