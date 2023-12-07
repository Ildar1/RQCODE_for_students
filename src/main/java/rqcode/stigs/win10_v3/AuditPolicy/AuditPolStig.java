package rqcode.stigs.win10_v3.AuditPolicy;

import rqcode.stigs.STIG;
import rqcode.stigs.win10_v3.WinScriptHelper;

/**
 * Parametrizable class for configuring Windows Audit Policies with the auditpol
 * util.
 */
public abstract class AuditPolStig extends STIG {
        /**
         * Check script command template for the AuditPol.
         */
        public static final String AUDIT_POLICY_SCRIPT_PATTERN_ENFORCE = "auditpol /set /subcategory:\"%(guid)\" /%(parameter):%(value)";
        
        /**
         * Enforce script command template for the AuditPol.
         */
        public static final String AUDIT_POLICY_SCRIPT_PATTERN_CHECK = "$subcat_es = \"%(subcat_es)\" \n" +
                        "$result = \"ERROR\" \n" +
                        "$subcat_eng = \"%(subcat_eng)\"\n" +
                        "$var = auditpol /get /subcategory:\"%(guid)\"\n" +
                        "$var2 = $var.ToLower()\n" +
                        "if ($var2 -like '*%(subcat_es)*' -or $var2 -like '*%(subcat_eng)*') {\n" +
                        "$result = \"OK\"\n" +
                        "}\n" +
                        "$result\n";

        /**
         * Helper that exectues PowerSheel scripts
         */
        private WinScriptHelper helper = new WinScriptHelper(AUDIT_POLICY_SCRIPT_PATTERN_ENFORCE,
                        AUDIT_POLICY_SCRIPT_PATTERN_CHECK);

        public WinScriptHelper getHelper() {
                return helper;
        }

        @Override
        public CheckStatus check() {
                setLastCheckStatus(helper.check());
                return getLastCheckStatus();
        }

        @Override
        public EnforcementStatus enforce() {
                setLastEnforcementStatus(helper.enforce());
                return getLastEnforcementStatus();
        }

}