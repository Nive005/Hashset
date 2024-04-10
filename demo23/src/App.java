import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        Magazine magazine1=new Magazine(101,"A","tagore",100,150);
        Magazine magazine2=new Magazine(102,"B","kuvempu",300,200);
        Magazine magazine3=new Magazine(103,"C","keerthi",200,150);
        Magazine magazine4=new Magazine(104,"D","tagore",100,150);
        Magazine magazine5=new Magazine(101,"A","tagore",100,150);


        HashSet<Magazine> magazines=new HashSet<Magazine>();

        magazines.add(magazine1);
        magazines.add(magazine2);
        magazines.add(magazine3);
        magazines.add(magazine4);
        magazines.add(magazine5);

        Iterator<Magazine> mIterator=magazines.iterator();

        while(mIterator.hasNext()){
            Magazine thMagazine=mIterator.next();
            System.out.println(thMagazine);
        }




    }
}
