import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility util = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        String transportId = input.split(":")[0];

        if (!util.validateTransportId(transportId)) {
            System.out.println("Please provide a valid record");
            return;
        }

        GoodsTransport gt = util.parseDetails(input);

        System.out.println("Transporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());

        if (gt instanceof BrickTransport) {
            BrickTransport bt = (BrickTransport) gt;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        } else {
            TimberTransport tt = (TimberTransport) gt;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + gt.vehicleSelection());
        System.out.println("Total charge : " + gt.calculateTotalCharge());
    }
}
