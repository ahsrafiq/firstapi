package first.api.firstapi;

import java.util.Collection;

public interface IRepository<T> {

    public void Save(T p);

    public Collection<T> getAll();

    public Player getPlayer(Integer id);

    public void deletePlayer(Integer id);
    
}
