
 package College;
import java.util.LinkedList;
import java.util.Scanner;
 
public class StudentRecordManagement {
 
    LinkedList<Record> list;
 
    public StudentRecordManagement()                             // Default Constructor
    {
        list = new LinkedList<>();
    }
    public void add(Record record)                    //Method 1
    {
 
        if (!find(record.getIdNumber())) {
            list.add(record);
        }
        else {
            System.out.println(
                "Record already exists in the Record list");
        }
    }
 
    public boolean find(int idNimber)                         // Method 2
    {
 
        for (Record l : list) {
 
            if (l.getIdNumber() == idNimber) {
 
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
 
    public void delete(int recIdNumber)                      // Method 3
    {
        Record recordDel = null;
 
        for (Record ll : list) {
 
            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
        }
 
        if (recordDel == null) {
 
            System.out.println("Invalid record Id");
        }
        else {
 
            list.remove(recordDel);
 
            System.out.println(
                "Successfully removed record from the list");
        }
    }
 
    public Record findRecord(int idNumber)                        // Method 4
    {
 
        for (Record l : list) {
 
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }
 
        return null;
    }
 
    
    public void update(int id, Scanner input)                  // Method 5
    {
 
        if (find(id)) {
            Record rec = findRecord(id);
 
            System.out.print(
                "What is the new Student id Number ? ");
            int idNumber = input.nextInt();
 
            System.out.print(
                "What is the new Student contact Number ");
            int contactNumber = input.nextInt();
            input.nextLine();
 
            System.out.print(
                "What is the new Student Name ? ");
            String name = input.nextLine();
 
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            System.out.println(
                "Record Not Found in the Student list");
        }
    }
 
    public void display()                          // Method 6
    {
 
        if (list.isEmpty()) {
 
            System.out.println("The list has no records\n");
        }
        
        for (Record record : list) {
 
            System.out.println(record.toString());
        }
    }
}






	 
	 
	                