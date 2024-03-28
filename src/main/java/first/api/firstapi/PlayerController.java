package first.api.firstapi;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/player")
public class PlayerController {

    PlayerRepo repo;

    public PlayerController(){
        repo = new PlayerRepo();
    }

    @GetMapping("/get-players")
    public Collection<Player> getAllPlayers(){
        return repo.getAll();
    }

    @PostMapping("/add-player")
    public String SavePlayer(@RequestBody Player p){
        repo.Save(p);
        return "Player Saved Successfully";
    }
    
}
