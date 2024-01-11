//package com.company;
//
//import java.time.Instant;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class Ennabl {
//    /*
//You need to create a method that would calculate the main department for each specialist.
//The main department is the one in which the specialist has the most overall commission on active policies.
//
//The specialist’s commission is calculated as a percentage of the total policy commission.
//
//A policy is considered active if it has already started but has not yet finished
//*/
//    class Policy {
//        Integer policyId;
//        Date startDate;
//        Date endDate;
//        /**
//         * Total policy commission in cents.
//         */
//        Long commission;
//        /**
//         * Policy Department ID
//         */
//        Integer departmentId;
//    }
//
//    class PolicySpecialist {
//        Integer specialistId;
//        Integer policyId;
//        /**
//         * The percentage of commission that a specialist receives from the total commission of the policy.
//         * Possible values from 0 to 1
//         */
//        Double commissionPct;
//    }
//
//    interface Calc {
//        /**
//         * The method should calculate the department for each specialist.
//         * The specialist belongs to the department in which he has the maximum commission on active policies.
//         * In
//         * A policy is considered active if it has already started but has not yet finished
//         *
//         * @param policies
//         * @param specialists
//         * @return key-value map where keys are specialist ids and values are department ids
//         */
//        Map<Integer, Integer> calculateSpecialistDepartments(List<Policy> policies, List<PolicySpecialist> specialists);
//    }
//
//    class CalcImpl implements Calc {
//        @Override
//        public Map<Integer, Integer> calculateSpecialistDepartments(List<Policy> policies, List<PolicySpecialist> specialists) {
//
//            Map<Integer, List<Integer>> specWithPolicies = specialists.stream()
//                            .collect(Collectors.toMap(specialist -> specialist.specialistId, Collectors.toList()));//
//
//            specWithPolicies.entrySet()
//                            .stream()
//                                    .map(entry -> {
//                                        //Entry<Integer, List<Integer>>
//                                        List<Integer> policiesPerSpecialist = entry.getValue();
//
//                                    })
//
//
//
////            Map<Integer, Policy> activePolicies = policies.stream()
////                    .filter(p -> p.endDate.after(Date.from(Instant.now())))
////                    .collect(Collectors.toMap(policy -> policy.policyId, Function.identity()));
//
//
//
//            specialists.stream()
//                    .collect(Collectors.toMap(policySpecialist -> policySpecialist.specialistId, () -> policies.stream()
//                            .filter(policy -> policy.policyId == policySpecialist.policiId)
//                            .collect(Collectors.groupingBy())))
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//}
