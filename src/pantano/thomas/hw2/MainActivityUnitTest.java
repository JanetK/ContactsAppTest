package pantano.thomas.hw2;

import pantano.thomas.hw2.MainActivity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;

/**
 * This class tests isolated activities in MainActivity and the layout of the ListContacts view.  
 */
public class MainActivityUnitTest extends ActivityUnitTestCase<MainActivity> {

	private MainActivity mainActivity;
	
	public MainActivityUnitTest() {
		super(MainActivity.class);
	}

	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
        //launch MainActivity
		Intent launchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(launchIntent, null, null);
        mainActivity = getActivity();
	}


	public void testContactList_layout() {
		//verify that this view displays a list of contacts
	}
	
	
	public void testIntent_triggerViaOnListItemClick() {

		
		
		Intent triggeredIntent = getStartedActivityIntent();
		assertNotNull("Intent was null", triggeredIntent);

	}


	public void testIntent_triggerViaOnOptionsItemSelected() {

	}
	
	
	protected void tearDown() throws Exception {
		mainActivity.finish();
		super.tearDown();
	}
}
