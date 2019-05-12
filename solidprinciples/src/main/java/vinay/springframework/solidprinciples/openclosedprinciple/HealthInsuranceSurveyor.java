package vinay.springframework.solidprinciples.openclosedprinciple;

/**
 * @author kanike
 */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor :: Validating health insurance claims...");
        return true;
    }
}
