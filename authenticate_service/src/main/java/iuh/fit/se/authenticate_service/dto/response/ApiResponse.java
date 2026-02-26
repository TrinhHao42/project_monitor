package iuh.fit.se.authenticate_service.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
public class ApiResponse <T> {
    int code = 200;
    String message;
    T result;
}
