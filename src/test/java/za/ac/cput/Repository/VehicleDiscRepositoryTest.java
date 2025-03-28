package za.ac.cput.Repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Vehicle;
import za.ac.cput.Domain.VehicleDisc;
import za.ac.cput.Factory.VehicleDiscFactory;
import za.ac.cput.Factory.VehicleFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
    //@Author (222529571- Sbahle Shange) 
class VehicleDiscRepositoryTest {
    private static IVehicleDiscRepository repository = VehicleDiscRepository.getIRepository();
    private VehicleDisc vehicleDisc = VehicleDiscFactory.CreateVehicleDisc("DSC23456" , LocalDate.parse("2025-06-01") ,"Valid", LocalDate.parse("2024-05-03"));

    @Test
    void a_create() {
        VehicleDisc reactedVehicleDisc = repository.create(vehicleDisc);
        assertNotNull(reactedVehicleDisc);
        System.out.println( "My vehicle succefully Created: " +reactedVehicleDisc.toString());
    }

    @Test
    void b_read() {
        VehicleDisc read = repository.read(vehicleDisc.getVehicleDiscID());
        assertNotNull(read);
        System.out.println(" Reading My vehicle: " +read.toString());

    }

    @Test
    void c_update() {
        VehicleDisc newVehicleDisc = new VehicleDisc.DiscBuilder().copy(vehicleDisc).setStatus("INVALID").build();
        VehicleDisc updatedVehicleDisc = repository.update(newVehicleDisc);
        assertNotNull(updatedVehicleDisc);
        System.out.println("Updated Vehicle: " +updatedVehicleDisc.toString());
    }

    @Test
   @Disabled
    void d_delete() {
        repository.delete(vehicleDisc.getVehicleDiscID());  //First delete the Vehicle object
        assertNull(repository.read(vehicleDisc.getVehicleDiscID()));  // Must pass as it will return a null, as the object has been deleted
        System.out.println("sucessuly deleted a Vehicle");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
