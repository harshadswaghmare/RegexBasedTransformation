package org.example;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

class RegexBasedTransformation {
    String forAccountRepresentative = "(?i)ACCOUNT REPRESENTATIVE";
    String forAccountant1 = "((?i)ACCOUNTANT) I";

    String forAccManager = "((?i)ACCOUNT MANAGER - OHS|Account Manager-OHS|ACCOUNT MANAGER|SR','ACCOUNT MANAGER SR|SR','ACCOUNT MANAGER, SR)";
    String forAccountant2 = "((?i)ACCOUNTANT) II";
    String forAcCordAMCO = "(?i)Accounting Coordinator-Amco";
    String forAccPayClerk = "(?i)ACCOUNTS PAYABLE CLERK";
    String forActuarialAnalyst = "(?i)ActuarialAnalyst";
    String forActuary = "(?i)ACTUARY";
    String forAdminSvcsCoordI = "(?i)ADMIN SVCS COORD I";
    String forAdmin = "(?i)ADMIN";
    String forAdministrativeclerk = "(?i)ADMINISTRATIVE CLERK";
    String forAideHomeHealthString = "(?i)AIDE, HOME HEALTH";
    String forAnalyst = "(?i)ANALYST";
    String forAnalystData = "(?i)ANALYST,DATA";
    String forAudiologist = "(?i)AUDIOLOGIST";
    String forBsF = "(?i)BS&F Anl";
    String forBsfConslt = "(?i)BS&F Conslt";
    String behavioralMedSpecLcs = "Behavioral Medicine Spec LCSW|Behavioral Medicn Spec LCSW|Behavioral Medicn Spec\\(LCSW\\)";
    String forBehavioralMedPsych = "(?i)BEHAVIORAL MED SPEC \\(PSYCH\\)|Behavioral Medicn Spec \\(Psych\\)";
    String forLabAssistant1 = "((?i)LAB ASST) I";
    String forLabAssistant2 = "((?i)LAB ASST) II";


    //Constant For country

    String forUS = "((?i)us|california)$";
    String forIndia = "(?i)IND|india";
    String forUK = "(?i)UK";
    String forCameroon = "(?i)cameroon";
    String forTrinidadTRO = "(?i)TrinidadTRO";
    String forAfg = "(?i)AFG";
    String forARG = "(?i)ARG";

    String forNULL = "(?i)XXX|countr|country|111";

    public String transform(String attr, String attrToBeReplaced) {

            if (Pattern.matches(forAccountRepresentative, attr)) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAccountant1, attr)) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAccountant2, attr)) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAccManager, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAcCordAMCO, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAccPayClerk, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forActuarialAnalyst, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forActuary, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAdminSvcsCoordI, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAdmin, attr)) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAdministrativeclerk, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAideHomeHealthString, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAnalyst, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAnalystData, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAudiologist, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forBsF, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forBsfConslt, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(behavioralMedSpecLcs, attr)) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forBehavioralMedPsych, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forLabAssistant1, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forLabAssistant2, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));
            }

            //for country
            else if (Pattern.matches(forIndia, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forUS, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forUK, attr)) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forCameroon, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forTrinidadTRO, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));

            } else if (Pattern.matches(forAfg, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));
            } else if (Pattern.matches(forARG, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));
            } else if (Pattern.matches(forNULL, attr.trim())) {
                return (attr.replaceAll(attr, attrToBeReplaced));
            }
            else{
             throw new InputMismatchException("Please enter valid input for ("+attr +")");
            }

        }
    }





