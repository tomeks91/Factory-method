public class AdvancedMaze extends Maze {
    public AdvancedMaze(int count) {
        super(count);
    }

    @Override
    protected Room createRoom() {
        return new AdvancedRoom();
    }
}
