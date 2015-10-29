package businessLogic.pages.ui.steps;


import businessLogic.pages.ui.pageObject.SingUpPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;


public class StepsSingUpPage {
    SingUpPage singUpPage;

    @Step
    public void checkContextMessageUserName(String actualMessageUserName) {
        String expected = "Username is required";
        assertThat(singUpPage.getMessageUserNameRequired()).isEqualTo(expected);
    }

    @Step
    public void checkMessageEmailRequired(String actualMessageEmailRequired) {
        String expected = "Email is required";
        assertThat(singUpPage.getMessageEmailRequired()).isEqualTo(expected);
    }

    @Step
    public void checkMessageEmailInvalid(String actualMessageEmailInvalid) {
        String expected = "Invalid email address";
        assertThat(singUpPage.getMessageEmailInvalid()).isEqualTo(expected);
    }

    @Step
    public void checkMessagePasswordRequired(String actualMessagePasswordRequired) {
        String expected = "Password is required";
        assertThat(singUpPage.getMessagePasswordRequired()).isEqualTo(expected);
    }

    @Step
    public void checkMessageSuccessfullyRegistration(String actualMessageSuccessfullyRegistration){
        String expected = "User has been registered successfully, you will be redicted to login page in 2 seconds";
        assertThat(singUpPage.getMessageSuccessfullyRegistration()).isEqualTo(expected);
    }
}
