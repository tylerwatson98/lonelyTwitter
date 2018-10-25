package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 <LonelyTwitterActivity>{
    private Solo solo;
    public LonelyTwitterActivityTest(){
        super(LonelyTwitterActivity.class);
    }

    @Override
    public void setUp() {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown(){
        solo.finishOpenedActivities();
    }

    public void testTweet(){
        solo.assertCurrentActivity("Wrong Acitivty", "LonelyTwitterActivity");
    }

    public void testEquals() {
        assertEquals("not equal", "4", "5");
    }
}
