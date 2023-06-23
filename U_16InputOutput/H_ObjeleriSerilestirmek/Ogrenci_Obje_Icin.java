package U_16InputOutput.H_ObjeleriSerilestirmek;

import java.io.Serializable;

public class Ogrenci_Obje_Icin implements Serializable {
    private String name;
    private int ID;
    private String Department;

    public Ogrenci_Obje_Icin(String name, int ID, String department) {
        this.name = name;
        this.ID = ID;
        Department = department;
    }

    @Override
    public String toString() {
        String message;
        message = "Name: " + name +
                "\nId: " + ID +
                "\nDepartment: " + Department;
        return message;
    }
}
