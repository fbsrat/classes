import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class RoomTest {
        @Test
        public void testCheckIn() {
            Room room = new Room(12,145.0);

            room.checkIn();

            assertTrue(room.isOccupied());
            assertTrue(room.isDirty());
        }

public void testCheckOut() {
    Room room = new Room(13,140.5);

    room.checkIn();
    room.checkOut();

    assertFalse(room.isOccupied());
    assertTrue(room.isDirty());
}

@Test
public void testCleanRoom() {
    Room room = new Room(15,160.67);

    room.checkIn();
    room.checkOut();
    room.cleanRoom();

    assertFalse(room.isDirty());
}
}