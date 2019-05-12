package vinay.springframework.solidprinciples.openclosedprinciple;

/**
 * @author kanike
 */
public class ClaimApprovalManager {
    public void processClaims(InsuranceSurveyor insuranceSurveyor){
        if(insuranceSurveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager :: Valid claim. Currently processing claim for approval...");
        }
    }
}
