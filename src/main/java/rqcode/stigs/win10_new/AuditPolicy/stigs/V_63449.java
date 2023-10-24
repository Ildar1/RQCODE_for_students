package rqcode.stigs.win10_new.AuditPolicy.stigs;

import rqcode.stigs.win10_new.AuditPolicy.AuditPolicyConst;
import rqcode.stigs.win10_new.AuditPolicy.AuditPolicyPattern;
import rqcode.stigs.win10_new.AuditPolicy.AuditPolicyScriptPattern;
import rqcode.stigs.win10_new.patterns.STIGScriptPattern;

import java.util.Map;

//The system must be configured to audit Account Management - User Account Management successes.

public class V_63449 extends AuditPolicyPattern {
    private final STIGScriptPattern policyScriptPattern =
            new AuditPolicyScriptPattern(
                    AuditPolicyConst.AUDIT_POLICY_SCRIPT_PATTERN_CHECK, AuditPolicyConst.AUDIT_POLICY_SCRIPT_PATTERN_ENFORCE,
                    Map.of(
                            "guid", "{0CCE9235-69AE-11D9-BED3-505054503030}",
                            "checkValue", "success"
                    ),
                    Map.of(
                            "guid", "{0CCE9235-69AE-11D9-BED3-505054503030}",
                            "checkValue", "success",
                            "value", "enable"));

    public V_63449() {
        pattern = this.policyScriptPattern;
    }
}