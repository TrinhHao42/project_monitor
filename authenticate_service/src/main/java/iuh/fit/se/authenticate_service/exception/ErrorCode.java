package iuh.fit.se.authenticate_service.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    USER_NOT_FOUND(404, "Không tìm thấy người dùng"),
    USER_EXISTED(409, "Người dùng đã tồn tại");

    int code;
    String message;
}
