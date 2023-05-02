package A_SecondAssignment;

public class Department {

    protected String name;
    protected int numberOfWorker;
    public static int number;

    // Do not change anything in this method
    public String getName() {
        return name;
    }

    // Fill in the blanks.
    public Department(String name, int numberOfEmployee) {
    this.name = name;
       numberOfWorker = numberOfEmployee;
       number++;
    }

    // Erase the content. Fill in the blanks. If name and numberOfWorker are equal, it returns true
    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
            if (obj instanceof SoftwareDevelopment){
                String objNamee = ((SoftwareDevelopment) obj).name;
                int objNumberOfWOrker = ((SoftwareDevelopment) obj).numberOfWorker;
                if (objNamee.equals(name) && (objNumberOfWOrker == numberOfWorker)){
                    isEqual = true;
                }

            }



        return isEqual;
    }

    // Erase the content. Fill in the blanks. Format: [name]/[numberOfWorker]
    // For example: Android/number of worker : 30
    @Override
    public String toString() {
        String valueee = name + "/number of worker : " + numberOfWorker;
        return valueee;
    }

}
