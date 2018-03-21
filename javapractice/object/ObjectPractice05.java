package object;

import java.util.ArrayList;

public class ObjectPractice05 {
    public static void main(String[] args) {
        ArrayList<person> person_array = new ArrayList<>();
        person_array.add(new person("森田","奈良"));
        person_array.add(new person("木村","埼玉"));
        person_array.add(new person("高山","東京"));
        person_array.add(new person("茂木","沖縄"));

        for(int i = 0 ;i < person_array.size(); i++){
            person_array.get(i).introduction();
        }
    }

}
