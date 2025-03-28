package za.ac.cput.Repository;
//Thando Tinto - 221482210
import za.ac.cput.Domain.Payments;

import java.util.List;

public interface IPaymentsRepository extends IRepository<Payments,String> {
    List<Payments> getAllPayments();
}
