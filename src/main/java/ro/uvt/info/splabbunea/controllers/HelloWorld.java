package ro.uvt.info.splabbunea.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.splabbunea.injection.ClientComponent;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloWorld {
    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/hello-client")
    public String helloClient() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}