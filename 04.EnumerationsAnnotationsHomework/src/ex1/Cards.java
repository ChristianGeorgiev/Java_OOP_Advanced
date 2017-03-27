package ex1;

public enum Cards {
    CLUBS, DIAMONDS, HEARTS, SPADES;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Card Suits:").append(System.lineSeparator());
        for (Enum card : Cards.values()) {
            sb.append(String.format("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name()));
        }
        return sb.toString();
    }
}
