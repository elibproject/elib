package businessLogic.pages.ui.steps;


import businessLogic.pages.ui.pageObject.SingUpAndInPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class StepsSingUpAndInPage {
    SingUpAndInPage singUpAndInPage;

    @Step
    public void checkMessageLoginEmptySingUp(String actualMessageUserName) {
        String expected = "Username is required";
        assertThat(singUpAndInPage.getMessageLoginRequiredSingUp()).isEqualTo(expected);
    }

    @Step
    public void checkMessageEmailRequired(String actualMessageEmailRequired) {
        String expected = "Email is required";
        assertThat(singUpAndInPage.getMessageEmailRequired()).isEqualTo(expected);
    }

    @Step
    public void checkMessageEmailInvalid(String actualMessageEmailInvalid) {
        String expected = "Invalid email address";
        assertThat(singUpAndInPage.getMessageEmailInvalid()).isEqualTo(expected);
    }

    @Step
    public void checkMessagePasswordEmpty(String actualMessagePasswordRequired) {
        String expected = "Password is required";
        assertThat(singUpAndInPage.getMessagePasswordEmptySingUp()).isEqualTo(expected);
    }

    @Step
    public void checkMessageLoginEmptySingIn(String actualMessageLoginSingIn) {
        String expected = "Username is required";
        assertThat(singUpAndInPage.getMessageLoginRequiredSingIn()).isEqualTo(expected);
    }

    @Step
    public void checkMessagePasswordEmptySingIn(String actualMessagePasswordRequiredSingIn) {
        String expected = "Password is required";
        assertThat(singUpAndInPage.getMessagePasswordRequiredSingIn()).isEqualTo(expected);
    }

    @Step
    public void checkMessagePasswordWrongSingIn(String actualMessagePasswordRequiredSingIn) {
        String expected = "Login is failed";//why message is show only login . Can change
        assertThat(singUpAndInPage.getMessageWrongDataSingIn()).isEqualTo(expected);
    }
}