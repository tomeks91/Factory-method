public class SimpleMaze extends Maze {
    public SimpleMaze(int count) {
        super(count);
    }

    @Override
    protected Room createRoom() {
        return new SimpleRoom();
    }
}
