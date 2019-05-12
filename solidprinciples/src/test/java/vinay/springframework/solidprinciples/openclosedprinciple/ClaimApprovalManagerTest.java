package vinay.springframework.solidprinciples.openclosedprinciple;

import org.junit.Test;

/**
 * @author kanike
 */
public class ClaimApprovalManagerTest {
    @Test
    public void testProcessClaim() throws Exception{
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();
        claimApprovalManager.processClaims(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager1 = new ClaimApprovalManager();
        claimApprovalManager1.processClaims(vehicleInsuranceSurveyor);

    }
}
