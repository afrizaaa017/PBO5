class Person {
    protected String nama;

    public Person(String nama){
        this.nama = nama;

    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    @Override
    public String toString() {
        return "Nama: " + nama;
    }


}