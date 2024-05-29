package example.security.interfaces.users;

import example.security.interfaces.users.dto.SignForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UsersController {

    @GetMapping("/sign-in")
    public String signForm(){

        return "sign_in";
    }

    @PostMapping("/sign-in")
    @ResponseBody
    public Map<String, Object> signIn(@RequestBody SignForm signForm){
        log.info("signForm={}", signForm);
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("test", "test");

        return responseData;
    }

}
