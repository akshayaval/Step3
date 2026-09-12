class IdCard {
    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        IdCard card1 = new IdCard("Ravi", 2);

        IdCard card2 = card1;

        card2.booksIssued = 5;

        System.out.println("Books issued through card1: " + card1.booksIssued);
        System.out.println("card1 == card2: " + (card1 == card2));

        IdCard card3 = new IdCard("Ravi", 5);

        System.out.println("card1 == card3: " + (card1 == card3));
    }
}