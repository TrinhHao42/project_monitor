package iuh.fit.se.authenticate_service.service;

import iuh.fit.se.authenticate_service.dto.request.LoginRequest;
import iuh.fit.se.authenticate_service.exception.AppException;
import iuh.fit.se.authenticate_service.exception.ErrorCode;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class AuthService {
    public String loginWithPassword(LoginRequest request) {
        throw new AppException(ErrorCode.USER_EXISTED);
    }
}
