package ex8;

import ex8.Soldiers.BasicSoldiers.Private;
import ex8.Soldiers.BasicSoldiers.Spy;
import ex8.Soldiers.LeutenantGeneral;
import ex8.Soldiers.Soldier;
import ex8.Soldiers.SpecialisedSoldiers.Activities.Mission;
import ex8.Soldiers.SpecialisedSoldiers.Activities.Repair;
import ex8.Soldiers.SpecialisedSoldiers.Commando;
import ex8.Soldiers.SpecialisedSoldiers.Engineer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Soldier> soldiers = new LinkedHashMap<>();


        String[] input = console.readLine().split("\\s+");
        while (!"End".equals(input[0])){
            switch (input[0]){
                case "Private":
                    Private pvt = new Private(input[1], input[2], input[3], Double.valueOf(input[4]));
                    soldiers.put(pvt.getId(), pvt);
                    break;
                case "Spy":
                    Spy spy = new Spy(input[1], input[2], input[3], Integer.valueOf(input[4]));
                    soldiers.put(spy.getId(), spy);
                    break;
                case "LeutenantGeneral":
                        LeutenantGeneral leutenantGeneral = new LeutenantGeneral(input[1], input[2],
                                input[3], Double.valueOf(input[4]));
                        if (input.length > 4) {
                            for (int i = 5; i < input.length; i++) {
                                if (soldiers.containsKey(input[i])) {
                                    if (soldiers.get(input[i]).getClass().getSimpleName().equals("Private")) {
                                        leutenantGeneral.addPrivate(soldiers.get(input[i]));
                                    }
                                }
                            }
                        }
                        soldiers.put(leutenantGeneral.getId(), leutenantGeneral);
                break;
                case "Engineer":
                        if (input[5].equals("Airforces") || input[5].equals("Marines")) {
                            Engineer engineer = new Engineer(input[1], input[2], input[3],
                                    Double.valueOf(input[4]), input[5]);

                            for (int i = 6; i < input.length - 1; i += 2) {
                                Repair repair = new Repair(input[i], Integer.valueOf(input[i + 1]));
                                engineer.addRepair(repair);
                            }
                            soldiers.put(engineer.getId(), engineer);
                        }
                break;
                case "Commando":
                    if (input[5].equals("Airforces") || input[5].equals("Marines")) {
                        Commando commando = new Commando(input[1], input[2], input[3],
                                Double.valueOf(input[4]), input[5]);

                        for (int i = 6; i < input.length; i += 2) {
                            if (input[i + 1].equals("Finished") || input[i + 1].equals("inProgress")) {
                                Mission mission = new Mission(input[i], input[i + 1]);
                                commando.addMission(mission);
                            }
                        }
                        soldiers.put(commando.getId(), commando);
                    }
                break;
                default:break;
            }


            input = console.readLine().split("\\s+");
        }

        for (String s : soldiers.keySet()) {
            System.out.println(soldiers.get(s).toString());
        }
    }
}
