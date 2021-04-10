
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

      @Test public void searchHead() {
        SlinkedList s=new SlinkedList();
        int size =s.insert(0);
        assertEquals(1,size);
    }