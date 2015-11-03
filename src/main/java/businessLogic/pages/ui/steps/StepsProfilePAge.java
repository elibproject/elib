package businessLogic.pages.ui.steps;


import businessLogic.pages.ui.pageObject.ProfilePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class StepsProfilePAge {
    ProfilePage profilePage;

    @Step
    public void checkFieldUsername(String actualUsernameFiled) {
        String expected = "Username";
        assertThat(profilePage.getContextUsernameFiled()).isEqualTo(expected);
    }

    @Step
    public void checkFieldFirstName(String actualFirstNameField) {
        String expected = "First Name";
        assertThat(profilePage.getContextFirstNameField()).isEqualTo(expected);
    }

    @Step
    public void checkFieldLastName(String actualLastNameField) {
        String expected = "";
        assertThat(profilePage.getContextLastNameField()).isEqualTo(expected);
    }

    @Step
    public void checkFieldEmail(String actualEmailField) {
        String expected = "Email";
        assertThat(profilePage.getContextEmailField()).isEqualTo(expected);
    }

    @Step
    public void checkInfoUsernameFiled(String actualInfoUsernameFiled) {
        String expected = "zoolog";//add param!
        assertThat(profilePage.getContextInfoUsernameFiled()).isEqualTo(expected);
    }
}
