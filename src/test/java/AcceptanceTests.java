import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTests extends SerenityStories {
    public AcceptanceTests() {
        runSerenity().inASingleSession();
    }
}