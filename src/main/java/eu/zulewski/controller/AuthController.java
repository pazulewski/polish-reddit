package eu.zulewski.controller;

import eu.zulewski.dto.LoginRequest;
import eu.zulewski.dto.RegisterRequest;
import eu.zulewski.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/singup")
    public ResponseEntity<String> singup(@RequestBody RegisterRequest registerRequest) {
        authService.singup(registerRequest);
        return new ResponseEntity<>("User Registration Succesful", HttpStatus.OK);
    }

    @GetMapping("accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token) {
        authService.verifyAccount(token);
        return new ResponseEntity<>("Account activated", HttpStatus.OK);
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest loginRequest) {
        authService.login(loginRequest);
    }

}
