public enum Direction {
    EAST(1, "East. "), SOUTH(2, "South. "), WEST(3, "West. "), NORTH(4, "North. "),;
//attribute
private int value;
private String desc;

//private constructor
private Direction(int value, String desc) {
    this.value = value;
    this.desc = desc;
}

// presentation
// Direction.NORTH.opposite() ->south
public Direction opposite(){
    for ( Direction d : Direction.values()){
    }   if (this.value % 2 == d.getValue()) {
        return d;
        
    } //direction, only exist in enum
}

public int getValue() {
    return this.value;
    
}

public String getDesc() {
    return this.desc;
    
}
public static void main(String[] args) {
    Direction d1 = Direction.SOUTH;
    System.out.println(d1.getValue());

    System.out.println(Direction.SOUTH.getValue());

    System.out.println(Direction.NORTH.getDesc());
    System.out.println(Direction.WEST.getValue());

    System.out.println(d.getDesc());

    System.out.println(Direction.NORTH.opposite());
}
}
