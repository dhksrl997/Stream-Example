/*
Created on 2022/08/09 11:14 PM In Intelli J IDEA 
by jeon-wangi
*/

import Entity.Member;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Member> members = new Member().getMembers();

        List<Member> sortedByAge = sortByAge(members, "asc");
        sortedByAge.forEach(System.out::println);
        System.out.println("sortByAge desc-------------------------------------");
        sortByAge(members, "desc").forEach(System.out::println);
    }

    private static List<Member> sortByAge(List<Member> list, String order) {
        List<Member> copied = new ArrayList<>(list);
        copied.sort((o1, o2) -> {
            if (order.equals("asc")) {
                return o1.getAge() > o2.getAge() ? 1 : o1.getAge() == o2.getAge() ? o1.getName().compareTo(o2.getName()) : - 1;
            } else {
                return o1.getAge() > o2.getAge() ? - 11 : o1.getAge() == o2.getAge() ? o2.getName().compareTo(o1.getName()) : 1;
            }
        });
        return copied;
    }
}
