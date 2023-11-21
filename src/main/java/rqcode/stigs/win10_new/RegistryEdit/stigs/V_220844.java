package rqcode.stigs.win10_new.RegistryEdit.stigs;

import rqcode.stigs.win10_new.RegistryEdit.RegistryEditConst;
import rqcode.stigs.win10_new.RegistryEdit.RegistryEditPattern;
import rqcode.stigs.win10_new.RegistryEdit.RegistryEditScriptPattern;

import java.util.Map;

public class V_220844 extends RegistryEditPattern {
    private final RegistryEditScriptPattern policyScriptPattern =
            new RegistryEditScriptPattern(
                    RegistryEditConst.REGISTRY_EDIT_SCRIPT_PATTERN_CHECK, RegistryEditConst.REGISTRY_EDIT_SCRIPT_PATTERN_ENFORCE,
                    Map.of(
                            "path", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\MicrosoftEdge\\PhishingFilter",
                            "attr", "EnabledV9",
                            "result_value", "1",
                            "id", "V_220844"
                    ),
                    Map.of(
                            "path", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\MicrosoftEdge\\PhishingFilter",
                            "path_short", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\MicrosoftEdge",
                            "attr", "EnabledV9",
                            "result_value", "1"
                            
                        ),
                    Map.of(
                            "description", "Local administrator accounts must have their privileged token filtered to prevent elevated privileges from being used over the network on domain systems."
                        )
                );


    public V_220844() {
        pattern = this.policyScriptPattern;
    }


}
