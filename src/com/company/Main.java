package com.company;

import java.util.ArrayList;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(3);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(1);

        System.out.println(checkEquals(arrayList1, arrayList2));
    }

    public static boolean checkEquals(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        boolean completead = false;
        if (arrayList1.size() == arrayList2.size()) {
            for (int i = 0; i < arrayList1.size(); i++) {
                if (arrayList1.get(i) == arrayList2.get(i)) {
                    return completead = true;
                } else {
                    return completead = false;
                }
            }
        }
        return completead;
    }

}
