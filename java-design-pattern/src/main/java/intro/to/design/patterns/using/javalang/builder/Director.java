package intro.to.design.patterns.using.javalang.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("general greeting");
        builder.makeItems(new String[] {
                "How are you",
                "Hello.",
                "Hi.",
        });
        builder.makeString("timely greeting");
        builder.makeItems(new String[] {
                "Good morning.",
                "Good afternoon.",
                "Good evening.",
        });
        builder.close();
    }
}
