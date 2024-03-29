package first.api.firstapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlayerRepo implements IRepository<Player>{
    
    private Map<Integer, Player> data;

    public PlayerRepo(){
        this.data = new HashMap<>();
    }

    @Override
    public void Save(Player p){
        this.data.put(p.getId(), p);
    }

    @Override
    public Collection<Player> getAll(){
        return data.values();
    }

    @Override
    public Player getPlayer(Integer id){
        return data.values().stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean updatePlayer(Integer id, Player p){

        Player player = data.get(id);

        if (player != null) {
            player.setName(p.getName());
            player.setCountry(p.getCountry());
            player.setAvg(p.getAvg());
            player.setWickets(p.getWickets());
            player.setRuns(p.getRuns());

            return true;
            
        } else {
            return false;
        }
    }

    @Override
    public boolean deletePlayer(Integer id){
        Player player = data.get(id);
        if(player != null){
            data.values().removeIf(t -> t.getId().equals(id));
            return true;
        }
        else{
            return false;
        }
    }
}
