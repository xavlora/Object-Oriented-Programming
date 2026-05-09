package hafiz20042026;

public class StudentRecordExample {
    public static void main(String[] args) {
        
        StudentRecord annaRecord = new StudentRecord("Anna Chevalier", "Boston", "19", 96.46, 96.35, 87.45);
        annaRecord.displayIdentities(annaRecord.getName(), annaRecord.getAddress(), annaRecord.getAge());
        System.out.println("");

        StudentRecord graceRecord = new StudentRecord("Grace Williams", "Champs-Elysees", "20");
        graceRecord.displayIdentities(annaRecord.getName(), annaRecord.getAddress(), annaRecord.getAge(), annaRecord.getMathGrade(), annaRecord.getEnglishGrade(), annaRecord.getScienceGrade());
        System.out.println("");
        
        StudentRecord hafizRecord = new StudentRecord("Muhamad Hafiz");
        hafizRecord.displayIdentities(annaRecord.getName());
        System.out.println("");
    }
}
