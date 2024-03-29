package first.api.firstapi;

import java.util.Collection;

public interface IRepository<T> {

    public void Save(T p);

    public Collection<T> getAll();

    public Player getPlayer(Integer id);

    public boolean updatePlayer(Integer id, Player p);

    public boolean deletePlayer(Integer id);
    
}
