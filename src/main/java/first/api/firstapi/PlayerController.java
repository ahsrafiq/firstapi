package first.api.firstapi;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


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
        return "Player Saved Successfully as " + p.getName();
    }
    
    @GetMapping("/get-player/{id}")
    public Player getPlayer(@PathVariable Integer id){
        return repo.getPlayer(id);
    }

    @PostMapping("/update-player/{id}")
    public ResponseEntity<String> updatePlayer(@PathVariable Integer id, @RequestBody Player p){
        boolean updated = repo.updatePlayer(id, p);
        if (updated) {
            return ResponseEntity.ok("Player " + p.getName() + " updated successfully");
        } else {
            return new ResponseEntity<>("Player with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/delete-player/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Integer id){
        boolean updated = repo.deletePlayer(id);
        if (updated) {
            return ResponseEntity.ok("Player with " + id  + " deleted successfully");
        } else {
            return new ResponseEntity<>("Player with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
