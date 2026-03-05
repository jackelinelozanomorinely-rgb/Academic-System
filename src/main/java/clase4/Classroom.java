package clase4;

import java.util.List;
import java.util.Scanner;

public class Classroom {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String roomNumber;
    private int floor;
    private int capacity;
    private boolean status;

    // Constructors
    public Classroom() {
    }

    public Classroom(int id, String roomNumber, int floor, int capacity, boolean status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
        this.status = status;
    }

    // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //methods

    public Classroom createClassroom(Classroom classroom) {
        System.out.println("Enter Classroom ID:");
        int id = sc.nextInt();
        classroom.setId(id);
        sc.nextLine();

        System.out.println("Enter Room Number:");
        String roomNumber = sc.nextLine();
        classroom.setRoomNumber(roomNumber);

        System.out.println("Enter Floor:");
        int floor = sc.nextInt();
        classroom.setFloor(floor);

        System.out.println("Enter Capacity:");
        int capacity = sc.nextInt();
        classroom.setCapacity(capacity);

        classroom.setStatus(true);

        return classroom;
    }

    public void getClassroomById(int id) {
        if (id == this.id) {
            System.out.println("ID: " + this.id + "\n" +
                    "Room Number: " + this.roomNumber + "\n" +
                    "Floor: " + this.floor + "\n" +
                    "Capacity: " + this.capacity + "\n" +
                    "Status: " + this.status);
        } else {
            System.out.println("Id not found");
        }
    }


    public Classroom updateClassroom(Classroom classroom) {
        return classroom;
    }

    public void deleteClassroom(int id) {

    }
}


