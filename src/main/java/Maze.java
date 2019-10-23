import java.util.ArrayList;
import java.util.List;

public abstract class Maze {
    private List<Room> rooms = new ArrayList<>();

    public Maze(int count) {
        for (int i = 0; i < count; i++) {
            Room room = createRoom();
            rooms.add(room);
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    abstract protected Room createRoom();
}
