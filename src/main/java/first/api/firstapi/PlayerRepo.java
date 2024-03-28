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
        throw new UnsupportedOperationException("Umimplemented Method getAll");
    }
}
