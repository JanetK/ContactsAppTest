package pantano.thomas.hw2.test;

import pantano.thomas.hw2.DisplayActivity;
import pantano.thomas.hw2.MainActivity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;

/**
 * This class tests isolated activities in MainActivity and the layout of the ListContacts view.  
 */
public class MainActivityUnitTest extends ActivityUnitTestCase<MainActivity> {

	public MainActivityUnitTest(Class<MainActivity> activityClass) {
		super(activityClass);
	}

	
	public void testContactsList_layout() {
		
	}
	
	
	public void testIntent_triggerViaOnListItemClick() {

		Intent intent = new Intent(getInstrumentation().getTargetContext(), DisplayActivity.class);
	}


	public void testIntent_onOptionsItemSelected() {

	}
	
}
