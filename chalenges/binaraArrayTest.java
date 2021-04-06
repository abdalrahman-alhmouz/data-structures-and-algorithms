 @Test
    public void one(){
        int array[]={4,8,15,16,23,42,5,9,10} ;


        Library classUnderTest = new Library();
        int testSearch=classUnderTest.BinarySearch( array ,50);
        int TestTow=classUnderTest.BinarySearch( array ,42);

        assertEquals(-1, testSearch);
        assertEquals(2, TestTow);





    }