public class PenDistribution {
    public static void main(String[] args) {
        int tp = 14; // Total number of pens
        int s= 3; // Total number of students
        int pensPerStudent = tp / s; // Pens each student gets
        int remainingPens = tp % s; // Remaining pens after distribution
        System.out.println("Each student gets: " + pensPerStudent + " pens");
        System.out.println("Remaining pens: " + remainingPens);
    }
}
