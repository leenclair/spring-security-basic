package example.security.interfaces.users.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class SignForm {

    private String email;
    private String password;

}
