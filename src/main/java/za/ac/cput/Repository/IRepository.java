package za.ac.cput.Repository;
//@Author(221807144- Masibuve Sikhulume)

public interface IRepository<T,ID> {
    T create(T t) ;
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
// This is how abstraction is performed

}


