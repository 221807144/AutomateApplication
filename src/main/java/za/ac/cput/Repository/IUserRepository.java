package za.ac.cput.Repository;
//@Author(221807144- Masibuve Sikhulume)

import za.ac.cput.Domain.User;

import java.util.List;

public interface IUserRepository extends IRepository<User,String>{
    List<User>getAll();
}
