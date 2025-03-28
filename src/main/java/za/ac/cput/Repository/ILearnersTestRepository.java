package za.ac.cput.Repository;
//@Author(221755349- Emihle Thole)

import za.ac.cput.Domain.LearnersTest;
import za.ac.cput.Domain.License;

import java.util.List;

public interface ILearnersTestRepository extends IRepository<LearnersTest,String> {


    List<LearnersTest> getAll();
}
