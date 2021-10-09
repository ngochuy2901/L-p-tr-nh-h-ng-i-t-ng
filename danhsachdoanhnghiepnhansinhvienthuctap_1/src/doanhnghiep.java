public class doanhnghiep {
    private String name,id;
    private int totolStudent;

    public doanhnghiep(String name,String id,int totolStudent) {
        this.name = name;
        this.id = id;
        this.totolStudent = totolStudent;
    }
    @Override 
    public String toString() {
        return this.id + " " + this.name + " " + this.totolStudent;
    }
    
    @Override
    public int compareTo (doanhnghiep x ) {
        if(x.totolStudent < this.totolStudent)
            return -1;
        if(x.totolStudent > this.totolStudent)
            return 1;
        return 0;
    }
}