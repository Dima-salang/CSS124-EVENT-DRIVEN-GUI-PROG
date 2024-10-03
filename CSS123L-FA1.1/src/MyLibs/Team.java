/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;
import MyLibs.Member;

/**
 *
 * @author Luis
 */
public class Team {
    public String name;
    public Member[] members = new Member[5];
    public int memberCnt;
    public int maxMember;
    public int minAge;
    public int maxAge;
    
    // custom constructor for the Team
    public Team(String name, int maxMember, int minAge, int maxAge)
    {
        this.name = name;
        this.maxMember = maxMember; 
        this.minAge = minAge;
        this.maxAge = maxAge;

    } 


    // adds the participant in the array of team members
    public void addMember(Member member)
    {
        // we use the memberCnt as the index since we want to increment it per additional member
        members[memberCnt] = member;
        memberCnt++;
    }


    // returns true if the participant's age falls within the required age bracket; otherwise, it returns false
    public boolean checkQualification(Member member)
    {
        // if the member is within the qualified range, we return true, else we return false
        if (member.age >= minAge && member.age <= maxAge)
        {
            return true;
        } 
        else
        {
            return false;
        }
    }
}
