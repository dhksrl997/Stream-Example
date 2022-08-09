package Entity;
/*
Created on 2022/08/09 11:11 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int age;
    private String dept;

    public Member() {
    }

    public Member(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public List<Member> getMembers() {
        List<Member> list = new ArrayList<>();
        list.add(new Member("member1", 21, "developer"));
        list.add(new Member("member2", 22, "marketer"));
        list.add(new Member("member2", 24, "hr"));
        list.add(new Member("member3", 25, "hr"));
        list.add(new Member("member4", 26, "developer"));
        list.add(new Member("member5", 22, "marketer"));
        return list;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
}
