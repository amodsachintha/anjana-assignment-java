public class Conversion {
    private final double GRAMS_IN_OUNCE = 28.3495;
    private final double KGS_IN_STONE = 6.35029;
    private final double GRAMS_IN_POUND = 453.592;

    public double GramToOuncnces(double weight){
        return weight/GRAMS_IN_OUNCE;
    }

    public double OunceToGrams(double weight){
        return weight*GRAMS_IN_OUNCE;
    }

    public double KgToStone(double weight){
        return weight/KGS_IN_STONE;
    }

    public double StoneToKg(double weight){
        return weight*KGS_IN_STONE;
    }

    public double PoundsToGram(double weight){
        return weight * GRAMS_IN_POUND;
    }

    public  double GramToPound(double weight){
        return weight / GRAMS_IN_POUND;
    }

}
