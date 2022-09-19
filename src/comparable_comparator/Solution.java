package comparable_comparator;
import java.util.*;
public class Solution {

    /*
    1. Create class Cat with fields name and age
    2. Implement method toString()
    3. Implement Comparable interface for the Cat class, which compare cats by names
    4. Create Collections with several cats, and check with the method sort() that it sorts by name
    5. Create ...Comparator... class which implements interface Comparator and can sort cats by name descending
    6. Create ...Comparator... class which implements interface Comparator and can sort cats by age ascending
    7. Create ...Comparator... class which implements interface Comparator and can sort cats by age descending
    8. Demonstrate how they work on main method
    P.S. All the Classes should be in the different files
     */

}
class Cat implements Comparable<Cat>
{
    String name;
    int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return name + " : " + age;
    }

    /*
     **  Implement the natural order for this class
     */
    public int compareTo(Cat p)
    {
        return getName().compareTo(p.getName());
    }

    public static class AgeComparator implements Comparator<Cat>
    {
        public int compare(Cat p1, Cat p2)
        {
            return p1.getAge() - p2.getAge();
        }
    }

    public static void main(String[] args)
    {
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Markiz",13));
        cats.add(new Cat("Tom",14));
        cats.add(new Cat("Zopa",5));
        cats.add(new Cat("Zapa",5));
        System.out.println("No Sort");
        System.out.println("\t" + cats);

        Collections.sort(cats);
        System.out.println("Sort Name");
        System.out.println("\t" + cats);

        Collections.sort(cats, Collections.reverseOrder());
        System.out.println("Sort Name Descending");
        System.out.println("\t" + cats);

        Collections.sort(cats, new AgeComparator());
        System.out.println("Sort Age");
        System.out.println("\t" + cats);

        Collections.sort(cats, Collections.reverseOrder(new AgeComparator()));
        System.out.println("Sort Age Descending");
        System.out.println("\t" + cats);
    }
}