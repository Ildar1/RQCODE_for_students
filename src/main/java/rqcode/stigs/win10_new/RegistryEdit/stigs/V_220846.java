package rqcode.stigs.win10_new.RegistryEdit.stigs;

import rqcode.stigs.win10_new.RegistryEdit.RegistryEditConst;
import rqcode.stigs.win10_new.RegistryEdit.RegistryEditPattern;
import rqcode.stigs.win10_new.RegistryEdit.RegistryEditScriptPattern;

import java.util.Map;

public class V_220846 extends RegistryEditPattern {
    private final RegistryEditScriptPattern policyScriptPattern =
            new RegistryEditScriptPattern(
                    RegistryEditConst.REGISTRY_EDIT_SCRIPT_PATTERN_CHECK, RegistryEditConst.REGISTRY_EDIT_SCRIPT_PATTERN_ENFORCE,
                    Map.of(
                            "path", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\PassportForWork",
                            "attr", "RequireSecurityDevice",
                            "result_value", "1"
                    ),
                    Map.of(
                            "path", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\PassportForWork",
                            "path_short", "HKLM:\\SOFTWARE\\Policies\\Microsoft",
                            "attr", "RequireSecurityDevice",
                            "result_value", "1"));


    public V_220846() {
        pattern = this.policyScriptPattern;
    }


}
