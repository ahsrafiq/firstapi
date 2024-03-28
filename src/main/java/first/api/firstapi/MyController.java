package first.api.firstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-page")
public class MyController {

    public MyController(){

    }

    @GetMapping("/thankfull")
    public String Thankfull(){
        return "ALHAMDULLILAH";
    }

    @PostMapping("/sum")
    public int Sum(int a, int b){
        return a+b;
    }
}
