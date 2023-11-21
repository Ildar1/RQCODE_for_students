package rqcode.stigs.win10_new.RegistryEdit.stigs;

import rqcode.stigs.win10_new.RegistryEdit.RegistryEditConst;
import rqcode.stigs.win10_new.RegistryEdit.RegistryEditPattern;
import rqcode.stigs.win10_new.RegistryEdit.RegistryEditScriptPattern;

import java.util.Map;

public class V_220840 extends RegistryEditPattern {
    private final RegistryEditScriptPattern policyScriptPattern =
            new RegistryEditScriptPattern(
                    RegistryEditConst.REGISTRY_EDIT_SCRIPT_PATTERN_CHECK, RegistryEditConst.REGISTRY_EDIT_SCRIPT_PATTERN_ENFORCE,
                    Map.of(
                            "path", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\MicrosoftEdge\\PhishingFilter",
                            "attr", "PreventOverride",
                            "result_value", "1",
                            "id", "V_220840"
                    ),
                    Map.of(
                            "path", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\MicrosoftEdge\\PhishingFilter",
                            "path_short", "HKLM:\\SOFTWARE\\Policies\\Microsoft\\MicrosoftEdge",
                            "attr", "PreventOverride",
                            "result_value", "1"
                            
                        ),
                    Map.of(
                            "description", "The system must be configured to prevent Internet Control Message Protocol (ICMP) redirects from overriding Open Shortest Path First (OSPF) generated routes."
                        )
                );


    public V_220840() {
        pattern = this.policyScriptPattern;
    }


}
