package iuh.fit.se.authenticate_service.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
            @Column(name = "account_id")
    String UUId;

    @Column(unique = true, nullable = false)
    String email;
    @Column(nullable = false)
    String password;
}
