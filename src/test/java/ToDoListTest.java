import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @org.junit.jupiter.api.Test
    void withdraw() {
        ToDoList list = new ToDoList("Yazan", "Abbas", 220);
        list.withdraw(200);
        assertEquals(20, list.getBalance());
    }

    @org.junit.jupiter.api.Test
    void deposit() {
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
    }
}