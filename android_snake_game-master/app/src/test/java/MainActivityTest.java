import com.codepath.examples.basicsnakegame.R;
import org.junit.jupiter.api.Test;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.jupiter.api.Assertions.*;

class MainActivityTest
{
    @Test
    public void startGame_Test() {
        // Type text and then press the button.
        onView(withId(R.id.startButton)).perform(click());

        // Check that the text was changed.
        //onView(withId(R.id.)).check(matches(withText(STRING_TO_BE_TYPED)));
    }

}