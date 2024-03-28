package first.api.firstapi;

import java.util.Collection;

public interface IRepository<T> {

    public void Save(T p);

    public Collection<T> getAll();
    
}
