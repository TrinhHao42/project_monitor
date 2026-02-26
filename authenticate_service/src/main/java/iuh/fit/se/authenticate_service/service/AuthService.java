package iuh.fit.se.authenticate_service.service;

import iuh.fit.se.authenticate_service.dto.request.LoginRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class LoginWithPasswordService {
    public String loginWithPassword(LoginRequest request) {
        return "request is: email " + request.getEmail() + " password " + request.getPassword();
    }
}
