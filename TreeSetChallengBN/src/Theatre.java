import java.util.*;

public class Theatre {

    private String theatreName;
    private int seatsInRow;
    private NavigableSet<Seat> seatChart = new TreeSet<>();

    public Theatre(String theatreName, int seatsInRow, int rows) {
        this.theatreName = theatreName;
        this.seatsInRow = seatsInRow;
        int totalSeats = seatsInRow * rows;
        seatChart.addAll(populateTheatre(rows, seatsInRow));
    }

    private class Seat implements Comparable<Seat> {
        private String seat;
        private boolean reserved;

        public Seat(char rowChar, int seatNo) {
            this.seat = "%c%03d".formatted(rowChar, seatNo).toUpperCase();

        }
        @Override
        public int compareTo(Seat o) {
            return seat.compareTo(o.seat);
        }
    }

    private NavigableSet<Seat> populateTheatre(int totalRows, int seatsPerRow) {
        NavigableSet<Seat> set = new TreeSet<>();
        int count = seatsPerRow - 1;
        for (char i = 65; i < 65 + totalRows; i++) {
            if (totalRows > 26) {
                System.out.println("""
                        Total number of rows must be greater than 0.
                        Total number of rows may not exceed 26
                        """);
            }
            Seat nextSeat = new Seat(i, (seatsPerRow - count));
            set.add(nextSeat);
            count ++;
        }
            return set;
    }

    public void printSeatMap() {
        for (Seat s : seatChart) {
            System.out.println("Seat: " + s.seat +
                    " Reserved?: " + s.reserved);
//            "(\u25CF)" --> unicode for a dot char
        }
    }
}
