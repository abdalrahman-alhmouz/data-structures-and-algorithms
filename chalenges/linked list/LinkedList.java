package tesss;

public class linkeList {
    testo head =null ,tail=null ;
    int size =0 ;
public void append(int num){
    if (size==0){
testo temb=new testo();
temb.data=num;
head=temb;
tail=temb;
        size++;
    }else{
        testo temb=new testo();
        temb.data=num;
        tail.next=temb ;
        tail=temb;
        size++;

    }

}
    // _____________________________________________{{{{code Chaleng 07}}}}

    public String returnValue(int val){
    int i=0 ;
        testo tem=new testo();
        testo h=head;
        while (h!=null){
            if (val<0){
                return "Exeption";
            }else{
                while (i>=0){
                    if(h.next==null){
                    h=head;
                        if(val>i){
                            return "Exeption";
//                            break;
                        }else{
                            for (int j=i-1;j>=val;j--){
                                h=h.next;
                            }
                            return h.data+"";
                        }}else{

                        h=h.next;
                    }
                    ++i;
                }}
            return h.data +"";

        }
        return "Exeption";
    }
    // _____________________________________________{{{{code Chaleng}}}}

    public String insertAfter(int val,int newVal){
            testo tem=new testo();
            testo h=head;
            while (h!=null){
                if (h.data==val){
                    tem.data=newVal;
                    tem.next=h.next;
                    h.next=tem;
                    return printLnkedList();
                }
                h=h.next;
            }
        return "Exeption";
    }
    public String insertBefore(int val,int newVal){
        testo tem=new testo();
        testo h=head;
        while (h!=null){

            if (h.data==val) {
                h.data = newVal;
                if(h.data==newVal){
                    tem.data=val;
                    tem.next=h.next;
                    h.next=tem;
                    h=h.next;
                    return printLnkedList();

                }else {
                    return "Exeption";
                }
            }


            h=h.next;
        }
        return "Exeption";
    }

public String printLnkedList(){
    String print="",linee="head->",x="x";
    testo tem=new testo();
testo h=head;
while (h!=null){
    print +="["+h.data+"]->";
    h=h.next;
}
return linee+print+x;
}
}
