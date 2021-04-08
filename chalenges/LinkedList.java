package proj;

public class sNode {
    int data ;
    sNode next ;
}
// _____________________________________________________________//
package proj;

public class SlinkedList {
    sNode head=null ;
    sNode tail =null ;
    int size =0 ;
    public  void insert(int number){

        if(size==0){
            sNode temp=new sNode();
           temp.data =number;
            head =temp;
            tail =temp;
            size ++ ;
        }else{
            sNode temp=new sNode();
            temp.data =number;
            tail.next=temp;
            tail =temp;
            size ++ ;


        }

    }
    public boolean includes(int number){
        sNode h=head ;
        while (h!=null){
            if (h.data==number){

                return true ;
            }
            h= h.next ;

        }

        return false ;
    }
    public String toString(){
        sNode h=head;
        String print="";
        String printNull="Null";

        while (h!=null){

            print +="{"+h.data+"}->";
            h= h.next ;

        }
        System.out.print(print+printNull);


        return print+printNull;
    }

        public void print(){
        sNode h=head;
        while (h !=null){
            System.out.print(" "+h.data+" ");
            h= h.next ;

        }
    }
}
________________________________________________________________________________________\\

    @Test public void search() {
        SlinkedList s=new SlinkedList();
        s.insert(5);
        s.insert(10);
        s.insert(15);
        boolean output =s.includes(15);
assertEquals(true,output);
    }
    @Test public void testString() {
        SlinkedList s=new SlinkedList();
        s.insert(5);
        s.insert(10);
        s.insert(15);
        String output=s.toString();
        assertEquals("{5}->{10}->{15}->Null", output);

    }
    @Test public void search() {
        SlinkedList s=new SlinkedList();
        s.insert(5);
        s.insert(10);
        s.insert(15);
        boolean output =s.includes(15);
assertEquals(true,output);
    }
    @Test public void testString() {
        SlinkedList s=new SlinkedList();
        s.insert(5);
        s.insert(10);
        s.insert(15);
        String output=s.toString();
        assertEquals("{5}->{10}->{15}->Null", output);

    }