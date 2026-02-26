package iuh.fit.se.authenticate_service.controller;

import iuh.fit.se.authenticate_service.dto.request.LoginRequest;
import iuh.fit.se.authenticate_service.service.LoginWithPasswordService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class LoginWithPasswordController {
    LoginWithPasswordService loginWithPasswordService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return loginWithPasswordService.loginWithPassword(request);
    }
}
