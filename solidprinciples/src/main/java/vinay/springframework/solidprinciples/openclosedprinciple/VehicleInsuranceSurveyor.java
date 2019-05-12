package vinay.springframework.solidprinciples.openclosedprinciple;

/**
 * @author kanike
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor :: Validating vehicle insurance claims...");
        return true;
    }
}
