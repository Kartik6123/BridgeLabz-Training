public class Utility {

    public boolean validateTransportId(String transportId) {

        if (!transportId.matches("RTS[0-9]{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }
        return true;
    }

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String id = data[0];
        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String type = data[3];

        if (type.equalsIgnoreCase("BrickTransport")) {

            return new BrickTransport(
                    id, date, rating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        } else {

            return new TimberTransport(
                    id, date, rating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
    }

    public String findObjectType(GoodsTransport obj) {

        if (obj instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}
